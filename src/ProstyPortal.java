public class ProstyPortal {
    int[] polaPolozenia;
    int iloscTrafien;

    public void setPolaPolozenia(int[] polozenia) {
        int[] ppol = new int[0];
        polaPolozenia = ppol;
    }

    public String sprawdz(String stringPole) { // pobierze pole wskazane przez gracza

        int strzal = Integer.parseInt(stringPole); // konwersja lancucha znakow na liczbe caclkowita
        String wynik = "pudlo"; // utworzenie zmiennej, ktora bedzie przechowywac wynik metody;//poczatkowo jest w
        // niej zapisywany lancuch "pudlo" czyli zakladamy, ze gracz spudlowal

        int[] polaPolozenia = new int[0];
        for (int pole : polaPolozenia) { //czynnosci w petli beda powtarzane dla kazdej komorki
            //tablicy (kazdej komorki okreslajacej polozenie Postalu())

            if (strzal == pole) { //porownanie pola podanego przez gracza z tym elementm (komorka) tablicy
                wynik = "trafiony"; // gracz trafil
                iloscTrafien++;
                break; // przerwanie realizacji petli, gdyz dalsze sprawdzanie komorek nie jest konieczne
            } // koniec if
        } // koniec for
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "zatopiony";    // dzialnianie petli zostalo zakonczone ale nalezy sprawdzic, czy Postal zostal
            // "zatopiony" (trafiony trzy razy) i w razie czego odpowiednio zmienic wynik
        }       // koniec if
        System.out.println(wynik);          // wyswietlenie wyniku ("pudlo" chyba ze domyslny wynik zostal zmieniony  na
        // "trafiony" lub "zatopiony")
        return wynik;
    }// koniec metody
}

