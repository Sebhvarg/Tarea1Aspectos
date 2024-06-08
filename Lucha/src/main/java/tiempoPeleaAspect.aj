
public aspect tiempoPeleaAspect {
	pointcut pelearExecution(): execution(void Pelea.Pelear());

    before(): pelearExecution() {
        long startTime = System.currentTimeMillis();
        System.out.println("Iniciando toma de tiempo...");
        proceed(startTime);
    }

    private void proceed(long startTime): pelearExecution() && args(long startTime) {
        proceed(startTime);
    }

    after(long startTime): pelearExecution() && args(long startTime) {
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime)*1000;
        System.out.println("La pelea tardó " + elapsedTime + " horas en completarse.");

    }
}
