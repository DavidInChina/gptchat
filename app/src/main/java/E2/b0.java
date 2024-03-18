package E2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p2.C5047B;
import p2.C5049b;
import p2.C5068v;
import p2.C5071y;
import p2.C5072z;

/* loaded from: classes2.dex */
public final class b0 extends p2.g0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final Object f4288o0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public final long f4289j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f4290k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f4291l0;

    /* renamed from: m0  reason: collision with root package name */
    public final p2.H f4292m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C5047B f4293n0;

    static {
        boolean z10;
        C5072z c5072z;
        C5068v c5068v = new C5068v();
        C5071y c5071y = new C5071y();
        List emptyList = Collections.emptyList();
        x8.k0 k0Var = x8.k0.f49573j0;
        p2.D d10 = p2.D.f41769i0;
        Uri uri = Uri.EMPTY;
        if (((Uri) c5071y.f42360e) != null && ((UUID) c5071y.f42359d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.n(z10);
        if (uri != null) {
            if (((UUID) c5071y.f42359d) != null) {
                c5072z = new C5072z(c5071y);
            } else {
                c5072z = null;
            }
            new p2.C(uri, null, c5072z, null, emptyList, null, k0Var, null, -9223372036854775807L);
        }
        c5068v.a();
        p2.K k10 = p2.K.f41848N0;
    }

    public b0(long j6, boolean z10, boolean z11, p2.H h10) {
        C5047B c5047b;
        if (z11) {
            c5047b = h10.f41809h0;
        } else {
            c5047b = null;
        }
        this.f4289j0 = j6;
        this.f4290k0 = j6;
        this.f4291l0 = z10;
        h10.getClass();
        this.f4292m0 = h10;
        this.f4293n0 = c5047b;
    }

    @Override // p2.g0
    public final int c(Object obj) {
        if (f4288o0.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        Object obj;
        Gi.e.m(i10, 1);
        if (z10) {
            obj = f4288o0;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        e0Var.getClass();
        e0Var.k(null, obj2, 0, this.f4289j0, 0L, C5049b.f41981l0, false);
        return e0Var;
    }

    @Override // p2.g0
    public final int j() {
        return 1;
    }

    @Override // p2.g0
    public final Object n(int i10) {
        Gi.e.m(i10, 1);
        return f4288o0;
    }

    @Override // p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        Gi.e.m(i10, 1);
        f0Var.c(p2.f0.f42041w0, this.f4292m0, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f4291l0, false, this.f4293n0, 0L, this.f4290k0, 0, 0, 0L);
        return f0Var;
    }

    @Override // p2.g0
    public final int q() {
        return 1;
    }
}
