package HospitalQueries;

public class DoctorQueries {
    public static String InsertDoctorQry = "insert into doctor (first_name, last_name, email, " +
            "ssn, phone, doctor_id, salary, " +
            "department_id, birthdate, sex)" +
            "values(?,?,?,?,?,?,?,?,?,?)";

    public static String GetDoctorInfo = "select first_name, last_name, email, ssn, phone, " +
            "doctor_id, salary, " +
            "department_id, birthdate, sex from doctor where ssn = ?";
    public static String GetDoctorInfoI = "select first_name, last_name, email, ssn, phone, " +
            "doctor_id, salary, " +
            "department_id, birthdate, sex from doctor where doctor_id = ?";
    public static String GetDoctorInfoF = "select first_name, last_name, email, ssn, phone, " +
            "doctor_id, salary, " +
            "department_id, birthdate, sex from doctor where first_name = ?";
    public static String GetDoctorInfoL = "select first_name, last_name, email, ssn, phone, " +
            "doctor_id, salary, " +
            "department_id, birthdate, sex from doctor where last_name = ?";
    public static String GetDoctorInfoP = "select first_name, last_name, email, ssn, phone, " +
            "doctor_id, salary, " +
            "department_id, birthdate, sex from doctor where phone = ?";

    public static String UpdateDoctorInfo = "UPDATE  doctor " +
            "SET first_name = ?, " +
            "last_name = ?, " +
            "email = ? ," +
            "phone = ?, " +
            "doctor_id = ?, " +
            "salary = ?, " +
            "department_id = ?, " +
            "birthdate = ?,  " +
            "sex = ? " +
            "WHERE ssn = ?" ;

    public static String DeleteDoctorInfo = " delete from Doctor where ssn = ?";




}
