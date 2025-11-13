public class Pralka extends Main {
    private int program = 0;

    public int program(int numer){

        if (numer >= 1 && numer <= 12){
            program = numer;
        } else {
            program = 0;
        }
        return program;
    }
}
