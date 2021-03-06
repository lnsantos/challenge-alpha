package com.example.challenge_alpha.model

import com.google.gson.annotations.SerializedName

/**
 * A classe [Header] define os dados de cabeçalho recebidos do servidor.
 *
 * A classe [HurbResponse] agrupa todos os dados recebidos no JSON do servidor através do retrofit
 * [HurbCall]
 *
 */

data class Header(
    @SerializedName("count") val meta: Int? = null,
    @SerializedName("offset") val offset: Int? = null,
    @SerializedName("query") val query: String? = null,
    @SerializedName("countHotel") val countHotel: Int? = null,
    @SerializedName("countPackage") val countPackage: Int? = null,
    @SerializedName("countTicket") val countTicket: Int? = null,
    @SerializedName("countBustrip") val countBustrip: Int? = null
    )