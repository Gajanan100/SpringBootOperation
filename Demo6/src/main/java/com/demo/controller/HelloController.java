package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Product;
import com.demo.service.ProductServiceImp;

@Controller
public class HelloController {

	@Autowired
	ProductServiceImp psi;
	public HelloController() {
		// TODO Auto-generated constructor stub
		System.out.println("hello controller.............");
	}
	
	@RequestMapping("/")
	public String getIndex()
	{
		return "Index";
	}
	
	@RequestMapping("/Addproduct")
	public String getProduct()
	{
		return "Addproduct";
	}
	
    @RequestMapping("/addprod")
    
    public ModelAndView AddProducts(@ModelAttribute Product p)
    {
    	psi.addProduct(p);
    	ModelAndView mv =new ModelAndView();
    	mv.setViewName("Show");
    	mv.addObject("msg", "data added successfully");

		return mv;
    	
    }
    
    @RequestMapping("/AllData1")
    
    public ModelAndView getall()
    {
    	List<Product>list=psi.getAllProduct();
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("AllData");
    	mv.addObject("datashow", list);

    	return mv;
    }
    
    @RequestMapping("/deleteProduct/{id}")
    public ModelAndView getDelete(@PathVariable int id)
    {
    	System.out.println("he love you..");
    	psi.deletebyId(id);

    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("Datadelete");
    	mv.addObject("delete","Data deleted successfully...");
		return mv;
    	
    }
    
    @RequestMapping("/EditProduct/{id}")
    public ModelAndView getEdit(@PathVariable int id)
    {
    	Product data1=   psi.getbyProduct(id);
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("Update");

    	mv.addObject("edit", data1);
    	
		return mv;
    	
    }
    
    @RequestMapping("/updatedata")
    
    public ModelAndView getUpdate(@ModelAttribute Product p)
    {
    	   psi.updateProduct(p);
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("Show");
    	mv.addObject("upddata" ,"Updated data successfully.....");
		return mv;
    	
    }
    
}
