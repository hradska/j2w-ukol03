package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entita.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Karel Čapek", "spisovatel", "Říční 11", "Praha 1", null, "543 987 752", "https://cs.wikipedia.org/wiki/Karel_%C4%8Capek"),
            new Vizitka("Harry Potter", "Čáry máry s.r.o.", "Leavesden", "London", "h.potter@bradavice.com", "62442", "https://cs.wikipedia.org/wiki/Harry_Potter"),
            new Vizitka("Wade Owen Watts", "Gregarious Simulation Systems", "Ivy Hill Drive", "Oklahoma City 73020", "parzival@oasis.com", "343 25 89 37", "https://www.postavy.cz/parzival/"),
            new Vizitka("Bilbo Pytlík", "Poslíček Prstenu", "Český Hobitín", "Dobré - Šediviny", "bilbopytlik@kraj.com", null, "https://cs.wikipedia.org/wiki/Bilbo_Pytl%C3%ADk"),
            new Vizitka("Božena Němcová", "Babička", "Alservorstadt", "Vídeň", null, null, "https://www.spisovatele.cz/bozena-nemcova")
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView vysledek = new ModelAndView("seznam");
        vysledek.addObject("seznamVizitek", seznamVizitek);
        return vysledek;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView vysledek = new ModelAndView("detail");
        vysledek.addObject("vizitka", seznamVizitek.get(id));
        return vysledek;
    }
}
