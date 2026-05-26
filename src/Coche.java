/**
 * Clase que representa la entidad Coche.
 * @author Franco
 * @version 2.0
 */
public class Coche {
    private String matricula;
    private String modelo;
    private Integer velocidad;
    private double kilometrosRecorridos;
    private double gasolinaLitros;

    /**
     * Constructor de la clase Coche.
     * @param modelo Modelo del vehículo.
     * @param matricula Matrícula única del vehículo.
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.kilometrosRecorridos = 0.0;
        this.gasolinaLitros = 50.0;
    }

    /**
     * Obtiene la matricula del coche.
     * @return La matricula actual.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matricula del coche.
     * @param matricula Nueva matricula.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el modelo del coche.
     * @return El modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del coche.
     * @param modelo Nuevo modelo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la velocidad actual.
     * @return Velocidad en km/hr.
     */
    public Integer getVelocidad() {
        return velocidad;
    }

    /**
     * Establece la velocidad actual.
     * @param velocidad Nueva velocidad.
     */
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Obtiene los kilometros recorridos totales.
     * @return Kilometros acumulados.
     */
    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    /**
     * Establece los kilometros recorridos.
     * @param kilometrosRecorridos Nuevos kilometros.
     */
    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    /**
     * Obtiene los litros de gasolina restantes.
     * @return Litros de combustible.
     */
    public double getGasolinaLitros() {
        return gasolinaLitros;
    }

    /**
     * Establece los litros de gasolina en el deposito.
     * @param gasolinaLitros Nuevos litros de gasolina.
     */
    public void setGasolinaLitros(double gasolinaLitros) {
        this.gasolinaLitros = gasolinaLitros;
    }
}