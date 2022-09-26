public class LinkedList {  
    //Represents the node of list.  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
      
    public Node head = null;  
    public Node tail = null;  
  
    //This function will add the new node at the end of the list.  
    public void append(int data){  
          
        Node newNode = new Node(data);  
          
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
              
            tail.next = newNode;  
              
            tail = newNode;  
              
            tail.next = head;  
        }  
    }  
  
    //This function will print the data of all nodes.
    public void print() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("Empty List");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
        LinkedList node = new LinkedList();  
          
        node.append(10);  
        node.append(21);  
        node.append(32);  
        node.append(43);  
         
        node.print();  
    }  
}