package com.linchausen.convention

import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test


internal fun Project.configureTestOutput() {
    tasks.withType(Test::class.java) {
        testLogging {
            events("standardOut", "passed", "skipped", "failed")
        }
    }
}