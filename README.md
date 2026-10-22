<div align="center">

# Food Truck Express

### Registro y análisis de ventas para un negocio de comida rápida

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

</div>

## Descripción

**Food Truck Express** es una aplicación de consola desarrollada en Java para registrar, organizar y analizar los ingresos diarios de un food truck. El sistema centraliza las ventas de tres productos —**Hamburguesas**, **Perros Calientes** y **Papas Fritas**— a lo largo de cuatro turnos: **Almuerzo**, **Tarde**, **Noche** y **Madrugada**.

Los datos se almacenan en una matriz que relaciona cada producto con cada turno. Al completar el registro, la aplicación procesa la información y presenta un resumen financiero para facilitar la consulta del desempeño de las ventas frente a una meta definida.

## Características

- Registra los ingresos de cada producto en cada turno, para un total de 12 valores por ejecución.
- Valida la entrada: solicita nuevamente el dato si no es numérico o si es negativo. Se aceptan montos iguales a cero.
- Calcula y muestra la recaudación acumulada por producto y por turno.
- Calcula el total general recaudado.
- Identifica el producto y el turno con mayor y menor recaudación.
- Compara el total general con la meta de **$500.000** e informa si fue superada.

## Requisitos previos

- Java JDK instalado y disponible desde la terminal (`java` y `javac`).
- Una terminal abierta en la carpeta raíz del proyecto.

## Compilar y ejecutar

En Windows PowerShell, ejecuta:

```powershell
javac -d out src\application\Main.java
java -cp out application.Main
```

El programa solicita el ingreso de cada venta indicando el producto y el turno correspondiente. Introduce un valor numérico mayor o igual a cero para continuar; si el dato no cumple estas condiciones, se mostrará un mensaje de error y se volverá a solicitar.

## Reporte generado

Al terminar el registro, la consola muestra:

1. El total recaudado por cada producto.
2. El total recaudado en cada turno.
3. El producto y el turno con mayor y menor recaudación.
4. El total general de ventas.
5. El resultado de la comparación con la meta de ventas.

La meta se considera alcanzada únicamente cuando el total general **supera** los **$500.000**. Si el total es exactamente $500.000 o inferior, se informa que no fue alcanzada.

## Estructura del proyecto

```text
Comida-rapidas/
├── src/
│   └── application/
│       └── Main.java
└── README.md
```

## Desarrollador

Desarrollado por **TeoST**.
