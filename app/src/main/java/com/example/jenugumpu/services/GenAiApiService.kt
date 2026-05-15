package com.example.jenugumpu.services

import retrofit2.http.Body
import retrofit2.http.POST

data class AiRequest(val prompt: String)
data class AiResponse(val result: String)

interface GenAiApiService {
    @POST("generate")
    suspend fun generateAdvice(@Body request: AiRequest): AiResponse
}
