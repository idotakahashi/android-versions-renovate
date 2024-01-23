package com.app.artifacts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform