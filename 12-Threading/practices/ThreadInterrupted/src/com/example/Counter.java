/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amzaso
 */
public class Counter implements Runnable {

    @Override
    public void run() {
        int x = 0;
        while (!Thread.interrupted()){
            System.out.println("Valor de x: "+x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
    
}
