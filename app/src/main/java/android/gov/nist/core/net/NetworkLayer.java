package android.gov.nist.core.net;

import android.gov.nist.javax.sip.SipStackImpl;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public interface NetworkLayer {
    DatagramSocket createDatagramSocket();

    DatagramSocket createDatagramSocket(int i10, InetAddress inetAddress);

    SSLServerSocket createSSLServerSocket(int i10, int i11, InetAddress inetAddress);

    SSLSocket createSSLSocket(InetAddress inetAddress, int i10);

    SSLSocket createSSLSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2);

    ServerSocket createServerSocket(int i10, int i11, InetAddress inetAddress);

    Socket createSocket(InetAddress inetAddress, int i10);

    Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2);

    Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11);

    void setSipStack(SipStackImpl sipStackImpl);
}
