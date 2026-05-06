# 🕵️‍♂️ Caso Detective – “Hidden”

## 📌 Descripción

**Caso Detective – Hidden** es un programa desarrollado en Java que simula una investigación criminal.
El usuario asume el rol de un detective que debe recolectar pistas, interrogar sospechosos y finalmente resolver el caso.

El sistema incluye lógica interactiva, control de flujo, estructuras de datos y elementos narrativos para hacer la experiencia más dinámica.

---

## 🎯 Objetivo

Aplicar conceptos fundamentales de programación como:

* Estructuras de control (`if`, `while`, `do-while`, `for`)
* Arreglos (arrays)
* Entrada de datos con `Scanner`
* Lógica condicional
* Manejo de variables y estados (puntaje, intentos, historial)

---

## ⚙️ Funcionalidades principales

### 🔍 1. Búsqueda de pistas

El usuario puede recolectar evidencias en la escena del crimen.

### 🧠 2. Interrogatorio de sospechosos

Cada sospechoso tiene:

* Nombre
* Personalidad
* Declaración de inocencia

### ⚖️ 3. Resolución del caso

El usuario puede acusar a un sospechoso como culpable una vez tenga suficientes pistas.

### 💰 4. Sistema de puntaje

* Buscar pistas → +10 puntos
* Interrogar → +5 puntos
* Resolver el caso → +20 puntos

### 🧾 5. Historial de acciones

Se registran las decisiones del jugador durante la partida.

### 🏁 6. Finales múltiples

El resultado del juego cambia dependiendo de:

* Puntaje obtenido
* Número de intentos

---

## 🧍 Sospechosos

* James Barnes 
* Aurelio Vásquez 
* Victoria Reyes 
* Bruno Quiroga  

---

## ▶️ Cómo ejecutar el programa

1. Asegúrate de tener Java instalado
2. Compila el programa:

```bash
javac CasoDetective.java
```

3. Ejecuta el programa:

```bash
java CasoDetective
```

---

## 🧠 Lógica del programa

El programa utiliza un menú interactivo controlado con un ciclo `do-while`, que permite al usuario repetir acciones hasta resolver el caso.

Se manejan variables como:

* `puntaje`
* `pistas`
* `intentos`
* `historial`

Estas permiten simular el progreso del jugador dentro del sistema.

---

## 🚀 Posibles mejoras

* Culpable aleatorio
* Pistas específicas según el culpable
* Sistema de vidas o intentos limitados
* Eventos aleatorios
* Interfaz gráfica

---

## 👨‍💻 Autor

Este proyecto fue desarrollado como ejercicio académico para reforzar habilidades en programación en Java.
1. Estevan González Beltrán

---

## 📚 Conclusión

Este proyecto demuestra la aplicación de estructuras básicas de programación junto con lógica de juego, logrando una experiencia interactiva sencilla pero funcional.

---
