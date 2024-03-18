package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SipStackImpl;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Enumeration;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class IOHandler {
    private static final String TCP = "tcp";
    private static final String TLS = "tls";
    private static StackLogger logger = CommonLogger.getLogger(IOHandler.class);
    private SipStackImpl sipStack;
    private final ConcurrentHashMap<String, Socket> socketTable = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Semaphore> socketCreationMap = new ConcurrentHashMap<>();

    public IOHandler(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = (SipStackImpl) sIPTransactionStack;
    }

    private void enterIOCriticalSection(String str) {
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore == null) {
            semaphore = new Semaphore(1, true);
            Semaphore putIfAbsent = this.socketCreationMap.putIfAbsent(str, semaphore);
            if (putIfAbsent == null) {
                if (logger.isLoggingEnabled(32)) {
                    a.w("new Semaphore added for key ", str, logger);
                }
            } else {
                semaphore = putIfAbsent;
            }
        }
        try {
            if (semaphore.tryAcquire(10L, TimeUnit.SECONDS)) {
                return;
            }
            throw new IOException("Could not acquire IO Semaphore'" + str + "' after 10 seconds -- giving up ");
        } catch (InterruptedException unused) {
            throw new IOException("exception in acquiring sem");
        }
    }

    private void leaveIOCriticalSection(String str) {
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore != null) {
            semaphore.release();
        }
    }

    public static String makeKey(InetAddress inetAddress, int i10) {
        return inetAddress.getHostAddress() + ":" + i10;
    }

    private void writeChunks(OutputStream outputStream, byte[] bArr, int i10) {
        int i11;
        synchronized (outputStream) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 8192;
                if (i13 < i10) {
                    i11 = 8192;
                } else {
                    i11 = i10 - i12;
                }
                try {
                    outputStream.write(bArr, i12, i11);
                    i12 = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        outputStream.flush();
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<Socket> elements = this.socketTable.elements();
        while (elements.hasMoreElements()) {
            try {
                elements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        String makeKey = makeKey(inetAddress, i10);
        Socket socket = getSocket(makeKey);
        if (socket == null) {
            socket = this.sipStack.getNetworkLayer().createSocket(inetAddress, i10, inetAddress2, i11);
            putSocket(makeKey, socket);
        }
        return socket.getLocalSocketAddress();
    }

    public SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, TLSMessageChannel tLSMessageChannel) {
        String makeKey = makeKey(inetAddress, i10);
        Socket socket = getSocket(makeKey);
        Socket socket2 = socket;
        if (socket == null) {
            SSLSocket createSSLSocket = this.sipStack.getNetworkLayer().createSSLSocket(inetAddress, i10, inetAddress2);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("inaddr = " + inetAddress);
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("port = " + i10);
            }
            HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl(tLSMessageChannel, createSSLSocket);
            tLSMessageChannel.setHandshakeCompletedListener(handshakeCompletedListenerImpl);
            createSSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
            createSSLSocket.setEnabledProtocols(this.sipStack.getEnabledProtocols());
            createSSLSocket.setEnabledCipherSuites(this.sipStack.getEnabledCipherSuites());
            handshakeCompletedListenerImpl.startHandshakeWatchdog();
            createSSLSocket.startHandshake();
            tLSMessageChannel.setHandshakeCompleted(true);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Handshake passed");
            }
            try {
                this.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(tLSMessageChannel.getEncapsulatedClientTransaction());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("TLS Security policy passed");
                }
                putSocket(makeKey, createSSLSocket);
                socket2 = createSSLSocket;
            } catch (SecurityException e10) {
                throw new IOException(e10.getMessage());
            }
        }
        return socket2.getLocalSocketAddress();
    }

    public Socket getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putSocket(String str, Socket socket) {
        if (logger.isLoggingEnabled(32)) {
            a.w("adding socket for key ", str, logger);
        }
        this.socketTable.put(str, socket);
    }

    public void removeSocket(String str) {
        this.socketTable.remove(str);
        Semaphore remove = this.socketCreationMap.remove(str);
        if (remove != null) {
            remove.release();
        }
        if (logger.isLoggingEnabled(32)) {
            a.w("removed Socket and Semaphore for key ", str, logger);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(32) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("inaddr = " + r29);
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("port = " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
        r0 = r27.sipStack.getNetworkLayer().createSocket(r29, r30, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(32) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("local inaddr = " + r0.getLocalAddress().getHostAddress());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0119, code lost:
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
        writeChunks(r0.getOutputStream(), r4, r13);
        putSocket(r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012c, code lost:
        r8 = android.gov.nist.javax.sip.stack.IOHandler.logger;
        r11 = new java.lang.StringBuilder();
        r11.append("Problem connecting ");
        r11.append(r29);
        r11.append(r10);
        r11.append(r30);
        r11.append(r10);
        r11.append(r28);
        r11.append(r9);
        r11.append(new java.lang.String(r4, r18));
        r8.logError(r11.toString());
        removeSocket(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a6, code lost:
        throw new java.net.SocketException(r0.getClass() + r10 + r0.getMessage() + r10 + r0.getCause() + " Problem connecting " + r29 + r10 + r30 + r10 + r28 + r9 + new java.lang.String(r4, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0201, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logError("Problem sending: sendBytes " + r31 + " inAddr " + r29.getHostAddress() + " port = " + r30 + " remoteHost " + r34.getPeerAddress() + " remotePort " + r34.getPeerPort() + " peerPacketPort " + r34.getPeerPacketSourcePort() + " isClient " + r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0268, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(4) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026a, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logError(r27.socketTable.toString());
        r0 = android.gov.nist.javax.sip.stack.IOHandler.logger;
        r4 = "Could not connect to ";
        r2 = new java.lang.StringBuilder(r4);
        r2.append(r29);
        r5 = ":";
        r2.append(r5);
        r2.append(r30);
        r0.logError(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0291, code lost:
        r5 = ":";
        r4 = "Could not connect to ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ac, code lost:
        throw new java.io.IOException(r4 + r29 + r5 + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02ad, code lost:
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02cf, code lost:
        r2 = r27.sipStack.getNetworkLayer().createSSLSocket(r29, r30, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e1, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(32) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e3, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("inaddr = " + r29);
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("port = " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x030f, code lost:
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0316, code lost:
        r0 = new android.gov.nist.javax.sip.stack.HandshakeCompletedListenerImpl((android.gov.nist.javax.sip.stack.TLSMessageChannel) r34, r2);
        ((android.gov.nist.javax.sip.stack.TLSMessageChannel) r34).setHandshakeCompletedListener(r0);
        r2.addHandshakeCompletedListener(r0);
        r2.setEnabledProtocols(r27.sipStack.getEnabledProtocols());
        r0.startHandshakeWatchdog();
        r2.startHandshake();
        ((android.gov.nist.javax.sip.stack.TLSMessageChannel) r34).setHandshakeCompleted(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0348, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(32) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x034a, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("Handshake passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0351, code lost:
        r27.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(r34.getEncapsulatedClientTransaction());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0366, code lost:
        if (android.gov.nist.javax.sip.stack.IOHandler.logger.isLoggingEnabled(32) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0368, code lost:
        android.gov.nist.javax.sip.stack.IOHandler.logger.logDebug("TLS Security policy passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x036f, code lost:
        writeChunks(r2.getOutputStream(), r32, r13);
        putSocket(r3, r2);
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x037d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0387, code lost:
        throw new java.io.IOException(r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201 A[Catch: all -> 0x00df, TryCatch #14 {all -> 0x00df, blocks: (B:18:0x00a0, B:22:0x00ac, B:24:0x00b6, B:27:0x00e6, B:28:0x00f0, B:30:0x00fa, B:32:0x011d, B:35:0x012c, B:36:0x01a6, B:37:0x01a7, B:40:0x01b2, B:42:0x01be, B:43:0x01d4, B:47:0x01dd, B:48:0x01e1, B:50:0x01f0, B:51:0x01f3, B:53:0x01f8, B:55:0x0201, B:56:0x0257), top: B:126:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Socket sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i10, String str, byte[] bArr, boolean z10, MessageChannel messageChannel) {
        int i11;
        String str2;
        Socket socket;
        byte[] bArr2 = bArr;
        String str3 = " for message ";
        String str4 = Separators.SP;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int length = bArr2.length;
        if (!logger.isLoggingEnabled(32)) {
            str2 = "UTF-8";
        } else {
            StackLogger stackLogger = logger;
            str2 = "UTF-8";
            StringBuilder s10 = a.s("sendBytes ", str, " local inAddr ");
            s10.append(inetAddress.getHostAddress());
            s10.append(" remote inAddr ");
            s10.append(inetAddress2.getHostAddress());
            s10.append(" port = ");
            s10.append(i10);
            s10.append(" length = ");
            s10.append(length);
            s10.append(" isClient ");
            s10.append(z10);
            stackLogger.logDebug(s10.toString());
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        Socket socket2 = null;
        if (str.compareToIgnoreCase("tcp") == 0) {
            String makeKey = makeKey(inetAddress2, i10);
            enterIOCriticalSection(makeKey);
            try {
                try {
                    Socket socket3 = getSocket(makeKey);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        } else if (socket3 == null) {
                            break;
                        } else {
                            try {
                                writeChunks(socket3.getOutputStream(), bArr2, length);
                                break;
                            } catch (IOException e10) {
                                String str5 = str3;
                                try {
                                    String str6 = str4;
                                    if (logger.isLoggingEnabled(8)) {
                                        logger.logWarning("IOException occured retryCount " + i12);
                                    }
                                    try {
                                        socket3.close();
                                    } catch (Exception unused) {
                                    }
                                    i12++;
                                    if (z10) {
                                        if (i12 >= i11) {
                                            removeSocket(makeKey);
                                        } else {
                                            this.socketTable.remove(makeKey);
                                        }
                                        bArr2 = bArr;
                                        socket3 = null;
                                        str3 = str5;
                                        str4 = str6;
                                    } else {
                                        removeSocket(makeKey);
                                        throw e10;
                                    }
                                } catch (IOException unused2) {
                                    socket2 = socket3;
                                    if (logger.isLoggingEnabled(4)) {
                                    }
                                    removeSocket(makeKey);
                                    leaveIOCriticalSection(makeKey);
                                    socket3 = socket2;
                                    if (socket3 != null) {
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException unused3) {
                }
            } finally {
                leaveIOCriticalSection(makeKey);
            }
        } else if (str.compareToIgnoreCase("tls") == 0) {
            String makeKey2 = makeKey(inetAddress2, i10);
            enterIOCriticalSection(makeKey2);
            try {
                try {
                    try {
                        Socket socket4 = getSocket(makeKey2);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= i11) {
                                break;
                            } else if (socket4 == null) {
                                break;
                            } else {
                                try {
                                    writeChunks(socket4.getOutputStream(), bArr, length);
                                    break;
                                } catch (IOException e11) {
                                    try {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logException(e11);
                                        }
                                        removeSocket(makeKey2);
                                        try {
                                            logger.logDebug("Closing socket");
                                            socket4.close();
                                        } catch (Exception unused4) {
                                        }
                                        i13++;
                                        socket4 = null;
                                    } catch (IOException unused5) {
                                        socket2 = socket4;
                                        removeSocket(makeKey2);
                                        leaveIOCriticalSection(makeKey2);
                                        socket = socket2;
                                        if (socket != null) {
                                        }
                                    }
                                }
                            }
                        }
                    } catch (SSLHandshakeException e12) {
                        removeSocket(makeKey2);
                        throw e12;
                    }
                } catch (IOException unused6) {
                }
                if (socket != null) {
                    return socket;
                }
                throw new IOException("Could not connect to " + inetAddress2 + ":" + i10);
            } finally {
            }
        } else {
            DatagramSocket createDatagramSocket = this.sipStack.getNetworkLayer().createDatagramSocket();
            createDatagramSocket.connect(inetAddress2, i10);
            createDatagramSocket.send(new DatagramPacket(bArr, 0, length, inetAddress2, i10));
            createDatagramSocket.close();
            return null;
        }
    }

    public static String makeKey(String str, int i10) {
        return str + ":" + i10;
    }
}
