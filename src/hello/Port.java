package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hello.Service;

@Entity
@Table(name = "porturi")
public class Port {
	public Port(int nr, String type) {
		super();
		this.nr = nr;
		this.type = type;
	}

	public Port(int nr, String type, Service service) {
		super();
		this.nr = nr;
		this.type = type;
		this.service = service;
	}

	public Port() {
		super();
	}

	public Port(int idPort, int nr, String type, Service service) {
		super();
		this.idPort = idPort;
		this.nr = nr;
		this.type = type;
		this.service = service;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPort")
	private int idPort;

	@Column(name = "nr")
	private int nr;

	@Column(name = "type")
	private String type;

	@OneToOne
	@JoinColumn(name = "idService")
	private Service service;

	public int getIdPort() {
		return idPort;
	}

	public int getNr() {
		return nr;
	}

	public String getType() {
		return type;
	}

	public Service getService() {
		return service;
	}
}
