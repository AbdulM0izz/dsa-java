import javax.print.attribute.standard.SheetCollate;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        //constructor
        Node(int date ) {
            this.data = date;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // constructor
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //insert_At_Head
    public void  insertAtHead(int data) {
        Node newNode = new Node(data);
        // If LL is empty so head and till will be new node;
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        // increase the size of the ll
        size++;
    }

    //insert_AT_Tail
    public void insertAtTail(int data) {

        Node newNode = new Node(data);
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //insert_At_Position
    public void insertAtPosition (int position, int data) {
        //checked invalid cases
        if(position < 1 || position > size+1) {
            System.out.println("Insertion is not possible ");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == size+1 ){
            insertAtTail(data);
            return;
        }

        // insert at any position
        Node previousNode = head;

        for(int i=1; i<=position-2; i++){
            previousNode = previousNode.next;
        }

        Node newNode = new Node(data);
        newNode.next =  previousNode.next;
        previousNode.next = newNode;

        size++;
    }

    // triversal
        public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        }


        // empty
    public  boolean isEmpty(){
        return head == null;
    }




    public static void main(String[] args) {
        SinglyLinkedList mylist = new SinglyLinkedList();

        if(mylist.isEmpty()) {
            System.out.println("List is empty ");
        }

    }
}
