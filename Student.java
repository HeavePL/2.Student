import java.util.Scanner;

public class Student {
    

    public Student(String imie, String nazwisko,double ocena, String plec, String kierunek){

        WyswietlInformacje();
        ZmienImie(imie);   
        ZmienNazwisko(nazwisko);
        UstawPlec(plec);
        ZmienOcene(ocena);
        ZmienKierunek(kierunek);
        SprawdzZaliczenie();

}
    
    String imie;
    String nazwisko;
    double ocena;
    char plec;
    String kierunek;

    

    public void WyswietlInformacje(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(plec);
        System.out.println(ocena);
        System.out.println(kierunek);
    }
    public void ZmienKierunek(String nowyKierunek){
        kierunek = nowyKierunek;
        WyswietlInformacje();
    }

    public void ZmienOcene(double nowaOcena){
        ocena = nowaOcena;

        WyswietlInformacje();
    }

    public void ZmienImie(String noweImie){
        imie = noweImie;
    }
    public void ZmienNazwisko(String noweNazwisko){
        nazwisko = noweNazwisko;
    }

    public void UstawPlec(String nowaPlec){
        plec = nowaPlec.toUpperCase().charAt(0);
    }

    public Boolean SprawdzZaliczenie(){

        if(ocena<2){
            System.out.println("nie zaliczenie");
            return false;
            }
        System.out.println("zaliczenie");
        return true;
    }



}
