package org.example.lambda;

import org.example.Product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.*;
import java.util.List;


public class LambdaDriver {
    public static void main(String[] args){

        // define lambda
        Consumer<String> stringCosumer = s-> System.out.println(s);
        stringCosumer.accept("Ford India");

        Supplier<Double> piSupplier = ()->3.14;
        System.out.println("PI:"+piSupplier.get());
        // check if given nuber is even

        Predicate<Integer> isEvenPredicate = n->(n%2)==0;
        System.out.println("19 is even:"+isEvenPredicate.test(19));
        // length of string
        Function<String, Integer> stringLengthFunction =  s->s.length();
        System.out.println("Ford India - length:" + stringLengthFunction.apply("Ford India"));

        BiFunction<String,String,Boolean> passwordCheckFunction = (u,p)->{
            if(u.equals("Ford") && p.equals("123"))
                return true;
            else
                return false;
        };

        System.out.println("Login: "+ passwordCheckFunction.apply("ford","1234"));
        // write a lambda to check if product price is below 100 Rs

        Predicate<Product> productPricePredicate = p -> p.getPrice() < 100.0;
        System.out.println("Check if product Cable price is < 100 Rs :"+
                productPricePredicate.test(new Product(1l,"Cable",150.0)));

        // lambda to calculate cart total price after  10% discount

        Function< List<Product>, Double > calculateCartPrice =  (productList) -> {
            Double cartTotalPrice = 0.0;
            for(Product product : productList ){
                Double currentPrice = product.getPrice();
                cartTotalPrice +=(currentPrice - (currentPrice*product.getDiscount()));
            }
            return cartTotalPrice;
        };

        List<Product> cartList = new ArrayList<>();
        cartList.add(new Product(1l,"Product A",100.0,0.5f));
        cartList.add(new Product(3l,"Product C",300.0,0.8f));
        cartList.add(new Product(2l,"Product B",200.0,0.1f));

        System.out.println("Cart price :"+ calculateCartPrice.apply(cartList));

        CustomFunction<String> customFunction = (s)-> System.out.println(s);
        customFunction.display("Chennai");
        CustomFunction<Product> productFun = p-> System.out.println(p);
        productFun.display(new Product(2l,"Product B",200.0,0.1f));


    }

}
