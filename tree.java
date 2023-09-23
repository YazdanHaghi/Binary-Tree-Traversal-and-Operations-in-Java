package ds2;

import java.util.Scanner;
public class tree {
	Scanner scanner = new Scanner(System.in) ;
	node root ;
	tree (node x) {
		root = x ;}
	void inorder (node node) {
		if(node == null)
			return ;
		inorder(node.left) ;
		System.out.println(node.value + "  ");
		inorder(node.right) ;
	}
	void preorder (node node) {
		if(node == null)
			return ;
		System.out.println(node.value + "  ");
		preorder(node.left) ;
		preorder(node.right);
	}
	void pastorder(node node) {
		if(node == null )
			return ;
		pastorder(node.left);
		pastorder(node.right);
		System.out.println(node.value + "  ");
	}
	/*void preplusin () {
		System.out.println("enter how many nodes tree have ??");
		int tmp = scanner.nextInt() ;
		int [] arr  ;
		int [] arrs ;
		for(int i = 0 ; i < tmp ; i++)
			arr[i] = scanner.nextInt() ;
	
	for(int i = 0 ; i < tmp ; i++)
		arrs[i] = scanner.nextInt() ;
}*/
	
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("please enter root");
	int z = scanner.nextInt() ;
	node n = new node(z) ;
	tree t = new tree (n) ;
	
	//int y = scanner.nextInt() ;
	t.root.addchild(n) ;
	int condition = 1  ;
	
	while(condition == 1) {
		System.out.println("how do you want to travel in bionary tree \n enter 1 if you want preorder \n enter 2 if you want inorder \n press 3 if you want pastorder \n enter 0 if you want to end travel");
		int y = scanner.nextInt() ;
		switch(y) {
		case 1 :
			t.preorder(n);
			break ;
		case 2 :
			t.inorder(n); 
			break ;
		case 3 :
			t.pastorder(n);
			break ;
		case 0 :
			condition = 0 ;
			break ;
		}
	}
	
}
}