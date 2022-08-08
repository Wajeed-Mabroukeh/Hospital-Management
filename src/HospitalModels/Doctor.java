package HospitalModels;

import java.time.LocalDate;

public class Doctor {

    public String First_Name;
    public String Last_Name;
    public String Email;
    public int SSN;
    public int Phone;
    public int Doctor_id;
    public double Salary;
    public int Department_ID;
    public LocalDate BirthDate;
    public String Sex;

    public Doctor() {}

    public Doctor(String First_Name, String Last_Name, String Email, int SSN, int Phone,
                  int Doctor_id, double Salary, int Department_ID, LocalDate BirthDate, String Sex)
    {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.BirthDate = BirthDate;
        this.Salary = Salary;
        this.Department_ID = Department_ID;
        this.Email = Email;
        this.Doctor_id = Doctor_id;
        this.Phone = Phone;
        this.SSN = SSN;
        this.Sex = Sex;
    }


}
