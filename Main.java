import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Student [] klasa4 = new Student[5];
        klasa4[0] = new Student("Karol", "Marks", 2, "M", "Informatyk");
        klasa4[1] = new Student("Marcin", "Grabi", 3, "m", "Informatyk");
        klasa4[2] = new Student("Andrzej", "Cygala", 1, "m", "Informatyk");
        klasa4[3] = new Student("Władysław", "Brala", 2, "m", "Informatyk");
        klasa4[4] = new Student("Jędrzej", "Infernus", 5, "m19", "Informatyk");
        int opcja;
        Scanner skan = new Scanner(System.in);
        boolean kon = true;
        int nr;
        do {
            System.out.println("Podaj numer ucznia [1-5]");
            nr = skan.nextInt()-1;
            if(nr<0||nr>6)
            {
                System.out.println("Zły zakres[1-5]");
            } else{
                System.out.println("Wybrałeś:");
                klasa4[nr].WyswietlInformacje();
                kon = false;
            }
        }while(kon==true);

        do {
            System.out.println("1. Zmien imie ");
            System.out.println("2. Zmien nazwisko ");
            System.out.println("3. Zmien ocene ");
            System.out.println("4. Zmien plec ");
            System.out.println("5. Zmien kierunek ");
            System.out.println("6. Wyswietl informacje ");
            System.out.println("7. Zmien ucznia ");
            System.out.println("8. Zakończ ");

            System.out.print("Wybierz opcje ");
            opcja = skan.nextInt();

            switch (opcja){
                case 1:
                    System.out.print("Podaj nowe imie: ");
                    String nImie = skan.next();
                    klasa4[nr].ZmienImie(nImie);
                    break;
                case 2:
                    String nNazwisko;
                    System.out.print("Podaj nowe nazwisko: ");
                    nNazwisko = skan.next();
                    klasa4[nr].ZmienNazwisko(nNazwisko);
                    break;
                case 3:
                    System.out.print("Podaj nową ocenę: ");
                    double nOcena = skan.nextDouble();
                    klasa4[nr].ZmienOcene(nOcena);
                    break;
                case 4:
                    System.out.print("Podaj płeć ('K'/'M')");
                    String nowaPlec = skan.next();
                    klasa4[nr].UstawPlec(nowaPlec);
                    break;
                case 5:
                    System.out.print("Podaj nowy kierunek");
                    String nKierunek = skan.next();
                    klasa4[nr].ZmienKierunek(nKierunek);
                    break;
                case 6:
                    klasa4[nr].WyswietlInformacje();
                    break;
                case 7:
                    System.out.println("Podaj numer ucznia [1-5] ");
                    nr = skan.nextInt()-1;
                    if(nr<0||nr>6)
                    {
                        System.out.println("Zły zakres[1-5]");
                    } else{
                        System.out.println("Wybrałeś:");
                        klasa4[nr].WyswietlInformacje();
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
            }
        }while (opcja!=8);
    }
}
