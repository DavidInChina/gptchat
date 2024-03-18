package Y8;

import id.AbstractC3557B;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final W8.a f22112a;

    /* renamed from: b  reason: collision with root package name */
    public final a f22113b;

    /* renamed from: c  reason: collision with root package name */
    public final a f22114c;

    public c(P5.c cVar, a aVar, a aVar2) {
        this.f22112a = cVar;
        this.f22113b = aVar;
        this.f22114c = aVar2;
    }

    public static void a(byte b10, byte b11, int i10, long j6) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(android.gov.nist.core.a.e("untrusted mode: ", b11));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j6 != 0) {
                    return;
                }
                throw new IOException("zero transmitTime");
            }
            throw new IOException(android.gov.nist.core.a.e("untrusted stratum: ", i10));
        }
        throw new IOException("unsynchronized server");
    }

    public static long b(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long c(int i10, byte[] bArr) {
        long b10 = b(i10, bArr);
        return ((b(i10 + 4, bArr) * 1000) / 4294967296L) + ((b10 - 2208988800L) * 1000);
    }

    public final b d(String str, Long l10) {
        Throwable th2;
        W8.a aVar = this.f22112a;
        a aVar2 = this.f22114c;
        DatagramSocket datagramSocket = null;
        try {
            this.f22113b.getClass();
            AbstractC3557B.c0("host", str);
            InetAddress byName = InetAddress.getByName(str);
            AbstractC3557B.b0("InetAddress.getByName(host)", byName);
            aVar2.getClass();
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(l10.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
                bArr[0] = 27;
                long l11 = aVar.l();
                long j6 = aVar.j();
                long j10 = l11 / 1000;
                Long.signum(j10);
                long j11 = l11 - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                bArr[42] = (byte) (j12 >> 8);
                bArr[43] = (byte) j12;
                long j13 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
                datagramSocket2.send(datagramPacket);
                byte[] copyOf = Arrays.copyOf(bArr, 48);
                AbstractC3557B.c0("buffer", copyOf);
                datagramSocket2.receive(new DatagramPacket(copyOf, copyOf.length));
                long j14 = aVar.j();
                long j15 = (j14 - j6) + l11;
                byte b10 = copyOf[0];
                long c10 = c(24, copyOf);
                long c11 = c(32, copyOf);
                long c12 = c(40, copyOf);
                a((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), copyOf[1] & 255, c12);
                b bVar = new b(j15, j14, ((c12 - j15) + (c11 - c10)) / 2, this.f22112a);
                datagramSocket2.close();
                return bVar;
            } catch (Throwable th3) {
                th2 = th3;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
