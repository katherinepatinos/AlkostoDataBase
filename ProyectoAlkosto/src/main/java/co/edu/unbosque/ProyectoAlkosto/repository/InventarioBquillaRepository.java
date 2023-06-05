package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioBquilla;

public interface InventarioBquillaRepository extends CrudRepository<InventarioBquilla, Integer>{

	public Optional<InventarioBquilla> findByProducto(String producto);
	public List<InventarioBquilla> findAll();
}
