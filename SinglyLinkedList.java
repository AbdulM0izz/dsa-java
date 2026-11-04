
class SinglyLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    SinglyLinkedList  () {
        this.head = null;
        this.tail =  null;
        this.size = 0;
    }

    public void insertAtHead(int data ) {
        Node newNode = new Node(data);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;  // previous head 
            head = newNode;

        }
        size++;
    }

    public void insertAtTail(int data ) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // insert at head
    public void insertAtPosition  (int position, int data) {
        if(position < 1 || position > size+1) {
            System.out.println("Invalid case ");
            return;
        }
        if(position == 1) {
            insertAtHead(data);
            return;
        }
        if(position == size+1) {
            insertAtTail(data);
            return;
        }

        // insert at position
        Node previousNode = head;

        for (int i = 1; i < position - 2; i++){
            previousNode = previousNode.next;
        }

        //Now create node and insert it;
        Node newNode = new Node(data);


        newNode.next = previousNode.next;
        previousNode.next = newNode;

        size++;

    }

    // get size
    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getHead(){
        if (head == null) {
            return -1;
        }else{
            return head.data;
        }
    }

    private int getTail(){
        if( tail == null){
            return -1;
        }else{
            return tail.data;
        }
    }

    public void clearList (){
        head = null;
        tail = null;
        size = 0;
    }



    // display
    public void display(){
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(5);
        list.insertAtTail(6);

        list.insertAtPosition(3,3);

        list.display();
    }
}