package model;

// Clase base que representa a una persona vinculada a Llanquihue Tour.
// Contiene los datos generales de cualquier persona del sistema.

public class Persona {

    private String nombre;
    private String rut;
    private String email;
    private Direccion direccion;

    public Persona() {
        nombre = "Sin nombre";
        rut = "Sin RUT";
        email = "Sin email";
        direccion = new Direccion();
    }

// Constructor con todos los datos de la persona.
// @param nombre = nombre completo
// @param rut = RUT de la persona
// @param email = correo de contacto
// @param direccion = domicilio registrado

    public Persona(String nombre, String rut, String email, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Nombre  : " + nombre +
               "\nRUT     : " + rut +
               "\nEmail   : " + email +
               "\nDir.    : " + direccion;
    }
}
