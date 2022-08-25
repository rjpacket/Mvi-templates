package com.github.rjpacket.mvitemplates.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.rjpacket.mvitemplates.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        projectInstance = project
        project.getService(MyProjectService::class.java)
    }

    override fun projectClosed(project: Project) {
        projectInstance = null
        super.projectClosed(project)
    }

    companion object {
        var projectInstance: Project? = null
    }
}
