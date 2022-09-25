import java.util.Scanner;

//  Creating Doubly Linked List Class 
class Node {
    int age;
    String name;
    Node next;
    Node prev;

    Node(String name, int age) {
        this.name = name;
        this.age = age;
    }

//  Input function
    public static Node takeInput() {
        Node head = null;
        System.out.println("Family LinkedList");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the family member  (ENTER -1 TO STOP)");
        String name = sc.next();
        System.out.println("Enter the age of the family member  (ENTER -1 TO STOP)");
        int age = sc.nextInt();

        while (age != -1) {
            Node node = new Node(name, age);
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                node.prev = temp;
                temp.next = node;
            }
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter age");
            age = sc.nextInt();
        }
        sc.close();
        return head;
    }

//  Printing from start functon
    public static void printFront(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name + " is " + temp.age + " years old ");
            temp = temp.next;
        }
    }

// Printing from end function

    public static void printEnd(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println(temp.name + " is " + temp.age + " years old ");
            temp = temp.prev;
        }
    }


//  Insert Node at Head

    public static void insertAtHead(Node head, String name, int age) {
        Node node = new Node(name, age);

        node.next = head;
        head.prev = node;
        head = node;

    }

//  Delete from end
    public static void poll(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }


    public static void deleteAt(Node head,int i){
        if(i==0){
            Node temp=head;
            head=temp.next;
            head.prev=null;
        }
        else{
            Node temp=head;
            for(int j=0;j<i;j++) {
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
}

public class doublyLinkedList {
    public static void main(String[] args) {
        Node head = Node.takeInput();
        Node.printFront(head);
    }
}

//Vivek Jaiswal
//ECE
//SID:21105011

/*BONUS QUESTION
Q.Try to find a way to link the family members' doubly-linked list based on their relationship.
Ans.One way to link the family members doubly-linked list is by sorting the doubly linked list according to age in 
decending order.By doing so we will get a doubly linked list in which older generation people will be close to head 
in double linked list and new generation people will be close to tail in doubly linked list.
*/