package com.blityapps.blitynews.domain.enums

enum class NewsCategory(val key: String) {
    BUSINESS("business"),
    ENTERTAINMENT("entertainment"),
    GENERAL("general"),
    HEALTH("health"),
    SCIENCE("science"),
    SPORTS("sports"),
    TECHNOLOGY("technology");

    companion object {
        fun fromString(value: String): NewsCategory? {
            return values().firstOrNull { it.key == value }
        }
    }
}