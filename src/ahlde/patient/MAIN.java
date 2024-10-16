package ahlde.patient;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MAIN {

  public static void main(String[] args) {
      
  }
       public void addPatient(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Patient First Name: ");
        String fname = sc.next();
        
        System.out.print("Patient Last Name: ");
        String lname = sc.next();
        
        System.out.print("Patient Date of Birth: ");
        String dofb = sc.next();
        
        System.out.print("Patient Contact Number: ");
        String con_num = sc.next();
        
        System.out.println("Patient Adress");
        String address = sc.next();

        String sql = "INSERT INTO tbl_patient (patient_ID, first_name, last_name, date_of_birth, contact_number, address) VALUES (?, ?, ?, ?, ? ?)";


        conf.addPatient( fname, lname, dofb, con_num, address);
    }
    private void viewPatient() {
        config conf = new config();
    
        String votersQuery = "SELECT * FROM patient";
        String[] votersHeaders = {"first_name", "last_name", "date_of_birth", "contact_number", "address");
        String[] votersColumns = {"fname", "lname", "dofb", "con_num", "address"};

        conf.viewPatient (votersQuery, votersHeaders, votersColumns);
    }
      private void updatePatient() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter Patient ID: ");
        int id = sc.nextInt();
        System.out.println("\n");
        
        System.out.println("Enter new First Name: ");
        String uptfname = sc.next();
        
        System.out.println("Enter new Last Name: ");
        String uptlname = sc.next();
        
        System.out.println("Enter new Date of Birth: ");
        String uptdofb= sc.next();
        
        System.out.println("Enter new Contact Number: ");
        String uptcon_num = sc.next();
        
        System.out.println("Enter new Address: ");
        String uptaddress = sc.next();
        
        
        
        String sqlUpdate = "UPDATE patient SET name = ? WHERE id = ?";

        config cf = new config();
        cf.updatePatient(sqlUpdate, uptid, uptfname, uptlname, uptdofb, uptcon_num, upt);    
     




