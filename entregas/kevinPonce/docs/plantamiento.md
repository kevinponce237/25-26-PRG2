# Clase `Fraccion`

## Vista pública

### Constructores

* `Fraccion()`
  Constructor por defecto (inicializa a 0/1)

* `Fraccion(int numerador, int denominador)`
  Constructor con numerador y denominador

* `Fraccion(int numerador)`
  Constructor que asume denominador = 1

* `Fraccion(Fraccion otra)`
  Constructor copia

---

### Métodos clave

* `String toString()`
  Devuelve la representación en texto de la fracción

* `double toDecimal()`
  Convierte la fracción a número decimal

* `int calcularMCD(int a, int b)`
  Calcula el máximo común divisor

* `Fraccion clonar()`
  Devuelve una copia de la fracción

* `boolean esIgual(Fraccion fraccion)`
  Compara si dos fracciones son equivalentes

---

### Operaciones aritméticas

* `Fraccion sumar(Fraccion fraccion)`
  Suma dos fracciones

* `Fraccion restar(Fraccion fraccion)`
  Resta dos fracciones

* `Fraccion multiplicar(Fraccion fraccion)`
  Multiplica dos fracciones

* `Fraccion dividir(Fraccion fraccion)`
  Divide dos fracciones

---

### Métodos especiales

* `double inversa()`
  Devuelve el valor decimal de la fracción inversa

* `Fraccion opuesta()`
  Devuelve la fracción opuesta (cambia el signo)

* `boolean esPropia()`
  Indica si la fracción es propia (numerador < denominador)
