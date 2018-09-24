package practice.problems.misc;

import java.util.Random;

/**
 * Created by kartik on 29/09/17.
 */
public class BoysAndGirls {

    /*
        The Apocalypse: In the new post-apocalyptic world, the world queen is desperately concerned
        about the birth rate. Therefore, she decrees that all families should ensure that they have one girl or
        else they face massive fines. If all families abide by this policy-that is, they have continue to have
        children until they have one girl, at which point they immediately stop-what will the gender ratio
        of the new generation be? (Assume that the odds of someone having a boy or a girl on any given
        pregnancy is equal.) Solve this out logically and then write a computer simulation of it.
     */

    public static void main(String[] args) {

        int n = 5;
        double result;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            result = runPopulation(i);
            System.out.println(i + " : " + result);
            sum += result;
        }
        System.out.println("Average : " + sum/n);
    }

    static double runPopulation(int n){
        int girls = 0;
        int boys = 0;

        for (int i = 0; i < n; i++) {
            int genders[] = runOneFamily();
            girls += genders[0];
            boys += genders[1];
        }
        return (double)girls / (girls+boys);
    }

    static int[] runOneFamily(){
        int genders[] = new int[2];
        int girls = 0;
        int boys = 0;

        Random random = new Random();
        while(girls == 0){
            if(random.nextBoolean())
                girls += 1;
            else
                boys += 1;
        }
        genders[0] = girls;
        genders[1] = boys;
        return genders;
    }

}
