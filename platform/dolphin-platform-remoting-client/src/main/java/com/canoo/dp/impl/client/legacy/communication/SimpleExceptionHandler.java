/*
 * Copyright 2015-2017 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.dp.impl.client.legacy.communication;


import com.canoo.platform.remoting.DolphinRemotingException;
import com.canoo.platform.remoting.client.RemotingExceptionHandler;
import org.apiguardian.api.API;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apiguardian.api.API.Status.DEPRECATED;

@API(since = "0.x", status = DEPRECATED)
public class SimpleExceptionHandler implements RemotingExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleExceptionHandler.class);

    public SimpleExceptionHandler() {
    }

    @Override
    public void handle(final DolphinRemotingException e) {
        LOG.error(" Error in remoting layer: ", e);
    }
}
