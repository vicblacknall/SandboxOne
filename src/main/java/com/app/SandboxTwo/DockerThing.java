package com.app.SandboxTwo;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class DockerThing {

    public static void main(String[] args) {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("tcp://:2375")
                .withDockerTlsVerify(false)
                .build();


        DockerClient docker = DockerClientBuilder.getInstance(config).build();
        Info info = docker.infoCmd().exec();

        System.out.println(info);
//        System.out.println(docker.inspectContainerCmd("mysql1").exec());
//        docker.
    }

}
