/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.http;

import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.transport.BoundTransportAddress;

public interface HttpServerTransport extends LifecycleComponent {

    String HTTP_SERVER_WORKER_THREAD_NAME_PREFIX = "http_server_worker";
    String HTTP_SERVER_BOSS_THREAD_NAME_PREFIX = "http_server_boss";

    BoundTransportAddress boundAddress();

    HttpInfo info();

    HttpStats stats();

    void httpServerAdapter(HttpServerAdapter httpServerAdapter);

}
