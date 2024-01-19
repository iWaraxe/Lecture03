package com.coherentsolutions.studies;

public class Transaction {
    String id;
    double amount;
    String type;
    String date;

    // Base constructor
    Transaction(String id) {
        this.id = id;
    }

    // Chained constructor 1
    Transaction(String id, double amount) {
        this(id);
        this.amount = amount;
    }

    // Chained constructor 2
    Transaction(String id, double amount, String type) {
        this(id, amount);
        this.type = type;
    }

    // Chained constructor 3
    Transaction(String id, double amount, String type, String date) {
        this(id, amount, type);
        this.date = date;
    }
}

