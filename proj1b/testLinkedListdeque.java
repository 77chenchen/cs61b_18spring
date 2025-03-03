import org.junit.Test;

import static org.junit.Assert.*;
public class testLinkedListdeque {
    @Test
    public void testPrintDeque(){
        LinkedListDeque<Integer> L = new LinkedListDeque<Integer>();
        L.addFirst(10);
        L.addLast(4);
        L.addLast(2);
        L.printDeque();

    }
    @Test
    public void testAddLast(){
        LinkedListDeque<Integer> L = new LinkedListDeque<Integer>();
        L.addFirst(10);
        L.addLast(4);
        L.addLast(2);
        assertEquals((Integer) 10,L.get(0));
    }
}
