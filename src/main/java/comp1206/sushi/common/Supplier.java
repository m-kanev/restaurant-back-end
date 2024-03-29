package comp1206.sushi.common;

import java.io.Serializable;

import comp1206.sushi.common.Supplier;

public class Supplier extends Model  implements Serializable{

	private String name;
	private Postcode postcode;
	private Number distance;

	public Supplier(String name, Postcode postcode) {
		this.name = name;
		this.postcode = postcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Postcode getPostcode() {
		return this.postcode;
	}
	
	public void setPostcode(Postcode postcode) {
		this.postcode = postcode;
	}

	public Number getDistance() {
//		System.out.println("NOW" + postcode.getName());
		return postcode.getDistance();
	}
//	public Number getDistance() {
//		return distance;
//	}

}
