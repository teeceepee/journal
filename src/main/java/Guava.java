import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.Arrays;

public class Guava {
    public static void g() {
        System.out.println("Learning Guava");
        joiner();
        splitter();
        format();
    }

    private static void joiner() {
        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println(joiner.join("Harry", null, "Ron", "Hermione"));
        System.out.println(Joiner.on(",").join(Arrays.asList(1, 5, 7)));
    }

    private static void splitter() {
        Iterable<String> strings = Splitter.on(',')
            .trimResults()
            .omitEmptyStrings()
            .split("foo,bar,,   qux");
        System.out.println(strings);
    }

    private static void format() {
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME"));
    }
}
