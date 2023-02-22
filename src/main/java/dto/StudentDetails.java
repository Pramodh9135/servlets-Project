package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	private int id;
	private String name;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
}
