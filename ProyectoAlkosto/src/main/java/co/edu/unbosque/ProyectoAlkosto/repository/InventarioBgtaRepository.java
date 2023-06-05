package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import co.edu.unbosque.ProyectoAlkosto.model.InventarioBogota;

public interface InventarioBgtaRepository extends CrudRepository<InventarioBogota, Integer> {

	public Optional<InventarioBogota> findByProducto(String producto);
	public List<InventarioBogota> findAll();
}
