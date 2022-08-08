import HospitalFilters.*;
import HospitalModels.*;
import HospitalQueries.*;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HosbitalRepository {

    public HosbitalRepository()
    {
        // inialize default connector
    }

    //Doctor
    public static void InsertDoctor(Doctor doctor)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.InsertDoctorQry;
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, doctor.First_Name);
            pstmt.setString(2, doctor.Last_Name);
            pstmt.setString(3, doctor.Email);
            pstmt.setInt(4, doctor.SSN);
            pstmt.setInt(5, doctor.Phone);
            pstmt.setInt(6, doctor.Doctor_id);
            pstmt.setBigDecimal(7, new BigDecimal(doctor.Salary));
            pstmt.setInt(8, doctor.Department_ID);
            pstmt.setDate(9, java.sql.Date.valueOf(doctor.BirthDate));
            pstmt.setString(10, doctor.Sex);

            int row = pstmt.executeUpdate();
            GUI.primaryStageDS.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Adding Doctor successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding Doctor failed!");
        }
    }
    public static void UpdatetDoctor(Doctor doctor)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.UpdateDoctorInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, doctor.First_Name);
            pstmt.setString(2, doctor.Last_Name);
            pstmt.setString(3, doctor.Email);
            pstmt.setInt(4, doctor.Phone);
            pstmt.setInt(5, doctor.Doctor_id);
            pstmt.setBigDecimal(6, new BigDecimal(doctor.Salary));
            pstmt.setInt(7, doctor.Department_ID);
            pstmt.setDate(8, java.sql.Date.valueOf(doctor.BirthDate));
            pstmt.setString(9, doctor.Sex);
            pstmt.setInt(10, doctor.SSN);


            pstmt.executeUpdate();
            GUI.primaryStageDE.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Doctor successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Doctor failed!" );
        }
    }
    public static Doctor GetDoctor(DoctorFilter doctorFilter)
    {

        Doctor doctor = new Doctor();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.GetDoctorInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, doctorFilter.SSN);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                doctor.First_Name = rs.getString("first_name");
                doctor.Last_Name = rs.getString("last_name");
                doctor.SSN = rs.getInt("ssn");
                doctor.Doctor_id = rs.getInt("doctor_id");
                doctor.Department_ID = rs.getInt("department_id");
                doctor.Phone = rs.getInt("phone");
                doctor.Sex = rs.getString("sex");
                doctor.Email = rs.getString("email");
                doctor.Salary = rs.getBigDecimal("salary").doubleValue();
                doctor.BirthDate = rs.getDate("birthdate").toLocalDate();
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return doctor;
    }
    public static Doctor GetDoctorI(DoctorFilter doctorFilter)
    {

        Doctor doctor = new Doctor();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.GetDoctorInfoI;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, doctorFilter.Doctor_id);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                doctor.First_Name = rs.getString("first_name");
                doctor.Last_Name = rs.getString("last_name");
                doctor.SSN = rs.getInt("ssn");
                doctor.Doctor_id = rs.getInt("doctor_id");
                doctor.Department_ID = rs.getInt("department_id");
                doctor.Phone = rs.getInt("phone");
                doctor.Sex = rs.getString("sex");
                doctor.Email = rs.getString("email");
                doctor.Salary = rs.getBigDecimal("salary").doubleValue();
                doctor.BirthDate = rs.getDate("birthdate").toLocalDate();
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return doctor;
    }
    public static Doctor GetDoctorF(DoctorFilter doctorFilter)
    {

        Doctor doctor = new Doctor();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.GetDoctorInfoF;
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, doctorFilter.First_Name);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                doctor.First_Name = rs.getString("first_name");
                doctor.Last_Name = rs.getString("last_name");
                doctor.SSN = rs.getInt("ssn");
                doctor.Doctor_id = rs.getInt("doctor_id");
                doctor.Department_ID = rs.getInt("department_id");
                doctor.Phone = rs.getInt("phone");
                doctor.Sex = rs.getString("sex");
                doctor.Email = rs.getString("email");
                doctor.Salary = rs.getBigDecimal("salary").doubleValue();
                doctor.BirthDate = rs.getDate("birthdate").toLocalDate();
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return doctor;
    }
    public static Doctor GetDoctorL(DoctorFilter doctorFilter) {

        Doctor doctor = new Doctor();
        try {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.GetDoctorInfoL;
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, doctorFilter.Last_Name);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                doctor.First_Name = rs.getString("first_name");
                doctor.Last_Name = rs.getString("last_name");
                doctor.SSN = rs.getInt("ssn");
                doctor.Doctor_id = rs.getInt("doctor_id");
                doctor.Department_ID = rs.getInt("department_id");
                doctor.Phone = rs.getInt("phone");
                doctor.Sex = rs.getString("sex");
                doctor.Email = rs.getString("email");
                doctor.Salary = rs.getBigDecimal("salary").doubleValue();
                doctor.BirthDate = rs.getDate("birthdate").toLocalDate();
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return doctor;
    }
    public static Doctor GetDoctorP(DoctorFilter doctorFilter)
    {

        Doctor doctor = new Doctor();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.GetDoctorInfoP;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, doctorFilter.Phone);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                doctor.First_Name = rs.getString("first_name");
                doctor.Last_Name = rs.getString("last_name");
                doctor.SSN = rs.getInt("ssn");
                doctor.Doctor_id = rs.getInt("doctor_id");
                doctor.Department_ID = rs.getInt("department_id");
                doctor.Phone = rs.getInt("phone");
                doctor.Sex = rs.getString("sex");
                doctor.Email = rs.getString("email");
                doctor.Salary = rs.getBigDecimal("salary").doubleValue();
                doctor.BirthDate = rs.getDate("birthdate").toLocalDate();
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return doctor;
    }
    public static void DeleteDoctor(int SSN)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DoctorQueries.DeleteDoctorInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, SSN);

            pstmt.executeUpdate();
            GUI.primaryStageDDelete.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Doctor successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Doctor failed!" );
        }
    }



    //Nurse
    public static void InsertNurse(Nurse nurse)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = NurseQueries.InsertNurseQry;
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, nurse.getFirst_Name());
            pstmt.setString(2, nurse.getLast_Name());
            pstmt.setString(3, nurse.getEmail());
            pstmt.setInt(4, nurse.getSSN());
            pstmt.setInt(5, nurse.getPhone());
            pstmt.setInt(6, nurse.getNurse_id());
            pstmt.setBigDecimal(7, new BigDecimal(nurse.getSalary()));
            pstmt.setInt(8, nurse.getDepartment_ID());
            pstmt.setDate(9, java.sql.Date.valueOf(nurse.getBirthDate()));
            pstmt.setString(10, nurse.getSex());

            int row = pstmt.executeUpdate();
            con.close();
            GUI.primaryStageNS.close();

            JOptionPane.showMessageDialog(null, "Adding Nurse successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding Nurse failed!");
        }
    }
    public static void UpdatetNurse(Nurse nurse)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = NurseQueries.UpdateNurseInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nurse.getFirst_Name());
            pstmt.setString(2, nurse.getLast_Name());
            pstmt.setString(3, nurse.getEmail());
            pstmt.setInt(4, nurse.getPhone());
            pstmt.setInt(5, nurse.getNurse_id());
            pstmt.setBigDecimal(6, new BigDecimal(nurse.getSalary()));
            pstmt.setInt(7, nurse.getDepartment_ID());
            pstmt.setDate(8, java.sql.Date.valueOf(nurse.getBirthDate()));
            pstmt.setString(9, nurse.getSex());
            pstmt.setInt(10, nurse.getSSN());


            pstmt.executeUpdate();
            GUI.primaryStageNE.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Nurse successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Nurse failed!" );
        }
    }
    public static Nurse GetNurse(NurseFilter nurseFilter)
    {

        Nurse nurse = new Nurse();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = NurseQueries.GetNurseInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, nurseFilter.SSN);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                nurse.setFirst_Name(rs.getString("first_name"));
                nurse.setLast_Name(rs.getString("last_name"));
                nurse.setSSN(rs.getInt("ssn"));
                nurse.setNurse_id(rs.getInt("NURSE_ID"));
                nurse.setDepartment_ID(rs.getInt("department_id"));
                nurse.setPhone(rs.getInt("phone"));
                nurse.setSex(rs.getString("sex"));
                nurse.setEmail(rs.getString("email"));
                nurse.setSalary(rs.getBigDecimal("salary").doubleValue());
                nurse.setBirthDate(rs.getDate("birthdate").toLocalDate());
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return nurse;
    }
    public static Nurse GetNurseI(NurseFilter nurseFilter)
    {

        Nurse nurse = new Nurse();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = NurseQueries.GetNurseInfoI;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, nurseFilter.Nurse_Id);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                nurse.setFirst_Name(rs.getString("first_name"));
                nurse.setLast_Name(rs.getString("last_name"));
                nurse.setSSN(rs.getInt("ssn"));
                nurse.setNurse_id(rs.getInt("NURSE_ID"));
                nurse.setDepartment_ID(rs.getInt("department_id"));
                nurse.setPhone(rs.getInt("phone"));
                nurse.setSex(rs.getString("sex"));
                nurse.setEmail(rs.getString("email"));
                nurse.setSalary(rs.getBigDecimal("salary").doubleValue());
                nurse.setBirthDate(rs.getDate("birthdate").toLocalDate());
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return nurse;
    }
    public static void DeleteNurse(int SSN)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = NurseQueries.DeleteNurseInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, SSN);

            pstmt.executeUpdate();
            GUI.primaryStageDNDelete.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Nurse successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Nurse failed!" );
        }
    }


    //Patient
    public static void InsertPatient(Patient patient)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt;
            ResultSet rs = null;

            String query = PatientQueries.InsertPatientQry;
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, patient.First_Name);
            pstmt.setString(2, patient.Last_Name);
            pstmt.setInt(3, patient.SSN);
            pstmt.setInt(4, patient.Phone);
            pstmt.setInt(5, patient.doctor_id);
            pstmt.setInt(6, patient.Nurse_id);
            pstmt.setString(7, patient.sciectific);
            pstmt.setInt(8, patient.Medic_id);
            pstmt.setDate(9, java.sql.Date.valueOf(patient.BirthDate));
            pstmt.setString(10, patient.Sex);
            pstmt.setInt(11, patient.nurse_ssn);
            pstmt.setInt(12, patient.nurse_phone);
            pstmt.setInt(13, patient.doctor_ssn);
            pstmt.setInt(14, patient.doctor_phone);
