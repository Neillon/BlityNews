package com.blityapps.blitynews.domain.enums

enum class NewsLanguage(val langCode: String) {
    AR("ar"),
    DE("de"),
    EN("en"),
    ES("es"),
    FR("fr"),
    HE("he"),
    IT("it"),
    NL("nl"),
    NO("no"),
    PT("pt"),
    RU("ru"),
    SE("se"),
    UD("ud"),
    ZH("zh");

    companion object {
        fun fromString(value: String): NewsLanguage? {
            return values().firstOrNull { it.langCode == value }
        }
    }
}