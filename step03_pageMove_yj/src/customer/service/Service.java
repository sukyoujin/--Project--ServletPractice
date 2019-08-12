package customer.service;

import customer.dto.CustomerDTO;
import customer.model.CustomerDAO;

public class Service {
	private static Service instance = new Service();

	private Service() {
	};

	public static Service getInstance() {
		return instance;
	}

	public boolean add(CustomerDTO customer) {
		if (customer != null && customer.getId().length() != 0) {
			if (!CustomerDAO.haveOrNot().contains(customer.getId())) {
				CustomerDAO.addCustomer(customer);
				return true;
			}
		}
		return false;
	}
}