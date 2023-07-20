package lecture2;

public class HeapSort {
    public static void heapSorted(int[] arr, int parentIndex, int lenthArray) {

        // индексы бинарного дерева: родителя и наследников
        int rootIndex = parentIndex;    
        int leftIndex = rootIndex * 2 + 1;
        int rightIndex = rootIndex * 2 + 2;
        

        
        // поиск максимального значения среди наследников(слева)
        if (rightIndex < lenthArray && arr[leftIndex] > arr[rightIndex] && arr[leftIndex] > arr[rootIndex]) {  
            shift(arr, leftIndex, rootIndex);
            rootIndex = leftIndex;
        }
        
        // поиск максимального значения среди наследников(справа)
        else if (rightIndex < lenthArray && arr[rightIndex] > arr[leftIndex] && arr[rightIndex] > arr[rootIndex]) {
            shift(arr, rightIndex, rootIndex);
            rootIndex = rightIndex;
        }
        // при смене родителя проходимся по потомкам для построения нисходящей иерархии
        if (rootIndex != parentIndex) {
            heapSorted(arr, rootIndex, lenthArray);
        }
            
    }
    // замена значения корня на максимальное из детей
    public static void shift(int[] arr, int max, int root) {
        int temp = arr[root];
        arr[root] = arr[max];
        arr[max] = temp;

    }
    // цикл для сборки кучи
    public static void loop(int[] arr) {
        for (int index = arr.length / 2 - 1; index >= 0; index--) {
            HeapSort.heapSorted(arr, index, arr.length);
            
        }
    }
}
