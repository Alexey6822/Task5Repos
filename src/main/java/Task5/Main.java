/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Aleksey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("random.txt");
        double array[] = new double[100];
 
        for (int i = 0; i < array.length; i++) {
            array[i] = (double)(Math.random()*100);
            String result = String.format("%.2f",array[i]);
            result = result.replace("," , ".");
            fw.write(result + " ");
        }
        fw.close();
    }
    
}
