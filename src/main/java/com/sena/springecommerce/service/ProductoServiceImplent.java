package com.sena.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.springecommerce.model.Producto;
import com.sena.springecommerce.repo.OProductoRepository;

public class ProductoServiceImplent implements IProductoService {

	@Autowired
	private OProductoRepository productiRepository;

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productiRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productiRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productiRepository.save(producto);

	}

	@Override
	public void delate(Integer id) {
		// TODO Auto-generated method stub
		productiRepository.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {

		// TODO Auto-generated method stub
		return productiRepository.findAll();
	}

}
