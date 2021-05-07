package projeMernis;

import java.util.Date;
import projeMernis.abstracts.BaseCustomerManager;
import projeMernis.adapters.MernisServiceAdapter;
import projeMernis.concrete.StarbucksCustomerManager;
import projeMernis.entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer gulsena = new Customer(1, "Gülsena", "Yýlancý", new Date(1996, 9, 13), "43465932714");

		customerManager.save(gulsena);

	}

}
