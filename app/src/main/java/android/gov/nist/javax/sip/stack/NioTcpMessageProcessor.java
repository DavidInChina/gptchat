package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class NioTcpMessageProcessor extends ConnectionOrientedMessageProcessor {
    private static final int MAX_CHANGE_REQS = 10000;
    private static final int MAX_PENDING_DATA = 10000;
    private static StackLogger logger = CommonLogger.getLogger(NioTcpMessageProcessor.class);
    protected ServerSocketChannel channel;
    protected NIOHandler nioHandler;
    protected Selector selector;
    protected Thread selectorThread;
    protected final Queue<ChangeRequest> changeRequests = new ConcurrentLinkedQueue();
    private final Map<SocketChannel, Queue<PendingData>> pendingData = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* loaded from: classes2.dex */
    public static class ChangeRequest {
        public static final int CHANGEOPS = 2;
        public static final int REGISTER = 1;
        public int ops;
        public SocketChannel socket;
        public int type;

        public ChangeRequest(SocketChannel socketChannel, int i10, int i11) {
            this.socket = socketChannel;
            this.type = i10;
            this.ops = i11;
        }

        public String toString() {
            return this.socket + " type = " + this.type + " ops = " + this.ops;
        }
    }

    /* loaded from: classes2.dex */
    public static class PendingData {
        final ByteBuffer buffer;
        final String txId;

        public PendingData(String str, ByteBuffer byteBuffer) {
            this.txId = str;
            this.buffer = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public class ProcessorTask implements Runnable {
        public ProcessorTask() {
        }

        public void accept(SelectionKey selectionKey) {
            SocketChannel accept = ((ServerSocketChannel) selectionKey.channel()).accept();
            accept.configureBlocking(false);
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = NioTcpMessageProcessor.logger;
                stackLogger.logDebug("got a new connection! " + accept);
            }
            NioTcpMessageProcessor nioTcpMessageProcessor = NioTcpMessageProcessor.this;
            nioTcpMessageProcessor.createMessageChannel(nioTcpMessageProcessor, accept);
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = NioTcpMessageProcessor.logger;
                stackLogger2.logDebug("Adding to selector " + accept);
            }
            accept.register(NioTcpMessageProcessor.this.selector, 1);
        }

        public void connect(SelectionKey selectionKey) {
            final SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            final NioTcpMessageChannel messageChannel = NioTcpMessageProcessor.this.nioHandler.getMessageChannel(socketChannel);
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = NioTcpMessageProcessor.logger;
                stackLogger.logDebug("Attempting Connect on  " + messageChannel + " socket " + socketChannel);
            }
            if (messageChannel == null) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = NioTcpMessageProcessor.logger;
                    stackLogger2.logDebug("Dead socketChannel" + socketChannel + " socket " + socketChannel.socket().getInetAddress() + ":" + socketChannel.socket().getPort());
                }
                selectionKey.cancel();
                return;
            }
            try {
                socketChannel.finishConnect();
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    NioTcpMessageProcessor.logger.logDebug("Connected Succesfully");
                }
                if (NioTcpMessageProcessor.this.sipStack.getSelfRoutingThreadpoolExecutor() != null) {
                    NioTcpMessageProcessor.this.sipStack.getSelfRoutingThreadpoolExecutor().execute(new Runnable() { // from class: android.gov.nist.javax.sip.stack.NioTcpMessageProcessor.ProcessorTask.1
                        @Override // java.lang.Runnable
                        public void run() {
                            messageChannel.triggerConnectSuccess();
                        }
                    });
                } else {
                    messageChannel.triggerConnectSuccess();
                }
                if (NioTcpMessageProcessor.this.pendingData.get(socketChannel) != null && ((Queue) NioTcpMessageProcessor.this.pendingData.get(socketChannel)).size() > 0) {
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                        NioTcpMessageProcessor.logger.logDebug("Pending Data Available, setting WRITE opts.");
                    }
                    selectionKey.interestOps(4);
                }
            } catch (Exception e10) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    NioTcpMessageProcessor.logger.logDebug("Cant connect ", e10);
                }
                selectionKey.cancel();
                if (NioTcpMessageProcessor.this.sipStack.getSelfRoutingThreadpoolExecutor() != null) {
                    NioTcpMessageProcessor.this.sipStack.getSelfRoutingThreadpoolExecutor().execute(new Runnable() { // from class: android.gov.nist.javax.sip.stack.NioTcpMessageProcessor.ProcessorTask.2
                        @Override // java.lang.Runnable
                        public void run() {
                            messageChannel.triggerConnectFailure((Queue) NioTcpMessageProcessor.this.pendingData.get(socketChannel));
                        }
                    });
                } else {
                    messageChannel.triggerConnectFailure((Queue) NioTcpMessageProcessor.this.pendingData.get(socketChannel));
                }
            }
        }

        public void read(SelectionKey selectionKey) {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            NioTcpMessageChannel messageChannel = NioTcpMessageProcessor.this.nioHandler.getMessageChannel(socketChannel);
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = NioTcpMessageProcessor.logger;
                stackLogger.logDebug("Got something on nioTcpMessageChannel " + messageChannel + " socket " + socketChannel);
            }
            if (messageChannel == null) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = NioTcpMessageProcessor.logger;
                    stackLogger2.logDebug("Dead socketChannel" + socketChannel + " socket " + socketChannel.socket().getInetAddress() + ":" + socketChannel.socket().getPort());
                }
                selectionKey.cancel();
                NioTcpMessageProcessor.this.pendingData.remove(socketChannel);
                return;
            }
            messageChannel.readChannel();
        }

        @Override // java.lang.Runnable
        public void run() {
            SelectionKey keyFor;
            int i10 = 0;
            while (true) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(64)) {
                    NioTcpMessageProcessor.logger.logTrace("Selector thread cycle begin...");
                }
                int i11 = 0;
                while (NioTcpMessageProcessor.this.changeRequests.peek() != null && i11 < 10000) {
                    ChangeRequest poll = NioTcpMessageProcessor.this.changeRequests.poll();
                    i11++;
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                        NioTcpMessageProcessor.logger.logDebug("ChangeRequest " + poll + " selector = " + NioTcpMessageProcessor.this.selector);
                    }
                    try {
                        int i12 = poll.type;
                        if (i12 != 1) {
                            if (i12 == 2 && (keyFor = poll.socket.keyFor(NioTcpMessageProcessor.this.selector)) != null && keyFor.isValid()) {
                                keyFor.interestOps(poll.ops);
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Change opts " + poll + " selector = " + NioTcpMessageProcessor.this.selector + " key = " + keyFor + " blocking=" + poll.socket.isBlocking());
                                }
                            }
                        } else {
                            try {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("NIO register " + poll + " selector = " + NioTcpMessageProcessor.this.selector + " blocking=" + poll.socket.isBlocking());
                                }
                                poll.socket.register(NioTcpMessageProcessor.this.selector, poll.ops);
                            } catch (ClosedChannelException unused) {
                                NioTcpMessageProcessor.logger.logWarning("Socket closed before register ops " + poll.socket);
                            }
                        }
                    } catch (Exception e10) {
                        NioTcpMessageProcessor.logger.logError("Problem setting changes", e10);
                    }
                }
                try {
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(64)) {
                        NioTcpMessageProcessor.logger.logTrace("Before select");
                    }
                } catch (IOException e11) {
                    NioTcpMessageProcessor.logger.logError("problem in select", e11);
                    return;
                } catch (CancelledKeyException unused2) {
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(16)) {
                        NioTcpMessageProcessor.logger.logInfo("Looks like remote side closed a connection");
                    }
                }
                if (!NioTcpMessageProcessor.this.selector.isOpen()) {
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(16)) {
                        NioTcpMessageProcessor.logger.logInfo("Selector is closed ");
                        return;
                    }
                    return;
                }
                i10 = NioTcpMessageProcessor.this.selector.select();
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(64)) {
                    NioTcpMessageProcessor.logger.logTrace("After select:" + i10 + ".CRs:" + NioTcpMessageProcessor.this.changeRequests.size());
                }
                if (i10 <= 0) {
                    try {
                        if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                            NioTcpMessageProcessor.logger.logDebug("null selectedKeys ");
                        }
                    } catch (ClosedSelectorException unused3) {
                        if (NioTcpMessageProcessor.logger.isLoggingEnabled(16)) {
                            NioTcpMessageProcessor.logger.logInfo("Selector is closed");
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        NioTcpMessageProcessor.logger.logError("Problem in the selector loop", e12);
                    }
                } else {
                    Iterator<SelectionKey> it = NioTcpMessageProcessor.this.selector.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        try {
                            it.remove();
                            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                NioTcpMessageProcessor.logger.logDebug("We got selkey " + next);
                            }
                            if (!next.isValid()) {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Invalid key found " + next);
                                }
                            } else if (next.isAcceptable()) {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Accept " + next);
                                }
                                accept(next);
                            } else if (next.isReadable()) {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Read " + next);
                                }
                                read(next);
                            } else if (next.isWritable()) {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Write " + next);
                                }
                                write(next);
                            } else if (next.isConnectable()) {
                                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                    NioTcpMessageProcessor.logger.logDebug("Connect " + next);
                                }
                                connect(next);
                            }
                        } catch (Exception e13) {
                            NioTcpMessageProcessor.logger.logError("Problem processing selection key event", e13);
                        }
                    }
                }
            }
        }

        public void write(SelectionKey selectionKey) {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            NioTcpMessageChannel messageChannel = NioTcpMessageProcessor.this.nioHandler.getMessageChannel(socketChannel);
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = NioTcpMessageProcessor.logger;
                stackLogger.logDebug("Need to write something on nioTcpMessageChannel " + messageChannel + " socket " + socketChannel);
            }
            if (messageChannel == null) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = NioTcpMessageProcessor.logger;
                    stackLogger2.logDebug("Dead socketChannel" + socketChannel + " socket " + socketChannel.socket().getInetAddress() + ":" + socketChannel.socket().getPort());
                }
                NioTcpMessageProcessor.this.pendingData.remove(socketChannel);
                selectionKey.cancel();
                return;
            }
            Queue queue = (Queue) NioTcpMessageProcessor.this.pendingData.get(socketChannel);
            if (queue != null && !queue.isEmpty()) {
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = NioTcpMessageProcessor.logger;
                    stackLogger3.logDebug("Queued items for writing " + queue.size());
                }
                int i10 = 0;
                while (true) {
                    if (queue.peek() == null || i10 >= 10000) {
                        break;
                    }
                    ByteBuffer byteBuffer = ((PendingData) queue.peek()).buffer;
                    try {
                        socketChannel.write(byteBuffer);
                        int remaining = byteBuffer.remaining();
                        if (remaining > 0) {
                            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger4 = NioTcpMessageProcessor.logger;
                                stackLogger4.logDebug("Socket buffer filled and more is remaining" + queue.size() + " remain = " + remaining);
                            }
                        } else {
                            queue.remove();
                            i10++;
                        }
                    } catch (IOException e10) {
                        if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger5 = NioTcpMessageProcessor.logger;
                            stackLogger5.logDebug("Dead socketChannel" + socketChannel + " socket " + socketChannel.socket().getInetAddress() + ":" + socketChannel.socket().getPort() + " : error message " + e10.getMessage());
                        }
                        messageChannel.close();
                        queue.remove();
                        NioTcpMessageProcessor.this.pendingData.remove(socketChannel);
                        return;
                    }
                }
                if (queue.isEmpty()) {
                    if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger6 = NioTcpMessageProcessor.logger;
                        stackLogger6.logDebug("We wrote away all data. Setting READ interest. Queue is emtpy now size =" + queue.size());
                    }
                    selectionKey.interestOps(1);
                }
                if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                    NioTcpMessageProcessor.logger.logDebug("Done writing");
                    return;
                }
                return;
            }
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                NioTcpMessageProcessor.logger.logDebug("The queue was empty on write.");
            }
            if (NioTcpMessageProcessor.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger7 = NioTcpMessageProcessor.logger;
                stackLogger7.logDebug("We wrote away all data. Setting READ interest. Queue is emtpy now size =" + queue.size());
            }
            selectionKey.interestOps(1);
        }
    }

    public NioTcpMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i10) {
        super(inetAddress, i10, "TCP", sIPTransactionStack);
        this.nioHandler = new NIOHandler(sIPTransactionStack, this);
    }

    private SocketChannel blockingConnect(InetSocketAddress inetSocketAddress, InetAddress inetAddress, int i10) {
        SocketChannel open = SocketChannel.open();
        if (inetAddress != null) {
            open.socket().bind(new InetSocketAddress(inetAddress, 0));
        }
        open.configureBlocking(true);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Init connect " + inetSocketAddress);
        }
        open.socket().connect(inetSocketAddress, i10);
        open.configureBlocking(false);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("Blocking set to false now " + inetSocketAddress);
        }
        this.changeRequests.add(new ChangeRequest(open, 1, 1));
        this.selector.wakeup();
        return open;
    }

    private SocketChannel nonBlockingConnect(InetSocketAddress inetSocketAddress, InetAddress inetAddress, int i10) {
        SocketChannel open = SocketChannel.open();
        open.configureBlocking(false);
        if (inetAddress != null) {
            open.socket().bind(new InetSocketAddress(inetAddress, 0));
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Init connect " + inetSocketAddress);
        }
        open.connect(inetSocketAddress);
        this.changeRequests.add(new ChangeRequest(open, 1, 8));
        return open;
    }

    public SocketChannel connect(InetSocketAddress inetSocketAddress, InetAddress inetAddress, int i10) {
        if (this.sipStack.nioMode.equals(NIOMode.BLOCKING)) {
            return blockingConnect(inetSocketAddress, inetAddress, i10);
        }
        return nonBlockingConnect(inetSocketAddress, inetAddress, i10);
    }

    public ConnectionOrientedMessageChannel constructMessageChannel(InetAddress inetAddress, int i10) {
        return new NioTcpMessageChannel(inetAddress, i10, this.sipStack, this);
    }

    public NioTcpMessageChannel createMessageChannel(NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        NioTcpMessageChannel messageChannel = this.nioHandler.getMessageChannel(socketChannel);
        if (messageChannel == null) {
            messageChannel = new NioTcpMessageChannel(nioTcpMessageProcessor, socketChannel);
            this.nioHandler.putMessageChannel(socketChannel, messageChannel);
        }
        messageChannel.messageProcessor = nioTcpMessageProcessor;
        messageChannel.myClientInputStream = socketChannel.socket().getInputStream();
        return messageChannel;
    }

    public ProcessorTask createProcessorTask() {
        return new ProcessorTask();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getDefaultTargetPort() {
        return SIPConstants.DEFAULT_PORT;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean isSecure() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageProcessor
    public synchronized void remove(ConnectionOrientedMessageChannel connectionOrientedMessageChannel) {
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug(Thread.currentThread() + " removing " + ((NioTcpMessageChannel) connectionOrientedMessageChannel).getSocketChannel() + " from processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
            }
            this.pendingData.remove(((NioTcpMessageChannel) connectionOrientedMessageChannel).getSocketChannel());
            super.remove(connectionOrientedMessageChannel);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void send(SocketChannel socketChannel, byte[] bArr) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Sending data " + bArr.length + " bytes on socket " + socketChannel);
        }
        Queue<PendingData> queue = this.pendingData.get(socketChannel);
        if (queue == null) {
            synchronized (socketChannel) {
                try {
                    if (!this.pendingData.containsKey(socketChannel)) {
                        queue = new ConcurrentLinkedQueue<>();
                        this.pendingData.put(socketChannel, queue);
                    } else {
                        queue = this.pendingData.get(socketChannel);
                    }
                } finally {
                }
            }
        }
        queue.add(new PendingData(MessageChannel.messageTxId.get(), ByteBuffer.wrap(bArr)));
        if (socketChannel.isConnected()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Connected. lets set WRITE ops.");
            }
            this.changeRequests.add(new ChangeRequest(socketChannel, 2, 4));
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Waking up selector thread");
        }
        this.selector.wakeup();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void start() {
        this.selector = Selector.open();
        ServerSocketChannel open = ServerSocketChannel.open();
        this.channel = open;
        open.configureBlocking(false);
        this.channel.socket().bind(new InetSocketAddress(super.getIpAddress(), super.getPort()));
        this.channel.register(this.selector, 16);
        Thread thread = new Thread(createProcessorTask());
        this.selectorThread = thread;
        thread.start();
        Thread thread2 = this.selectorThread;
        thread2.setName("NioSelector-" + getTransport() + '-' + getIpAddress().getHostAddress() + '/' + getPort());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void stop() {
        try {
            if (this.selector.isOpen()) {
                this.selector.close();
            }
            this.nioHandler.stop();
        } catch (Exception e10) {
            logger.logError("Problem closing channel ", e10);
        }
        try {
            this.channel.close();
        } catch (Exception e11) {
            logger.logError("Problem closing channel ", e11);
        }
    }

    private synchronized MessageChannel createMessageChannel(String str, InetAddress inetAddress, int i10) {
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel;
        try {
            connectionOrientedMessageChannel = this.messageChannels.get(str);
            if (connectionOrientedMessageChannel == null) {
                connectionOrientedMessageChannel = constructMessageChannel(inetAddress, i10);
                this.messageChannels.put(str, connectionOrientedMessageChannel);
                connectionOrientedMessageChannel.isCached = true;
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("key " + str);
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Creating " + connectionOrientedMessageChannel);
                }
                if (this.sipStack.nioMode.equals(NIOMode.BLOCKING)) {
                    this.selector.wakeup();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return connectionOrientedMessageChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(HostPort hostPort) {
        Throwable th2;
        Object obj;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("NioTcpMessageProcessor::createMessageChannel: " + hostPort);
        }
        Object obj2 = null;
        try {
            String key = MessageChannel.getKey(hostPort, this.transport);
            ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
            if (connectionOrientedMessageChannel == null) {
                try {
                    connectionOrientedMessageChannel = createMessageChannel(key, hostPort.getInetAddress(), hostPort.getPort());
                } catch (Throwable th3) {
                    th2 = th3;
                    obj2 = obj;
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("MessageChannel::createMessageChannel - exit " + obj2);
                    }
                    throw th2;
                }
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("MessageChannel::createMessageChannel - exit " + connectionOrientedMessageChannel);
            }
            return connectionOrientedMessageChannel;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(InetAddress inetAddress, int i10) {
        String key = MessageChannel.getKey(inetAddress, i10, this.transport);
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
        return connectionOrientedMessageChannel == null ? createMessageChannel(key, inetAddress, i10) : connectionOrientedMessageChannel;
    }
}
