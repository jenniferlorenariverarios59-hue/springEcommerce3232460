package com.sena.springecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.springecommerce.model.Detalle;

@Repository

public interface IDetalleRepository extends JpaRepository<Detalle, Integer> {
	
	
	

}
