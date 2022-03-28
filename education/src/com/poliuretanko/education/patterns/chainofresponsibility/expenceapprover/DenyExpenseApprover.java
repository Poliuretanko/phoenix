package com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover;


public class DenyExpenseApprover implements ExpenseApprover {
    @Override
    public ApprovalResult approve(ExpenseReport report) {
        System.out.println("Nobody is able to approve this expense " + report.getTotal());
        return ApprovalResult.denied;
    }

    @Override
    public void registerNext(ExpenseApprover approver) {
        throw new RuntimeException("Method is not implemented");
    }
}
