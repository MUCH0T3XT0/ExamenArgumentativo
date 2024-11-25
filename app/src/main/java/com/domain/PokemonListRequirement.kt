package com.domain

import com.data.PokemonRepository
import com.data.network.model.PokedexObject

class PokemonListRequirement {
    private val repository = PokemonRepository()

    suspend operator fun invoke(
        limit:Int
    ): PokedexObject? = repository.getPokemonList(limit)
}