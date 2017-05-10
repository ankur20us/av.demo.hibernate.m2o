package av.demo.hibernate.m2o.modal;

public class Vendor {

	private int vendorId;
	private String vendorName;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + "]";
	}

}
