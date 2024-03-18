package v2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class H extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public final int f47049e = 8000;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f47050f;

    /* renamed from: g  reason: collision with root package name */
    public final DatagramPacket f47051g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f47052h;

    /* renamed from: i  reason: collision with root package name */
    public DatagramSocket f47053i;

    /* renamed from: j  reason: collision with root package name */
    public MulticastSocket f47054j;

    /* renamed from: k  reason: collision with root package name */
    public InetAddress f47055k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f47056l;

    /* renamed from: m  reason: collision with root package name */
    public int f47057m;

    public H() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f47050f = bArr;
        this.f47051g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        Uri uri = lVar.f47095a;
        this.f47052h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f47052h.getPort();
        r();
        try {
            this.f47055k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f47055k, port);
            if (this.f47055k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f47054j = multicastSocket;
                multicastSocket.joinGroup(this.f47055k);
                this.f47053i = this.f47054j;
            } else {
                this.f47053i = new DatagramSocket(inetSocketAddress);
            }
            this.f47053i.setSoTimeout(this.f47049e);
            this.f47056l = true;
            s(lVar);
            return -1L;
        } catch (IOException e10) {
            throw new i(2001, e10);
        } catch (SecurityException e11) {
            throw new i(2006, e11);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47052h = null;
        MulticastSocket multicastSocket = this.f47054j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f47055k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f47054j = null;
        }
        DatagramSocket datagramSocket = this.f47053i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f47053i = null;
        }
        this.f47055k = null;
        this.f47057m = 0;
        if (this.f47056l) {
            this.f47056l = false;
            q();
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47052h;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f47057m;
        DatagramPacket datagramPacket = this.f47051g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f47053i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f47057m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new i(2002, e10);
            } catch (IOException e11) {
                throw new i(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f47057m;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f47050f, length2 - i13, bArr, i10, min);
        this.f47057m -= min;
        return min;
    }
}
