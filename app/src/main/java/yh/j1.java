package yh;

import yh.l1;

/* loaded from: classes2.dex */
public enum j1 implements k1 {
    SUPER_CLASS(false, false, false, false),
    INTERFACE(false, false, false, false),
    TYPE_VARIABLE(false, false, true, false),
    FIELD(true, true, true, false),
    METHOD_RETURN(true, true, true, true),
    METHOD_PARAMETER(true, true, true, false),
    EXCEPTION(false, false, true, false),
    RECEIVER(false, false, false, false);
    

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f51029Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f51030Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f51031h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f51032i0;

    j1(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f51029Y = z10;
        this.f51030Z = z11;
        this.f51031h0 = z12;
        this.f51032i0 = z13;
    }

    public Object a(l1.a aVar) {
        return Boolean.valueOf(this.f51029Y);
    }

    public /* bridge */ /* synthetic */ Object d(l1.a aVar) {
        return Boolean.FALSE;
    }

    /* renamed from: f */
    public Boolean b(l1.a aVar) {
        boolean z10;
        if ((!this.f51029Y && aVar.T0()) || ((!this.f51030Z && aVar.a1()) || (!this.f51032i0 && aVar.H(Void.TYPE)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: g */
    public Boolean c(l1.a aVar) {
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public Boolean e(l1.a aVar) {
        return Boolean.valueOf(this.f51031h0);
    }
}
