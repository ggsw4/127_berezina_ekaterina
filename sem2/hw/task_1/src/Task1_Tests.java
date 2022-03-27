import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void pushFront_pushToEmptyList_SizeEqualsOne () {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertEquals(1, list.getSize());
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
    public void pushFront_pushTwoElements_HeadAndTailIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.pushFront(20);
        list.pushFront(10);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(20, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
    }
    @Test
    public void pushBack_pushToEmptyList_sizeEqualsOne () {
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
    public void pushBack_pushTwoElements_HeadAndTailIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        list.pushBack(5);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(5, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
    }
    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }
}