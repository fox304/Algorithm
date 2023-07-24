
// Необходимо реализовать метод разворота  двухсвязного списка.

public class Main {
    
    public static void main(String[] args) {
        
        List link1 = new List();

        link1.addLast(12);
        link1.addLast(23);
        link1.addLast(13);
        link1.addLast(2);
        link1.addLast(42);
        link1.addLast(11);
        link1.addLast(33);

        System.out.println(link1);  // переопределил toString в List

        System.out.println(link1.printReverse()); // отдельный метод в List
        
        


        
       
    }
}
