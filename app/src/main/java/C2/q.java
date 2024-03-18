package C2;

import A2.W;
import E2.Y;
import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import c1.AbstractC2279d;
import io.sentry.C3636c1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import jh.H1;
import p2.AbstractC5058k;
import p2.C5059l;
import p2.C5063p;
import p2.C5065s;
import q1.AbstractC5260f;
import q2.AbstractC5264d;
import s2.AbstractC5530A;
import x2.AbstractC6267b;
import y2.AbstractC6519f;
import y2.C6520g;
import y2.C6521h;
import y2.C6527n;
import z2.C6755D;

/* loaded from: classes2.dex */
public abstract class q extends AbstractC6519f {

    /* renamed from: K1  reason: collision with root package name */
    public static final byte[] f2564K1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: B1  reason: collision with root package name */
    public boolean f2568B1;

    /* renamed from: C1  reason: collision with root package name */
    public boolean f2570C1;

    /* renamed from: D0  reason: collision with root package name */
    public final g f2571D0;

    /* renamed from: D1  reason: collision with root package name */
    public boolean f2572D1;

    /* renamed from: E1  reason: collision with root package name */
    public boolean f2574E1;

    /* renamed from: F1  reason: collision with root package name */
    public C6527n f2576F1;

    /* renamed from: G0  reason: collision with root package name */
    public final W f2577G0;

    /* renamed from: H0  reason: collision with root package name */
    public C5065s f2579H0;

    /* renamed from: I0  reason: collision with root package name */
    public C5065s f2581I0;

    /* renamed from: J0  reason: collision with root package name */
    public B2.k f2583J0;

    /* renamed from: J1  reason: collision with root package name */
    public boolean f2584J1;

    /* renamed from: K0  reason: collision with root package name */
    public B2.k f2585K0;

    /* renamed from: L0  reason: collision with root package name */
    public MediaCrypto f2586L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f2587M0;

    /* renamed from: Q0  reason: collision with root package name */
    public j f2591Q0;

    /* renamed from: R0  reason: collision with root package name */
    public C5065s f2592R0;

    /* renamed from: S0  reason: collision with root package name */
    public MediaFormat f2593S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f2594T0;

    /* renamed from: V0  reason: collision with root package name */
    public ArrayDeque f2596V0;

    /* renamed from: W0  reason: collision with root package name */
    public o f2597W0;

    /* renamed from: X0  reason: collision with root package name */
    public m f2598X0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f2600Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f2601a1;
    public boolean b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f2602c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f2603d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f2604e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f2605f1;
    public boolean g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f2606h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f2607i1;

    /* renamed from: m1  reason: collision with root package name */
    public ByteBuffer f2611m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f2612n1;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f2613o1;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f2614p1;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f2615q1;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f2616r1;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f2617s1;

    /* renamed from: w0  reason: collision with root package name */
    public final i f2621w0;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f2622w1;

    /* renamed from: x0  reason: collision with root package name */
    public final s f2623x0;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f2624x1;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f2626y1;

    /* renamed from: z0  reason: collision with root package name */
    public final float f2627z0;

    /* renamed from: y0  reason: collision with root package name */
    public final boolean f2625y0 = false;

    /* renamed from: A0  reason: collision with root package name */
    public final x2.h f2565A0 = new x2.h(0);

    /* renamed from: B0  reason: collision with root package name */
    public final x2.h f2567B0 = new x2.h(0);

    /* renamed from: C0  reason: collision with root package name */
    public final x2.h f2569C0 = new x2.h(2);

    /* renamed from: E0  reason: collision with root package name */
    public final MediaCodec.BufferInfo f2573E0 = new MediaCodec.BufferInfo();

    /* renamed from: O0  reason: collision with root package name */
    public float f2589O0 = 1.0f;

    /* renamed from: P0  reason: collision with root package name */
    public float f2590P0 = 1.0f;

    /* renamed from: N0  reason: collision with root package name */
    public final long f2588N0 = -9223372036854775807L;

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayDeque f2575F0 = new ArrayDeque();

    /* renamed from: H1  reason: collision with root package name */
    public p f2580H1 = p.f2559e;

    /* renamed from: U0  reason: collision with root package name */
    public float f2595U0 = -1.0f;

    /* renamed from: Y0  reason: collision with root package name */
    public int f2599Y0 = 0;

    /* renamed from: t1  reason: collision with root package name */
    public int f2618t1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    public int f2609k1 = -1;

    /* renamed from: l1  reason: collision with root package name */
    public int f2610l1 = -1;

    /* renamed from: j1  reason: collision with root package name */
    public long f2608j1 = -9223372036854775807L;

    /* renamed from: z1  reason: collision with root package name */
    public long f2628z1 = -9223372036854775807L;

    /* renamed from: A1  reason: collision with root package name */
    public long f2566A1 = -9223372036854775807L;

    /* renamed from: I1  reason: collision with root package name */
    public long f2582I1 = -9223372036854775807L;

    /* renamed from: u1  reason: collision with root package name */
    public int f2619u1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    public int f2620v1 = 0;

