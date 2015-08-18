package pl.blajar.erpsystem.dao;

import java.util.List;

import pl.blajar.erpsystem.entity.Cargo;

public interface CargoDao {

	public void addCargo(Cargo cargo);
	public List<Cargo> getAllCargo();
}
