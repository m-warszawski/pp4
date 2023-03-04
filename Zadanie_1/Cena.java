public class Cena {
    public static float obliczCeneNetto(float cenaBrutto, float podatek){
        podatek = podatek/100;
        return cenaBrutto - (cenaBrutto*podatek);
    }

    public static void main(String[] args){
        float cenaNetto = obliczCeneNetto(25, 36);
        System.out.println(cenaNetto);
    }
}   
