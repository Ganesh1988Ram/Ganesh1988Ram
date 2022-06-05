package abstractvsInterface;

public interface WalmartPartner {
	 public static boolean signUpForWalmartBusinessAccount(String BusinessId){
	        System.out.println("Setting up Walmart Business Partner");
	        return true;
	    }
	    public default  void  getWalmartDeals(){
	        System.out.println("Default walmart deal executed !");
	    }
	    
	    public abstract void setupShopifyForWalmart();
	    public abstract  void setupWalmartProducts();
}
