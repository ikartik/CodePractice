package practice.problems.animals;

/**
 * Created by kartik on 08/09/17.
 */
abstract class Animal {

    private int order;
    private String name;

    public Animal(String n){
        name = n;
    }
    public void setOrder(int o){
        order = o;
    }
    public int getOrder(){
        return order;
    }
    public boolean isGreaterThan(Animal a){
        return a.getOrder() > order;
    }
}
