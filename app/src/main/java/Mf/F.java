package Mf;

import id.AbstractC3557B;
import java.util.List;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class F extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12063Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.i f12064Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(U3.i iVar, int i10) {
        super(1);
        this.f12063Y = i10;
        this.f12064Z = iVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC0999h abstractC0999h;
        int i10;
        int i11 = this.f12063Y;
        U3.i iVar = this.f12064Z;
        switch (i11) {
            case 0:
                D d10 = (D) obj;
                AbstractC3557B.c0("<name for destructuring parameter 0>", d10);
                C4290b c4290b = d10.f12058a;
                if (!c4290b.f37495c) {
                    C4290b f6 = c4290b.f();
                    List list = d10.f12059b;
                    if (f6 != null) {
                        abstractC0999h = iVar.x(f6, kf.t.Z1(list, 1));
                    } else {
                        C4291c g10 = c4290b.g();
                        AbstractC3557B.b0("getPackageFqName(...)", g10);
                        abstractC0999h = (AbstractC0999h) ((Ag.n) ((Ag.r) iVar.f17416h0)).invoke(g10);
                    }
                    AbstractC0999h abstractC0999h2 = abstractC0999h;
                    boolean z10 = !c4290b.f37494b.e().d();
                    Ag.u uVar = (Ag.u) iVar.f17414Y;
                    C4294f i12 = c4290b.i();
                    AbstractC3557B.b0("getShortClassName(...)", i12);
                    Integer num = (Integer) kf.t.h2(list);
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = 0;
                    }
                    return new E(uVar, abstractC0999h2, i12, z10, i10);
                }
                throw new UnsupportedOperationException("Unresolved local class: " + c4290b);
            default:
                C4291c c4291c = (C4291c) obj;
                AbstractC3557B.c0("fqName", c4291c);
                return new Lf.l((B) iVar.f17415Z, c4291c, 1);
        }
    }
}
