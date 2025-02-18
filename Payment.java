public class Payment {

	private String paymentID;
	private double amount;
	private String paymentType;
	private String status;

	/**
	 * 
	 * @param paymentType
	 * @param amount
	 */
	public String Payment(String paymentType, double amount) {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bookingID
	 */
	public String viewPaymentDetails(String bookingID) {
		// TODO - implement Payment.viewPaymentDetails
		throw new UnsupportedOperationException();
	}

	public String getPaymentID() {
		return this.paymentID;
	}

	/**
	 * 
	 * @param paymentID
	 */
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public double getAmount() {
		return this.amount;
	}

	/**
	 * 
	 * @param amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	/**
	 * 
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}