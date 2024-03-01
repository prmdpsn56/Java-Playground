package generics;

import java.util.ArrayList;

public class LearningGenerics<T> {
ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }


    public void deleteElement(T element){
        list.remove(element);
    }

    public T getElement(int element){
        return list.get(element);
    }

}
