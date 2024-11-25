package com.domain

import com.data.PokemonRepository
import com.data.network.model.PokedexObject
import com.data.network.model.pokemon.Pokemon

class PokemonInfoRequirement {
    private val repository = PokemonRepository()

    suspend operator fun invoke(
        numberPokemon:Int
    ): Pokemon? = repository.getPokemonInfo(numberPokemon)
}