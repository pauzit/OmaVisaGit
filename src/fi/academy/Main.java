package fi.academy;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        KysymysLista koe = new KysymysLista();
        List<Kysymys> tehtavat = koe.getLomake();
        Pistelaskuri pisteet = new Pistelaskuri();

        System.out.println("Tervetuloa planeettavisaan!");
        System.out.println("Nyt se alkaa:");


        for (int i = 0; i < 3; i++) {
            System.out.println(tehtavat.get(i));
            Scanner lukija = new Scanner(System.in);
            String arvaus = lukija.nextLine();
            if (arvaus.equals(tehtavat.get(i).oikeaVastaus)) {
                System.out.println("Oikein!");
                System.out.println();
                pisteet.lisaaPiste();
            }
            else {
            }
        }
        System.out.println("Pistemääräsi on: " + pisteet.getPistemaara());
    }
}
