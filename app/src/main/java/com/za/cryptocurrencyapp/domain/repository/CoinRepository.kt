package com.za.cryptocurrencyapp.domain.repository

import com.za.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.za.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}