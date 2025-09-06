package enamclases;

public enum Language {
  UZ,
  RUS,
  ENG;

  public static Language getByName(String languageName){
    for (Language language : values()) {
      if(language.name().equalsIgnoreCase(languageName)){
        return language;
      }
    }
    return RUS;
  }
}
