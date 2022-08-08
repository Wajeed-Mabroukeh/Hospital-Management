package HospitalModels;

import java.time.LocalDate;

public class Nurse {
    private String First_Name;
    private String Last_Name;
    private String Email;
    private int SSN;
    private int Phone;
    private int Nurse_id;
    private double Salary;
    private int Department_ID;
    private LocalDate BirthDate;
    private String Sex;
    public Nurse(){}

     public Nurse(String First_Name, String Last_Name, String Email, int SSN, int Phone,
                  int Nurse_id, double Salary, int Department_ID, LocalDate BirthDate, String Sex)
    {
        this.setFirst_Name(First_Name);
        this.setLast_Name(Last_Name);
        this.setBirthDate(BirthDate);
        this.setSalary(Salary);
        this.setDepartment_ID(Department_ID);
        this.setEmail(Email);
        this.setNurse_id(Nurse_id);
        this.setPhone(Phone);
        this.setSSN(SSN);
        this.setSex(Sex);
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getNurse_id() {
        return Nurse_id;
    }

    public void setNurse_id(int nurse_id) {
        Nurse_id = nurse_id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getDepartment_ID() {
        return Department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        Department_ID = department_ID;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
