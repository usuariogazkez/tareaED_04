
package Cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;
      
        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        Operativa_cuenta(Cuenta1);
    }

    public static void Operativa_cuenta(CCuenta Cuenta1) {
        
        
        try {
            Cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
