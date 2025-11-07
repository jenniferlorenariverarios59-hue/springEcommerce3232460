package com.sena.springecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // anoataciones JPA
	private Integer id;
	private String nombre;
	private Double precio;
	private Integer catidad;
	private String descripcion;
	private String imagen;

	@ManyToOne
	private Usuario usuario;

	public Producto() {

	}

	public Producto(Integer id, String nombre, Double precio, Integer catidad, String descripcion, String imagen,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.catidad = catidad;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getCatidad() {
		return catidad;
	}

	public void setCatidad(Integer catidad) {
		this.catidad = catidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", catidad=" + catidad
				+ ", descripcion=" + descripcion + ", imagen=" + imagen + "]";
	}

}
