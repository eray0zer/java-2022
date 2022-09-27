/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package inheritance;

/**
 *
 * @author eray_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.firstName = "";
        employee.firstName = "";
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

    }
}
