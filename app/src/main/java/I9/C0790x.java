package I9;

import F.AbstractC0528b;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.C4323o;

/* renamed from: I9.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790x extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f8464Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790x(float f6) {
        super(3);
        this.f8464Y = f6;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 81) == 16) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, this.f8464Y), abstractC1725n);
        return jf.y.f36177a;
    }
}
