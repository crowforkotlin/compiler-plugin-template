package com.crow.zipline

import org.jetbrains.kotlin.compiler.plugin.template.fir.SimpleClassGenerator
import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrar

class ZiplineFirPluginRegistrar : FirExtensionRegistrar() {
    override fun ExtensionRegistrarContext.configurePlugin() {
        +::SimpleClassGenerator
    }
}
