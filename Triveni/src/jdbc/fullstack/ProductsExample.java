package jdbc.fullstack;

public class ProductsExample {
    public static void main(String[] args) {
        
        Products prod1 = new Products("John",75.00,25);
        Products prod2 = new Products("Triveni",40.28,50);
        ProductsService prodService = new ProductsService();

        prodService.create(prod1);
        prodService.create(prod2);
        prodService.fetch();
        prodService.update("Triveni", 12);
        prodService.update("John", 200.34);
        prodService.fetch();
        prodService.delete(2);

        
    }

}
