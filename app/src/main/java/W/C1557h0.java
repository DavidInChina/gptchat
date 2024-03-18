package W;

import E.AbstractC0434s;
import Z.AbstractC1725n;
import l0.C4323o;

/* renamed from: W.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557h0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f20108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f20109Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557h0(float f6, float f10) {
        super(2);
        this.f20108Y = f6;
        this.f20109Z = f10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC0434s.a(androidx.compose.foundation.layout.e.k(C4323o.f37719b, this.f20108Y, this.f20109Z), abstractC1725n, 0);
        return jf.y.f36177a;
    }
}
