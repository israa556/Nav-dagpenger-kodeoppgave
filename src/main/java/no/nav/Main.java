package no.nav;

import no.nav.dagpenger.DagpengerKalkulator;
import no.nav.dagpenger.Resultat;
import no.nav.årslønn.Årslønn;

public class Main {
    public static void main(String[] args) {
        DagpengerKalkulator dagpengerKalkulator = new DagpengerKalkulator();
        dagpengerKalkulator.leggTilÅrslønn(new Årslønn(2023, 500000));
        dagpengerKalkulator.leggTilÅrslønn(new Årslønn(2022, 450000));
        dagpengerKalkulator.leggTilÅrslønn(new Årslønn(2021, 400000));
        System.out.println("---🤖 Kalkulerer dagsats... 🤖---");
        System.out.println("Personen har rett på følgende dagsats: " + dagpengerKalkulator.kalkulerDagsats());
        System.out.println("---🤖 Dagsats ferdig kalkulert 🤖---");
        System.out.println();

        Resultat resultat = dagpengerKalkulator.kalkulerResultat();
        System.out.println("Resultater:");
        System.out.println("Dagsats: " + resultat.hentDagsats());
        System.out.println("Type: " + resultat.hentType());
        System.out.println("Status: " + resultat.hentStatus());


    }
}