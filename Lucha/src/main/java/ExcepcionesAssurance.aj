
public aspect ExcepcionesAssurance {
	pointcut pelea(): execution(void luchar(..));

    after() throwing(Exception e): pelea() {

        System.out.println("Se produjo una excepción durante la pelea: " + e.getMessage());

    }    
}
