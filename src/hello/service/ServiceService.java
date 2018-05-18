package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.repo.jpa.ServiceDaoJpa;

@Service("serviceService")
public class ServiceService extends BaseServiceImpl<Service> implements BaseService<Service> {
	@Autowired
	private ServiceDaoJpa serviceJpa;

	@Override
	public Service get(int byId) {
		return serviceJpa.get(byId);
	}

	@Override
	public List<Service> list() {
		return null;
	}

	@Override
	public void save(Service t) {
		serviceJpa.persist(t);
	}

	@Override
	public void delete(int id) {
		serviceJpa.remove(id);
	}
}
