package com.data.network.model.pokemon

data class Move(
    val move: com.data.network.model.pokemon.MoveX,
    val version_group_details: List<com.data.network.model.pokemon.VersionGroupDetail>
)