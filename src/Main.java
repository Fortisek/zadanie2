import obiekty.obiektA;
public class Main {

    public static void main(String[] args) {
        obiektA obiektA = new obiektA("Jan", "Kowalski");
        System.out.println(obiektA.getImie());
        System.out.println(obiektA.getNazwisko());

        obiektA.setImie("Piotr");
        obiektA.setNazwisko("Nowak");
        System.out.println(obiektA.getImie());
        System.out.println(obiektA.getNazwisko());
    }


        }


