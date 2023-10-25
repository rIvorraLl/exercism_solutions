package exercism;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
	if (languages.isEmpty()) {
	    return true;
	}
	return false;
    }

    public void addLanguage(String language) {
	languages.add(language);
    }

    public void removeLanguage(String language) {
	languages.remove(language);
    }

    public String firstLanguage() {
	return languages.get(0);
    }

    public int count() {
	int counter = 0;
	for (String lang : languages) {
	    counter++;
	}
	return counter;
    }

    public boolean containsLanguage(String language) {
	return languages.contains(language);
    }

    public boolean isExciting() {
	return languages.contains("Java") || languages.contains("Kotlin");
    }
}
