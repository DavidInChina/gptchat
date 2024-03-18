package oa;

import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41113Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2969F f41114Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(C2969F c2969f, int i10) {
        super(1);
        this.f41113Y = i10;
        this.f41114Z = c2969f;
    }

    public final Boolean a(Qa.h hVar) {
        int i10 = this.f41113Y;
        C2969F c2969f = this.f41114Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", hVar);
                return Boolean.valueOf(AbstractC3557B.K(((C2969F) hVar.f14557d).f30008a, c2969f.f30008a));
            default:
                AbstractC3557B.c0("it", hVar);
                return Boolean.valueOf(AbstractC3557B.K(((C2969F) hVar.f14557d).f30008a, c2969f.f30008a));
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f41113Y) {
            case 0:
                return a((Qa.h) obj);
            case 1:
                return a((Qa.h) obj);
            case 2:
                hb.t tVar = (hb.t) obj;
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, true, false, null, 0L, false, true, this.f41114Z, false, 398);
            default:
                AbstractC3557B.c0("$this$setState", (sb.w) obj);
                return new sb.u(this.f41114Z, M9.c.f11726Z, false);
        }
    }
}
