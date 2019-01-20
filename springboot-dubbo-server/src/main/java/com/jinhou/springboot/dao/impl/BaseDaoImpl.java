package com.jinhou.springboot.dao.impl;

import com.jinhou.springboot.common.Filter;
import com.jinhou.springboot.common.Order;
import com.jinhou.springboot.common.Page;
import com.jinhou.springboot.common.Pageable;
import com.jinhou.springboot.dao.BaseDao;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Dao - 基类
 */
public abstract class BaseDaoImpl<T, ID extends Serializable> extends SqlSessionDaoSupport implements BaseDao<T, ID> {

	/** 实体类类型 */
	private Class<T> entityClass;

	private final String path = "com.jinhou.springboot.mapper.";

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = getClass().getGenericSuperclass();
		Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
		entityClass = (Class<T>) parameterizedType[0];
	}
	
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }  
	
	private String getMethodPath(String methodType){
        return path + entityClass.getSimpleName() + "Mapper." + methodType;
    }

	public T find(ID id) {
		return getSqlSession().selectOne(getMethodPath("selectByPrimaryKey"),id);
	}

	public List<T> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders) {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("filters", filters);
		parameter.put("orders", orders);
		first = first==null?RowBounds.NO_ROW_OFFSET:first;
		count = count==null?RowBounds.NO_ROW_LIMIT:count;
		List<T> resultList = getSqlSession().selectList(getMethodPath("findList"), parameter, new RowBounds(first, count));
		return resultList;
	}
	public Page<T> findPage(Pageable pageable) {
		
		// 添加全局的按照ID 降序
		pageable.addOrder(new com.jinhou.springboot.common.Order("id",
				com.jinhou.springboot.common.Order.Direction.desc));
		List<T> resultList = getSqlSession().selectList(getMethodPath("findPage"), pageable, new RowBounds((pageable.getPageNumber() - 1) * pageable.getPageSize(), pageable.getPageSize()));
		return new Page<T>(resultList, (Long)getSqlSession().selectOne(getMethodPath("count"), pageable.getFilters()), pageable);
	}

	public long count(Filter... filters) {
		Long obj = getSqlSession().selectOne(getMethodPath("count"), Arrays.asList(filters));  
        return obj.intValue();
	}

	public void save(T entity) {
		Assert.notNull(entity);
		getSqlSession().insert(getMethodPath("insertSelective"), entity);
	}

	public void update(T entity) {
		Assert.notNull(entity);
		getSqlSession().update(getMethodPath("updateByPrimaryKeySelective"), entity);
	}

	public void updateAll(T entity) {
		Assert.notNull(entity);
		getSqlSession().update(getMethodPath("updateByPrimaryKey"), entity);
	}
	
	public void remove(T entity) {
		if (entity != null) {
			getSqlSession().delete(getMethodPath("deleteByPrimaryKey"), entity);
		}
	}

}