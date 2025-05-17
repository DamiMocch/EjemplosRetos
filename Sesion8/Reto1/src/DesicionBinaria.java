import java.util.Scanner;

class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecision() {
        System.out.print("¿Qué haces? (A = Comprar los Cheetos / B = Comprar los Takis): ");
        String decision = scanner.nextLine().toUpperCase();
        while (!decision.equals("A") && !decision.equals("B")) {
            System.out.print("❌ Opción no válida. Elige A o B: ");
            decision = scanner.nextLine().toUpperCase();
        }
        return decision;
    }
}