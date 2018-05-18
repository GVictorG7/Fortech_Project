package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.User;
import hello.repo.jpa.UserDaoJpa;

@Service("userService")
public class UserService extends BaseServiceImpl<User> implements BaseService<User> {
	@Autowired
	private UserDaoJpa userJpa;

	public User getByUserAndPass(String user, String pass) {
		return userJpa.getByUserAndPass(user, pass);
	}

	@Override
	public User get(int byId) {
		return userJpa.get(byId);
	}

	@Override
	public List<User> list() {
		return null;
	}

	@Override
	public void save(User t) {
		userJpa.persist(t);
	}

	@Override
	public void delete(int id) {
		userJpa.remove(id);
	}
}
