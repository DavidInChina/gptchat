package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import k6.AbstractC4194d;

/* renamed from: androidx.glance.appwidget.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2049i implements Iterable, Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2050j f25223Z = new C2050j(A.f25145b);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2047g f25224h0;

    /* renamed from: Y  reason: collision with root package name */
    public int f25225Y;

    static {
        C2047g c2047g;
        if (AbstractC2044d.a()) {
            c2047g = new C2047g(1, 0);
        } else {
            c2047g = new C2047g(0, 0);
        }
        f25224h0 = c2047g;
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

    public static C2050j s(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        int i12 = i10 + i11;
        r(i10, i12, bArr.length);
        switch (f25224h0.f25219a) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                break;
        }
        return new C2050j(bArr2);
    }

    public abstract byte I(int i10);

    /* renamed from: M */
    public final String toString() {
        String str;
        C2050j c2050j;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = Df.H.F(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C2050j c2050j2 = (C2050j) this;
            int r10 = r(0, 47, c2050j2.size());
            if (r10 == 0) {
                c2050j = f25223Z;
            } else {
                c2050j = new C2048h(c2050j2.f25226i0, c2050j2.T(), r10);
            }
            sb2.append(Df.H.F(c2050j));
            sb2.append("...");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return R.a.t(sb3, str, "\">");
    }

    public abstract byte f(int i10);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2045e(this);
    }

    public abstract int size();

    /* renamed from: y */
    public final int hashCode() {
        int i10 = this.f25225Y;
        if (i10 == 0) {
            int size = size();
            C2050j c2050j = (C2050j) this;
            int T = c2050j.T();
            int i11 = size;
            for (int i12 = T; i12 < T + size; i12++) {
                i11 = (i11 * 31) + c2050j.f25226i0[i12];
            }
            if (i11 == 0) {
                i10 = 1;
            } else {
                i10 = i11;
            }
            this.f25225Y = i10;
        }
        return i10;
    }
}
