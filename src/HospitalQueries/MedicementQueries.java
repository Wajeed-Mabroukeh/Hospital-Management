package HospitalQueries;

public class MedicementQueries {
    public static String InsertMedicementQry = "insert into Medicament (MEDIC_NAME, MEDIC_ID ,PRICE)"+
            "values(?,?,?)";

    public static String GetMedicamentInfo = "select MEDIC_NAME, MEDIC_ID ,"+
            " PRICE from Medicament where MEDIC_ID = ?";

    public static String UpdateMedicamentInfo = "UPDATE  Medicament " +
            "SET MEDIC_NAME = ?, " +
            "MEDIC_ID = ? ," +
            "PRICE = ?"+
            "WHERE MEDIC_ID = ?" ;

    public static String DeleteMedicamentInfo = " delete from Medicament where MEDIC_ID = ?";
}
