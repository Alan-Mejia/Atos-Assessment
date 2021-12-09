package service;

import model.Language;

import java.util.Optional;

public interface LanguageService {
    Language getLanguage(Integer id);
    Optional<Language> getLanguageFromIdLg(Integer id);
    Language save(Language name);
    void delete(Integer id);
    Language updateLanguage(Language name, Integer id);
}
