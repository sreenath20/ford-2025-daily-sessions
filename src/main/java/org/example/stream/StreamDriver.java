package org.example.stream;

import org.example.Employee;
import org.example.Product;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.time.LocalDate;


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

        Comparator<Product> productPriceComparater = (p1,p2)->p1.getPrice().compareTo(p2.getPrice());


        cartList.stream()
                .sorted(productPriceComparater)
                .forEach(p-> System.out.println(p));

        // reduce
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(10);
        integerList.add(40);
        integerList.add(5);
        BinaryOperator<Integer> reduceOperator = (p1,p2)->p1+p2;
        Optional<Integer> integerSumOpt = integerList.stream()
                                                        .reduce(reduceOperator);
        if(integerSumOpt.isPresent())
            System.out.println("sum :"+integerSumOpt.get());
        //nameList.clear();
        Optional<String> nameAccumulatorOpt = nameList.stream().reduce((p1,p2)->p1+p2);
        System.out.println(nameAccumulatorOpt.orElse("No names present"));
        // sum of products price containing name laptop

        // List all products containing name 'laptop'
        List<Product> cartListNew = new ArrayList<>();
        cartList.add(new Product(1l,"Mouse",100.0,0.5f));
        cartList.add(new Product(3l,"Dell Laptop",300.0,0.8f));
        cartList.add(new Product(2l,"Hp Laptop",200.0,0.1f));

        String name = "My dell laptop";
        System.out.println("laptop prsent in name ?:"+name.contains("Laptop"));
        Double productSum =  cartList.stream().filter(p->p.getName().toLowerCase().contains("Laptop".toLowerCase()))
                .mapToDouble(p->p.getPrice()).sum();
        System.out.println("All Laptop total :"+productSum);
        // Find all the employees who have joined before jan 1 2025 and reported on monday

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1","Employee 1",5000.0, LocalDate.of(2024,1,15)));
        empList.add(new Employee("4","Employee 4", 5000.0,LocalDate.of(2025,1,15)));
        empList.add(new Employee("2","Employee 2", 5000.0,LocalDate.of(2022,1,17)));
        empList.add(new Employee("3","Employee 3", 5000.0,LocalDate.of(2025,1,15)));
        LocalDate beforeDate = LocalDate.of(2024,1,1);
       List<Employee> emplList = empList.stream()
                .filter(p->p.getJoinDate().isBefore(beforeDate)) // before filter
                .filter(p->p.getJoinDate().getDayOfWeek().equals(DayOfWeek.MONDAY))
                .toList();
        System.out.println("emp list joined on Moday before 1 jan 2024 :"+emplList);

        //Method reference short hand for Lambda

        Consumer<String> strConsumer = (s)-> System.out.println(s);
        strConsumer.accept("Ford india");

        Consumer<String> nameConsumer = System.out::println;
        //DemoObject::display;
        nameConsumer.accept("Chennai");

        Supplier<DemoObject> newDemo = ()->new DemoObject();
        newDemo.get().display("Hello !");
        Supplier<DemoObject> newDemo2 = DemoObject::new;

        BiFunction<Integer,Integer,Integer> mulFun = (n1,n2)->n1*n2;
        DemoObject demoObj = new DemoObject();
        BiFunction<Integer,Integer,Integer> mulFun2 = demoObj::fun;
        System.out.println(mulFun.apply(5,5));
        System.out.println(mulFun2.apply(2,2));

        cartList.stream()
                .sorted(productPriceComparater)
                .forEach(System.out::println);

    }



}
