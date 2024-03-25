/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author JOSC
 */
import java.util.*;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, num4, num5;
        double sum, average, maximum, minimum;

        System.out.println("Enter the five numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        num4 = input.nextDouble();
        num5 = input.nextDouble();

        sum = addition(num1, num2, num3, num4, num5);
        average = mean(num1, num2, num3, num4, num5);
        maximum = max(num1, num2, num3, num4, num5);
        minimum = min(num1, num2, num3, num4, num5);
        
        System.out.println("The sum is " +sum);        
        System.out.println("The average is " +average);
        System.out.println("The largest number is " +maximum);
        System.out.println("The smallest number is " +minimum);


          }
    public static double addition(double a, double b, double c, double d, double e){
        double sum = a+b+c+d+e;
        return sum;
    }
    public static double mean(double a, double b, double c, double d, double e){
        double mean = (a+b+c+d+e)/5;
        return mean;
    }
    public static double max(double a, double b, double c, double d, double e){
        double max = 0 ;
        if(max>a){
            max = max;
        }
        else{
            max = a;
        }
        if(max>b){
            max = max;
        }
        else{
            max=b;
        }
        if (max>c){
            max=max;
        }
        else{
            max=c;
        }
        if (max>d){
            max = max;
        }
        else{
            max = d;
        }
        if (max>e){
            max = max;
        }
        else{
            max = e;
        }
        return max;
    }
    public static double min(double a, double b, double c, double d, double e){
        double min = 0 ;
        if(min<a){
            min = min;
        }
        else{
            min = a;
        }
        if(min<b){
            min = min;
        }
        else{
            min=b;
        }
        if (min<c){
            min = min;
        }
        else{
            min=c;
        }
        if (min<d){
            min = min;
        }
        else{
            min = d;
        }
        if (min<e){
            min = min;
        }
        else{
            min = e;
        }
        return min;
    }
    }
