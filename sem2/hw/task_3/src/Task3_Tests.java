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
    @Test
    public void heapSort_CreateNewHeapSort_SortArray2(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1, 3, 2, 5, 10, 4, 6};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 10}, array);
    }


    @Test
    public void mergeSort_CreateNewMergeSort_CompareArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
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
    public void mergeSort_CreateNewMergeSort_CompareTwoElementsArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
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
    public void mergeSort_CreateNewMergeSort_CompareThreeElementsArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_CreateNewMergeSort_SortTwoElements(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1};
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
    public void mergeSort_CreateNewMergeSort_SortThreeElements(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_CreateNewMergeSort_SortThreeElements2(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_CreateNewMergeSort_SortArray(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {6, 8, 2, 5, 1, 10, 12, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 6, 8, 10, 12}, array);
    }


    @Test
    public void quickSort_CreateNewQuickSort_CompareArrays(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1,2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1,2}, array);
    }
    @Test
    public void quickSort_CreateNewQuickSort_CompareArrays2(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1,2,3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1,2,3}, array);
    }
    @Test
    public void quickSort_CreateNewQuickSort_SortTwoElements(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1};
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
    public void quickSort_CreateNewQuickSort_SortThreeElements(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void quickSort_CreateNewQuickSort_SortFourElements(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }
}
