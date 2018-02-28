/* By Hildana.M
 * NetPay.java
 * This program calculates the net pay of an employee  
 * Feb/27/2018 
 */

package netpay;

public class NetPay {

    public static void main(String[] args) {
     
        int h = 40;
        int w = 5;
        int i = 2;
        double t = 0.22; 
        double netPay = (h*w-i)-t*(h*w-i); //finds net pay
        
        //prints the answer 
        System.out.println("The net pay is " + netPay + " dollars" );
 
    }
    
}
