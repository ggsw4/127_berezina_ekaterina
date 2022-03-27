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
}