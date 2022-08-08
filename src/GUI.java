import HospitalFilters.*;
import HospitalModels.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GUI {


    @FXML
    public RadioButton Male;
    @FXML
    public RadioButton Female;
    @FXML
    public TextField FirstNM;
    @FXML
    public RadioButton RDoctor;
    @FXML
    public RadioButton RNurse;
    @FXML
    public RadioButton RPatient;
    @FXML
    public Button search;
    @FXML
    public TableColumn <Table,String> First_NameD;
    @FXML
    public TableColumn <Table,String> Last_NameD;
    @FXML
    public  TableColumn <Table,String> EmailD;
    @FXML
    public  TableColumn <Table,Integer> SSND;
    @FXML
    public TableColumn <Table,Integer> PhoneD;
    @FXML
    public TableColumn <Table,Integer> Doctor_idD;
    @FXML
    public TableColumn <Table,String> salaryD;
    @FXML
    public TableColumn <Table,Integer> Department_IDD;
    @FXML
    public  TableColumn <Table,String> BirthDateD;

    @FXML
    public  TableView  tableview;

  ///User
    @FXML
    public Button login;
    @FXML
    public TextField User;
    @FXML
    public PasswordField Passw;

    ///

    public static Stage Window1;

    public static Stage primaryStageS;
    public static Stage primaryStageDS ;
    public static Stage primaryStageNS;
    public static Stage primaryStagePS;
    public static Stage primaryStageDES ;
    public static Stage primaryStageMS;
    public static Stage primaryStageDIS;
    public static Stage primaryStageDE;
    public static Stage primaryStageNE ;
    public static Stage primaryStageDDE ;
    public static Stage primaryStageDIE ;
    public static Stage primaryStageME ;
    public static Stage primaryStageDDelete;
    public static Stage primaryStageDNDelete;
    public static Stage primaryStagePDElete;
    public static Stage primaryStageDDDelete;
    public static Stage primaryStageDM ;
    public static Stage primaryStageDDI ;



    //USER
    public static String Name = "Wajeed Mabroukeh";

    //RedioButton of Search
    @FXML
    public RadioButton firstR;
    @FXML
    public RadioButton lastR;
    @FXML
    public RadioButton ssn;
    @FXML
    public RadioButton phone;
    @FXML
    public RadioButton doctor_idR;
    @FXML
    public RadioButton salary;
    @FXML
    public RadioButton DepartmentIDR;
    @FXML
    public RadioButton nurseR;
    @FXML
    public RadioButton sciectific;
    @FXML
    public RadioButton medic;

    //Doctor Add
    @FXML
    public TextField FirstN;
    @FXML
    public TextField LastN;
    @FXML
    public TextField emailS;
    @FXML
    public TextField ssns;
    @FXML
    public TextField phones;
    @FXML
    public TextField ID;
    @FXML
    public TextField salarys;
    @FXML
    public TextField DID;
    @FXML
    public DatePicker Date;

    //Doctor Edit
    @FXML
    public TextField FirstNE;
    @FXML
    public TextField lasteNE;
    @FXML
    public TextField EmailE;
    @FXML
    public TextField SSNE;
    @FXML
    public TextField PhoneE;
    @FXML
    public TextField IDE;
    @FXML
    public TextField salaryE;
    @FXML
    public TextField DIDE;
    @FXML
    public DatePicker DateE;

    //Delete Doctor
    @FXML
    public TextField firstDDelete;
    @FXML
    public TextField LastDDelete;
    @FXML
    public TextField EmailDDelete;
    @FXML
    public TextField SSNDDelete;
    @FXML
    public TextField PhoneDDelete;
    @FXML
    public TextField Doctor_IDDDelete;
    @FXML
    public TextField SalaryDDelete;
    @FXML
    public TextField DepartmentDDelete;
    @FXML
    public DatePicker DateDDelete;



    //Nurse Add
    @FXML
    public TextField firsteN;
    @FXML
    public TextField lasteN;
    @FXML
    public TextField emailN;
    @FXML
    public TextField ssnN;
    @FXML
    public TextField phoneN;
    @FXML
    public TextField nurseDN;
    @FXML
    public TextField salaryN;
    @FXML
    public TextField DIDN;
    @FXML
    public DatePicker DateN;

    //Nurse Edit
    @FXML
    public TextField fistNE;
    @FXML
    public TextField lastNE;
    @FXML
    public TextField emailNE;
    @FXML
    public TextField SSNNE;
    @FXML
    public TextField PhoneNE;
    @FXML
    public TextField Nurse_idNE;
    @FXML
    public TextField SalaryNE;
    @FXML
    public TextField Department_idNE;
    @FXML
    public DatePicker DateNE;


    ///Delete Nurse
    @FXML
    public TextField firstNDelete;
    @FXML
    public TextField LastNDelete;
    @FXML
    public TextField EmailNDelete;
    @FXML
    public TextField SSNNDelete;
    @FXML
    public TextField PhoneNDelete;
    @FXML
    public TextField NurseIDNDelete;
    @FXML
    public TextField SalaryNDelete;
    @FXML
    public TextField DepartmentIDNDelete;
    @FXML
    public DatePicker DateNDelete;




    //Patient Add
    @FXML
    public TextField firstP;
    @FXML
    public TextField lastP;
    @FXML
    public TextField PhoneP;
    @FXML
    public TextField ssnP;
    @FXML
    public TextField doctor_idP;
    @FXML
    public TextField nurse_idP;
    @FXML
    public TextField Sciectific_N;
    @FXML
    public TextField medic_id;
    @FXML
    public DatePicker DateP;



    ///Edit Patient
    @FXML
    public TextField firstPE;
    @FXML
    public TextField lastPE;
    @FXML
    public TextField PhonePE;
    @FXML
    public TextField SSNPE;
    @FXML
    public TextField Doctor_idPE;
    @FXML
    public TextField Nurse_idPE;
    @FXML
    public TextField Sciectific_NPE;
    @FXML
    public TextField Medic_idPE;
    @FXML
    public DatePicker DatePE;

    ///Delete Patient
    @FXML
    public TextField FirstPDelete;
    @FXML
    public TextField LastPDelete;
    @FXML
    public TextField PhonePDelete;
    @FXML
    public TextField SSNPDelete;
    @FXML
    public TextField Doctor_IDPDelete;
    @FXML
    public TextField Nurse_IDPDelete;
    @FXML
    public TextField Sciectific_NPDelete;
    @FXML
    public TextField Medic_IDPDelete;
    @FXML
    public DatePicker DatePDelete;




    //Add Department
    @FXML
    public TextField Departe_name;
    @FXML
    public TextField Departe_ID;



    //Edit Department
    @FXML
    public TextField DepartNE;
    @FXML
    public TextField Depart_IDE;

    ///Delete Department
    @FXML
    public TextField Depart_NameDelete;
    @FXML
    public TextField Depart_IDDelete;



    //Add Medicement
    @FXML
    public TextField medic_name;
    @FXML
    public TextField medic_idD;
    @FXML
    public TextField price;


    //Edit Medicament
    @FXML
    public TextField Medic_NameM;
    @FXML
    public TextField Medic_IDM;
    @FXML
    public TextField priceM;

    //Delete Medicament
    @FXML
    public TextField Medic_NameD;
    @FXML
    public TextField Medic_IDD;
    @FXML
    public TextField PriceD;


    //Add Disease
    @FXML
    public TextField Scientific_name;
    @FXML
    public TextField Common_Name;


    //Edit Disease
    @FXML
    public TextField SciectificE;
    @FXML
    public TextField CommonE;

    ///Delete Disease
    @FXML
    public TextField Sciectific_NDelete;
    @FXML
    public TextField Common_NameDe;


    //Text Search Doctor
    public TextField textSD;
    public TextArea texta;


    private String Forget = "1";

    final ToggleGroup group = new ToggleGroup();



    public void searchD(MouseEvent mouseEvent) {
        firstR.setToggleGroup(group);
        lastR.setToggleGroup(group);
        ssn.setToggleGroup(group);
        phone.setToggleGroup(group);
        doctor_idR.setToggleGroup(group);
        salary.setToggleGroup(group);
        DepartmentIDR.setToggleGroup(group);

    }
    public void searchN(MouseEvent mouseEvent) {
        firstR.setToggleGroup(group);
        lastR.setToggleGroup(group);
        ssn.setToggleGroup(group);
        phone.setToggleGroup(group);
        nurseR.setToggleGroup(group);
        salary.setToggleGroup(group);
        DepartmentIDR.setToggleGroup(group);

    }
    public void searchP(MouseEvent mouseEvent) {
        firstR.setToggleGroup(group);
        lastR.setToggleGroup(group);
        ssn.setToggleGroup(group);
        phone.setToggleGroup(group);
        nurseR.setToggleGroup(group);
        sciectific.setToggleGroup(group);
        medic.setToggleGroup(group);
        doctor_idR.setToggleGroup(group);

    }

    public void GrupeM(MouseEvent mouseEvent) {
        Male.setToggleGroup(group);
        Female.setToggleGroup(group);
    }
    public void GrupeU(MouseEvent mouseEvent)
    {
        Male.setToggleGroup(group);
    }

    public void GrupeS(MouseEvent mouseEvent) {
        RDoctor.setToggleGroup(group);
        RNurse.setToggleGroup(group);
        RPatient.setToggleGroup(group);

            }

    public void buttonD(MouseEvent mouseEvent) throws IOException {

        if (User.getText().equals("Wajeed Mabroukeh") || User.getText().equals("1")) {

            if (Passw.getText().equals(Forget)) {
                Name = User.getText().toString();
                Stage primaryStage = new Stage();
                Window1 = primaryStage;
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Doctor.fxml"));
                primaryStage.setTitle("Management");
                primaryStage.setScene(new Scene(root, 761, 455));
                primaryStage.show();
                User.setText("");
                Passw.setText("");
                ProjectDo.Window.close();

            } else {
                JOptionPane.showMessageDialog(null, "Input Error (Check the Username or Password)", "Wrong Message", JOptionPane.WARNING_MESSAGE);
            }
        }
            else if(User.getText().equals("2"))
            {
                Name = User.getText().toString();
                Stage primaryStage = new Stage();
                Window1 = primaryStage;
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Nurse.fxml"));
                primaryStage.setTitle("Management");
                primaryStage.setScene(new Scene(root, 603, 338));
                primaryStage.show();
                User.setText("");
                Passw.setText("");
                ProjectDo.Window.close();



            }

         else {
            JOptionPane.showMessageDialog(null, "Input Error (Check the Username or Password)", "Wrong Message", JOptionPane.WARNING_MESSAGE);
        }


    }

    public void LabelF(MouseEvent mouseEvent) {
        String Number = JOptionPane.showInputDialog("Please Write Your Phone");
        if (Number.equals("0595561279")) {
            String Password = JOptionPane.showInputDialog("Please Write New Password");
            Forget = Password;
        } else {
            JOptionPane.showMessageDialog(null, "Your phone number is wrong ", "Wrong Message", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void ControlD(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Doctor\n" + "2.Edit Doctor\n" + "3.Delete Doctor");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {

                primaryStageDS = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Doctor.fxml"));
                primaryStageDS.setTitle("Sign up Doctor");
                primaryStageDS.setScene(new Scene(root, 772, 412));
                primaryStageDS.show();

            } else if (Resulte == 2) {
             JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");

                  primaryStageDE = new Stage();
                  Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Doctor .fxml"));
                  primaryStageDE.setTitle("Edit Doctor");
                  primaryStageDE.setScene(new Scene(root, 772, 402));
                  primaryStageDE.show();


            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");
                    primaryStageDDelete = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Doctor.fxml"));
                    primaryStageDDelete.setTitle("Delete Doctor");
                    primaryStageDDelete.setScene(new Scene(root, 772, 418));
                    primaryStageDDelete.show();

            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void ControlN(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Nurse\n" + "2.Edit Nurse\n" + "3.Delete Nurse");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {

                primaryStageNS = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Nurse.fxml"));
                primaryStageNS.setTitle("Signup Nurse");
                primaryStageNS.setScene(new Scene(root, 772, 395));
                primaryStageNS.show();


            }
            else if (Resulte == 2) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");
                    primaryStageNE = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Nurse.fxml"));
                    primaryStageNE.setTitle("Edit Nurse");
                    primaryStageNE.setScene(new Scene(root, 772, 400));
                    primaryStageNE.show();

            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");
                    primaryStageDNDelete = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Nurse .fxml"));
                    primaryStageDNDelete.setTitle("Delete Nurse");
                    primaryStageDNDelete.setScene(new Scene(root, 772, 420));
                    primaryStageDNDelete.show();

            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void ControlP(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Patient\n" + "2.Edit Patient\n" + "3.Delete Patient");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {
                primaryStagePS = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Patient.fxml"));
                primaryStagePS.setTitle("Signup Patient");
                primaryStagePS.setScene(new Scene(root, 772, 390));
                primaryStagePS.show();


            } else if (Resulte == 2) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");
                    Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Patient.fxml"));
                    primaryStage.setTitle("Edit Patient");
                    primaryStage.setScene(new Scene(root, 772, 390));
                    primaryStage.show();

            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield SSN");

                    primaryStagePDElete = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Patient.fxml"));
                    primaryStagePDElete.setTitle("Delete Patient");
                    primaryStagePDElete.setScene(new Scene(root, 772, 445));
                    primaryStagePDElete.show();

            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void ControlMedic(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Medicament\n" + "2.Edit Medicament\n" + "3.Delete Medicament");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {

                primaryStageMS = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Medicament.fxml"));
                primaryStageMS.setTitle("Signup Medicament");
                primaryStageMS.setScene(new Scene(root, 754, 411));
                primaryStageMS.show();


            } else if (Resulte == 2) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Medic_ID");
                primaryStageME = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Medicament.fxml"));
                primaryStageME.setTitle("Edit Medicament");
                primaryStageME.setScene(new Scene(root, 754, 411));
                primaryStageME.show();


            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Medic_ID");
                primaryStageDM = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Medicament.fxml"));
                primaryStageDM.setTitle("Delete Medicament");
                primaryStageDM.setScene(new Scene(root, 735, 386));
                primaryStageDM.show();
            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void ControlDe(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Department\n" + "2.Edit Department\n" + "3.Delete Department");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {

                primaryStageDES = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Department.fxml"));
                primaryStageDES.setTitle("Signup Department");
                primaryStageDES.setScene(new Scene(root, 754, 322));
                primaryStageDES.show();


            } else if (Resulte == 2) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Depart_ID");
                primaryStageDDE = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Department.fxml"));
                primaryStageDDE.setTitle("Edit Department");
                primaryStageDDE.setScene(new Scene(root, 754, 304));
                primaryStageDDE.show();


            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Depart_ID");
                primaryStageDDDelete = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Department.fxml"));
                primaryStageDDDelete.setTitle("Delete Department");
                primaryStageDDDelete.setScene(new Scene(root, 754, 329));
                primaryStageDDDelete.show();
            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void ControlDis(MouseEvent mouseEvent) {
        try {
            String Choose = JOptionPane.showInputDialog("Please choose from the following:" + "\n" + "1.Insert Disease\n" + "2.Edit Disease\n" + "3.Delete Disease");
            int Resulte = Integer.parseInt(Choose);
            if (Resulte == 1) {

                primaryStageDIS = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Signup Disease.fxml"));
                primaryStageDIS.setTitle("Signup Disease");
                primaryStageDIS.setScene(new Scene(root, 708, 385));
                primaryStageDIS.show();


            } else if (Resulte == 2) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Scientific");
                primaryStageDIE = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Edit Disease.fxml"));
                primaryStageDIE.setTitle("Edit Disease");
                primaryStageDIE.setScene(new Scene(root, 708, 385));
                primaryStageDIE.show();


            } else if (Resulte == 3) {
                JOptionPane.showMessageDialog(null,"please enter your Social Security Number in Textfield Scientific");
                primaryStageDDI = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Fxml/Delete Disease.fxml"));
                primaryStageDDI.setTitle("Delete Disease");
                primaryStageDDI.setScene(new Scene(root, 708, 335));
                primaryStageDDI.show();
            } else {
                JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please Chooes between 1,2,3");
            }

        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }


    }

    public void My_Profile(javafx.event.ActionEvent actionEvent) throws IOException {

        Stage primaryStage = new Stage();
        Parent root;
        primaryStage.setTitle("My Profile");
        root = FXMLLoader.load(getClass().getResource("Fxml/Manager Doctor.fxml"));
        primaryStage.setScene(new Scene(root, 772, 368));
        primaryStage.show();


    }

    public void My_ProfileN(MouseEvent mouseEvent) throws IOException {
        Stage primaryStage = new Stage();
        Parent root;
        primaryStage.setTitle("My Profile");
        root = FXMLLoader.load(getClass().getResource("Fxml/Manager Nurse.fxml"));
        primaryStage.setScene(new Scene(root, 772, 368));
        primaryStage.show();
    }

    public void Quite(javafx.event.ActionEvent actionEvent) throws IOException {
        Window1.close();
        ProjectDo.Window.show();

    }

    public void Search(MouseEvent mouseEvent) throws IOException {
        primaryStageS = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Fxml/Search.fxml"));
        primaryStageS.setTitle("Search");
        primaryStageS.setScene(new Scene(root, 565, 313));
        primaryStageS.show();

    }

    public void Searchi(MouseEvent mouseEvent) throws IOException {
        if (RDoctor.isSelected())
        {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Fxml/SearchD.fxml"));
            primaryStage.setTitle("Search Doctor");
            primaryStage.setScene(new Scene(root, 877, 459));
            primaryStage.show();
            primaryStageS.close();

        }
        else if(RNurse.isSelected())
        {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Fxml/SearchN.fxml"));
            primaryStage.setTitle("Search Nurse");
            primaryStage.setScene(new Scene(root, 877, 459));
            primaryStage.show();
            primaryStageS.close();

        }
        else if(RPatient.isSelected())
        {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Fxml/SearchP.fxml"));
            primaryStage.setTitle("Search Patient");
            primaryStage.setScene(new Scene(root, 877, 459));
            primaryStage.show();
            primaryStageS.close();

        }
    }

    public void Exit(MouseEvent mouseEvent)
    {
        System.exit(0);
    }

    public  void ButtonSearchD(ActionEvent actionEvent) throws IOException {
        First_NameD.setCellValueFactory(new PropertyValueFactory<Table, String>("First_NameD"));
        Last_NameD.setCellValueFactory(new PropertyValueFactory<Table, String>("Last_NameD"));
        EmailD.setCellValueFactory(new PropertyValueFactory<Table, String>("EmailD"));
        SSND.setCellValueFactory(new PropertyValueFactory<Table, Integer>("SSND"));
        PhoneD.setCellValueFactory(new PropertyValueFactory<Table, Integer>("PhoneD"));
        Doctor_idD.setCellValueFactory(new PropertyValueFactory<Table, Integer>("Doctor_idD"));
        Department_IDD.setCellValueFactory(new PropertyValueFactory<Table, Integer>("Department_IDD"));
        BirthDateD.setCellValueFactory(new PropertyValueFactory<Table, String>("BirthDateD"));

        if (firstR.isSelected()) {
            //Doctor Getter By First_Name
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.First_Name = textSD.getText();
            Doctor doctor = HosbitalRepository.GetDoctorF(doctorFilter);

            Table table = new Table(doctor.First_Name,doctor.Last_Name , doctor.Email, doctor.SSN, doctor.Phone,
                    doctor.Doctor_id, doctor.Salary, doctor.Department_ID, doctor.BirthDate);
            texta.appendText(table.toString());
            //ObservableList<Table> observableList = FXCollections.observableArrayList(new Table(" d", "rfg",
                   // "efe", 12, 5, 8, 14, 145, doctor.BirthDate));

            //tableview.setItems(observableList);
            //tableview.getItems().add(table.toString());

        }
        else if (lastR.isSelected()) {
            //Doctor Getter By First_Name
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.Last_Name = textSD.getText();
            Doctor doctor = HosbitalRepository.GetDoctorL(doctorFilter);

            Table table = new Table(doctor.First_Name,doctor.Last_Name , doctor.Email, doctor.SSN, doctor.Phone,
                    doctor.Doctor_id, doctor.Salary, doctor.Department_ID, doctor.BirthDate);

            //ObservableList<Table> observableList = FXCollections.observableArrayList(new Table(" d", "rfg",
            // "efe", 12, 5, 8, 14, 145, doctor.BirthDate));
            texta.appendText(table.toString());
            //tableview.setItems(observableList);
            //tableview.getItems().add(table);

        }
        else if (ssn.isSelected()) {
            //Doctor Getter By First_Name
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.SSN = Integer.parseInt(textSD.getText());
            Doctor doctor = HosbitalRepository.GetDoctor(doctorFilter);

            Table table = new Table(doctor.First_Name,doctor.Last_Name , doctor.Email, doctor.SSN, doctor.Phone,
                    doctor.Doctor_id, doctor.Salary, doctor.Department_ID, doctor.BirthDate);

            //ObservableList<Table> observableList = FXCollections.observableArrayList(new Table(" d", "rfg",
            // "efe", 12, 5, 8, 14, 145, doctor.BirthDate));
           // tableview = new TableView((ObservableList) table);

                texta.appendText(table.toString());


            //tableview.setItems(observableList);
            //tableview.getItems().add(table);

        }
        else if (phone.isSelected()) {
            //Doctor Getter By First_Name
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.Phone = Integer.parseInt(textSD.getText());
            Doctor doctor = HosbitalRepository.GetDoctorP(doctorFilter);

            Table table = new Table(doctor.First_Name,doctor.Last_Name , doctor.Email, doctor.SSN, doctor.Phone,
                    doctor.Doctor_id, doctor.Salary, doctor.Department_ID, doctor.BirthDate);

            //ObservableList<Table> observableList = FXCollections.observableArrayList(new Table(" d", "rfg",
            // "efe", 12, 5, 8, 14, 145, doctor.BirthDate));
            // tableview = new TableView((ObservableList) table);

            texta.appendText(table.toString());


            //tableview.setItems(observableList);
            //tableview.getItems().add(table);

        }
    }

    public void Web(MouseEvent mouseEvent) throws IOException, URISyntaxException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("https://www.google.com/search?q=hospital&oq=hostpita&aqs=chrome..69i57j0j46j0l5.7191j0j7&sourceid=chrome&ie=UTF-8&sxsrf=ALeKk00S9fFN0wrKK5OwyTH87DX7DQMIAg:1588628299686&npsic=0&rflfq=1&rlha=0&rllag=32229894,35250351,1114&tbm=lcl&rldimm=12657561319986476775&lqi=Cghob3NwaXRhbFoUCghob3NwaXRhbCIIaG9zcGl0YWw&ved=2ahUKEwiYle7LlZvpAhXCnFwKHRpNAeoQvS4wAHoECA0QIA&rldoc=1&tbs=lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rlst=f#rlfi=hd:;si:12657561319986476775,l,Cghob3NwaXRhbFoUCghob3NwaXRhbCIIaG9zcGl0YWw;mv:[[32.4993295,35.893600299999996],[31.738688999999997,34.727407]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2"));

    }

    public void About(MouseEvent mouseEvent) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Fxml/About.fxml"));
        primaryStage.setTitle("About");
        primaryStage.setScene(new Scene(root, 670, 452));
        primaryStage.show();

    }

    public void Enter(KeyEvent ke) throws IOException {
        if (ke.getCode().equals(KeyCode.ENTER))
        {
            if (User.getText().equals("Wajeed Mabroukeh") || User.getText().equals("1")) {

                if (Passw.getText().equals(Forget)) {
                    Name = User.getText().toString();
                    Stage primaryStage = new Stage();
                    Window1 = primaryStage;
                    Parent root = FXMLLoader.load(getClass().getResource("Fxml/Doctor.fxml"));
                    primaryStage.setTitle("Management");
                    primaryStage.setScene(new Scene(root, 761, 455));
                    primaryStage.show();
                    User.setText("");
                    Passw.setText("");
                    ProjectDo.Window.close();

                } else {
                    JOptionPane.showMessageDialog(null, "Input Error (Check the Username or Password)", "Wrong Message", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Input Error (Check the Username or Password)", "Wrong Message", JOptionPane.WARNING_MESSAGE);
            }

        }


    }


     ///Doctor
    public void SaveD(MouseEvent mouseEvent)
    {
        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
     try {
            HosbitalRepository.InsertDoctor(new Doctor(
            FirstN.getText(), LastN.getText(),
            emailS.getText(), Integer.parseInt(ssns.getText()), Integer.parseInt(phones.getText()), Integer.parseInt(ID.getText()),
            Double.parseDouble(salarys.getText()), Integer.parseInt(DID.getText()), Date.getValue(), sex));
}
     catch (Exception e ) {
         JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

     }

    }
    public void ViewD(MouseEvent mouseEvent)
    {
        try {
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.SSN = Integer.parseInt(SSNE.getText());
            Doctor doctor = HosbitalRepository.GetDoctor(doctorFilter);

            FirstNE.setText(doctor.First_Name);
            lasteNE.setText(doctor.Last_Name);
            EmailE.setText(doctor.Email);
            SSNE.setText(doctor.SSN + "");
            SSNE.setEditable(false);
            PhoneE.setText(doctor.Phone + "");
            IDE.setText(doctor.Doctor_id + "");
            salaryE.setText(doctor.Salary + "");
            DIDE.setText(doctor.Department_ID + "");
            DateE.setValue(doctor.BirthDate);
            if (doctor.Sex.equals("Male")) {
                Male.setSelected(true);
            } else if (doctor.Sex.equals("Female")) {
                Female.setSelected(true);
            }
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageDE.close();

        }

    }
    public void UpdateD(MouseEvent mouseEvent)
    {

        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
        try {
            HosbitalRepository.UpdatetDoctor(new Doctor(
                    FirstNE.getText(), lasteNE.getText(),
                    EmailE.getText(), Integer.parseInt(SSNE.getText()), Integer.parseInt(PhoneE.getText()),
                    Integer.parseInt(IDE.getText()),
                    Double.parseDouble(salaryE.getText()), Integer.parseInt(DIDE.getText()), DateE.getValue(), sex));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void DeleteD(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeleteDoctor(Integer.parseInt(SSNDDelete.getText()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewDDelete(MouseEvent mouseEvent)
    {
        try {
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.SSN = Integer.parseInt(SSNDDelete.getText());
            Doctor doctor = HosbitalRepository.GetDoctor(doctorFilter);

            firstDDelete.setText(doctor.First_Name);
            LastDDelete.setText(doctor.Last_Name);
            EmailDDelete.setText(doctor.Email);
            SSNDDelete.setText(doctor.SSN + "");
            PhoneDDelete.setText(doctor.Phone + "");
            Doctor_IDDDelete.setText(doctor.Doctor_id + "");
            SalaryDDelete.setText(doctor.Salary + "");
            DepartmentDDelete.setText(doctor.Department_ID + "");
            DateDDelete.setValue(doctor.BirthDate);

            firstDDelete.setEditable(false);
            LastDDelete.setEditable(false);
            EmailDDelete.setEditable(false);
            SSNDDelete.setEditable(false);
            PhoneDDelete.setEditable(false);
            Doctor_IDDDelete.setEditable(false);
            SalaryDDelete.setEditable(false);
            DepartmentDDelete.setEditable(false);
            DateDDelete.setEditable(false);

            if (doctor.Sex.equals("Male")) {
                Male.setSelected(true);
                Female.isDisabled();
            } else if (doctor.Sex.equals("Female")) {
                Female.setSelected(true);
                Male.isDisabled();
            }
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            primaryStageDDelete.close();
        }

    }



    ////Nurse
    public void SaveN(MouseEvent mouseEvent)
    {
        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select between Male or Female");
        }
        try {
            HosbitalRepository.InsertNurse(new Nurse(
                    firsteN.getText(), lasteN.getText(),
                    emailN.getText(), Integer.parseInt(ssnN.getText()), Integer.parseInt(phoneN.getText()), Integer.parseInt(nurseDN.getText()),
                    Double.parseDouble(salaryN.getText()), Integer.parseInt(DIDN.getText()), DateN.getValue(), sex));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }
    }
    public void UpdateN(MouseEvent mouseEvent)
    {

        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
        try {
            HosbitalRepository.UpdatetNurse(new Nurse(
                    fistNE.getText(), lastNE.getText(),
                    emailNE.getText(), Integer.parseInt(SSNNE.getText()), Integer.parseInt(PhoneNE.getText()),
                    Integer.parseInt(Nurse_idNE.getText()),
                    Double.parseDouble(SalaryNE.getText()), Integer.parseInt(Department_idNE.getText()), DateNE.getValue(), sex));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewN(MouseEvent mouseEvent)
    {
        try {
            NurseFilter nurseFilter = new NurseFilter();
            nurseFilter.SSN = Integer.parseInt(SSNNE.getText());
            Nurse nurse = HosbitalRepository.GetNurse(nurseFilter);

            fistNE.setText(nurse.getFirst_Name());
            lastNE.setText(nurse.getLast_Name());
            emailNE.setText(nurse.getEmail());
            SSNNE.setText(nurse.getSSN() + "");
            PhoneNE.setText(nurse.getPhone() + "");
            Nurse_idNE.setText(nurse.getNurse_id() + "");
            SalaryNE.setText(nurse.getSalary() + "");
            Department_idNE.setText(nurse.getDepartment_ID() + "");
            DateNE.setValue(nurse.getBirthDate());
            SSNNE.setEditable(false);


            if (nurse.getSex().equals("Male")) {
                Male.setSelected(true);
            } else if (nurse.getSex().equals("Female")) {
                Female.setSelected(true);
            }
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageNE.close();

        }

    }
    public void DeleteN(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeleteNurse(Integer.parseInt(SSNNDelete.getText()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewNDelete(MouseEvent mouseEvent)
    {
        try {
            NurseFilter nurseFilter = new NurseFilter();
            nurseFilter.SSN = Integer.parseInt(SSNNDelete.getText());
            Nurse nurse = HosbitalRepository.GetNurse(nurseFilter);

            firstNDelete.setText(nurse.getFirst_Name());
            LastNDelete.setText(nurse.getLast_Name());
            EmailNDelete.setText(nurse.getEmail());
            SSNNDelete.setText(nurse.getSSN() + "");
            PhoneNDelete.setText(nurse.getPhone() + "");
            NurseIDNDelete.setText(nurse.getNurse_id() + "");
            SalaryNDelete.setText(nurse.getSalary() + "");
            DepartmentIDNDelete.setText(nurse.getDepartment_ID() + "");
            DateNDelete.setValue(nurse.getBirthDate());


            firstNDelete.setEditable(false);
            LastNDelete.setEditable(false);
            EmailNDelete.setEditable(false);
            SSNNDelete.setEditable(false);
            PhoneNDelete.setEditable(false);
            NurseIDNDelete.setEditable(false);
            SalaryNDelete.setEditable(false);
            DepartmentIDNDelete.setEditable(false);
            DateNDelete.setEditable(false);

            if (nurse.getSex().equals("Male")) {
                Male.setSelected(true);
            } else if (nurse.getSex().equals("Female")) {
                Female.setSelected(true);
            }
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            primaryStageDNDelete.close();
        }

    }



    //Patient
    public void SaveP(MouseEvent mouseEvent)
    {
        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select between Male or Female");
        }
        try {
            //Doctor Getter
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.Doctor_id = Integer.parseInt(doctor_idP.getText());
            Doctor doctor = HosbitalRepository.GetDoctorI(doctorFilter);

            ///Nurse Getter
            NurseFilter nurseFilter = new NurseFilter();
            nurseFilter.Nurse_Id = Integer.parseInt(nurse_idP.getText());
            Nurse nurse = HosbitalRepository.GetNurseI(nurseFilter);

            HosbitalRepository.InsertPatient(new Patient(
                    firstP.getText(), lastP.getText(),
                     Integer.parseInt(PhoneP.getText()), Integer.parseInt(ssnP.getText()),Integer.parseInt(doctor_idP.getText()),
                    Integer.parseInt(nurse_idP.getText()), Sciectific_N.getText() ,Integer.parseInt(medic_id.getText()),
                    DateP.getValue(), sex ,nurse.getSSN(),nurse.getPhone(),
                    doctor.SSN,doctor.Phone));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }
    }
    public void UpdateP(MouseEvent mouseEvent)
    {

        String sex ="";
        if(Male.isSelected())
        {
            sex="Male";
        }
        else if(Female.isSelected())
        {
            sex="Female";
        }
        try {
            //Doctor Getter
            DoctorFilter doctorFilter = new DoctorFilter();
            doctorFilter.Doctor_id = Integer.parseInt(Doctor_idPE.getText());
            Doctor doctor = HosbitalRepository.GetDoctorI(doctorFilter);

            ///Nurse Getter
            NurseFilter nurseFilter = new NurseFilter();
            nurseFilter.Nurse_Id = Integer.parseInt(Nurse_idPE.getText());
            Nurse nurse = HosbitalRepository.GetNurseI(nurseFilter);

            HosbitalRepository.UpdatetPatient(new Patient(
                    firstPE.getText(), lastPE.getText(),
                    Integer.parseInt(PhonePE.getText()), Integer.parseInt(SSNPE.getText()),Integer.parseInt(Doctor_idPE.getText()),
                    Integer.parseInt(Nurse_idPE.getText()), Sciectific_NPE.getText() ,Integer.parseInt(Medic_idPE.getText()),
                    DatePE.getValue(), sex ,nurse.getSSN(),nurse.getPhone(),
                    doctor.SSN,doctor.Phone));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewP(MouseEvent mouseEvent)
    {
        try{
        PatientFilter patientFilter = new PatientFilter();
        patientFilter.SSN = Integer.parseInt(SSNPE.getText());
        Patient patient = HosbitalRepository.GetPatient(patientFilter);

        firstPE.setText(patient.First_Name);
        lastPE.setText(patient.Last_Name);
        PhonePE.setText(patient.Phone +"");
        SSNPE.setText(patient.SSN + "");
        SSNPE.setEditable(false);
        Doctor_idPE.setText(patient.doctor_id +"");
        Nurse_idPE.setText(patient.Nurse_id+"");
        Sciectific_NPE.setText(patient.sciectific +"");
        Medic_idPE.setText(patient.Medic_id +"");
        DatePE.setValue(patient.BirthDate);

        if(patient.Sex.equals("Male"))
        {
            Male.setSelected(true);
        }
        else if(patient.Sex.equals("Female"))
        {
            Female.setSelected(true);
        }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
        }

    }
    public void DeleteP(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeletePatient(Integer.parseInt(SSNPDelete.getText()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewPDelete(MouseEvent mouseEvent)
    {
        try {
            PatientFilter patientFilter = new PatientFilter();
            patientFilter.SSN = Integer.parseInt(SSNPDelete.getText());
            Patient patient = HosbitalRepository.GetPatient(patientFilter);

            FirstPDelete.setText(patient.First_Name);
            LastPDelete.setText(patient.Last_Name);
            PhonePDelete.setText(patient.Phone +"");
            SSNPDelete.setText(patient.SSN + "");
            Doctor_IDPDelete.setText(patient.doctor_id +"");
            Nurse_IDPDelete.setText(patient.Nurse_id+"");
            Sciectific_NPDelete.setText(patient.sciectific +"");
            Medic_IDPDelete.setText(patient.Medic_id +"");
            DatePDelete.setValue(patient.BirthDate);

            FirstPDelete.setEditable(false);
            LastPDelete.setEditable(false);
            PhonePDelete.setEditable(false);
            SSNPDelete.setEditable(false);
            Doctor_IDPDelete.setEditable(false);
            Nurse_IDPDelete.setEditable(false);
            Sciectific_NPDelete.setEditable(false);
            Medic_IDPDelete.setEditable(false);
            DatePDelete.setEditable(false);

            if(patient.Sex.equals("Male"))
            {
                Male.setSelected(true);
            }
            else if(patient.Sex.equals("Female"))
            {
                Female.setSelected(true);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            primaryStagePDElete.close();
        }
    }



    ///Department
     public void saveDEpartment(MouseEvent mouseEvent)
    {
        try {
         HosbitalRepository.InsertDepartment(new Department( Integer.parseInt(Departe_ID.getText()) , Departe_name.getText()));

        }
          catch (Exception e ) {
               JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }
    }
    public void UpdateDDE(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.UpdatetDepartment(new Department(
                   Integer.parseInt(Depart_IDE.getText().trim()), DepartNE.getText().trim()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewDDE(MouseEvent mouseEvent)
    {
        try{
            DepartemntFilter departemntFilter = new DepartemntFilter();
            departemntFilter.DEPART_ID = Integer.parseInt(Depart_IDE.getText().trim());
            Department  department = HosbitalRepository.GetDepartment(departemntFilter);

            Depart_IDE.setText(department.DEPART_ID +"");
            DepartNE.setText(department.DEPART_NAME);
            Depart_IDE.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageDDE.close();
        }

    }
    public void DeleteDE(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeleteDepartment(Integer.parseInt(Depart_IDDelete.getText()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewDDDelete(MouseEvent mouseEvent)
    {
        try{
            DepartemntFilter departemntFilter = new DepartemntFilter();
            departemntFilter.DEPART_ID = Integer.parseInt(Depart_IDDelete.getText().trim());
            Department  department = HosbitalRepository.GetDepartment(departemntFilter);

            Depart_IDDelete.setText(department.DEPART_ID +"");
            Depart_NameDelete.setText(department.DEPART_NAME);
            Depart_NameDelete.setEditable(false);
            Depart_IDDelete.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageDDDelete.close();
        }
    }




    ///Medicement
    public void saveMedicement(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.InsertMedicement(new Medicement( Integer.parseInt(medic_idD.getText()) , medic_name.getText(),Integer.parseInt(price.getText())));

        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }
    }
    public void UpdateM(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.UpdatetMedicement(new Medicement(
                    Integer.parseInt(Medic_IDM.getText().trim()), Medic_NameM.getText().trim(),Integer.parseInt(priceM.getText().trim())));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewM(MouseEvent mouseEvent)
    {
        try{
            MedicementFilter medicementFilter = new MedicementFilter();
            medicementFilter.MEDIC_ID = Integer.parseInt(Medic_IDM.getText().trim());
            Medicement   medicement = HosbitalRepository.GetMedicement(medicementFilter);

            Medic_NameM.setText(medicement.MEDIC_NAME +"");
            Medic_IDM.setText(medicement.MEDIC_ID +"");
            priceM.setText(medicement.PRICE +"");
            Medic_IDM.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageME.close();
        }

    }
    public void DeleteM(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeleteMedicement(Integer.parseInt(Medic_IDD.getText()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewMDelete(MouseEvent mouseEvent)
    {
        try{
            MedicementFilter medicementFilter = new MedicementFilter();
            medicementFilter.MEDIC_ID = Integer.parseInt(Medic_IDD.getText().trim());
            Medicement   medicement = HosbitalRepository.GetMedicement(medicementFilter);

            Medic_NameD.setText(medicement.MEDIC_NAME +"");
            Medic_IDD.setText(medicement.MEDIC_ID +"");
            PriceD.setText(medicement.PRICE +"");

            Medic_NameD.setEditable(false);
            Medic_IDD.setEditable(false);
            PriceD.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
            GUI.primaryStageDM.close();
        }

    }




    ///Disease
    public void saveDisease(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.InsertDisease(new Disease( Scientific_name.getText() , Common_Name.getText()));

        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }
    }
    public void UpdateDI(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.UpdatetDisease(new Disease(
                    SciectificE.getText().trim(), CommonE.getText().trim()));
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewDI(MouseEvent mouseEvent)
    {
        try{
            DiseaseFilter diseaseFilter = new DiseaseFilter();
            diseaseFilter.scientific = SciectificE.getText().trim();
            Disease  Disease = HosbitalRepository.GetDisease(diseaseFilter);

                SciectificE.setText(Disease.Sciectific_Name);
                CommonE.setText(Disease.Common_Name);
                SciectificE.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
             GUI.primaryStageDIE.close();
        }

    }
    public void DeleteDDI(MouseEvent mouseEvent)
    {
        try {
            HosbitalRepository.DeleteDisease(Sciectific_NDelete.getText());
        }
        catch (Exception e ) {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");

        }

    }
    public void ViewDIDelete(MouseEvent mouseEvent)
    {
        try{
            DiseaseFilter diseaseFilter = new DiseaseFilter();
            diseaseFilter.scientific = Sciectific_NDelete.getText().trim();
            Disease  Disease = HosbitalRepository.GetDisease(diseaseFilter);

            Sciectific_NDelete.setText(Disease.Sciectific_Name);
            Common_NameDe.setText(Disease.Common_Name);

            Sciectific_NDelete.setEditable(false);
            Common_NameDe.setEditable(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The entry you entered is wrong,Please try agian");
           GUI.primaryStageDDI.close();
        }


    }



}
