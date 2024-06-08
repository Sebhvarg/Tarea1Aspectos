
public aspect AtaqueNormalAdapter {
	pointcut adaptarAtaqueNormal(Tecnico tecnico) : execution(double Tecnico.llaveSubmission()) && target(tecnico);
    double around(Tecnico tecnico) : adaptarAtaqueNormal(tecnico) {
        double resultadoAtaque = tecnico.llaveSubmission();
        System.out.println("Adaptando ataque de Tecnico a Ataque normal...");
        System.out.println("Ataque: " + resultadoAtaque);
        return resultadoAtaque;    	
  
    }
}
