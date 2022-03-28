package com.poliuretanko.education.patterns.chainofresponsibility;

import com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover.ApprovalResult;
import com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover.CompanyExpenseReport;
import com.poliuretanko.education.patterns.chainofresponsibility.expenceapprover.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApprovalSimulator {
    public static void main(String[] args) {
        Employee johnTheWorker = new Employee("John the worker", 0);
        Employee annTheManager = new Employee("Ann the manager", 1000);
        Employee pavelVP = new Employee("Pavel VP", 5000);
        Employee olegCEO = new Employee("Oleg CEO", 20000);
        johnTheWorker.registerNext(annTheManager);
        annTheManager.registerNext(pavelVP);
        pavelVP.registerNext(olegCEO);

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        CompanyExpenseReport report = new CompanyExpenseReport(total);
        ApprovalResult result = johnTheWorker.approve(report);

        System.out.println(result);
    }
}
