 2019 1° cuatrimestre
tw1-tp1-farmacia
TRABAJO PRÁCTICO NRO. 1 – TW 1
Integrantes:
Chamorro Debora 35379016
Moreno Ezequiel 27789176
CONSIGNA
Taller​ ​Web​ ​1 Trabajo​ ​práctico​ ​Hibernate​ ​|​ ​Spring​ ​MVC
Fecha límite de entrega: Martes 14 de Mayo 23:59hs.

1- Montar el entorno java y subir un proyecto en común en github. Enviar el link para mirar los commits en github, se validará que existan “push” de ambos miembros del equipo. Se muestra ejemplo de cómo debería verse (no pasar screenshots, con la entrega del TP debe incluir la URL del proyecto en github)

Dado el siguiente modelo:
									Pais (nombre, habitantes, idioma, capital, continente)
									Continente (nombre)
									Ciudad(nombre, ubicacionGeografica, pais)
									Ubicacion(latitud, longitud)

1- Escribir las clases con las relaciones correspondientes
2- Hacer con junit un test que busque todos los países de habla inglesa.
3- Hacer con junit un test que busque todos los países del continente europeo.
4- Hacer con junit un test que busque todos los países cuya capital están al norte del trópico de cáncer.
5- Hacer con junit un test que busque todas las ciudades del hemisferio sur
6- Usando path variables, hacer un action que reciba una operación y una cadena de caracteres y que
lleve a una vista que muestra la siguiente frase “El resultado de <nombre-operacion> sobre <cadena> es
<cadena-resultado>”, donde la <cadena-resultado> es la cadena resultante de aplicar la operación a la
cadena recibida por parámetro. Las operaciones pueden ser: pasarAMayuscula, pasarAMiniscula,
invertirOrden, cantidadDeCaracteres (en este caso se devuelve un número).

