package hello.service;

import java.util.List;

import hello.repo.jpa.BaseDaoJpa;

public class BaseServiceImpl<T> implements BaseService<T> {
	private BaseDaoJpa<T> dao;

	@Override
	public T get(int byId) {
		return dao.get(byId);
	}

	@Override
	public List<T> list() {
		return null;
	}

	@Override
	public void save(T t) {
		dao.persist(t);
	}

	@Override
	public void delete(int id) {
		dao.remove(id);
	}
}
