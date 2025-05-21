package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {

    // Complejidad de O(n)
    public static String tieneDuplicadosComplejidad = "O(N)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        Set<Integer> elementosVistos = new HashSet<>();
        for (int num : arr) {
            if (!elementosVistos.add(num)) {
                return true; 
            }
        }
        return false; 
    }

    // Complejidad de O(n)
    public static String contarMayoresComplejidad = "O(N)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count;
    }
    // Complejidad de O(n)
    public static String encontrarMaximoComplejidad = "O(N)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
