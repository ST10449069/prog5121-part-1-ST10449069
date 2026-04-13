package com.mycompany.chatapp_poepart1;


public class Login {
    private String storedUsername;
    private String storedPassword;
    private String storedPhone;
    private String firstName;
    private String lastName;

    // Registration storage
    public String registerUser(String username, String password, String phone, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPasswordComplexity(password);
        boolean validPhone = checkCellPhoneNumber(phone);
        
        if (!validUsername) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!validPassword) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!validPhone) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }
        
        // Store valid details
        this.storedUsername = username;
        this.storedPassword = password;
        this.storedPhone = phone;
        
        return "User registered successfully.";
    }
    
    public boolean checkUserName(String username) {
        return username != null && username.contains("_") && username.length() <= 5;
    }
    
    public boolean checkPasswordComplexity(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        return hasCapital && hasNumber && hasSpecial;
    }
    
    public boolean checkCellPhoneNumber(String phone) {
        return phone != null && phone.matches("^\\+27[0-9]{9}$");
    }
    
    public boolean loginUser(String username, String password) {
        return storedUsername != null && storedUsername.equals(username) && storedPassword != null && storedPassword.equals(password);
    }
    
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

