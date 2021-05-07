package projeMernis.concrete;

import projeMernis.abstracts.CustomerCheckService;
import projeMernis.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
