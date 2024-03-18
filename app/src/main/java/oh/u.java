package oh;

import id.AbstractC3557B;
import q0.C5251c;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41464Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f41465Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(x xVar, int i10) {
        super(1);
        this.f41464Y = i10;
        this.f41465Z = xVar;
    }

    public final void a(long j6) {
        int i10 = this.f41464Y;
        x xVar = this.f41465Z;
        switch (i10) {
            case 0:
                xVar.f41476u0.invoke(new C5251c(j6));
                return;
            case 1:
                wf.k kVar = xVar.f41477v0;
                if (kVar != null) {
                    kVar.invoke(new C5251c(j6));
                    return;
                }
                return;
            case 2:
                wf.k kVar2 = xVar.f41478w0;
                if (kVar2 != null) {
                    kVar2.invoke(new C5251c(j6));
                    return;
                }
                return;
            default:
                if (xVar.f41473A0) {
                    xVar.f41479x0.invoke(new C5251c(j6));
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f41464Y) {
            case 0:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 1:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 2:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 3:
                a(((C5251c) obj).f43623a);
                return yVar;
            default:
                AbstractC5023j abstractC5023j = (AbstractC5023j) obj;
                AbstractC3557B.c0("it", abstractC5023j);
                x xVar = this.f41465Z;
                if (xVar.f41473A0) {
                    xVar.f41474B0.t(abstractC5023j);
                }
                return yVar;
        }
    }
}
