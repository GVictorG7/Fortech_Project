package hello.repo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hello.Port;
import hello.Station;
import hello.repo.StationDao;

@Repository("stationJpa")
public class StationDaoJpa extends BaseDaoJpa<Station> implements StationDao {
	public StationDaoJpa() {
		super(Station.class);
	}

	@Autowired
	private PortDaoJpa portJpa = new PortDaoJpa();

	public List<Station> getAll() {
		EntityManager em = getEntityManager();
		Query query = em.createQuery("SELECT e FROM Station e");
		return (List<Station>) query.getResultList();
	}

	@Override
	public Station update(Station entity) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		Station t = em.merge(entity);
		em.flush();
		em.getTransaction().commit();
		return t;
	}

	public void addPort(int id, Port port) {
		portJpa.persist(port);

		EntityManager em = getEntityManager();
		Query query = em.createQuery("update Port set idStation = 11 where idPort=?");
		query.setParameter(0, id);
		query.getFirstResult();
	}
}
