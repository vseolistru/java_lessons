public class Order {
    public void addProduct(Product product){
        if(product.getPrice()>5000){
            product.setPrice( product.getPrice() - product.getPrice()* product.getDiscount()) ;
        }
    }
}
