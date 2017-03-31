package com.amcbridge.jenkins.plugins.serialization;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class CredentialItem {

    private String scope;
    private String id;
    private String username;
    private String description;
    private String provider;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDisplayName() {
        String result = username + "/***** ";
        if (!description.isEmpty()) {
            result += "(" + description + ")";
        }
        result += " ; " + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CredentialItem) {
            return new EqualsBuilder()
                    .append(this.scope, ((CredentialItem)obj).scope)
                    .append(this.id, ((CredentialItem)obj).id)
                    .append(this.username, ((CredentialItem)obj).username)
                    .append(this.description, ((CredentialItem)obj).description)
                    .append(this.provider, ((CredentialItem)obj).provider)
                    .isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.scope)
                .append(this.id)
                .append(this.username)
                .append(this.description)
                .append(this.provider)
                .toHashCode();
    }
}
