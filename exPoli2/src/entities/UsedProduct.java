package entities;

public class UsedProduct extends Products{
		private String manufactureDate;
	
		public UsedProduct() {}
		
		public UsedProduct(String name, double price, String manufactureDate) {
			super(name, price);
			this.manufactureDate = manufactureDate;
		}

		public String getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(String manufactureDate) {
			this.manufactureDate = manufactureDate;
		}
		
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + "(Manufacture date: "
	+ manufactureDate + " )";
	}
		
}
