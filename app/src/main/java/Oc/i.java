package oc;

import id.AbstractC3557B;
import ja.C3931c;
import nc.s;
import nc.z;
import wd.K0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final i f41266Z = new i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final i f41267h0 = new i(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final i f41268i0 = new i(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final i f41269j0 = new i(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41270Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f41270Y = i10;
    }

    public final s a(s sVar) {
        switch (this.f41270Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", sVar);
                return s.e(sVar, null, null, false, null, null, null, null, false, null, true, 511);
            case 1:
                AbstractC3557B.c0("$this$setState", sVar);
                return s.e(sVar, null, null, false, null, null, null, null, false, null, false, 511);
            default:
                AbstractC3557B.c0("$this$setState", sVar);
                C3931c c3931c = null;
                if (sVar.f40255g == null) {
                    C3931c.Companion.getClass();
                    K0 k02 = sVar.f40253e;
                    if (k02 != null) {
                        c3931c = new C3931c(k02.f48354c, false, false, k02.f48355d, false, 18);
                    }
                }
                return s.e(sVar, null, null, false, null, null, null, c3931c, false, null, false, 959);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f41270Y) {
            case 0:
                return a((s) obj);
            case 1:
                return a((s) obj);
            case 2:
                return a((s) obj);
            default:
                z zVar = (z) obj;
                AbstractC3557B.c0("$this$setState", zVar);
                return z.e(zVar, null, null, null, false, null, null, null, null, 1022);
        }
    }
}
