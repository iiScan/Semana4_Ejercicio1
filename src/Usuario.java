public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;
    public Usuario(String username, String correo) {

        contadorUsuarios++;
        this.id=contadorUsuarios;
        this.username=username;
        this.correo=correo;
        this.activo=true;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }

    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean Activo){
        this.activo=activo;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public void mostrarUsuario(){
        System.out.println("ID:"+ id + "Usuario:" + username + "Correo:" + correo + "Activo:" + activo);
    }

}
