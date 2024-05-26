package joaovitorlopes.com.github.scrennmatch_phrases.controller;

import joaovitorlopes.com.github.scrennmatch_phrases.dto.PhraseDTO;
import joaovitorlopes.com.github.scrennmatch_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    @Autowired
    private PhraseService service;

    @GetMapping("/series/frases")
    public PhraseDTO getRandomPhrase() {
        return service.getRandomPhrase();
    }
}
