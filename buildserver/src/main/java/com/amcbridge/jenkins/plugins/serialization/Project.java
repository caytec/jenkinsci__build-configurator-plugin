package com.amcbridge.jenkins.plugins.serialization;

import com.google.common.collect.Lists;
import java.util.List;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@XStreamAlias("project")
public class Project {

    @XStreamAsAttribute
    private String pathToFile;
    @XStreamAsAttribute
    private String localDirectory;
    @XStreamAsAttribute
    private Repository repository;
    @XStreamAsAttribute
    private PathToArtifacts pathToArtifacts;
    @XStreamAsAttribute
    private VersionFile versionFiles;
    @XStreamAsAttribute
    private List<Config> configs;

    public Project() {
        this.configs = Lists.newLinkedList();
    }

    public void setPathToArtefacts(PathToArtifacts value) {
        pathToArtifacts = value;
    }

    public PathToArtifacts getPathToArtefacts() {
        return pathToArtifacts;
    }

    public void setPathToFile(String value) {
        pathToFile = value;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public String getLocalDirectory() {
        return localDirectory;
    }

    public void setLocalDirectory(String value) {
        localDirectory = value;
    }

    public void setRepository(Repository value) {
        repository = value;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setVersionFiles(VersionFile value) {
        versionFiles = value;
    }

    public VersionFile getVersionFiles() {
        return versionFiles;
    }

    public void setConfigs(List<Config> value) {
        configs = value;
    }

    public List<Config> getConfigs() {
        return configs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Project) {
            return new EqualsBuilder()
                    .append(this.pathToFile, ((Project)obj).pathToFile)
                    .append(this.localDirectory, ((Project)obj).localDirectory)
                    .append(this.repository, ((Project)obj).repository)
                    .append(this.pathToArtifacts, ((Project)obj).pathToArtifacts)
                    .append(this.versionFiles, ((Project)obj).versionFiles)
                    .append(this.configs, ((Project)obj).configs)
                    .isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.pathToFile)
                .append(this.localDirectory)
                .append(this.repository)
                .append(this.pathToArtifacts)
                .append(this.versionFiles)
                .append(this.configs)
                .toHashCode();
    }
}
