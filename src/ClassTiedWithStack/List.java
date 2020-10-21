package ClassTiedWithStack;
class Node <E> {
    E data;
    Node next;
}

public class List <E> {
    private Node head;
    private Node tail;

    public void addFront (E data) {
        Node a = new Node();
        a.data = data;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

   public void addBack(E data) {
        Node a = new Node();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }


    public boolean delEl(E data){
        if(head == null)
            return false;

        if(head.data == data) {
            head = head.next;
            return true;
        }

        Node a = head;
        do{
            if(a.next.data == data){
                a.next = a.next.next;
                return true;
            }
            a = a.next;
        }while (a != null);
        return false;
    }

    public E get(int index)
    {
        Node a = head;
        int i = -1;
        while(++i!=index) {
            a = a.next;
            if(a==tail) {
                throw new IndexOutOfBoundsException();
            }
        }
        return (E) a.data;
    }

    public void printEl() {
        Node a = head;
        while (a != null) {
            System.out.print(a.data + " ");
            a = a.next;
        }
    }
}
