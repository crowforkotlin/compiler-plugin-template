package com.crow.zipline

import com.crow.zipline.ir.ZiplineIrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.template.SimplePluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.template.ir.SimpleIrGenerationExtension
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrarAdapter

class ZiplineCompilerPluginRegistrar: CompilerPluginRegistrar() {
    override val supportsK2: Boolean
        get() = true

    override fun ExtensionStorage.registerExtensions(configuration: CompilerConfiguration) {
        FirExtensionRegistrarAdapter.registerExtension(ZiplineFirPluginRegistrar())
        IrGenerationExtension.registerExtension(ZiplineIrGenerationExtension())
    }
}
