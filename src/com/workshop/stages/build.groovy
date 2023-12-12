#!/usr/bin/groovy
package com.workshop.stages

import com.workshop.Pipeline
import com.workshop.Config

def build(Pipeline p) {
    c = new Config()

    docker.withTool("${c.default_docker_jenkins_tool}") {
        def image = docker.build("${p.repository_name}:build-$BUILD_NUMBER")
    }
}
