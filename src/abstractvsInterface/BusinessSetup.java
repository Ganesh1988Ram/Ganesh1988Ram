package abstractvsInterface;

public abstract class BusinessSetup {
	public String businessId ="1234";

	/*
	 * public String businessIdN ="1234"; public String getBusinessIdN() { return
	 * businessIdN; } public void setBusinessIdN(String businessIdN) {
	 * this.businessIdN = businessIdN; }
	 */
	public BusinessSetup(String businessId){
        this.businessId = businessId;
        System.out.println("1. Initial Business setup for BusienssID: "+this.businessId+" is Complete");
    }
    public final boolean getBusinessRegisteredInRegion(String region){
        System.out.println("2. Business got registered in "+region+ "!");
        return true;
    }
    public abstract void setupCustomerPlatform(String customerId);
    public abstract void setupVendorPlatform(String vendorId);

}
