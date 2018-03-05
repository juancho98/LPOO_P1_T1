package lpoo_p1_01.cap4;

public class TestSandwichFilling {

    public static void main(String[] args) {
        SandwichFilling cecina= new SandwichFilling("Cecina",20.0);
	SandwichFilling tinga = new SandwichFilling("Tinga",75.0);
        SandwichFilling ensaladaHuevo = new SandwichFilling("Ensalada de huevo", 100.0);
		
	System.out.println(cecina.getTipo());
        System.out.println(cecina.getCalor()+"\n");
	
        System.out.println(tinga.getTipo());
	System.out.println(tinga.getCalor()+"\n");
		
        System.out.println(ensaladaHuevo.getTipo());
	System.out.println(ensaladaHuevo.getCalor()+"\n");
    }
    
}
