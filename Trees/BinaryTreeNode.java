package Trees;

public class BinaryTreeNode{
	
	//Default package protection
	Object item;
	BinaryTreeNode parent;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;

	/**
	 * Constructors for BinaryTreeNode
	 */
	public BinaryTreeNode(Object obj){
		item = obj;
	}

	/**
	 * Returns the item stored in this node
	 */
	public Object getItem(){
		return item;
	}

	/**
	 * Returns the parent node of this node
	 */
	public BinaryTreeNode getParent(){
		return parent;
	}

	/**
	 * Returns the left child node of this node
	 */
	public BinaryTreeNode getLeftChild(){
		return leftChild;
	}

	/**
	 * Returns the right child node of this node
	 */
	public BinaryTreeNode getRightChild(){
		return rightChild;
	}

	/**
	 * Returns true if this node has a left child node,
	 * false otherwise
	 */
	public boolean hasLeftChild(){
		return leftChild != null;
	}

	/**
	 * Returns true if this node has a right child node,
	 * false otherwise
	 */
	public boolean hasRightChild(){
		return rightChild != null;
	}

	/**
	 * Returns true if this node is a leaf node,
	 * false otherwise
	 */
	public boolean isLeaf(){
		return (leftChild == null && rightChild == null);
	}

}