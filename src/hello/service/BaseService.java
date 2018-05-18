package hello.service;

import java.util.List;

public interface BaseService<T> {
	T get(int byId);

	List<T> list();

	void save(T t);

	void delete(int id);

}
