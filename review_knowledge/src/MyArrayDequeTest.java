import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;
public class MyArrayDequeTest {
    @Test
    public void testAddFirst(){
        ArrayDeque L = new ArrayDeque();
        L.addFirst(2);
        int expected = 2;
        int actual = (int)(L.get(0));
        assertEquals(expected,actual);
        L.addFirst(10);
        expected = 10;
        actual = (int)(L.get(0));
        assertEquals(expected,actual);
        L.addFirst(3);
        L.addFirst(32);
        L.addFirst(33);
    }
    @Test
    public void testAddLast(){
        ArrayDeque L = new ArrayDeque();
        L.addLast(10);
        assertEquals(10,L.get(L.size()-1 ));
        L.addLast(30);
        assertEquals(30,L.get(L.size()-1 ));
        L.addLast(20);
        assertEquals(20,L.get(L.size()-1 ));
        L.addLast(2);
        assertEquals(4,L.size());
    }
    @Test
    public void testPrintDeque(){
        ArrayDeque L = new ArrayDeque();
        L.addFirst(10);
        L.addLast(4);
        L.addFirst(20);
        L.addLast(5);
        L.printDeque();
    }

}
