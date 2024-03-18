package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import k6.AbstractC4194d;

/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2025j implements Iterable, Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2026k f25066Z = new C2026k(B.f24960b);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2023h f25067h0;

    /* renamed from: Y  reason: collision with root package name */
    public int f25068Y;

    static {
        C2023h c2023h;
        if (AbstractC2015d.a()) {
            c2023h = new C2023h(1, 0);
        } else {
            c2023h = new C2023h(0, 0);
        }
        f25067h0 = c2023h;
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

    public static C2026k s(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        int i12 = i10 + i11;
        r(i10, i12, bArr.length);
        switch (f25067h0.f25052a) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                break;
        }
        return new C2026k(bArr2);
    }

    public abstract byte I(int i10);

    /* renamed from: M */
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract byte f(int i10);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2019f(this);
    }

    public abstract int size();

    /* renamed from: y */
    public final int hashCode() {
        int i10 = this.f25068Y;
        if (i10 == 0) {
            int size = size();
            C2026k c2026k = (C2026k) this;
            int T = c2026k.T();
            int i11 = size;
            for (int i12 = T; i12 < T + size; i12++) {
                i11 = (i11 * 31) + c2026k.f25069i0[i12];
            }
            if (i11 == 0) {
                i10 = 1;
            } else {
                i10 = i11;
            }
            this.f25068Y = i10;
        }
        return i10;
    }
}
