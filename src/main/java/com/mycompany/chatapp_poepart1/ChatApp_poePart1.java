package com.mycompany.chatapp_poepart1;

import java.util.Scanner;

public class ChatApp_poePart1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        
        System.out.println("=== REGISTRATION ===");
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Create username (underscore, max 5 chars): ");
        String username = scanner.nextLine();
        System.out.print("Create password (8+ chars, 1 capital, 1 number, 1 special): ");
        String password = scanner.nextLine();
        System.out.print("Enter SA phone number (+27...): ");
        String phone = scanner.nextLine();
        
        String regResult = login.registerUser(username, password, phone, firstName, lastName);
        System.out.println(regResult);
        
        if (regResult.equals("User registered successfully.")) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("Username: ");
            String loginUser = scanner.nextLine();
            System.out.print("Password: ");
            String loginPass = scanner.nextLine();
            
            System.out.println(login.returnLoginStatus(loginUser, loginPass));
        }
        scanner.close();
    }
}
