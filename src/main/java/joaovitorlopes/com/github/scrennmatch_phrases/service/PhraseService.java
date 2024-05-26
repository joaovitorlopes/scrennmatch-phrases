package joaovitorlopes.com.github.scrennmatch_phrases.service;

import joaovitorlopes.com.github.scrennmatch_phrases.dto.PhraseDTO;
import joaovitorlopes.com.github.scrennmatch_phrases.model.Phrase;
import joaovitorlopes.com.github.scrennmatch_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

    @Autowired
    private PhraseRepository repository;

    public PhraseDTO getRandomPhrase() {
        Phrase phrase = repository.findRandomPhrase();
        return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(), phrase.getCharacter(), phrase.getPoster());
    }
}
