package ba.unsa.etf.rpr;

import java.io.Serializable;

public class Drzava implements Serializable {
    private String naziv;
    private Grad glavniGrad;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
