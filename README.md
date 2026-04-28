# Módulo Backend — Spring Boot

## Requisitos previos
- Java 17 o superior
- Maven 3.8+
- MySQL 8.0+

## Configuración local

### 1. Clonar el repositorio
```bash
git clone https://github.com/USUARIO_DEL_EQUIPO/gestion-inventario-pedido.git
cd gestion-inventario-pedido
```

### 2. Crear base de datos en MySQL
```sql
CREATE DATABASE IF NOT EXISTS gestion_inventario_pedidos;
USE gestion_inventario_pedidos;
```

### 3. Configurar variables de entorno
Copiar el archivo de ejemplo y completar con tus credenciales:
```bash
cp .env.example .env
```

### 4. Ejecutar el proyecto
```bash
mvn spring-boot:run
```

### 5. Ejecutar los tests
```bash
mvn test
```

## Swagger UI
Una vez iniciado el proyecto, acceder a: