package mb;

import id.AbstractC3557B;

/* renamed from: mb.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4580E extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39022Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ hb.l f39023Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4580E(hb.l lVar, int i10) {
        super(1);
        this.f39022Y = i10;
        this.f39023Z = lVar;
    }

    public final hb.t a(hb.t tVar) {
        int i10 = this.f39022Y;
        hb.l lVar = this.f39023Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, null, 0L, false, false, null, ((hb.h) lVar).f32107a, 255);
            default:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, ((hb.f) lVar).f32105a, null, 0L, false, false, null, false, 509);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f39022Y) {
            case 0:
                return a((hb.t) obj);
            default:
                return a((hb.t) obj);
        }
    }
}
