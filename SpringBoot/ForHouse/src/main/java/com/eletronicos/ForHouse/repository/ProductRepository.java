package com.eletronicos.ForHouse.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eletronicos.ForHouse.model.ProductModel;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
	
		@Query (value="select * from produto where price > :value1 and price < :value2", nativeQuery=true)
		public List<ProductModel> PriceRange(@Param("value1") double value1, @Param("value2") double value2);
	
		@Query (value="select * from produto where Tipo_Eletro_Model_id = :tipoid and price <= :value", nativeQuery=true)
		public List<ProductModel> RangePriceTipo(@Param("tipoid") int id, @Param("value") BigDecimal value);
}
