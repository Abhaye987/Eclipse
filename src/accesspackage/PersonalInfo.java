package accesspackage;

import accessmodifierpackage.PersonalDetailsDisplay;

public class PersonalInfo extends PersonalDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PersonalInfo per=new PersonalInfo();
         PersonalDetailsDisplay p=new PersonalDetailsDisplay();
         System.out.println("Person Name "+per.name);
         System.out.println("Person Age "+per.age);
         System.out.println("Person Email id "+p.emailid);
	}

}
