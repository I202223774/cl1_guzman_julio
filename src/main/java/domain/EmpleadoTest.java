package domain;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmpleadoTest {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("examen");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		
		
		//Create
		//Empleado e = new Empleado();
		//e.setApellido_paterno("Toledo");
		//e.setApelllido_materno("Manrique");
		//e.setNombres("Alejandro");
		//e.setNro_hijos(2);
		//e.setSueldo(1500.0);
		//LocalDate fechaNacimiento = LocalDate.of(1950, 5, 6);
		//e.setFecha_nacimiento(fechaNacimiento);
		//manager.persist(e);
		
		//Update
		//Empleado e = new Empleado();
		//e.setId(4L);
		//e.setApellido_paterno("Fujimori");
		//e.setApelllido_materno("Fujimori");
		//e.setNombres("Keiko");
		//e.setNro_hijos(2);
		//e.setSueldo(1500.0);
		//LocalDate fechaNacimiento = LocalDate.of(1950, 5, 6);
		//e.setFecha_nacimiento(fechaNacimiento);
		//manager.merge(e);
		
		//Eliminar
		Empleado e = manager.getReference(Empleado.class, 2L);
		manager.remove(e);
		
		//Listar
		tx.commit();
		
		List<Empleado> lista = manager.createQuery("from tbl_empleados", Empleado.class).getResultList();
		for (Empleado empleado : lista) {
			System.out.println(empleado);
			
		}

	}

}
