package di;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jh.H1;
import ji.AbstractC4137l;
import ji.C4116E;
import ji.C4135j;
import ji.C4138m;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class w implements Closeable {

    /* renamed from: j0  reason: collision with root package name */
    public static final Logger f28663j0;

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4137l f28664Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f28665Z;

    /* renamed from: h0  reason: collision with root package name */
    public final v f28666h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C2730d f28667i0;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        AbstractC3557B.b0("getLogger(Http2::class.java.name)", logger);
        f28663j0 = logger;
    }

    public w(AbstractC4137l abstractC4137l, boolean z10) {
        this.f28664Y = abstractC4137l;
        this.f28665Z = z10;
        v vVar = new v(abstractC4137l);
        this.f28666h0 = vVar;
        this.f28667i0 = new C2730d(vVar);
    }

    public final boolean a(boolean z10, n nVar) {
        EnumC2728b enumC2728b;
        int readInt;
        String str;
        int i10 = 0;
        AbstractC3557B.c0("handler", nVar);
        try {
            this.f28664Y.J0(9L);
            int t10 = Xh.b.t(this.f28664Y);
            if (t10 <= 16384) {
                int readByte = this.f28664Y.readByte() & 255;
                byte readByte2 = this.f28664Y.readByte();
                int i11 = readByte2 & 255;
                int readInt2 = this.f28664Y.readInt();
                int i12 = readInt2 & Integer.MAX_VALUE;
                Logger logger = f28663j0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.a(i12, t10, readByte, i11, true));
                }
                if (z10 && readByte != 4) {
                    StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = g.f28580b;
                    if (readByte < strArr.length) {
                        str = strArr[readByte];
                    } else {
                        str = Xh.b.i("0x%02x", Integer.valueOf(readByte));
                    }
                    sb2.append(str);
                    throw new IOException(sb2.toString());
                }
                switch (readByte) {
                    case 0:
                        i(nVar, t10, i11, i12);
                        break;
                    case 1:
                        m(nVar, t10, i11, i12);
                        break;
                    case 2:
                        if (t10 == 5) {
                            if (i12 != 0) {
                                AbstractC4137l abstractC4137l = this.f28664Y;
                                abstractC4137l.readInt();
                                abstractC4137l.readByte();
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        } else {
                            throw new IOException(AbstractC4194d.v("TYPE_PRIORITY length: ", t10, " != 5"));
                        }
                    case 3:
                        if (t10 == 4) {
                            if (i12 != 0) {
                                int readInt3 = this.f28664Y.readInt();
                                EnumC2728b[] values = EnumC2728b.values();
                                int length = values.length;
                                while (true) {
                                    if (i10 < length) {
                                        EnumC2728b enumC2728b2 = values[i10];
                                        if (enumC2728b2.f28550Y == readInt3) {
                                            enumC2728b = enumC2728b2;
                                        } else {
                                            i10++;
                                        }
                                    } else {
                                        enumC2728b = null;
                                    }
                                }
                                if (enumC2728b != null) {
                                    t tVar = nVar.f28603Z;
                                    tVar.getClass();
                                    if (i12 != 0 && (readInt2 & 1) == 0) {
                                        tVar.f28637o0.c(new q(tVar.f28631i0 + '[' + i12 + "] onReset", tVar, i12, enumC2728b, 0), 0L);
                                        break;
                                    } else {
                                        C2724A k10 = tVar.k(i12);
                                        if (k10 != null) {
                                            k10.k(enumC2728b);
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IOException(android.gov.nist.core.a.e("TYPE_RST_STREAM unexpected error code: ", readInt3));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        } else {
                            throw new IOException(AbstractC4194d.v("TYPE_RST_STREAM length: ", t10, " != 4"));
                        }
                        break;
                    case 4:
                        if (i12 == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (t10 != 0) {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (t10 % 6 == 0) {
                                E e10 = new E();
                                Cf.e z02 = N.z0(N.D0(0, t10), 6);
                                int i13 = z02.f3106Y;
                                int i14 = z02.f3107Z;
                                int i15 = z02.f3108h0;
                                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                                    while (true) {
                                        AbstractC4137l abstractC4137l2 = this.f28664Y;
                                        short readShort = abstractC4137l2.readShort();
                                        byte[] bArr = Xh.b.f21996a;
                                        int i16 = readShort & 65535;
                                        readInt = abstractC4137l2.readInt();
                                        if (i16 != 2) {
                                            if (i16 != 3) {
                                                if (i16 != 4) {
                                                    if (i16 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                    }
                                                } else if (readInt >= 0) {
                                                    i16 = 7;
                                                } else {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else {
                                                i16 = 4;
                                            }
                                        } else if (readInt != 0 && readInt != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        e10.c(i16, readInt);
                                        if (i13 != i14) {
                                            i13 += i15;
                                        }
                                    }
                                    throw new IOException(android.gov.nist.core.a.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                                }
                                t tVar2 = nVar.f28603Z;
                                tVar2.f28636n0.c(new m(R.a.t(new StringBuilder(), tVar2.f28631i0, " applyAndAckSettings"), nVar, e10), 0L);
                                break;
                            } else {
                                throw new IOException(android.gov.nist.core.a.e("TYPE_SETTINGS length % 6 != 0: ", t10));
                            }
                        } else {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                        break;
                    case 5:
                        r(nVar, t10, i11, i12);
                        break;
                    case 6:
                        p(nVar, t10, i11, i12);
                        break;
                    case 7:
                        j(nVar, t10, i12);
                        break;
                    case 8:
                        if (t10 == 4) {
                            long readInt4 = this.f28664Y.readInt() & 2147483647L;
                            int i17 = (readInt4 > 0L ? 1 : (readInt4 == 0L ? 0 : -1));
                            if (i17 != 0) {
                                if (i12 == 0) {
                                    t tVar3 = nVar.f28603Z;
                                    synchronized (tVar3) {
                                        tVar3.f28623B0 += readInt4;
                                        tVar3.notifyAll();
                                        break;
                                    }
                                } else {
                                    C2724A i18 = nVar.f28603Z.i(i12);
                                    if (i18 != null) {
                                        synchronized (i18) {
                                            i18.f28520f += readInt4;
                                            if (i17 > 0) {
                                                i18.notifyAll();
                                            }
                                            break;
                                        }
                                    }
                                }
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException(android.gov.nist.core.a.e("TYPE_WINDOW_UPDATE length !=4: ", t10));
                        }
                        break;
                    default:
                        this.f28664Y.skip(t10);
                        break;
                }
                return true;
            }
            throw new IOException(android.gov.nist.core.a.e("FRAME_SIZE_ERROR: ", t10));
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28664Y.close();
    }

    public final void h(n nVar) {
        AbstractC3557B.c0("handler", nVar);
        if (this.f28665Z) {
            if (!a(true, nVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C4138m c4138m = g.f28579a;
        C4138m q10 = this.f28664Y.q(c4138m.f36723Y.length);
        Level level = Level.FINE;
        Logger logger = f28663j0;
        if (logger.isLoggable(level)) {
            logger.fine(Xh.b.i("<< CONNECTION " + q10.e(), new Object[0]));
        }
        if (AbstractC3557B.K(c4138m, q10)) {
            return;
        }
        throw new IOException("Expected a connection header but was ".concat(q10.r()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, ji.j] */
    public final void i(n nVar, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        long j6;
        boolean z14;
        if (i12 != 0) {
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 32) == 0) {
                if ((i11 & 8) != 0) {
                    byte readByte = this.f28664Y.readByte();
                    byte[] bArr = Xh.b.f21996a;
                    i13 = readByte & 255;
                    i14 = i10;
                } else {
                    i14 = i10;
                    i13 = 0;
                }
                int q10 = H1.q(i14, i11, i13);
                AbstractC4137l abstractC4137l = this.f28664Y;
                nVar.getClass();
                AbstractC3557B.c0("source", abstractC4137l);
                nVar.f28603Z.getClass();
                if (i12 != 0 && (i12 & 1) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = 0;
                if (z11) {
                    t tVar = nVar.f28603Z;
                    tVar.getClass();
                    ?? obj = new Object();
                    long j11 = q10;
                    abstractC4137l.J0(j11);
                    abstractC4137l.g0(obj, j11);
                    tVar.f28637o0.c(new o(tVar.f28631i0 + '[' + i12 + "] onData", tVar, i12, obj, q10, z10), 0L);
                } else {
                    C2724A i15 = nVar.f28603Z.i(i12);
                    if (i15 == null) {
                        nVar.f28603Z.F(i12, EnumC2728b.PROTOCOL_ERROR);
                        long j12 = q10;
                        nVar.f28603Z.p(j12);
                        abstractC4137l.skip(j12);
                    } else {
                        byte[] bArr2 = Xh.b.f21996a;
                        y yVar = i15.f28523i;
                        long j13 = q10;
                        yVar.getClass();
                        long j14 = j13;
                        while (true) {
                            if (j14 > j10) {
                                synchronized (yVar.f28677k0) {
                                    z12 = yVar.f28673Z;
                                    if (yVar.f28675i0.f36721Z + j14 > yVar.f28672Y) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                }
                                if (z13) {
                                    abstractC4137l.skip(j14);
                                    yVar.f28677k0.e(EnumC2728b.FLOW_CONTROL_ERROR);
                                    break;
                                } else if (z12) {
                                    abstractC4137l.skip(j14);
                                    break;
                                } else {
                                    long g02 = abstractC4137l.g0(yVar.f28674h0, j14);
                                    if (g02 != -1) {
                                        j14 -= g02;
                                        C2724A c2724a = yVar.f28677k0;
                                        synchronized (c2724a) {
                                            try {
                                                if (yVar.f28676j0) {
                                                    yVar.f28674h0.a();
                                                    j6 = 0;
                                                } else {
                                                    C4135j c4135j = yVar.f28675i0;
                                                    j6 = 0;
                                                    if (c4135j.f36721Z == 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    c4135j.I0(yVar.f28674h0);
                                                    if (z14) {
                                                        c2724a.notifyAll();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        j10 = j6;
                                    } else {
                                        throw new EOFException();
                                    }
                                }
                            } else {
                                byte[] bArr3 = Xh.b.f21996a;
                                yVar.f28677k0.f28516b.p(j13);
                                break;
                            }
                        }
                        if (z10) {
                            i15.j(Xh.b.f21997b, true);
                        }
                    }
                }
                this.f28664Y.skip(i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final void j(n nVar, int i10, int i11) {
        EnumC2728b enumC2728b;
        Object[] array;
        C2724A[] c2724aArr;
        if (i10 >= 8) {
            if (i11 == 0) {
                int readInt = this.f28664Y.readInt();
                int readInt2 = this.f28664Y.readInt();
                int i12 = i10 - 8;
                EnumC2728b[] values = EnumC2728b.values();
                int length = values.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        enumC2728b = values[i13];
                        if (enumC2728b.f28550Y == readInt2) {
                            break;
                        }
                        i13++;
                    } else {
                        enumC2728b = null;
                        break;
                    }
                }
                if (enumC2728b != null) {
                    C4138m c4138m = C4138m.f36722i0;
                    if (i12 > 0) {
                        c4138m = this.f28664Y.q(i12);
                    }
                    nVar.getClass();
                    AbstractC3557B.c0("debugData", c4138m);
                    c4138m.d();
                    t tVar = nVar.f28603Z;
                    synchronized (tVar) {
                        array = tVar.f28630h0.values().toArray(new C2724A[0]);
                        tVar.f28634l0 = true;
                    }
                    for (C2724A c2724a : (C2724A[]) array) {
                        if (c2724a.f28515a > readInt && c2724a.h()) {
                            c2724a.k(EnumC2728b.REFUSED_STREAM);
                            nVar.f28603Z.k(c2724a.f28515a);
                        }
                    }
                    return;
                }
                throw new IOException(android.gov.nist.core.a.e("TYPE_GOAWAY unexpected error code: ", readInt2));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(android.gov.nist.core.a.e("TYPE_GOAWAY length < 8: ", i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f28561b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(int i10, int i11, int i12, int i13) {
        int e10;
        v vVar = this.f28666h0;
        vVar.f28661j0 = i10;
        vVar.f28658Z = i10;
        vVar.f28662k0 = i11;
        vVar.f28659h0 = i12;
        vVar.f28660i0 = i13;
        while (true) {
            C2730d c2730d = this.f28667i0;
            C4116E c4116e = c2730d.f28563d;
            boolean H6 = c4116e.H();
            ArrayList arrayList = c2730d.f28562c;
            if (!H6) {
                byte readByte = c4116e.readByte();
                byte[] bArr = Xh.b.f21996a;
                int i14 = readByte & 255;
                if (i14 != 128) {
                    if ((readByte & 128) == 128) {
                        e10 = c2730d.e(i14, 127);
                        int i15 = e10 - 1;
                        if (i15 >= 0) {
                            C2729c[] c2729cArr = AbstractC2732f.f28577a;
                            if (i15 <= c2729cArr.length - 1) {
                                arrayList.add(c2729cArr[i15]);
                            }
                        }
                        int length = c2730d.f28565f + 1 + (i15 - AbstractC2732f.f28577a.length);
                        if (length < 0) {
                            break;
                        }
                        C2729c[] c2729cArr2 = c2730d.f28564e;
                        if (length >= c2729cArr2.length) {
                            break;
                        }
                        C2729c c2729c = c2729cArr2[length];
                        AbstractC3557B.Z(c2729c);
                        arrayList.add(c2729c);
                    } else if (i14 == 64) {
                        C2729c[] c2729cArr3 = AbstractC2732f.f28577a;
                        C4138m d10 = c2730d.d();
                        AbstractC2732f.a(d10);
                        c2730d.c(new C2729c(d10, c2730d.d()));
                    } else if ((readByte & 64) == 64) {
                        c2730d.c(new C2729c(c2730d.b(c2730d.e(i14, 63) - 1), c2730d.d()));
                    } else if ((readByte & 32) == 32) {
                        int e11 = c2730d.e(i14, 31);
                        c2730d.f28561b = e11;
                        if (e11 < 0 || e11 > c2730d.f28560a) {
                            break;
                        }
                        int i16 = c2730d.f28567h;
                        if (e11 < i16) {
                            if (e11 == 0) {
                                kf.q.d3(0, r4.length, null, c2730d.f28564e);
                                c2730d.f28565f = c2730d.f28564e.length - 1;
                                c2730d.f28566g = 0;
                                c2730d.f28567h = 0;
                            } else {
                                c2730d.a(i16 - e11);
                            }
                        }
                    } else if (i14 != 16 && i14 != 0) {
                        arrayList.add(new C2729c(c2730d.b(c2730d.e(i14, 15) - 1), c2730d.d()));
                    } else {
                        C2729c[] c2729cArr4 = AbstractC2732f.f28577a;
                        C4138m d11 = c2730d.d();
                        AbstractC2732f.a(d11);
                        arrayList.add(new C2729c(d11, c2730d.d()));
                    }
                } else {
                    throw new IOException("index == 0");
                }
            } else {
                List K22 = kf.t.K2(arrayList);
                arrayList.clear();
                return K22;
            }
        }
        throw new IOException(android.gov.nist.core.a.e("Header index too large ", e10));
    }

    public final void m(n nVar, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        if (i12 != 0) {
            boolean z11 = false;
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 8) != 0) {
                byte readByte = this.f28664Y.readByte();
                byte[] bArr = Xh.b.f21996a;
                i13 = readByte & 255;
            } else {
                i13 = 0;
            }
            if ((i11 & 32) != 0) {
                AbstractC4137l abstractC4137l = this.f28664Y;
                abstractC4137l.readInt();
                abstractC4137l.readByte();
                byte[] bArr2 = Xh.b.f21996a;
                nVar.getClass();
                i10 -= 5;
            }
            List k10 = k(H1.q(i10, i11, i13), i13, i11, i12);
            nVar.getClass();
            nVar.f28603Z.getClass();
            if (i12 != 0 && (i12 & 1) == 0) {
                z11 = true;
            }
            if (z11) {
                t tVar = nVar.f28603Z;
                tVar.getClass();
                tVar.f28637o0.c(new p(tVar.f28631i0 + '[' + i12 + "] onHeaders", tVar, i12, k10, z10), 0L);
                return;
            }
            t tVar2 = nVar.f28603Z;
            synchronized (tVar2) {
                C2724A i14 = tVar2.i(i12);
                if (i14 == null) {
                    if (!tVar2.f28634l0) {
                        if (i12 > tVar2.f28632j0) {
                            if (i12 % 2 != tVar2.f28633k0 % 2) {
                                C2724A c2724a = new C2724A(i12, tVar2, false, z10, Xh.b.v(k10));
                                tVar2.f28632j0 = i12;
                                tVar2.f28630h0.put(Integer.valueOf(i12), c2724a);
                                tVar2.f28635m0.f().c(new k(tVar2.f28631i0 + '[' + i12 + "] onStream", tVar2, c2724a, 1), 0L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                i14.j(Xh.b.v(k10), z10);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void p(n nVar, int i10, int i11, int i12) {
        if (i10 == 8) {
            if (i12 == 0) {
                int readInt = this.f28664Y.readInt();
                int readInt2 = this.f28664Y.readInt();
                if ((i11 & 1) != 0) {
                    t tVar = nVar.f28603Z;
                    synchronized (tVar) {
                        try {
                            if (readInt != 1) {
                                if (readInt != 2) {
                                    if (readInt == 3) {
                                        tVar.notifyAll();
                                    }
                                } else {
                                    tVar.f28643u0++;
                                }
                            } else {
                                tVar.f28641s0++;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                nVar.f28603Z.f28636n0.c(new l(R.a.t(new StringBuilder(), nVar.f28603Z.f28631i0, " ping"), nVar.f28603Z, readInt, readInt2), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(android.gov.nist.core.a.e("TYPE_PING length != 8: ", i10));
    }

    public final void r(n nVar, int i10, int i11, int i12) {
        int i13;
        if (i12 != 0) {
            if ((i11 & 8) != 0) {
                byte readByte = this.f28664Y.readByte();
                byte[] bArr = Xh.b.f21996a;
                i13 = readByte & 255;
            } else {
                i13 = 0;
            }
            int readInt = this.f28664Y.readInt() & Integer.MAX_VALUE;
            List k10 = k(H1.q(i10 - 4, i11, i13), i13, i11, i12);
            nVar.getClass();
            t tVar = nVar.f28603Z;
            tVar.getClass();
            synchronized (tVar) {
                if (tVar.f28627F0.contains(Integer.valueOf(readInt))) {
                    tVar.F(readInt, EnumC2728b.PROTOCOL_ERROR);
                    return;
                }
                tVar.f28627F0.add(Integer.valueOf(readInt));
                Zh.c cVar = tVar.f28637o0;
                cVar.c(new q(tVar.f28631i0 + '[' + readInt + "] onRequest", tVar, readInt, k10, 2), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
