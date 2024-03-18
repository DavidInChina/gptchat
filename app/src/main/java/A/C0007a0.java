package A;

import E0.AbstractC0461u;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0572a0;
import H0.C0686j0;
import H0.C0714y;
import N.C1034s;
import N0.C1046e;
import Z.AbstractC1704c0;
import Z.AbstractC1710f0;
import Z.C1744x;
import Z.l1;
import a6.C1931a;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.accessibility.AccessibilityNodeInfo;
import b0.C2099c;
import b0.C2104h;
import e4.C2794b;
import e4.C2801i;
import id.AbstractC3557B;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import o0.C4868c;
import o0.C4869d;
import q0.C5251c;
import q0.C5252d;
import q1.AbstractC5260f;
import r0.AbstractC5352p;
import s3.C5562l;
import wf.AbstractC6216a;

/* renamed from: A.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007a0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f162Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f163Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f164h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007a0(androidx.compose.ui.node.a aVar, kotlin.jvm.internal.B b10) {
        super(0);
        this.f162Y = 12;
        this.f164h0 = aVar;
        this.f163Z = b10;
    }

    public final long a() {
        int i10;
        C1046e c1046e;
        int i11;
        long j6;
        L.Q0 d10;
        L.w0 w0Var;
        C1046e c1046e2;
        L.w0 w0Var2;
        int i12 = this.f162Y;
        Object obj = this.f164h0;
        Object obj2 = this.f163Z;
        switch (i12) {
            case 5:
                N.f0 f0Var = (N.f0) obj2;
                long j10 = ((Z0.k) ((AbstractC1710f0) obj).getValue()).f22804a;
                C1034s f6 = f0Var.f();
                if (f6 == null) {
                    return C5251c.f43621d;
                }
                L.Y d11 = f0Var.d();
                if (d11 == null) {
                    i10 = -1;
                } else {
                    i10 = N.g0.f12337a[d11.ordinal()];
                }
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new RuntimeException();
                            }
                            throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                        }
                        return N.h0.b(f0Var, j10, f6.f12409b);
                    }
                    return N.h0.b(f0Var, j10, f6.f12408a);
                }
                return C5251c.f43621d;
            default:
                N.t0 t0Var = (N.t0) obj2;
                long j11 = ((Z0.k) ((AbstractC1710f0) obj).getValue()).f22804a;
                C5251c h10 = t0Var.h();
                if (h10 != null) {
                    L.P0 p02 = t0Var.f12416d;
                    if (p02 != null && (w0Var2 = p02.f10029a) != null) {
                        c1046e = w0Var2.f10339a;
                    } else {
                        c1046e = null;
                    }
                    if (c1046e != null && c1046e.f12512Y.length() != 0) {
                        L.Y y10 = (L.Y) t0Var.f12426n.getValue();
                        if (y10 == null) {
                            i11 = -1;
                        } else {
                            i11 = N.w0.f12445a[y10.ordinal()];
                        }
                        if (i11 != -1) {
                            if (i11 != 1 && i11 != 2) {
                                if (i11 == 3) {
                                    long j12 = t0Var.j().f16831b;
                                    int i13 = N0.D.f12484c;
                                    j6 = j12 & 4294967295L;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                long j13 = t0Var.j().f16831b;
                                int i14 = N0.D.f12484c;
                                j6 = j13 >> 32;
                            }
                            int i15 = (int) j6;
                            L.P0 p03 = t0Var.f12416d;
                            if (p03 != null && (d10 = p03.d()) != null) {
                                L.P0 p04 = t0Var.f12416d;
                                if (p04 != null && (w0Var = p04.f10029a) != null && (c1046e2 = w0Var.f10339a) != null) {
                                    int p10 = com.google.android.gms.internal.play_billing.N.p(t0Var.f12414b.b(i15), 0, c1046e2.f12512Y.length());
                                    float d12 = C5251c.d(d10.d(h10.f43623a));
                                    N0.C c10 = d10.f10054a;
                                    int g10 = c10.g(p10);
                                    float i16 = c10.i(g10);
                                    float j14 = c10.j(g10);
                                    float o10 = com.google.android.gms.internal.play_billing.N.o(d12, Math.min(i16, j14), Math.max(i16, j14));
                                    if (Math.abs(d12 - o10) > ((int) (j11 >> 32)) / 2) {
                                        return C5251c.f43621d;
                                    }
                                    float l10 = c10.l(g10);
                                    return R4.b.r(o10, ((c10.e(g10) - l10) / 2) + l10);
                                }
                                return C5251c.f43621d;
                            }
                            return C5251c.f43621d;
                        }
                        return C5251c.f43621d;
                    }
                    return C5251c.f43621d;
                }
                return C5251c.f43621d;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        B3.b writableDatabase;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f162Y;
        Object obj = this.f164h0;
        Object obj2 = this.f163Z;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                H.s sVar = (H.s) ((l1) obj2).getValue();
                H.F f6 = (H.F) obj;
                return new H.t(f6, sVar, new G.e0((Cf.g) f6.f6549d.f6531f.getValue(), sVar));
            case 2:
                C5252d c5252d = (C5252d) obj2;
                if (c5252d != null) {
                    return c5252d;
                }
                AbstractC0461u A02 = ((I.g) obj).A0();
                if (A02 == null) {
                    return null;
                }
                return A7.b.K(C5251c.f43619b, Ng.H.z(A02.j()));
            case 3:
                mo122invoke();
                return yVar;
            case 4:
                ((L.P0) obj2).f10049u.invoke(new T0.n(((T0.o) obj).f16807e));
                return Boolean.TRUE;
            case 5:
                return new C5251c(a());
            case 6:
                return new C5251c(a());
            case 7:
                mo122invoke();
                return yVar;
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                mo122invoke();
                return yVar;
            case 10:
                mo122invoke();
                return yVar;
            case 11:
            default:
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
                mo122invoke();
                return yVar;
            case 17:
                Context context = (Context) obj2;
                AbstractC3557B.b0("applicationContext", context);
                return AbstractC5260f.I(context, ((O1.b) obj).f13335a);
            case 18:
                mo122invoke();
                return yVar;
            case 19:
                mo122invoke();
                return yVar;
            case 20:
                B3.f fVar = ((C2801i) obj2).f28966Y;
                if (fVar != null && (writableDatabase = fVar.getWritableDatabase()) != null) {
                    return writableDatabase;
                }
                B3.b bVar = (B3.b) obj;
                AbstractC3557B.Z(bVar);
                return bVar;
            case 21:
                return new C2794b(((C2801i) obj2).j().x((String) obj));
            case 22:
                return mo122invoke();
            case 23:
                return mo122invoke();
            case 24:
                return mo122invoke();
            case 25:
                return new C1931a((String) obj2, ((W5.c) obj).f20744a.l());
            case 26:
                return mo122invoke();
            case 27:
                return new I6.a((String) obj2, ((E6.a) obj).f4537a.l());
            case 28:
                mo122invoke();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0007a0(Object obj, int i10, Object obj2) {
        super(0);
        this.f162Y = i10;
        this.f163Z = obj;
        this.f164h0 = obj2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f162Y;
        Object obj = this.f164h0;
        Object obj2 = this.f163Z;
        switch (i10) {
            case 22:
                Locale locale = Locale.US;
                Throwable th2 = (Throwable) obj;
                AbstractC3557B.b0("stackCapture", th2);
                return String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{(String) obj2, kf.t.m2(kf.t.Z1(Kg.m.p1(Lg.n.q2(AbstractC4344b.J0(th2))), 1), Separators.RETURN, null, null, null, 62)}, 2));
            case 23:
                return "Unexpected consent migration from " + ((h6.a) obj2) + " to " + ((h6.a) obj);
            case 24:
                return String.format(Locale.US, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{((File) obj2).getPath(), ((I5.d) obj).f8068Y.getPath()}, 2));
            default:
                Wh.s sVar = ((bi.f) obj).f26028e.f21336a;
                return ((String) obj2) + " for OkHttp instrumentation is not found, skipping tracking of request with url=" + sVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        E0.c0 c0Var;
        L0.o oVar;
        androidx.compose.ui.node.a aVar;
        switch (this.f162Y) {
            case 0:
                ((kotlin.jvm.internal.B) this.f163Z).f37622Y = AbstractC0579h.p((C0009b0) this.f164h0, E0.b0.f4049a);
                return;
            case 3:
                T0.z zVar = (T0.z) this.f163Z;
                long j6 = zVar.f16831b;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) this.f164h0;
                if (N0.D.a(j6, ((T0.z) abstractC1710f0.getValue()).f16831b) && AbstractC3557B.K(zVar.f16832c, ((T0.z) abstractC1710f0.getValue()).f16832c)) {
                    return;
                }
                abstractC1710f0.setValue(zVar);
                return;
            case 7:
                AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) this.f164h0;
                abstractC1704c0.getClass();
                abstractC1704c0.getClass();
                abstractC1704c0.getClass();
                Z.r.b((Z.r) this.f163Z, null, null);
                return;
            case 8:
                C2099c c2099c = (C2099c) this.f163Z;
                Z.D d10 = (Z.D) this.f164h0;
                Object[] objArr = c2099c.f25559Z;
                int i10 = c2099c.f25558Y;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object obj = objArr[i11];
                    AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
                    ((C1744x) d10).y(obj);
                }
                return;
            case 9:
                ((C4868c) this.f163Z).f40414u0.invoke((C4869d) this.f164h0);
                return;
            case 10:
                ((kotlin.jvm.internal.B) this.f163Z).f37622Y = ((p0.q) this.f164h0).A0();
                return;
            case 12:
                C0572a0 c0572a0 = ((androidx.compose.ui.node.a) this.f164h0).f24831B0;
                kotlin.jvm.internal.B b10 = (kotlin.jvm.internal.B) this.f163Z;
                if ((c0572a0.f5704e.f37723i0 & 8) == 0) {
                    return;
                }
                for (AbstractC4325q abstractC4325q = c0572a0.f5703d; abstractC4325q != null; abstractC4325q = abstractC4325q.f37724j0) {
                    if ((abstractC4325q.f37722h0 & 8) != 0) {
                        AbstractC4325q abstractC4325q2 = abstractC4325q;
                        C2104h c2104h = null;
                        while (abstractC4325q2 != null) {
                            if (abstractC4325q2 instanceof G0.v0) {
                                G0.v0 v0Var = (G0.v0) abstractC4325q2;
                                if (v0Var.B()) {
                                    L0.j jVar = new L0.j();
                                    b10.f37622Y = jVar;
                                    jVar.f10411h0 = true;
                                }
                                if (v0Var.l0()) {
                                    ((L0.j) b10.f37622Y).f10410Z = true;
                                }
                                v0Var.W((L0.j) b10.f37622Y);
                            } else if ((abstractC4325q2.f37722h0 & 8) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i12 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 8) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC4325q2 = abstractC4325q3;
                                        } else {
                                            if (c2104h == null) {
                                                c2104h = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q2 != null) {
                                                c2104h.b(abstractC4325q2);
                                                abstractC4325q2 = null;
                                            }
                                            c2104h.b(abstractC4325q3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC4325q2 = AbstractC0579h.f(c2104h);
                        }
                    }
                }
                return;
            case 13:
                G0.O o10 = (G0.O) this.f163Z;
                G0.g0 g0Var = o10.a().f5772p0;
                if (g0Var == null || (c0Var = g0Var.f5672m0) == null) {
                    c0Var = ((C0714y) AbstractC0579h.C(o10.f5647a)).getPlacementScope();
                }
                G0.M m10 = (G0.M) this.f164h0;
                wf.k kVar = m10.f5624F0;
                if (kVar == null) {
                    G0.g0 a5 = o10.a();
                    long j10 = m10.f5625G0;
                    float f6 = m10.f5626H0;
                    c0Var.getClass();
                    E0.c0.e(a5, j10, f6);
                    return;
                }
                G0.g0 a10 = o10.a();
                long j11 = m10.f5625G0;
                float f10 = m10.f5626H0;
                c0Var.getClass();
                E0.c0.l(a10, j11, f10, kVar);
                return;
            case 14:
                r0.I i13 = G0.g0.f5759G0;
                ((G0.g0) this.f163Z).A0((AbstractC5352p) this.f164h0);
                return;
            case 15:
                C0714y c0714y = (C0714y) this.f163Z;
                C0686j0 androidViewsHandler$ui_release = c0714y.getAndroidViewsHandler$ui_release();
                c1.l lVar = (c1.l) this.f164h0;
                androidViewsHandler$ui_release.removeViewInLayout(lVar);
                HashMap<androidx.compose.ui.node.a, c1.l> layoutNodeToHolder = c0714y.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                androidx.compose.ui.node.a remove = c0714y.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(lVar);
                Ad.l.I(layoutNodeToHolder);
                layoutNodeToHolder.remove(remove);
                WeakHashMap weakHashMap = D1.Z.f3247a;
                D1.H.s(lVar, 0);
                return;
            case 16:
                H0.R0 r02 = (H0.R0) this.f163Z;
                L0.h hVar = r02.f6875j0;
                L0.h hVar2 = r02.f6876k0;
                Float f11 = r02.f6873h0;
                Float f12 = r02.f6874i0;
                float floatValue = (hVar == null || f11 == null) ? 0.0f : ((Number) hVar.f10381a.mo122invoke()).floatValue() - f11.floatValue();
                float floatValue2 = (hVar2 == null || f12 == null) ? 0.0f : ((Number) hVar2.f10381a.mo122invoke()).floatValue() - f12.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    H0.O o11 = (H0.O) this.f164h0;
                    int i14 = r02.f6871Y;
                    int[] iArr = H0.O.f6796V0;
                    int G10 = o11.G(i14);
                    H0.S0 s02 = (H0.S0) o11.t().get(Integer.valueOf(o11.f6827r0));
                    if (s02 != null) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo = o11.f6828s0;
                            if (accessibilityNodeInfo != null) {
                                accessibilityNodeInfo.setBoundsInScreen(o11.l(s02));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    o11.f6818i0.invalidate();
                    H0.S0 s03 = (H0.S0) o11.t().get(Integer.valueOf(G10));
                    if (s03 != null && (oVar = s03.f6878a) != null && (aVar = oVar.f10420c) != null) {
                        if (hVar != null) {
                            o11.f6830u0.put(Integer.valueOf(G10), hVar);
                        }
                        if (hVar2 != null) {
                            o11.f6831v0.put(Integer.valueOf(G10), hVar2);
                        }
                        o11.C(aVar);
                    }
                }
                if (hVar != null) {
                    r02.f6873h0 = (Float) hVar.f10381a.mo122invoke();
                }
                if (hVar2 == null) {
                    return;
                }
                r02.f6874i0 = (Float) hVar2.f10381a.mo122invoke();
                return;
            case 18:
                ((t3.m) this.f163Z).e((C5562l) this.f164h0, false);
                return;
            case 19:
                S3.f fVar = ((R3.d) this.f163Z).f15034a;
                R3.b bVar = (R3.b) this.f164h0;
                fVar.getClass();
                AbstractC3557B.c0("listener", bVar);
                synchronized (fVar.f16118c) {
                    if (fVar.f16119d.remove(bVar) && fVar.f16119d.isEmpty()) {
                        fVar.d();
                    }
                }
                return;
            case 28:
                ((wf.k) this.f163Z).invoke(((R8.p) this.f164h0).f15158g);
                return;
            default:
                ((wf.k) this.f163Z).invoke(this.f164h0);
                return;
        }
    }
}
