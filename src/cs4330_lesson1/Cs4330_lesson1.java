/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4330_lesson1;

/**
 *
 * @author Toothless521
 */
    class Bike {

        void run() {
            System.out.println("running");
        }
    }

    class Splender extends Bike {
        
        void run() {
            System.out.println("running safely with 60km");
        }
    }
public class Cs4330_lesson1 {

    /**
     * @param args the command line arguments
     */


        public static void main(String[] args) {
            // TODO code application logic here
            Bike b = new Splender();//upcasting  
            b.run();

        }
    }


