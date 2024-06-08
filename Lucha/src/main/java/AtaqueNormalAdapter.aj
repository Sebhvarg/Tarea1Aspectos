import tipoLuchadores.Tecnico;
public aspect AtaqueNormalAdapter {
    pointcut tecnicoPointcut(Tecnico tecnico) :
        execution(double Tecnico.llaveSubmission()) && target(tecnico);

    double around(Tecnico tecnico) : tecnicoPointcut(tecnico) {
        double resultadoOriginal = proceed(tecnico);
        double resultadoAdaptado = adaptarResultado(resultadoOriginal);
        return resultadoAdaptado;
    }

    private double adaptarResultado(double resultadoOriginal) {
        return resultadoOriginal; 
    }
}

