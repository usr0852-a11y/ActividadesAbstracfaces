# Actividades Abstract Faces – Programación DAM

Este proyecto contiene dos actividades centradas en el uso de clases abstractas, herencia y cálculo geométrico, así como la simulación de un coche de combustión mediante POO.

---

## Actividad 1: Figuras geométricas

En esta actividad se implementan dos figuras: **Rectángulo** y **Círculo**, ambas heredando de la interfaz `CalculoBidimensional`.

### Datos solicitados al usuario
El programa pide por consola:

### Para el rectángulo:
- Base
- Altura

Con esos datos se instancia un objeto `Rectangulo` y se muestran:
- Base introducida
- Altura introducida
- Área calculada
- Perímetro calculado

### Para el círculo:
- Radio

Con esos datos se instancia un objeto `Circulo` y se muestran:
- Radio introducido
- Área calculada
- Perímetro calculado

---

## Actividad 2: Coche de combustión

En esta actividad se crea un objeto `CocheCombustion`, que hereda de `Vehiculo`.

### Datos solicitados al usuario
- Color
- Modelo
- Matrícula
- Número de puertas
- Número de ruedas

El coche se crea con **20 litros de combustible iniciales**.

### Acciones realizadas
El programa:
1. Intenta mover el coche sin arrancar (mensaje de error esperado).
2. Arranca el motor.
3. Mueve el coche varias veces, consumiendo combustible.
4. Muestra el combustible restante.
5. Establece el combustible a 2 litros.
6. Intenta mover el coche tres veces más (hasta quedarse sin combustible).



