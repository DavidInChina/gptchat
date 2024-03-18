package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* renamed from: p2.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5066t extends Z {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f42329j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42330k0 = Integer.toString(2, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final A9.a f42331l0 = new A9.a(14);

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f42332h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f42333i0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5066t() {
        this.f42332h0 = false;
        this.f42333i0 = false;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(Z.f41957Y, 0);
        bundle.putBoolean(f42329j0, this.f42332h0);
        bundle.putBoolean(f42330k0, this.f42333i0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5066t)) {
            return false;
        }
        C5066t c5066t = (C5066t) obj;
        if (this.f42333i0 != c5066t.f42333i0 || this.f42332h0 != c5066t.f42332h0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42332h0), Boolean.valueOf(this.f42333i0)});
    }

    public C5066t(boolean z10) {
        this.f42332h0 = true;
        this.f42333i0 = z10;
    }
}
