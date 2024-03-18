package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;

/* loaded from: classes.dex */
public class TCPMessageChannel extends ConnectionOrientedMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(TCPMessageChannel.class);
    protected OutputStream myClientOutputStream;

    public TCPMessageChannel(SIPTransactionStack sIPTransactionStack) {
        super(sIPTransactionStack);
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void close(boolean z10, boolean z11) {
        this.isRunning = false;
        if (this.mySock != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Closing socket " + this.key);
            }
            try {
                this.mySock.close();
                this.mySock = null;
            } catch (IOException e10) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Error closing socket " + e10);
                }
            }
        }
        if (this.myParser != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("Closing my parser " + this.myParser);
            }
            this.myParser.close();
        }
        if (this.myClientOutputStream != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger4 = logger;
                stackLogger4.logDebug("Closing client output stream " + this.myClientOutputStream);
            }
            try {
                this.myClientOutputStream.close();
            } catch (IOException e11) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger5 = logger;
                    stackLogger5.logDebug("Error closing client output stream" + e11);
                }
            }
        }
        if (z10) {
            String substring = this.key.substring(4);
            if (logger.isLoggingEnabled(32)) {
                a.w("Closing TCP socket ", substring, logger);
            }
            this.sipStack.ioHandler.removeSocket(substring);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger6 = logger;
                stackLogger6.logDebug("Closing message Channel (key = " + this.key + Separators.RPAREN + this);
            }
        } else if (logger.isLoggingEnabled(32)) {
            a.w("not removing socket key from the cached map since it has already been updated by the iohandler.sendBytes ", this.key.substring(4), logger);
        }
        if (z11) {
            cancelPingKeepAliveTimeoutTaskIfStarted();
        }
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || this.mySock != ((TCPMessageChannel) obj).mySock) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "TCP";
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls != null && (cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Encountered Bad Message \n" + sIPMessage.toString());
            }
            String sIPMessage2 = sIPMessage.toString();
            if (!sIPMessage2.startsWith("SIP/") && !sIPMessage2.startsWith("ACK ") && this.mySock != null) {
                if (logger.isLoggingEnabled(4)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logError("Malformed mandatory headers: closing socket! :" + this.mySock.toString());
                }
                try {
                    this.mySock.close();
                } catch (IOException e10) {
                    if (logger.isLoggingEnabled(4)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logError("Exception while closing socket! :" + this.mySock.toString() + ":" + e10.toString());
                    }
                }
            }
            throw parseException;
        }
        sIPMessage.addUnparsed(str);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0019, B:6:0x0023, B:10:0x003e, B:12:0x004e, B:14:0x0064, B:21:0x008d, B:24:0x00bd, B:26:0x00c1, B:28:0x00c5, B:30:0x00cd, B:31:0x00fe, B:33:0x0133, B:35:0x015d, B:36:0x015e, B:40:0x0166, B:42:0x016e, B:43:0x01e2, B:45:0x01e8, B:47:0x01ec, B:49:0x01f4, B:50:0x0209, B:51:0x022b, B:53:0x0233, B:54:0x0248), top: B:58:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0019, B:6:0x0023, B:10:0x003e, B:12:0x004e, B:14:0x0064, B:21:0x008d, B:24:0x00bd, B:26:0x00c1, B:28:0x00c5, B:30:0x00cd, B:31:0x00fe, B:33:0x0133, B:35:0x015d, B:36:0x015e, B:40:0x0166, B:42:0x016e, B:43:0x01e2, B:45:0x01e8, B:47:0x01ec, B:49:0x01f4, B:50:0x0209, B:51:0x022b, B:53:0x0233, B:54:0x0248), top: B:58:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e8 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0019, B:6:0x0023, B:10:0x003e, B:12:0x004e, B:14:0x0064, B:21:0x008d, B:24:0x00bd, B:26:0x00c1, B:28:0x00c5, B:30:0x00cd, B:31:0x00fe, B:33:0x0133, B:35:0x015d, B:36:0x015e, B:40:0x0166, B:42:0x016e, B:43:0x01e2, B:45:0x01e8, B:47:0x01ec, B:49:0x01f4, B:50:0x0209, B:51:0x022b, B:53:0x0233, B:54:0x0248), top: B:58:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022b A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0019, B:6:0x0023, B:10:0x003e, B:12:0x004e, B:14:0x0064, B:21:0x008d, B:24:0x00bd, B:26:0x00c1, B:28:0x00c5, B:30:0x00cd, B:31:0x00fe, B:33:0x0133, B:35:0x015d, B:36:0x015e, B:40:0x0166, B:42:0x016e, B:43:0x01e2, B:45:0x01e8, B:47:0x01ec, B:49:0x01f4, B:50:0x0209, B:51:0x022b, B:53:0x0233, B:54:0x0248), top: B:58:0x0019 }] */
    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void sendMessage(byte[] bArr, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        IOException e10;
        Socket socket;
        Socket socket2;
        String str8;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendMessage isClient  = " + z10);
        }
        Socket socket3 = null;
        try {
            try {
                str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str8 = "Failed to connect ";
                str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str7 = "Couldn't connect to peerAddress = ";
                str2 = "New socket remote ip address ";
                str6 = "retry suceeded to peerAddress = ";
                str = "New socket local ip address ";
                str5 = "Old socket different than new socket on channel ";
            } catch (IOException e11) {
                e10 = e11;
                str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str2 = "New socket remote ip address ";
                str = "New socket local ip address ";
                str8 = "Failed to connect ";
                str6 = "retry suceeded to peerAddress = ";
                str5 = "Old socket different than new socket on channel ";
                str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str7 = "Couldn't connect to peerAddress = ";
            }
            try {
                socket3 = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), this.peerAddress, this.peerPort, this.peerProtocol, bArr, z10, this);
                e10 = null;
            } catch (IOException e12) {
                e10 = e12;
                logger.logWarning(str8 + this.peerAddress + ":" + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                if (socket3 == null) {
                }
                socket = socket3;
                socket2 = this.mySock;
                if (socket != socket2) {
                    if (socket2 != null) {
                    }
                    if (e10 != null) {
                    }
                }
            }
        } catch (IOException e13) {
            e10 = e13;
            str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
            str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
            str2 = "New socket remote ip address ";
            str = "New socket local ip address ";
            str8 = "Failed to connect ";
            str7 = "Couldn't connect to peerAddress = ";
            str6 = "retry suceeded to peerAddress = ";
            str5 = "Old socket different than new socket on channel ";
        }
        if (socket3 == null) {
            if (this.peerAddressAdvertisedInHeaders != null && this.peerPortAdvertisedInHeaders > 0) {
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str7 + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                }
                InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                socket3 = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, this.peerProtocol, bArr, z10, this);
                int i10 = this.peerPortAdvertisedInHeaders;
                this.peerPort = i10;
                this.peerAddress = byName;
                this.key = MessageChannel.getKey(byName, i10, "TCP");
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str6 + this.peerAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
                }
            } else {
                throw e10;
            }
        }
        socket = socket3;
        socket2 = this.mySock;
        if (socket != socket2 && socket != null) {
            if (socket2 != null) {
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str5 + this.key);
                    logger.logStackTrace();
                    logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                    logger.logWarning("Old socket remote ip address " + this.mySock.getRemoteSocketAddress());
                    logger.logWarning(str + socket.getLocalSocketAddress());
                    logger.logWarning(str2 + socket.getRemoteSocketAddress());
                }
                close(false, false);
            }
            if (e10 != null) {
                if (this.mySock != null && logger.isLoggingEnabled(8)) {
                    logger.logWarning(str4 + this.key);
                }
                this.mySock = socket;
                this.myClientInputStream = socket.getInputStream();
                this.myClientOutputStream = this.mySock.getOutputStream();
                Thread thread = new Thread(this);
                thread.setDaemon(true);
                thread.setName("TCPMessageChannelThread");
                thread.start();
            } else {
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str3 + this.key);
                }
                this.mySock = socket;
            }
        }
    }

    public TCPMessageChannel(Socket socket, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor, String str) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TCPMessageChannel ");
            logger.logStackTrace();
        }
        this.mySock = socket;
        this.peerAddress = socket.getInetAddress();
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.myClientInputStream = this.mySock.getInputStream();
        this.myClientOutputStream = this.mySock.getOutputStream();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.setName(str);
        int port = this.mySock.getPort();
        this.peerPort = port;
        this.key = MessageChannel.getKey(this.peerAddress, port, "TCP");
        this.myPort = tCPMessageProcessor.getPort();
        this.messageProcessor = tCPMessageProcessor;
        this.mythread.start();
    }

    public TCPMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TCPMessageChannel ");
            logger.logStackTrace();
        }
        this.peerAddress = inetAddress;
        this.peerPort = i10;
        this.myPort = tCPMessageProcessor.getPort();
        this.peerProtocol = "TCP";
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, "TCP");
        this.messageProcessor = tCPMessageProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0113 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0023, B:8:0x0027, B:10:0x0033, B:14:0x005c, B:15:0x0061, B:16:0x0063, B:18:0x006d, B:21:0x0097, B:23:0x00bf, B:28:0x00de, B:31:0x0113, B:33:0x0117, B:35:0x011b, B:37:0x0123, B:38:0x0150, B:40:0x0185, B:42:0x01af, B:43:0x01b0, B:47:0x01b8, B:49:0x01c0, B:50:0x0238, B:52:0x023e, B:54:0x0242, B:56:0x024a, B:57:0x025f, B:58:0x0281, B:60:0x0289, B:61:0x029e, B:64:0x02a2, B:65:0x02a9), top: B:69:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0023, B:8:0x0027, B:10:0x0033, B:14:0x005c, B:15:0x0061, B:16:0x0063, B:18:0x006d, B:21:0x0097, B:23:0x00bf, B:28:0x00de, B:31:0x0113, B:33:0x0117, B:35:0x011b, B:37:0x0123, B:38:0x0150, B:40:0x0185, B:42:0x01af, B:43:0x01b0, B:47:0x01b8, B:49:0x01c0, B:50:0x0238, B:52:0x023e, B:54:0x0242, B:56:0x024a, B:57:0x025f, B:58:0x0281, B:60:0x0289, B:61:0x029e, B:64:0x02a2, B:65:0x02a9), top: B:69:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023e A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0023, B:8:0x0027, B:10:0x0033, B:14:0x005c, B:15:0x0061, B:16:0x0063, B:18:0x006d, B:21:0x0097, B:23:0x00bf, B:28:0x00de, B:31:0x0113, B:33:0x0117, B:35:0x011b, B:37:0x0123, B:38:0x0150, B:40:0x0185, B:42:0x01af, B:43:0x01b0, B:47:0x01b8, B:49:0x01c0, B:50:0x0238, B:52:0x023e, B:54:0x0242, B:56:0x024a, B:57:0x025f, B:58:0x0281, B:60:0x0289, B:61:0x029e, B:64:0x02a2, B:65:0x02a9), top: B:69:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0281 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0023, B:8:0x0027, B:10:0x0033, B:14:0x005c, B:15:0x0061, B:16:0x0063, B:18:0x006d, B:21:0x0097, B:23:0x00bf, B:28:0x00de, B:31:0x0113, B:33:0x0117, B:35:0x011b, B:37:0x0123, B:38:0x0150, B:40:0x0185, B:42:0x01af, B:43:0x01b0, B:47:0x01b8, B:49:0x01c0, B:50:0x0238, B:52:0x023e, B:54:0x0242, B:56:0x024a, B:57:0x025f, B:58:0x0281, B:60:0x0289, B:61:0x029e, B:64:0x02a2, B:65:0x02a9), top: B:69:0x001f }] */
    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        IOException e10;
        Socket socket;
        Socket socket2;
        String str11;
        try {
            if (bArr != null && inetAddress != null) {
                if (this.peerPortAdvertisedInHeaders <= 0) {
                    str = "Failed to connect ";
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("receiver port = " + i10 + " for this channel " + this + " key " + this.key);
                    }
                    if (i10 <= 0) {
                        this.peerPortAdvertisedInHeaders = SIPConstants.DEFAULT_PORT;
                    } else {
                        this.peerPortAdvertisedInHeaders = i10;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("2.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                    }
                } else {
                    str = "Failed to connect ";
                }
                Socket socket3 = null;
                try {
                    str6 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str11 = str;
                    str7 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str10 = "Couldn't connect to receiverAddress = ";
                    str5 = "New socket remote ip address ";
                    str9 = "retry suceeded to peerAddress = ";
                    str4 = "New socket local ip address ";
                    str8 = "Old socket different than new socket on channel ";
                    str3 = "Old socket local ip address ";
                    str2 = "Old socket remote ip address ";
                    try {
                        socket3 = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i10, "TCP", bArr, z10, this);
                        e10 = null;
                    } catch (IOException e11) {
                        e10 = e11;
                        logger.logWarning(str11 + this.peerAddress + ":" + i10 + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                        logger.logError("Error is ", e10);
                        if (socket3 == null) {
                        }
                        socket = socket3;
                        socket2 = this.mySock;
                        if (socket != socket2) {
                            if (socket2 != null) {
                            }
                            if (e10 != null) {
                            }
                        }
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    str3 = "Old socket local ip address ";
                    str2 = "Old socket remote ip address ";
                    str6 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str5 = "New socket remote ip address ";
                    str4 = "New socket local ip address ";
                    str11 = str;
                    str9 = "retry suceeded to peerAddress = ";
                    str8 = "Old socket different than new socket on channel ";
                    str7 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str10 = "Couldn't connect to receiverAddress = ";
                }
                if (socket3 == null) {
                    if (this.peerAddressAdvertisedInHeaders != null && this.peerPortAdvertisedInHeaders > 0) {
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str10 + inetAddress + " receiverPort = " + i10 + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                        }
                        InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                        socket3 = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, "TCP", bArr, z10, this);
                        int i11 = this.peerPortAdvertisedInHeaders;
                        this.peerPort = i11;
                        this.peerAddress = byName;
                        this.key = MessageChannel.getKey(byName, i11, "TCP");
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str9 + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key);
                        }
                    } else {
                        throw e10;
                    }
                }
                socket = socket3;
                socket2 = this.mySock;
                if (socket != socket2 && socket != null) {
                    if (socket2 != null) {
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str8 + this.key);
                            logger.logStackTrace();
                            logger.logWarning(str3 + this.mySock.getLocalSocketAddress());
                            logger.logWarning(str2 + this.mySock.getRemoteSocketAddress());
                            logger.logWarning(str4 + socket.getLocalSocketAddress());
                            logger.logWarning(str5 + socket.getRemoteSocketAddress());
                        }
                        close(false, false);
                    }
                    if (e10 != null) {
                        if (this.mySock != null && logger.isLoggingEnabled(8)) {
                            logger.logWarning(str7 + this.key);
                        }
                        this.mySock = socket;
                        this.myClientInputStream = socket.getInputStream();
                        this.myClientOutputStream = this.mySock.getOutputStream();
                        Thread thread = new Thread(this);
                        thread.setDaemon(true);
                        thread.setName("TCPMessageChannelThread");
                        thread.start();
                    } else {
                        if (logger.isLoggingEnabled(8)) {
                            logger.logWarning(str6 + this.key);
                        }
                        this.mySock = socket;
                    }
                }
            } else {
                throw new IllegalArgumentException("Null argument");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
