package org.example.collections;

import java.net.CookieHandler;
import java.util.*;
import java.util.ArrayList;
import org.example.Product;

public class CollectionDriver
{
    public static void main(String[] args){

        List<Integer> integerList = new ArrayList<>();

        //CRUD
        //Create
        integerList.add(100);
        integerList.add(15);
        integerList.add(5);
        integerList.add(0,200);
        integerList.add(5);
        System.out.println("Original list:"+integerList);
        //Read
        System.out.println("second element :"+integerList.get(1));
        //Update
        integerList.set(2,10);
        System.out.println("After update:"+integerList);
        //Delete
        integerList.remove(2);
        integerList.remove((Integer) 15);
        System.out.println("After deleteting index 2:"+integerList);
        List<Integer> secondList = new ArrayList<>(integerList);
        System.out.println("second list:"+secondList);
        // check if 105 exists
        System.out.println("105 is available:"+ secondList.indexOf(105));
        //sort
        Collections.sort( secondList);
        System.out.println("sorted list:"+ secondList);
        // List with user defined data
        // list products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1l,"Dell Laptop",55000.0));
        productList.add(new Product(4l,"Acer Laptop",35000.0));
        productList.add(new Product(2l,"Hp Laptop",45000.0));


        System.out.println(productList);
        Collections.sort(productList);
        System.out.println("sorted products in natural order:"+productList);
        Collections.sort(productList,new ProductNameComparator());
        System.out.println("sorted products by name:"+productList);

        Collections.sort(productList,new ProductPriceComparator());
        System.out.println("sorted products by Price:"+productList);

        // Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(4);
        integerSet.add(44);
        integerSet.add(22);
        integerSet.add(11);
        integerSet.add(4);
        System.out.println("unique integer :"+integerSet);
        SortedSet<Integer> sortedIntegerSet = new TreeSet<>(integerSet);
        System.out.println("Add duplicate 44"+ sortedIntegerSet.add(44));
        System.out.println("Sorted integer set: "+ sortedIntegerSet);

        Set<Product> productSet = new HashSet<>(productList);
        productSet.add(new Product(2l,"Hp Laptop",45000.0));
        System.out.println("Product Set:"+ productSet);
        // increase the price of of  Acer by 10%
        // productList.add(new Product(4l,"Acer Laptop",35000.0));
        for(Product product : productList){

            if(product.getId().equals(4l)){
                Double newPrice = product.getPrice() *1.1;
                product.setPrice(newPrice);
                break;
            }
        }
        System.out.println("Acer product price updated:"+productList);

        // Create map of country picodes
        //CRUD
        Map<Integer, String> countryCodeMap = new HashMap<>();

        countryCodeMap.put(1,"India");
        countryCodeMap.put(3,"UK");
        countryCodeMap.put(2,"Japan");
        countryCodeMap.put(null,"Sri Lanka");
        countryCodeMap.put(11,null);
        countryCodeMap.put(10,null);

        System.out.println("country code:"+ countryCodeMap);
        //
        countryCodeMap.put(null,"Burma");
        System.out.println("country code:"+ countryCodeMap);
        System.out.println("values:"+countryCodeMap.values());
        System.out.println("keys:"+countryCodeMap.keySet());
        // Read
        System.out.println("Name of country with code 2:"+countryCodeMap.get(2));
        // Update
        System.out.println("Update key  with United Kingdom:"+ countryCodeMap.replace(3,"United Kingdom"));
        System.out.println("updated map:"+countryCodeMap);
        // delete
        System.out.println("delete burma entry with key null:"+ countryCodeMap.remove(null));
        System.out.println("country map:"+countryCodeMap);
        // map of products

        Map<Long,Product> productMap = new HashMap<>();

        for(Product product : productList ){
            productMap.put(product.getId(),product);
        }
        System.out.println("product map:"+productMap);
        // Read
        System.out.println("product with id 4:"+ productMap.get(4l));
        // Update
        Product updateProduct = productMap.get(4l);
        updateProduct.setName("Acer Gaming laptop");
        // productMap.get(4l).setName("Acer Gaming laptop");
        System.out.println("product map:"+productMap);
        // delete
        productMap.remove(4l);
        System.out.println("product map:"+productMap);

        for(Product product:productMap.values()){

            // process each product
            product.setPrice(product.getPrice()*1.1);
        }
        System.out.println("product map:"+productMap);
        System.out.println("Entries im product map");
        for(Map.Entry<Long,Product> entry : productMap.entrySet()){
            System.out.println("entry key:"+entry.getKey() +":" +"entry value:"+entry.getValue());
        }
        // iterate with keys
        for(Long key:productMap.keySet()){
            System.out.println(productMap.get(key));
        }

        Map<Long,Product> linkedProductMap = new TreeMap<>();//HashMap<>();//LinkedHashMap<>();
        linkedProductMap.put(99l,new Product(99l,"Laptop",55000.0));
        linkedProductMap.put(9l,new Product(9l,"Laptop 2",33000.0));
        linkedProductMap.put(1l,new Product(1l,"Laptop 99",22000.0));
        linkedProductMap.put(2l,new Product(2l,"Laptop 99",22000.0));
        System.out.println(linkedProductMap);



    }
}
