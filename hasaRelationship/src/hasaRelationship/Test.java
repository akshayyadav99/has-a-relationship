package hasaRelationship;

public class Test 
{
	public static void main(String[] args) 
	{
		Address adr = new Address();
				adr.setCityname("pune");
				adr.setAreaname("karvenagar");
				
		Student stu=new Student();
				stu.setRollno(1);
				stu.setName("abc");
				stu.setAddr(adr);
				
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr().getCityname());
		System.out.println(stu.getAddr().getAreaname());
			
	}
}
