import math

class Vector3D:
    def __init__(self, a1, a2, a3):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3

    # inciso a
    def __add__(self, b):
        return Vector3D(self.a1 + b.a1, self.a2 + b.a2, self.a3 + b.a3)

    # inciso b, e
    def __mul__(self, otro):
        if isinstance(otro, (int, float)):
            return Vector3D(self.a1 * otro, self.a2 * otro, self.a3 * otro)
        elif isinstance(otro, Vector3D):
            return (self.a1 * otro.a1) + (self.a2 * otro.a2) + (self.a3 * otro.a3)

    def __rmul__(self, otro):
        return self.__mul__(otro)

    # inciso c
    def __abs__(self):
        return math.sqrt(self.a1**2 + self.a2**2 + self.a3**2)

    # inciso d
    def normal(self):
        longitud = abs(self)
        if longitud == 0:
            return Vector3D(0, 0, 0)
        return Vector3D(self.a1 / longitud, self.a2 / longitud, self.a3 / longitud)

    # inciso f
    def __xor__(self, b):
        return Vector3D(
            (self.a2 * b.a3) - (self.a3 * b.a2),
            (self.a3 * b.a1) - (self.a1 * b.a3),
            (self.a1 * b.a2) - (self.a2 * b.a1)
        )

    def __str__(self):
        return f"({self.a1:.2f}, {self.a2:.2f}, {self.a3:.2f})"


if __name__ == "__main__":
    a = Vector3D(1.0, 2.0, 3.0)
    b = Vector3D(4.0, 5.0, 6.0)
    r = 2.0

    print(f"Vector a: {a}")
    print(f"Vector b: {b}")
    print(f"Escalar r: {r}\n")

    print(f"a) Suma (a + b): {a + b}")
    print(f"b) Escalar por vector ({r} * a): {r * a}")
    print(f"c) Longitud de a (|a|): {abs(a):.2f}")
    print(f"d) Normal de a: {a.normal()}")
    print(f"e) Producto escalar (a · b): {a * b}")
    print(f"f) Producto vectorial (a x b): {a ^ b}")
