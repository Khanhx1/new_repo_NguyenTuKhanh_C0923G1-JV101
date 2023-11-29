package furama_resort.views;

import furama_resort.utils.NumberException;

import java.util.Scanner;

public class ManagementFunction {
    private int choice;
    private Scanner scanner = new Scanner(System.in);
    private NumberException numberException = new NumberException();

    public void manageEmployee() {
        do {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.println("----------Enter your choice----------");
            choice = numberException.inputNumberException();
        } while (choice != 6);
    }

    public void manageCustomer() {
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
            choice = numberException.inputNumberException();
        } while (choice != 6);
    }

    public void manageFacility() {
        do {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            choice = numberException.inputNumberException();
        } while (choice != 5);
    }

    public void manageBooking() {
        do {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            choice = numberException.inputNumberException();
        } while (choice != 6);
    }

    public void managePromotion() {
        do {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choice = numberException.inputNumberException();
        } while (choice != 3);
    }
}
