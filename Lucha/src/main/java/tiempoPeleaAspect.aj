
public aspect tiempoPeleaAspect {
    private long startTime;
    
    pointcut verifyAssurance():execution(void Pelear(..));
	
	before() : verifyAssurance(){
        startTime = System.currentTimeMillis();
        System.out.println("Iniciando toma de tiempo...");
    }

    after(): verifyAssurance() {
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime)/200;
        System.out.println("La pelea tardó " + elapsedTime + " minutos en completarse.");
    }
}
