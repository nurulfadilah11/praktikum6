/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;
import java.util.Scanner;
public class Praktikum6 {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        int nilai1,nilai2,hasil;
        System.out.print("masukaan integer pertama:");
        nilai1=input.nextInt();
        System.out.print("masukkan integer kedua :");
        nilai2=input.nextInt();
        hasil=nilai1+nilai2;
        System.out.println("hasil"+nilai1+"+"+nilai2+"="+hasil);
    }
        
                
        
    }
