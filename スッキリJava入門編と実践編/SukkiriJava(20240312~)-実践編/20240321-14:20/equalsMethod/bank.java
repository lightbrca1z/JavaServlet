package equalsMethod;

public class bank {
	String name;
	String address;

	public bank(String name, String address) {
	        this.name = name;
	        this.address = address;
	 }
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if(!(o instanceof bank)) return false;
		bank r = (bank)o;
		if(!this.name.equals(r.name)) return false;
		if(!this.address.equals(r.address)) return false;
		return true;
	}
}
