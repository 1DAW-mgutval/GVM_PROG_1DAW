package Ej139;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = new Integer[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(1000);
        }

        System.out.println(Arrays.toString(Stream.of(nums)
                .filter(Main::esPrimo)
                .sorted(Integer::compareTo)
                .toArray())+"\n");

        System.out.println(Arrays.toString(Stream.of(nums)
                .filter(Main::esPrimo)
                .sorted((a,b) -> Integer.compare(b,a))
                .toArray())+"\n");

        System.out.println(Arrays.toString(Stream.of(nums)
                .filter(x -> x > 199 && x < 801 && esPrimo(x))
                .toArray()));
    }

    static boolean esPrimo(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
