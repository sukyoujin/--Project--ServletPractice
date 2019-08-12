package customer.model;

import java.util.ArrayList;

import customer.dto.CustomerDTO;

public class CustomerDAO {
	
	static ArrayList<CustomerDTO> customers = new ArrayList<CustomerDTO>();
	
	static {
		customers.add(new CustomerDTO("Suk", "1234", "Gold"));
		customers.add(new CustomerDTO("Woo", "1234", "Silver"));
		customers.add(new CustomerDTO("Lee", "1234", "Black"));
	}
	
	//모든 Customer ArrayList 반환
	public static ArrayList<CustomerDTO> getCustomers(){
		return customers;
	}
	
	//customer 저장 메소드
	public static void addCustomer(CustomerDTO customer) {
//		System.out.println("---");
		customers.add(customer);
	}
	
	//회원 중복 가입 검증 메소드
	public static ArrayList<String> haveOrNot() {
		ArrayList<String> join = new ArrayList<>();	
		for(CustomerDTO c : customers) {
			join.add(c.getId());
		}
//		System.out.println(join);
		return join;
	}

}