;
            int row = pstmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Adding patient successed!");
            GUI.primaryStagePS.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding patient failed!");
        }
    }
    public static void UpdatetPatient(Patient patient)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = PatientQueries.UpdatePatientInfo;

            pstmt = con.prepareStatement(query);

            pstmt.setString(1, patient.First_Name);
            pstmt.setString(2, patient.Last_Name);
            pstmt.setInt(3, patient.SSN);
            pstmt.setInt(4, patient.Phone);
            pstmt.setInt(5, patient.doctor_id);
            pstmt.setInt(6, patient.Nurse_id);
            pstmt.setString(7, patient.sciectific);
            pstmt.setInt(8, patient.Medic_id);
            pstmt.setDate(9, java.sql.Date.valueOf(patient.BirthDate));
            pstmt.setString(10, patient.Sex);
            pstmt.setInt(11, patient.nurse_ssn);
            pstmt.setInt(12, patient.nurse_phone);
            pstmt.setInt(13, patient.doctor_ssn);
            pstmt.setInt(14, patient.doctor_phone);
            pstmt.setInt(15, patient.SSN);

            pstmt.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Patient successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Patient failed!" );
        }
    }
    public static Patient GetPatient(PatientFilter patientFilter)
    {

        Patient patient = new Patient();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = PatientQueries.GetPatientInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, patientFilter.SSN);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                patient.First_Name = rs.getString("FIRST_NAME");
                patient.Last_Name = rs.getString("LAST_NAME");
                patient.SSN = rs.getInt("ssn");
                patient.Phone= rs.getInt("phone");
                patient.doctor_id = rs.getInt("doctor_id");
                patient.Nurse_id = rs.getInt("nurse_id");
                patient.sciectific = rs.getString("sciectific_n");
                patient.Medic_id = rs.getInt("Medic_id");
                patient.BirthDate = rs.getDate("birthdate").toLocalDate();
                patient.Sex = rs.getString("Sex");
                patient.nurse_ssn = rs.getInt("nurse_ssn");
                patient.nurse_phone = rs.getInt("nurse_phone");
                patient.doctor_ssn = rs.getInt("doctor_ssn");
                patient.doctor_phone = rs.getInt("doctor_phone");
            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return patient;
    }
    public static void DeletePatient(int SSN)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = PatientQueries.DeletePatientInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, SSN);

            pstmt.executeUpdate();
            GUI.primaryStagePDElete.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Patient successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Patient failed!" );
        }
    }



    //Department
    public static void InsertDepartment(Department department)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DepartmentQueries.InsertDepartmentQry;
            pstmt = con.prepareStatement(query);

            pstmt.setInt(1, department.DEPART_ID);
            pstmt.setString(2, department.DEPART_NAME);

            int row = pstmt.executeUpdate();
           GUI.primaryStageDES.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Adding Department successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding Department failed!");
        }
    }
    public static void UpdatetDepartment(Department department)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DepartmentQueries.UpdateDepartmentInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, department.DEPART_ID);
            pstmt.setString(2, department.DEPART_NAME);
            pstmt.setInt(3, department.DEPART_ID);
            pstmt.executeUpdate();
            GUI.primaryStageDDE.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Department successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Department failed!" );
        }
    }
    public static Department GetDepartment(DepartemntFilter departemntFilter)
    {

        Department department = new Department();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DepartmentQueries.GetDepartmentInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, departemntFilter.DEPART_ID);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                department.DEPART_ID = rs.getInt("DEPART_ID");
                department.DEPART_NAME = rs.getString("DEPART_NAME");

            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return department;
    }
    public static void DeleteDepartment(int DEPART_ID)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DepartmentQueries.DeleteDepartmentInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, DEPART_ID);

            pstmt.executeUpdate();
            GUI.primaryStageDDDelete.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Department successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Department failed!" );
        }
    }




    //Medicement
    public static void InsertMedicement(Medicement medicement)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = MedicementQueries.InsertMedicementQry;
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, medicement.MEDIC_NAME);
            pstmt.setInt(2, medicement.MEDIC_ID);
            pstmt.setInt(3, medicement.PRICE);

            int row = pstmt.executeUpdate();
            GUI.primaryStageMS.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Adding Medicement successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding Medicement failed!");
        }
    }
    public static void UpdatetMedicement(Medicement medicement)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = MedicementQueries.UpdateMedicamentInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, medicement.MEDIC_NAME);
            pstmt.setInt(2, medicement.MEDIC_ID);
            pstmt.setInt(3, medicement.PRICE);
            pstmt.setInt(4, medicement.MEDIC_ID);

            pstmt.executeUpdate();
            GUI.primaryStageME.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Medicement successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Medicement failed!" );
        }
    }
    public static Medicement GetMedicement(MedicementFilter medicementFilter)
    {

        Medicement medicement = new Medicement();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = MedicementQueries.GetMedicamentInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, medicementFilter.MEDIC_ID);

            rs = pstmt.executeQuery();

            if(rs.next())
            {

                medicement.MEDIC_NAME = rs.getString("MEDIC_NAME");
                medicement.MEDIC_ID = rs.getInt("MEDIC_ID");
                medicement.PRICE = rs.getInt("PRICE");

            }

            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return medicement;
    }
    public static void DeleteMedicement(int MEDIC_ID)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = MedicementQueries.DeleteMedicamentInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, MEDIC_ID);

            pstmt.executeUpdate();
            GUI.primaryStageDM.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Medicement successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Medicement failed!" );
        }
    }





    //Disease
    public static void InsertDisease(Disease disease)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DiseaseQueries.InsertDiseaseQry;
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, disease.Sciectific_Name);
            pstmt.setString(2, disease.Common_Name);


            pstmt.executeUpdate();
            GUI.primaryStageDIS.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Adding Disease successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Adding Disease failed!");
        }
    }
    public static void UpdatetDisease(Disease disease)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DiseaseQueries.UpdateDiseaseInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, disease.Sciectific_Name);
            pstmt.setString(2, disease.Common_Name);
            pstmt.setString(3, disease.Sciectific_Name);

            pstmt.executeUpdate();
            GUI.primaryStageDIE.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Update Disease successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Update Disease failed!" );
        }
    }
    public static Disease GetDisease(DiseaseFilter diseaseFilter)
    {

        Disease disease = new Disease();
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DiseaseQueries.GetDiseaseInfo;
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, diseaseFilter.scientific);

            rs = pstmt.executeQuery();

            if(rs.next())
            {
                disease.Sciectific_Name = rs.getString("SCIENTIFIC_NAME");
                disease.Common_Name = rs.getString("COMMON_NAME");

            }
            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
        return disease;
    }
    public static void DeleteDisease(String SCIENTIFIC_NAME)
    {
        try
        {
            Connection con = HospitalConnection.GetConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String query = DiseaseQueries.DeleteDiseaseInfo;

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, SCIENTIFIC_NAME);

            pstmt.executeUpdate();
            GUI.primaryStageDDI.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Delete Medicement successed!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Delete Medicement failed!" );
        }
    }




}
