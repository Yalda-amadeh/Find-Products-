package products;

import java.util.Arrays;
//import java.util.logging.Logger;
import java.util.List;
//import java.util.logging.Logger;
import java.util.stream.Collectors;



public class ProductService {
	
	private static List<Product> product;
//	private static final Logger logger = Logger.getLogger(ProductService.class.getName());

	
	static {
		Product p1 = new Product("mobile",2200,false,ProductType.Digital);
		Product p2 = new Product("shirt",4000,true,ProductType.Clothes);
		Product p3 = new Product("fridge",70000,false,ProductType.Home);
		Product p4 = new Product("headset",120000,false,ProductType.Digital);
		Product p5 = new Product("shoes",100,true,ProductType.Clothes);
		
		Product p6 = new Product("Tv",50000,true,ProductType.Digital);
		Product p7 = new Product("pan",12000,false,ProductType.Home);
		Product p8 = new Product("spone",200,false,ProductType.Home);
		
		 product = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);	
		
	}
	public static List<Product> FindProduct(String name,ProductType type) throws ProductNotFoundException {
		List<Product> findproduct = product.stream()
				.filter(t -> t.type().equals(type) && t.productName().equals(name))
				.collect(Collectors.toList());
		
				
				if (!findproduct.isEmpty()) {
//					logger.info("Successfull find product");
					findproduct.forEach(t -> System.out.println(t.toString()));}
				
			    if (findproduct.size() != 1 ) {
//			    	logger.info("There is no product");
			    	throw new ProductNotFoundException("Could not find User");
					
		}
				
				
//				findproduct.forEach(t -> System.out.println(t.toString()));  

			    return findproduct;
					
	}
}
