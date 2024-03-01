package customer;

public class Address {
        private String addressLine;
        private String city;
        private String pincode;

        public Address(String addressLine, String city, String pincode) {
                this.addressLine = addressLine;
                this.city = city;
                this.pincode = pincode;
        }


        @Override
        public String toString() {
                return "Address{" +
                        "addressLine='" + addressLine + "\'"+
                        ", city='" + city + '\'' +
                        ", pincode='" + pincode + '\'' +
                        '}';
        }
}
