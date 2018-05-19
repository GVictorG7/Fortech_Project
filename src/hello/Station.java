package hello;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import hello.Port;

@Entity
@Table(name = "statii")
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStation")
	private int idStation;

	@Column(name = "ip")
	private String ip;

	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "idStation")
	private List<Port> ports = new ArrayList<>();

	public Station(String ip, List<Port> ports) {
		super();
		this.ip = ip;
		this.ports = ports;
	}

	public Station() {
		super();
		this.ports = new ArrayList<>();
	}

	public Station(int idStation, String ip, List<Port> ports) {
		super();
		this.idStation = idStation;
		this.ip = ip;
		this.ports = ports;
	}

	public Station(int idStation, String ip) {
		super();
		this.idStation = idStation;
		this.ip = ip;
		this.ports = new ArrayList<>();
	}

	public Station(String ip) {
		super();
		this.ip = ip;
		this.ports = new ArrayList<>();
	}

	public int getIdStation() {
		return idStation;
	}

	public String getIp() {
		return ip;
	}

	public List<Port> getPorts() {
		return ports;
	}

	public void addPort(Port port) {
		ports.add(port);
	}

	public void setIdStation(int idStation) {
		this.idStation = idStation;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setPorts(List<Port> ports) {
		this.ports = ports;
	}
}
