package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/filmes")
public class FilmesController {

    @GetMapping("/favoritos")
    public List<Filme> getFavorito(){
        Diretor rosa = new Diretor("Beatriz Rosa");
        Diretor tony = new Diretor("Tony Hawk");
        Diretor perfct = new Diretor("Collen Hoover");

        Filme filmeFavorito = new Filme("Meu Malvado favorito", tony);
        Filme filmeFavorito2 = new Filme("Jogos Vorazes", rosa);
        Filme filmeFavorito3 = new Filme("É ASSIM QUE ACABA", perfct);

        List<Filme> filmes = List.of(filmeFavorito, filmeFavorito2, filmeFavorito3);
        return filmes;
    }
}
