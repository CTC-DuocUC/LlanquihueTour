package model;

/**
 * Representa a un guia turistico de Llanquihue Tour.
 * Hereda los datos generales de Persona y agrega su especialidad.
 */
public class GuiaTuristico extends Persona {

    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico() {
        super();
        especialidad = "Sin especialidad";
        aniosExperiencia = 0;
    }

    /**
     * Constructor con todos los datos del guia.
     * @param nombre nombre del guia
     * @param rut RUT del guia
     * @param email correo de contacto
     * @param direccion domicilio del guia
     * @param especialidad tipo de tour que realiza
     * @param aniosExperiencia cuanto tiempo lleva en el rubro
     */
    public GuiaTuristico(String nombre, String rut, String email, Direccion direccion,
                         String especialidad, int aniosExperiencia) {
        super(nombre, rut, email, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getAniosExperiencia() { return aniosExperiencia; }
    public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

    @Override
    public String toString() {
        return super.toString() +
               "\nEspec.  : " + especialidad +
               "\nExp.    : " + aniosExperiencia + " anios";
    }
}