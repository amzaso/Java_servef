/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author amzaso
 */
public class ThreadInterruptedMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable counter = new Counter();
        Thread t1 = new Thread(counter);
        t1.start();
        
        
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            String str = br.readLine();
            
                System.out.println("Estado de hilo: "+t1.isAlive());
                t1.interrupt();
                try{
                Thread.sleep(1000);
                } catch (InterruptedException ex){}
                
                System.out.println("Ultimo estado de hilo: "+t1.isAlive());
            

        } catch (IOException ex){}
    }
    
}
