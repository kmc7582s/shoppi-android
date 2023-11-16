package com.shoppi.app.repository.home

import com.shoppi.app.model.HomeData

class HomeRepository (
    private val assetDataSourse: HomeAssetDataSourse
) {

    fun getHomeData(): HomeData? {
        return assetDataSourse.getHomeData()
    }
}