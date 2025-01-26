/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author niloufas
 */
public class Lab1Q5 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,3,5};
        //Display the content of array
        System.out.println("Array contains:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        //reveresing the order of array
        int temp;
        //swap the elements,first with last,second with second last,and so on.
        for(int i=0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;   
        }
        System.out.println("\nArray in reverse order:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
