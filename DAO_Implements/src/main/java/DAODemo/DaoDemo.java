package DAODemo;

import DAO.PersonaDaoImpl;
import IDAO.IPersonaDao;
import Model.Persona;

public class DaoDemo {

    public static void main(String[] args) {
        // objeto para manipular el dao
        IPersonaDao personaDao = new PersonaDaoImpl();

        // imprimir
        personaDao.obtenerPersonas().forEach(System.out::println);

        // obtner
        Persona persona = personaDao.obtenerPersona(0);
        persona.setApellido("Ynfante");
        //actualizar
        personaDao.actualizarPersona(persona);

        // imprimir
        System.out.println("*****");
        personaDao.obtenerPersonas().forEach(System.out::println);
    }
}
