import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericQueueTest {

    Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    Integer[] integerElements2 = {12, 32, 13, 64, 35, 76, 87, 89, 91, 120};

    GenericQueue<Double> doubleGenericQueuetest = new GenericQueue<>();
    GenericQueue<Integer> integerGenericQueuetest = new GenericQueue<>();

    @Test


    public void lengthTest(){
        assertEquals(integerElements2.length, 10);
        //int[] ie2 = new GenericQueue().length(i);
       // assertEquals(doubleGenericQueuetest.length(), 10);
       // integerGenericQueuetest.integerElements2.dequeue();
        //assertEquals(integerElements2.length, 9);
       // integerGenericQueuetest.dequeue();
       // assertEquals(integerGenericQueuetest.length(), 9);
    }
}