package com.app.SandboxTwo;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class DockerThing {

    public static void main(String[] args) {
        System.out.println("before config");
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("tcp://34.73.14.11:2375")
                .withDockerTlsVerify(false)
                .build();

        System.out.println("before Client");
        DockerClient docker = DockerClientBuilder.getInstance(config).build();
        System.out.println("before info");
        Info info = docker.infoCmd().exec();
        System.out.println("beofere print");
        System.out.println(info);
//        System.out.println(docker.inspectContainerCmd("mysql1").exec());
//        docker.
    }

}
