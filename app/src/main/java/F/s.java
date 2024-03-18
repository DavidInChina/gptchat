package F;

import B.S;
import Df.AbstractC0408g;
import E0.AbstractC0461u;
import G.e0;
import G0.C0578g;
import G0.O;
import G0.T;
import H0.AbstractC0666a;
import H0.AbstractC0696o0;
import H0.C0689l;
import Mb.V;
import Mb.Y;
import N0.C1046e;
import W.C1550f3;
import W.C1568j1;
import W.EnumC1555g3;
import W.Y1;
import W.n4;
import W.o4;
import Z.AbstractC1710f0;
import Z.l1;
import Z8.AbstractC1831y;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import b0.C2104h;
import cb.C2334C;
import cb.C2353W;
import cb.C2373n;
import com.statsig.androidsdk.StatsigClient;
import fa.C2969F;
import g4.AbstractC3181i;
import g4.C3188p;
import gb.AbstractC3237n;
import gb.i0;
import h.C3276b;
import id.AbstractC3557B;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k6.AbstractC4194d;
import kb.C4209C;
import kb.C4225j;
import kb.C4230o;
import l0.C4323o;
import ld.C4429b;
import m.AbstractActivityC4532l;
import na.P;
import nd.C4812a;
import p.View$OnAttachStateChangeListenerC5030f;
import p9.C5100b;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import u0.AbstractC5824b;
import wf.AbstractC6216a;
import x8.W;
import za.C6786c;
import za.C6797n;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4953Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f4954Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f4955h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f4956i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f4953Y = i10;
        this.f4954Z = obj;
        this.f4955h0 = obj2;
        this.f4956i0 = obj3;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        androidx.compose.foundation.layout.d dVar;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f4953Y;
        C5254f c5254f = null;
        Object obj = this.f4956i0;
        Object obj2 = this.f4955h0;
        Object obj3 = this.f4954Z;
        switch (i10) {
            case 0:
                C0535i c0535i = (C0535i) ((l1) obj3).getValue();
                J j6 = (J) obj2;
                return new p(j6, c0535i, (C0529c) obj, new e0((Cf.g) j6.f4873c.f4853e.getValue(), c0535i));
            case 1:
                return new H.s(((Number) ((AbstractC6216a) obj).mo122invoke()).intValue(), (wf.k) ((l1) obj2).getValue(), (wf.p) ((l1) obj3).getValue());
            case 2:
                I.m mVar = (I.m) obj3;
                C5252d B02 = I.m.B0(mVar, (AbstractC0461u) obj2, (AbstractC6216a) obj);
                if (B02 == null) {
                    return null;
                }
                S s10 = (S) mVar.f7939u0;
                if (!Z0.k.a(s10.f1163B0, 0L)) {
                    return B02.i(C5251c.k(s10.E0(s10.f1163B0, B02)));
                }
                throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
            case 3:
                mo122invoke();
                return yVar;
            case 4:
                if (((Boolean) ((C1550f3) obj3).f20062c.f18994c.invoke(EnumC1555g3.f20079Z)).booleanValue()) {
                    Ad.l.O0((Ng.F) obj2, null, null, new Y1((C1550f3) obj, null), 3);
                }
                return Boolean.TRUE;
            case 5:
                mo122invoke();
                return yVar;
            case 6:
                mo122invoke();
                return yVar;
            case 7:
                return mo122invoke();
            case 8:
                return mo122invoke();
            case 9:
                AbstractC5824b a5 = ((AbstractC3181i) ((C3188p) obj3).f31249w0.getValue()).a();
                if (a5 != null) {
                    c5254f = new C5254f(a5.h());
                }
                C4323o c4323o = C4323o.f37719b;
                if (c5254f != null) {
                    long j10 = C5254f.f43638c;
                    long j11 = c5254f.f43640a;
                    if (j11 != j10 && C5254f.d(j11) != Float.POSITIVE_INFINITY && C5254f.b(j11) != Float.POSITIVE_INFINITY) {
                        float d10 = C5254f.d(j11);
                        float b10 = C5254f.b(j11);
                        float h10 = d10 > ((float) Z0.a.h(((androidx.compose.foundation.layout.d) obj2).f24736b)) ? Z0.a.h(dVar.f24736b) / d10 : 1.0f;
                        Z0.b bVar = (Z0.b) obj;
                        return androidx.compose.foundation.layout.e.k(c4323o, bVar.K(d10 * h10), bVar.K(b10 * h10));
                    }
                }
                return androidx.compose.foundation.layout.e.j(c4323o, Q8.p.f14520a);
            case 10:
                mo122invoke();
                return yVar;
            case 11:
                mo122invoke();
                return yVar;
            case 12:
                mo122invoke();
                return yVar;
            case 13:
                mo122invoke();
                return yVar;
            case 14:
                mo122invoke();
                return yVar;
            case 15:
                mo122invoke();
                return yVar;
            case 16:
                File file = new File(((Sa.f) obj2).f16463Y.getCacheDir(), R.a.r("files/", ((C4812a) obj3).f40278e));
                C4429b c4429b = (C4429b) obj;
                file.mkdirs();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                c4429b.a(new Sa.a(file, null));
                return file;
            case 17:
                mo122invoke();
                return yVar;
            case 18:
                mo122invoke();
                return yVar;
            case 19:
                mo122invoke();
                return yVar;
            case 20:
                mo122invoke();
                return yVar;
            case 21:
                mo122invoke();
                return yVar;
            case 22:
                mo122invoke();
                return yVar;
            case 23:
                mo122invoke();
                return yVar;
            case 24:
                mo122invoke();
                return yVar;
            case 25:
                mo122invoke();
                return yVar;
            case 26:
                mo122invoke();
                return yVar;
            case 27:
                mo122invoke();
                return yVar;
            case 28:
                mo122invoke();
                return yVar;
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f4953Y;
        Object obj = this.f4956i0;
        Object obj2 = this.f4955h0;
        Object obj3 = this.f4954Z;
        switch (i10) {
            case 7:
                return String.format(Locale.US, "You are using a url \"%s\" instead of a host to setup %s tracking. You should use instead a valid host name: \"%s\"", Arrays.copyOf(new Object[]{(String) obj3, (String) obj2, ((URL) obj).getHost()}, 3));
            default:
                String q32 = kf.q.q3((byte[]) obj, Separators.COMMA, null, 62);
                StringBuilder t10 = android.gov.nist.core.a.t("Decoded file (", ((File) obj3).getName(), ") content contains NULL character, file content={", (String) obj2, "}, raw_bytes=");
                t10.append(q32);
                return t10.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo122invoke() {
        o4 o4Var;
        T t10;
        int i10;
        int i11 = this.f4953Y;
        o4 o4Var2 = null;
        int i12 = 0;
        Object obj = this.f4955h0;
        Object obj2 = this.f4954Z;
        Object obj3 = this.f4956i0;
        switch (i11) {
            case 3:
                n4 n4Var = (n4) obj2;
                Float valueOf = (n4Var == null || (o4Var = ((C1568j1) n4Var).f20169b) == null) ? null : Float.valueOf(o4Var.f20266a.h());
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj3;
                float f6 = yVar.f37646Y - yVar2.f37646Y;
                if (valueOf != null && valueOf.floatValue() == f6) {
                    return;
                }
                if (n4Var != null) {
                    o4Var2 = ((C1568j1) n4Var).f20169b;
                }
                if (o4Var2 == null) {
                    return;
                }
                o4Var2.f20266a.i(yVar.f37646Y - yVar2.f37646Y);
                return;
            case 4:
            case 7:
            case 8:
            case 9:
            case 16:
            default:
                ((AbstractC1710f0) obj3).setValue(Boolean.FALSE);
                ((wf.k) obj2).invoke((Ec.o) obj);
                return;
            case 5:
                G0.L l10 = (G0.L) obj2;
                O o10 = l10.f5602B0;
                o10.f5656j = 0;
                C2104h J10 = o10.f5647a.J();
                int i13 = J10.f25569h0;
                if (i13 > 0) {
                    Object[] objArr = J10.f25567Y;
                    int i14 = 0;
                    do {
                        G0.L l11 = ((androidx.compose.ui.node.a) objArr[i14]).t().f5662p;
                        AbstractC3557B.Z(l11);
                        l11.f5604l0 = l11.f5605m0;
                        l11.f5605m0 = Integer.MAX_VALUE;
                        if (l11.f5606n0 == 2) {
                            l11.f5606n0 = 3;
                        }
                        i14++;
                    } while (i14 < i13);
                    l10.A(C0578g.f5741h0);
                    t10 = l10.e().f5847M0;
                    if (t10 != null) {
                        boolean z10 = t10.f5671l0;
                        List o11 = ((O) obj3).f5647a.o();
                        int size = o11.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            T E02 = ((androidx.compose.ui.node.a) o11.get(i15)).f24831B0.f5702c.E0();
                            if (E02 != null) {
                                E02.f5671l0 = z10;
                            }
                        }
                    }
                    ((T) obj).p0().b();
                    if (l10.e().f5847M0 != null) {
                        List o12 = ((O) obj3).f5647a.o();
                        int size2 = o12.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            T E03 = ((androidx.compose.ui.node.a) o12.get(i16)).f24831B0.f5702c.E0();
                            if (E03 != null) {
                                E03.f5671l0 = false;
                            }
                        }
                    }
                    C2104h J11 = l10.f5602B0.f5647a.J();
                    i10 = J11.f25569h0;
                    if (i10 <= 0) {
                        Object[] objArr2 = J11.f25567Y;
                        do {
                            G0.L l12 = ((androidx.compose.ui.node.a) objArr2[i12]).t().f5662p;
                            AbstractC3557B.Z(l12);
                            int i17 = l12.f5604l0;
                            int i18 = l12.f5605m0;
                            if (i17 != i18 && i18 == Integer.MAX_VALUE) {
                                l12.l0();
                            }
                            i12++;
                        } while (i12 < i10);
                        l10.A(C0578g.f5742i0);
                        return;
                    }
                    l10.A(C0578g.f5742i0);
                    return;
                }
                l10.A(C0578g.f5741h0);
                t10 = l10.e().f5847M0;
                if (t10 != null) {
                }
                ((T) obj).p0().b();
                if (l10.e().f5847M0 != null) {
                }
                C2104h J112 = l10.f5602B0.f5647a.J();
                i10 = J112.f25569h0;
                if (i10 <= 0) {
                }
            case 6:
                AbstractC0666a abstractC0666a = (AbstractC0666a) obj2;
                abstractC0666a.removeOnAttachStateChangeListener((View$OnAttachStateChangeListenerC5030f) obj);
                C3276b c3276b = (C3276b) obj3;
                AbstractC3557B.c0("listener", c3276b);
                Df.H.S(abstractC0666a).f8731a.remove(c3276b);
                return;
            case 10:
                String abstractC1831y = ((AbstractC1831y) obj2).toString();
                Map map = (Map) obj;
                W.F(Pc.e.a(), "Statsig track event: " + abstractC1831y + ", properties: " + map, null, 6);
                StatsigClient statsigClient = ((com.openai.experiment.C) obj3).f27663e;
                LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                statsigClient.logEvent(abstractC1831y, linkedHashMap);
                return;
            case 11:
                Z0.i iVar = (Z0.i) ((C5100b) obj2).f42762b.getValue();
                if (iVar == null) {
                    return;
                }
                ((u9.b) obj).b();
                ((wf.k) obj3).invoke(new Z0.i(iVar.f22799a));
                return;
            case 12:
                ((wf.k) obj2).invoke(new C6797n((Uri) obj, ((C6786c) obj3).f51783a));
                return;
            case 13:
                ((u9.b) obj2).f();
                AbstractC4194d.d((p0.f) obj);
                ((wf.k) ((AbstractC0408g) obj3)).invoke(P.f39849a);
                return;
            case 14:
                ((u9.b) obj2).f();
                ((AbstractC6216a) obj).mo122invoke();
                ((AbstractC6216a) obj3).mo122invoke();
                return;
            case 15:
                ((AbstractC6216a) obj2).mo122invoke();
                ((wf.k) obj).invoke((Sc.n) obj3);
                return;
            case 17:
                ((AbstractC1710f0) obj3).setValue(Boolean.FALSE);
                ((wf.k) obj2).invoke((C2334C) obj);
                return;
            case 18:
                ((AbstractC1710f0) obj3).setValue(Boolean.FALSE);
                wf.k kVar = (wf.k) obj2;
                if (kVar == null) {
                    return;
                }
                kVar.invoke((C2373n) obj);
                return;
            case 19:
                ((wf.k) obj2).invoke(new bb.P((C2353W) obj, (C2334C) obj3));
                return;
            case 20:
                String c10 = ((AbstractC3237n) obj2).c();
                if (c10 != null) {
                    ((C0689l) ((AbstractC0696o0) obj3)).a(new C1046e(c10, null, 6));
                }
                ((w9.j) obj).a();
                return;
            case 21:
                ((wf.k) obj2).invoke(new i0((String) obj, (wd.L) obj3));
                return;
            case 22:
                ((w9.j) obj2).a();
                ((wf.k) obj).invoke(new hb.i((C2969F) obj3));
                return;
            case 23:
                if (((C4209C) obj2).f37229g) {
                    ((wf.k) obj).invoke(C4225j.f37257a);
                    return;
                }
                x9.l lVar = (x9.l) obj3;
                lVar.f49676b.clear();
                lVar.f49677c.clear();
                lVar.f49678d.clear();
                ((wf.k) obj).invoke(new C4230o(false));
                return;
            case 24:
                i0.r rVar = sb.l.f45515a;
                ((wf.n) obj2).invoke((String) ((AbstractC1710f0) obj3).getValue(), (j0.u) obj);
                return;
            case 25:
                if (tb.f.f46055a[((tb.j) obj2).ordinal()] == 1) {
                    ((AbstractC6216a) obj).mo122invoke();
                    return;
                } else {
                    ((AbstractC1710f0) obj3).setValue(Boolean.TRUE);
                    return;
                }
            case 26:
                Intent intent = ((V) ((Y) obj2)).f11857d;
                if (intent == null) {
                    return;
                }
                K8.d.O0((AbstractActivityC4532l) obj, (Tc.f) obj3, intent);
                return;
            case 27:
                ((wf.k) obj2).invoke((Yg.r) ((AbstractC1710f0) obj3).getValue());
                ((AbstractC6216a) obj).mo122invoke();
                return;
            case 28:
                ((wf.k) obj2).invoke((Fb.f) obj);
                ((AbstractC6216a) obj3).mo122invoke();
                return;
        }
    }
}
