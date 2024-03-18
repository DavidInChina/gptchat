package F;

import Z.C1720k0;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final C1720k0 f4849a;

    /* renamed from: b  reason: collision with root package name */
    public final C1720k0 f4850b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4851c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4852d;

    /* renamed from: e  reason: collision with root package name */
    public final G.L f4853e;

    public C(int i10, int i11) {
        this.f4849a = U3.f.h0(i10);
        this.f4850b = U3.f.h0(i11);
        this.f4853e = new G.L(i10);
    }

    public final void a(int i10, int i11) {
        if (i10 >= 0.0f) {
            this.f4849a.i(i10);
            this.f4853e.b(i10);
            this.f4850b.i(i11);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }
}
