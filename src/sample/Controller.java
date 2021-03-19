package sample;

import java.awt.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.control.TablePosition;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ContextMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.scene.control.Tooltip;

public class Controller
{
    @FXML
    private ContextMenu menu_ite;

    @FXML
    private MenuItem Item1;

    @FXML
    private MenuItem Item2;
    @FXML
    private Button deleteBut;
    @FXML
    private TextArea take_delete;;

    @FXML
    private Pane adding_pane;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane main;

    @FXML
    private Pane left_column;

    @FXML
    private Button delete;

    @FXML
    private Button add;

    @FXML
    private Button list;

    @FXML
    private Label Home_heal;

    @FXML
    private Button virus;

    @FXML
    private Button body;

    @FXML
    private Button teeth;

    @FXML
    private Button stomach;

    @FXML
    private Button exit;

    @FXML
    private Button Head;

    @FXML
    private AnchorPane right_column;

    @FXML
    private Pane all_heal_pane;

    @FXML
    private Label all_heals_labels;

    @FXML
    private TableView<Heal> all_table;

    @FXML
    private TableColumn<Heal, String> stomach_table_name1;

    @FXML
    private TableColumn<Heal, String> stomach_table_vid1;

    @FXML
    private TableColumn<Heal, String> stomach_table_simp1;

    @FXML
    private TableColumn<Heal, String> stomach_table_instr1;

    @FXML
    private TableColumn<Heal, String> stomach_table_nalich1;

    @FXML
    private Pane main_pane;

    @FXML
    private Label main_label;

    @FXML
    private Label main_label1;

    @FXML
    private Label main_label11;

    @FXML
    private Label main_label111;

    @FXML
    private Label main_label1111;

    @FXML
    private Pane head_pane;

    @FXML
    private Label head_label;

    @FXML
    private Button head_find;

    @FXML
    private TableView<Heal> head_table;

    @FXML
    private TableColumn<Heal,String> head_table_name;

    @FXML
    private TableColumn<Heal,String> head_table_vid;

    @FXML
    private TableColumn<Heal,String> head_table_simp;

    @FXML
    private TableColumn<Heal,String> head_table_instr;

    @FXML
    private TableColumn<Heal,String> head_table_nalich;

    @FXML
    private ComboBox head_combo_box;

    @FXML
    private Pane body_pane;

    @FXML
    private ComboBox body_combo_box;

    @FXML
    private TableView<Heal> body_table;

    @FXML
    private TableColumn<Heal, String> body_table_name;

    @FXML
    private TableColumn<Heal, String> body_table_vid;

    @FXML
    private TableColumn<Heal, String> body_table_simp;

    @FXML
    private TableColumn<Heal, String> body_table_instr;

    @FXML
    private TableColumn<Heal, String> body_table_nalich;

    @FXML
    private Button body_find;

    @FXML
    private Label body_label;

    @FXML
    private Pane stomach_pane;

    @FXML
    private Label stomach_label;

    @FXML
    private TableView<Heal> stomach_table;

    @FXML
    private TableColumn<Heal, String> stomach_table_name;

    @FXML
    private TableColumn<Heal, String> stomach_table_vid;

    @FXML
    private TableColumn<Heal, String> stomach_table_simp;

    @FXML
    private TableColumn<Heal, String> stomach_table_instr;

    @FXML
    private TableColumn<Heal, String> stomach_table_nalich;

    @FXML
    private Button stomach_find;

    @FXML
    private ComboBox stomach_combo_box;

    @FXML
    private Pane teeth_pane;

    @FXML
    private TableView<Heal> teeth_table;

    @FXML
    private TableColumn<Heal, String> teeth_table_name;

    @FXML
    private TableColumn<Heal, String> teeth_table_vid;

    @FXML
    private TableColumn<Heal, String> teeth_table_simp;

    @FXML
    private TableColumn<Heal, String> teeth_table_instr;

    @FXML
    private TableColumn<Heal, String> teeth_table_nalich;

    @FXML
    private Label teeth_label;

