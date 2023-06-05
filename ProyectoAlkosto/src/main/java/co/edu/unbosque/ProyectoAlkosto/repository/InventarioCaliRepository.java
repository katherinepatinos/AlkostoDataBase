package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioCali;

public interface InventarioCaliRepository extends CrudRepository<InventarioCali, Integer>{

	public Optional<InventarioCali> findByProducto(String producto);
	public List<InventarioCali> findAll();
}
