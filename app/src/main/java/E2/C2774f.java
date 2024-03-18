package e2;

import Z.AbstractC1725n;
import r9.y;

/* renamed from: e2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2774f extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28762Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X1.m f28763Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f28764h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f28765i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f28766j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f28767k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f28768l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2774f(X1.m mVar, int i10, int i11, wf.o oVar, int i12, int i13, int i14) {
        super(2);
        this.f28762Y = i14;
        this.f28763Z = mVar;
        this.f28764h0 = i10;
        this.f28765i0 = i11;
        this.f28766j0 = oVar;
        this.f28767k0 = i12;
        this.f28768l0 = i13;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28762Y;
        int i12 = this.f28767k0;
        switch (i11) {
            case 0:
                int i13 = this.f28764h0;
                int i14 = this.f28768l0;
                A7.b.i(this.f28763Z, i13, this.f28765i0, this.f28766j0, abstractC1725n, i12 | 1, i14);
                return;
            default:
                int i15 = this.f28764h0;
                int i16 = this.f28768l0;
                y.t(this.f28763Z, i15, this.f28765i0, this.f28766j0, abstractC1725n, i12 | 1, i16);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f28762Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
