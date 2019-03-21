package com.example.kotlinSub2Ara.api
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.net.URL

class SearchRepository {
    fun doRequest(url: String) : Deferred<String> = GlobalScope.async {
        URL(url).readText()
    }
}