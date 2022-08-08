package HospitalQueries;

public class DepartmentQueries {
    public static String InsertDepartmentQry = "insert into Department (DEPART_ID, DEPART_NAME)"+
            "values(?,?)";

    public static String GetDepartmentInfo = "select DEPART_ID, DEPART_NAME"+
            " from Department where DEPART_ID = ?";

    public static String UpdateDepartmentInfo = "UPDATE  Department " +
            "SET DEPART_ID = ?, " +
            "DEPART_NAME = ? " +
            "WHERE DEPART_ID = ?" ;

    public static String DeleteDepartmentInfo = " delete from Department where DEPART_ID = ?";
}
