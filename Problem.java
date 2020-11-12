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
		//문제 : 판매자(Seller) 객체를 생성하여 이름, 차 판매가격, 핸드폰번호, 거래가능한 지역을 출력하세요. 
		Seller Seller = new Seller.Builder("아반떼", "010-xxxx-xxxx").setprice("500만원").setregion("Seoul").build();
		System.out.println(Seller.toString()); 
		//출력 예시 : Seller [name=아반떼, price=500만원, phoneNumber=010-xxxx-xxxx, region=Seoul]
	}

}
