package com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover;

public class CompanyExpenseReport implements ExpenseReport{
    private final int total;

    public CompanyExpenseReport(int total) {
        this.total = total;
    }

    @Override
    public int getTotal() {
        return total;
    }
}
