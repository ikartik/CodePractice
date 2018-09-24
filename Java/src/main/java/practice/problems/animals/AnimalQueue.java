package practice.problems.animals;

import java.util.LinkedList;

/**
 * Created by kartik on 08/09/17.
 */
public class AnimalQueue {

    LinkedList<Dog> dogList = new LinkedList<Dog>();
    LinkedList<Cat> catList = new LinkedList<Cat>();

    private int order = 0;

    public Animal dequeCat(){
        return catList.poll();
    }
    public Animal dequeDog(){
        return dogList.poll();
    }
    public Animal dequeAny(){
        if(dogList.size() == 0)
            return dequeCat();
        else if(catList. size() == 0)
            return dequeDog();

        if(catList.peek().isGreaterThan(dogList.peek()))
            return catList.poll();
        else
            return dogList.poll();
    }
    public void enqueu(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Cat)
            catList.addLast((Cat)a);
        else if (a instanceof Dog)
            dogList.addLast((Dog)a);
    }
}
