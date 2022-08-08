package HospitalQueries;

public class NurseQueries {
    public static String InsertNurseQry = "insert into nurse (FIRST_NAME, LAST_NAME, EMAIL, " +
            "SSN, PHONE, NURSE_ID, SALARY, " +
            "DEPARTMENT_ID, BIRTHDATE, SEX)" +
            "values(?,?,?,?,?,?,?,?,?,?)";

    public static String UpdateNurseInfo = "UPDATE  Nurse " +
            "SET FIRST_NAME = ?, " +
            "LAST_NAME = ?, " +
            "EMAIL = ? ," +
            "PHONE = ?, " +
            "NURSE_ID = ?, " +
            "SALARY = ?, " +
            "DEPARTMENT_ID = ?, " +
            "BIRTHDATE = ?,  " +
            "SEX = ? " +
            "WHERE SSN = ?" ;

    public static String GetNurseInfo = "select FIRST_NAME, LAST_NAME, EMAIL, SSN, PHONE, " +
            "NURSE_ID, SALARY, " +
            "DEPARTMENT_ID, BIRTHDATE, SEX from Nurse where SSN = ?";
    public static String GetNurseInfoI = "select FIRST_NAME, LAST_NAME, EMAIL, SSN, PHONE, " +
            "NURSE_ID, SALARY, " +
            "DEPARTMENT_ID, BIRTHDATE, SEX from Nurse where NURSE_ID = ?";


    public static String DeleteNurseInfo = " delete from Nurse where ssn = ?";
}
