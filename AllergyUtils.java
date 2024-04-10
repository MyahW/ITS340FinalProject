/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package its340_finalproject;
import its340_finalproject.MyConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author myahw
 */

public class AllergyUtils {
//    private int buttonMode;
//    Connection conn = null;
//    String dbData;
   
    
//    if(buttonMode == 1)
//    {
//        clearText();
//        unshadeAndUnlockTextFields();
//    }
//    else if(buttonMode == 2)
//    {
//        Connection conn;
//        MyConnection myconn = new MyConnection();
//
//        try
//        {
//            conn = myconn.getConnection();
//            String sqlInsert = "UPDATE allergyhistorytable set Allergen=?, "
//                + "AllergyDescription=? "
//                + "WHERE AllergenID=?";
//            
//            
//            int allergyid = Integer.parseInt(txtPatientID.getText());
//            int patientid = Integer.parseInt(txtAllergyID.getText());
//            PreparedStatement ps = conn.prepareStatement(sqlInsert);
//                       
//            ps.setString(1, txtAllergen.getText());
//            ps.setString(2, txtAllergyDescr.getText());
//            ps.setInt(3,allergyid);
//            
//            //ps.setString(4,txtAllergyStart.getText());
//            //ps.setString(5,txtAllergyEnd.getText());
//            
//            ps.executeUpdate();
//            
//            ps.close();
//            conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(AllergyTable.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    else{
//        
//        String patientIDText = txtPatientID.getText().trim();
//        String allergyIDText = txtAllergyID.getText().trim();
//
//        // Check if patientIDText and allergyIDText are empty or not
//        boolean isPatientIDProvided = !patientIDText.isEmpty();
//        boolean isAllergyIDProvided = !allergyIDText.isEmpty();
//
//        try {
//            conn = myconn.getConnection();
//
//            // If either patientIDText or allergyIDText is not provided, return with error || !isAllergyIDProvided
//            if (!isPatientIDProvided || !isAllergyIDProvided) {
//                System.out.println("Error: Please enter values for Patient ID and Allergy ID.");
//                return;
//            }
//
//            // If patientIDText is provided and valid, convert it to int
//            int patientID = Integer.parseInt(patientIDText);
//            // If allergyIDText is provided and valid, convert it to int
//            int allergyID = Integer.parseInt(allergyIDText);
//
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                conn = DriverManager.getConnection(dURL, "root", "");
//
//                // Get the maximum allergyID from the database
//                int lastAllergyID = getLastInsertedAllergyID(conn);
//                int nextAllergyID = lastAllergyID + 1;
//
//                String sqlInsert = "INSERT INTO allergyhistorytable (AllergyID, "
//                        + "PatientID, Allergen, AllergyStartDate, AllergyEndDate, "
//                        + "AllergyDescription) VALUES (?, ?, ?, ?, ?, ?)";
//
//                PreparedStatement ps = conn.prepareStatement(sqlInsert);
//                ps.setInt(1, nextAllergyID);
//                ps.setInt(2, patientID);
//                ps.setString(3, txtAllergen.getText());
//                ps.setString(4, txtAllergyStart.getText());
//                ps.setString(5, txtAllergyEnd.getText());
//                ps.setString(6, txtAllergyDescr.getText());
//                int rowCount = ps.executeUpdate();
//                if (rowCount > 0) {
//                    System.out.println("Inserted a row!");
//                } else {
//                    System.out.println("Failed to insert row!");
//                }
//
//            } catch (SQLException e) {
//                System.out.println("SQL Error: " + e.getMessage());
//            } catch (ClassNotFoundException e) {
//                System.out.println("Error: JDBC Driver not found");
//            } finally {
//                try {
//                    if (conn != null) {
//                        conn.close();
//                    }
//                } catch (SQLException e) {
//                    System.out.println("Error: " + e.getMessage());
//                }
//            }
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Invalid input. Please enter valid integer values.");
//        }
//            
//        buttonMode = 0;
//        shadeAndLockTextFields();
//    }
//    private void clearText()
//    {
//        txtPatientID.setText("");
//        txtAllergyID.setText("");
//        txtAllergen.setText("");
//        txtAllergyStart.setText("");
//        txtAllergyEnd.setText("");
//        txtAllergyDescr.setText("");
//    }
//    
//    private void shadeAndLockTextFields() {
//        txtPatientID.setBackground(Color.LIGHT_GRAY);
//        txtPatientID.setEditable(false);
//        txtAllergyID.setBackground(Color.LIGHT_GRAY);
//        txtAllergyID.setEditable(false);
//        txtAllergen.setBackground(Color.LIGHT_GRAY);
//        txtAllergen.setEditable(false);
//        txtAllergyStart.setBackground(Color.LIGHT_GRAY);
//        txtAllergyStart.setEditable(false);
//        txtAllergyEnd.setBackground(Color.LIGHT_GRAY);
//        txtAllergyEnd.setEditable(false);
//        txtAllergyDescr.setBackground(Color.LIGHT_GRAY);
//        txtAllergyDescr.setEditable(false);
//    }
//    
//    private void unshadeAndUnlockTextFields() {
//        txtPatientID.setBackground(Color.WHITE);
//        txtPatientID.setEditable(true);
//        txtAllergyID.setBackground(Color.WHITE);
//        txtAllergyID.setEditable(true);
//        txtAllergen.setBackground(Color.WHITE);
//        txtAllergen.setEditable(true);
//        txtAllergyStart.setBackground(Color.WHITE);
//        txtAllergyStart.setEditable(true);
//        txtAllergyEnd.setBackground(Color.WHITE);
//        txtAllergyEnd.setEditable(true);
//        txtAllergyDescr.setBackground(Color.WHITE);
//        txtAllergyDescr.setEditable(true);
//    }
}

