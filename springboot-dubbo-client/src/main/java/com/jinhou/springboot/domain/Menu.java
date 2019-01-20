package com.jinhou.springboot.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity - 菜单
 */
public class Menu extends OrderEntity {

	private static final long serialVersionUID = -5132652107151648662L;

	/** 树路径分隔符 */
	public static final String TREE_PATH_SEPARATOR = ",";

	/** 编码 */
	private String code;

	/** 名称 */
	private String name;

	/** URL */
	private String url;

	/** 树路径 */
	private String treePath;

	/** 层级 */
	private Integer grade;
	
	/** 上级分类 */
	private Menu parent;
	
	/** 上级id */
	private Long parentId;

	/** 下级分类 */
	private List<Menu> children = new ArrayList<Menu>();

	/** 角色 */
	private Set<Role> roles = new HashSet<Role>();

	/**
	 * 获取编码
	 * 
	 * @return 编码
	 */
	@NotEmpty
	@Length(max = 50)
	public String getCode() {
		return code;
	}

	/**
	 * 设置编码
	 * 
	 * @param code
	 *            编码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取名称
	 * 
	 * @return 名称
	 */
	@NotEmpty
	@Length(max = 200)
	public String getName() {
		return name;
	}

	/**
	 * 设置名称
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取URL
	 * 
	 * @return URL
	 */
	@NotEmpty
	public String getUrl() {
		return url;
	}

	/**
	 * 设置URL
	 * 
	 * @param url
	 *            URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取树路径
	 * 
	 * @return 树路径
	 */
	public String getTreePath() {
		return treePath;
	}

	/**
	 * 设置树路径
	 * 
	 * @param treePath
	 *            树路径
	 */
	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	/**
	 * 获取层级
	 * 
	 * @return 层级
	 */
	public Integer getGrade() {
		return grade;
	}

	/**
	 * 设置层级
	 * 
	 * @param grade
	 *            层级
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	/**
	 * 获取上级分类
	 * 
	 * @return 上级分类
	 */
	public Menu getParent() {
		return parent;
	}

	/**
	 * 设置上级分类
	 * 
	 * @param parent
	 *            上级分类
	 */
	public void setParent(Menu parent) {
		this.parent = parent;
	}

	/**
	 * 获取下级分类
	 * 
	 * @return 下级分类
	 */
	public List<Menu> getChildren() {
		return children;
	}

	/**
	 * 设置下级分类
	 * 
	 * @param children
	 *            下级分类
	 */
	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	/**
	 * 获取文章
	 * 
	 * @return 文章
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * 设置文章
	 * 
	 * @param roles
	 *            文章
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * 获取树路径
	 * 
	 * @return 树路径
	 */
	public List<Long> getTreePaths() {
		List<Long> treePaths = new ArrayList<Long>();
		String[] ids = StringUtils.split(getTreePath(), TREE_PATH_SEPARATOR);
		if (ids != null) {
			for (String id : ids) {
				treePaths.add(Long.valueOf(id));
			}
		}
		return treePaths;
	}

}