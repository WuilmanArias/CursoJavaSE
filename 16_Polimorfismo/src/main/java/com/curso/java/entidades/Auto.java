/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.entidades;

import com.curso.java.interfaces.MetodosLavado;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 15_Interfaces
 * @class Auto
 * @description
 * @date 17 jun. 2020
 */
public abstract class Auto implements MetodosLavado {

	// atributos o caracteristicas
	private String color;
	private String marca;
	private String patente;
	private boolean encendido;

	/**
	 * constructor simple por defecto
	 */
	public Auto() {

	}

	/**
	 * Constructor para Instanciar los objetos e inicializar los atributos al mismo
	 * tiempo
	 *
	 * @param color
	 * @param marca
	 * @param patente
	 * @param encendido
	 */
	public Auto(String color, String marca, String patente, boolean encendido) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	// metodo 1
	public void encendido(boolean parametroEncendido) {
		this.encendido = parametroEncendido;
	}

	public abstract void mostrarDatos();

	/**
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
