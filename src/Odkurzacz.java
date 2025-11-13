public class Odkurzacz extends Bazowa{
    private boolean stan = false;

    public boolean on(){
        if (stan = false){
            stan = true;
            wyswietl("Odkurzacz włączono");
        }
        return stan;
    }
    public boolean off(){
        if (stan = true){
            stan = false;
            wyswietl("Odkurzacz wyłączono");
        }
        return stan;
    }
}