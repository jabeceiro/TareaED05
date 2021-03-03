package cuentas;

/**
 * Clase para manejar cuentas bancarias.
 * 
 * @author Juan
 *
 */
public class CCuenta {

	/**
	 * Nombre y apellidos del titular de la cuenta.
	 */
	private String nombre;

	/**
	 * Número de cuenta bancaria.
	 */
	private String cuenta;

	/**
	 * Saldo de la cuenta.
	 */
	private double saldo;

	/**
	 * Tipo de interés de la cuenta.
	 */
	private double tipoInteres;

	/**
	 * Constructor vacío de la clase CCuenta.
	 */
	public CCuenta() {
	}

	/**
	 * Constructor con todos los campos de la clase CCuenta.
	 * 
	 * @param nom  Nombre del titular.
	 * @param cue  Número de cuenta.
	 * @param sal  Saldo de la cuenta.
	 * @param tipo Tipo de interés.
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Obtener el estado de la cuenta.
	 * 
	 * @return saldo de la cuenta.
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Realizar un ingreso en la cuenta.
	 * 
	 * @param cantidad Cantidad de dinero a ingresar.
	 * @throws Exception No se puede ingresar una cantidad negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Retirar dinero de la cuenta.
	 * 
	 * @param cantidad Cantidad de dinero a retirar.
	 * @throws Exception No se puede retirar una cantidad negativa. No se puede
	 *                   retirar una cantidad mayor que el saldo disponible.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Obtener el nombre del titular de la cuenta.
	 * 
	 * @return Nombre del titular.
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Asignar el nombre del titular de la cuenta.
	 * 
	 * @param nombre Nombre del titular.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el número de cuenta.
	 * 
	 * @return Número de cuenta.
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Asignar el número de cuenta.
	 * 
	 * @param cuenta Número de cuenta a asignar.
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtener el saldo de la cuenta.
	 * 
	 * @return El saldo de la cuenta.
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Asignar el saldo de la cuenta.
	 * 
	 * @param saldo Saldo a asignar.
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtener el tipo de interés de la cuenta.
	 * 
	 * @return El tipo de interés.
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establecer el tipo de interés de la cuenta.
	 * 
	 * @param tipoInteres Tipo de interés a asignar.
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
