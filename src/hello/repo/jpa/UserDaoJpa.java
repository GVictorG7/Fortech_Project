package hello.repo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import hello.User;
import hello.repo.UserDao;

@Repository("userJpa")
public class UserDaoJpa extends BaseDaoJpa<User> implements UserDao {
	public UserDaoJpa() {
		super(User.class);
	}

	public User getByUserAndPass(String user, String pass) {
		EntityManager em = getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u WHERE user = ? and pass = ?");
		query.setParameter(0, user);
		query.setParameter(1, pass);
		return (User) query.getSingleResult();
	}

	public List<User> getAll() {
		EntityManager em = getEntityManager();
		Query query = em.createQuery("SELECT e FROM User e");
		return (List<User>) query.getResultList();
	}
}
