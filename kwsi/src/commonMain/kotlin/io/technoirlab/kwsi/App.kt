package io.technoirlab.kwsi

/**
 * The application entry point.
 */
object App {
    /**
     * Run the application.
     *
     * @param listener the listener to receive application lifecycle events
     */
    fun run(listener: AppLifecycleListener) {
        listener.onLaunch()
    }
}
