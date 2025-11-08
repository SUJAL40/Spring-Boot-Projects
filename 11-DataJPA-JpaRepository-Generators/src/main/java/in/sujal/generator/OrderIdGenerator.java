package in.sujal.generator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

    private static final String PREFIX = "OD";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sbms?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String suffix = "000";

        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            // 1) Insert a row into order_seq to create the next auto-increment value
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO order_seq () VALUES ()", Statement.RETURN_GENERATED_KEYS)) {
                ps.executeUpdate();
                // 2) retrieve generated key using LAST_INSERT_ID() or generated keys
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs != null && rs.next()) {
                        int seq = rs.getInt(1);
                        suffix = String.format("%03d", seq); // e.g., 001
                    } else {
                        // fallback: try LAST_INSERT_ID()
                        try (Statement s2 = con.createStatement();
                             ResultSet rs2 = s2.executeQuery("SELECT LAST_INSERT_ID()")) {
                            if (rs2.next()) {
                                int seq = rs2.getInt(1);
                                suffix = String.format("%03d", seq);
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            // fallback: timestamp-based short unique suffix to avoid duplicates
            suffix = String.format("%03d", (int)(System.currentTimeMillis() % 1000));
        }

        return PREFIX + suffix;
    }
}
