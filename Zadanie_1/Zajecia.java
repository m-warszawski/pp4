import java.util.ArrayList;

public class Zajecia{

    private ArrayList<Integer> studenci;

    Zajecia(){
        studenci = new ArrayList<Integer>(); 
    }

    public void zapiszStudenta(int idStudenta){
        if(studenci.size() > 10){
            studenci.add(idStudenta);
            System.out.println("Zapisani studenci: " + studenci);
        }
        else{
            System.out.println("Lista studentów jest pełna!");
        }
    }

    public static void main(String[] args) {
        Zajecia zaj = new Zajecia();
        zaj.zapiszStudenta(223195);
        zaj.zapiszStudenta(223178);
      }
}