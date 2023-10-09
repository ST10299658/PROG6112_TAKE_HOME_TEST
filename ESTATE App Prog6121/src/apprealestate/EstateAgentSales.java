/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apprealestate;

import javax.swing.JOptionPane;


class EstateAgentSales extends EstateAgent {
    
    private StringBuilder message = new StringBuilder();

    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }

    public void printPropertyReport() {
        message.append("ESTATE AGENT: ").append(getAgentName()).append("\n")
                .append("PROPERTY PRICE: R").append(getPropertyPrice()).append("\n")
                .append("AGENT COMMISSION: R").append(getAgentCommission());

       JOptionPane.showMessageDialog(null,message.toString());
    }
}