    /* renamed from: G1  reason: collision with root package name */
    public C6520g f2578G1 = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [y2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [x2.h, C2.g] */
    /* JADX WARN: Type inference failed for: r5v6, types: [A2.W, java.lang.Object] */
    public q(int i10, H1 h12, float f6) {
        super(i10);
        r rVar = s.f2629g;
        this.f2621w0 = h12;
        this.f2623x0 = rVar;
        this.f2627z0 = f6;
        ?? hVar = new x2.h(2);
        hVar.f2539r0 = 32;
        this.f2571D0 = hVar;
        hVar.k(0);
        hVar.f48641j0.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f510a = AbstractC5264d.f43666a;
        obj.f512c = 0;
        obj.f511b = 2;
        this.f2577G0 = obj;
    }

    @Override // y2.AbstractC6519f
    public final int A() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r7 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f6 A[LOOP:0: B:25:0x0096->B:114:0x02f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f4 A[EDGE_INSN: B:133:0x02f4->B:113:0x02f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(long j6, long j10) {
        boolean z10;
        g gVar;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        byte b10;
        boolean z13;
        Gi.e.n(!this.f2570C1);
        g gVar2 = this.f2571D0;
        if (gVar2.n()) {
            ByteBuffer byteBuffer = gVar2.f48641j0;
            int i12 = this.f2610l1;
            int i13 = gVar2.f2538q0;
            long j11 = gVar2.f48643l0;
            boolean R10 = R(this.f50574q0, gVar2.f2537p0);
            boolean g10 = gVar2.g(4);
            C5065s c5065s = this.f2581I0;
            c5065s.getClass();
            if (f0(j6, j10, null, byteBuffer, i12, 0, i13, j11, R10, g10, c5065s)) {
                gVar = gVar2;
                a0(gVar.f2537p0);
                gVar.i();
                z10 = false;
            } else {
                return false;
            }
        } else {
            z10 = false;
            gVar = gVar2;
        }
        if (this.f2568B1) {
            this.f2570C1 = true;
            return z10;
        }
        boolean z14 = true;
        boolean z15 = this.f2615q1;
        x2.h hVar = this.f2569C0;
        if (z15) {
            Gi.e.n(gVar.m(hVar));
            this.f2615q1 = z10;
        }
        if (this.f2616r1) {
            if (gVar.n()) {
                return true;
            }
            E();
            this.f2616r1 = z10;
            S();
            if (!this.f2614p1) {
                return z10;
            }
        }
        Gi.e.n(!this.f2568B1);
        C3636c1 c3636c1 = this.f50565h0;
        c3636c1.g();
        hVar.i();
        ?? r12 = z10;
        while (true) {
            hVar.i();
            int i14 = r12 == true ? 1 : 0;
            int i15 = r12 == true ? 1 : 0;
            int i16 = r12 == true ? 1 : 0;
            int i17 = r12 == true ? 1 : 0;
            int u10 = u(c3636c1, hVar, i14);
            if (u10 != -5) {
                if (u10 != -4) {
                    if (u10 != -3) {
                        throw new IllegalStateException();
                    }
                } else if (hVar.g(4)) {
                    this.f2568B1 = z14;
                    break;
                } else {
                    byte[] bArr = null;
                    if (this.f2572D1) {
                        C5065s c5065s2 = this.f2579H0;
                        c5065s2.getClass();
                        this.f2581I0 = c5065s2;
                        if (Objects.equals(c5065s2.f42319q0, "audio/opus") && !this.f2581I0.f42321s0.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f2581I0.f42321s0.get(r12);
                            int i18 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C5065s c5065s3 = this.f2581I0;
                            c5065s3.getClass();
                            p2.r b11 = c5065s3.b();
                            b11.f42220A = i18;
                            this.f2581I0 = new C5065s(b11);
                        }
                        Y(this.f2581I0, null);
                        this.f2572D1 = r12;
                    }
                    hVar.l();
                    C5065s c5065s4 = this.f2581I0;
                    if (c5065s4 != null && Objects.equals(c5065s4.f42319q0, "audio/opus")) {
                        if (hVar.g(268435456)) {
                            hVar.f48639h0 = this.f2581I0;
                            P(hVar);
                        }
                        if (this.f50574q0 - hVar.f48643l0 <= 80000) {
                            C5065s c5065s5 = this.f2581I0;
                            c5065s5.getClass();
                            W w10 = this.f2577G0;
                            w10.getClass();
                            hVar.f48641j0.getClass();
                            if (hVar.f48641j0.limit() - hVar.f48641j0.position() != 0) {
                                if (w10.f511b == 2) {
                                    List list = c5065s5.f42321s0;
                                    if (list.size() == z14 || list.size() == 3) {
                                        bArr = (byte[]) list.get(r12);
                                    }
                                }
                                ByteBuffer byteBuffer2 = hVar.f48641j0;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i19 = limit - position;
                                int i20 = (i19 + 255) / 255;
                                int i21 = i20 + 27 + i19;
                                if (w10.f511b == 2) {
                                    if (bArr != null) {
                                        i10 = bArr.length + 28;
                                    } else {
                                        i10 = 47;
                                    }
                                    i21 = i10 + 44 + i21;
                                } else {
                                    i10 = r12;
                                }
                                int i22 = i21;
                                if (w10.f510a.capacity() < i22) {
                                    w10.f510a = ByteBuffer.allocate(i22).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    w10.f510a.clear();
                                }
                                ByteBuffer byteBuffer3 = w10.f510a;
                                if (w10.f511b == 2) {
                                    if (bArr != null) {
                                        W.a(byteBuffer3, 0L, 0, 1, true);
                                        i11 = limit;
                                        long length = bArr.length;
                                        if ((length >> 8) == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        P4.a.q(z13, "out of range: %s", length);
                                        byteBuffer3.put((byte) length);
                                        byteBuffer3.put(bArr);
                                        byteBuffer3.putInt(22, AbstractC5530A.k(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i11 = limit;
                                        byteBuffer3.put(W.f508d);
                                    }
                                    byteBuffer3.put(W.f509e);
                                } else {
                                    i11 = limit;
                                }
                                byte b12 = byteBuffer2.get(0);
                                if (byteBuffer2.limit() > 1) {
                                    b10 = byteBuffer2.get(1);
                                } else {
                                    b10 = 0;
                                }
                                int o10 = w10.f512c + ((int) ((AbstractC2279d.o(b12, b10) * 48000) / 1000000));
                                w10.f512c = o10;
                                W.a(byteBuffer3, o10, w10.f511b, i20, false);
                                for (int i23 = 0; i23 < i20; i23++) {
                                    if (i19 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i19 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i19);
                                        i19 = 0;
                                    }
                                }
                                int i24 = i11;
                                while (position < i24) {
                                    byteBuffer3.put(byteBuffer2.get(position));
                                    position++;
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (w10.f511b == 2) {
                                    z11 = false;
                                    int i25 = i10 + 66;
                                    byteBuffer3.putInt(i25, AbstractC5530A.k(byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    z11 = false;
                                    byteBuffer3.putInt(22, AbstractC5530A.k(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                w10.f511b++;
                                w10.f510a = byteBuffer3;
                                hVar.i();
                                hVar.k(w10.f510a.remaining());
                                hVar.f48641j0.put(w10.f510a);
                                hVar.l();
                                if (gVar.n()) {
                                    long j12 = this.f50574q0;
                                    if (R(j12, gVar.f2537p0) != R(j12, hVar.f48643l0)) {
                                        break;
                                    }
                                }
                                if (gVar.m(hVar)) {
                                    break;
                                }
                                r12 = z11;
                                z14 = true;
                            }
                        }
                    }
                    z11 = r12;
                    if (gVar.n()) {
                    }
                    if (gVar.m(hVar)) {
                    }
                }
            } else {
                boolean z16 = r12 == true ? 1 : 0;
                boolean z17 = r12 == true ? 1 : 0;
                boolean z18 = r12 == true ? 1 : 0;
                boolean z19 = r12 == true ? 1 : 0;
                z11 = z16;
                z12 = z14;
                X(c3636c1);
                break;
            }
        }
        z12 = true;
        this.f2615q1 = true;
        if (gVar.n()) {
            gVar.l();
        }
        if (!gVar.n() && !this.f2568B1 && !this.f2616r1) {
            return z11;
        }
        return z12;
    }

    public abstract C6521h C(m mVar, C5065s c5065s, C5065s c5065s2);

    public k D(IllegalStateException illegalStateException, m mVar) {
        return new k(illegalStateException, mVar);
    }

    public final void E() {
        this.f2616r1 = false;
        this.f2571D0.i();
        this.f2569C0.i();
        this.f2615q1 = false;
        this.f2614p1 = false;
        W w10 = this.f2577G0;
        w10.getClass();
        w10.f510a = AbstractC5264d.f43666a;
        w10.f512c = 0;
        w10.f511b = 2;
    }

    public final boolean F() {
        if (this.f2622w1) {
            this.f2619u1 = 1;
            if (!this.f2601a1 && !this.f2602c1) {
                this.f2620v1 = 2;
            } else {
                this.f2620v1 = 3;
                return false;
            }
        } else {
            r0();
        }
        return true;
    }

    public final boolean G(long j6, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        MediaCodec.BufferInfo bufferInfo;
        boolean z13;
        boolean z14;
        ByteBuffer byteBuffer;
        int i10;
        int i11;
        long j11;
        boolean z15;
        boolean z16;
        C5065s c5065s;
        int i12;
        boolean z17;
        boolean z18;
        j jVar = this.f2591Q0;
        jVar.getClass();
        if (this.f2610l1 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f2573E0;
        if (!z10) {
            if (this.f2603d1 && this.f2624x1) {
                try {
                    i12 = jVar.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    e0();
                    if (this.f2570C1) {
                        h0();
                    }
                    return false;
                }
            } else {
                i12 = jVar.d(bufferInfo2);
            }
            if (i12 < 0) {
                if (i12 == -2) {
                    this.f2626y1 = true;
                    j jVar2 = this.f2591Q0;
                    jVar2.getClass();
                    MediaFormat outputFormat = jVar2.getOutputFormat();
                    if (this.f2599Y0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f2606h1 = true;
                    } else {
                        if (this.f2605f1) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        this.f2593S0 = outputFormat;
                        this.f2594T0 = true;
                    }
                    return true;
                }
                if (this.f2607i1 && (this.f2568B1 || this.f2619u1 == 2)) {
                    e0();
                }
                return false;
            } else if (this.f2606h1) {
                this.f2606h1 = false;
                jVar.releaseOutputBuffer(i12, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                e0();
                return false;
            } else {
                this.f2610l1 = i12;
                ByteBuffer outputBuffer = jVar.getOutputBuffer(i12);
                this.f2611m1 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f2611m1.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f2604e1 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f2628z1 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = this.f2566A1;
                }
                long j12 = bufferInfo2.presentationTimeUs;
                if (j12 < this.f50574q0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f2612n1 = z17;
                long j13 = this.f2566A1;
                if (j13 != -9223372036854775807L && j13 <= j12) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                this.f2613o1 = z18;
                s0(j12);
            }
        }
        if (this.f2603d1 && this.f2624x1) {
            try {
                byteBuffer = this.f2611m1;
                i10 = this.f2610l1;
                i11 = bufferInfo2.flags;
                j11 = bufferInfo2.presentationTimeUs;
                z15 = this.f2612n1;
                z16 = this.f2613o1;
                c5065s = this.f2581I0;
                c5065s.getClass();
                z12 = true;
                z11 = false;
            } catch (IllegalStateException unused2) {
                z11 = false;
            }
            try {
                z13 = f0(j6, j10, jVar, byteBuffer, i10, i11, 1, j11, z15, z16, c5065s);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                e0();
                if (this.f2570C1) {
                    h0();
                }
                return z11;
            }
        } else {
            z12 = true;
            z11 = false;
            ByteBuffer byteBuffer2 = this.f2611m1;
            int i13 = this.f2610l1;
            int i14 = bufferInfo2.flags;
            long j14 = bufferInfo2.presentationTimeUs;
            boolean z19 = this.f2612n1;
            boolean z20 = this.f2613o1;
            C5065s c5065s2 = this.f2581I0;
            c5065s2.getClass();
            bufferInfo = bufferInfo2;
            z13 = f0(j6, j10, jVar, byteBuffer2, i13, i14, 1, j14, z19, z20, c5065s2);
        }
        if (z13) {
            a0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z14 = z12;
            } else {
                z14 = z11;
            }
            this.f2610l1 = -1;
            this.f2611m1 = null;
            if (!z14) {
                return z12;
            }
            e0();
        }
        return z11;
    }

    public final boolean H() {
        j jVar = this.f2591Q0;
        if (jVar == null || this.f2619u1 == 2 || this.f2568B1) {
            return false;
        }
        int i10 = this.f2609k1;
        x2.h hVar = this.f2567B0;
        if (i10 < 0) {
            int c10 = jVar.c();
            this.f2609k1 = c10;
            if (c10 < 0) {
                return false;
            }
            hVar.f48641j0 = jVar.getInputBuffer(c10);
            hVar.i();
        }
        if (this.f2619u1 == 1) {
            if (!this.f2607i1) {
                this.f2624x1 = true;
                jVar.h(this.f2609k1, 0, 0L, 4);
                this.f2609k1 = -1;
                hVar.f48641j0 = null;
            }
            this.f2619u1 = 2;
            return false;
        } else if (this.g1) {
            this.g1 = false;
            ByteBuffer byteBuffer = hVar.f48641j0;
            byteBuffer.getClass();
            byteBuffer.put(f2564K1);
            jVar.h(this.f2609k1, 38, 0L, 0);
            this.f2609k1 = -1;
            hVar.f48641j0 = null;
            this.f2622w1 = true;
            return true;
        } else {
            if (this.f2618t1 == 1) {
                int i11 = 0;
                while (true) {
                    C5065s c5065s = this.f2592R0;
                    c5065s.getClass();
                    if (i11 >= c5065s.f42321s0.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = hVar.f48641j0;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f2592R0.f42321s0.get(i11));
                    i11++;
                }
                this.f2618t1 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.f48641j0;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            C3636c1 c3636c1 = this.f50565h0;
            c3636c1.g();
            try {
                int u10 = u(c3636c1, hVar, 0);
                if (u10 == -3) {
                    if (j()) {
                        this.f2566A1 = this.f2628z1;
                    }
                    return false;
                } else if (u10 == -5) {
                    if (this.f2618t1 == 2) {
                        hVar.i();
                        this.f2618t1 = 1;
                    }
                    X(c3636c1);
                    return true;
                } else if (hVar.g(4)) {
                    this.f2566A1 = this.f2628z1;
                    if (this.f2618t1 == 2) {
                        hVar.i();
                        this.f2618t1 = 1;
                    }
                    this.f2568B1 = true;
                    if (!this.f2622w1) {
                        e0();
                        return false;
                    }
                    try {
                        if (!this.f2607i1) {
                            this.f2624x1 = true;
                            jVar.h(this.f2609k1, 0, 0L, 4);
                            this.f2609k1 = -1;
                            hVar.f48641j0 = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw e(AbstractC5530A.q(e10.getErrorCode()), this.f2579H0, e10, false);
                    }
                } else if (!this.f2622w1 && !hVar.g(1)) {
                    hVar.i();
                    if (this.f2618t1 == 2) {
                        this.f2618t1 = 1;
                    }
                    return true;
                } else {
                    boolean g10 = hVar.g(1073741824);
                    x2.d dVar = hVar.f48640i0;
                    if (g10) {
                        if (position == 0) {
                            dVar.getClass();
                        } else {
                            if (dVar.f48632d == null) {
                                int[] iArr = new int[1];
                                dVar.f48632d = iArr;
                                dVar.f48637i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = dVar.f48632d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f2600Z0 && !g10) {
                        ByteBuffer byteBuffer4 = hVar.f48641j0;
                        byteBuffer4.getClass();
                        byte[] bArr = t2.g.f45670a;
                        int position2 = byteBuffer4.position();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = i12 + 1;
                            if (i14 < position2) {
                                int i15 = byteBuffer4.get(i12) & 255;
                                if (i13 == 3) {
                                    if (i15 == 1 && (byteBuffer4.get(i14) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer4.duplicate();
                                        duplicate.position(i12 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer4.position(0);
                                        byteBuffer4.put(duplicate);
                                        break;
                                    }
                                } else if (i15 == 0) {
                                    i13++;
                                }
                                if (i15 != 0) {
                                    i13 = 0;
                                }
                                i12 = i14;
                            } else {
                                byteBuffer4.clear();
                                break;
                            }
                        }
                        ByteBuffer byteBuffer5 = hVar.f48641j0;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.f2600Z0 = false;
                    }
                    long j6 = hVar.f48643l0;
                    if (this.f2572D1) {
                        ArrayDeque arrayDeque = this.f2575F0;
                        if (!arrayDeque.isEmpty()) {
                            j.j jVar2 = ((p) arrayDeque.peekLast()).f2563d;
                            C5065s c5065s2 = this.f2579H0;
                            c5065s2.getClass();
                            jVar2.a(j6, c5065s2);
                        } else {
                            j.j jVar3 = this.f2580H1.f2563d;
                            C5065s c5065s3 = this.f2579H0;
                            c5065s3.getClass();
                            jVar3.a(j6, c5065s3);
                        }
                        this.f2572D1 = false;
                    }
                    this.f2628z1 = Math.max(this.f2628z1, j6);
                    if (j() || hVar.g(536870912)) {
                        this.f2566A1 = this.f2628z1;
                    }
                    hVar.l();
                    if (hVar.g(268435456)) {
                        P(hVar);
                    }
                    c0(hVar);
                    try {
                        if (g10) {
                            jVar.f(this.f2609k1, dVar, j6);
                        } else {
                            int i16 = this.f2609k1;
                            ByteBuffer byteBuffer6 = hVar.f48641j0;
                            byteBuffer6.getClass();
                            jVar.h(i16, byteBuffer6.limit(), j6, 0);
                        }
                        this.f2609k1 = -1;
                        hVar.f48641j0 = null;
                        this.f2622w1 = true;
                        this.f2618t1 = 0;
                        this.f2578G1.f50591c++;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw e(AbstractC5530A.q(e11.getErrorCode()), this.f2579H0, e11, false);
                    }
                }
            } catch (x2.g e12) {
                U(e12);
                g0(0);
                I();
                return true;
            }
        }
    }

    public final void I() {
        try {
            j jVar = this.f2591Q0;
            Gi.e.o(jVar);
            jVar.flush();
        } finally {
            j0();
        }
    }

    public final boolean J() {
        boolean z10;
        if (this.f2591Q0 == null) {
            return false;
        }
        int i10 = this.f2620v1;
        if (i10 != 3 && !this.f2601a1 && ((!this.b1 || this.f2626y1) && (!this.f2602c1 || !this.f2624x1))) {
            if (i10 == 2) {
                int i11 = AbstractC5530A.f45131a;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.n(z10);
                if (i11 >= 23) {
                    try {
                        r0();
                    } catch (C6527n e10) {
                        s2.p.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        h0();
                        return true;
                    }
                }
            }
            I();
            return false;
        }
        h0();
        return true;
    }

    public final List K(boolean z10) {
        C5065s c5065s = this.f2579H0;
        c5065s.getClass();
        s sVar = this.f2623x0;
        ArrayList N10 = N(sVar, c5065s, z10);
        if (N10.isEmpty() && z10) {
            N10 = N(sVar, c5065s, false);
            if (!N10.isEmpty()) {
                s2.p.g("MediaCodecRenderer", "Drm session requires secure decoder for " + c5065s.f42319q0 + ", but no secure decoder available. Trying to proceed with " + N10 + Separators.DOT);
            }
        }
        return N10;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f6, C5065s[] c5065sArr);

    public abstract ArrayList N(s sVar, C5065s c5065s, boolean z10);

    public abstract h O(m mVar, C5065s c5065s, MediaCrypto mediaCrypto, float f6);

    public abstract void P(x2.h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:243:0x044a, code lost:
        if ("stvm8".equals(r5) == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x045a, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x054c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(m mVar, MediaCrypto mediaCrypto) {
        float f6;
        long j6;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str;
        float f10;
        int i11;
        int i12;
        String str2;
        String str3;
        int i13;
        int i14;
        boolean z18;
        String str4;
        String str5;
        String str6;
        String str7;
        int i15;
        C5065s c5065s = this.f2579H0;
        c5065s.getClass();
        String str8 = mVar.f2547a;
        int i16 = AbstractC5530A.f45131a;
        if (i16 < 23) {
            f6 = -1.0f;
        } else {
            float f11 = this.f2590P0;
            C5065s[] c5065sArr = this.f50572o0;
            c5065sArr.getClass();
            f6 = M(f11, c5065sArr);
        }
        if (f6 <= this.f2627z0) {
            f6 = -1.0f;
        }
        d0(c5065s);
        this.f50569l0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h O10 = O(mVar, c5065s, mediaCrypto, f6);
        if (i16 >= 31) {
            C6755D c6755d = this.f50568k0;
            c6755d.getClass();
            n.a(O10, c6755d);
        }
        try {
            AbstractC5260f.g("createCodec:" + str8);
            this.f2591Q0 = this.f2621w0.c(O10);
            AbstractC5260f.q();
            this.f50569l0.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mVar.d(c5065s)) {
                StringBuilder p10 = android.gov.nist.core.a.p("id=");
                p10.append(c5065s.f42308Y);
                p10.append(", mimeType=");
                p10.append(c5065s.f42319q0);
                String str9 = c5065s.f42318p0;
                if (str9 != null) {
                    p10.append(", container=");
                    p10.append(str9);
                }
                int i17 = c5065s.f42315m0;
                if (i17 != -1) {
                    p10.append(", bitrate=");
                    p10.append(i17);
                }
                String str10 = c5065s.f42316n0;
                if (str10 != null) {
                    p10.append(", codecs=");
                    p10.append(str10);
                }
                C5063p c5063p = c5065s.f42322t0;
                if (c5063p != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (int i18 = 0; i18 < c5063p.f42217i0; i18++) {
                        UUID uuid = c5063p.f42214Y[i18].f42207Z;
                        if (uuid.equals(AbstractC5058k.f42085b)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(AbstractC5058k.f42086c)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(AbstractC5058k.f42088e)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(AbstractC5058k.f42087d)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(AbstractC5058k.f42084a)) {
                            linkedHashSet.add("universal");
                        } else {
                            linkedHashSet.add("unknown (" + uuid + Separators.RPAREN);
                        }
                    }
                    p10.append(", drm=[");
                    new Q1.u(String.valueOf(','), 6).c(p10, linkedHashSet);
                    p10.append(']');
                }
                int i19 = c5065s.f42324v0;
                if (i19 != -1 && (i15 = c5065s.f42325w0) != -1) {
                    p10.append(", res=");
                    p10.append(i19);
                    p10.append("x");
                    p10.append(i15);
                }
                C5059l c5059l = c5065s.f42296C0;
                if (c5059l != null) {
                    int i20 = c5059l.f42104Y;
                    int i21 = c5059l.f42106h0;
                    int i22 = c5059l.f42105Z;
                    int i23 = c5059l.f42109k0;
                    int i24 = c5059l.f42108j0;
                    if ((i24 != -1 && i23 != -1) || (i20 != -1 && i22 != -1 && i21 != -1)) {
                        p10.append(", color=");
                        if (i20 != -1 && i22 != -1 && i21 != -1) {
                            j6 = elapsedRealtime;
                            z18 = true;
                        } else {
                            j6 = elapsedRealtime;
                            z18 = false;
                        }
                        if (z18) {
                            if (i20 != -1) {
                                if (i20 != 6) {
                                    if (i20 != 1) {
                                        if (i20 != 2) {
                                            str6 = "Undefined color space";
                                        } else {
                                            str6 = "BT601";
                                        }
                                    } else {
                                        str6 = "BT709";
                                    }
                                } else {
                                    str6 = "BT2020";
                                }
                            } else {
                                str6 = "Unset color space";
                            }
                            if (i22 != -1) {
                                if (i22 != 1) {
                                    if (i22 != 2) {
                                        str7 = "Undefined color range";
                                    } else {
                                        str7 = "Limited range";
                                    }
                                } else {
                                    str7 = "Full range";
                                }
                            } else {
                                str7 = "Unset color range";
                            }
                            String b10 = C5059l.b(i21);
                            int i25 = AbstractC5530A.f45131a;
                            Locale locale = Locale.US;
                            str4 = str6 + Separators.SLASH + str7 + Separators.SLASH + b10;
                        } else {
                            str4 = "NA/NA/NA";
                        }
                        if (i24 != -1 && i23 != -1) {
                            str5 = i24 + Separators.SLASH + i23;
                        } else {
                            str5 = "NA/NA";
                        }
                        p10.append(str4 + Separators.SLASH + str5);
                        f10 = c5065s.f42326x0;
                        if (f10 != -1.0f) {
                            p10.append(", fps=");
                            p10.append(f10);
                        }
                        i11 = c5065s.f42297D0;
                        if (i11 != -1) {
                            p10.append(", channels=");
                            p10.append(i11);
                        }
                        i12 = c5065s.f42298E0;
                        if (i12 != -1) {
                            p10.append(", sample_rate=");
                            p10.append(i12);
                        }
                        str2 = c5065s.f42310h0;
                        if (str2 != null) {
                            p10.append(", language=");
                            p10.append(str2);
                        }
                        str3 = c5065s.f42309Z;
                        if (str3 != null) {
                            p10.append(", label=");
                            p10.append(str3);
                        }
                        i13 = c5065s.f42311i0;
                        if (i13 != 0) {
                            ArrayList arrayList = new ArrayList();
                            if ((i13 & 4) != 0) {
                                arrayList.add("auto");
                            }
                            if ((i13 & 1) != 0) {
                                arrayList.add("default");
                            }
                            if ((i13 & 2) != 0) {
                                arrayList.add("forced");
                            }
                            p10.append(", selectionFlags=[");
                            new Q1.u(String.valueOf(','), 6).c(p10, arrayList);
                            p10.append("]");
                        }
                        i14 = c5065s.f42312j0;
                        if (i14 != 0) {
                            ArrayList arrayList2 = new ArrayList();
                            if ((i14 & 1) != 0) {
                                arrayList2.add("main");
                            }
                            if ((i14 & 2) != 0) {
                                arrayList2.add("alt");
                            }
                            if ((i14 & 4) != 0) {
                                arrayList2.add("supplementary");
                            }
                            if ((i14 & 8) != 0) {
                                arrayList2.add("commentary");
                            }
                            if ((i14 & 16) != 0) {
                                arrayList2.add("dub");
                            }
                            if ((i14 & 32) != 0) {
                                arrayList2.add("emergency");
                            }
                            if ((i14 & 64) != 0) {
                                arrayList2.add("caption");
                            }
                            if ((i14 & 128) != 0) {
                                arrayList2.add("subtitle");
                            }
                            if ((i14 & 256) != 0) {
                                arrayList2.add("sign");
                            }
                            if ((i14 & 512) != 0) {
                                arrayList2.add("describes-video");
                            }
                            if ((i14 & 1024) != 0) {
                                arrayList2.add("describes-music");
                            }
                            if ((i14 & 2048) != 0) {
                                arrayList2.add("enhanced-intelligibility");
                            }
                            if ((i14 & 4096) != 0) {
                                arrayList2.add("transcribes-dialog");
                            }
                            if ((i14 & 8192) != 0) {
                                arrayList2.add("easy-read");
                            }
                            if ((i14 & 16384) != 0) {
                                arrayList2.add("trick-play");
                            }
                            p10.append(", roleFlags=[");
                            new Q1.u(String.valueOf(','), 6).c(p10, arrayList2);
                            p10.append("]");
                        }
                        String sb2 = p10.toString();
                        Locale locale2 = Locale.US;
                        s2.p.g("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + sb2 + ", " + str8 + "]");
                    }
                }
                j6 = elapsedRealtime;
                f10 = c5065s.f42326x0;
                if (f10 != -1.0f) {
                }
                i11 = c5065s.f42297D0;
                if (i11 != -1) {
                }
                i12 = c5065s.f42298E0;
                if (i12 != -1) {
                }
                str2 = c5065s.f42310h0;
                if (str2 != null) {
                }
                str3 = c5065s.f42309Z;
                if (str3 != null) {
                }
                i13 = c5065s.f42311i0;
                if (i13 != 0) {
                }
                i14 = c5065s.f42312j0;
                if (i14 != 0) {
                }
                String sb22 = p10.toString();
                Locale locale22 = Locale.US;
                s2.p.g("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + sb22 + ", " + str8 + "]");
            } else {
                j6 = elapsedRealtime;
            }
            this.f2598X0 = mVar;
            this.f2595U0 = f6;
            this.f2592R0 = c5065s;
            int i26 = AbstractC5530A.f45131a;
            if (i26 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str8)) {
                String str11 = AbstractC5530A.f45134d;
                if (str11.startsWith("SM-T585") || str11.startsWith("SM-A510") || str11.startsWith("SM-A520") || str11.startsWith("SM-J700")) {
                    i10 = 2;
                    this.f2599Y0 = i10;
                    C5065s c5065s2 = this.f2592R0;
                    c5065s2.getClass();
                    if (i26 >= 21 && c5065s2.f42321s0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str8)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f2600Z0 = z10;
                    if (i26 < 18 && ((i26 != 18 || (!"OMX.SEC.avc.dec".equals(str8) && !"OMX.SEC.avc.dec.secure".equals(str8))) && (i26 != 19 || !AbstractC5530A.f45134d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str8) && !"OMX.Exynos.avc.dec.secure".equals(str8))))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    this.f2601a1 = z11;
                    if (i26 != 29 && "c2.android.aac.decoder".equals(str8)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.b1 = z12;
                    if (i26 <= 23 || !"OMX.google.vorbis.decoder".equals(str8)) {
                        if (i26 <= 19) {
                            String str12 = AbstractC5530A.f45132b;
                            if (!"hb2000".equals(str12)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str8)) {
                            }
                        }
                        z13 = false;
                        this.f2602c1 = z13;
                        if (i26 != 21 && "OMX.google.aac.decoder".equals(str8)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f2603d1 = z14;
                        if (i26 < 21 && "OMX.SEC.mp3.dec".equals(str8) && "samsung".equals(AbstractC5530A.f45133c)) {
                            str = AbstractC5530A.f45132b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z15 = true;
                                this.f2604e1 = z15;
                                C5065s c5065s3 = this.f2592R0;
                                c5065s3.getClass();
                                if (i26 > 18 && c5065s3.f42297D0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str8)) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                this.f2605f1 = z16;
                                String str13 = mVar.f2547a;
                                if ((i26 > 25 && "OMX.rk.video_decoder.avc".equals(str13)) || ((i26 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str13)) || ((i26 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str13) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str13) || "OMX.bcm.vdec.avc.tunnel".equals(str13) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str13) || "OMX.bcm.vdec.hevc.tunnel".equals(str13) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str13))) || (("Amazon".equals(AbstractC5530A.f45133c) && "AFTS".equals(AbstractC5530A.f45134d) && mVar.f2552f) || L())))) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                this.f2607i1 = z17;
                                this.f2591Q0.getClass();
                                if (this.f50570m0 == 2) {
                                    this.f50569l0.getClass();
                                    this.f2608j1 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.f2578G1.f50589a++;
                                V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
                            }
                        }
                        z15 = false;
                        this.f2604e1 = z15;
                        C5065s c5065s32 = this.f2592R0;
                        c5065s32.getClass();
                        if (i26 > 18) {
                        }
                        z16 = false;
                        this.f2605f1 = z16;
                        String str132 = mVar.f2547a;
                        if (i26 > 25) {
                        }
                        z17 = false;
                        this.f2607i1 = z17;
                        this.f2591Q0.getClass();
                        if (this.f50570m0 == 2) {
                        }
                        this.f2578G1.f50589a++;
                        V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
                    }
                    z13 = true;
                    this.f2602c1 = z13;
                    if (i26 != 21) {
                    }
                    z14 = false;
                    this.f2603d1 = z14;
                    if (i26 < 21) {
                        str = AbstractC5530A.f45132b;
                        if (!str.startsWith("baffin")) {
                        }
                        z15 = true;
                        this.f2604e1 = z15;
                        C5065s c5065s322 = this.f2592R0;
                        c5065s322.getClass();
                        if (i26 > 18) {
                        }
                        z16 = false;
                        this.f2605f1 = z16;
                        String str1322 = mVar.f2547a;
                        if (i26 > 25) {
                        }
                        z17 = false;
                        this.f2607i1 = z17;
                        this.f2591Q0.getClass();
                        if (this.f50570m0 == 2) {
                        }
                        this.f2578G1.f50589a++;
                        V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
                    }
                    z15 = false;
                    this.f2604e1 = z15;
                    C5065s c5065s3222 = this.f2592R0;
                    c5065s3222.getClass();
                    if (i26 > 18) {
                    }
                    z16 = false;
                    this.f2605f1 = z16;
                    String str13222 = mVar.f2547a;
                    if (i26 > 25) {
                    }
                    z17 = false;
                    this.f2607i1 = z17;
                    this.f2591Q0.getClass();
                    if (this.f50570m0 == 2) {
                    }
                    this.f2578G1.f50589a++;
                    V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
                }
            }
            if (i26 < 24 && ("OMX.Nvidia.h264.decode".equals(str8) || "OMX.Nvidia.h264.decode.secure".equals(str8))) {
                String str14 = AbstractC5530A.f45132b;
                if ("flounder".equals(str14) || "flounder_lte".equals(str14) || "grouper".equals(str14) || "tilapia".equals(str14)) {
                    i10 = 1;
                    this.f2599Y0 = i10;
                    C5065s c5065s22 = this.f2592R0;
                    c5065s22.getClass();
                    if (i26 >= 21) {
                    }
                    z10 = false;
                    this.f2600Z0 = z10;
                    if (i26 < 18) {
                    }
                    z11 = true;
                    this.f2601a1 = z11;
                    if (i26 != 29) {
                    }
                    z12 = false;
                    this.b1 = z12;
                    if (i26 <= 23) {
                    }
                    if (i26 <= 19) {
                    }
                    z13 = false;
                    this.f2602c1 = z13;
                    if (i26 != 21) {
                    }
                    z14 = false;
                    this.f2603d1 = z14;
                    if (i26 < 21) {
                    }
                    z15 = false;
                    this.f2604e1 = z15;
                    C5065s c5065s32222 = this.f2592R0;
                    c5065s32222.getClass();
                    if (i26 > 18) {
                    }
                    z16 = false;
                    this.f2605f1 = z16;
                    String str132222 = mVar.f2547a;
                    if (i26 > 25) {
                    }
                    z17 = false;
                    this.f2607i1 = z17;
                    this.f2591Q0.getClass();
                    if (this.f50570m0 == 2) {
                    }
                    this.f2578G1.f50589a++;
                    V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
                }
            }
            i10 = 0;
            this.f2599Y0 = i10;
            C5065s c5065s222 = this.f2592R0;
            c5065s222.getClass();
            if (i26 >= 21) {
            }
            z10 = false;
            this.f2600Z0 = z10;
            if (i26 < 18) {
            }
            z11 = true;
            this.f2601a1 = z11;
            if (i26 != 29) {
            }
            z12 = false;
            this.b1 = z12;
            if (i26 <= 23) {
            }
            if (i26 <= 19) {
            }
            z13 = false;
            this.f2602c1 = z13;
            if (i26 != 21) {
            }
            z14 = false;
            this.f2603d1 = z14;
            if (i26 < 21) {
            }
            z15 = false;
            this.f2604e1 = z15;
            C5065s c5065s322222 = this.f2592R0;
            c5065s322222.getClass();
            if (i26 > 18) {
            }
            z16 = false;
            this.f2605f1 = z16;
            String str1322222 = mVar.f2547a;
            if (i26 > 25) {
            }
            z17 = false;
            this.f2607i1 = z17;
            this.f2591Q0.getClass();
            if (this.f50570m0 == 2) {
            }
            this.f2578G1.f50589a++;
            V(str8, elapsedRealtime2, elapsedRealtime2 - j6);
        } catch (Throwable th2) {
            AbstractC5260f.q();
            throw th2;
        }
    }

    public final boolean R(long j6, long j10) {
        C5065s c5065s;
        if (j10 < j6 && ((c5065s = this.f2581I0) == null || !Objects.equals(c5065s.f42319q0, "audio/opus") || j6 - j10 > 80000)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r5 != 4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r0.f() != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r0.requiresSecureDecoderComponent(r1) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        C5065s c5065s;
        boolean z10;
        boolean z11;
        if (this.f2591Q0 == null && !this.f2614p1 && (c5065s = this.f2579H0) != null) {
            boolean z12 = true;
            if (this.f2585K0 == null && o0(c5065s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C5065s c5065s2 = this.f2579H0;
                E();
                String str = c5065s2.f42319q0;
                boolean equals = "audio/mp4a-latm".equals(str);
                g gVar = this.f2571D0;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    gVar.getClass();
                    gVar.f2539r0 = 1;
                } else {
                    gVar.getClass();
                    gVar.f2539r0 = 32;
                }
                this.f2614p1 = true;
                return;
            }
            l0(this.f2585K0);
            if (this.f2583J0 != null) {
                if (this.f2586L0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.n(z11);
                B2.k kVar = this.f2583J0;
                C5065s c5065s3 = this.f2579H0;
                c5065s3.getClass();
                AbstractC6267b g10 = kVar.g();
                if (B2.z.f1825d && (g10 instanceof B2.z)) {
                    int state = kVar.getState();
                    if (state == 1) {
                        B2.j f6 = kVar.f();
                        f6.getClass();
                        throw e(f6.f1807Y, this.f2579H0, f6, false);
                    }
                }
                if (g10 != null) {
                    if (g10 instanceof B2.z) {
                        B2.z zVar = (B2.z) g10;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(zVar.f1826a, zVar.f1827b);
                            this.f2586L0 = mediaCrypto;
                            if (!zVar.f1828c) {
                                String str2 = c5065s3.f42319q0;
                                Gi.e.o(str2);
                            }
                            z12 = false;
                            this.f2587M0 = z12;
                        } catch (MediaCryptoException e10) {
                            throw e(6006, this.f2579H0, e10, false);
                        }
                    }
                }
            }
            try {
                T(this.f2586L0, this.f2587M0);
                MediaCrypto mediaCrypto2 = this.f2586L0;
                if (mediaCrypto2 != null && this.f2591Q0 == null) {
                    mediaCrypto2.release();
                    this.f2586L0 = null;
                    this.f2587M0 = false;
                }
            } catch (o e11) {
                throw e(4001, this.f2579H0, e11, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        o oVar;
        String str2;
        C5065s c5065s = this.f2579H0;
        c5065s.getClass();
        if (this.f2596V0 == null) {
            try {
                List K10 = K(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f2596V0 = arrayDeque;
                if (this.f2625y0) {
                    arrayDeque.addAll(K10);
                } else if (!K10.isEmpty()) {
                    this.f2596V0.add((m) K10.get(0));
                }
                this.f2597W0 = null;
            } catch (v e10) {
                throw new o(-49998, c5065s, e10, z10);
            }
        }
        if (!this.f2596V0.isEmpty()) {
            ArrayDeque arrayDeque2 = this.f2596V0;
            arrayDeque2.getClass();
            m mVar = (m) arrayDeque2.peekFirst();
            while (this.f2591Q0 == null) {
                m mVar2 = (m) arrayDeque2.peekFirst();
                mVar2.getClass();
                if (!n0(mVar2)) {
                    return;
                }
                try {
                    Q(mVar2, mediaCrypto);
                } catch (Exception e11) {
                    if (mVar2 == mVar) {
                        try {
                            s2.p.g("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            Q(mVar2, mediaCrypto);
                        } catch (Exception e12) {
                            s2.p.h("MediaCodecRenderer", "Failed to initialize decoder: " + mVar2, e12);
                            arrayDeque2.removeFirst();
                            String str3 = "Decoder init failed: " + mVar2.f2547a + ", " + c5065s;
                            if (AbstractC5530A.f45131a < 21) {
                                if (e12 instanceof MediaCodec.CodecException) {
                                    str2 = ((MediaCodec.CodecException) e12).getDiagnosticInfo();
                                } else {
                                    str2 = null;
                                }
                                str = str2;
                            } else {
                                str = null;
                            }
                            o oVar2 = new o(str3, e12, c5065s.f42319q0, z10, mVar2, str);
                            U(oVar2);
                            oVar = this.f2597W0;
                            if (oVar != null) {
                                this.f2597W0 = oVar2;
                            } else {
                                this.f2597W0 = new o(oVar.getMessage(), oVar.getCause(), oVar.f2555Y, oVar.f2556Z, oVar.f2557h0, oVar.f2558i0);
                            }
                            if (!arrayDeque2.isEmpty()) {
                                throw this.f2597W0;
                            }
                        }
                    } else {
                        throw e11;
                        break;
                    }
                    s2.p.h("MediaCodecRenderer", "Failed to initialize decoder: " + mVar2, e12);
                    arrayDeque2.removeFirst();
                    String str32 = "Decoder init failed: " + mVar2.f2547a + ", " + c5065s;
                    if (AbstractC5530A.f45131a < 21) {
                    }
                    o oVar22 = new o(str32, e12, c5065s.f42319q0, z10, mVar2, str);
                    U(oVar22);
                    oVar = this.f2597W0;
                    if (oVar != null) {
                    }
                    if (!arrayDeque2.isEmpty()) {
                    }
                }
            }
            this.f2596V0 = null;
            return;
        }
        throw new o(-49999, c5065s, null, z10);
    }

    public abstract void U(Exception exc);

    public abstract void V(String str, long j6, long j10);

    public abstract void W(String str);

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r2 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
        if (F() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
        if (F() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
        if (F() == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6521h X(C3636c1 c3636c1) {
        boolean z10;
        boolean z11;
        int i10;
        AbstractC6267b g10;
        AbstractC6267b g11;
        boolean z12;
        boolean z13 = true;
        this.f2572D1 = true;
        C5065s c5065s = (C5065s) c3636c1.f34286h0;
        c5065s.getClass();
        String str = c5065s.f42319q0;
        if (str != null) {
            B2.k kVar = (B2.k) c3636c1.f34285Z;
            B2.k kVar2 = this.f2585K0;
            if (kVar2 != kVar) {
                if (kVar != null) {
                    kVar.b(null);
                }
                if (kVar2 != null) {
                    kVar2.c(null);
                }
            }
            this.f2585K0 = kVar;
            this.f2579H0 = c5065s;
            if (this.f2614p1) {
                this.f2616r1 = true;
                return null;
            }
            j jVar = this.f2591Q0;
            if (jVar == null) {
                this.f2596V0 = null;
                S();
                return null;
            }
            m mVar = this.f2598X0;
            mVar.getClass();
            C5065s c5065s2 = this.f2592R0;
            c5065s2.getClass();
            B2.k kVar3 = this.f2583J0;
            B2.k kVar4 = this.f2585K0;
            if (kVar3 != kVar4) {
                if (kVar4 != null && kVar3 != null && (g10 = kVar4.g()) != null && (g11 = kVar3.g()) != null && g10.getClass().equals(g11.getClass())) {
                    if (g10 instanceof B2.z) {
                        B2.z zVar = (B2.z) g10;
                        if (kVar4.a().equals(kVar3.a()) && AbstractC5530A.f45131a >= 23) {
                            UUID uuid = AbstractC5058k.f42088e;
                            if (!uuid.equals(kVar3.a()) && !uuid.equals(kVar4.a())) {
                                if (zVar.f1828c) {
                                    z12 = false;
                                } else {
                                    z12 = kVar4.e(str);
                                }
                                if (!mVar.f2552f) {
                                }
                            }
                        }
                    }
                }
                if (this.f2622w1) {
                    this.f2619u1 = 1;
                    this.f2620v1 = 3;
                } else {
                    h0();
                    S();
                }
                return new C6521h(mVar.f2547a, c5065s2, c5065s, 0, 128);
            }
            if (this.f2585K0 != this.f2583J0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && AbstractC5530A.f45131a < 23) {
                z11 = false;
            } else {
                z11 = true;
            }
            Gi.e.n(z11);
            C6521h C10 = C(mVar, c5065s2, c5065s);
            int i11 = C10.f50606d;
            if (i11 != 0) {
                i10 = 2;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (q0(c5065s)) {
                                this.f2592R0 = c5065s;
                                if (z10) {
                                }
                            }
                            i10 = 16;
                            if (i11 == 0 && (this.f2591Q0 != jVar || this.f2620v1 == 3)) {
                                return new C6521h(mVar.f2547a, c5065s2, c5065s, 0, i10);
                            }
                            return C10;
                        }
                        throw new IllegalStateException();
                    }
                    if (q0(c5065s)) {
                        this.f2617s1 = true;
                        this.f2618t1 = 1;
                        int i12 = this.f2599Y0;
                        if (i12 != 2 && (i12 != 1 || c5065s.f42324v0 != c5065s2.f42324v0 || c5065s.f42325w0 != c5065s2.f42325w0)) {
                            z13 = false;
                        }
                        this.g1 = z13;
                        this.f2592R0 = c5065s;
                        if (z10) {
                        }
                    }
                    i10 = 16;
                    if (i11 == 0) {
                    }
                    return C10;
                }
                if (q0(c5065s)) {
                    this.f2592R0 = c5065s;
                    if (!z10) {
                        if (this.f2622w1) {
                            this.f2619u1 = 1;
                            if (!this.f2601a1 && !this.f2602c1) {
                                this.f2620v1 = 1;
                            } else {
                                this.f2620v1 = 3;
                                if (i11 == 0) {
                                }
                                return C10;
                            }
                        }
                    }
                }
                i10 = 16;
                if (i11 == 0) {
                }
                return C10;
            } else if (this.f2622w1) {
                this.f2619u1 = 1;
                this.f2620v1 = 3;
            } else {
                h0();
                S();
            }
            i10 = 0;
            if (i11 == 0) {
            }
            return C10;
        }
        throw e(4005, c5065s, new IllegalArgumentException(), false);
    }

    public abstract void Y(C5065s c5065s, MediaFormat mediaFormat);

    public void a0(long j6) {
        this.f2582I1 = j6;
        while (true) {
            ArrayDeque arrayDeque = this.f2575F0;
            if (!arrayDeque.isEmpty() && j6 >= ((p) arrayDeque.peek()).f2560a) {
                p pVar = (p) arrayDeque.poll();
                pVar.getClass();
                m0(pVar);
                b0();
            } else {
                return;
            }
        }
    }

    public abstract void b0();

    public final void e0() {
        int i10 = this.f2620v1;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f2570C1 = true;
                    i0();
                    return;
                }
                h0();
                S();
                return;
            }
            I();
            r0();
            return;
        }
        I();
    }

    public abstract boolean f0(long j6, long j10, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, C5065s c5065s);

    public final boolean g0(int i10) {
        C3636c1 c3636c1 = this.f50565h0;
        c3636c1.g();
        x2.h hVar = this.f2565A0;
        hVar.i();
        int u10 = u(c3636c1, hVar, i10 | 4);
        if (u10 == -5) {
            X(c3636c1);
            return true;
        } else if (u10 == -4 && hVar.g(4)) {
            this.f2568B1 = true;
            e0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [B2.k, android.media.MediaCrypto] */
    public final void h0() {
        try {
            j jVar = this.f2591Q0;
            if (jVar != null) {
                jVar.release();
                this.f2578G1.f50590b++;
                m mVar = this.f2598X0;
                mVar.getClass();
                W(mVar.f2547a);
            }
            this.f2591Q0 = null;
            try {
                MediaCrypto mediaCrypto = this.f2586L0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f2591Q0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f2586L0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void j0() {
        this.f2609k1 = -1;
        this.f2567B0.f48641j0 = null;
        this.f2610l1 = -1;
        this.f2611m1 = null;
        this.f2608j1 = -9223372036854775807L;
        this.f2624x1 = false;
        this.f2622w1 = false;
        this.g1 = false;
        this.f2606h1 = false;
        this.f2612n1 = false;
        this.f2613o1 = false;
        this.f2628z1 = -9223372036854775807L;
        this.f2566A1 = -9223372036854775807L;
        this.f2582I1 = -9223372036854775807L;
        this.f2619u1 = 0;
        this.f2620v1 = 0;
        this.f2618t1 = this.f2617s1 ? 1 : 0;
    }

    public final void k0() {
        j0();
        this.f2576F1 = null;
        this.f2596V0 = null;
        this.f2598X0 = null;
        this.f2592R0 = null;
        this.f2593S0 = null;
        this.f2594T0 = false;
        this.f2626y1 = false;
        this.f2595U0 = -1.0f;
        this.f2599Y0 = 0;
        this.f2600Z0 = false;
        this.f2601a1 = false;
        this.b1 = false;
        this.f2602c1 = false;
        this.f2603d1 = false;
        this.f2604e1 = false;
        this.f2605f1 = false;
        this.f2607i1 = false;
        this.f2617s1 = false;
        this.f2618t1 = 0;
        this.f2587M0 = false;
    }

    @Override // y2.AbstractC6519f
    public boolean l() {
        boolean z10;
        if (this.f2579H0 != null) {
            if (j()) {
                z10 = this.f50576s0;
            } else {
                Y y10 = this.f50571n0;
                y10.getClass();
                z10 = y10.j();
            }
            if (!z10 && this.f2610l1 < 0) {
                if (this.f2608j1 != -9223372036854775807L) {
                    this.f50569l0.getClass();
                    if (SystemClock.elapsedRealtime() < this.f2608j1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void l0(B2.k kVar) {
        B2.k kVar2 = this.f2583J0;
        if (kVar2 != kVar) {
            if (kVar != null) {
                kVar.b(null);
            }
            if (kVar2 != null) {
                kVar2.c(null);
            }
        }
        this.f2583J0 = kVar;
    }

    @Override // y2.AbstractC6519f
    public void m() {
        this.f2579H0 = null;
        m0(p.f2559e);
        this.f2575F0.clear();
        J();
    }

    public final void m0(p pVar) {
        this.f2580H1 = pVar;
        if (pVar.f2562c != -9223372036854775807L) {
            this.f2584J1 = true;
            Z();
        }
    }

    public boolean n0(m mVar) {
        return true;
    }

    @Override // y2.AbstractC6519f
    public void o(long j6, boolean z10) {
        int i10;
        this.f2568B1 = false;
        this.f2570C1 = false;
        this.f2574E1 = false;
        if (this.f2614p1) {
            this.f2571D0.i();
            this.f2569C0.i();
            this.f2615q1 = false;
            W w10 = this.f2577G0;
            w10.getClass();
            w10.f510a = AbstractC5264d.f43666a;
            w10.f512c = 0;
            w10.f511b = 2;
        } else if (J()) {
            S();
        }
        j.j jVar = this.f2580H1.f2563d;
        synchronized (jVar) {
            i10 = jVar.f35818Z;
        }
        if (i10 > 0) {
            this.f2572D1 = true;
        }
        this.f2580H1.f2563d.b();
        this.f2575F0.clear();
    }

    public boolean o0(C5065s c5065s) {
        return false;
    }

    public abstract int p0(s sVar, C5065s c5065s);

    public final boolean q0(C5065s c5065s) {
        if (AbstractC5530A.f45131a >= 23 && this.f2591Q0 != null && this.f2620v1 != 3 && this.f50570m0 != 0) {
            float f6 = this.f2590P0;
            c5065s.getClass();
            C5065s[] c5065sArr = this.f50572o0;
            c5065sArr.getClass();
            float M10 = M(f6, c5065sArr);
            float f10 = this.f2595U0;
            if (f10 == M10) {
                return true;
            }
            if (M10 == -1.0f) {
                if (this.f2622w1) {
                    this.f2619u1 = 1;
                    this.f2620v1 = 3;
                    return false;
                }
                h0();
                S();
                return false;
            } else if (f10 == -1.0f && M10 <= this.f2627z0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", M10);
                j jVar = this.f2591Q0;
                jVar.getClass();
                jVar.setParameters(bundle);
                this.f2595U0 = M10;
            }
        }
        return true;
    }

    public final void r0() {
        B2.k kVar = this.f2585K0;
        kVar.getClass();
        AbstractC6267b g10 = kVar.g();
        if (g10 instanceof B2.z) {
            try {
                MediaCrypto mediaCrypto = this.f2586L0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((B2.z) g10).f1827b);
            } catch (MediaCryptoException e10) {
                throw e(6006, this.f2579H0, e10, false);
            }
        }
        l0(this.f2585K0);
        this.f2619u1 = 0;
        this.f2620v1 = 0;
    }

    public final void s0(long j6) {
        C5065s c5065s;
        C5065s c5065s2 = (C5065s) this.f2580H1.f2563d.e(j6);
        if (c5065s2 == null && this.f2584J1 && this.f2593S0 != null) {
            j.j jVar = this.f2580H1.f2563d;
            synchronized (jVar) {
                if (jVar.f35818Z == 0) {
                    c5065s = null;
                } else {
                    c5065s = jVar.f();
                }
            }
            c5065s2 = c5065s;
        }
        if (c5065s2 != null) {
            this.f2581I0 = c5065s2;
        } else if (!this.f2594T0 || this.f2581I0 == null) {
            return;
        }
        C5065s c5065s3 = this.f2581I0;
        c5065s3.getClass();
        Y(c5065s3, this.f2593S0);
        this.f2594T0 = false;
        this.f2584J1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r7 >= r5) goto L13;
     */
    @Override // y2.AbstractC6519f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(C5065s[] c5065sArr, long j6, long j10) {
        if (this.f2580H1.f2562c == -9223372036854775807L) {
            m0(new p(-9223372036854775807L, j6, j10));
            return;
        }
        ArrayDeque arrayDeque = this.f2575F0;
        if (arrayDeque.isEmpty()) {
            long j11 = this.f2628z1;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f2582I1;
                if (j12 != -9223372036854775807L) {
                }
            }
            m0(new p(-9223372036854775807L, j6, j10));
            if (this.f2580H1.f2562c != -9223372036854775807L) {
                b0();
                return;
            }
            return;
        }
        arrayDeque.add(new p(this.f2628z1, j6, j10));
    }

    @Override // y2.AbstractC6519f
    public void v(long j6, long j10) {
        boolean z10 = false;
        if (this.f2574E1) {
            this.f2574E1 = false;
            e0();
        }
        C6527n c6527n = this.f2576F1;
        if (c6527n == null) {
            try {
                if (this.f2570C1) {
                    i0();
                    return;
                } else if (this.f2579H0 == null && !g0(2)) {
                    return;
                } else {
                    S();
                    if (this.f2614p1) {
                        AbstractC5260f.g("bypassRender");
                        while (B(j6, j10)) {
                        }
                        AbstractC5260f.q();
                    } else if (this.f2591Q0 != null) {
                        this.f50569l0.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        AbstractC5260f.g("drainAndFeed");
                        while (G(j6, j10)) {
                            long j11 = this.f2588N0;
                            if (j11 != -9223372036854775807L) {
                                this.f50569l0.getClass();
                                if (SystemClock.elapsedRealtime() - elapsedRealtime >= j11) {
                                    break;
                                }
                            }
                        }
                        while (H()) {
                            long j12 = this.f2588N0;
                            if (j12 != -9223372036854775807L) {
                                this.f50569l0.getClass();
                                if (SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                                    break;
                                }
                            }
                        }
                        AbstractC5260f.q();
                    } else {
                        C6520g c6520g = this.f2578G1;
                        int i10 = c6520g.f50592d;
                        Y y10 = this.f50571n0;
                        y10.getClass();
                        c6520g.f50592d = i10 + y10.o(j6 - this.f50573p0);
                        g0(1);
                    }
                    synchronized (this.f2578G1) {
                    }
                    return;
                }
            } catch (IllegalStateException e10) {
                int i11 = AbstractC5530A.f45131a;
                if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e10;
                    }
                }
                U(e10);
                if (i11 >= 21 && (e10 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e10).isRecoverable()) {
                    z10 = true;
                }
                if (z10) {
                    h0();
                }
                throw e(4003, this.f2579H0, D(e10, this.f2598X0), z10);
            }
        }
        this.f2576F1 = null;
        throw c6527n;
    }

    @Override // y2.AbstractC6519f
    public void y(float f6, float f10) {
        this.f2589O0 = f6;
        this.f2590P0 = f10;
        q0(this.f2592R0);
    }

    @Override // y2.AbstractC6519f
    public final int z(C5065s c5065s) {
        try {
            return p0(this.f2623x0, c5065s);
        } catch (v e10) {
            throw f(e10, c5065s);
        }
    }

    public void Z() {
    }

    public void i0() {
    }

    public void c0(x2.h hVar) {
    }

    public void d0(C5065s c5065s) {
    }
}
