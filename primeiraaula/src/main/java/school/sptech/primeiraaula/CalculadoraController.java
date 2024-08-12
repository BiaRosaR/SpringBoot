package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Configuration -> Componente que configura algo
* RestController -> Controladora REST
* @Repository -> Componente*/

@RestController
@RequestMapping("/Calculos")
public class CalculadoraController {

    private int contador;

    @GetMapping("/contar")
    public Integer contar(){
        return ++this.contador;
    }

    @GetMapping("/somar/{num1}/{num2}")
    public Integer somar(@PathVariable Integer num1, @PathVariable Integer num2){
        return num1 + num2;
    }

    @GetMapping("/subtrair/{num1}/{num2}")
    public Integer subtrair(@PathVariable Integer num1, @PathVariable Integer num2){
        return num1 - num2;
    }

    @GetMapping("/divivir/{num1}/{num2}")
    public Integer dividir(@PathVariable Integer num1, @PathVariable Integer num2){
        return num1 / num2;
    }

    @GetMapping("/multiplicar/{num1}/{num2}")
    public Integer multiplicar(@PathVariable Integer num1,@PathVariable Integer num2){
        return num1 * num2;
    }


}
