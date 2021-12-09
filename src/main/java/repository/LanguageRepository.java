package repository;

import model.Language;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface LanguageRepository
    extends PagingAndSortingRepository<Language, Integer> {
    Optional<Language> findLanguageById(Integer id);
    Optional<Language> findLanguageByIdCountry(Integer id);
}
