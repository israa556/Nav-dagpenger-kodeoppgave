package no.nav.dagpenger;


// Representerer resultatet av en dagpengerberegning som
// senere kan behandles av saksbehandler
public class Resultat {

    private final double dagsats;
    private final String type;
    private String status;

    public Resultat(double dagsats, String type){
        this.dagsats = dagsats;
        this.type = type;
        this.status = "UBEHANDLET";
    }

    public double hentDagsats(){
        return dagsats;
    }

    public String hentType(){
        return type;
    }

    public String hentStatus(){
        return status;
    }

    public void godkjenn(){
        this.status = "GODKJENT";
    }

    public void avslå(){
        this.status = "AVSLÅTT";
    }
}