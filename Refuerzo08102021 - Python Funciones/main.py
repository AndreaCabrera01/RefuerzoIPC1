#importar clases
from mascotas import Mascota

#Creamos las mascotas
mascota1 = Mascota("Kiki", 6, "Gato", "Yania")
mascota2 = Mascota("Dayamon", 4, "Perro", "Rami")
mascota3 = Mascota("Hera", 1, "Gato", "Adriana")
mascota4 = Mascota("JuanCarlos", 5, "Cerdito", "RACSO")

#Llamar al método SobreMi() de la clase Mascota
mascota1.SobreMi()
mascota2.SobreMi()
mascota3.SobreMi()
mascota4.SobreMi()



#Función simple, no recibe parámetros ni retorna valores
def MiFuncion():
    print("Hola")
    x = 1 + 2
    print(x)
#Llamar una Función, sin enviar parámetros
MiFuncion()

#Función con un parámetro
def MultiplicarString(num):
    print("Refuerzo " * num)
#Llamar una función enviando un parámetro
MultiplicarString(5)

#Función con varios parámetros
def ImprimirMisDatos(nombre, apellido, edad):
    print("Mi nombre es: "+ nombre + " " + apellido)
    print('Tengo ' + str(edad) + " años")

#Llamar función con varios parámetros
ImprimirMisDatos("Carlos", "Soto", 21)
ImprimirMisDatos("Rami", "Télles", 19)

#Función que retorna valores
def Division(a, b):
    div = a / b  #Devuelven un Float
    return div
#Guardar el valor que retorna la función
resultado = Division(25, 5)
resultado += 1
print(resultado)




