package projeMernis.concrete;

import projeMernis.abstracts.BaseCustomerManager;
import projeMernis.abstracts.CustomerCheckService;
import projeMernis.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
