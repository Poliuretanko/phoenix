package com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover;

public interface ExpenseApprover {
    ApprovalResult approve(ExpenseReport report);
    void registerNext(ExpenseApprover approver);
}
