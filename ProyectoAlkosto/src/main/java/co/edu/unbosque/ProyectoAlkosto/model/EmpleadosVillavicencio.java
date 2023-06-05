package co.edu.unbosque.ProyectoAlkosto.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpleadosVillavicencio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column (unique = true)
	private String nombre;
  	private Date nacimiento;
	private String sexo;
  	private Date ingreso;
	private int ventas;
	private String productosVendidos;
	
	public EmpleadosVillavicencio() {
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

  	public Date getNacimiento() {
  		return nacimiento;
  	}
  
  	public void setNacimiento(Date nacimiento) {
  		this.nacimiento = nacimiento;
  	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

  	public Date getIngreso() {
  		return ingreso;
  	}
  
  	public void setIngreso(Date ingreso) {
  		this.ingreso = ingreso;
  	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public String getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(String productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
