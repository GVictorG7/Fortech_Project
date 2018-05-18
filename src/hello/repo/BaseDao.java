package hello.repo;

public interface BaseDao<T> {
	void persist(T entity);

	T update(T entity);

	void remove(int id);

	T get(int id);

	// List<T> getAll();

}
