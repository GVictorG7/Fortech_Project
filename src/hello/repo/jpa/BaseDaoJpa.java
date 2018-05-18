package hello.repo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hello.repo.BaseDao;

public class BaseDaoJpa<T> implements BaseDao<T> {
	protected Class<T> entityClass;

	public BaseDaoJpa(Class<T> clazz) {
		this.entityClass = clazz;
	}

	private static final String PERSISTENCE_UNIT_NAME = "sample";
	private static EntityManagerFactory factory;

	public static EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		return em;
	}

	@Override
	public void persist(T entity) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public T update(T entity) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		T t = em.merge(entity);
		em.flush();
		em.getTransaction().commit();
		return t;
	}

	@Override
	public void remove(int id) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		T t = em.find(entityClass, id);
		em.remove(t);
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public T get(int id) {
		EntityManager em = getEntityManager();
		return em.find(entityClass, id);
	}
}
