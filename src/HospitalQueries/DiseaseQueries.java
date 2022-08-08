package HospitalQueries;

public class DiseaseQueries {
    public static String InsertDiseaseQry = "insert into Disease (SCIENTIFIC_NAME, COMMON_NAME)"+
            "values(?,?)";

    public static String GetDiseaseInfo = "select SCIENTIFIC_NAME, COMMON_NAME"+
           " from Disease where SCIENTIFIC_NAME = ?";

    public static String UpdateDiseaseInfo = "UPDATE  Disease " +
            "SET SCIENTIFIC_NAME = ?, " +
            "COMMON_NAME = ? " +
            "WHERE SCIENTIFIC_NAME = ?" ;

    public static String DeleteDiseaseInfo = " delete from Disease where SCIENTIFIC_NAME = ?";
}
