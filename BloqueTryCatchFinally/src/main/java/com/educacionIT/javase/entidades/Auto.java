package com.educacionIT.javase.entidades;

import com.educacionIT.javase.interfaces.Archivo;
import com.educacionIT.javase.interfaces.MantenimientoMecanico;


public abstract class Auto implements MantenimientoMecanico, Archivo{
	private String color;
	private String marca;
	private Patente patente;
	public static String concesionaria = "Autos EducacionIT";
	private Integer puestos;

	public Auto() {
	}

	public Auto(String color, String marca, Patente patente, Integer puestos) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.puestos = puestos;
	}

	/*
	 * Sobreescribimos el metodo toString para tener las caracteristicas mas
	 * genericas de un Auto en dado caso que un hijo no sobreescriba dicho metodo
	 */
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", puestos=" + puestos + "]";
	}

	/* Metodo abstracto que se implementara obligatoriamente en las clases Hijas */
	public abstract void vender();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Patente getPatente() {
		return patente;
	}

	public void setPatente(Patente patente) {
		this.patente = patente;
	}

	public Integer getPuestos() {
		return puestos;
	}

	public void setPuestos(Integer puestos) {
		this.puestos = puestos;
	}

	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}

}