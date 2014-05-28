/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author kimlee
 */
public class ScannerTester {
    
    public static void main(String[] args) {
        
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();//captured user input
//        System.out.println("you typed: " + input);
        
        getToken();
//        sumUp();
        
    }
    
    public static void getToken(){
        try {
//            Scanner s = new Scanner(new File("abc.txt"));            
//            //s.useDelimiter("#");
//            while (s.hasNext()) {
//                System.out.print(s.next() + " ");
//            }
//            System.out.println("");
            
            BufferedReader in = new BufferedReader(new FileReader(
                    "abc.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                StringTokenizer s = new StringTokenizer(line);
                while (s.hasMoreTokens()) {
                    System.out.print(s.nextToken() + " ");
                }
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void sumUp(){
        int sum = 0;
        try {
            Scanner fileScan = new Scanner(new File("temp.txt"));
            //scan the content
            while (fileScan.hasNext()) {
                if (fileScan.hasNextInt()) {
                    sum += fileScan.nextInt();
                }else{
                    fileScan.next();
                }                
            }                        
            fileScan.close();
        } catch (IOException e) {
            System.out.println("ERROR....");
        }finally{
            System.out.println("Sum: " + sum);
        }
        
    }
    
}
