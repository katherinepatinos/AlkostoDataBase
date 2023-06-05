package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosVillavicencio;

public interface EmpleadosVillavoRepository extends JpaRepository<EmpleadosVillavicencio, Integer> {

	public List<EmpleadosVillavicencio> findByOrderByVentasDesc();
	public void deleteByNombre(String nombre);
	public Optional<EmpleadosVillavicencio> findByNombre(String nombre);
}