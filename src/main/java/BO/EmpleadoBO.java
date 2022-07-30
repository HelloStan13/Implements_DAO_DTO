package BO;

import VO.EmpleadoVO;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoBO {

    //lista de tipo empleado
    List<EmpleadoVO> empleados;


    //constructor, se guarda en la lista 2 empleados
    public EmpleadoBO() {
        empleados = new ArrayList<>();
        EmpleadoVO empleado1= new EmpleadoVO(0,"Maria","Bedoya");
        EmpleadoVO empleado2= new EmpleadoVO(1,"Patricia","Velazques");
        empleados.add(empleado1);
        empleados.add(empleado2);
    }

    //elimina el empleado que se le pasa como paraámetro
    public void eliminarEmpleado(EmpleadoVO empleado) {
        empleados.remove(empleado.getId());
        System.out.println("Empleado "+empleado.getId()+" eliminación exitosa");
    }

    //obtiene toda la lista de empleados
    public List<EmpleadoVO> obtenerEmpleados(){
        return empleados;
    }

    //obtiene un empleado de acuerdo al id pasado como parámetro
    public EmpleadoVO obtenerEmpelados(int id) {
        return empleados.get(id);
    }

    // actualiza el empleado que se le pasa como parámetro
    public void actualizarEmpleados(EmpleadoVO empleado) {
        empleados.get(empleado.getId()).setNombre(empleado.getNombre());
        empleados.get(empleado.getId()).setApellido(empleado.getApellido());
        System.out.println("Empleado id: "+ empleado.getId()+" actualizado exitoso");
    }
}