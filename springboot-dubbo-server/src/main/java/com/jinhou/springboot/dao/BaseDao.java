package com.jinhou.springboot.dao;

import com.jinhou.springboot.common.Filter;
import com.jinhou.springboot.common.Order;
import com.jinhou.springboot.common.Page;
import com.jinhou.springboot.common.Pageable;

import java.io.Serializable;
import java.util.List;


/**
 * Dao - 基类
 */
public interface BaseDao<T, ID extends Serializable> {

	/**
	 * 查找实体对象
	 * 
	 * @param id
	 *            ID
	 * @return 实体对象，若不存在则返回null
	 */
	T find(ID id);

	/**
	 * 查找实体对象集合
	 * 
	 * @param first
	 *            起始记录
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @return 实体对象集合
	 */
	List<T> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);

	/**
	 * 查找实体对象分页
	 * 
	 * @param pageable
	 *            分页信息
	 * @return 实体对象分页
	 */
	Page<T> findPage(Pageable pageable);

	/**
	 * 查询实体对象数量
	 * 
	 * @param filters
	 *            筛选
	 * @return 实体对象数量
	 */
	long count(Filter... filters);

	/**
	 * 持久化实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void save(T entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 *            实体对象
	 * @return 实体对象
	 */
	void update(T entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 *            实体对象
	 * @return 实体对象
	 */
	void updateAll(T entity);

	/**
	 * 移除实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void remove(T entity);

}