package mujahid.application;

import mujahid.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();

        company.setName("Mujahid");

        Company.Employee employee = company.new Employee();
        employee.setName("Ansori");

        Company company2 = new Company();

        company2.setName("Facebook");

        Company.Employee employee2 = company2.new Employee();

        employee2.setName("Mujahid");
        System.out.println(employee2.getCompany()); // Facebook
    }
}
