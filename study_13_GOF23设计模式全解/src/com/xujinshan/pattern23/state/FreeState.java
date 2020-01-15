package com.xujinshan.pattern23.state;

/**
 * 空闲状态
 * @author xujinshan361@163.com
 *
 */
public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房间空闲！！！没人住！");
	}

}
