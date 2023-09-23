package ds2;

import java.util.Scanner;

public class node {
	int value ;
	node left ;
	node right ;
		node(int value){
			this.value = value ;
			left = null ;
			right = null ;
		}
		public node addchild (node current) {
			System.out.println(current.value + "\nhow many child this node have ??\n enter 1 if have one child \n enter 2 if have 2 child \n enter 0 if have no child");
			int x ;
			Scanner scanner = new Scanner(System.in) ;
			x = scanner.nextInt() ;
			switch(x) {
			case 0 :
				break ;
			case 1 :
				System.out.println("enter child value");
				int value = scanner.nextInt() ;
				current.left = new node (value) ;
				addchild(current.left) ;
				break ;
			case 2 :
				System.out.println("enter childs value");
				int value1 = scanner.nextInt() ;
				int value2 = scanner.nextInt() ;
				if(value2 > value1) {
					current.left = new node (value1) ;
					current.right = new node (value2) ;
					addchild(current.left);
					addchild(current.right) ;
				}
				else 
					System.out.println("left child is bigger than right child and we cant creat this childs like that");
				break ;
			}
			return current;
			
			
			
		}
		/*public node addchild (node current, int value) {
		    if (current == null ) 
		        return new node(value);
		    else if (current.right == null) 
		    	return current.right = new node (value) ;
		   else if (current.left == null) 
		    	return current.left = new node (value) ;
		     
		    if (value < current.right.value ) 
		        current.left = addchild(current.left, value);
		    else if (value > current.left.value ) 
		        current.right = addchild(current.right, value);
		     else {
		       
		        return current;
		    }
		 
		    return current;
		} */
}
		
	
		

	
	
