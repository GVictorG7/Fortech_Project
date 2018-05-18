package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.Port;
import hello.Station;
import hello.repo.jpa.StationDaoJpa;

@Service("stationService")
public class StationService extends BaseServiceImpl<Station> implements BaseService<Station> {
	@Autowired
	private StationDaoJpa stationJpa;

	@Override
	public Station get(int byId) {
		return stationJpa.get(byId);
	}

	@Override
	public List<Station> list() {
		return null;
	}

	@Override
	public void save(Station t) {
		stationJpa.persist(t);
	}

	@Override
	public void delete(int id) {
		stationJpa.remove(id);
	}

	public List<Station> getAll() {
		return stationJpa.getAll();
	}

	public void addPort(int id, Port port) {
		stationJpa.addPort(id, port);
	}
}
