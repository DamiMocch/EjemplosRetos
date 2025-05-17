public class TransicionSimple implements TransicionHistoria {
    @Override
    public void siguienteEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("➡️ Transición a la escena cheetos flamin hot.");
        } else {
            System.out.println("➡️ Transición a la escena de takis morados.");
        }
    }
}