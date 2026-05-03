# Sistema Web de Gestión de Inventario y Pedidos

## Información General

| Campo | Detalle |
|---|---|
| **Universidad** | Universidad Tecnológica del Perú |
| **Docente** | Jose Luis Milla Flores |
| **Integrantes** | Yerrin Franklin Perez Diaz — U22322957 |
| | Alexander Sucno Ayma — U19311472 |
| | Ovanto Jhunior Jaramillo Gonzales — U22314041 |
| | Michael Diaz Simon — U22214583 |
| **Fecha de inicio** | 25/04/2026 |
| **Fecha de finalización** | Semana 18 — 2026 |

---

## Agradecimiento y Dedicatoria

Dedicamos este proyecto a nuestras familias, quienes nos brindan su apoyo incondicional a lo largo de nuestra formación universitaria.

Agradecemos al docente Jose Luis Milla Flores por su guía, exigencia y dedicación durante el desarrollo del curso. Su metodología nos ha permitido aplicar herramientas y prácticas reales de la industria del software desde las aulas.

---

## Resumen

El presente proyecto consiste en el desarrollo de un sistema web de gestión de inventario y pedidos para una distribuidora comercial. La solución automatiza el control de stock en tiempo real, la gestión de pedidos con seguimiento de estados y el registro de movimientos de inventario con trazabilidad completa. El sistema está construido con Java Spring Boot, base de datos MySQL y arquitectura REST, siguiendo buenas prácticas de desarrollo colaborativo mediante Git y GitHub.

**Palabras clave:** inventario, pedidos, Spring Boot, REST, control de stock, trazabilidad, gestión comercial.

## Abstract

This project consists of the development of a web-based inventory and order management system for a commercial distributor. The solution automates real-time stock control, order management with status tracking, and inventory movement records with full traceability. The system is built with Java Spring Boot, MySQL database, and REST architecture, following collaborative development best practices using Git and GitHub.

**Keywords:** inventory, orders, Spring Boot, REST, stock control, traceability, commercial management.

---

## Realidad Problemática

La distribuidora comercial objeto de estudio opera actualmente con registros manuales en hojas de cálculo y cuadernos físicos para el control de su inventario. Esta situación genera múltiples problemas operativos que afectan directamente la rentabilidad del negocio:

- Pérdidas económicas por descontrol de stock, generando tanto desabastecimiento como sobrestock de productos.
- Imposibilidad de conocer en tiempo real el nivel de inventario disponible en almacén.
- Registros manuales propensos a errores humanos, duplicidades y pérdida de información.
- Dificultad para gestionar pedidos de clientes de manera organizada y con seguimiento de estados.
- Ausencia total de trazabilidad en los movimientos de entrada y salida de productos.
- Demoras en la atención al cliente por falta de información inmediata sobre disponibilidad de productos.

Esta situación representa una brecha tecnológica significativa que impacta negativamente en la competitividad de la empresa frente a distribuidoras que ya cuentan con sistemas digitales.

## Justificación

El desarrollo de un sistema web de gestión de inventario y pedidos representa una solución directa a los problemas identificados. La implementación de esta herramienta tecnológica permitirá automatizar el control de stock en tiempo real, digitalizar la gestión de pedidos con seguimiento de estados, generar trazabilidad completa de todos los movimientos de inventario y controlar el acceso mediante roles diferenciados de usuario.

---

## Objetivo General

Desarrollar un sistema web de gestión de inventario y pedidos para una distribuidora comercial que permita optimizar el control de stock, la trazabilidad de movimientos y la gestión de pedidos mediante una plataforma digital construida con Java Spring Boot y MySQL.

## Objetivos Específicos

1. **Módulo de Productos:** Implementar un módulo de gestión de productos con control de stock que permita registrar, editar, eliminar y consultar productos organizados por categorías.
2. **Módulo de Pedidos:** Desarrollar un módulo de pedidos con seguimiento de estados (Pendiente, En Proceso, Completado, Cancelado) que actualice automáticamente el inventario al registrar cada pedido.
3. **Módulo de Inventario:** Registrar entradas y salidas de inventario con trazabilidad completa, manteniendo un historial de todos los movimientos realizados por cada usuario.
4. **Módulo de Usuarios:** Gestionar usuarios con roles diferenciados (Administrador y Almacenero) que delimiten las acciones permitidas dentro del sistema según el perfil de cada persona.
5. **API REST y Documentación:** Documentar e integrar una API REST con Swagger/OpenAPI que permita visualizar y probar todos los endpoints del sistema de manera interactiva.

---

## Marco Teórico

### Sistemas de Gestión de Inventario

Un sistema de gestión de inventario es una herramienta tecnológica que permite a las organizaciones controlar, registrar y monitorear el flujo de productos dentro de su cadena de suministro. Según Chopra y Meindl (2021), la gestión eficiente del inventario es uno de los pilares fundamentales de la cadena de suministro, ya que impacta directamente en la disponibilidad de productos y en los costos operativos de la empresa.

### Arquitectura REST y Spring Boot

La arquitectura REST (Representational State Transfer) es un estilo arquitectónico para el diseño de servicios web que utiliza el protocolo HTTP para la comunicación entre cliente y servidor. Spring Boot es un framework de Java que simplifica el desarrollo de aplicaciones empresariales al proporcionar configuración automática y un servidor embebido (Walls, 2022).

### Control de Versiones con Git y GitHub

