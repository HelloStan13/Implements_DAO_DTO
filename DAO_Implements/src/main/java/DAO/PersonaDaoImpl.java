package DAO;

import IDAO.IPersonaDao;
import Model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements IPersonaDao {

    //lista de tipo persona
    List<Persona> personas;

    //inicializar los objetos persona
    // y añadirlos a la lista
    public PersonaDaoImpl() {
        personas = new ArrayList<>();
        Persona persona1 = new Persona(0,"Adryan", "Valero");
        Persona persona2 = new Persona(1,"Ingrid","Bedoya");
        personas.add(persona1);
        personas.add(persona2);
    }

    //obtener todos las personas
    @Override
    public List<Persona> obtenerPersonas() {
        return personas;
    }

    //obtener un persona por el id
    @Override
    public Persona obtenerPersona(int id) {
        return personas.get(id);
    }

    //actualizar un persona
    @Override
    public void actualizarPersona(Persona persona) {
        personas.get(persona.getId()).setNombre(persona.getNombre());
        personas.get(persona.getId()).setApellido(persona.getApellido());
        System.out.println("Persona con id: "+ persona.getId()+" actualizado exitoso");
    }

}