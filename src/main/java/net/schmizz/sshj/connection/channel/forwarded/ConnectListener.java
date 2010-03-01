/*
 * Copyright 2010 Shikhar Bhushan
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
package net.schmizz.sshj.connection.channel.forwarded;

import net.schmizz.sshj.connection.channel.Channel;

import java.io.IOException;

/** A connect listener is just that: it listens for new forwarded channels and can be delegated charge of them. */
public interface ConnectListener {

    /**
     * Notify this listener of a new forwarded channel. An implementation should firstly {@link
     * Channel.Forwarded#confirm() confirm} or {@link Channel.Forwarded#reject(net.schmizz.sshj.connection.channel.OpenFailException.Reason,
     * String)}  reject} that channel.
     *
     * @param chan the {@link net.schmizz.sshj.connection.channel.Channel.Forwarded forwarded channel}
     *
     * @throws IOException
     */
    void gotConnect(Channel.Forwarded chan)
            throws IOException;

}
