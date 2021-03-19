package sample;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DBProcessor
{
    private Connection connection;
    public DBProcessor() throws SQLException
    {
        DriverManager.registerDriver(new FabricMySQLDriver());
    }

    public Connection getConnection() throws SQLException {
        final String username = "root";
        final String password = "heheheZ2";
        final String url = "jdbc:mysql://127.0.0.1:3307/home_apteka?autoReconnect=true&useSSL=false";
        if (connection != null)
            return connection;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public ObservableList<Heal> view_helper(String quer, String ins, String typ)
    {
        try
        {
            Connection conn = getConnection();
            String query = quer;

            PreparedStatement preparedStmt = conn.prepareStatement(quer);
            preparedStmt.setString (2, ins);
            preparedStmt.setString (1, typ);


            ResultSet resSet = preparedStmt.executeQuery();
            ObservableList<Heal> list = FXCollections.observableArrayList();
            while (resSet.next())
            {
                String name;
                String vid;
                String simp;
                String instr;
                String nalich;
                name = resSet.getString("Name");
                vid = resSet.getString("Type");
                simp = resSet.getString("Symptoms");
                instr = resSet.getString("Instructions");
                nalich = resSet.getString("Availability");
                list.add(new Heal (name, vid, simp, instr, nalich));
            }
            preparedStmt.close();
            resSet.close();
            conn.close();
            return list;
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            ObservableList<Heal> list = FXCollections.observableArrayList();
            return list;
        }
    }

    public ObservableList<Heal> MethodPane(String quer)
    {
        try
        {
            Connection conn = getConnection();
            String query = quer;
            Statement statement = conn.createStatement();
            ResultSet resSet = statement.executeQuery(query);
            ObservableList<Heal> list = FXCollections.observableArrayList();
            while (resSet.next())
            {
                String name;
                String vid;
                String simp;
                String instr;
                String nalich;
                name = resSet.getString("Name");
                vid = resSet.getString("Type");
                simp = resSet.getString("Symptoms");
                instr = resSet.getString("Instructions");
                nalich = resSet.getString("Availability");
                list.add(new Heal (name, vid, simp, instr, nalich));
            }
            statement.close();
            conn.close();
            return list;
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            ObservableList<Heal> list = FXCollections.observableArrayList();
            return list;
        }
    }

    public void MethodInsert(String my_name,String my_type,String my_simp,String my_nalich,String my_instr)
    {
        try
        {
            String quer = "INSERT INTO home_apteka.home_heal (Name, Type, Symptoms, Instructions, Availability)" + " VALUES (?,?,?,?,?)";
            Connection conn = getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement(quer);
            preparedStmt.setString (1, my_name);
            preparedStmt.setString (2, my_type);
            preparedStmt.setString   (3, my_simp);
            preparedStmt.setString(5, my_nalich);
            preparedStmt.setString (4, my_instr);
            preparedStmt.execute();
            preparedStmt.close();
            conn.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }
    public void MethodDelete(String my_name)
    {
        try
        {
            String quer = "DELETE FROM home_heal WHERE Name = ?";
            Connection conn = getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement(quer);
            preparedStmt.setString (1, my_name);
            preparedStmt.executeUpdate();
            preparedStmt.close();
            conn.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }
    public void changeAvi(String nm,String was, String will)
    {
        try
        {
            String query ="UPDATE home_heal SET Availability = ? WHERE Availability = ? AND Name = ?;";
            Connection conn = getConnection();

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, will);
            preparedStmt.setString (2, was);
            preparedStmt.setString (3, nm);
            preparedStmt.executeUpdate();
            preparedStmt.close();
            conn.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Произошла ошибка");
            return;
        }
    }
}
