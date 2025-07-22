package hasaRelationship;

public class Student 
{
	int rollno;
	
	String name;
	
	Address addr;
	
	public void setAddr(Address addr)
	{
		this.addr=addr;
	}
	
	public Address getAddr()
	{
		return addr;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}

}

