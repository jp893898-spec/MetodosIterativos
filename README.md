# Práctica: Métodos Iterativos (Jacobi y Gauss-Seidel)

**Instituto Tecnológico Superior de Xalapa (ITSX)**  
**Carrera:** Ingeniería en Sistemas Computacionales  
**Asignatura:** Métodos Numéricos (SCC-1017)  
**Docente:** Víctor Hugo Vásquez Herrera  
**Alumno:** Juan Pablo Fernández Sangabriel

---

## 1. Estructura Modular del Proyecto

El proyecto implementa la resolución de sistemas de ecuaciones lineales mediante métodos iterativos bajo un enfoque modular:

* `MetodoJacobi.java`: Implementa el método de Jacobi calculando el vector $X^{(k+1)}$ usando exclusivamente los valores de la iteración previa $X^{(k)}$. Define además la función estática `calcularError()`.
* `GaussSeidelMetodo.java`: Implementa el método de Gauss-Seidel, reutilizando la función `calcularError()` importada de Jacobi y actualizando los componentes del vector solución de manera inmediata en la misma iteración.
* `Main.java`: Clase principal para definir el sistema de ecuaciones, inicializar el vector inicial $X^{(0)} = [0, 0, 0]^T$ y la tolerancia $\varepsilon = 0.0001$, y ejecutar ambos métodos.

---

## 2. Instrucciones para Compilar y Ejecutar

### Requisitos
* Java Development Kit (JDK) 8 o superior.

### Comandos de Ejecución
```bash
javac Main.java MetodoJacobi.java GaussSeidelMetodo.java
java Main
```

---

## 3. Resultados y Salida en Consola

```text
==========================================
 RESOLUCIÓN POR MÉTODO DE JACOBI 
==========================================

--- ITINERARIO MÉTODO DE JACOBI ---
Iter       x1           x2           x3           Error       
1          1.400000     1.500000     1.600000     1.000000    
2          0.780000     0.750000     0.720000     1.128205    
3          1.106000     1.125000     1.144000     0.370629    
4          0.946200     0.937500     0.928800     0.227436    
5          1.026740     1.031250     1.035760     0.103267    
6          0.986598     0.984375     0.982152     0.054336    
7          1.006695     1.007813     1.008930     0.026541    
8          0.996651     0.996094     0.995536     0.013439    
9          1.001674     1.001953     1.002232     0.006681    
10         0.999163     0.999023     0.998884     0.003351    
11         1.000419     1.000488     1.000558     0.001673    
12         0.999791     0.999756     0.999721     0.000837    
13         1.000105     1.000122     1.000140     0.000418    
14         0.999948     0.999939     0.999930     0.000209    
15         1.000026     1.000031     1.000035     0.000105    
16         0.999987     0.999985     0.999983     0.000052    
Convergencia alcanzada en la iteración 16

==========================================
 RESOLUCIÓN POR MÉTODO DE GAUSS-SEIDEL 
==========================================

--- ITINERARIO MÉTODO DE GAUSS-SEIDEL ---
Iter       x1           x2           x3           Error       
1          1.400000     1.150000     0.860000     1.000000    
2          0.998000     1.035500     0.986200     0.388218    
3          0.995660     1.004535     0.999054     0.030825    
4          0.999282     1.000416     0.999977     0.004117    
5          0.999921     1.000025     1.000006     0.000639    
6          0.999994     1.000000     1.000001     0.000072    
Convergencia alcanzada en la iteración 6

Process finished with exit code 0
