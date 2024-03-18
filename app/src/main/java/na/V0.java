package na;

import ic.C3551v;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class V0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39883Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ zd.g f39884Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(zd.g gVar, int i10) {
        super(1);
        this.f39883Y = i10;
        this.f39884Z = gVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f39883Y;
        zd.g gVar = this.f39884Z;
        switch (i10) {
            case 0:
                D1 d12 = (D1) obj;
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, gVar.f51965a, false, null, -1, 59);
            case 1:
                C3551v c3551v = (C3551v) obj;
                AbstractC3557B.c0("$this$setState", c3551v);
                return C3551v.e(c3551v, gVar.f51965a, null, 2);
            case 2:
                ic.P p10 = (ic.P) obj;
                AbstractC3557B.c0("$this$setState", p10);
                return ic.P.e(p10, gVar.f51965a, false, false, null, null, false, null, null, 254);
            default:
                AbstractC3557B.c0("it", (zd.g) obj);
                return gVar;
        }
    }
}
