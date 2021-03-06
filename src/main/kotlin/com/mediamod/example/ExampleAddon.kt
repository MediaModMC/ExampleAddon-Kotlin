package com.mediamod.example

import com.mediamod.core.addon.MediaModAddon

/**
 * An example addon for MediaMod 2.0
 *
 * @author Conor Byrne (dreamhopping)
 */
class ExampleAddon : MediaModAddon {
    /**
     * A unique identifier for your MediaMod Addon, this can not be the same as any other addon
     *
     * For example: "spotify-addon" or "extension-addon",
     * If a duplicate identifier is found, a warning will be print to the console and the first addon that was loaded will take priority
     */
    override val identifier = "example-mediamod-addon"

    /**
     * The display name for your addon, this will be shown to the user in various MediaMod menus
     *
     * For example: "Spotify" or "Browser Extension", it is not required to be unique to your addon
     * To avoid confusion, please do not make it the same as any other addon
     */
    override val name = "Example MediaMod Addon"

    /**
     * Called when MediaMod is loading your addon, this will occur around the same time as the forge initialisation event
     * This is also called if your addon has been reloaded by the user
     *
     * @return true if the addon has been loaded successfully, otherwise false
     */
    override fun register(): Boolean {
        println("ExampleAddon loaded!")
        return true
    }

    /**
     * Called when MediaMod is unloading your addon, this will occur around the same time as Minecraft closing
     * This is also called if your addon has been reloaded by the user
     *
     * @return true if the addon has been unloaded successfully, otherwise false
     */
    override fun unregister(): Boolean {
        return true
    }
}