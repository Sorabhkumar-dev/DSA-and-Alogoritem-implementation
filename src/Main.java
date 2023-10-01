import linkedlist.LinkedList;
import linkedlist.User;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> list = new LinkedList<>();
        User user1 = new User("sorabh1.com","Sorabh1");
        User user2 = new User("sorabb2.com","Sorabh2");
        User user3 = new User("sorabh3.com","Sorabh3");
        User user4 = new User("sorabh4.com","Sorabh4");
        User user5 = new User("sorabh5.com","Sorabh5");
        User user6 = new User("sorabh6.com","Sorabh6");
        User user7 = new User("sorabh7.com","Sorabh7");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.printList();
        list.addAt(2,user7);
        list.printList();
        list.deleteAt(2);
        list.printList();
    }
}