import java.util.UUID;

/**
 * Created by changwenhu on 2017/6/23.
 */
public class VpnSql {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("INSERT INTO card (cardno, transfer, useuid) VALUES ('" + UUID.randomUUID().toString().replaceAll("-", "") + "',3,0);");

        }
    }
}
