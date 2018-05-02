package Chapter_11_a_06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
[3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
 */

public class Exercise_06
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(15);
        list.add(15);

        System.out.println("List of all numbers including uniques number: " + list);
        System.out.println();
        System.out.println("how many unique numbers ? " + countUnique(list));

    }
    public static int countUnique (LinkedList<Integer> list){

        Set<Integer> uniqueCount = new HashSet<>();
        uniqueCount.addAll(list);

        return uniqueCount.size();
    }
}
