package com.xujinshan.datastructure.btree;

/**
 * 二叉树的接口
 * 可以有不同的实现类，每个类有不同的存储结构，例如顺序，链式
 * @author xujinshan361@163.com
 *
 */
public interface BinaryTree {
	/**
	 *是否空树
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 树结点数量
	 * @return
	 */
	public int size();
	
	/**
	 * 获取二叉树的高度
	 * @return
	 */
	public int getHeight();
	
	/**
	 * 查询指定值的结点
	 * @param value
	 * @return
	 */
	public Node findKey(Object value);
	
	/**
	 * 前序递归遍历
	 */
	public void preOrderTraverse();
	
	/**
	 * 中序递归遍历
	 */
	public void inOrderTraverse();
	
	/**
	 * 后序递归遍历
	 */
	public void postOrderTraverse();	
	
	/**
	 * 中序遍历非递归操作
	 * 1)对于任意的结点current，若该结点不为空则将该节点压栈，并将左子树结点置为current，重复此操作，直到current为空
	 * 2)若左子树为空，栈顶结点出栈，访问结点后将该节点的右子树置为current
	 * 3)重复1、2步骤操作，直到current为空且栈内结点为空
	 */
	public void inOrderByStack();
	
	/**
	 * 前序遍历非递归
	 * 1)对任意的结点current，若该结点不为空则访问该结点后并将该结点延展，并将左子树结点置为current，重复此操作，直到
	 * 2)若左子树为空，栈顶结点出栈，将该结点的右子树置为current
	 * 3)重复1、2步骤操作，直到current为空且栈内结点为空
	 */
	public void preOrderByStack();
	
	/**
	 * 后序遍历非递归
	 *
	 */
	public void postOrderByStack();
	
	/**
	 * 按照层次遍历
	 */
	public void levelOrderByStack();
}














