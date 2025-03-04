import org.junit.Test;
import static org.junit.Assert.*;
public class TestArrayDequeGold {
    @Test
    public void testStudentArrayDeque(){
        StudentArrayDeque<Integer> L = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> expected = new ArrayDequeSolution<>();
        double randomNumber;
        Integer actual;
        Integer expect;
        String message=" ";
        for(int i = 0 ; i < 100 ; i++){
            randomNumber = StdRandom.uniform();
            if(randomNumber<0.5){
                L.addFirst(i);
                expected.addFirst(i);
                message += "addFirst("+i+")\n";
            }else{
                L.addLast(i);
                expected.addLast(i);
                message += "addLast("+i+")\n";
            }
        }
        for(int i = 0 ; i < 100 ; i++) {
            randomNumber = StdRandom.uniform();
            if (randomNumber < 0.5) {
                actual=L.removeFirst();
                expect=expected.removeFirst();
                message += "removeFirst(" + i + ")\n";
            }else{
                actual=L.removeLast();
                expect=expected.removeLast();
                message += "removeLast("+i+")\n";
            }
            assertEquals(message,actual,expect);
        }
    }

}
