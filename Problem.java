package problem1;

class Seller {  
    private final String name;
    private final String price;

    private final String phoneNumber;
    private final String region;
    
    public static class Builder {
        private String name = "";
        private String price = "";
        private String phoneNumber = "";
        private String region = "";
    
        public Builder(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
        
        public Builder setregion(String region) { this.region = region; return this;}
        public Builder setprice(String price) { this.price = price; return this;}
        
        public Seller build() {
            return new Seller(this);
        }
    }
    
    public Seller(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.phoneNumber = builder.phoneNumber;
        this.region = builder.region;
    }

	@Override
	public String toString() {
		return "Seller [name=" + name + ", price=" + price + ", phoneNumber=" + phoneNumber + ", region=" + region
				+ "]";
	}
}

public class Problem {

	public static void main(String[] args) {
		//���� : �Ǹ���(Seller) ��ü�� �����Ͽ� �̸�, �� �ǸŰ���, �ڵ�����ȣ, �ŷ������� ������ ����ϼ���. 
		Seller Seller = new Seller.Builder("�ƹݶ�", "010-xxxx-xxxx").setprice("500����").setregion("Seoul").build();
		System.out.println(Seller.toString()); 
		//��� ���� : Seller [name=�ƹݶ�, price=500����, phoneNumber=010-xxxx-xxxx, region=Seoul]
	}

}
