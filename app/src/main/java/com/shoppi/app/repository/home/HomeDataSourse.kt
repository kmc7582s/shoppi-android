package com.shoppi.app.repository.home

import com.shoppi.app.model.HomeData

interface HomeDataSourse {
    fun getHomeData(): HomeData?

}