package com.company;

import java.util.Scanner;

import static com.company.Heapsort.sort;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenidos al Heap Sort");
        int n, j;

        System.out.println("Ingrese el tamaño del Arreglo");
        n = lector.nextInt();
        int array [] = new int[n];

        for (int i = 0; i <n ; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.println("Lugar del Arreglo"+i+ "="+ array[i]);

        }

        long IniTiempo = System.nanoTime();

        sort(array);

        long TiempoFinal = System.nanoTime();
        long deltaTiempo = TiempoFinal - IniTiempo;

        System.out.println("Despues del Heap Sort");
        for (int k = 0; k <n ; k++) {
            System.out.println(array[k]+ " ");
            System.out.println();

        }

        System.out.println(" ");
        System.out.println("Tiempo de HeapSort para " +n+ "elementos: " +deltaTiempo);




    }
}
