package com.data.network.model.pokemon

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.data.network.model.pokemon.MoveLearnMethod,
    val version_group: com.data.network.model.pokemon.VersionGroup
)