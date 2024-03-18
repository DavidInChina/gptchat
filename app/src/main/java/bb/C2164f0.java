package bb;

import E.AbstractC0434s;
import Z.AbstractC1725n;
import l0.C4323o;

/* renamed from: bb.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2164f0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f25818Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164f0(float f6) {
        super(2);
        this.f25818Y = f6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC0434s.a(Bi.c.I1(androidx.compose.foundation.layout.e.j(c4323o, this.f25818Y), true, false), abstractC1725n, 0);
        return jf.y.f36177a;
    }
}
