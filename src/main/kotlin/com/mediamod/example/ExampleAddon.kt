package com.mediamod.example

import com.mediamod.core.addon.MediaModAddon
import com.mediamod.core.service.MediaModServiceRegistry

/**
 * An example addon for MediaMod 2.0
 *
 * @author Conor Byrne (dreamhopping)
 */
class ExampleAddon : MediaModAddon("example-mediamod-addon") {
    /**
     * Called when MediaMod is initialising your addon
     * The addon should be ready for usage when this method is complete
     */
    override fun initialise() {
        println("Hello World")

        // Register the ExampleService, identifier is the addon's identifier
        MediaModServiceRegistry.registerService(identifier, ExampleService())
    }

    /**
     * Called when MediaMod is unloading your addon
     * The addon should do any configuration saving, etc. in this method
     */
    override fun unload() {
        println("Goodbye")
    }
}