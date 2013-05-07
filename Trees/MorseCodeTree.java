package Trees;

public final class MorseCodeTree extends BinaryTree{
	
	/**
	 * A MorseCodeTree is a SimpleBinaryTree with preset node values
	 * following the tree from http://www.learnmorsecode.com/
	 */
	BinaryTreeNode a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	BinaryTreeNode zero,one,two,three,four,five,six,seven,eight,nine,
				   dot,leftLine,rightLine = null;

	public MorseCodeTree(Boolean numeric){
		super(" ");
		t = insertLeft(root, "T");
		m = insertLeft(t, "M");
		o = insertLeft(m, "O");

		g = insertRight(m, "G");
		q = insertLeft(g, "Q");
		z = insertRight(g, "Z");

		n = insertRight(t, "N");
		k = insertLeft(n, "K");
		y = insertLeft(k, "Y");
		c = insertRight(k, "C");
		d = insertRight(n, "D");
		x = insertLeft(d, "X");
		b = insertRight(d, "B");
		
		e = insertRight(root, "E");
		a = insertLeft(e, "A");
		w = insertLeft(a, "W");
		j = insertLeft(w, "J");
		p = insertRight(w, "P");
		r = insertRight(a, "R");
		l = insertRight(r, "L");

		i = insertRight(e, "I");
		u = insertLeft(i, "U");
		f = insertLeft(u, "F");
		s = insertRight(i, "S");
		v = insertLeft(s, "V");
		h = insertRight(s, "H");

		if (numeric){
			leftLine = insertLeft(o, "-");
			zero = insertLeft(leftLine, 0);
			nine = insertRight(leftLine, 9);
			dot = insertRight(o, ".");
			eight = insertRight(dot, 8);

			seven = insertRight(z, 7);
			six = insertRight(b, 6);
			one = insertLeft(j, 1);

			rightLine = insertLeft(u, "-");
			two = insertLeft(rightLine, 2);

			three = insertLeft(v, 3);
			four = insertLeft(h, 4);
			five = insertRight(h, 5);
		}
	}

	/**
	 * Inherited abstract methods implemented trivially since MorseCodeTree
	 * should not be altered
	 */
	public BinaryTreeNode find(Object obj){return null;}
	public BinaryTreeNode insert(Object obj){return null;}
	public BinaryTreeNode remove(Object obj){return null;}

}