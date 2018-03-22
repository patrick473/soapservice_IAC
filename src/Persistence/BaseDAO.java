package Persistence;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

public class BaseDAO {
    private static DataSource connectionPool;

    public static Connection getlocalConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI("postgres://aqbotxgvbzpuyj:b47f8043fdfe0c9d4b4b410af95c5c954b7c81c102595fd57053b85e8704949d@ec2-54-247-95-125.eu-west-1.compute.amazonaws.com:5432/d96hcm10taurkp");

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        return DriverManager.getConnection(dbUrl, username, password);
    }
    public static Connection getConnection(){
        final String url = "jdbc:postgresql://ec2-54-247-95-125.eu-west-1.compute.amazonaws.com:5432/d96hcm10taurkp?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
        final String user = "aqbotxgvbzpuyj";
        final String password = "b47f8043fdfe0c9d4b4b410af95c5c954b7c81c102595fd57053b85e8704949d";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}



