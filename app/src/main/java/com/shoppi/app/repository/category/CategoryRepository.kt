package com.shoppi.app.repository.category

import com.shoppi.app.model.Category

class CategoryRepository (
    private val remoteDataSourse: CategoryRemoteDataSource
) {
    suspend fun getCategories(): List<Category> {
        return remoteDataSourse.getCategories()
    }
}