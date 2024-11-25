package com.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i") val generation_i: com.data.network.model.pokemon.GenerationI,
    @SerializedName("generation-ii") val generation_ii: com.data.network.model.pokemon.GenerationIi,
    @SerializedName("generation-iii") val generation_iii: com.data.network.model.pokemon.GenerationIii,
    @SerializedName("generation-iv") val generation_iv: com.data.network.model.pokemon.GenerationIv,
    @SerializedName("generation-v") val generation_v: com.data.network.model.pokemon.GenerationV,
    @SerializedName("generation-vi") val generation_vi: com.data.network.model.pokemon.GenerationVi,
    @SerializedName("generation-vii") val generation_vii: com.data.network.model.pokemon.GenerationVii,
    @SerializedName("generation-viii") val generation_viii: com.data.network.model.pokemon.GenerationViii
)