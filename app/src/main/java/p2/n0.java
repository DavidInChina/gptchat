package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class n0 implements AbstractC5057j {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42197k0 = Integer.toString(0, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42198l0 = Integer.toString(1, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42199m0 = Integer.toString(3, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42200n0 = Integer.toString(4, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42201Y;

    /* renamed from: Z  reason: collision with root package name */
    public final h0 f42202Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f42203h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f42204i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean[] f42205j0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public n0(h0 h0Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = h0Var.f42072Y;
        this.f42201Y = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        this.f42202Z = h0Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f42203h0 = z12;
        this.f42204i0 = (int[]) iArr.clone();
        this.f42205j0 = (boolean[]) zArr.clone();
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f42197k0, this.f42202Z.a());
        bundle.putIntArray(f42198l0, this.f42204i0);
        bundle.putBooleanArray(f42199m0, this.f42205j0);
        bundle.putBoolean(f42200n0, this.f42203h0);
        return bundle;
    }

    public final int b() {
        return this.f42202Z.f42074h0;
    }

    public final boolean c() {
        for (boolean z10 : this.f42205j0) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f42203h0 == n0Var.f42203h0 && this.f42202Z.equals(n0Var.f42202Z) && Arrays.equals(this.f42204i0, n0Var.f42204i0) && Arrays.equals(this.f42205j0, n0Var.f42205j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f42204i0);
        return Arrays.hashCode(this.f42205j0) + ((hashCode + (((this.f42202Z.hashCode() * 31) + (this.f42203h0 ? 1 : 0)) * 31)) * 31);
    }
}
