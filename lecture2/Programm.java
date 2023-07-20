package lecture2;

public class Programm {
    public static void main(String[] args) {

        int[] arr = new int[] { 9, 4, 2, 1, 0, 6, 5, 7, 3, 8, 11};
    
        // Buble.sort(arr);
        // Choise.sort(arr);
        // Inserts.sort(arr);
        // int q = Search.search_i(7, arr, 0, 6);

        for (int i : arr) {
            System.out.print(i + " "); 
        }
        System.out.println();


        // собираем кучу
        HeapSort.loop(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            // меняем первый и последний элемент и укарачиваем длинну массива на последний
            HeapSort.shift(arr, 0, i);
            // снова собираем кучу после перестановки
            HeapSort.heapSorted(arr,0,i); 
        }       
        
        for (int i : arr) {
                System.out.print(i + " ");    
        }
        System.out.println();

            
    }
}
