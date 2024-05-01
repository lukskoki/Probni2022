package hr.fer.oop;

public class User {
	double OIB;
	String name;
	String surname;
	ServiceType serviceType;
	public User(double oIB, String name, String surname, ServiceType serviceType) {
		super();
		OIB = oIB;
		this.name = name;
		this.surname = surname;
		this.serviceType = serviceType;
	}
	public double getOIB() {
		return OIB;
	}
	public void setOIB(double oIB) {
		OIB = oIB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	@Override
	public String toString() {
		return "User [OIB=" + OIB + ", name=" + name + ", surname=" + surname + ", serviceType=" + serviceType + "]";
	}
	
	
	
	
	
}
