//package org.kshrd.pp.group3.controllers;
//
//import org.kshrd.pp.group3.models.Product;
//import org.kshrd.pp.group3.services.ProductService;
//import org.kshrd.pp.group3.views.ProductListView;
//import java.util.List;
//
//public class ProductController {
//    private ProductService productService;
//    private ProductListView productListView;
//
//    public ProductController(ProductService productService, ProductListView productListView) {
//        this.productService = productService;
//        this.productListView = productListView;
//    }
//
//    public void displayProductList() {
//        List<Product> productList = productService.getAllProducts();
//        productListView.displayProductList(productList);
//    }
//
//    // Other methods for inserting, viewing, updating, and deleting products
//}
