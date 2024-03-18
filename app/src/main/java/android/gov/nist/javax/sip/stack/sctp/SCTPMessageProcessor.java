package android.gov.nist.javax.sip.stack.sctp;

import android.gov.nist.core.HostPort;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import com.sun.nio.sctp.SctpChannel;
import com.sun.nio.sctp.SctpServerChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes.dex */
public final class SCTPMessageProcessor extends MessageProcessor implements Runnable {
    private final Set<SCTPMessageChannel> channels = new ConcurrentSkipListSet();
    private boolean doClose;
    private boolean isRunning;
    private SelectionKey key;
    private SctpServerChannel sctpServerChannel;
    private Selector selector;

    public SCTPMessageProcessor() {
        super("sctp");
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(HostPort hostPort) {
        return createMessageChannel(hostPort.getInetAddress(), hostPort.getPort());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getDefaultTargetPort() {
        return SIPConstants.DEFAULT_PORT;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getMaximumMessageSize() {
        return Integer.MAX_VALUE;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    public Selector getSelector() {
        return this.selector;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean inUse() {
        return this.isRunning;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean isSecure() {
        return false;
    }

    public SelectionKey registerChannel(SCTPMessageChannel sCTPMessageChannel, SctpChannel sctpChannel) {
        SelectionKey register;
        synchronized (this) {
            this.selector.wakeup();
            register = sctpChannel.register(this.selector, 1, sCTPMessageChannel);
        }
        return register;
    }

    public void removeChannel(SCTPMessageChannel sCTPMessageChannel) {
        this.channels.remove(sCTPMessageChannel);
    }

    @Override // java.lang.Runnable
    public void run() {
        do {
            try {
                if (this.selector.select() > 0) {
                    Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        if (next.isReadable()) {
                            ((SCTPMessageChannel) next.attachment()).readMessages();
                        } else if (next.isAcceptable()) {
                            this.channels.add(new SCTPMessageChannel(this, this.sctpServerChannel.accept()));
                        }
                    }
                }
                synchronized (this) {
                    if (this.doClose) {
                        this.selector.close();
                        return;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                try {
                    try {
                        this.selector.close();
                    } finally {
                        stop();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                return;
            }
        } while (this.selector.isOpen());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void start() {
        SctpServerChannel open = SctpServerChannel.open();
        this.sctpServerChannel = open;
        open.bind(new InetSocketAddress(getIpAddress(), getPort()));
        this.sctpServerChannel.configureBlocking(false);
        Selector open2 = Selector.open();
        this.selector = open2;
        this.key = this.sctpServerChannel.register(open2, 16);
        this.isRunning = true;
        Thread thread = new Thread(this);
        thread.setDaemon(true);
        thread.setName("SCTPMessageProcessorThread");
        thread.setPriority(10);
        thread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void stop() {
        this.isRunning = false;
        this.doClose = true;
        for (SCTPMessageChannel sCTPMessageChannel : this.channels) {
            sCTPMessageChannel.closeNoRemove();
        }
        this.channels.clear();
        try {
            try {
                this.key.cancel();
                this.sctpServerChannel.close();
                synchronized (this) {
                    this.selector.wakeup();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                synchronized (this) {
                    this.selector.wakeup();
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.selector.wakeup();
                throw th2;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(InetAddress inetAddress, int i10) {
        SCTPMessageChannel sCTPMessageChannel = new SCTPMessageChannel(this, new InetSocketAddress(inetAddress, i10));
        this.channels.add(sCTPMessageChannel);
        return sCTPMessageChannel;
    }
}
