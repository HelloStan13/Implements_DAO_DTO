package IDAO;

import Model.Persona;

import java.util.List;

public interface IPersonaDao {
    //declaración de métodos para acceder a la base de datos
    public List<Persona> obtenerPersonas();
    public Persona obtenerPersona(int id);
    public void actualizarPersona(Persona persona);

}