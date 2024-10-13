package com.fatey.liu.utils;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/13 下午8:25
 */
public enum UserState {
	// 正常
	NORMAL(1),
	// 冻结
	FROZEN(2),
	// 删除
	DELETE(3);
	
	private final int state;
	
	UserState(int state) {
		this.state = state;
	}
	
	public int getState() {
		return state;
	}
}
