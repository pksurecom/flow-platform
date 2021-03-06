/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.util.git.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * The base class of all git web hook event
 *
 * @author yang
 */
public abstract class GitEvent implements Serializable {

    protected GitSource gitSource;

    protected GitEventType type;

    /**
     * Event trigger user email
     */
    @SerializedName(value = "user_email")
    protected String userEmail;

    public GitEvent(GitSource gitSource, GitEventType type) {
        this.gitSource = gitSource;
        this.type = type;
    }

    public GitSource getGitSource() {
        return gitSource;
    }

    public void setGitSource(GitSource gitSource) {
        this.gitSource = gitSource;
    }

    public GitEventType getType() {
        return type;
    }

    public void setType(GitEventType type) {
        this.type = type;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "GitEvent{" +
            "source=" + gitSource +
            ", type=" + type +
            '}';
    }
}
