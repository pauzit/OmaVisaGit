package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class Kysymys {
    String kysymysteksti;
    List<String> vastaukset = new ArrayList<>();
    String oikeaVastaus;

    public Kysymys(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
        List<String> vastaukset;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    public List<String> getVastaukset() {
        return vastaukset;
    }

    public void setVastaukset(List<String> vastaukset) {
        this.vastaukset = vastaukset;
    }
    public void setOikeaVastaus (String oikeaVastaus) {
        this.oikeaVastaus = oikeaVastaus;
    }
    public String getOikeaVastaus() {
        return oikeaVastaus;
    }

    public void lisaaVastaus(String vastaus) {
        vastaukset.add(vastaus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < vastaukset.size()) {
            String rivi = vastaukset.get(i);
            sb.append("\n").append(rivi);
            i++;
        }
        String tulos = sb.toString();
        return kysymysteksti + tulos;
        //nyt toimii looppi
    }
}

