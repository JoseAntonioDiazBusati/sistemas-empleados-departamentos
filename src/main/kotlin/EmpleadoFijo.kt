package org.example

class EmpleadoFijo(nombre: String, id: String, val salarioFijo: Double, val numPagas: Int):Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }

    override fun toString(): String {
        return super.toString() + " tiene un salario de ${calculaSalario()} al mes."
    }
}