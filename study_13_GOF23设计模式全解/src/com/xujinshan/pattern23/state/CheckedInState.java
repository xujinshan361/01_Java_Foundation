package com.xujinshan.pattern23.state;

/**
 * 已入住状态
 * @author xujinshan361@163.com
 *
 */
public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}
