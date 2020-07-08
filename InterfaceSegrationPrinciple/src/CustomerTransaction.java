import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

	private List<Product> products;
	private Customer customer;

	public CustomerTransaction(Customer customer,List<Product> products) {
	     	 this.customer=customer;
	     	 this.products=products;
	 }

	@Override
	public String getName() {
		return customer.getName();
	}

	@Override
	public Date getDate() {
		return new Date();
	}

	@Override
	public String productBreakDown() {
		String reportList=null;
		for (Product product :products  ) {
			 reportList +=product.getProductname();
			 
		}
		return reportList;
	}

	@Override
	public void prepateInvoice() {
		System.out.println("invoice prepared ....");
	}

	@Override
	public void chargeCustomer() {
		System.out.println("Charged the Customer ...");
	}
}
