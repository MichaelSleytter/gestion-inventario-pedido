# Justificación del Proyecto

## Realidad Problemática

La distribuidora comercial objeto de estudio opera actualmente con
registros manuales en hojas de cálculo y cuadernos físicos para
el control de su inventario. Esta situación genera múltiples problemas
operativos que afectan directamente la rentabilidad del negocio.

Entre los problemas identificados se encuentran:

- Pérdidas económicas por descontrol de stock, generando tanto
  desabastecimiento como sobrestock de productos.
- Imposibilidad de conocer en tiempo real el nivel de inventario
  disponible en almacén.
- Registros manuales propensos a errores humanos, duplicidades
  y pérdida de información.
- Dificultad para gestionar pedidos de clientes de manera organizada
  y con seguimiento de estados.
- Ausencia total de trazabilidad en los movimientos de entrada
  y salida de productos.
- Demoras en la atención al cliente por falta de información
  inmediata sobre disponibilidad de productos.

Esta situación representa una brecha tecnológica significativa
que impacta negativamente en la competitividad de la empresa
frente a distribuidoras que ya cuentan con sistemas digitales.

## Justificación

El desarrollo de un sistema web de gestión de inventario y pedidos
representa una solución directa a los problemas identificados.
La implementación de esta herramienta tecnológica permitirá:

Automatizar el control de stock en tiempo real, eliminando los
registros manuales y reduciendo el margen de error humano. El sistema
actualizará automáticamente el inventario con cada movimiento
registrado, ya sea una entrada por compra o una salida por pedido.

Digitalizar la gestión de pedidos, permitiendo al personal registrar,
consultar y actualizar el estado de cada pedido desde cualquier
dispositivo con acceso al sistema, mejorando la atención al cliente
y reduciendo los tiempos de respuesta.

Generar trazabilidad completa de todos los movimientos de inventario,
manteniendo un historial detallado que permitirá auditorías internas
y toma de decisiones basada en datos reales.

Controlar el acceso mediante roles diferenciados, garantizando que
cada usuario solo pueda realizar las acciones correspondientes a
su perfil, aumentando la seguridad de la información.

## Alcance

El sistema cubrirá los siguientes módulos:
- Gestión de productos y categorías
- Control de stock e inventario
- Gestión de pedidos y detalle de pedidos
- Registro de movimientos de inventario
- Administración de usuarios con roles
- API REST documentada con Swagger

No forma parte del alcance actual:
- Módulo de facturación electrónica
- Integración con sistemas contables externos
- Aplicación móvil nativa