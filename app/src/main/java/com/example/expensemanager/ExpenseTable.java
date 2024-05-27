package com.example.expensemanager;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")
public class ExpenseTable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String paymentType;
    private long amount;
    private String description;
    private boolean isIncome;

    public ExpenseTable() {
    }

    public ExpenseTable(int id, String paymentType, long amount, String description, boolean isIncome) {
        this.id = id;
        this.paymentType = paymentType;
        this.amount = amount;
        this.description = description;
        this.isIncome = isIncome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }
}
