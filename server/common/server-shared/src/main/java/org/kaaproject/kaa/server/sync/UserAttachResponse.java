/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.sync;

public class UserAttachResponse {
    private SyncStatus result;
    private UserVerifierErrorCode errorCode;
    private String errorReason;

    public UserAttachResponse() {
    }

    /**
     * All-args constructor.
     */
    public UserAttachResponse(SyncStatus result, UserVerifierErrorCode errorCode, String errorReason) {
        this.result = result;
        this.errorCode = errorCode;
        this.errorReason = errorReason;
    }

    /**
     * Gets the value of the 'result' field.
     */
    public SyncStatus getResult() {
        return result;
    }

    /**
     * Sets the value of the 'result' field.
     * 
     * @param value
     *            the value to set.
     */
    public void setResult(SyncStatus value) {
        this.result = value;
    }

    public UserVerifierErrorCode getErrorCode() {
        return errorCode;
    }

    public String getErrorReason() {
        return errorReason;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserAttachResponse [result=");
        builder.append(result);
        builder.append(", errorCode=");
        builder.append(errorCode);
        builder.append(", errorReason=");
        builder.append(errorReason);
        builder.append("]");
        return builder.toString();
    }
}
