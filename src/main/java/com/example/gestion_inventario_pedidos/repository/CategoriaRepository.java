package com.example.gestion_inventario_pedidos.repository;

import com.example.gestion_inventario_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    boolean existsByNombre(String nombre);
}
