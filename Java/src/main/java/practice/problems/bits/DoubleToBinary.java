package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class DoubleToBinary {

    public static void main(String[] args) {

        System.out.println(numToBinary1(0.250));
        System.out.println(numToBinary2(0.125));

    }

    static String numToBinary1(double num){

        if(num >= 1 || num <= 0)
            return "ERROR";

        StringBuilder binary = new StringBuilder();

        binary.append(".");
        while(num > 0){

            if(binary.length() >= 32)
                return "ERROR";

            double r = num * 2;
            if(r >= 1){
                binary.append(1);
                num = r - 1;
            }
            else{
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    static String numToBinary2(double num){
        if(num >= 1 || num <= 0)
            return "ERROR";

        StringBuilder binary = new StringBuilder();
        double frac = 0.5;
        binary.append(".");

        while(num > 0){

            if(binary.length() >= 32)
                return "ERROR";

            if(num >= frac){
                binary.append(1);
                num -= frac;
            }
            else{
                binary.append(0);
            }
            frac /= 2;
        }
        return binary.toString();
    }

}
