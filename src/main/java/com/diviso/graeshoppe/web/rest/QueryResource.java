package com.diviso.graeshoppe.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.product.model.*;
import com.diviso.graeshoppe.client.product.api.*;
import com.diviso.graeshoppe.domain.Result;*/
import com.diviso.graeshoppe.service.QueryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/query")
public class QueryResource {
	
	@Autowired
	QueryService queryService;
	

	@Autowired
	UomResourceApi uomResourceApi;
	
	@Autowired
	CategoryResourceApi categoryResourceApi;
	
	
	
/*	@GetMapping("/findAllCategories")
	public Page<Category> findAllCategories(Pageable pageable) {
		return queryService.findAllCategories(pageable);
	}*/
	
	@GetMapping("/findProductByCategoryId/{categoryId}")
	public Page<Product> findProductByCategoryId(@PathVariable Long categoryId,Pageable pageable) {
		return queryService.findProductByCategoryId(categoryId,pageable);
	}
	/*@GetMapping("/findAll/{searchTerm}")
	public List<Result> findAll(@PathVariable String searchTerm,Pageable pageable) {
		return queryService.findAll(searchTerm,pageable);
	}*/
	
	@GetMapping("/findAllCustomer/{searchTerm}")
	public Page<Customer> findAllCustomers(@PathVariable String searchTerm,Pageable pageable) {
		return queryService.findAllCustomers(searchTerm,pageable);
	}
	
	
	/*@GetMapping("/findAllUom")
	public List<String> findAllUom(Pageable pageable) {
		return queryService.findAllUom(pageable);
	}*/
	
	@GetMapping("/findAllUom")
	public ResponseEntity<List<UomDTO>> findAllUom(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer size, 
			@RequestParam(value = "sort", required = false) List<String> sort) {
		
		return uomResourceApi.getAllUomsUsingGET(page,size, sort);
	}
	
	@GetMapping("/findAllCateogories")
	public ResponseEntity<List<UomDTO>> findAllCategories(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer size, 
			@RequestParam(value = "sort", required = false) List<String> sort) {
		
		return categoryResourceApi.getAllCategoriesUsingGET(page,size,sort);
	}
	
	
	
	

}
