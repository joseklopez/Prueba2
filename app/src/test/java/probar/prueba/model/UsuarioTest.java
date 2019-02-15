package probar.prueba.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    private Usuario usuario;

    private static final String NOMBRE = "Nombre";
    private static final String APELLIDO = "Apellido";

    @Before
    public void crearUsuario() {
        this.usuario = new Usuario();
        this.usuario.setNombre("Nombre");
        this.usuario.setApellido("Apellido");
    }

    @Test
    public void nombreYApellido() {
        assertEquals(usuario.nombreYApellido(), NOMBRE + " " + APELLIDO);
    }

    @Test
    public void nombre() {
        assertEquals(usuario.getNombre(), NOMBRE);
    }

    @Test
    public void apellido() {
        assertEquals(usuario.getApellido(), APELLIDO);
    }

    @After
    public void eliminarUsuario() {
        //no necesario
        this.usuario = null;
    }
}