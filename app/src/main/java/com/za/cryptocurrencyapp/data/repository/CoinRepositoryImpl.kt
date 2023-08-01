package com.za.cryptocurrencyapp.data.repository

import com.za.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.za.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.za.cryptocurrencyapp.data.remote.dto.CoinDto
import com.za.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}