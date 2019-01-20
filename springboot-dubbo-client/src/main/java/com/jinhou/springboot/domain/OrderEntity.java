package com.jinhou.springboot.domain;

import javax.validation.constraints.Min;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * Entity - 排序基类
 */
public abstract class OrderEntity extends BaseEntity implements Comparable<OrderEntity> {

	private static final long serialVersionUID = 5995013015967525827L;

	/** "排序"属性名称 */
	public static final String ORDER_PROPERTY_NAME = "orders";

	/** 排序 */
	private Integer orders;

	/**
	 * 获取排序
	 * 
	 * @return 排序
	 */
	@Min(0)
	public Integer getOrder() {
		return orders;
	}

	/**
	 * 设置排序
	 * 
	 * @param order
	 *            排序
	 */
	public void setOrder(Integer order) {
		this.orders = order;
	}

	/**
	 * 实现compareTo方法
	 * 
	 * @param orderEntity
	 *            排序对象
	 * @return 比较结果
	 */
	public int compareTo(OrderEntity orderEntity) {
		return new CompareToBuilder().append(getOrder(), orderEntity.getOrder()).append(getId(), orderEntity.getId()).toComparison();
	}

}