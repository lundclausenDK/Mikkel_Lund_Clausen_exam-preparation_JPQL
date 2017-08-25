
package main;

import facade.Facade;


public class Main {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        
        // Find all students
        for (int i = 0; i < facade.findAllStudents().size(); i++) {
            System.out.println(facade.findAllStudents().get(i).getFirstname());
        }
        
        System.out.println("***********");
        
        // Find all Students in the System with the first name Anders
        for (int i = 0; i < facade.findAllAnders().size(); i++) {
            System.out.println(facade.findAllAnders().get(i).getLastname());
        }
        
        System.out.println("***********");
        
        // Find the total number of students in all semesters.
        int count = 0;
        for (int i = 0; i < facade.findAllStudents().size(); i++) {
            count++;
        }
        System.out.println(count);
        
        System.out.println("***********");
        
        
        
        facade.close();
        
    }

}
