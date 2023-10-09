/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apprealestate;

/**
 *
 * @author lab_services_student
 */
public class AppRealEstate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //calling the class
         EstateAgentSales EstateAgentSales = new EstateAgentSales("Mark Wallberg", 500000.00);
         //calling output method
        EstateAgentSales.printPropertyReport();
    }
    
}
