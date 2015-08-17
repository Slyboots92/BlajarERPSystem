package pl.blajar.erpsystem.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.blajar.erpsystem.entity.Cargo;

@Stateless
public class ExampleBean implements ExampleBeanLocal{

	@PersistenceContext(unitName = "movie-unit")
    private EntityManager entityManager;
	
	public void addMovie(Cargo cargo) throws Exception {
        entityManager.persist(cargo);
    }

    public void deleteMovie(Cargo cargo) throws Exception {
        entityManager.remove(cargo);
    }

    public List<Cargo> getMovies() throws Exception {
        Query query = entityManager.createQuery("SELECT m from Cargo as m");
        return query.getResultList();
    }
}