Git es un sistema de control de versiones distribuido que permite a los equipos de desarrollo trabajar de manera colaborativa, manteniendo un historial completo de todos los cambios realizados en el código fuente. Los Conventional Commits son una especificación para agregar significado semántico a los mensajes de commit, facilitando la comprensión del historial del proyecto (Conventional Commits, 2022).

### Bases de Datos Relacionales y JPA/Hibernate

MySQL es uno de los sistemas de gestión de bases de datos relacionales más utilizados en el mundo. JPA (Java Persistence API) es una especificación de Java que define cómo los objetos Java se mapean a tablas de bases de datos relacionales. Hibernate es la implementación más popular de JPA y proporciona un ORM completo que permite interactuar con la base de datos usando objetos Java.

### Referencias

- Chopra, S., & Meindl, P. (2021). *Supply chain management: Strategy, planning, and operation* (7th ed.). Pearson.
- Walls, C. (2022). *Spring Boot in action* (2nd ed.). Manning Publications.
- Conventional Commits. (2022). *A specification for adding human and machine readable meaning to commit messages*. https://www.conventionalcommits.org
- Fielding, R. T. (2000). *Architectural styles and the design of network-based software architectures* [Doctoral dissertation, University of California]. UCI Repository.

---

## Metodología

El proyecto sigue una metodología ágil adaptada al contexto universitario, dividida en 4 hitos de entrega progresiva:

- **Hito 1 (Semana 5):** Fundamentos, arquitectura y gobierno de código. Configuración del repositorio, estructura base de Spring Boot y reglas de colaboración con Conventional Commits y protección de ramas.
- **Hito 2 (Semana 10):** Desarrollo paralelo, revisiones y resolución de conflictos. Implementación de módulos de negocio con GitHub Projects (Kanban) e integración de Swagger.
- **Hito 3 (Semana 15):** DevSecOps, automatización y contenedores. Configuración de CI/CD con GitHub Actions y empaquetado Docker.
- **Hito 4 (Semana 18):** Despliegue cloud y entrega final. Despliegue en proveedor cloud y documentación completa del sistema.

El equipo utiliza la estrategia de ramificación **Git Flow**, con ramas `main` (producción), `develop` (integración) y `feature/*` (funcionalidades individuales). Todos los commits siguen la convención **Conventional Commits** (`feat:`, `fix:`, `docs:`, `chore:`).

---

## Cronograma de Actividades (Diagrama de Gantt)

| Actividad | Sem 1 | Sem 2 | Sem 3 | Sem 4 | Sem 5 | Sem 6-9 | Sem 10 | Sem 11-14 | Sem 15 | Sem 16-17 | Sem 18 |
|---|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| Configuración repositorio y ramas | ██ | ██ | | | | | | | | | |
| Redacción README (primera mitad) | | ██ | ██ | | | | | | | | |
| Cascarón Spring Boot + H2 | | | ██ | ██ | | | | | | | |
| **Entrega Hito 1 (APF1)** | | | | | ██ | | | | | | |
| Módulo Productos (CRUD) | | | | | | ██ | ██ | | | | |
| Módulo Pedidos (CRUD + estados) | | | | | | | ██ | ██ | | | |
| Integración Swagger/OpenAPI | | | | | | | ██ | ██ | | | |
| **Entrega Hito 2 (APF2)** | | | | | | | | ██ | | | |
| GitHub Actions CI pipeline | | | | | | | | | ██ | | |
| Dockerfile multi-etapa | | | | | | | | | ██ | ██ | |
| **Entrega Hito 3 (APF3)** | | | | | | | | | ██ | | |
| Despliegue cloud | | | | | | | | | | ██ | ██ |
| README completo + informes PDF | | | | | | | | | | ██ | ██ |
| **Entrega Final (PROY)** | | | | | | | | | | | ██ |

---

## Desarrollo del Proyecto

> *Esta sección se completa en el Hito 4 con capturas del sistema en producción, diagramas de base de datos finales y la URL de despliegue.*

### Tecnologías utilizadas

- Java 17
- Spring Boot 4.0.6
- Maven
- MySQL 8.0 (H2 para desarrollo/testing)
- JPA / Hibernate
- Lombok
- Swagger / OpenAPI (springdoc-openapi 3.0.0)
- Git y GitHub
- Docker (Hito 3)

### Estructura del repositorio

```
gestion-inventario-pedidos/
├── README.md                    # Información General del Proyecto
├── .gitignore                   # Exclusiones (target/, .vscode/, .env)
├── LICENSE                      # Licencia MIT del proyecto
├── docs/
│   ├── 01_requisitos.md         # Caso de negocio y requisitos (Hito 1)
│   ├── 02_conflictos.md         # Resolución de conflictos (Hito 2)
│   └── 03_despliegue.md         # Guía de despliegue (Hito 4)
├── src/
│   ├── main/java/...            # Código fuente Spring Boot
│   └── main/resources/...       # Configuración de la aplicación
├── informes/
│   ├── informe_apf1.pdf
│   ├── informe_apf2.pdf
│   └── informe_final.pdf
└── resultados/
    ├── capturas_pantalla/
    └── resumen_ci.md            # Evidencia CI/CD (Hito 3)
```

---

## Resultados

> *Esta sección se completa en el Hito 4 con los resultados finales del sistema desplegado.*

**URL de producción:** *(por definir — Hito 4)*

**Palabras clave:** inventario, pedidos, Spring Boot, REST API, MySQL, control de stock, trazabilidad, gestión comercial, Java, DevSecOps.

---

*Canva del equipo: https://www.canva.com/design/DAHIG4JK4gQ/mod1JlW-Q3ICjJBFg2HYPg/edit*
