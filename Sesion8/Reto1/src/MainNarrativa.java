public class MainNarrativa {
    public static void main(String[] args) {
        // Inyección de dependencias
        GestorDialogo gestorDialogo = new DialogoTexto();
        LogicaDecision logicaDecision = new DecisionBinaria();
        TransicionHistoria transicionHistoria = new TransicionSimple();

        Narrador narrador = new Narrador(gestorDialogo, logicaDecision, transicionHistoria);
        narrador.ejecutarNarrativa();
    }
}