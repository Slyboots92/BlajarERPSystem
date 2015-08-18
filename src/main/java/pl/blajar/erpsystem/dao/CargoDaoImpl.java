package pl.blajar.erpsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.blajar.erpsystem.entity.Cargo;

public class CargoDaoImpl implements CargoDao{

	@PersistenceContext(unitName = "blajarerp")
    private EntityManager entityManager;
	
	
	@Override
	public void addCargo(Cargo cargo) {
		entityManager.persist(cargo);
		
	}

	@Override
	public List<Cargo> getAllCargo() {
		return null;
	}

}
