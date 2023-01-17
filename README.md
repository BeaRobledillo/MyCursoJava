# MyCursoJava Clase Producto

* Crear una clase: Product
	* atributos encapsulados (private)
	* constructores: 
		* vacío
		* con todos los parámetros
	* métodos getter setter
	* toString

* Crear una clase Main
	* Crear 5 productos
	* Crear un array de productos
	* Estadísticas
		* Calcular la suma precio total de los productos del array
		* Calcular la media de precio de los productos del array
		* Calcular el precio máximo

* Crear una clase Manufacturer
	* Asociar la clase a Product, de manera que un producto tiene un fabricante
  
    * Crear enum ProductCategory para categorías de producto y agregarla como atributo a la clase Product
  
    * Crear atributo boolean en Product para indicar si un producto está a la venta o no, es decir,
		si está activado. Influye en las estadísticas, si un producto no está activado entonces no se
		debe usar para calcular el precio total ni la media ni el max.