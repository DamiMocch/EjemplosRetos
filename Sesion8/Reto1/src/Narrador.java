class Narrador {
    private GestorDialogo gestorDialogo;
    private LogicaDecision logicaDecision;
    private TransicionHistoria transicionHistoria;

    public Narrador(GestorDialogo gestorDialogo, LogicaDecision logicaDecision, TransicionHistoria transicionHistoria) {
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
        this.transicionHistoria = transicionHistoria;
    }

    public void ejecutarNarrativa() {
        gestorDialogo.mostrarDialogo("Estás en una tiendita. A tu izquierda hay unos deliciosos Cheetos Flamin Hot 🔥. A tu derecha, unos ricos Takis Fuego 🔥🔥.");
        String decision = logicaDecision.obtenerDecision();
        gestorDialogo.mostrarDialogo("Has tomado una sabia decisión...");
        transicionHistoria.siguienteEscena(decision);
    }
}
