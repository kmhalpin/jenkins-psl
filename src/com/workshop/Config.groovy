#!/usr/bin/groovy
package com.workshop

class Config {
    // Docker related default var
    def default_docker_jenkins_tool = 'docker'

    // Golang related default var
    def default_golang_base_image = "tobapramudia/tkpd-demo:onbuild"
}