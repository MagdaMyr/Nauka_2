public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortal wit = new ProstyPortal(); // utowrzenie obiektu klasy ProstyPortal

        int[] polozenia = {2, 3, 4}; // utworzenie tablicy liczb calkowitych okreslajacych polozenie zatapianego portalu
        // (tablica zawiera trzy kolejne liczby calkowite sposród 7 mozliwych)

        wit.setPolaPolozenia(polozenia); // wywolanie metody ustawiajacej utworzonego obiektu

        String wybranePole = "2"; // symulacja pola wybranego przez gracza

        String wynik = wit.sprawdz(wybranePole); // wywolanie metody sprawdz() utworzonego obiektu i przekazanie do
        // do niej wybranego pola

        String wynikTestu = "niepowodzenie";
        if (wynik.equals("trafiony")) {      //jesli w odpowiedzi na symulowane pole wybrane przez gracza (2)
            wynikTestu = "zakonczony pomyslnie"; // zostanie zwrocony wyniki "trafiony", oznacza to, ze metoda dziala
        }
        System.out.println(wynikTestu); // zwracany wynik testu: "niepowidzenie" lub "zakonczony pomyslnie"
    }
}

