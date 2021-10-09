#Creación de la clase
class Mascota:
    #Constructor
    def __init__(self, nombre, edad: int, tipo, dueño):
        self.nombre = nombre
        self.edad = edad
        self.tipo = tipo
        self.dueño = dueño
        self.genero = "Hembras"

    #Utilizar variables con self, son las que están presentes en la clase
    def SobreMi(self):
        bebida = "agua"
        print("¡Hola! Me llamo " + self.nombre + " y soy un " + self.tipo)
        print('Tengo ', self.edad , 'años. Y mi dueño es: ' + self.dueño)
        print("Me gusta tomar " + bebida)
        

#Se puede tener más de una clase en un archivo
#ES IMPORTANTE LA IDENTAR
class Veterinario:
    pass 

class Pedigree:
    pass


  