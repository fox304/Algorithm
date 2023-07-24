
public class List {
    Node head;
    Node tail;
    
    public class Node {
        int value;
        Node nextNode;
        Node previousNode;
    }

    
    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (tail != null) {
            node.previousNode = tail; // ссылка на предыдущую ноду
            tail.nextNode = node; // ссылка предыдущей ноды на эту 

        } else
            head = node;
            
        tail = node; // перезаписываем 

    }
    /**
     * делаем разворот путём передачи head в строку
     * @return
     */
    
    public String printReverse() {
        Node no = head;
        String str = "";
        while (no != null) {
            str = " " + no.value + str;
            no = no.nextNode;
        }
        return str;
    }
    
    
    @Override
    public String toString() {
        Node no = tail; 
        String str = "";
        while (no != null) {
            str = " " + no.value + str;
            no = no.previousNode;
        }
        return str;
    }
    
}
