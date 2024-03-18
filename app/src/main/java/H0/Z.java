package H0;

import A.C0043t;
import A.C0053y;
import G0.C0571a;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.AbstractC1748z;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import g.C3113f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import nf.AbstractC4828h;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.O f6887a = A7.b.o0(P.f6847i0);

    /* renamed from: b  reason: collision with root package name */
    public static final Z.m1 f6888b = new AbstractC1748z(P.f6848j0);

    /* renamed from: c  reason: collision with root package name */
    public static final Z.m1 f6889c = new AbstractC1748z(P.f6849k0);

    /* renamed from: d  reason: collision with root package name */
    public static final Z.m1 f6890d = new AbstractC1748z(P.f6850l0);

    /* renamed from: e  reason: collision with root package name */
    public static final Z.m1 f6891e = new AbstractC1748z(P.f6851m0);

    /* renamed from: f  reason: collision with root package name */
    public static final Z.m1 f6892f = new AbstractC1748z(P.f6852n0);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C0714y c0714y, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        Object i11;
        Object K10;
        Object K11;
        C1741v0 v10;
        String str;
        LinkedHashMap linkedHashMap;
        int i12;
        boolean z11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1396852028);
        Context context = c0714y.getContext();
        rVar.W(-492369756);
        Object K12 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K12 == iVar) {
            K12 = AbstractC4828h.Z(new Configuration(context.getResources().getConfiguration()), Z.o1.f22665a);
            rVar.h0(K12);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K12;
        rVar.W(-797338989);
        boolean g10 = rVar.g(abstractC1710f0);
        Object K13 = rVar.K();
        if (g10 || K13 == iVar) {
            K13 = AbstractC6463a.h(abstractC1710f0, 2, rVar);
        }
        rVar.t(false);
        c0714y.setConfigurationChangeObserver((wf.k) K13);
        rVar.W(-492369756);
        Object K14 = rVar.K();
        if (K14 == iVar) {
            K14 = new C0682h0(context);
            rVar.h0(K14);
        }
        rVar.t(false);
        C0682h0 c0682h0 = (C0682h0) K14;
        C0699q viewTreeOwners = c0714y.getViewTreeOwners();
        if (viewTreeOwners != null) {
            rVar.W(-492369756);
            Object K15 = rVar.K();
            A3.f fVar = viewTreeOwners.f6990b;
            if (K15 == iVar) {
                ViewParent parent = c0714y.getParent();
                AbstractC3557B.a0("null cannot be cast to non-null type android.view.View", parent);
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = i0.m.class.getSimpleName() + ':' + str;
                A3.d f6 = fVar.f();
                Bundle a5 = f6.a(str2);
                if (a5 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a5.keySet()) {
                        ArrayList parcelableArrayList = a5.getParcelableArrayList(str3);
                        AbstractC3557B.a0("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }", parcelableArrayList);
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                C0702s c0702s = C0702s.f7030n0;
                Z.m1 m1Var = i0.p.f32433a;
                i0.o oVar = new i0.o(linkedHashMap, c0702s);
                try {
                    i12 = 1;
                } catch (IllegalArgumentException unused) {
                    i12 = 1;
                }
                try {
                    f6.c(str2, new C3113f(1, oVar));
                    z11 = true;
                } catch (IllegalArgumentException unused2) {
                    z11 = false;
                    K15 = new C0709v0(oVar, new L.N(z11, f6, str2, i12));
                    rVar.h0(K15);
                    z10 = false;
                    rVar.t(z10);
                    C0709v0 c0709v0 = (C0709v0) K15;
                    AbstractC1734s.b(jf.y.f36177a, new C0571a(3, c0709v0), rVar);
                    Configuration configuration = (Configuration) abstractC1710f0.getValue();
                    i11 = AbstractC6463a.i(rVar, -485908294, -492369756);
                    if (i11 == iVar) {
                    }
                    rVar.t(false);
                    K0.d dVar = (K0.d) i11;
                    rVar.W(-492369756);
                    K10 = rVar.K();
                    Configuration configuration2 = K10;
                    if (K10 == iVar) {
                    }
                    rVar.t(false);
                    Configuration configuration3 = (Configuration) configuration2;
                    rVar.W(-492369756);
                    K11 = rVar.K();
                    if (K11 == iVar) {
                    }
                    rVar.t(false);
                    AbstractC1734s.b(dVar, new C0043t(context, 20, (Y) K11), rVar);
                    rVar.t(false);
                    A7.b.l(new C1737t0[]{f6887a.b((Configuration) abstractC1710f0.getValue()), f6888b.b(context), f6890d.b(viewTreeOwners.f6989a), f6891e.b(fVar), i0.p.f32433a.b(c0709v0), f6892f.b(c0714y.getView()), f6889c.b(dVar)}, R4.b.X(rVar, 1471621628, new N.D(c0714y, c0682h0, nVar, 4)), rVar, 56);
                    v10 = rVar.v();
                    if (v10 == null) {
                    }
                }
                K15 = new C0709v0(oVar, new L.N(z11, f6, str2, i12));
                rVar.h0(K15);
                z10 = false;
            } else {
                z10 = false;
            }
            rVar.t(z10);
            C0709v0 c0709v02 = (C0709v0) K15;
            AbstractC1734s.b(jf.y.f36177a, new C0571a(3, c0709v02), rVar);
            Configuration configuration4 = (Configuration) abstractC1710f0.getValue();
            i11 = AbstractC6463a.i(rVar, -485908294, -492369756);
            if (i11 == iVar) {
                i11 = new K0.d();
                rVar.h0(i11);
            }
            rVar.t(false);
            K0.d dVar2 = (K0.d) i11;
            rVar.W(-492369756);
            K10 = rVar.K();
            Configuration configuration22 = K10;
            if (K10 == iVar) {
                Configuration configuration5 = new Configuration();
                if (configuration4 != null) {
                    configuration5.setTo(configuration4);
                }
                rVar.h0(configuration5);
                configuration22 = configuration5;
            }
            rVar.t(false);
            Configuration configuration32 = (Configuration) configuration22;
            rVar.W(-492369756);
            K11 = rVar.K();
            if (K11 == iVar) {
                K11 = new Y(configuration32, dVar2);
                rVar.h0(K11);
            }
            rVar.t(false);
            AbstractC1734s.b(dVar2, new C0043t(context, 20, (Y) K11), rVar);
            rVar.t(false);
            A7.b.l(new C1737t0[]{f6887a.b((Configuration) abstractC1710f0.getValue()), f6888b.b(context), f6890d.b(viewTreeOwners.f6989a), f6891e.b(fVar), i0.p.f32433a.b(c0709v02), f6892f.b(c0714y.getView()), f6889c.b(dVar2)}, R4.b.X(rVar, 1471621628, new N.D(c0714y, c0682h0, nVar, 4)), rVar, 56);
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C0053y(c0714y, nVar, i10, 7);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
