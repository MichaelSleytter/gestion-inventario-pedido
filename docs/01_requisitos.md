# 01 — Definición del Caso de Negocio y Requisitos

## Caso de Negocio

### Descripción del Problema

La distribuidora comercial objeto de estudio opera actualmente con registros manuales en hojas de cálculo y cuadernos físicos para el control de su inventario y pedidos. Esta situación genera pérdidas económicas por descontrol de stock, imposibilidad de conocer el inventario en tiempo real, errores humanos en los registros y demoras en la atención al cliente.

### Solución Propuesta

Desarrollar un sistema web de gestión de inventario y pedidos usando Java Spring Boot y MySQL, con una API REST documentada en Swagger que permita automatizar y digitalizar los procesos actuales de la distribuidora.

### Alcance del Sistema

**Incluye:**
- Gestión de productos y categorías
- Control de stock e inventario con movimientos
- Gestión de pedidos con estados (Pendiente, En Proceso, Completado, Cancelado)
- Registro de movimientos de inventario (entradas y salidas)
- Administración de usuarios con roles (Administrador, Almacenero)
- API REST documentada con Swagger/OpenAPI

**No incluye:**
- Módulo de facturación electrónica
- Integración con sistemas contables externos
- Aplicación móvil nativa

---

## Requisitos Funcionales

| ID | Módulo | Descripción |
|---|---|---|
| RF-01 | Productos | El sistema debe permitir registrar productos con nombre, descripción, precio, stock y categoría. |
| RF-02 | Productos | El sistema debe permitir editar y eliminar productos existentes. |
| RF-03 | Categorías | El sistema debe permitir gestionar categorías de productos (CRUD). |
| RF-04 | Pedidos | El sistema debe permitir crear pedidos asociados a un cliente con uno o más productos. |
| RF-05 | Pedidos | El sistema debe permitir actualizar el estado de un pedido (Pendiente → En Proceso → Completado). |
| RF-06 | Pedidos | Al registrar un pedido, el stock de los productos incluidos debe descontarse automáticamente. |
| RF-07 | Inventario | El sistema debe registrar cada movimiento de stock (entrada o salida) con fecha, cantidad y usuario responsable. |
| RF-08 | Usuarios | El sistema debe gestionar usuarios con roles: Administrador y Almacenero. |
| RF-09 | API | Todos los endpoints deben estar documentados y disponibles en Swagger UI. |

## Requisitos No Funcionales

| ID | Categoría | Descripción |
|---|---|---|
| RNF-01 | Tecnología | El backend debe estar desarrollado en Java 17 con Spring Boot. |
| RNF-02 | Base de Datos | Se usará H2 para desarrollo/testing y MySQL para producción. |
| RNF-03 | Arquitectura | El sistema debe seguir el patrón MVC con capas Controller, Service y Repository. |
| RNF-04 | Seguridad | Las contraseñas y credenciales de base de datos no deben exponerse en el código fuente. |
| RNF-05 | Documentación | La API debe estar documentada con Swagger/OpenAPI accesible en `/swagger-ui.html`. |
| RNF-06 | Control de versiones | Todos los commits deben seguir la convención Conventional Commits. |

---

## Diagrama de Base de Datos (Modelo Entidad-Relación)

```
┌─────────────┐       ┌─────────────────┐       ┌──────────────┐
│   CATEGORIA │       │    PRODUCTO      │       │   PEDIDO     │
│─────────────│       │─────────────────│       │──────────────│
│ id (PK)     │──────<│ id (PK)         │       │ id (PK)      │
│ nombre      │       │ nombre          │       │ fecha        │
│ descripcion │       │ descripcion     │       │ estado       │
└─────────────┘       │ precio          │       │ cliente_id   │
                      │ stock           │       │ usuario_id   │
                      │ categoria_id(FK)│       └──────┬───────┘
                      └────────┬────────┘              │
                               │                       │
                      ┌────────▼────────┐    ┌─────────▼──────────┐
                      │   MOVIMIENTO    │    │   DETALLE_PEDIDO   │
                      │─────────────────│    │────────────────────│
                      │ id (PK)         │    │ id (PK)            │
                      │ tipo (ENT/SAL)  │    │ pedido_id (FK)     │
                      │ cantidad        │    │ producto_id (FK)   │
                      │ fecha           │    │ cantidad           │
                      │ producto_id(FK) │    │ precio_unitario    │
                      │ usuario_id(FK)  │    └────────────────────┘
                      └─────────────────┘

┌──────────────┐
│   USUARIO    │
│──────────────│
│ id (PK)      │
│ nombre       │
│ email        │
│ password     │
│ rol          │
└──────────────┘
```

---

## Estrategia de Ramas (Git Flow)

```
main          ──────────────────────────────────────────► (producción)
                  ↑
develop       ────┼───────────────────────────────────► (integración)
                  ↑           ↑
feature/      ────┘    ───────┘
categorias          pedidos
```

### Reglas de colaboración

- `main` → protegida, requiere Pull Request + 1 revisor aprobado
- `develop` → protegida, requiere Pull Request + 1 revisor aprobado
- `feature/*` → rama de trabajo individual por funcionalidad
- Todos los commits usan **Conventional Commits**:
  - `feat:` para nuevas funcionalidades
  - `fix:` para corrección de errores
  - `docs:` para cambios en documentación
  - `chore:` para configuración o mantenimiento
  - `test:` para pruebas

### Ejemplos de commits válidos

```bash
feat: agrega entidad Producto con JPA
feat: implementa CategoriaController con endpoints REST
docs: actualiza README con integrantes del grupo
chore: configura H2 para entorno de desarrollo
test: agrega tests unitarios para CategoriaService
```

---

## Integrantes y Responsabilidades (Hito 1)

| Integrante | Código | Rama asignada | Responsabilidad |
|---|---|---|---|
| Yerrin Franklin Perez Diaz | U22322957 | `feature/config-repositorio` | Configuración inicial, .gitignore, LICENSE, protección de ramas |
| Alexander Sucno Ayma | U19311472 | `feature/entidad-categoria` | Entidad Categoría + Controller + Service + Repository |
| Ovanto Jhunior Jaramillo Gonzales | U22314041 | `feature/documentacion` | README.md, docs/01_requisitos.md |
| Michael Diaz Simon | U22214583 | `feature/config-bd` | application.properties H2/MySQL, pom.xml, estructura Spring Boot |
