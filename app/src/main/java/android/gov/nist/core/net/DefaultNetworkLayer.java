package android.gov.nist.core.net;

import android.gov.nist.javax.sip.SipStackImpl;
import java.io.IOException;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class DefaultNetworkLayer implements NetworkLayer {
    public static final DefaultNetworkLayer SINGLETON = new DefaultNetworkLayer();
    private SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
    private SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

    private DefaultNetworkLayer() {
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public SSLServerSocket createSSLServerSocket(int i10, int i11, InetAddress inetAddress) {
        return (SSLServerSocket) this.sslServerSocketFactory.createServerSocket(i10, i11, inetAddress);
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public SSLSocket createSSLSocket(InetAddress inetAddress, int i10) {
        return createSSLSocket(inetAddress, i10, null);
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public ServerSocket createServerSocket(int i10, int i11, InetAddress inetAddress) {
        return new ServerSocket(i10, i11, inetAddress);
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return new Socket(inetAddress, i10);
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public void setSipStack(SipStackImpl sipStackImpl) {
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public DatagramSocket createDatagramSocket(int i10, InetAddress inetAddress) {
        if (inetAddress.isMulticastAddress()) {
            try {
                MulticastSocket multicastSocket = new MulticastSocket(i10);
                multicastSocket.joinGroup(inetAddress);
                return multicastSocket;
            } catch (IOException e10) {
                throw new SocketException(e10.getLocalizedMessage());
            }
        }
        return new DatagramSocket(i10, inetAddress);
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public SSLSocket createSSLSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        SSLSocket sSLSocket = (SSLSocket) this.sslSocketFactory.createSocket();
        if (inetAddress2 != null) {
            sSLSocket.bind(new InetSocketAddress(inetAddress2, 0));
        }
        try {
            sSLSocket.connect(new InetSocketAddress(inetAddress, i10), 8000);
            return sSLSocket;
        } catch (SocketTimeoutException unused) {
            throw new ConnectException("Socket timeout error (8sec)" + inetAddress + ":" + i10);
        }
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        if (inetAddress2 != null) {
            Socket socket = new Socket();
            socket.bind(new InetSocketAddress(inetAddress2, 0));
            try {
                socket.connect(new InetSocketAddress(inetAddress, i10), 8000);
                return socket;
            } catch (SocketTimeoutException unused) {
                throw new ConnectException("Socket timeout error (8sec)" + inetAddress + ":" + i10);
            }
        }
        Socket socket2 = new Socket();
        try {
            socket2.connect(new InetSocketAddress(inetAddress, i10), 8000);
            return socket2;
        } catch (SocketTimeoutException unused2) {
            throw new ConnectException("Socket timeout error (8sec)" + inetAddress + ":" + i10);
        }
    }

    @Override // android.gov.nist.core.net.NetworkLayer
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        if (inetAddress2 != null) {
            Socket socket = new Socket();
            socket.bind(new InetSocketAddress(inetAddress2, 0));
            try {
                socket.connect(new InetSocketAddress(inetAddress, i10), 8000);
                return socket;
            } catch (SocketTimeoutException unused) {
                throw new ConnectException("Socket timeout error (8sec)" + inetAddress + ":" + i10);
            }
        }
        Socket socket2 = new Socket();
        if (i11 != 0) {
            socket2.bind(new InetSocketAddress(i10));
        }
        try {
            socket2.connect(new InetSocketAddress(inetAddress, i10), 8000);
            return socket2;
        } catch (SocketTimeoutException unused2) {
            throw new ConnectException("Socket timeout error (8sec)" + inetAddress + ":" + i10);
        }
    }
}
