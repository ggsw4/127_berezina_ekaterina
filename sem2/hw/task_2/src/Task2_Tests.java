import org.junit.*;

public class Task2_Tests extends Assert {

    @Test
    public void bubbleSort_CreateBubbleSort_TryToSort (){
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 0;
            }
        };

        Integer[] myArray = {1,2,3};
        sorter.sort(myArray, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    class SomeComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_CreateBubbleSort_SortArrayWithDifferentNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {3, 1, 2, 6, 8};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 6, 8}, myArray);
    }
    @Test
    public void bubbleSort_CreateBubbleSort_CompareSameArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }


    @Test
    public void insertionSort_CreateInsertionSort_CompareSameArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void insertionSort_CreateInsertionSort_SortDifferentNumbers(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 4, 2, 7};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 4, 7}, myArray);
    }


    @Test
    public void selectionSort_CreateSelectionSort_CompareSameArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3, 4, 5};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, myArray);
    }
}
