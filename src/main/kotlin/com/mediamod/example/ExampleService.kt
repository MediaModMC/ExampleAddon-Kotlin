package com.mediamod.example

import com.mediamod.core.service.MediaModService
import com.mediamod.core.track.TrackMetadata

/**
 * An example service for MediaMod 2.0
 *
 * @author Conor Byrne (dreamhopping)
 */
class ExampleService : MediaModService("example-addon-service") {
    /**
     * Called when MediaMod wants to get a [TrackMetadata] instance from you
     * This is called every 3 seconds to avoid rate limits if you are using an API
     * You can do network operations on this method
     *
     * @return null if there is no TrackMetadata available
     */
    override fun fetchTrackMetadata() = TrackMetadata("My Track", "My Artist")

    /**
     * Called when MediaMod is querying your service to check if it is ready to provide track information
     * You should NOT do any network operations on this call
     *
     * @return true if you are ready to return [TrackMetadata], otherwise false
     */
    override fun hasTrackMetadata() = true

    /**
     * Called when your service is being registered
     * You should do any once-off operations in here like configuration file reading, etc.
     * Once this method is complete, your service needs to be ready to use
     */
    override fun initialise() {
        println("My service has been initialised!")
    }
}
