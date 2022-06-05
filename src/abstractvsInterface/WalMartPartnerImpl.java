package abstractvsInterface;

/**
 * From a business use case context , Interfaces can be used to define specific business rules , where as abstract class would define the common structure to kickoff the business.

Say some business owner wants to partner with Amazon and Walmart , then the interfaces defined here would be WalmartPartner and AmazonPartner would define the specific business rules and the abstract class BusinessSetup will get the business setup in a specific region.
 * @author tokyo
 *
 */

public class WalMartPartnerImpl extends BusinessSetup implements WalmartPartner {
    public WalMartPartnerImpl(String businessId) {
        super(businessId);
    }
    
   // BusinessSetup test = new BusinessSetup(String test1); cannot instantiate
    @Override
    public void setupCustomerPlatform(String customerId) {
    }

    @Override
    public void setupVendorPlatform(String vendorId) {
    }

    @Override
    public void setupShopifyForWalmart() {
    }

    @Override
    public void setupWalmartProducts() {
    }
    public static void main(String args[]){
        WalMartPartnerImpl walMartPartner = new WalMartPartnerImpl("wal8989");
        walMartPartner.getBusinessRegisteredInRegion("california");
        walMartPartner.getWalmartDeals();
        walMartPartner.setupCustomerPlatform("wal8989");
        walMartPartner.setupWalmartProducts();
        
      // System.out.print(walMartPartner.getBusinessIdN());
    }
}
