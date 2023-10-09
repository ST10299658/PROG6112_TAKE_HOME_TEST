/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apprealestate;

import javax.swing.JOptionPane;


abstract class EstateAgent implements iEstateAgent {
     String agentName;
     double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    public String getAgentName() {
      agentName =  JOptionPane.showInputDialog( null, "Enter the agent name ");
        return agentName;
    }

    public double getPropertyPrice() {
        propertyPrice = Integer.parseInt(JOptionPane.showInputDialog( null, "Enter the property price"));
        return propertyPrice;
    }

    public double getAgentCommission() {
        return 0.2 * propertyPrice;
    }
}
