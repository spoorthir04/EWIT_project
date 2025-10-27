package com.activity;

public class BankMystery {
    public static void main(String[] args) {
        String[] accounts = {"John", "Alice", null, "Bob"};
        int[] balances = {1000, 2000, 3000, 0}; // Added one more element to match the length

        // Detective task: Fixed all possible issues
        for (int i = 0; i < accounts.length; i++) {
            // Handle null values in accounts array
            if (accounts[i] == null) {
                System.out.println("Account holder: Unknown");
            } else {
                System.out.println("Account holder: " + accounts[i]);
            }

            System.out.println("Balance: " + balances[i]);
        }

        String input = "abc";
        int withdrawal = 0;

        // Handle invalid integer parsing safely
        try {
            withdrawal = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for withdrawal. Defaulting to 0.");
        }

        System.out.println("Withdrawal amount: " + withdrawal);
    }
}

