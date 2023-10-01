package linkedlist;

public class LinkedList<T> {
    Node<T> head = null;
    int size = 0;

    public void add(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void addAt(int index, T t) {
        if (index >(getSize() - 1))
            return;
        Node<T> node = new Node<>(t);
        Node<T> temp = head;
        int curr = 0;
        while (curr != index - 1) {
            temp = temp.next;
            curr++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAt(int index){
        if (index > (getSize()-1))return;
        Node<T> temp = head;
        int curr = 0;
        while (curr != (index-1)){
            temp = temp.next;
            curr++;
        }
        temp.next = temp.next.next;
    }

    public int getSize() {
        return size;
    }


    public void printList() {
        Node<T> temp = head;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while (temp != null) {
            str.append(temp.data).append(", ");
            temp = temp.next;
        }
        if (head != null)
            str.delete(str.length() - 2, str.length());
        str.append("]");
        System.out.println(str);
    }
}
