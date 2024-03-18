package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class c0 extends Z {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f42000j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42001k0 = Integer.toString(2, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final Y f42002l0 = new Y(2);

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f42003h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f42004i0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public c0() {
        this.f42003h0 = false;
        this.f42004i0 = false;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(Z.f41957Y, 3);
        bundle.putBoolean(f42000j0, this.f42003h0);
        bundle.putBoolean(f42001k0, this.f42004i0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f42004i0 != c0Var.f42004i0 || this.f42003h0 != c0Var.f42003h0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42003h0), Boolean.valueOf(this.f42004i0)});
    }

    public c0(boolean z10) {
        this.f42003h0 = true;
        this.f42004i0 = z10;
    }
}
