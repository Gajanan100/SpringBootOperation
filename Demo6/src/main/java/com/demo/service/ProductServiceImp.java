package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImp implements ProductService {
	
    @Autowired
	ProductDao pd;
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		pd.save(p);

	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@Override
	public void deletebyId(int id) {
		// TODO Auto-generated method stub
		pd.deleteById(id);

	}

	@Override
	public Product getbyProduct(int id) {
		// TODO Auto-generated method stub
		Optional<Product>optional=pd.findById(id);
	
		return optional.get();
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		Optional<Product>optional=pd.findById(p.getProdid());
		
		if(optional.isPresent())
		{
			Product p2=new Product();
			p2.setProdid(p.getProdid());
			p2.setProdname(p.getProdname());
			p2.setProdprice(p.getProdprice());
			pd.save(p2);
			return 1;
		}
		return 0;
	}

}
