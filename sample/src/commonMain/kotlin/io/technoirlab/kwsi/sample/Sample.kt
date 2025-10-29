package io.technoirlab.kwsi.sample

import io.github.oshai.kotlinlogging.KotlinLogging
import io.technoirlab.kwsi.AppLifecycleListener

internal class Sample : AppLifecycleListener {
    private val logger = KotlinLogging.logger {}

    override fun onLaunch() {
        logger.info { "App launched" }
    }
}
