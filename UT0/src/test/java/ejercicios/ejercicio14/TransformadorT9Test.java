package ejercicios.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas para TransformadorT9")
class TransformadorT9Test {

    private TransformadorT9 transformador;

    @BeforeEach
    @DisplayName("Inicializar transformador antes de cada test")
    void setUp() {
        transformador = new TransformadorT9();
    }

    //Test básicos

    @Test
    @DisplayName("transformar_texto_retorna_correcto")
    void TransformarTextoTest() {
        String resultado = transformador.transformar("HOLA");
        assertEquals("44-666-555-2", resultado);
    }

    // Test con parámetros

    @ParameterizedTest
    @DisplayName("transformar_caracteres_individuales_retorna_mapeo_correcto")
    @ValueSource(chars = {'A', 'M', 'Z', ' '})
    void TransformarCaracteresIndividualesTest(char caracter) {
        String resultado = transformador.transformar(String.valueOf(caracter));
        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
    }

    // Test de excepciones

    @Test
    @DisplayName("transformar_caracter_no_aalido_lanza_exception")
    void TransformarCaracterNoValidoTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> transformador.transformar("@"),
                "Debe lanzar IllegalArgumentException para carácter '@'"
        );
    }



    // Test con timeout

    @Test
    @DisplayName("transformar_texto_largo_timeout")
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TransformarTextoLargoTimeoutTest() {
        String textoLargo = new String(new char[1000]).replace('\0', 'A');
        String resultado = transformador.transformar(textoLargo);
        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
    }


}