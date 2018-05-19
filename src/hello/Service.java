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

import hello.Vulnerability;

@Entity
@Table(name = "servicii")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idService")
	private int idService;

	@Column(name = "type")
	private String type;

	@Column(name = "name")
	private String name;

	@Column(name = "version")
	private String version;

	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "idService")
	private List<Vulnerability> vulnerabilities = new ArrayList<>();

	public Service(String type, String name, String version, List<Vulnerability> vulnerabilities) {
		super();
		this.type = type;
		this.name = name;
		this.version = version;
		this.vulnerabilities = vulnerabilities;
	}

	public Service() {
		super();
	}

	public Service(int idService, String type, String name, String version) {
		super();
		this.idService = idService;
		this.type = type;
		this.name = name;
		this.version = version;
	}

	public int getIdService() {
		return idService;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public List<Vulnerability> getVulnerabilities() {
		return vulnerabilities;
	}
}
