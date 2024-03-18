package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import k6.AbstractC4194d;

/* renamed from: com.google.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2534q implements Iterable, Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2532p f27581Z = new C2532p(AbstractC2536r0.f27585b);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2523m f27582h0;

    /* renamed from: Y  reason: collision with root package name */
    public int f27583Y;

    static {
        C2523m c2523m;
        if (AbstractC2499e.a()) {
            c2523m = new C2523m(1, 0);
        } else {
            c2523m = new C2523m(0, 0);
        }
        f27582h0 = c2523m;
    }

    public static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(AbstractC2469q0.i("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(AbstractC2469q0.i("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(AbstractC4194d.v("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static C2532p s(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        int i12 = i10 + i11;
        r(i10, i12, bArr.length);
        switch (f27582h0.f27569Y) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                break;
        }
        return new C2532p(bArr2);
    }

    public static C2532p y(String str) {
        return new C2532p(str.getBytes(AbstractC2536r0.f27584a));
    }

    public abstract void I(int i10, byte[] bArr);

    public abstract byte M(int i10);

    public abstract boolean T();

    public abstract AbstractC2543v U();

    public abstract int V(int i10, int i11);

    public abstract byte f(int i10);

    public final int hashCode() {
        int i10 = this.f27583Y;
        if (i10 == 0) {
            int size = size();
            i10 = V(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f27583Y = i10;
        }
        return i10;
    }

    public abstract AbstractC2534q i0(int i10);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2517k(this);
    }

    public abstract String m0(Charset charset);

    public final String q0() {
        Charset charset = AbstractC2536r0.f27584a;
        if (size() == 0) {
            return "";
        }
        return m0(charset);
    }

    public abstract void r0(AbstractC2508h abstractC2508h);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = AbstractC2508h.P(this);
        } else {
            str = AbstractC2508h.P(i0(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return R.a.t(sb2, str, "\">");
    }
}
