package hello;

import java.util.ArrayList;

import hello.User;
import hello.repo.jpa.PortDaoJpa;
import hello.repo.jpa.StationDaoJpa;
import hello.repo.jpa.UserDaoJpa;
import hello.service.StationService;
import hello.service.UserService;

public class Main {

	public static void main(String[] args) {
		// UserDaoJpa jpa = new UserDaoJpa();
		// for (User u : jpa.getAll()) {
		// System.out.println(u.getUser());
		// }
		//

		// StationService stationService = new StationService();
		// stationService.save(new Station("10.200.132.61"));
		// Station st = stationService.get(1);
		// System.out.println(st.getIp());

		// PortDaoJpa jpa = new PortDaoJpa();
		// jpa.persist(new Port(80, "tcp", null));

		// StationDaoJpa jpa = new StationDaoJpa();
		// jpa.addPort(1, new Port(21, "tcp"));		
		

		System.out.println("done!");
	}
}
