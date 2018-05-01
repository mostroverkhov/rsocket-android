package io.rsocket.android.test

import io.rsocket.android.transport.netty.client.WebsocketClientTransport
import io.rsocket.android.transport.netty.server.WebsocketServerTransport

class NettyWebsocketEndToEndTest:NettyEndToEndTest(
        { WebsocketClientTransport.create(it) },
        { WebsocketServerTransport.create(it.port) })