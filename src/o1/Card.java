package o1;

import java.util.UUID;

/**
 * Created by changwenhu on 2017/4/14.
 */
public class Card {
    /**
     * 生成卡密
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("INSERT INTO card (cardno, transfer, useuid) VALUES ('" + UUID.randomUUID().toString().replaceAll("-", "") + "',3,0);");
        }
    }
}


