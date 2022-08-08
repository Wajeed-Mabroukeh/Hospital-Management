import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Table {
    private final SimpleStringProperty First_Name;
    private final SimpleStringProperty Last_Name;
    private final SimpleStringProperty Email;
    private final SimpleIntegerProperty SSN;
    private final SimpleIntegerProperty Phone;
    private final SimpleIntegerProperty Doctor_id;
    private final SimpleDoubleProperty salary;
    private final SimpleIntegerProperty Department_ID;
    private final LocalDate BirthDate;

    Table(String First_Name,String Last_Name,String Email, int SSN,int Phone,
            int Doctor_id,
            double salary,
            int Department_ID,
          LocalDate BirthDate)
    {
        this.First_Name=new SimpleStringProperty(First_Name);
        this.Last_Name=new SimpleStringProperty(Last_Name);
        this.Email=new SimpleStringProperty(Email);
        this.SSN=new SimpleIntegerProperty(SSN);
        this.Phone=new SimpleIntegerProperty(Phone);
        this.Doctor_id=new SimpleIntegerProperty(Doctor_id);
        this.salary=new SimpleDoubleProperty(salary);
        this.Department_ID=new SimpleIntegerProperty(Department_ID);
        this.BirthDate= BirthDate;

    }


    public String getFirst_Name() {
        return First_Name.get();
    }

    public SimpleStringProperty first_NameProperty() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.First_Name.set(first_Name);
    }

    public String getLast_Name() {
        return Last_Name.get();
    }

    public SimpleStringProperty last_NameProperty() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name.set(last_Name);
    }

    public String getEmail() {
        return Email.get();
    }

    public SimpleStringProperty emailProperty() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email.set(email);
    }

    public int getSSN() {
        return SSN.get();
    }

    public SimpleIntegerProperty SSNProperty() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN.set(SSN);
    }

    public int getPhone() {
        return Phone.get();
    }

    public SimpleIntegerProperty phoneProperty() {
        return Phone;
    }

    public void setPhone(int phone) {
        this.Phone.set(phone);
    }

    public int getDoctor_id() {
        return Doctor_id.get();
    }

    public SimpleIntegerProperty doctor_idProperty() {
        return Doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.Doctor_id.set(doctor_id);
    }

    public double getSalary() {
        return salary.get();
    }

    public SimpleDoubleProperty salaryProperty() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary.set(salary);
    }

    public int getDepartment_ID() {
        return Department_ID.get();
    }

    public SimpleIntegerProperty department_IDProperty() {
        return Department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        this.Department_ID.set(department_ID);
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    @Override
    public String toString() {
        return "Table{" +
                "First_Name=" + getFirst_Name() +
                ", Last_Name=" + getLast_Name() +
                ", Email=" + getEmail() +
                ", SSN=" + getSSN() +
                ", Phone=" + getPhone() +
                ", Doctor_id=" + getDoctor_id() +
                ", salary=" + getSalary() +
                ", Department_ID=" + getDepartment_ID() +
                ", BirthDate=" + getBirthDate() +
                '}' +"\n";
    }
}

