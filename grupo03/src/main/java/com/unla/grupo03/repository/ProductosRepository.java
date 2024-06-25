package com.unla.grupo03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo03.model.Productos;
@Repository
public interface ProductosRepository extends CrudRepository<Productos, Integer>{	
	

}
