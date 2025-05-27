public class DoublyLinkedList
{  
    //Represent a node of the doubly linked list  
    //nested class  
    class Node
	{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data)
	 {  
            this.data = data;  
         }  
    	}  
     Node head, tail = null;  
     public void addNode(int data)
      {    
        Node newNode = new Node(data);  
        if(head == null)//adding 1st element i.e when nothing is present in the list
	 {  
          head = tail = newNode;  
          head.previous = null;  
          tail.next = null;  
         }  
        else//adding at end of list becoz it maintains insertion order
	 {  
          tail.next = newNode;  
          newNode.previous = tail;  
          tail = newNode;  
          tail.next = null;  
         }  
      }  
     public void delNode(int ele)
      {
	Node current = head;  
	Node prevcurrent = head; 
        if(head == null)//empty list
	 {  
          System.out.println("nothing to delete");  
          return;  
         }  
        else
	 {
	  while(current!=null)
	   {
  	    if((ele==current.data)&&(current==head))//deleting 1st element
 	      {
   		head=head.next;
   		head.previous=null; 
	      }
	    else if((ele==current.data)&&(current==tail))//deleting last element
	      {
     		tail=tail.previous;
    		tail.next=null;
     	      }
	    else//deleting in between node
	      {
		if(current.data==ele)
		 {
		   prevcurrent.next=current.next;
   		   current.next.previous=current.previous;
  		 }
		else
		 {
		  prevcurrent=current; 
 		 }
	      }
             current=current.next;
	   }
	 }
      }
     public void display()
      {  
       Node current = head;  
       if(head == null)//empty list
        {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("\nNodes of doubly linked list: ");  
        while(current != null)
         {  
            System.out.print(current.data + " ");  
            current = current.next;  
         }  
      }  
     public static void main(String[] args)
      {  
        DoublyLinkedList dll = new DoublyLinkedList();  
        dll.addNode(1);  
        dll.addNode(2);  
        dll.addNode(3);  
        dll.addNode(4);  
        dll.addNode(5);  
        dll.display();  
	dll.delNode(1);
	dll.display(); 
	dll.delNode(5); 
	dll.display(); 
	dll.delNode(3); 
	dll.display();
       }  
}
