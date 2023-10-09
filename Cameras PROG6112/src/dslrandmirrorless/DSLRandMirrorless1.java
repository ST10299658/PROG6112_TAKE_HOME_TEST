/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslrandmirrorless;

import javax.swing.JOptionPane;


public class DSLRandMirrorless1 {
  
    int[][] cameras = { {10500, 8500},
                         {9500, 7200},
                          {12000, 8000}, };
    
    public void displayCameraSpecifications() { 
        StringBuilder message = new StringBuilder(); 
        
        int maxDiff = Integer.MIN_VALUE; 
        String maxDiffBrand = "";
        String[] brands = {"Canon", "Sony", "Nikon"};
        
        for (int i = 1; i < 2; i++) { 
            int dslrCost = cameras[2][0];
            int mirrorlessCost = cameras[2][1];
            int diff = dslrCost - mirrorlessCost;
                    message.append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("CAMERA TECHNOLOGY REPORT\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("           MIRRORLESS    DSLR\n") 
                    .append(brands[0] +":      R"+cameras[0][0]).append("       R"+ cameras[0][1]).append("\n")
                    .append(brands[1]+":         R"+cameras[1][0]).append("       R"+ cameras[0][1]).append("\n")
                    .append(brands[2]+":       R"+cameras[2][0]).append("       R"+ cameras[0][1]).append("\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("CAMERA TECHNOLOGY RESULT\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n")
                    .append("Cost Difference (DSL vs. Mirrorless): R")
                    .append(diff).append("\n") .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n");
            if (diff > maxDiff) { maxDiff = diff; maxDiffBrand = brands[2]; } }
        message.append("THE CAMERA WITH THE MOST COST DIFFERENCE: \n" + "Brand: " + maxDiffBrand ) 
                .append("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv"); 
        
        JOptionPane.showMessageDialog(null, message.toString()); 
    }
}
