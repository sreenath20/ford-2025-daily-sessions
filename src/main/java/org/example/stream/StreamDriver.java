package org.example.stream;

import org.example.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamDriver {
    public static void main(String[] args){

        List<String> nameList = new ArrayList<>();

        nameList.add("India");
        nameList.add("USA");
        nameList.add("Japan");
        nameList.add("Italy");
        // Map : convert to upper case
        nameList.stream()
                .map(
                        s->s.toUpperCase()
                )
                .forEach(
                        s-> System.out.println(s)
                );
        System.out.println("name list :"+nameList);
        // find each string length
        nameList.stream().map(s->s.length()).forEach(s-> System.out.println(s));
        // get product names
        List<Product> cartList = new ArrayList<>();
        cartList.add(new Product(1l,"Product A",100.0,0.5f));
        cartList.add(new Product(3l,"Product C",300.0,0.8f));
        cartList.add(new Product(2l,"Product B",200.0,0.1f));

        cartList.stream()
                .map(p->p.getName())
                .forEach(p-> System.out.println(p));

        List<String> productNames =
                cartList.stream().map(p->p.getName()).collect(Collectors.toList());
        System.out.println(productNames);

        // get all product price list
        List<Double> productPriceList =
                cartList.stream()
                        .map(p->p.getPrice()).collect(Collectors.toList());
        System.out.println("Product price list:"+productPriceList);

        // Filter
        // remove names having lentgth <= 3 chars
        nameList.stream()
                .filter(s->s.length() > 3 )
                .forEach(s-> System.out.println(s));

        // collect products having price < 200

        Double limitPrice = 200.0;
      cartList.stream()
                .filter(p->p.getPrice() < limitPrice )
                .forEach(p-> System.out.println(p));

        List<Product> lowCostProducts =  cartList.stream()
                .filter(p->p.getPrice() < limitPrice )
                .collect(Collectors.toList());
        System.out.println(lowCostProducts);

        // sort products on price
        cartList.stream()
                .sorted(
                        (p1,p2)->p1.getPrice().compareTo(p2.getPrice())
                )
                .forEach(p-> System.out.println(p));
    }



}
