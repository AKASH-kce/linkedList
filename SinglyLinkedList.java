package linkedList;

public class SinglyLinkedList {

	   private	Node head;
	   public static SinglyLinkedList insertion(SinglyLinkedList list,int data)
	   {
		   Node new_node=new Node(data);
		   Node temp=list.head;
		   if(temp==null)
		   {
			 temp=new_node;
			   
		   }
		   else
		   {
			   while(temp.next!=null)
			   {
				   temp=temp.next;
			   }
			   temp.next=new_node;
		   }
		   return list;
	   }
	   
	   public static SinglyLinkedList insertAtBeg(SinglyLinkedList list,int data)
	   {
		  Node temp=list.head;
		   
		   Node new_node=new Node(data);
		   new_node.next=temp;
		   list.head=new_node;
		   return list;
		   
	   }
	   
	   public static SinglyLinkedList insertAtPos(SinglyLinkedList list,int data,int pos)
	   {
		  Node new_node=new Node(data); 
		  Node temp=list.head;
		  for(int i=0;i<pos;i++)
		  {
			  temp=temp.next;
			  
		  }
		  Node next_node=temp.next;
		  temp.next=new_node;
		  new_node.next=next_node;
		  return list;
	   }
	   
	   
	   public static SinglyLinkedList insertAtEnd(SinglyLinkedList list, int data) {
		    Node new_node = new Node(data);
		    if (list.head == null) {
		        list.head = new_node; // Set the head to the new node if the list is empty
		    } else {
		        Node temp = list.head;
		        while (temp.next != null) {
		            temp = temp.next;
		        }
		        temp.next = new_node;
		    }
		    return list;
		}
	  
	   public static SinglyLinkedList deletAtBeg(SinglyLinkedList list)
	   {
		   Node temp=list.head.next;
		   list.head=temp;
		   
		   return list;
		   
	   }
	   
	   public static SinglyLinkedList deletAtPos(SinglyLinkedList list,int pos)
	   {
		   Node temp=list.head;
			  for(int i=0;i<pos;i++)
			  {
				  temp=temp.next;
				  
			  } 
			  temp.next=temp.next.next;
			  return list;
	   }
	   
	   public static SinglyLinkedList deletAtEnd(SinglyLinkedList list)
	   {
		  
		   Node temp=list.head;
		   while(temp.next.next!=null)
		   {
			   temp=temp.next;
		   }
		   temp.next=null;
		   return list;
	   }
	   

	   public static SinglyLinkedList reverseList(SinglyLinkedList list)
	   {
		   Node temp=list.head;
		   Node current=temp;
		   Node next_node;
		   
		   Node prev=null;
		   while(current!=null)
		   {
			next_node=current.next;
		    current.next=prev;
			prev=current;
			current=next_node;
			
	      }
		   list.head=prev;
		   return list;
		   }
	   
	   public static void printLinkedList(SinglyLinkedList list) {
	        Node current = list.head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}
