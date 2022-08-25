package com.github.rjpacket.mvitemplates.services

import com.intellij.openapi.project.Project
import com.github.rjpacket.mvitemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
