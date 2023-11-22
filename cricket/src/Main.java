import com.mysql.cj.protocol.Resultset;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //TODO
        //1. Load and register the driver.
        // name of mysql driver (by downloading by your own, in mysql connection jar (independent platform)
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the connection for specific database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Mysqltoomuch34$");

        //3. create the statement object
        Statement statement = connection.createStatement();

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the choice: ");
            System.out.println("1. View the record");
            System.out.println("2. Insert record");
            System.out.println("3. Update the record");
            System.out.println("4. Delete the record");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewTable(statement);
                    break;
                case 2:
                    insertTable(statement);
                    break;
                case 3:
                    updateTable(statement);
                    break;
                case 4:
                    deleteTable(statement);
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }

    static void viewTable(Statement st) {
        String query = "SELECT * FROM scoreboard";

        try {
            ResultSet rs = st.executeQuery(query);
            System.out.println("ID\t NAME\t RUNS\t BALLS\t");
            System.out.println("--------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4) + "\t");
            }
            System.out.println("--------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void updateTable(Statement st) {

        System.out.print("Enter the id: ");
        int id = sc.nextInt();
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.print("Enter the runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter the balls: ");
        int balls = sc.nextInt();

        String query = "UPDATE scoreboard SET runs = " + runs + ", balls = " + balls + " WHERE id = " + id + ";";

        try {
            int rows = st.executeUpdate(query);
            System.out.println(rows + " rows updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deleteTable(Statement st) {
        // asking input user
        System.out.print("Insert id rows: ");
        int updateId = sc.nextInt();
        System.out.println("Insert runs value: ");
        int runsValue = sc.nextInt();
        System.out.print("Insert balls value: ");
        int ballsValue = sc.nextInt();

        //process
        String queryUpdate = "UPDATE scoreboard SET runs = " + runsValue + ", balls = " + ballsValue + " WHERE id = " + updateId + ";";
        try {
            int rows = st.executeUpdate(queryUpdate);
            System.out.println(rows + " rows updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insertTable(Statement st) {
        // asking input user
        System.out.print("Insert Id");
        int id = sc.nextInt();
        System.out.print("Insert name: ");
        String name = sc.next();
        System.out.print("Insert runs: ");
        int runs = sc.nextInt();
        System.out.print("Insert balls: ");
        int balls = sc.nextInt();

        //process
        String queryInsert = "INSERT INTO scoreboard (id, name, runs, balls) VALUES (" + id + ", '" + name + "', " + runs + ", " + balls + ");";
        try {
            int rows = st.executeUpdate(queryInsert);
            System.out.println(rows + " rows inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
