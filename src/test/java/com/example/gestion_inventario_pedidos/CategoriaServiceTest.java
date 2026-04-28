package com.example.gestion_inventario_pedidos;

import com.example.gestion_inventario_pedidos.model.Categoria;
import com.example.gestion_inventario_pedidos.repository.CategoriaRepository;
import com.example.gestion_inventario_pedidos.service.impl.CategoriaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CategoriaServiceTest {

    @Mock
    private CategoriaRepository categoriaRepository;

    @InjectMocks
    private CategoriaServiceImpl categoriaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // TEST 1 — Listar todas las categorías
    @Test
    void listarTodas_debeRetornarListaDeCategorias() {
        Categoria c1 = new Categoria(1L, "Abarrotes", "Productos de abarrotes");
        Categoria c2 = new Categoria(2L, "Bebidas", "Bebidas en general");
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(c1, c2));

        List<Categoria> resultado = categoriaService.listarTodas();

        assertEquals(2, resultado.size());
        verify(categoriaRepository, times(1)).findAll();
    }

    // TEST 2 — Buscar categoría existente por ID
    @Test
    void buscarPorId_debeRetornarCategoriaExistente() {
        Categoria categoria = new Categoria(1L, "Abarrotes", "Productos de abarrotes");
        when(categoriaRepository.findById(1L)).thenReturn(Optional.of(categoria));

        Optional<Categoria> resultado = categoriaService.buscarPorId(1L);

        assertTrue(resultado.isPresent());
        assertEquals("Abarrotes", resultado.get().getNombre());
    }

    // TEST 3 — Buscar categoría que no existe
    @Test
    void buscarPorId_debeRetornarVacioCuandoNoExiste() {
        when(categoriaRepository.findById(99L)).thenReturn(Optional.empty());

        Optional<Categoria> resultado = categoriaService.buscarPorId(99L);

        assertFalse(resultado.isPresent());
    }

    // TEST 4 — Guardar con nombre duplicado debe lanzar excepción
    @Test
    void guardar_debeLanzarExcepcionSiNombreDuplicado() {
        Categoria categoria = new Categoria(null, "Abarrotes", "Desc");
        when(categoriaRepository.existsByNombre("Abarrotes")).thenReturn(true);

        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> categoriaService.guardar(categoria));

        assertEquals("Ya existe una categoría con ese nombre", ex.getMessage());
    }

    // TEST 5 — Eliminar categoría que no existe debe lanzar excepción
    @Test
    void eliminar_debeLanzarExcepcionSiNoExiste() {
        when(categoriaRepository.existsById(99L)).thenReturn(false);

        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> categoriaService.eliminar(99L));

        assertEquals("Categoría no encontrada", ex.getMessage());
    }
}