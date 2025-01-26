/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author niloufas
 */
public class Lab1Q6 {
    public static void main(String[] args) {
        char[] array1={'a','c','k','i','b'};
        char[] array2={'b','i','k','a','c'};
        
        if(array1.length != array2.length)
        {
            System.out.println("False");
            System.exit(0);
        }
        
        boolean sameFrequency=true;
        
        for(int i=0;i<array1.length;i++)
        {   
            int frequencyOfElementIinArray1=0;
            for(int j=0;j<array1.length;j++)
                if(array1[i]==array1[j])
                    frequencyOfElementIinArray1++;
            
            int frequencyOfElementIinArray2=0;
            for(int j=0;j<array2.length;j++)
                if(array1[i]==array2[j])
                    frequencyOfElementIinArray2++;
            
            if(frequencyOfElementIinArray1 != frequencyOfElementIinArray2)
                sameFrequency=false;      
        }
        
        if(sameFrequency)
            System.out.println("True");
        else
            System.out.println("False");
        }
        
    }

