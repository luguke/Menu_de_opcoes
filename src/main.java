import java.util.Scanner;

/**
 *
 * @author luguq
 */
class Escolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escolha um app para abrir:");
        System.out.println("1- Netflix | 2- Amazon | 3- Youtube");
        Scanner a = new Scanner(System.in);
        int opcao = a.nextInt();
        System.out.printf("App selecionado: %d", opcao);
        switch (opcao){
            case 1:
                System.out.println(" Netflix");
                break;
            case 2:
                System.out.println(" Amazon Prime");
                break;
            case 3:
                System.out.println(" Youtube");
                break;
            default:
                System.out.println(" não encontrado");
        }

    }

}