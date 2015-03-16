/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.dns;

import static io.netty.util.internal.ObjectUtil.checkNotNull;

public class DefaultDnsResponse extends AbstractDnsMessage implements DnsResponse {

    private boolean authoritativeAnswer;
    private boolean truncated;
    private boolean recursionAvailable;
    private DnsResponseCode code;

    public DefaultDnsResponse(int id) {
        this(id, DnsOpCode.QUERY, DnsResponseCode.NOERROR);
    }

    public DefaultDnsResponse(int id, DnsOpCode opCode) {
        this(id, opCode, DnsResponseCode.NOERROR);
    }

    public DefaultDnsResponse(int id, DnsOpCode opCode, DnsResponseCode code) {
        super(id, opCode);
        setCode(code);
    }

    @Override
    public boolean isAuthoritativeAnswer() {
        return authoritativeAnswer;
    }

    @Override
    public DnsResponse setAuthoritativeAnswer(boolean authoritativeAnswer) {
        this.authoritativeAnswer = authoritativeAnswer;
        return this;
    }

    @Override
    public boolean isTruncated() {
        return truncated;
    }

    @Override
    public DnsResponse setTruncated(boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    @Override
    public boolean isRecursionAvailable() {
        return recursionAvailable;
    }

    @Override
    public DnsResponse setRecursionAvailable(boolean recursionAvailable) {
        this.recursionAvailable = recursionAvailable;
        return this;
    }

    @Override
    public DnsResponseCode code() {
        return code;
    }

    @Override
    public DnsResponse setCode(DnsResponseCode code) {
        this.code = checkNotNull(code, "code");
        return this;
    }

    @Override
    public DnsResponse setId(int id) {
        return (DnsResponse) super.setId(id);
    }

    @Override
    public DnsResponse setOpCode(DnsOpCode opCode) {
        return (DnsResponse) super.setOpCode(opCode);
    }

    @Override
    public DnsResponse setRecursionDesired(boolean recursionDesired) {
        return (DnsResponse) super.setRecursionDesired(recursionDesired);
    }

    @Override
    public DnsResponse setZ(int z) {
        return (DnsResponse) super.setZ(z);
    }

    @Override
    public DnsResponse setRecord(DnsSection section, DnsRecord record) {
        return (DnsResponse) super.setRecord(section, record);
    }

    @Override
    public DnsResponse addRecord(DnsSection section, DnsRecord record) {
        return (DnsResponse) super.addRecord(section, record);
    }

    @Override
    public DnsResponse addRecord(DnsSection section, int index, DnsRecord record) {
        return (DnsResponse) super.addRecord(section, index, record);
    }

    @Override
    public DnsResponse clear(DnsSection section) {
        return (DnsResponse) super.clear(section);
    }

    @Override
    public DnsResponse clear() {
        return (DnsResponse) super.clear();
    }

    @Override
    public DnsResponse touch() {
        return (DnsResponse) super.touch();
    }

    @Override
    public DnsResponse touch(Object hint) {
        return (DnsResponse) super.touch(hint);
    }

    @Override
    public DnsResponse retain() {
        return (DnsResponse) super.retain();
    }

    @Override
    public DnsResponse retain(int increment) {
        return (DnsResponse) super.retain(increment);
    }

    @Override
    public String toString() {
        return DnsMessageUtil.appendResponse(new StringBuilder(128), this).toString();
    }
}
