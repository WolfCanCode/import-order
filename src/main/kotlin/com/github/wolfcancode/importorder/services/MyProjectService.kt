package com.github.wolfcancode.importorder.services

import com.intellij.openapi.project.Project
import com.github.wolfcancode.importorder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
