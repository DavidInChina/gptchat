package E;

import E0.AbstractC0442a;
import E0.C0458q;

/* renamed from: E.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC0442a f3837Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f3838Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f3839h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f3840i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f3841j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f3842k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f3843l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0413b(AbstractC0442a abstractC0442a, float f6, int i10, int i11, int i12, E0.d0 d0Var, int i13) {
        super(1);
        this.f3837Y = abstractC0442a;
        this.f3838Z = f6;
        this.f3839h0 = i10;
        this.f3840i0 = i11;
        this.f3841j0 = i12;
        this.f3842k0 = d0Var;
        this.f3843l0 = i13;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        E0.c0 c0Var = (E0.c0) obj;
        boolean z10 = this.f3837Y instanceof C0458q;
        E0.d0 d0Var = this.f3842k0;
        int i11 = this.f3841j0;
        int i12 = this.f3839h0;
        float f6 = this.f3838Z;
        if (z10) {
            i10 = 0;
        } else if (!Z0.e.a(f6, Float.NaN)) {
            i10 = i12;
        } else {
            i10 = (this.f3840i0 - i11) - d0Var.f4053Y;
        }
        if (!z10) {
            i12 = 0;
        } else if (Z0.e.a(f6, Float.NaN)) {
            i12 = (this.f3843l0 - i11) - d0Var.f4054Z;
        }
        E0.c0.g(c0Var, d0Var, i10, i12);
        return jf.y.f36177a;
    }
}
