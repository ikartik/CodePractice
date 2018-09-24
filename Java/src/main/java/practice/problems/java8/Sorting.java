package practice.problems.java8;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * @author kartik sharma
 * @date 27/04/18
 */
public class Sorting {

    int [] toSort;
    int [] sortedInts;
    HashMap<Integer, String> map;

    @Before
    public void initVariables () {
        toSort = new int[]
                { 5, 1, 89, 255, 7, 88, 200, 123, 66 };
        sortedInts = new int[]
                {1, 5, 7, 66, 88, 89, 123, 200, 255};

        map = new HashMap<>();
        map.put(55, "John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");
    }

    @Test
    public void givenIntArray_whenUsingSort_thenSortedArray() {
        Arrays.sort(toSort);

        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    @Test
    public void givenIntArray_whenUsingParallelSort_thenArraySorted() {
        Arrays.parallelSort(toSort);

        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    @Test
    public void givenMap_whenSortingByKeys_thenSortedMap() {
        Integer[] sortedKeys = new Integer[] { 6, 12, 22, 55, 66, 77 };

        List<Map.Entry<Integer, String>> entries
                = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(
                    Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        assertTrue(Arrays.equals(sortedMap.keySet().toArray(), sortedKeys));
    }

    @Test
    public void givenMap_whenSortingByValues_thenSortedMap() {
        String[] sortedValues = new String[]
                { "Apple", "Earl", "George", "John", "Pearl", "Rocky" };

        List<Map.Entry<Integer, String>> entries
                = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(
                    Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        assertTrue(Arrays.equals(sortedMap.values().toArray(), sortedValues));
    }

    @Test
    public void givenIntegerArray_whenUsingSort_thenSortedArray() {
        Integer [] integers = ArrayUtils.toObject(toSort);
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        assertTrue(Arrays.equals(integers, ArrayUtils.toObject(sortedInts)));
    }

    @Test
    public void givenArray_whenUsingSortWithLambdas_thenSortedArray() {
        Integer [] integersToSort = ArrayUtils.toObject(toSort);
        Arrays.sort(integersToSort, Comparator.comparingInt(a -> a));

        assertTrue(Arrays.equals(integersToSort,
                ArrayUtils.toObject(sortedInts)));
        System.out.println(Arrays.asList(integersToSort));
    }
}
