package com.shoppi.app.repository.home

import com.google.gson.Gson
import com.shoppi.app.AssetLoader
import com.shoppi.app.model.HomeData

class HomeAssetDataSourse(private val assetLoader: AssetLoader) : HomeDataSourse {

     private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let { homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}
