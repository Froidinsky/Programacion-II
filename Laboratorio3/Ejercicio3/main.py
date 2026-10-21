class Sensor:
    tipo = "Generico"

    def __init__(self, id):
        self.id = id
        self.encendido = False

    def activar(self):
        self.encendido = True

    def desactivar(self):
        self.encendido = False


class Camara(Sensor):
    tipo = "Camara"

    def __init__(self, id, resolucion):
        Sensor.__init__(self, id)
        self.resolucion = resolucion


class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"

    def __init__(self, id, alcance):
        Sensor.__init__(self, id)
        self.alcance = alcance


class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehiculo Autonomo"

    def __init__(self, id, resolucion, alcance):
        Sensor.__init__(self, id)
        self.resolucion = resolucion
        self.alcance = alcance


v = VehiculoAutonomo("V1", "1080p", 50)

print(v.id)
print(v.resolucion)
print(v.alcance)

print(v.encendido)
v.activar()
print(v.encendido)

print(VehiculoAutonomo.tipo)