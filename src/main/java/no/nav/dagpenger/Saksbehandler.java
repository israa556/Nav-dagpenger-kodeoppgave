public class Saksbehandler {

    private final String navn;
    private final String spesialisering;

    public Saksbehandler(String navn, String spesialisering){
        this.navn = navn;
        this.spesialisering = spesialisering;
    }

    public List<Resultat> hentUbehandledeResultater(List<Resultat> resultater){
        List<Resultat> relevante = new ArrayList<>();

        for(Resultat resultat : resultater){
            boolean riktigSpesialisering = resultat.hentType().equals(spesialisering);
            boolean erUbehandlet = resultat.hentStatus().equals("UBEHANDLET");

            if(riktigSpesialisering && erUbehandlet){
                relevante.add(resultat);
            }
        }
        return relevante;
    }


    public void godkjenn(Resultat resultat) {
        resultat.godkjenn();
    }


    public void avslå(Resultat resultat){
        resultat.avslå();
    }

}