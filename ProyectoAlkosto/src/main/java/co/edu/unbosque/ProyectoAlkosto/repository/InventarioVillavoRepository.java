package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioVillavicencio;

public interface InventarioVillavoRepository extends CrudRepository<InventarioVillavicencio, Integer>{

	public Optional<InventarioVillavicencio> findByProducto(String producto);
	public List<InventarioVillavicencio> findAll();
}
