package org.example

class EmpleadoPorHora(nombre: String, id: String, val horasTrabajadas: Int, val tarifaPorHora: Double):Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }

    override fun toString(): String {
        return super.toString()+ " tiene un salario de ${calculaSalario()} al mes."
    }
}