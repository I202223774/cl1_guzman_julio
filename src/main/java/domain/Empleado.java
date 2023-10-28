package domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity(name="tbl_empleados")
@NamedQuery(name="nombreQuery", query = "from tbl_empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="ape_pat", length = 100, nullable = false)
	private String apellido_paterno;
	
	@Column(name="ape_mat", length = 100, nullable = false)
	private String apelllido_materno;
	
	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;
	private Integer nro_hijos;
	private Double sueldo;
	private LocalDate fecha_nacimiento;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApelllido_materno() {
		return apelllido_materno;
	}
	public void setApelllido_materno(String apelllido_materno) {
		this.apelllido_materno = apelllido_materno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public Integer getNro_hijos() {
		return nro_hijos;
	}
	public void setNro_hijos(Integer nro_hijos) {
		this.nro_hijos = nro_hijos;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", apellido_paterno=" + apellido_paterno + ", apelllido_materno="
				+ apelllido_materno + ", nombres=" + nombres + ", nro_hijos=" + nro_hijos + ", sueldo=" + sueldo
				+ ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}
	
		
	

}
