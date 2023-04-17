package vetores;

public class Rooms{
	private int roomnumber;
	private String name;
	private String email;
	private double value;	

	

	public Rooms(int roomnumber, String name, String email, double value) {
		this.roomnumber = roomnumber;
		this.name = name;
		this.email = email;
		this.value = value;
	}
	

	public int getRoomnumber() {
		return roomnumber;
	}


	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}


	
	public String toString() {
		return "\n"
				+ "Room number"+ roomnumber + "\n"
				+ "Name: "+ name + "\n"
				+ "Email: "+ email + "\n"
				+ " Value: "+ String.format("%.2f", value )+"\n";
				
	}}

