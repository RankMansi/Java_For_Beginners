import java.util.Properties;

public class Property1 {
    private String Location;
    private int pId;
    private long price_per_yard;
    private long areaInYard;
    private static int propertyCount = 0;

    public Property1() {
        propertyCount++;
    }

    // Parameterized constructor
    public Property1(String Location, int pId, long areaInYard, long price_per_yard) {
        this.Location = Location;
        this.pId = pId;
        this.areaInYard = areaInYard;
        this.price_per_yard = price_per_yard;
    }

    // Copy constructor
    public Property1(Property1 p1) {
        this.Location = p1.Location;
        this.pId = p1.pId;
        this.areaInYard = p1.areaInYard;
        this.price_per_yard = p1.price_per_yard;
        propertyCount++;
    }

    // Methods
    public long calculatePriceOfProperty() {
        return (areaInYard * price_per_yard);
    }

    public void printPropertyInfo() {
        System.out.println("Location: " + Location);
        System.out.println("Residency Number: " + pId);
        System.out.println("Area (in square yards): " + areaInYard);
        System.out.println("Price per square yard: Rs" + price_per_yard);
    }

    public static int getTotalCount() {
        return propertyCount;
    }

    // Getter and Setter methods
    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public long getAreaInYard() {
        return areaInYard;
    }

    public void setAreaInYard(long areaInYard) {
        this.areaInYard = areaInYard;
    }

    public long getPricePerYard() {
        return price_per_yard;
    }

    public void setPricePerYard(long price_per_yard) {
        this.price_per_yard = price_per_yard;
    }

    // Nested subclass
    public static class FurnishedHome extends Property1 {
        private double furnitureCharge;

        // Default constructor
        public FurnishedHome() {
            super();
        }

        // Parameterized constructor
        public FurnishedHome(String Location, int pId, long areaInYard, long price_per_yard, double furnitureCharge) {
            super(Location, pId, areaInYard, price_per_yard);
            this.furnitureCharge = furnitureCharge;
        }

        // Override calculatePriceOfProperty method
        @Override
        public long calculatePriceOfProperty() {
            long basePrice = super.calculatePriceOfProperty();
            return (long) (basePrice + 1.05 * basePrice);
        }

        // Override printPropertyInfo method
        @Override
        public void printPropertyInfo() {
            super.printPropertyInfo();
            System.out.println("Furniture Charge: Rs" + furnitureCharge);
        }
    }
    public static class Shop extends Property1{
        private long price;
        //default
        public Shop() {
            super();
        }

        public Shop(String Location, int pId, long areaInYard, long price_per_yard, long price) {
            super(Location, pId, areaInYard, price_per_yard);
            this.price = price;
        }

        @Override
        public long calculatePriceOfProperty() {
            long basePrice = super.calculatePriceOfProperty();
            return (long) (basePrice + 1.04 * basePrice);
        }

        @Override
        public void printPropertyInfo() {
            super.printPropertyInfo();
            System.out.println("Furniture Charge: Rs" + price);
        }
        public final long getTotalPrice(Property1[] rs) {
            long totalprice = 0;
            for (int i = 0; i < rs.length; i++) {
                totalprice += rs[i].calculatePriceOfProperty();
            }
            return totalprice;
        }
    }

    public static void main(String arsg[]){

        
    
        Property1 p1= new Property1("USA", 01, 4566, 123 );
        p1.printPropertyInfo();

        FurnishedHome f1= new FurnishedHome("Canada", 02, 123, 890, 109090 );
        f1.printPropertyInfo();

        Shop s1= new Shop("NYC", 03, 234,7890, 908765);
        s1.printPropertyInfo();

        Property1[] rs = { p1, f1, s1 }; 

        System.out.println("Total price of properties: " + s1.getTotalPrice(rs)); 

    }

}