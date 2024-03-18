package ta;

import Qg.C1209l;
import Qg.F0;
import Uc.C1422g;
import Uc.EnumC1421f;
import Z8.AbstractC1809m0;
import Z8.W0;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.net.Uri;
import com.openai.experiment.ExperimentKey;
import gb.C3234k;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import kb.C4211E;
import l8.AbstractC4344b;
import nd.C4812a;
import nf.AbstractC4828h;
import sa.C5599e;
import ua.C5870a;
import wa.C6151c;
import wd.AbstractC6211y;
import wd.C6174I;
import wd.C6205s;
import y.C6473k;
import za.AbstractC6782A;
import za.AbstractC6806w;
import za.C6783B;
import za.C6795l;
import za.C6796m;
import za.C6797n;
import za.C6798o;
import za.C6799p;
import za.C6800q;
import za.C6801r;
import za.C6802s;
import za.C6803t;
import za.C6804u;
import za.C6805v;
import za.C6808y;
import za.EnumC6785b;

/* loaded from: classes2.dex */
public final class X extends AbstractC6782A {

    /* renamed from: j  reason: collision with root package name */
    public final Ic.c f45863j;

    /* renamed from: k  reason: collision with root package name */
    public final C6808y f45864k;

    /* renamed from: l  reason: collision with root package name */
    public final xd.h f45865l;

    /* renamed from: m  reason: collision with root package name */
    public final Aa.j f45866m;

    /* renamed from: n  reason: collision with root package name */
    public final C4211E f45867n;

