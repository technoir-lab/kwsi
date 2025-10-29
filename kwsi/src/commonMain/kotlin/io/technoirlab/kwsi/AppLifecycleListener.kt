package io.technoirlab.kwsi

/**
 * Listener interface for application lifecycle events.
 */
interface AppLifecycleListener {
    /**
     * Called when the application is launched.
     */
    fun onLaunch() = Unit
}
