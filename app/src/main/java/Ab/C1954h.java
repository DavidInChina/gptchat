package ab;

import id.AbstractC3557B;
import m.AbstractActivityC4532l;

/* renamed from: ab.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24100Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f24101Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f24102h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1954h(Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, int i10) {
        super(1);
        this.f24100Y = i10;
        this.f24101Z = fVar;
        this.f24102h0 = abstractActivityC4532l;
    }

    public final void a(AbstractC1960n abstractC1960n) {
        int i10 = this.f24100Y;
        AbstractActivityC4532l abstractActivityC4532l = this.f24102h0;
        Tc.f fVar = this.f24101Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("effect", abstractC1960n);
                if (abstractC1960n instanceof C1959m) {
                    Tc.f.c(fVar, A7.b.G1(((C1959m) abstractC1960n).f24117a, fVar.f17059d, fVar.f17056a), 0, 14);
                    return;
                } else if (abstractC1960n instanceof C1958l) {
                    K8.d.O0(abstractActivityC4532l, fVar, ((C1958l) abstractC1960n).f24116a);
                    return;
                } else {
                    return;
                }
            default:
                AbstractC3557B.c0("effect", abstractC1960n);
                if (abstractC1960n instanceof C1959m) {
                    Tc.f.c(fVar, A7.b.G1(((C1959m) abstractC1960n).f24117a, fVar.f17059d, fVar.f17056a), 0, 14);
                    return;
                } else if (abstractC1960n instanceof C1958l) {
                    K8.d.O0(abstractActivityC4532l, fVar, ((C1958l) abstractC1960n).f24116a);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f24100Y) {
            case 0:
                a((AbstractC1960n) obj);
                return yVar;
            default:
                a((AbstractC1960n) obj);
                return yVar;
        }
    }
}
