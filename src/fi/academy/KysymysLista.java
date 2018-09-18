package fi.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KysymysLista {
    List<Kysymys> lomake;

    public List<Kysymys> getLomake() {
        alustus();
        return lomake;
    }

    public void alustus() {
        ArrayList<Kysymys> tehtavalomake = new ArrayList<>();
        this.lomake = tehtavalomake;

        Kysymys q1 = new Kysymys("Mikä on aurinkoa lähimpänä oleva planeetta?");
        q1.lisaaVastaus("a) merkurius");
        q1.lisaaVastaus("b) venus");
        q1.lisaaVastaus("c) maa");
        q1.setOikeaVastaus("a");


        Kysymys q2 = new Kysymys("Aurinkokuntamme iäksi on arvioitu");
        q2.lisaaVastaus("a) 4,6 tuhatta vuotta");
        q2.lisaaVastaus("b) 4,6 miljardia vuotta");
        q2.lisaaVastaus("c) 460 miljardia vuotta");
        q2.setOikeaVastaus("b");

        Kysymys q3 = new Kysymys("Onko Pluto?");
        q3.lisaaVastaus("a) asteroidi");
        q3.lisaaVastaus("b) kissa");
        q3.lisaaVastaus("c) planeetta");
        q3.lisaaVastaus("d) plutoidi");
        q3.lisaaVastaus("e) koira");
        q3.setOikeaVastaus("d");

        tehtavalomake.add(q1);
        tehtavalomake.add(q2);
        tehtavalomake.add(q3);

        Collections.shuffle(tehtavalomake);

    }

}


