package hello.repo.jpa;

import org.springframework.stereotype.Repository;

import hello.Port;
import hello.repo.PortDao;

@Repository("portJpa")
public class PortDaoJpa extends BaseDaoJpa<Port> implements PortDao {
	public PortDaoJpa() {
		super(Port.class);
	}
}
