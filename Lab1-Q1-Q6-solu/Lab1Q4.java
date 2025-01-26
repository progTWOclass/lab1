/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author niloufas
 */
public class Lab1Q4 {
    //method definition
    public static int getLargest(int[] inputArray)
    {
        int maxValue=inputArray[0];
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]>maxValue)
               maxValue=inputArray[i]; 
        }
        return maxValue;
    
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=input.nextInt();
        
        int[] array=new int[size];
        
        System.out.println("Enter "+size+" numbers now:");
        for(int i=0;i<size;i++)
        {
             array[i]=input.nextInt();
        }
        //method call/invokation 
        System.out.println("Largest element:"+getLargest(array));
    }
}
