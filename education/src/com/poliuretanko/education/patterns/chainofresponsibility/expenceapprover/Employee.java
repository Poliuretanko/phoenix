package com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover;

public class Employee implements ExpenseApprover {
    private final String name;
    private final int approvalLimit;
    private ExpenseApprover nextApprover;

    public Employee(String name, int approvalLimit) {
        this.name = name;
        this.approvalLimit = approvalLimit;
        this.nextApprover = new DenyExpenseApprover();
    }

    @Override
    public ApprovalResult approve(ExpenseReport report) {
        System.out.println("Asking " + name + " for an approval " + report.getTotal());
        if (report.getTotal() > approvalLimit) {
            return nextApprover.approve(report);
        }
        return ApprovalResult.approved;
    }

    @Override
    public void registerNext(ExpenseApprover approver) {
        nextApprover = approver;
    }
}
