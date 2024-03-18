package S8;

import Z.AbstractC1725n;
import id.AbstractC3557B;

/* renamed from: S8.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378w extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1378w f16388Z = new C1378w(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1378w f16389h0 = new C1378w(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C1378w f16390i0 = new C1378w(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16391Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1378w(int i10) {
        super(2);
        this.f16391Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16391Y) {
            case 0:
                int intValue = ((Number) obj).intValue();
                N0.E e10 = (N0.E) obj2;
                AbstractC3557B.c0("textStyle", e10);
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    if (intValue == 5) {
                                        return new N0.E(r0.r.b(e10.c(), 0.5f), 0L, S0.D.f15974m0, null, null, 16777210);
                                    }
                                    return e10;
                                }
                                return new N0.E(r0.r.b(e10.c(), 0.7f), M3.H.V(18), S0.D.f15974m0, null, null, 16777208);
                            }
                            return new N0.E(0L, M3.H.V(20), S0.D.f15974m0, new S0.z(1), null, 16777201);
                        }
                        return new N0.E(r0.r.b(e10.c(), 0.7f), M3.H.V(22), S0.D.f15974m0, null, null, 16777208);
                    }
                    return new N0.E(0L, M3.H.V(26), S0.D.f15974m0, null, null, 16777209);
                }
                return new N0.E(0L, M3.H.V(36), S0.D.f15974m0, null, null, 16777209);
            case 1:
                ((Number) obj2).intValue();
                Z.r rVar = (Z.r) ((AbstractC1725n) obj);
                rVar.W(-333154667);
                N0.E e11 = (N0.E) rVar.m(L.f16245a);
                rVar.t(false);
                return e11;
            default:
                ((Number) obj2).intValue();
                Z.r rVar2 = (Z.r) ((AbstractC1725n) obj);
                rVar2.W(1457540156);
                long j6 = ((r0.r) rVar2.m(L.f16246b)).f44265a;
                rVar2.t(false);
                return new r0.r(j6);
        }
    }
}