    @FXML
    private Button teeth_find;

    @FXML
    private ComboBox teeth_combo_box;

    @FXML
    private Pane virus_pane;

    @FXML
    private Label virus_label;

    @FXML
    private Button virus_find;

    @FXML
    private TableView<Heal> virus_table;

    @FXML
    private TableColumn<Heal,String> virus_table_name;

    @FXML
    private TableColumn<Heal,String> virus_table_vid;

    @FXML
    private TableColumn<Heal,String> virus_table_simp;

    @FXML
    private TableColumn<Heal,String> virus_table_instr;

    @FXML
    private TableColumn<Heal,String> virus_table_nalich;

    @FXML
    private ComboBox virus_combo_box;

    @FXML
    private Label insert_pane;

    @FXML
    private Label insert_pane1;

    @FXML
    private Label insert_pane11;

    @FXML
    private TextArea name_field;

    @FXML
    private Label insert_pane111;

    @FXML
    private TextArea simp_field;

    @FXML
    private Label insert_pane1111;

    @FXML
    private TextArea instr_field;

    @FXML
    private Label insert_pane12;

    @FXML
    private Button insert_btn;

    @FXML
    private Label insert_pane11111;

    @FXML
    private ComboBox nalich_box;

    @FXML
    private ComboBox payne_box;

