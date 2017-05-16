package com.tutorial.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.task("hello") {
            println(" Hello from groovy!!")
        }
    }
}
