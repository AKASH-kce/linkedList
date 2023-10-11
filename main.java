package linkedList;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Insert elements at the beginning of the list
        list = SinglyLinkedList.insertAtBeg(list, 10);
        list = SinglyLinkedList.insertAtBeg(list, 20);
        list = SinglyLinkedList.insertAtBeg(list, 30);

        // Insert elements at the end of the list
        list = SinglyLinkedList.insertAtEnd(list, 40);
        list = SinglyLinkedList.insertAtEnd(list, 50);
        
        // Insert an element at a specific position
       list = SinglyLinkedList.insertAtPos(list, 25, 2);
        
        // Delete elements
       list = SinglyLinkedList.deletAtBeg(list);
        list = SinglyLinkedList.deletAtEnd(list);
        list = SinglyLinkedList.deletAtPos(list, 1);
        
        // Reverse the list
        //list = SinglyLinkedList.reverseList(list);
        
        // Print the elements in the list
        list.printLinkedList(list);
    }

    
}
