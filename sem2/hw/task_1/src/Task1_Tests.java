import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void pushFront_pushToEmptyList_SizeEqualsOne() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertEquals(1, list.getSize());
    }

    @Test
    public void pushFront_pushToEmptyList_getSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        assertEquals(3, list.getSize());
    }

    @Test
    public void pushFront_pushToEmptyList_HeadAndTailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(10, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
        assertEquals(head, tail);
    }

    @Test
    public void pushFront_pushTwoElements_HeadAndTailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.pushFront(20);
        list.pushFront(10);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(20, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
    }

    @Test
    public void pushFront_PushFrontThreeItems_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        Node<Integer> head = (Node<Integer>) list.getHead();
        assertEquals(1, head.getData().intValue());
    }

    @Test
    public void pushBack_pushToEmptyList_sizeEqualsOne() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        assertEquals(1, list.getSize());
    }

    @Test
    public void pushBack_pushToEmptyList_HeadAndTailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(10, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
        assertEquals(head, tail);
    }

    @Test
    public void pushBack_pushTwoElements_HeadAndTailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        list.pushBack(5);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(5, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
    }

    @Test
    public void pushBack_PushBackThreeElements_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        Node<Integer> head = (Node<Integer>) list.getHead();
        assertEquals(3, head.getData().intValue());
    }

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getHead_PushFrontEmptyDoubleLinkedList_TryToGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getHead_PushBackEmptyDoubleLinkedList_TryToGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getTail_PushFrontEmptyDoubleLinkedList_TryToGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>) list.getTail()).getData();
        assertEquals(2, tail);
    }

    @Test
    public void getTail_PushBackEmptyDoubleLinkedList_TryToGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        int tail = ((Node<Integer>) list.getTail()).getData();
        assertEquals(1, tail);
    }

    @Test
    public void pushFront_PushFrontEmptyDoubleLinkedList_TryToGetAnother() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertFalse(false);
        }
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckSize() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

    @Test
    public void pushFront_PushFrontValuesDoubleLinkedList_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        int num1 = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>) list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>) list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>) list.get(3)).getData();
        assertEquals(4, num1);
    }

    @Test
    public void remove_RemoveElement_CheckValue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.remove(list.get(0));
        int num = ((Node<Integer>) list.get(0)).getData();
        assertEquals(20, num);
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(5);
        list.pushFront(6);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list.insertListAfter(list.get(1), list1);

        int num1 = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>) list.get(1)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>) list.get(2)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>) list.get(3)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>) list.get(4)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>) list.get(5)).getData();
        assertEquals(6, num1);
    }

    @Test
    public void insertListBefore_TryToInsertListBefore_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        int num1 = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>) list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>) list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>) list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>) list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>) list.get(5)).getData();
        assertEquals(6, num1);
    }

    @Test
    public void insertListBefore_TryToInsertListBefore_CheckSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        assertEquals(6, list.getSize());
    }



    @Test
    public void createArray_SetSizeNewArray_CheckSize() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        assertEquals(10, array.getSize());
    }

    @Test
    public void createArray_CreateEmptyArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }

    @Test
    public void resize_CreateArrayAndResize_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.resize(15);
        assertEquals(15, array.getSize());
    }

    @Test
    public void get_GetIndexOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.get(15);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void get_GetIndexOutOfBounds2_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.get(10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void set_SetIndexOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.set(11,15);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void set_SetIndexOutOfBounds2_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.set(10,15);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void insert_InsertValueOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.insert(11,15);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void insert_InsertValueOutOfBounds2_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.insert(10,15);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void insert_InsertNumber_CheckNewValue() {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }

    @Test
    public void pushBack_PushBackNumbers_CheckValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.pushBack(6);
        array.pushBack(7);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
        assertEquals(6, array.get(5).intValue());
        assertEquals(7, array.get(6).intValue());
    }

    @Test
    public void set_SetNumbers_CheckValues() {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
}