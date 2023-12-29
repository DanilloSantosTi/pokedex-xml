package com.example.pokedex_xml.domain.model

data class Pokemon(
    val imageUrl: String,
    val number: Int,
    val name: String,
    val type: List<TypePokemon>
)
