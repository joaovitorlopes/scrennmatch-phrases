package joaovitorlopes.com.github.scrennmatch_phrases.repository;

import joaovitorlopes.com.github.scrennmatch_phrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
}
