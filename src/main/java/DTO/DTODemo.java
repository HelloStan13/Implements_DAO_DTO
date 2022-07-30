package DTO;

import BO.EmpleadoBO;
import VO.EmpleadoVO;

public class DTODemo {
    public static void main(String[] args) {
        //objeto business object
        EmpleadoBO empleadoBusinessObject = new EmpleadoBO();

        //obtiene todos los clientes
        empleadoBusinessObject.obtenerEmpleados().forEach(System.out::println);

        // actualiza un empleados
        System.out.println("****");
        EmpleadoVO empleados = empleadoBusinessObject.obtenerEmpelados(0);
        empleados.setNombre("Adryan");
        empleadoBusinessObject.actualizarEmpleados(empleados);

        // obtiene un empleados
        System.out.println("****");
        empleados=empleadoBusinessObject.obtenerEmpelados(0);
        System.out.println(empleados);

        //elimina un empleados
        System.out.println("****");
        empleados=empleadoBusinessObject.obtenerEmpelados(0);
        empleadoBusinessObject.eliminarEmpleado(empleados);
    }
}
