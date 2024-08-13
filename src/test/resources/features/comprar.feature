# autor: Dana Paulina Chaparro Vera
# language: es

@comprar
Característica: Carrito de compras

  @RutaCritica
  Escenario: Realizar flujo para compra de item
    Dado que el cliente ha iniciado sesion
    Cuando agrega el articulo al carrito
    Y realiza el pago del articulo
      | firstName | lastName | postalCode1 |
      | Dana      | Chaparro | 540011      |
    Entonces deberia ver el valor 15.99 y su orden generada