package practice.problems.java8;

/**
 * @author kartik sharma
 * @date 27/04/18
 */
public class TestClass {

    public static void main(String[] args) {

        Converter<String, Integer> converter = (from -> Integer.parseInt(from));
        Integer converted = converter.convert("123");
        System.out.println(converted);

    }

}
