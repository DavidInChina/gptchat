package S8;

import Z.AbstractC1725n;
import java.util.List;

/* renamed from: S8.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373q extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ M f16356Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f16357Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f16358h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.p f16359i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f16360j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373q(M m10, B b10, int i10, wf.p pVar, List list) {
        super(3);
        this.f16356Y = m10;
        this.f16357Z = b10;
        this.f16358h0 = i10;
        this.f16359i0 = pVar;
        this.f16360j0 = list;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        int intValue = ((Number) obj).intValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue2 = ((Number) obj3).intValue();
        if ((intValue2 & 14) == 0) {
            if (((Z.r) abstractC1725n).e(intValue)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue2 |= i10;
        }
        if ((intValue2 & 91) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        N b10 = O.b(this.f16356Y, abstractC1725n);
        P4.a.c(null, new N(this.f16357Z.f16208c, b10.f16250b, b10.f16251c, b10.f16252d, b10.f16253e, b10.f16254f, b10.f16255g, b10.f16256h), R4.b.X(abstractC1725n, 845771840, new C1372p(this.f16358h0, this.f16359i0, this.f16360j0, intValue)), abstractC1725n, 384, 1);
        return jf.y.f36177a;
    }
}
