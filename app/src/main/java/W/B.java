package W;

import Z.AbstractC1739u0;
import Z.AbstractC1743w0;
import Z.C1741v0;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f18985Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f18986h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, int i10, Object obj2) {
        super(0);
        this.f18984Y = i10;
        this.f18985Z = obj;
        this.f18986h0 = obj2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        switch (this.f18984Y) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                C1550f3 c1550f3 = (C1550f3) this.f18985Z;
                if (((Boolean) c1550f3.f20062c.f18994c.invoke(EnumC1555g3.f20080h0)).booleanValue()) {
                    Ad.l.O0((Ng.F) this.f18986h0, null, null, new Z1(c1550f3, null), 3);
                }
                return Boolean.TRUE;
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        C1741v0 c1741v0;
        AbstractC1743w0 abstractC1743w0;
        int i10 = this.f18984Y;
        Object obj = this.f18986h0;
        Object obj2 = this.f18985Z;
        switch (i10) {
            case 0:
                C c10 = (C) obj2;
                C1645z c1645z = c10.f19004m;
                float c11 = c10.d().c(obj);
                if (!Float.isNaN(c11)) {
                    C c12 = c1645z.f20634a;
                    c12.f19000i.i(c11);
                    c12.f19001j.i(0.0f);
                    c10.i(null);
                }
                c10.h(obj);
                return;
            case 1:
                ((C1550f3) obj2).f20063d = (Z0.b) obj;
                return;
            default:
                C1585m3 c1585m3 = (C1585m3) obj2;
                C1578l1 c1578l1 = (C1578l1) obj;
                if (AbstractC3557B.K(c1585m3, c1578l1.f20207a)) {
                    return;
                }
                kf.s.R1(new C1565i3(c1585m3, 1), c1578l1.f20208b);
                AbstractC1739u0 abstractC1739u0 = c1578l1.f20209c;
                if (abstractC1739u0 == null || (abstractC1743w0 = (c1741v0 = (C1741v0) abstractC1739u0).f22737b) == null) {
                    return;
                }
                abstractC1743w0.c(c1741v0, null);
                return;
        }
    }
}
