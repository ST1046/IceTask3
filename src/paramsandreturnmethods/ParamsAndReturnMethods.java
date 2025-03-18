/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paramsandreturnmethods;

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;
public class ParamsAndReturnMethods {

   //created method
    public static double calculateTotal(double price1, double price2, double price3){
        return price1 + price2 + price3;
    }
    
            
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Price of Product 1: ");
        String input2 = JOptionPane.showInputDialog("Price of Product 2: ");
        String input3 = JOptionPane.showInputDialog("Price of Product 3: ");
        
        //method calling 
        double price1 = Double.parseDouble(input1);
        double price2 = Double.parseDouble(input2);
        double price3 = Double.parseDouble(input3);
        
        double totalCost = calculateTotal(price1, price2, price3);
        
        JOptionPane.showMessageDialog(null, "Total cost is: R" + totalCost);
    }
    
}
