# Chat App - Part 1: Registration and Login Feature

## 📋 Project Overview
This is Part 1 of the Chat Application POE. This console-based application implements a user registration and login system with specific validation rules.

## 👤 Author Information
- **Name:** Koketso Ratsoma
- **Student Number:** ST10449069
- **Module:** PROG5121
- **Date:** April 2026

## 🚀 Features Implemented

### Registration Feature
- Username validation (must contain underscore `_` and be ≤ 5 characters)
- Password complexity validation (≥8 chars, 1 capital letter, 1 number, 1 special character)
- South African cell phone number validation (must include international code `+27` followed by 9 digits)

### Login Feature
- Validates credentials against registered user information
- Returns appropriate success/failure messages

## 🛠️ Technologies Used
- **Language:** Java (JDK 11 or higher)
- **Testing Framework:** JUnit 5
- **Version Control:** Git & GitHub
- **Build Tool:** [Maven or None - delete as appropriate]

📚 References

Phone Number Validation Regex
The regular expression used for cell phone validation was adapted from:

Stack Overflow: "Validate South African phone number"

URL: https://stackoverflow.com/questions/43382619/validate-south-african-phone-number

Accessed: April 2026

Additional Resources
JUnit 5 Documentation: https://junit.org/junit5/docs/current/user-guide/

Git Documentation: https://git-scm.com/doc

Java Regular Expressions: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
