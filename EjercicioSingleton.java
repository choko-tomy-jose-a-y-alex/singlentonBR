class SoloYo {

    private String nombre;
    private static SoloYo soloYo;


    private SoloYo(String nombre) {
        this.nombre = nombre;
        System.out.println("Hay lugar para: " + this.nombre);
    }

    public static SoloYo getSingletonInstance(String nombre) {
        if (soloYo == null){
            soloYo = new SoloYo(nombre);
        }
        else{
            System.out.println("No hay lugar para: "+ nombre );
        }
        
        return soloYo;
    }
    
   public String getNombre(){
	return nombre;   
   }

}

public class Lugar {

    public static void main(String[] n) {
        
        SoloYo p1 = SoloYo.getSingletonInstance(n[0]);
        SoloYo p2 = SoloYo.getSingletonInstance(n[1]);
        SoloYo p3 = SoloYo.getSingletonInstance(n[2]);
        SoloYo p4 = SoloYo.getSingletonInstance(n[3]);

        

        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        System.out.println(p3.getNombre());
        System.out.println(p4.getNombre());
        System.out.println("Soy: "+p1.getNombre()+" y nadie ocupa mi lugar :)");   
    }
}
