
# Tienda Prendas

Aplicación backend desarrollada con Spring Boot y PostgreSQL para gestionar la información de productos de una tienda de prendas de vestir.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- PostgreSQL
- Spring Data JPA
- Spring Web

## Estructura de la tabla productos

La base de datos utiliza una tabla llamada `productos` con los siguientes campos:

| Campo | Tipo de dato | Descripción |
|---|---|---|
| id | BIGINT | Identificador único del producto |
| nombre | VARCHAR(100) | Nombre del producto |
| descripcion | VARCHAR(255) | Descripción del producto |
| precio | NUMERIC(10,2) | Precio del producto |
| imagen | TEXT | URL de la imagen del producto |

## Requisitos previos

- Java JDK 21
- PostgreSQL
- Git (para clonar el repositorio)

## Configuración de la base de datos

1. Iniciar PostgreSQL.
2. Crear una base de datos llamada `tienda_prendas`.
3. Ejecutar el script `database/tienda_prendas.sql` para crear la tabla e insertar los productos de prueba.
4. Configurar las credenciales de conexión en `src/main/resources/application.properties`.

**Importante:** no publicar contraseñas reales en el repositorio.

## Ejecución del proyecto

Desde la carpeta principal del proyecto, ejecutar:

```powershell
.\mvnw.cmd spring-boot:run
```

La aplicación estará disponible en:

- Página principal: http://localhost:8080/
- Estado de conexión: http://localhost:8080/api/estado

## Verificación de conexión

Al iniciar la aplicación, se verifica la conexión con PostgreSQL. Si la conexión es correcta, se muestra el mensaje:

`Conexión a PostgreSQL exitosa`

## Script SQL

El archivo `database/tienda_prendas.sql` contiene las instrucciones para crear la tabla `productos` y cargar los cinco productos de prueba.

## Autor

Proyecto académico desarrollado como parte de una certificación.
