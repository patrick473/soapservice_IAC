package Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDAO extends BaseDAO {


    public void finishOrder(int orderid){

        try(Connection con = super.getConnection()){
            String query = "update product_order " +
                    "set paid = nextval('betaaldsequence')" +
                    "where order_id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1,orderid);
            int finished = stmt.executeUpdate();
            System.out.println(finished);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
