package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosCali;

public interface EmpleadosCaliRepository extends JpaRepository<EmpleadosCali, Integer> {

	public List<EmpleadosCali> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosCali> findByNombre(String nombre);
}