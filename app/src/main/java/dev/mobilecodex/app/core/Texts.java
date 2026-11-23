package dev.mobilecodex.app.core;

import java.util.Map;

/** Translation is explicit at UI/error construction sites; never applied to file or model content. */
public final class Texts {
    private record Catalog(boolean korean, Map<String, String> translations, Map<String, String> source) {}
    private static volatile Catalog catalog = new Catalog(true, Map.of(), Map.of());
    private Texts() {}
    public static void configure(boolean korean, Map<String, String> english) {
        configure(korean, english, english);
    }
    public static void configure(boolean korean, Map<String, String> english, Map<String, String> translations) {
        var reverse = new java.util.HashMap<String, String>();
        english.forEach((key, value) -> reverse.putIfAbsent(value, key));
        catalog = new Catalog(korean, Map.copyOf(translations), Map.copyOf(reverse));
    }
    public static String t(String text) {
        if (text == null) return null;
        Catalog c = catalog;
        String source = c.source.getOrDefault(text, text);
        return c.korean ? source : c.translations.getOrDefault(text, c.translations.getOrDefault(source, text));
    }
}
