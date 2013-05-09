package Trees;

public abstract class BinaryTree{

	//Default package protection
	BinaryTreeNode root;
	int size;

	/**
	 * Constructors for BinaryTree
	 */
	public BinaryTree(Object r){
		root = new BinaryTreeNode(r);
		size = 1;
	}

	/**
	 * Returns the root node of this ree
	 */
	public BinaryTreeNode getRoot(){
		return root;
	}

	/**
	 * Returns the size of this tree
	 */
	public int getSize(){
		return size;
	}

	/**
	 * Inserts and returns a node with the given item as the left child node of the
	 * given node. If a left child node already exists, do nothing.
	 * @param node   the parent node of the new node to be inserted
	 * @param obj    the item of the new node to be inserted
	 * @return 		 the inserted node
	 */
	public BinaryTreeNode insertLeft(BinaryTreeNode node, Object obj){
		if (node.leftChild == null){
			node.leftChild = new BinaryTreeNode(obj);
			node.leftChild.parent = node;
			size++;
		}
		return node.leftChild;
	}

	/**
	 * Inserts and returns a node with the given item as the right child node of the
	 * given node. If a right child node already exists, return null.
	 * @param node   the parent node of the new node to be inserted
	 * @param obj    the item of the new node to be inserted
	 * @return 		 the inserted node
	 */
	public BinaryTreeNode insertRight(BinaryTreeNode node, Object obj){
		if (node.rightChild == null){
			node.rightChild = new BinaryTreeNode(obj);
			node.rightChild.parent = node;
			size++;
			return node.rightChild;
		}
		return null;
	}

	/**
	 * Removes and returns the left child node of the given node. If no left child node
	 * exists, return null.
	 * @param node   the parent node of the node to be removed
	 * @return 		 the removed node
	 */
	public BinaryTreeNode removeLeft(BinaryTreeNode node){
		if (node.hasLeftChild()){
			BinaryTreeNode temp = node.leftChild;
			node.leftChild = null;
			size--;
			return temp;
		}
		return null;
	}

	/**
	 * Removes and returns the right child node of the given node. If no right child node
	 * exists, return null.
	 * @param node   the parent node of the node to be removed
	 * @return 		 the removed node
	 */
	public BinaryTreeNode removeRight(BinaryTreeNode node){
		if (node.hasRightChild()){
			BinaryTreeNode temp = node.rightChild;
			node.rightChild = null;
			size--;
			return temp;
		}
		return null;
	}

	/**
	 * Returns the string representation of this tree
	 */
	public String toString(){
		return toString(root, 0);
	}

	/**
	 * Method adapted from toStringTree(TreeNode tree, int indent) in
	 * http://www2.hawaii.edu/~ztomasze/ta/ics211-1-fa06/a4/BinaryTree.java
	 * @author Zach Tomaszewski
 	 * @version Oct 19, 2006
	 */
	private String toString(BinaryTreeNode node, int indent){
	    String indentation = "";
	    for (int i = 0; i < indent; i++) {
	      indentation += " ";
	    }
	    if (node == null){
	    	return "\n";
		} else if(node.isLeaf()){
	    	return "[" + node.item + "]\n";
	    } else{
	      String result = "(" + node.item + ")\n";
	      result += indentation + "Left: " +
	                  toString(node.leftChild, indent + 2);
	      result += indentation + "Right: " +
	                  toString(node.rightChild, indent + 2);
	      return result;
	    }
	  }

	/**
	 * Abstract methods to be implemented by classes extending this BinaryTree
	 * since it is unsorted/not a BST there is no comparing method available for
	 * find and insert to use
	 */
	public abstract BinaryTreeNode find(Object obj);
	public abstract BinaryTreeNode insert(Object obj);
	public abstract BinaryTreeNode remove(Object obj);
}