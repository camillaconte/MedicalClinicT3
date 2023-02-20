package team3.utils;

import java.util.Collection;
import java.util.function.Predicate;

public final class FindProperty {

    public static <T> T findByProperty(Collection<T> col, Predicate<T> filter) {
        return col.stream().filter(filter).findFirst().orElse(null);
    }
}

