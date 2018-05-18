package hello.repo.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import hello.repo.ServiceDao;

@Repository("serviceJpa")
public class ServiceDaoJpa extends BaseDaoJpa<Service> implements ServiceDao {
	public ServiceDaoJpa() {
		super(Service.class);
	}
}
