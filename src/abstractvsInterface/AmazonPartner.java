package abstractvsInterface;

public interface AmazonPartner {
	
	String businessIdAP ="1234";
	public static boolean signUpAsAmazonServicePartner(String BusinessId){
        System.out.println("Setting up Amazon Business Partner"+businessIdAP);
        return true;
    }
    public default  void  paymentPlatformSetup(){
        System.out.println(" Amazon default payment platform is setup");
    }
    public abstract void setupPrimeMemberDealsByRegion();
    public abstract  void setupPrimeDeals();

}
