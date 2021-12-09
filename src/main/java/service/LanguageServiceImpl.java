package service;

import model.Language;
import repository.LanguageRepository;

import java.util.Optional;

public class LanguageServiceImpl
    implements LanguageService{

    private LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public Language getLanguage(Integer id) {
        Optional<Language> name = languageRepository.findLanguageById(id);
        return name.orElse(null);
    }

    @Override
    public Optional<Language> getLanguageFromIdLg(Integer id) {
        return languageRepository.findLanguageByIdCountry(id);
    }

    @Override
    public Language save(Language name) {
        return languageRepository.save(name);
    }

    @Override
    public void delete(Integer id) {
        //languageRepository;
    }

    @Override
    public Language updateLanguage(Language name, Integer id) {
        return null;
    }
}
