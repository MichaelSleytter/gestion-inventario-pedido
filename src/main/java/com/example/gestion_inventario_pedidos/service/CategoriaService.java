package com.example.gestion_inventario_pedidos.service;

import com.example.gestion_inventario_pedidos.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> listarTodas();

    Optional<Categoria> buscarPorId(Long id);

    Categoria guardar(Categoria categoria);

    void eliminar(Long id);
}
