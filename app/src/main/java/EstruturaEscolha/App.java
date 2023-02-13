package EstruturaEscolha;

public class App {

    public static void main(String[] args) {
        int codigoProtudo = 2;

        switch (codigoProtudo) {
            case 1:
                System.out.println("é um");
                break;
            case 2:
                System.out.println("é dois");
                break;
            case 3:
                System.out.println("é tres");
                break;
            case 4:
                System.out.println("é quatro");
                break;
            default:
                System.out.println("Nao achei no case");
        }
    }
}
