package G9;

import Qg.AbstractC1206i;
import Qg.F0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import e9.C2814g;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import oa.C4972C;
import sa.C5599e;
import wa.C6151c;

/* loaded from: classes2.dex */
public final class w implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f6171a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f6172b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f6173c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f6174d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f6175e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f6176f;

    public w(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f6171a = c2398d;
        this.f6172b = abstractC2400f;
        this.f6173c = abstractC2400f2;
        this.f6174d = abstractC2400f3;
        this.f6175e = abstractC2400f4;
        this.f6176f = abstractC2400f5;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Ad.g, java.lang.Object, G9.v, androidx.lifecycle.Y] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f6171a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f6172b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f6173c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f6174d.get();
        AbstractC3557B.b0("get(...)", obj4);
        Object obj5 = this.f6175e.get();
        AbstractC3557B.b0("get(...)", obj5);
        Object obj6 = this.f6176f.get();
        AbstractC3557B.b0("get(...)", obj6);
        F0 f02 = ((C5599e) ((J9.a) obj5)).f45484c;
        ?? gVar = new Ad.g(new q(((Z9.d) obj).f23425a, null, ((J9.b) f02.getValue()).f8894a, true, null, false, ((G) ((com.openai.experiment.t) obj6)).c(ExperimentKey.ConversationsAreReportable.INSTANCE)));
        gVar.k(a.f6100q0, f02);
        a aVar = a.f6101r0;
        C2814g c2814g = ((C6151c) ((J9.c) obj4)).f48261b;
        gVar.k(aVar, c2814g);
        Rg.o oVar = ((C4972C) ((T9.a) obj3)).f41058m;
        gVar.k(a.f6102s0, new M1.w(oVar, 5));
        M1.w wVar = new M1.w(f02, 6);
        L4.a.E0(new Ia.j(new AbstractC1206i[]{oVar, ((Ba.j) obj2).f2031c, wVar}, 10, new s(gVar, null)), AbstractC4828h.Q(gVar));
        gVar.k(a.f6103t0, c2814g);
        return gVar;
    }
}
