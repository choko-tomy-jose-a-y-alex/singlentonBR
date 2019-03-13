interface Auto {
 String año();
}

interface FabricaAuto {
 Auto creaAuto();
}

class Automatico implements Auto {
@Override
 public String año() {
 	return "Primer auto Automatico lanzado en 1941";
 }
}

class Manual implements Auto {
@Override
 public String año() {
 	return "Primer auto Manual lanzado en 1886";
 }
}

class Hibrido implements Auto{
@Override
 public String año(){
 	return "Primer auto Hibrido lanzado en 1997";
 }
}

class FabricaAutomatico implements FabricaAuto {
 public Auto creaAuto() {
   return new Automatico();
 }
}

class FabricaManual implements FabricaAuto {
 public Auto creaAuto() {
   return new Manual();
 }
}

class FabricaHibrido implements FabricaAuto{
 public Auto creaAuto(){
   return new Hibrido(); 
 }
}

public class Factory {
 public static void lanza(FabricaAuto fabrica) {
   final Auto a = fabrica.creaAuto();
   System.out.println(a.año());
 }
 public static void main(String[] n) {
   lanza(new FabricaAutomatico());
   lanza(new FabricaManual());
   lanza(new FabricaHibrido());
 }
}
