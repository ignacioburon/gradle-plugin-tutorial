package com.tutorial.gradle

import com.tutorial.gradle.impl.FileCreator
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTestableTasik extends DefaultTask {
    File outputFile = new File(project.buildDir, "myfile.txt")

    @TaskAction
    def action() {
        def creator = new FileCreator(outputFile)
        creator.create()
    }
}
