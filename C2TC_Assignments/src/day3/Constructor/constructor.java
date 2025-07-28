package day3.Constructor;

public class constructor {
	
	private int id;
	private String name;
	private String city;
	
	// default constructor(explicit)
	public constructor() {
//		this.id=100;
//		this.name="kalai";
//		this.city="pondy";
		//System.out.println("Default constructor is called");
	}
	
	//paramaterised constructor
	
	public constructor(int id, String name, String city) 
	{
		//this();// this method invoke default constructor
		
		this(202,"kani");
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	
	// constructor overloading()
	public constructor(int id, String name) 
	{
		System.out.println("2 parameter constructor");
		this.id=id;
		this.name=name;
		
	}
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "constructor [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	

}
