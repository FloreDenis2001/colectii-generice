package aplicatiiDequeueTest;

import com.company.colectii_java.Dequeue.AplicatiiDequeue;
import org.junit.jupiter.api.Test;

public class AplicatiiDequeueTest {
    @Test
    public void dequeueTest(){
        AplicatiiDequeue aplicatiiDequeue=new AplicatiiDequeue();
        aplicatiiDequeue.afisare();
        aplicatiiDequeue.poolFirst();
        System.out.println("----");
        aplicatiiDequeue.afisare();
        aplicatiiDequeue.poolLast();
        System.out.println("----");
        aplicatiiDequeue.afisare();
        System.out.println("---");
        aplicatiiDequeue.peekLast();
        System.out.println("---");
        aplicatiiDequeue.peekFirst();
        System.out.println("---");
    }
}
