package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        //Crie um switch que dado um valor de 1 a 7
        // Considerando 1 domingo, imprima se é dia útil ou final de semana

        byte dia = 3;
        switch(dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util.");
                break;
            default:
                System.out.println("Opcao invalida invalido.");
        }

    }
}
