/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentprofile;


public class GradeMessage {
    
      //method to display the grade message
      public void displayMessage() {
        System.out.println("Grade: Excellent");
    }

    public static void main(String[] args) {
        GradeMessage gm = new GradeMessage();
        gm.displayMessage(); //calls the method to display the message.
    }
}

