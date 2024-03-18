package gb;

import Z.AbstractC1725n;
import id.AbstractC3557B;
import jf.C3959i;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import ub.AbstractC5875D;
import ud.AbstractC5903b;
import v0.C5953f;
import y.C6480s;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31355Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f31356Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, boolean z10) {
        super(4);
        this.f31355Y = i10;
        this.f31356Z = z10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z10;
        C4323o c4323o = C4323o.f37719b;
        int i10 = this.f31355Y;
        boolean z11 = this.f31356Z;
        boolean z12 = true;
        switch (i10) {
            case 0:
                R8.s sVar = (R8.s) obj;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("node", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.o) obj2);
                AbstractC4326r a5 = io.sentry.compose.b.a("MessageMarkdownContent");
                Z.r rVar = (Z.r) ((AbstractC1725n) obj3);
                rVar.W(14431645);
                if (z11 && sVar.f15165b.f15170e == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                U3.f fVar = sVar.f15164a;
                if (fVar instanceof R8.h) {
                    R8.h hVar = (R8.h) fVar;
                    boolean f22 = Lg.n.f2(hVar.f15149j, "latex");
                    String str = hVar.f15150k;
                    if (f22) {
                        rVar.W(-594625920);
                        L4.a.r(str, z10, rVar, 0);
                        rVar.t(false);
                    } else {
                        rVar.W(-594625521);
                        AbstractC5903b.a(hVar.f15149j, Lg.n.U2(str).toString(), z10, a5, rVar, 0, 8);
                        rVar.t(false);
                    }
                } else {
                    z12 = false;
                }
                rVar.t(false);
                return Boolean.valueOf(z12);
            default:
                C3959i c3959i = (C3959i) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$AnimatedContent", (C6480s) obj);
                AbstractC3557B.c0("icons", c3959i);
                AbstractC4326r a10 = io.sentry.compose.b.a("ToolStatusCardInternal");
                C5953f c5953f = (C5953f) c3959i.f36155Y;
                z4.o oVar = (z4.o) c3959i.f36156Z;
                if (c5953f != null) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(744263277);
                    AbstractC5875D.c(c5953f, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), rVar2, 0, 0);
                    rVar2.t(false);
                } else if (oVar != null) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(744263520);
                    K8.d.L(oVar, AbstractC4194d.a((G0.X) a10, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b)), !z11, null, null, rVar3, 0, 24);
                    rVar3.t(false);
                } else {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    rVar4.W(744263758);
                    rVar4.t(false);
                }
                return jf.y.f36177a;
        }
    }
}
