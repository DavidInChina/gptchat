package W;

import q0.C5254f;
import t0.AbstractC5648g;
import t0.AbstractC5650i;

/* renamed from: W.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533c1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19958Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f19959Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19960h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1533c1(float f6, long j6, int i10) {
        super(1);
        this.f19958Y = i10;
        this.f19959Z = f6;
        this.f19960h0 = j6;
    }

    public final void a(AbstractC5650i abstractC5650i) {
        int i10 = this.f19958Y;
        float f6 = this.f19959Z;
        switch (i10) {
            case 0:
                float f10 = 2;
                AbstractC5648g.g(abstractC5650i, this.f19960h0, R4.b.r(0.0f, abstractC5650i.R(f6) / f10), R4.b.r(C5254f.d(abstractC5650i.g()), abstractC5650i.R(f6) / f10), abstractC5650i.R(f6), 0, 496);
                return;
            default:
                float f11 = 2;
                AbstractC5648g.g(abstractC5650i, this.f19960h0, R4.b.r(abstractC5650i.R(f6) / f11, 0.0f), R4.b.r(abstractC5650i.R(f6) / f11, C5254f.b(abstractC5650i.g())), abstractC5650i.R(f6), 0, 496);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19958Y) {
            case 0:
                a((AbstractC5650i) obj);
                return yVar;
            default:
                a((AbstractC5650i) obj);
                return yVar;
        }
    }
}
