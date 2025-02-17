package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val departamento = Departamento()

    val empleado1 = EmpleadoPorHora("Adolf Ollador", "0001", 160, 15.5)
    val empleado2 = EmpleadoFijo("Zack Arias", "0002", 30000.0, 12)
    val empleado3 = EmpleadoPorHora("German Palomares", "0007", 180, 14.0)

    departamento.agregarEmpleado(empleado1)
    departamento.agregarEmpleado(empleado2)
    departamento.agregarEmpleado(empleado3)

    departamento.mostrarEmpleados()
    println("Salario total del departamento: %.2f".format(departamento.calculaSalarioTotal()))
}