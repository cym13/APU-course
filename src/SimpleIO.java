/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.io;

import java.io.*;

/**
 *
 * @author kimlee
 */
public class SimpleIO {
    
    public static void main(String[] args) {
     
        File f = new File("temp.txt");
        
        //TextIO
        write2File(f, "Java IO Operations");
        read4File(f);
        
    }
    
    public static void write2File(File f, String content){
        try {
//            FileWriter writer = new FileWriter(f);
//            writer.write(content);
//            writer.close();
            
            PrintWriter out = new PrintWriter(f);
            out.println(content);
            out.close();
            
        } catch (Exception e) {
            System.out.println("Write Failure!");
        }finally{
            System.out.println("Writing is done...");
        }
    }
    public static void read4File(File f){
        try {
//            FileReader reader = new FileReader(f);
////            int code = reader.read();
////            System.out.println((char)code);
//            
//            int code = 0;
//            while ((code = reader.read()) != -1) {
//                System.out.print((char)code);
//            }
            
            
            //BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Reading Failure!");
        }finally{
            System.out.println("Reading is complete..");
        }
    }
    
}
