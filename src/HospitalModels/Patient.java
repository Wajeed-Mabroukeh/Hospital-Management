package HospitalModels;

import java.time.LocalDate;

public class Patient {
    public String First_Name;
    public String Last_Name;
    public String sciectific;
    public int SSN;
    public int Phone;
    public int Nurse_id;
    public int doctor_id;
    public int Medic_id;
    public int nurse_ssn;
    public int nurse_phone;
    public int doctor_ssn;
    public int doctor_phone;
    public LocalDate BirthDate;
    public String Sex;
    public Patient(){}

    public Patient(String First_Name, String Last_Name, int SSN, int Phone,int doctor_id,
                 int Nurse_id, String sciectific, int Medic_id, LocalDate BirthDate, String Sex,int nurse_ssn ,
                   int nurse_phone ,int doctor_ssn ,int doctor_phone)
    {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.BirthDate = BirthDate;
        this.doctor_id = doctor_id;
        this.Nurse_id = Nurse_id;
        this.Phone = Phone;
        this.sciectific = sciectific;
        this.Medic_id = Medic_id;
        this.nurse_ssn = nurse_ssn;
        this.nurse_phone = nurse_phone;
        this.doctor_ssn = doctor_ssn;
        this.doctor_phone = doctor_phone;
        this.SSN = SSN;
        this.Sex = Sex;
    }
}
