package pl.blajar.erpsystem.beans;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.Query;

import pl.blajar.erpsystem.entity.Cargo;

@Local
interface ExampleBeanLocal {

	public void addMovie(Cargo cargo) throws Exception ;

    public void deleteMovie(Cargo cargo) throws Exception ;

    public List<Cargo> getMovies() throws Exception ;
    
}
