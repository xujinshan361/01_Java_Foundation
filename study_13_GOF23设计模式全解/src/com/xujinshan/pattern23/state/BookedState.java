package com.xujinshan.pattern23.state;

/**
 * 已预订状态
 * @author xujinshan361@163.com
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}
