package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ListeningPointExt;
import java.net.InetAddress;
import java.nio.channels.SocketChannel;

/* loaded from: classes2.dex */
public class NioWebSocketMessageProcessor extends NioTcpMessageProcessor {
    private static StackLogger logger = CommonLogger.getLogger(NioWebSocketMessageProcessor.class);

    public NioWebSocketMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i10) {
        super(inetAddress, sIPTransactionStack, i10);
        this.transport = ListeningPointExt.WS;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageProcessor
    public ConnectionOrientedMessageChannel constructMessageChannel(InetAddress inetAddress, int i10) {
        return new NioWebSocketMessageChannel(inetAddress, i10, this.sipStack, this);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageProcessor
    public NioTcpMessageChannel createMessageChannel(NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        NioWebSocketMessageChannel nioWebSocketMessageChannel = (NioWebSocketMessageChannel) this.nioHandler.getMessageChannel(socketChannel);
        if (nioWebSocketMessageChannel == null) {
            NioWebSocketMessageChannel nioWebSocketMessageChannel2 = new NioWebSocketMessageChannel(this.sipStack, nioTcpMessageProcessor, socketChannel);
            this.nioHandler.putMessageChannel(socketChannel, nioWebSocketMessageChannel2);
            return nioWebSocketMessageChannel2;
        }
        return nioWebSocketMessageChannel;
    }
}
