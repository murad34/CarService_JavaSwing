
import java.sql.Connection;
import java.sql.Statement;

public class InsertValue {

    public void insertvalue(String salam) {

        Statement statement;
        Connect_with_DB connectDB = new Connect_with_DB();

        try{
//            String sql="insert into maintable(modelofcar,dateofreceiving,dateofgiving,servicecost) values("+")";
            String sql="insert into "+salam+"(modelofcar) values('salamlar')";

            statement=connectDB.connecting().createStatement();
            statement.executeUpdate(sql);
            //System.out.println("Values inserted successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
