import org.junit.*;

public class Task3_Tests extends Assert {

    @Test
    public void heapSort_CreateNewHeapSort_TryToCompareArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void heapSort_CreateNewHeapSort_CompareTwoItemsArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void heapSort_CreateNewHeapSort_SortArray(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1, 2, 7, 6, 9, 15, 13};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 6, 7, 9, 13, 15}, array);
    }
}
