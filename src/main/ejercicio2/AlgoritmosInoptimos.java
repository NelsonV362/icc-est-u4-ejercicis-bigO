package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class AlgoritmosInoptimos {

    // 1. Buscar duplicados en un arreglo (ineficiente)
    public static boolean tieneDuplicados(int[] arr) {
        Set<Integer> elementosVistos = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        if (!elementosVistos.add(arr[i])) {  
            return true;
            }
        }
        return false;
    }

    // 2. Contar elementos mayores que X usando dos bucles
    public static int contarMayores(int[] arr, int x) {
        Set<Integer> mayores = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            boolean esMayor = true;
                        for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    esMayor = false;
                    break;
                }
            }
            if (arr[i] > x && esMayor) {
                mayores.add(arr[i]);
            }
        }
        return mayores.size();
    }

    // 3. Encontrar el valor máximo usando dos bucles
    public static int encontrarMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean esMaximo = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    esMaximo = false;
            }
            if (esMaximo)
                max = arr[i];
        }
        return max;
    }
}
