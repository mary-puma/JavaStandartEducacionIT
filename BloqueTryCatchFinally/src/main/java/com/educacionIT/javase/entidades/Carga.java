package com.educacionIT.javase.entidades;

import java.util.Date;

public class Carga extends Transporte {

	private Float capacidad;
	private Integer ejes;

	public Carga() {
		super();
	}

	public Carga(String color, String marca, Patente patente, int puestos, String licencia, String tipo,
			Float capacidad, Integer ejes) {
		super(color, marca, patente, puestos, licencia, tipo);
		this.capacidad = capacidad;
		this.ejes = ejes;
	}

	@Override
	public String toString() {
		return "Carga [toString()=" + super.toString() + ", capacidad=" + capacidad + ", ejes=" + ejes + "]";
	}

	public Float getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Float capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getEjes() {
		return ejes;
	}

	public void setEjes(Integer ejes) {
		this.ejes = ejes;
	}

	public void vender() {
		// algoritmo para vender el auto
		System.out.println("Transporte de Carga vendido (" + this + ")");
	}
	// Para este ejemplo los metodos tienen practicamente el mismo comportamiento
	// pero la idea es que cada clase implemente su algoritmo sugn la necesidad

	@Override
	public boolean reparar(Date fecha, String autoParte, String mecanico) {
		System.out.println(
				"Reparación de " + autoParte + " " + this.getPatente() + " en la fecha " + fecha + " por " + mecanico);
		return true;
	}

	@Override
	public boolean cambioPieza(Date fecha, String autoParte) {
		System.out.println("Cambio de " + autoParte + " " + this.getPatente() + " en la fecha " + fecha);
		return true;
	}

	@Override
	public String cambioAceite(Date fecha, String autoParte, String marca, String tipo, Float cantidad) {
		// TODO Auto-generated method stub
		return "Se cambio el aceite al Transporte de Carga " + getPatente() + " Marca " + marca + ", Tipo " + tipo
				+ " y fueron " + cantidad + " Lts.";
	}

	@Override
	public void lavar(Date fecha, String tipo) {
		System.out.println("Se lavo el Transporte de Carga con el metodo " + tipo + " en la fecha " + fecha);
	}

	@Override
	public boolean imprimir(String impresora) {
		System.out.println(
				"Se ha enviado la impresion del Transporte de Carga " + getPatente() + " a la impresora " + impresora);
		return true;
	}

	@Override
	public boolean guardar(String tipoArchivo) {
		System.out.println(
				"Se ha enviado guardado del Transporte de Carga " + getPatente() + " en formato " + tipoArchivo);
		return true;
	}
}