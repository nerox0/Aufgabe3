package de.hsb.app.kv.controller;

import de.hsb.app.kv.model.Kunde;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Arrays;
import java.util.List;

@ManagedBean (name= "kundenHandler")
@SessionScoped
public class KundenHandler{
    public List<Kunde> getKundenListe() {
        return kundenListe;
    }

    public void setKundenListe(List<Kunde> kundenListe) {
        this.kundenListe = kundenListe;
    }

    private List<Kunde> kundenListe= Arrays.asList(new Kunde[] {
            new Kunde("Yudas", "Fölsscwach", "01.01.1970"),
            new Kunde("Willi", "Meier", "02.02.1960"),
            new Kunde("Alan", "Turing", "23.06.1912"),
            new Kunde("Donald", "Knuth", "10.01.1938"),
            new Kunde("Edsger W.","Dijkstra", "11.05.1930")
    }
    );
}
