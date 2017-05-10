package av.demo.hibernate.m2o.modal;

public class Customer {

	private int customerId;
	private String customerName;
	private Vendor parentObject;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, Vendor parentObject) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.parentObject = parentObject;
	}

	public Vendor getParentObject() {
		return parentObject;
	}

	public void setParentObject(Vendor parentObject) {
		this.parentObject = parentObject;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]\n";
	}
	
}
