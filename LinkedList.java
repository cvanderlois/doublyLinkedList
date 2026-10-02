package csci.assignment2;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    ///
    /// If LinkedList is empty, create new node and set it as head, otherwise set tail node as head,
    /// move through the list until the last node is found then create new node, then increase the
    /// size of the LinkedList.
    ///
    public void pushBack(T d) {
        if (head == null) {
            head = new Node<T>(d);
        } else {
            Node<T> tail = head;
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node<T>(d));
        }
        size++;
    }
    ///
    /// If linked list is empty, create a new node and set it as head otherwise create new node
    /// link it to the next node, then set the new node as head and finally increase the size of the LinkedList.
    ///
    public void pushFront(T d) {
        if (head == null) {
            head = new Node<T>(d);
        } else {
            Node<T> n = new Node<T>(d);
            n.setNextNode(head);
            head = n;
            size++;
        }
    }
    T popBack() {
        if (size == 0) {
            return null;
        } else {
            T d = tail.getData();
            tail = tail.getPrevNode();
            tail.setPrevNode(tail);
            size--;
            return d;
        }
    }
    T popFront() {
        if (size == 0) {
            return null;
        } else {
            T d = head.getData();
            head = head.getNextNode();
            size--;
            return d;
        }
    }
    T at(int a) {
        if (a < 0 || a >= size) {
            System.out.println("Index is out of bounds.");
            return null;
        }
        Node<T> curr = head;
        for (int i = 0; i < a; i++) {
            curr = curr.getNextNode();
        }
        return curr.getData();
    }
    T front() {
        if (size == 0) {
            return null;
        } else {
            return head.getData();
        }
    }
    T back() {
        if (size == 0) {
            return null;
        } else {
            return tail.getData();
        }
    }
    void display() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNextNode();
        }
    }
}
