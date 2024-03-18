package kb;

import Z8.AbstractC1809m0;
import Z8.Q0;
import java.util.ArrayList;
import java.util.List;
import q0.C5251c;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37280Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x9.l f37281Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(x9.l lVar, int i10) {
        super(0);
        this.f37280Y = i10;
        this.f37281Z = lVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        x9.l lVar = this.f37281Z;
        int i10 = this.f37280Y;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                switch (i10) {
                    case 2:
                        return Boolean.valueOf(!lVar.f49677c.isEmpty());
                    default:
                        return Boolean.valueOf(!lVar.f49676b.isEmpty());
                }
            default:
                switch (i10) {
                    case 2:
                        return Boolean.valueOf(!lVar.f49677c.isEmpty());
                    default:
                        return Boolean.valueOf(!lVar.f49676b.isEmpty());
                }
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f37280Y;
        x9.l lVar = this.f37281Z;
        switch (i10) {
            case 0:
                lVar.getClass();
                AbstractC1809m0.a().b(Q0.f23269c, kf.w.f37484Y);
                j0.u uVar = lVar.f49676b;
                if (!(!uVar.isEmpty())) {
                    return;
                }
                kf.s.U1(uVar);
                lVar.f49677c.add((x9.f) kf.s.U1(lVar.f49678d));
                return;
            default:
                j0.u uVar2 = lVar.f49677c;
                if (!(!uVar2.isEmpty())) {
                    return;
                }
                x9.f fVar = (x9.f) kf.s.U1(uVar2);
                List<C5251c> list = fVar.f49654a;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (C5251c c5251c : list) {
                    long j6 = c5251c.f43623a;
                    float a5 = x9.n.a(lVar.f49682h, lVar.f49683i);
                    arrayList.add(new C5251c(R4.b.r(C5251c.d(j6) * a5, C5251c.e(j6) * a5)));
                }
                lVar.f49676b.add(x9.f.a(fVar, kf.t.M2(arrayList), 0.0f, 14));
                lVar.f49678d.add(fVar);
                return;
        }
    }
}
