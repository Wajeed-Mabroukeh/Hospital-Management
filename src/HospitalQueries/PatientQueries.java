package HospitalQueries;

public class PatientQueries {
    public static String InsertPatientQry = " insert into Patient (FIRST_NAME, LAST_NAME,"+
      "SSN, PHONE, DOCTOR_ID,NURSE_ID, SCIECTIFIC_N," +
    "MEDIC_ID, BIRTHDATE, SEX,NURSE_SSN,NURSE_PHONE,DOCTOR_SSN,DOCTOR_PHONE)"+
    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static String UpdatePatientInfo = "UPDATE  Patient SET FIRST_NAME = ?," +
            "LAST_NAME = ?," +
            "ssn = ? ," +
            "phone = ?," +
            "doctor_id = ?," +
            "nurse_id = ?," +
            "sciectific_n = ?," +
            "Medic_id = ?, " +
            "birthdate = ?,"+
            "sex = ?,"+
            "nurse_ssn = ?,"+
            "nurse_phone = ?,"+
            "doctor_ssn = ?,"+
            "doctor_phone = ?"+
            "WHERE ssn = ?" ;


//    UPDATE  Patient SET FIRST_NAME = 'sdc',
//            LAST_NAME ='fcrr',
//            ssn = 585,
//            phone =59,
//            doctor_id =618,
//            nurse_id =28,
//            sciectific_n = 'H1N1',
//            Medic_id = 777,
//            birthdate = to_date('2014/03/16','YYYY-MM-DD HH24:MI:SS'),
//            sex = 'Female',
//            nurse_ssn = 52,
//            nurse_phone = 28,
//            doctor_ssn = 545,
//            doctor_phone = 562
//    WHERE ssn = 585;
    public static String GetPatientInfo = "select FIRST_NAME, LAST_NAME, ssn, phone, " +
            "doctor_id , nurse_id , " +
            "sciectific_n , Medic_id ,birthdate , sex ,nurse_ssn ,nurse_phone ,doctor_ssn ,doctor_phone from Patient where ssn = ?";

    public static String DeletePatientInfo = " delete from Patient where ssn = ?";


}
