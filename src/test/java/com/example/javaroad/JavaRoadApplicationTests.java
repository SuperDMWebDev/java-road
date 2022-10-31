package com.example.javaroad;

import com.example.javaroad.entity.Product;
import com.example.javaroad.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import javax.persistence.Table;
import java.util.List;


@SpringBootTest
public class JavaRoadApplicationTests implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Test
    void pagination()
    {
        productRepository.save(new Product("3","minh"));
        productRepository.save(new Product("2","lan"));


        int pageNo = 0;
        int pageSize = 5;

        //create pageable object
        Pageable pageable = PageRequest.of(pageNo,pageSize);

        //findAll method and pass pageable instance
        Page<Product> page = productRepository.findAll(pageable);

        //get all products in specific page
        List<Product> products = page.getContent();

        // print all product
        products.forEach((element)-> {
            System.out.println(element);
        });

        // get total page
        int totalPage = page.getTotalPages();

        //total elements
        Long totalElements= page.getTotalElements();

        //number of elements
        int numberOfElements = page.getNumberOfElements();

        //get size
        int size = page.getSize();

        //check last
        boolean isLast = page.isLast();
        //check first
        boolean isFirst = page.isFirst();

        System.out.println(productRepository.findAll());
        System.out.println("total page -> " + totalPage);
        System.out.println("totalElements -> " + totalElements);
        System.out.println("numberOfElements -> " + numberOfElements);
        System.out.println(" size ->" + size);
        System.out.println(" isLast -> " + isLast);
        System.out.println(" isFirst -> " + isFirst);


    }
    @Test
    void paginationAndSortingTogether()
    {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
