package br.com.mobileexercises

fun String?.isFieldValid(regex: Regex): Boolean {
    return this?.contains(regex) ?: run { false }
}