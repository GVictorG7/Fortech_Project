package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.Port;
import hello.repo.jpa.PortDaoJpa;

@Service("portService")
public class PortService extends BaseServiceImpl<Port> implements BaseService<Port> {
	@Autowired
	private PortDaoJpa portJpa;

	@Override
	public Port get(int byId) {
		return portJpa.get(byId);
	}

	@Override
	public List<Port> list() {
		return null;
	}

	@Override
	public void save(Port t) {
		portJpa.persist(t);
	}

	@Override
	public void delete(int id) {
		portJpa.remove(id);
	}

}
