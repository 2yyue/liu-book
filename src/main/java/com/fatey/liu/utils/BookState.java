package com.fatey.liu.utils;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/13 下午8:11
 */
public enum BookState {
	// 可借
	AVAILABLE(1),
	// 已预订
	RESERVED(2),
	// 已借
	BORROWED(3),
	// 已还
	RETURNED(4),
	// 已逾期
	OVERDUE(5);
	
	private final int state;
	
	BookState(int state) {
		this.state = state;
	}
	
	public int getState() {
		return state;
	}
	
}
