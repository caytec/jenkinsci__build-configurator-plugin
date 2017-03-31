package com.amcbridge.jenkins.plugins.serialization;

import com.google.common.collect.Lists;
import java.util.List;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class VersionFile {

    @XStreamImplicit(itemFieldName = "file")
    private List<String> files;

    @XStreamAsAttribute
    private Boolean versionFile;

    public VersionFile() {
        this.files = Lists.newLinkedList();
        this.versionFile = false;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public List<String> getFiles() {
        return files;
    }

    public void addFile(String value) {
        files.add(value);
    }

    public void setIsVersionFile(Boolean versionFile) {
        this.versionFile = versionFile;
    }

    public Boolean isVersionFile() {
        return versionFile;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VersionFile) {
            return new EqualsBuilder()
                    .append(this.files, ((VersionFile)obj).files)
                    .append(this.versionFile, ((VersionFile)obj).versionFile)
                    .isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.files)
                .append(this.versionFile)
                .toHashCode();
    }
}