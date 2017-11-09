import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericQueue<T> {

    private ArrayList<T> elements;

    public GenericQueue(){
        elements = new ArrayList<T>();
    }

    public T dequeue() {
        if (elements.isEmpty())
            throw new EmptyStackException();

        return elements.remove(0);
    }

    public void enqueue(T enqueueValue) {

        elements.add(enqueueValue);
    }

    // current length of the queue
    public int length() {

        return elements.size();
    }



    public static void main(String[] args) {
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

        //System.out.println(integerElements.length);
        //System.out.println(doubleElements.length);
        GenericQueue<Double> doubleGenericQueue = new GenericQueue<>();
        GenericQueue<Integer> integerGenericQueue = new GenericQueue<>();

        testQueue("Double Queue", doubleGenericQueue, doubleElements);
        testDequeue("Double Queue", doubleGenericQueue);

        testQueue("Integer Queue", integerGenericQueue, integerElements);
        testDequeue("Integer Queue", integerGenericQueue);

    }

    public static <T> void testQueue(String name, GenericQueue<T> gq, T[] elements){

        System.out.printf("%nQueing elements onto %s%n", name);
        for(T element: elements){
            System.out.printf("%s ", element);
            gq.enqueue(element);
    }
    }
    public static <T> void testDequeue(String name, GenericQueue<T> gq){
        try{
            System.out.printf("%nDequeing elements from %s%n", name);
            T dequeueValue;

            while(true){
                dequeueValue = gq.dequeue();
                System.out.printf("%s ", dequeueValue);
            }
        } catch(EmptyStackException emptyStackException){
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }
        }