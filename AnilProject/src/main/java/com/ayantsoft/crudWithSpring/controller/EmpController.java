package com.ayantsoft.crudWithSpring.controller;


import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.ayantsoft.crudWithSpring.service.EmpService;
import com.ayantsoft.hibernate.pojo.Item;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	 @RequestMapping("/")  
	    public ModelAndView welcome() {  
	  	 
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("home");
		 return mv;
		}
	 
	 @RequestMapping("/back")  
	    public ModelAndView back() {  
	  	 
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("home");
		 return mv;
		}
	 @RequestMapping(value={"/addItem"},method={RequestMethod.POST})  
	    public ModelAndView saveItem(@ModelAttribute ("item")Item i) {  
	     ModelAndView mv= new ModelAndView(); 
	     empService.insertEmpService(i);
	     mv.setViewName("home");
		 return mv;
		}  
	
	 @RequestMapping(value={"/saveUpdatedItem"},method={RequestMethod.POST})  
	    public ModelAndView saveUpdatedItem(@ModelAttribute ("item")Item i) {  
	     ModelAndView mv= new ModelAndView(); 
	     empService.insertEmpService(i);
	     mv.setViewName("home");
		 return mv;
		} 
	 @RequestMapping(value={"/getItem"})  
	    public ModelAndView getItem() {  
	     ModelAndView mv= new ModelAndView(); 
	     Item i=new Item();
	     mv.setViewName("EmpReg");
	     mv.addObject("item",i);
		 return mv;
		} 
	 @RequestMapping(value={"/viewItem"})  
	    public ModelAndView viewItem() {  
	     ModelAndView mv= new ModelAndView(); 
	     List<Item> i=empService.getAllEmpService();
	     mv.setViewName("EmpView");
	     mv.addObject("item",i);
		 return mv;
		} 
	 @RequestMapping(value={"/ getItemForUpdate"})  
	    public ModelAndView getItemForUpdate(@RequestParam Integer id) {  
	     ModelAndView mv= new ModelAndView(); 
	     Item i= empService.getEmpByIdService(id);
	     mv.setViewName("viewUpdate");
	     mv.addObject("item",i);
		 return mv;
		} 
	 @RequestMapping(value={"/deleteItem"})  
	    public ModelAndView deleteItem(@RequestParam Integer id) {  
	     ModelAndView mv= new ModelAndView(); 
	     empService.deleteItemByIdService(id);
	     mv.setViewName("home");
	     return mv;
		} 
	 
	 
	 
	 
}
