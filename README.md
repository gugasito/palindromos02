# Tarea evidencia02 "Palindromos"
1.1) El método verifica si la palabra entregada es un palindromo.
Este recoge la cadena, la separa en espacios,
la da vuelta y luego la junta. Si por ejemplo, le entregamos la palabra:
"radar" pasa por el método y al darla vuelta, la compara y devuelve "true"

2.1) El método trabaja de la siguiente manera:

*Recibe una cadena de texto como parámetro: cadena.

*Crea una variable "resultado" vacía para almacenar el resultado de la operación.

*Utiliza el método split para convertir la cadena en un arreglo de caracteres.

*Utiliza el método reverse para invertir el orden de los caracteres en el arreglo.

*Utiliza el método join para convertir el arreglo invertido en una cadena.

*Asigna la cadena invertida a la variable "resultado".

*Compara si la cadena original es igual a la cadena invertida. Si es así, el método retorna "true" indicando que la cadena es un palíndromo. Si no es igual, retorna "false".

3.1) Usaremos un plan de pruebas para comprobar el correcto funcionamiento del programa;
Comprobando si funcionaría para palabras con mayúsculas y minúsculas, frases con espacios, etc.

3.2) Usando pruebas unitarias, tendríamos una que compruebe que al ingresar "hola" el método devuelva un "false".
Al ingresar "anita lava la tina" también devuelva un "true" y que finalmente, al ingresar "Alí tomó tila" y comprobar si correctamente da "true"
También otra que ingresando un legítimo palíndromo como "ana" devuelva un "true". Al usar una frase como "Anita lava la tina" devuelva un "true".

3.4) Para la entrada: "aca" el resultado es "true", comprobando que funciona bien el programa, al igual que para "h".
Para "acas" entrega un "false" correctamente como se codificó en la clase de Tests.

4.2) Se tomaron en consideración los casos de borde de las tildes en las vocales de ciertas palabras,
para que palabras como "acá" fueran tomadas como palindromos, también el resolver casos con mayúsculas y minúsculas mezcladas.
Mejoramos el método y en eso jugaron un rol importante las pruebas antes mencionadas, ya que mejoramos el uso de los recursos y la forma de abordar situaciones como:
los espacios, puntos, comas, tildes, etc.