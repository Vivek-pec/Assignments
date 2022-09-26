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



/*

Assignment 2 Circular LinkedList
Name: Vivek jaiswal
SID: 21105011

With reference to above example of circular linked list.
Line 48 i.e. while(current != head) establishes that the traversing element/variable has reached the first element.
We Know that in circular linked list last node of linked list points to head of that linked list, hence we can check 
if any node points to head of linked list then that node is the end of circular linked list.
*/


/*[Question.2]  What are the practical applications of a circular linked list? (Try to find applications in your respective fields).
Practical applications of circular linked list are :
1)Multiplayer Games: All the Players are kept in a Circular Linked List and the pointer keeps on moving forward as a player's chance ends.
2)Computing Resources: Circular Linked Lists is used to manage the computing resources of the computer.
3)Fionacci Heap: Circular Linked List is also used in the implementation of advanced data structures such as a Fibonacci Heap.
4)Computer Networking:Circular linked list is also used in computer networking for token scheduling.
5)Implementation of Data Structure: Data structures such as stacks and queues are implemented with the help of the circular linked lists.
6)Audio/Video Streaming: Circular linked list is also used in audio and video streaming,for ex. when one copmlete audio list finishes playing 
in music player then it again starts playing from start.
*/