package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public abstract class E implements Iterable, Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final F f26839Z = new F(Y.f26891b);

    /* renamed from: Y  reason: collision with root package name */
    public int f26840Y;

    static {
        int i10 = AbstractC2485z.f26996a;
    }

    public static int M(int i10, int i11, int i12) {
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

    public static F T(byte[] bArr, int i10, int i11) {
        M(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new F(bArr2);
    }

    public abstract int I();

    /* renamed from: f */
    public final int hashCode() {
        int i10 = this.f26840Y;
        if (i10 == 0) {
            int I10 = I();
            F f6 = (F) this;
            int i11 = I10;
            for (int i12 = 0; i12 < I10; i12++) {
                i11 = (i11 * 31) + f6.f26842h0[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f26840Y = i11;
            return i11;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new B(this);
    }

    /* renamed from: r */
    public final String toString() {
        String str;
        F f6;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int I10 = I();
        if (I() <= 50) {
            str = A7.b.X1(this);
        } else {
            F f10 = (F) this;
            int M10 = M(0, 47, f10.I());
            if (M10 == 0) {
                f6 = f26839Z;
            } else {
                f6 = new D(f10.f26842h0, M10);
            }
            str = A7.b.X1(f6).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(I10);
        sb2.append(" contents=\"");
        return R.a.t(sb2, str, "\">");
    }

    public abstract byte s(int i10);

    public abstract byte y(int i10);
}