    /* renamed from: o  reason: collision with root package name */
    public final Z9.d f45868o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X(J9.c cVar, J9.a aVar, com.openai.experiment.r rVar, C5715n c5715n, T9.a aVar2, C4812a c4812a, Ic.c cVar2, C6808y c6808y, xd.h hVar, Va.e eVar, com.openai.experiment.t tVar, androidx.lifecycle.P p10, Aa.j jVar, C4211E c4211e, Z9.d dVar, Ea.c cVar3) {
        super(new C6783B(r7, r8, r9, null, r11, r17, r13, null, r17, r17, r17, null, r19, r20, r21, r22, r23));
        int a5 = ((com.openai.experiment.G) rVar).a(com.openai.experiment.j.f27688c);
        com.openai.experiment.G g10 = (com.openai.experiment.G) tVar;
        boolean c10 = g10.c(ExperimentKey.VisionEnabled.INSTANCE);
        boolean c11 = g10.c(ExperimentKey.FileUploadEnabled.INSTANCE);
        boolean c12 = g10.c(ExperimentKey.EditImageEnabled.INSTANCE);
        boolean c13 = g10.c(ExperimentKey.AtMentionGizmo.INSTANCE);
        boolean c14 = g10.c(ExperimentKey.GizmoCommandsEnabled.INSTANCE);
        T0.z zVar = new T0.z("", 0L, 6);
        J9.d dVar2 = new J9.d(null, null, null);
        J9.b bVar = new J9.b();
        kf.w wVar = kf.w.f37484Y;
        kf.v vVar = kf.v.f37483Y;
        this.f45863j = cVar2;
        this.f45864k = c6808y;
        this.f45865l = hVar;
        this.f45866m = jVar;
        this.f45867n = c4211e;
        this.f45868o = dVar;
        a(cVar2);
        C1422g c1422g = C1422g.f17674i;
        EnumC1421f o12 = C1422g.o1(p10);
        EnumC1421f enumC1421f = EnumC1421f.f17669Z;
        C6205s c6205s = c4812a.f40275b;
        if (o12 == enumC1421f) {
            if (AbstractC3557B.K(c6205s.c(), "plus")) {
                h(new C5695K(this, EnumC6785b.f51780Y, null));
            } else {
                g(new Ad.p(Uc.Q.f17626i.o1(true)));
            }
        }
        if (C1422g.o1(p10) == EnumC1421f.f17670h0) {
            if (AbstractC3557B.K(c6205s.c(), "plus")) {
                h(new C5695K(this, EnumC6785b.f51781Z, null));
            } else {
                g(new Ad.p(Uc.Q.f17626i.o1(true)));
            }
        }
        k(C5703b.f45898r0, ((C6151c) cVar).f48261b);
        k(C5703b.f45899s0, ((C5599e) aVar).f45484c);
        k(C5703b.f45900t0, ((Ya.r) eVar).f22204c);
        String str = (String) p10.b(SDPKeywords.PROMPT);
        xa.u uVar = (xa.u) cVar3;
        String str2 = uVar.f49777b;
        uVar.f49777b = null;
        str = str2 != null ? str2 : str;
        if (str != null && !Lg.n.n2(str)) {
            h(new C5691G(this, str, null));
        }
        C6473k c6473k = new C6473k(22, this);
        F0 f02 = c6808y.f51810b;
        k(c6473k, f02);
        L4.a.E0(L4.a.I0(new C5696L(this, null), f02), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new C5692H(aVar2, c5715n, null), new M1.w(L4.a.h0(L4.a.i0(new M1.w(f02, 17)), 500L), 16)), AbstractC4828h.Q(this));
        k(C5703b.f45901u0, ((C5870a) jVar).f46507c);
        Uri uri = uVar.f49776a;
        uVar.f49776a = null;
        if (uri != null) {
            m(uri, Jc.E.f9042i0, null, null, null);
        }
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        ArrayList arrayList;
        Jc.E e10;
        Sc.u uVar;
        Sc.s sVar;
        String str;
        AbstractC6806w abstractC6806w = (AbstractC6806w) iVar;
        AbstractC3557B.c0("intent", abstractC6806w);
        Sc.p pVar = null;
        if (abstractC6806w instanceof C6805v) {
            h(new C5698N(this, abstractC6806w, null));
        } else if (abstractC6806w instanceof C6801r) {
            h(new C5695K(this, ((C6801r) abstractC6806w).f51799a, null));
        } else if (abstractC6806w instanceof C6803t) {
            AbstractC6211y abstractC6211y = ((C6803t) abstractC6806w).f51801a;
            boolean z10 = abstractC6211y instanceof C6174I;
            Z9.d dVar = this.f45868o;
            if (z10) {
                C6174I c6174i = (C6174I) abstractC6211y;
                if (c6174i.f48346e == null && (str = c6174i.f48343b) != null) {
                    C4211E.a(this.f45867n, AbstractC4344b.F0(new C3234k(str, c6174i.f48345d)), 0, false, 6);
                    Uc.C c10 = Uc.C.f17609i;
                    String str2 = dVar.f23425a;
                    AbstractC3557B.c0("conversationId", str2);
                    String concat = "conversation/edit?id=".concat(str2);
                    AbstractC3557B.c0("internalRoute", concat);
                    g(new Ad.p(concat));
                }
            } else if (abstractC6211y instanceof wd.Y) {
                String str3 = ((wd.Y) abstractC6211y).f48372a;
                AbstractC3557B.c0("value", str3);
                C4211E.a(this.f45867n, AbstractC4344b.F0(new C3234k(str3, null)), 0, true, 2);
                Uc.C c11 = Uc.C.f17609i;
                String str4 = dVar.f23425a;
                AbstractC3557B.c0("conversationId", str4);
                String concat2 = "conversation/edit?id=".concat(str4);
                AbstractC3557B.c0("internalRoute", concat2);
                g(new Ad.p(concat2));
            } else {
                Pc.c a5 = Pc.e.a();
                x8.W.M(a5, "Invalid attachment image type => " + abstractC6211y, null, 6);
            }
        } else if (abstractC6806w instanceof C6802s) {
            Uri uri = ((C6802s) abstractC6806w).f51800a;
            if (uri != null) {
                m(uri, Jc.E.f9042i0, null, null, null);
            }
        } else if (abstractC6806w instanceof C6798o) {
            Uri uri2 = ((C6798o) abstractC6806w).f51796a;
            if (uri2 != null) {
                Sc.n a10 = ((C6783B) this.f808e.getValue()).f51759b.a();
                if (a10 != null && (uVar = a10.f16540h) != null && (sVar = uVar.f16554a) != null) {
                    pVar = sVar.f16551a;
                }
                if (pVar != null && AbstractC5693I.f45824a[pVar.ordinal()] == 1) {
                    e10 = Jc.E.f9040Z;
                } else {
                    e10 = Jc.E.f9041h0;
                }
                m(uri2, e10, null, null, null);
            }
        } else if (abstractC6806w instanceof C6797n) {
            AbstractC1809m0.a().b(W0.f23280c, kf.w.f37484Y);
            C6797n c6797n = (C6797n) abstractC6806w;
            m(c6797n.f51794a, c6797n.f51795b, null, null, null);
        } else if (abstractC6806w instanceof C6804u) {
            h(new C5699O(this, abstractC6806w, null));
        } else if (AbstractC3557B.K(abstractC6806w, C6796m.f51793a)) {
            h(new C5694J(this, null));
        } else if (abstractC6806w instanceof C6800q) {
            h(new C5701Q((C6800q) abstractC6806w, this, null));
        } else if (abstractC6806w instanceof C6799p) {
            h(new S((C6799p) abstractC6806w, this, null));
        } else if (abstractC6806w instanceof C6795l) {
            Aa.j jVar = this.f45866m;
            C6795l c6795l = (C6795l) abstractC6806w;
            String str5 = c6795l.f51791a;
            Aa.c cVar = c6795l.f51792b;
            C5870a c5870a = (C5870a) jVar;
            synchronized (c5870a) {
                AbstractC3557B.c0("decorationId", str5);
                AbstractC3557B.c0("action", cVar);
                Object obj = c5870a.f46505a.get();
                AbstractC3557B.b0("get(...)", obj);
                arrayList = new ArrayList();
                for (Aa.g gVar : (Iterable) obj) {
                    Ad.p c12 = ((Ra.g) gVar).c(cVar);
                    if (c12 != null) {
                        arrayList.add(c12);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g((Ad.r) it.next());
            }
        }
    }

    public final void m(Uri uri, Jc.E e10, String str, String str2, Uri uri2) {
        Sa.f fVar = (Sa.f) this.f45863j;
        fVar.getClass();
        AbstractC3557B.c0("file", uri);
        AbstractC3557B.c0("useCase", e10);
        C1209l c1209l = new C1209l(new Sa.e(e10, fVar, uri, uri2, str2, str, null));
        fVar.f16466i0.getClass();
        L4.a.E0(L4.a.I0(new W(e10, this, uri, null), L4.a.r0(c1209l, Ng.Q.f12906c)), AbstractC4828h.Q(this));
    }
}
