package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ConnectionOrientedMessageProcessor extends MessageProcessor {
    private static StackLogger logger = CommonLogger.getLogger(ConnectionOrientedMessageProcessor.class);
    protected boolean isRunning;
    protected int nConnections;
    protected ServerSocket sock;
    protected int useCount;
    protected final Map<String, ConnectionOrientedMessageChannel> messageChannels = new ConcurrentHashMap();
    protected final Map<String, ConnectionOrientedMessageChannel> incomingMessageChannels = new ConcurrentHashMap();

    public ConnectionOrientedMessageProcessor(InetAddress inetAddress, int i10, String str, SIPTransactionStack sIPTransactionStack) {
        super(inetAddress, i10, str, sIPTransactionStack);
        this.sipStack = sIPTransactionStack;
    }

    public synchronized void cacheMessageChannel(ConnectionOrientedMessageChannel connectionOrientedMessageChannel) {
        try {
            String key = connectionOrientedMessageChannel.getKey();
            ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.messageChannels.get(key);
            if (connectionOrientedMessageChannel2 != null) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Closing " + key);
                }
                connectionOrientedMessageChannel2.close();
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Caching " + key);
            }
            this.messageChannels.put(key, connectionOrientedMessageChannel);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean closeReliableConnection(String str, int i10) {
        validatePortInRange(i10);
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(str));
        hostPort.setPort(i10);
        String key = MessageChannel.getKey(hostPort, "TCP");
        synchronized (this) {
            try {
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
                if (connectionOrientedMessageChannel != null) {
                    connectionOrientedMessageChannel.close();
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug(Thread.currentThread() + " Removing channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
                    }
                    this.incomingMessageChannels.remove(key);
                    this.messageChannels.remove(key);
                    return true;
                }
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.incomingMessageChannels.get(key);
                if (connectionOrientedMessageChannel2 != null) {
                    connectionOrientedMessageChannel2.close();
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug(Thread.currentThread() + " Removing incoming channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
                    }
                    this.incomingMessageChannels.remove(key);
                    this.messageChannels.remove(key);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getMaximumMessageSize() {
        return Integer.MAX_VALUE;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean inUse() {
        if (this.useCount != 0) {
            return true;
        }
        return false;
    }

    public synchronized void remove(ConnectionOrientedMessageChannel connectionOrientedMessageChannel) {
        try {
            String key = connectionOrientedMessageChannel.getKey();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug(Thread.currentThread() + " removing " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
            }
            if (this.messageChannels.get(key) == connectionOrientedMessageChannel) {
                this.messageChannels.remove(key);
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug(Thread.currentThread() + " Removing incoming channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
            }
            this.incomingMessageChannels.remove(key);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean setKeepAliveTimeout(String str, int i10, long j6) {
        validatePortInRange(i10);
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(str));
        hostPort.setPort(i10);
        String key = MessageChannel.getKey(hostPort, "TCP");
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug(Thread.currentThread() + " checking channel with key " + key + " : " + connectionOrientedMessageChannel + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
        }
        if (connectionOrientedMessageChannel != null) {
            connectionOrientedMessageChannel.setKeepAliveTimeout(j6);
            return true;
        }
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.incomingMessageChannels.get(key);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug(Thread.currentThread() + " checking incoming channel with key " + key + " : " + connectionOrientedMessageChannel2 + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
        }
        if (connectionOrientedMessageChannel2 != null) {
            connectionOrientedMessageChannel2.setKeepAliveTimeout(j6);
            return true;
        }
        return false;
    }

    public void validatePortInRange(int i10) {
        if (i10 >= 1 && i10 <= 65535) {
            return;
        }
        throw new IllegalArgumentException(a.e("Peer port should be greater than 0 and less 65535, port = ", i10));
    }
}
