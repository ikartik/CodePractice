package practice.problems.animals;

/**
 * Created by kartik on 08/09/17.
 */
public class SheltorMain {

    public static void main(String[] args){

//        Animal a = new Dog("junior");
//        Animal b = new Cat("tom");

        AnimalQueue aq = new AnimalQueue();
//        aq.enqueu(a);
//        aq.enqueu(b);

        aq.enqueu(new Dog("d1")); // 0
        aq.enqueu(new Cat("c1")); // 1
        aq.enqueu(new Cat("c2")); // 2
        aq.enqueu(new Dog("d2")); // 3
        aq.enqueu(new Dog("d3")); // 4
        aq.enqueu(new Dog("d4")); // 5
        aq.enqueu(new Cat("c3")); // 6
        aq.enqueu(new Cat("c4")); // 7
        aq.enqueu(new Cat("c5")); // 8

        System.out.println(aq.dequeCat().getOrder());
        System.out.println(aq.dequeDog().getOrder());
        System.out.println(aq.dequeAny().getOrder());

//        System.out.println(a.getOrder());
//        System.out.println(b.getOrder());



    }

}
