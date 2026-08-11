package org.example.project

class WasmPlatform: Platform {
    override val name: String = "Showing Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()