
public class AccountReceivable {
	private Accounting customerTransaction;
    public AccountReceivable(Accounting customerTransactions) {
		customerTransaction=customerTransactions;
	}
	public void postpayment() {
		customerTransaction.chargeCustomer();
	}

	public void sendInvoice() {
		customerTransaction.prepateInvoice();
	}
}
