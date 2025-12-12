# 🎮 Minijuego: Adivina el Número (Java MVC)

Un juego de escritorio clásico desarrollado en **Java** utilizando la librería **Swing** para la interfaz gráfica. Este proyecto destaca por implementar el patrón de arquitectura **Modelo-Vista-Controlador (MVC)**, asegurando un código limpio, modular y escalable.

---

## 📋 Características

- **Interfaz Gráfica (GUI):** Ventana amigable construida con Java Swing.
- **Feedback Inmediato:** Indicaciones visuales de "Muy alto" o "Muy bajo" en tiempo real.
- **Usabilidad (UX):** Soporte para jugar presionando el botón o la tecla `ENTER`.
- **Contador de Intentos:** Rastrea cuántas veces has probado suerte.
- **Limpieza Automática:** El campo de texto se limpia automáticamente tras cada intento para agilizar el juego.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 8 o superior).
* **Interfaz:** Java Swing (AWT/Swing).
* **Arquitectura:** MVC (Model-View-Controller).
* **IDE Recomendado:** IntelliJ IDEA.

## 🏗️ Arquitectura del Proyecto (MVC)

El código está estructurado para separar la lógica de negocio de la interfaz de usuario:

| Componente | Archivo | Responsabilidad |
| :--- | :--- | :--- |
| **Modelo** | `Modelo.java` | Contiene la lógica matemática, genera el número aleatorio y verifica los intentos. No sabe nada de la interfaz. |
| **Vista** | `Vista.java` | Maneja la ventana, botones y cajas de texto. Se encarga de mostrar la información al usuario. |
| **Controlador**| `Controlador.java` | Intermediario. Escucha los eventos (clics, Enter) de la Vista y pide datos al Modelo. |
| **Main** | `Main.java` | Punto de entrada. Inicializa e inyecta las dependencias. |

## 🚀 Cómo ejecutarlo

### Opción 1: Desde IntelliJ IDEA
1. Clona este repositorio o descarga el código.
2. Abre la carpeta del proyecto en **IntelliJ IDEA**.
3. Navega a `src/Main.java`.
4. Haz clic en el icono de **Run** (Triángulo verde) o presiona `Shift + F10`.

### Opción 2: Desde la Terminal
Compila y ejecuta los archivos desde la carpeta `src`:

```bash
cd src
javac Main.java
java Main
