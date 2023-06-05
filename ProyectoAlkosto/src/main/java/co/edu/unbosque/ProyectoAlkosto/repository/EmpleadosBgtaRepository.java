package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosBogota;

public interface EmpleadosBgtaRepository extends JpaRepository<EmpleadosBogota, Integer> {

	public List<EmpleadosBogota> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosBogota> findByNombre(String nombre);
}