import java.util.Scanner;

public aspect checkAssurance {
pointcut verifyAssurance():execution(void luchar(..));
	
	before() : verifyAssurance(){
		System.out.println("Iniciando pelea...");
		Scanner sc = new Scanner(System.in);
        System.out.println("Verifying assurance...\nNombre del espectador: ");
        String espectador = sc.nextLine();
        System.out.println("Bienvenido "+espectador+"\nDisfruta la pelea");
        
		
	}
	
	after() : verifyAssurance(){
		System.out.println("Pelea finalizada.\nEspero hayas disfrutado la pelea");
		
	}
	
}
