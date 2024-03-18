package ii;

import Df.H;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import ji.AbstractC4127b;
import ji.AbstractC4136k;
import ji.C4117F;
import ji.C4133h;
import ji.C4135j;
import ji.C4138m;

/* renamed from: ii.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3595j implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f33313Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4136k f33314Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Random f33315h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f33316i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f33317j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f33318k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C4135j f33319l0 = new Object();

    /* renamed from: m0  reason: collision with root package name */
    public final C4135j f33320m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f33321n0;

    /* renamed from: o0  reason: collision with root package name */
    public C3586a f33322o0;

    /* renamed from: p0  reason: collision with root package name */
    public final byte[] f33323p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C4133h f33324q0;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ji.j] */
    public C3595j(boolean z10, AbstractC4136k abstractC4136k, Random random, boolean z11, boolean z12, long j6) {
        byte[] bArr;
        AbstractC3557B.c0("sink", abstractC4136k);
        AbstractC3557B.c0("random", random);
        this.f33313Y = z10;
        this.f33314Z = abstractC4136k;
        this.f33315h0 = random;
        this.f33316i0 = z11;
        this.f33317j0 = z12;
        this.f33318k0 = j6;
        this.f33320m0 = abstractC4136k.d();
        C4133h c4133h = null;
        if (z10) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f33323p0 = bArr;
        this.f33324q0 = z10 ? new C4133h() : c4133h;
    }

    public final void a(int i10, C4138m c4138m) {
        if (!this.f33321n0) {
            int d10 = c4138m.d();
            if (d10 <= 125) {
                C4135j c4135j = this.f33320m0;
                c4135j.w0(i10 | 128);
                if (this.f33313Y) {
                    c4135j.w0(d10 | 128);
                    byte[] bArr = this.f33323p0;
                    AbstractC3557B.Z(bArr);
                    this.f33315h0.nextBytes(bArr);
                    c4135j.m0(bArr);
                    if (d10 > 0) {
                        long j6 = c4135j.f36721Z;
                        c4135j.f0(c4138m);
                        C4133h c4133h = this.f33324q0;
                        AbstractC3557B.Z(c4133h);
                        c4135j.F(c4133h);
                        c4133h.h(j6);
                        H.B0(c4133h, bArr);
                        c4133h.close();
                    }
                } else {
                    c4135j.w0(d10);
                    c4135j.f0(c4138m);
                }
                this.f33314Z.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3586a c3586a = this.f33322o0;
        if (c3586a != null) {
            c3586a.close();
        }
    }

    public final void h(int i10, C4138m c4138m) {
        C4138m c4138m2;
        C4133h F10;
        AbstractC3557B.c0("data", c4138m);
        if (!this.f33321n0) {
            C4135j c4135j = this.f33319l0;
            c4135j.f0(c4138m);
            int i11 = i10 | 128;
            int i12 = 0;
            if (this.f33316i0 && c4138m.d() >= this.f33318k0) {
                C3586a c3586a = this.f33322o0;
                if (c3586a == null) {
                    c3586a = new C3586a(0, this.f33317j0);
                    this.f33322o0 = c3586a;
                }
                C4135j c4135j2 = c3586a.f33256h0;
                if (c4135j2.f36721Z == 0) {
                    if (c3586a.f33255Z) {
                        ((Deflater) c3586a.f33257i0).reset();
                    }
                    ci.f fVar = (ci.f) c3586a.f33258j0;
                    fVar.o(c4135j, c4135j.f36721Z);
                    fVar.flush();
                    if (c4135j2.r(c4135j2.f36721Z - c4138m2.f36723Y.length, AbstractC3587b.f33259a)) {
                        try {
                            c4135j2.F(AbstractC4127b.f36696a).a(c4135j2.f36721Z - 4);
                            th = null;
                        } finally {
                        }
                    } else {
                        c4135j2.w0(0);
                    }
                    c4135j.o(c4135j2, c4135j2.f36721Z);
                    i11 = i10 | 192;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            long j6 = c4135j.f36721Z;
            C4135j c4135j3 = this.f33320m0;
            c4135j3.w0(i11);
            boolean z10 = this.f33313Y;
            if (z10) {
                i12 = 128;
            }
            if (j6 <= 125) {
                c4135j3.w0(((int) j6) | i12);
            } else if (j6 <= 65535) {
                c4135j3.w0(i12 | 126);
                c4135j3.P0((int) j6);
            } else {
                c4135j3.w0(i12 | 127);
                C4117F d02 = c4135j3.d0(8);
                int i13 = d02.f36676c;
                byte[] bArr = d02.f36674a;
                bArr[i13] = (byte) ((j6 >>> 56) & 255);
                bArr[i13 + 1] = (byte) ((j6 >>> 48) & 255);
                bArr[i13 + 2] = (byte) ((j6 >>> 40) & 255);
                bArr[i13 + 3] = (byte) ((j6 >>> 32) & 255);
                bArr[i13 + 4] = (byte) ((j6 >>> 24) & 255);
                bArr[i13 + 5] = (byte) ((j6 >>> 16) & 255);
                bArr[i13 + 6] = (byte) ((j6 >>> 8) & 255);
                bArr[i13 + 7] = (byte) (j6 & 255);
                d02.f36676c = i13 + 8;
                c4135j3.f36721Z += 8;
            }
            if (z10) {
                byte[] bArr2 = this.f33323p0;
                AbstractC3557B.Z(bArr2);
                this.f33315h0.nextBytes(bArr2);
                c4135j3.m0(bArr2);
                if (j6 > 0) {
                    C4133h c4133h = this.f33324q0;
                    AbstractC3557B.Z(c4133h);
                    c4135j.F(c4133h);
                    c4133h.h(0L);
                    H.B0(c4133h, bArr2);
                    c4133h.close();
                }
            }
            c4135j3.o(c4135j, j6);
            this.f33314Z.u();
            return;
        }
        throw new IOException("closed");
    }
}
