package Election;

public class Election {
 private int election_id;
 private String name;
 private String election_date;
 private String district;
 private String constituency;
 private String counting_date;
 
 public Election(int election_id, String name, String election_date, String district, String constituency,
			String counting_date) {
		super();
		this.election_id = election_id;
		this.name = name;
		this.election_date = election_date;
		this.district = district;
		this.constituency = constituency;
		this.counting_date = counting_date;
	}

	


	public int getElection_id() {
		return election_id;
	}
	
	public void setElection_id(int election_id) {
		this.election_id = election_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getElection_date() {
		return election_date;
	}
	
	public void setElection_date(String election_date) {
		this.election_date = election_date;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getConstituency() {
		return constituency;
	}
	
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	
	
	public String getCounting_date() {
		return counting_date;
	}
	
	
	public void setCounting_date(String counting_date) {
		this.counting_date = counting_date;
	}
	
	
	
	public int hashCode() {
		int code=0;
		code = election_id*20;
	    code += name.hashCode();
	    return name.hashCode();
	}


	public boolean equals(Object o)
	{
		boolean flag = false;
		if(o instanceof Election)
		{
			Election p = (Election) o;
			if(p.name == this.name)
			{
				flag = true;
			}
			
		}
		return flag;
	}
  
	public String toString()
	{
		return "election_id: " + election_id + " \nname: " + name + " \nelection_date: " + election_date + " \ndistrict: " + district + " \nconstituency: " + constituency + " \ncounting_date" + counting_date;
	}
}
