package com.bjgp.miappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform