package org.example

abstract class Empleado(val nombre: String, val id: String) {

    abstract fun calculaSalario(): Double

    override fun toString(): String {
        return "$nombre con ID-$id"
    }
}