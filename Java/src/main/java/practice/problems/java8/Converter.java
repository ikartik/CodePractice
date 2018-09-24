package practice.problems.java8;

/**
 * @author kartik sharma
 * @date 27/04/18
 */

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
