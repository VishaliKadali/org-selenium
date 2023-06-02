package javachallenge;

import com.github.javafaker.Faker;

public class RandomUsingFaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Faker faker=new Faker();
		String randomName=faker.name().fullName();
		System.out.println(randomName);
		
		String randomLastName=faker.name().lastName();
		System.out.println(randomLastName);
		
		
		// Generate random address
        String randomAddress = faker.address().fullAddress();
        System.out.println("Random Address: " + randomAddress);

        // Generate random phone number
        String randomPhoneNumber = faker.phoneNumber().cellPhone();
        System.out.println("Random Phone Number: " + randomPhoneNumber);
		/*
		 * StringBuilder sb=new StringBuilder(); sb.append(randomLastName);
		 * System.out.println(sb.append(randomLastName));
		 */
	}

}
