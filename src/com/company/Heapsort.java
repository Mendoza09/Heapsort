package com.company;

import java.util.Random;

public class Heapsort {

    private static int M;

    public static void sort(int arr[]){
        heap(arr);

        for (int i = M; i > 0 ; i--) {
            swap(arr, 0, i);
            M = M-1;
            Heap(arr,0);

        }

    }

    public static void heap(int arr[]){
         M = arr.length - 1;
         for (int nodo = M /2; nodo>=0; nodo--)
             Heap(arr, nodo);
    }

    public static void Heap(int arr [], int nodo){
        int HjIz = 2* nodo+1;
        int HjDr = HjIz+1;
        int padre = nodo;

        if (HjIz <= M && arr[HjIz] > arr[nodo])
            padre = HjIz;
        if (HjDr <= M && arr[HjDr] > arr[padre])
            padre = HjDr;

        if (padre != nodo){
            swap(arr , nodo, padre);
            Heap(arr, padre);
        }
    }

    public static void  swap (int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }






}
