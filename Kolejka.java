import java.util.LinkedList;

public class Kolejka {

    private LinkedList<String> cars;

    public Kolejka() {
        cars = new LinkedList<String>();
    }

    public void dodajElement(String car){
        cars.addLast(car);
        System.out.println(cars);
    }

    public void pobierzElement(){
       cars.removeFirst();
       System.out.println(cars);
    }

    public static void main(String[] args) {
        Kolejka kolejka = new Kolejka();
        kolejka.dodajElement("Volvo");
        kolejka.dodajElement("Toyota");
        kolejka.dodajElement("Mazda");      
        kolejka.pobierzElement();
    }
}