    @FXML
    void open_pane(ActionEvent event)
    {
        if (event.getSource() == Head)
        {
            head_pane.toFront();
            try
            {
                DBProcessor db = new DBProcessor();
                String quer = "SELECT * FROM home_heal WHERE Type = 'Головные боли' AND Availability = 'Есть' ORDER BY Name";
                head_table.setItems(db.MethodPane(quer));
            }
            catch (SQLException ex)
            {
                System.out.println("Произошла ошибка");
                return;
            }
        }
        else if (event.getSource() == teeth)
        {
            teeth_pane.toFront();
            try
            {
                DBProcessor db = new DBProcessor();
                String quer = "SELECT * FROM home_heal WHERE Type = 'Зубные боли' AND Availability = 'Есть' ORDER BY Name";
                teeth_table.setItems(db.MethodPane(quer));
            }
            catch (SQLException ex)
            {
                System.out.println("Произошла ошибка");
                return;
            }
        }
        else if (event.getSource() == body)
        {
            body_pane.toFront();
            try
            {
                DBProcessor db = new DBProcessor();
                String quer = "SELECT * FROM home_heal WHERE Type = 'Телесные травмы' AND Availability = 'Есть' ORDER BY Name";
                body_table.setItems(db.MethodPane(quer));
            }
            catch (SQLException ex)
            {
                System.out.println("Произошла ошибка");
                return;
            }
        }
        else if (event.getSource() == stomach)
        {
            stomach_pane.toFront();
            try
            {
                DBProcessor db = new DBProcessor();
                Connection conn = db.getConnection();
                String quer = "SELECT * FROM home_heal WHERE Type = 'Боли в животе' AND Availability = 'Есть' ORDER BY Name";
                stomach_table.setItems(db.MethodPane(quer));
            }
            catch (SQLException ex)
            {
                System.out.println("Произошла ошибка");
                return;
            }
        }
        else if (event.getSource() == virus)
        {
            virus_pane.toFront();
            try
            {
                DBProcessor db = new DBProcessor();
                Connection conn = db.getConnection();
                String quer = "SELECT * FROM home_heal WHERE Type = 'Простуда' AND Availability = 'Есть' ORDER BY Name";
                virus_table.setItems(db.MethodPane(quer));
            }
            catch (SQLException ex)
            {
                System.out.println("Произошла ошибка");
                return;
            }
        }
        else if(event.getSource() == list)
        {
            all_heal_pane.toFront();
            SelectAll();
        }
        else if(event.getSource() == add)
        {
            adding_pane.toFront();
        }
        else if(event.getSource() == exit)
        {
            Platform.exit();
            System.exit(0);
        }
        else
            System.out.println("Error!\n");
    }
    private void SelectAll ()
    {
        try
        {
            DBProcessor db = new DBProcessor();
            Connection conn = db.getConnection();
            String quer = "SELECT * FROM home_heal ORDER BY Name";
            all_table.setItems(db.MethodPane(quer));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }
    @FXML
    void head_finding(ActionEvent event)
    {
        try
        {
            String my_Type = "Головные боли";
            String my_simp;

            if(head_combo_box.getValue() == null)
                my_simp = "";
            else
                my_simp = head_combo_box.getValue().toString();

            DBProcessor db = new DBProcessor();
            String quer = "SELECT * FROM home_heal WHERE Type = ? AND Symptoms = ? AND Availability = 'Есть' ORDER BY Name";

            head_table.setItems(db.view_helper(quer, my_simp, my_Type));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void stomach_finding(ActionEvent event)
    {
        try
        {
            String my_Type = "Боли в животе";
            String my_simp;

            if(stomach_combo_box.getValue() == null)
                my_simp = "";
            else
                my_simp = stomach_combo_box.getValue().toString();

            DBProcessor db = new DBProcessor();
            String quer = "SELECT * FROM home_heal WHERE Type = ? AND Symptoms = ? AND Availability = 'Есть' ORDER BY Name";

            stomach_table.setItems(db.view_helper(quer, my_simp, my_Type));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void teeth_finding(ActionEvent event)
    {
        try
        {
            String my_Type = "Зубные боли";
            String my_simp;

            if(teeth_combo_box.getValue() == null)
                my_simp = "";
            else
                my_simp = teeth_combo_box.getValue().toString();

            DBProcessor db = new DBProcessor();
            String quer = "SELECT * FROM home_heal WHERE Type = ? AND Symptoms = ? AND Availability = 'Есть' ORDER BY Name";

            teeth_table.setItems(db.view_helper(quer, my_simp, my_Type));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void body_finding(ActionEvent event)
    {
        try
        {
            String my_Type = "Телесные травмы";
            String my_simp;

            if(body_combo_box.getValue() == null)
                my_simp = "";
            else
                my_simp = body_combo_box.getValue().toString();

            DBProcessor db = new DBProcessor();
            String quer = "SELECT * FROM home_heal WHERE Type = ? AND Symptoms = ? AND Availability = 'Есть' ORDER BY Name";

            body_table.setItems(db.view_helper(quer, my_simp, my_Type));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void virus_finding(ActionEvent event)
    {
        try
        {
            String my_Type = "Простуда";
            String my_simp;

            if(virus_combo_box.getValue() == null)
                my_simp = "";
            else
                my_simp = virus_combo_box.getValue().toString();

            DBProcessor db = new DBProcessor();
            String quer = "SELECT * FROM home_heal WHERE Type = ? AND Symptoms = ? AND Availability = 'Есть' ORDER BY Name";

            virus_table.setItems(db.view_helper(quer, my_simp, my_Type));
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void insertToDB(ActionEvent event)
    {
        try
        {
            DBProcessor db = new DBProcessor();

            String my_name = name_field.getText();
            String my_simp = simp_field.getText();
            String my_instr = instr_field.getText();

            String my_type;
            String my_nalich;

            if(payne_box.getValue() == null || nalich_box.getValue() == null)
            {
                my_type = "";
                my_nalich = "";
            }
            else
            {
                my_type = payne_box.getValue().toString();//
                my_nalich = nalich_box.getValue().toString();
            }

            if(my_name.isEmpty() || my_type.isEmpty() || my_simp.isEmpty() || my_nalich.isEmpty() || my_instr.isEmpty())
                showAlertWithHeaderText();
            else
                db.MethodInsert(my_name, my_type, my_simp, my_nalich, my_instr);
                name_field.setText("");
                simp_field.setText("");
                instr_field.setText("");
                payne_box.setValue("");
                nalich_box.setValue("");
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void initialize()
    {
        all_table.setTooltip(new Tooltip("Нажмите правую кнопку мыши, \nчтобы изменить наличие"));
        main_pane.toFront();
        //initTable
        head_table_name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        head_table_vid.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        head_table_simp.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        head_table_instr.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        head_table_nalich.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());
        stomach_table_name1.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        stomach_table_vid1.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        stomach_table_simp1.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        stomach_table_instr1.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        stomach_table_nalich1.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());
        stomach_table_name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        stomach_table_vid.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        stomach_table_simp.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        stomach_table_instr.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        stomach_table_nalich.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());
        teeth_table_name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        teeth_table_vid.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        teeth_table_simp.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        teeth_table_instr.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        teeth_table_nalich.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());
        body_table_name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        body_table_vid.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        body_table_simp.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        body_table_instr.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        body_table_nalich.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());
        virus_table_name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        virus_table_vid.setCellValueFactory(cellData -> cellData.getValue().vidProperty());
        virus_table_simp.setCellValueFactory(cellData -> cellData.getValue().simpProperty());
        virus_table_instr.setCellValueFactory(cellData -> cellData.getValue().instrProperty());
        virus_table_nalich.setCellValueFactory(cellData -> cellData.getValue().nalichProperty());


        //initComboBoxes
        head_combo_box.getItems().removeAll(head_combo_box.getItems());
        head_combo_box.getItems().addAll("Спазм", "Мигрень", "Стресс", "Гипертония", "Остеохондроз", "Температура", "Жар", "Тяжесть");

        body_combo_box.getItems().removeAll(body_combo_box.getItems());
        body_combo_box.getItems().addAll("Ушиб", "Ожог", "Кровотечение");

        stomach_combo_box.getItems().removeAll(stomach_combo_box.getItems());
        stomach_combo_box.getItems().addAll("Гастрит", "Язва", "Изжога", "Спазм", "Рвота", "Колики", "Тяжесть", "Тошнота", "Спазм в животе");

        teeth_combo_box.getItems().removeAll(teeth_combo_box.getItems());
        teeth_combo_box.getItems().addAll("Острая боль", "Ноющая боль", "Легкая боль");

        virus_combo_box.getItems().removeAll(virus_combo_box.getItems());
        virus_combo_box.getItems().addAll("ОРВИ", "Температура", "Боль в горле");

        payne_box.getItems().removeAll(payne_box.getItems());
        payne_box.getItems().addAll("Головные боли", "Боли в животе", "Зубные боли", "Телесные травмы", "Простуда");

        nalich_box.getItems().removeAll(nalich_box.getItems());
        nalich_box.getItems().addAll("Есть", "Нет");
    }
    private void showAlertWithHeaderText()
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ошибка ввода");
        alert.setHeaderText("Имеется пустое поле");
        alert.setContentText("Необходимо заполнить все поля!");
        alert.showAndWait();
    }
    private void Alert_deleting()
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ошибка удаления");
        alert.setHeaderText("Заданное лекарство отсутствует в базе данных");
        alert.setContentText("Введите существующий элемент!");
        alert.showAndWait();
    }
    @FXML
    void deleteDb(ActionEvent event)
    {
        try
        {
            DBProcessor db = new DBProcessor();
            String name = take_delete.getText();
            if (name.isEmpty())
                Alert_deleting();
            else
                db.MethodDelete(name);
                take_delete.setText("");
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    //contextMenu
    @FXML
    void mycont(ContextMenuEvent event)
    {
        menu_ite.show(all_table, event.getScreenX(), event.getScreenY());
    }

    @FXML
    void Press_no(ActionEvent event)
    {
        try
        {
            DBProcessor db = new DBProcessor();
            String name = all_table.getSelectionModel().getSelectedItem().getName();
            String was = "Есть";
            String will = "Нет";
            db.changeAvi(name,was,will);
            SelectAll();
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }

    @FXML
    void Press_yes(ActionEvent event)
    {
        try
        {
            DBProcessor db = new DBProcessor();
            String name = all_table.getSelectionModel().getSelectedItem().getName();
            String will = "Есть";
            String was = "Нет";
            db.changeAvi(name,was,will);
            SelectAll();
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }
}


