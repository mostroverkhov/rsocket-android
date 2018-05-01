package io.rsocket.android.test

import io.rsocket.android.transport.netty.client.TcpClientTransport
import io.rsocket.android.transport.netty.server.TcpServerTransport

class NettyTcpEndToEndTest
    : NettyEndToEndTest(
        { TcpClientTransport.create(it) },
        { TcpServerTransport.create(it) })
