package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
/ Metaprogramação = disposnibilizar no nosso código super poderes. Utilizando o @;
/ Não é superficial, faz diferença no código. Afeta as funcionalidades
 */

@RestController // cria uma controladoranREST
@RequestMapping("/frases") // Endereço padrão
public class FrasesController {
    /*
    * Essa notação possibilita que esse método se torne um endpoint do tipo GET. */
    @GetMapping
    public String helloSpring(){ // URI
        return "Olá Mundo!";
    }
    @GetMapping("/saudacao/{nome}/{idade}")
    public String saudar(@PathVariable String nome, @PathVariable Integer idade){ // URI
        return "Olá %s, sua idade é %d anos de vida.".formatted(nome, idade);
    }

}
