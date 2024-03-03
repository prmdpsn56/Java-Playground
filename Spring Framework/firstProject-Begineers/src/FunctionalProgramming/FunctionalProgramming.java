package FunctionalProgramming;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FunctionalProgramming {

    public void printElements(List<String> elements){
        System.out.println(elements);
    }


    public void printWithStream(List<String> elements){
        AtomicInteger i = new AtomicInteger();
        elements.forEach((element)-> System.out.println(element + " Element " ));
    }


    public void printWithFiltering(List<Integer> elements) {
        elements.stream().filter(element-> element%2==0).forEach(System.out::println);
    }


    public int returnSum(List<Integer> elements){
            Integer sum = elements.stream().reduce(10, (acc, curr) -> (acc + curr));
            return sum;
    }
}
