package EstruturaEscolha;

public class App {

    public static void main(String[] args) {
        int codigoProtudo = 2;

        switch (codigoProtudo) {
            case 1:
                System.out.println("� um");
                break;
            case 2:
                System.out.println("� dois");
                break;
            case 3:
                System.out.println("� tres");
                break;
            case 4:
                System.out.println("� quatro");
                break;
            default:
                System.out.println("Nao achei no case");
        }
    }
}
