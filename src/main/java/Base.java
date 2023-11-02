import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @autor Sidostsova Olga
 */

public class Base {
    public static void main(String[] args) {

        Candy candy1 = new Candy("чупа-чупс большой", 20.0, "chua-chups", 10101, 20, "classic");
        Candy candy2 = new Candy("чупа-чупс маленький", 10.0, "chua-chups", 10102, 12, "small");
        Macaroon macaroon1 = new Macaroon("макарун поштучно", 70.0, "no name1", 10103, 50, 1);

        Macaroon macaroon2 = new Macaroon("макарун маленький набор", 500.0, "no name1", 10104, 400, 6);
        Macaroon macaroon3 = new Macaroon();
        macaroon3.setName("макарун большой набор");
        macaroon3.setPrice(1500.0);
        macaroon3.setBrand("MS");
        macaroon3.setWeight(1000);
        macaroon3.setNumber(10105);
        macaroon3.setCount(15);

        Doughnut doughnut1 = new Doughnut("пончик со сгущенкой", 300.0, "Metrapol", 10106, 270, "сгущенка");
        Doughnut doughnut2 = new Doughnut();
        doughnut2.setName("шоколадный пончик");
        doughnut2.setPrice(350.0);
        doughnut2.setBrand("Чебурашка");
        doughnut2.setWeight(250);
        doughnut2.setNumber(10107);
        doughnut2.setTaste("шоколад");

        Sweet[] box = {candy1, candy2, macaroon1,macaroon2, macaroon3, doughnut1, doughnut2};

        for (Sweet sweet: box
             ) {
            System.out.println(sweet.toString());
        }

    }
}