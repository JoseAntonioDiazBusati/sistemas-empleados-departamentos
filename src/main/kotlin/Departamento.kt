package org.example

class Departamento {
    private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal(): Double {
        return empleados.sumOf { it.calculaSalario() }
    }

    fun mostrarEmpleados() {
        empleados.forEach { println(it) }
    }
}