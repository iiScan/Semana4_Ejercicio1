//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1=new Usuario("jperez","jperez@gmail.com");
        Usuario u2=new Usuario("jmadrid","jmadrid@gmail.com");
        Usuario u3=new Usuario("jcuichan","jcuichanz@gmail.com");
        Usuario u4=new Usuario("mvasquez","mvasquez@gmail.com");

        u1.mostrarUsuario();
        u2.mostrarUsuario();
        u3.mostrarUsuario();
        u4.mostrarUsuario();
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Total de usuarios: " + Usuario.getContadorUsuarios());
    }


}