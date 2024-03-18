package ee;

import M3.H;
import Ng.F;
import id.AbstractC3557B;
import q0.C5251c;

/* renamed from: ee.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2890h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29312Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29313Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0.d f29314h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F f29315i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2890h(C2881B c2881b, C0.d dVar, F f6, int i10) {
        super(2);
        this.f29312Y = i10;
        this.f29313Z = c2881b;
        this.f29314h0 = dVar;
        this.f29315i0 = f6;
    }

    public final void a(B0.u uVar, float f6) {
        switch (this.f29312Y) {
            case 1:
                AbstractC3557B.c0("change", uVar);
                H.t(this.f29313Z, uVar, R4.b.r(f6, 0.0f), this.f29314h0, this.f29315i0);
                return;
            default:
                AbstractC3557B.c0("change", uVar);
                H.t(this.f29313Z, uVar, R4.b.r(0.0f, f6), this.f29314h0, this.f29315i0);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f29312Y) {
            case 0:
                B0.u uVar = (B0.u) obj;
                long j6 = ((C5251c) obj2).f43623a;
                AbstractC3557B.c0("change", uVar);
                H.t(this.f29313Z, uVar, j6, this.f29314h0, this.f29315i0);
                return yVar;
            case 1:
                a((B0.u) obj, ((Number) obj2).floatValue());
                return yVar;
            default:
                a((B0.u) obj, ((Number) obj2).floatValue());
                return yVar;
        }
    }
}
