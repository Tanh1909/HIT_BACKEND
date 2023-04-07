import Database.ConnectDB;

import java.sql.Connection;

public class runMain {

    public static void main(String[] args) {
        Connection con=ConnectDB.ConnectDB();
        System.out.println(con);
    }
}
