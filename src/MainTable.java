
import java.sql.SQLException;
import java.sql.Statement;

public class MainTable {
    public void maintable() {

        Statement statement;
        Connect_with_DB connectDB = new Connect_with_DB();

        try {
            String sql = "Create table MainTable"+
                    "(id serial primary key," +
                    "NameAndSurname varchar," +
                    "NumberOfOwner integer," +
                    "ModelOfCar varchar," +
                    "NumberOfCar varchar," +
                    "DateOfReceiving date ," +
                    "DateOfGiving date )";
            statement=connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
            System.out.println("Table created successfully");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
