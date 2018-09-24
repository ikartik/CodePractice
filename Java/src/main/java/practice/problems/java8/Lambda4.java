package practice.problems.java8;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author kartik sharma
 * @date 27/04/18
 */
public class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    @Test
    public void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from + outerNum);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from + outerStaticNum);
        };
        System.out.println(stringConverter1.convert(10) +", "+ stringConverter2.convert(10));

        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

    }
}
