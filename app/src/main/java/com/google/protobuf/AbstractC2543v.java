package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2543v {

    /* renamed from: a  reason: collision with root package name */
    public int f27622a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27623b = 100;

    /* renamed from: c  reason: collision with root package name */
    public final int f27624c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public T0.m f27625d;

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static C2537s h(byte[] bArr, int i10, int i11, boolean z10) {
        C2537s c2537s = new C2537s(bArr, i10, i11, z10);
        try {
            c2537s.l(i11);
            return c2537s;
        } catch (C2540t0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static AbstractC2543v i(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = AbstractC2536r0.f27585b;
            return h(bArr, 0, bArr.length, false);
        }
        return new C2539t(inputStream);
    }

    public static AbstractC2543v j(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return h(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        } else if (byteBuffer.isDirect() && C1.f27386d) {
            return new C2541u(byteBuffer, z10);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return h(bArr, 0, remaining, true);
        }
    }

    public static int y(InputStream inputStream, int i10) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & 127) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw C2540t0.g();
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw C2540t0.g();
            }
        }
        throw C2540t0.d();
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i10);

    public abstract void a(int i10);

    public final void b() {
        if (this.f27622a < this.f27623b) {
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract C2532p n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract void t(int i10, L0 l02, J j6);

    public abstract int u();

    public abstract long v();

    public abstract void w(L0 l02, J j6);

    public abstract int x();

    public abstract int z();
}
