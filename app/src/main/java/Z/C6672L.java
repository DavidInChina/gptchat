package z;

import A.AbstractC0016f;
import A.C0011c0;
import B.W0;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0576e;
import G0.C0578g;
import H0.C0667a0;
import L.N0;
import L.P0;
import N.AbstractC1031o;
import N0.C1042a;
import Ng.AbstractC1070k;
import V.C1456a;
import Z.C1730p0;
import Z.EnumC1747y0;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import b0.C2104h;
import id.AbstractC3557B;
import j0.C3876A;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import l0.AbstractC4325q;
import v0.C5946J;
import w.C6074u;
import wf.AbstractC6216a;

/* renamed from: z.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6672L extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51168Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51169Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6672L(int i10, Object obj) {
        super(0);
        this.f51168Y = i10;
        this.f51169Z = obj;
    }

    private final void c() {
        AbstractC1070k x10;
        Z.E0 e02 = (Z.E0) this.f51169Z;
        synchronized (e02.f22466c) {
            x10 = e02.x();
            if (((EnumC1747y0) e02.f22483t.getValue()).compareTo(EnumC1747y0.f22771Z) <= 0) {
                throw A7.b.g("Recomposer shutdown; frame clock awaiter will never resume", e02.f22468e);
            }
        }
        if (x10 != null) {
            x10.resumeWith(jf.y.f36177a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r0.A0().f41692a != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        r0 = androidx.compose.ui.focus.a.D(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r0.A0().f41692a != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a() {
        p0.h hVar;
        p0.q qVar;
        int i10 = this.f51168Y;
        boolean z10 = false;
        Object obj = this.f51169Z;
        switch (i10) {
            case 1:
                AbstractC0016f abstractC0016f = (AbstractC0016f) obj;
                F0.i iVar = androidx.compose.foundation.gestures.a.f24694c;
                abstractC0016f.getClass();
                if (!((Boolean) E9.f.a(abstractC0016f, iVar)).booleanValue()) {
                    int i11 = A.L.f90b;
                    ViewParent parent = ((View) AbstractC0579h.p(abstractC0016f, H0.Z.f6892f)).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (!viewGroup.shouldDelayChildPressedState()) {
                            parent = viewGroup.getParent();
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
            case 2:
                C0011c0 c0011c0 = (C0011c0) obj;
                AbstractC4325q abstractC4325q = c0011c0.f37720Y;
                C2104h c2104h = null;
                while (true) {
                    hVar = p0.h.f41690j0;
                    if (abstractC4325q != null) {
                        if (abstractC4325q instanceof p0.q) {
                            qVar = (p0.q) abstractC4325q;
                            break;
                        } else {
                            if ((abstractC4325q.f37722h0 & 1024) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                                int i12 = 0;
                                for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                                    if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC4325q = abstractC4325q2;
                                        } else {
                                            if (c2104h == null) {
                                                c2104h = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q != null) {
                                                c2104h.b(abstractC4325q);
                                                abstractC4325q = null;
                                            }
                                            c2104h.b(abstractC4325q2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC4325q = AbstractC0579h.f(c2104h);
                        }
                    } else {
                        AbstractC4325q abstractC4325q3 = c0011c0.f37720Y;
                        if (abstractC4325q3.f37732r0) {
                            C2104h c2104h2 = new C2104h(new AbstractC4325q[16]);
                            AbstractC4325q abstractC4325q4 = abstractC4325q3.f37725k0;
                            if (abstractC4325q4 == null) {
                                AbstractC0579h.b(c2104h2, abstractC4325q3);
                            } else {
                                c2104h2.b(abstractC4325q4);
                            }
                            while (c2104h2.l()) {
                                AbstractC4325q abstractC4325q5 = (AbstractC4325q) c2104h2.n(c2104h2.f25569h0 - 1);
                                if ((abstractC4325q5.f37723i0 & 1024) == 0) {
                                    AbstractC0579h.b(c2104h2, abstractC4325q5);
                                } else {
                                    while (true) {
                                        if (abstractC4325q5 == null) {
                                            break;
                                        } else if ((abstractC4325q5.f37722h0 & 1024) != 0) {
                                            C2104h c2104h3 = null;
                                            while (abstractC4325q5 != null) {
                                                if (abstractC4325q5 instanceof p0.q) {
                                                    qVar = (p0.q) abstractC4325q5;
                                                    break;
                                                } else {
                                                    if ((abstractC4325q5.f37722h0 & 1024) != 0 && (abstractC4325q5 instanceof AbstractC0587p)) {
                                                        int i13 = 0;
                                                        for (AbstractC4325q abstractC4325q6 = ((AbstractC0587p) abstractC4325q5).f5816t0; abstractC4325q6 != null; abstractC4325q6 = abstractC4325q6.f37725k0) {
                                                            if ((abstractC4325q6.f37722h0 & 1024) != 0) {
                                                                i13++;
                                                                if (i13 == 1) {
                                                                    abstractC4325q5 = abstractC4325q6;
                                                                } else {
                                                                    if (c2104h3 == null) {
                                                                        c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                                    }
                                                                    if (abstractC4325q5 != null) {
                                                                        c2104h3.b(abstractC4325q5);
                                                                        abstractC4325q5 = null;
                                                                    }
                                                                    c2104h3.b(abstractC4325q6);
                                                                }
                                                            }
                                                        }
                                                        if (i13 == 1) {
                                                        }
                                                    }
                                                    abstractC4325q5 = AbstractC0579h.f(c2104h3);
                                                }
                                            }
                                            continue;
                                        } else {
                                            abstractC4325q5 = abstractC4325q5.f37725k0;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    }
                    z10 = r0;
                }
                boolean h10 = androidx.compose.ui.focus.a.h(qVar, 7, hVar);
                z10 = h10;
                return Boolean.valueOf(z10);
            case 7:
                M.n nVar = (M.n) obj;
                nVar.f11340G0.setValue(null);
                AbstractC0579h.v(nVar);
                AbstractC0579h.u(nVar);
                AbstractC0579h.t(nVar);
                return Boolean.TRUE;
            case 8:
                M.q qVar2 = (M.q) obj;
                qVar2.f11357C0.setValue(null);
                AbstractC0579h.v(qVar2);
                AbstractC0579h.u(qVar2);
                AbstractC0579h.t(qVar2);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(R4.b.z1(((AbstractC1031o) obj).b()));
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f51168Y;
        Object obj = this.f51169Z;
        switch (i10) {
            case 0:
                return Float.valueOf(AbstractC6696f.q(((Ng.F) obj).i()));
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                return (G.F) obj;
            case 4:
                return new G.c0((i0.m) obj, kf.w.f37484Y);
            case 5:
                return ((P0) obj).d();
            case 6:
                return new N0((W0) obj, 0.0f);
            case 7:
                return a();
            case 8:
                return a();
            case 9:
                return a();
            case 10:
                mo122invoke();
                return yVar;
            case 11:
                HashMap hashMap = new HashMap();
                C1730p0 c1730p0 = (C1730p0) obj;
                int size = c1730p0.f22673a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Z.W w10 = (Z.W) c1730p0.f22673a.get(i11);
                    Object obj2 = w10.f22579b;
                    int i12 = w10.f22578a;
                    Object v10 = obj2 != null ? new Z.V(Integer.valueOf(i12), w10.f22579b) : Integer.valueOf(i12);
                    Object obj3 = hashMap.get(v10);
                    if (obj3 == null) {
                        obj3 = new LinkedHashSet();
                        hashMap.put(v10, obj3);
                    }
                    ((LinkedHashSet) obj3).add(w10);
                }
                return hashMap;
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
                switch (i10) {
                    case 17:
                        return ((A0.d) obj).f360c;
                    default:
                        return ((A0.g) obj).A0();
                }
            case 18:
                switch (i10) {
                    case 17:
                        return ((A0.d) obj).f360c;
                    default:
                        return ((A0.g) obj).A0();
                }
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
                C1042a c1042a = (C1042a) obj;
                return new P0.a(c1042a.f12492a.f17996g.getTextLocale(), c1042a.f12495d.f13320d.getText());
            case 27:
                return new O0.g(((O0.s) obj).f13320d);
            case 28:
                Object systemService = ((T0.q) obj).f16808a.getContext().getSystemService("input_method");
                AbstractC3557B.a0("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((T0.D) obj).f16738a, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121 A[LOOP:4: B:53:0x011b->B:55:0x0121, LOOP_END] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo122invoke() {
        C1456a c1456a;
        C3876A c3876a;
        Object[] objArr;
        Object[] objArr2;
        int i10;
        char c10;
        p0.p pVar;
        p0.p B02;
        int i11;
        Iterator it;
        int i12;
        int i13 = 2;
        C2104h c2104h = null;
        int i14 = 0;
        int i15 = 1;
        switch (this.f51168Y) {
            case 10:
                ((C1456a) this.f51169Z).f17911n0.setValue(Boolean.valueOf(!((Boolean) c1456a.f17911n0.getValue()).booleanValue()));
                return;
            case 11:
            case 17:
            case 18:
            default:
                ((C0667a0) this.f51169Z).f6903b = null;
                return;
            case 12:
                c();
                return;
            case 13:
                break;
            case 14:
                p0.e eVar = (p0.e) this.f51169Z;
                Iterator it2 = eVar.f41679d.iterator();
                while (true) {
                    char c11 = 16;
                    if (it2.hasNext()) {
                        AbstractC4325q abstractC4325q = (AbstractC4325q) ((p0.k) it2.next());
                        AbstractC4325q abstractC4325q2 = abstractC4325q.f37720Y;
                        if (abstractC4325q2.f37732r0) {
                            C2104h c2104h2 = null;
                            while (abstractC4325q2 != null) {
                                if (abstractC4325q2 instanceof p0.q) {
                                    eVar.f41677b.add((p0.q) abstractC4325q2);
                                } else if ((abstractC4325q2.f37722h0 & 1024) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                    int i16 = 0;
                                    for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                        if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                abstractC4325q2 = abstractC4325q3;
                                            } else {
                                                if (c2104h2 == null) {
                                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q2 != null) {
                                                    c2104h2.b(abstractC4325q2);
                                                    abstractC4325q2 = null;
                                                }
                                                c2104h2.b(abstractC4325q3);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                abstractC4325q2 = AbstractC0579h.f(c2104h2);
                            }
                            AbstractC4325q abstractC4325q4 = abstractC4325q.f37720Y;
                            if (abstractC4325q4.f37732r0) {
                                C2104h c2104h3 = new C2104h(new AbstractC4325q[16]);
                                AbstractC4325q abstractC4325q5 = abstractC4325q4.f37725k0;
                                if (abstractC4325q5 == null) {
                                    AbstractC0579h.b(c2104h3, abstractC4325q4);
                                } else {
                                    c2104h3.b(abstractC4325q5);
                                }
                                while (c2104h3.l()) {
                                    AbstractC4325q abstractC4325q6 = (AbstractC4325q) c2104h3.n(c2104h3.f25569h0 - 1);
                                    if ((abstractC4325q6.f37723i0 & 1024) == 0) {
                                        AbstractC0579h.b(c2104h3, abstractC4325q6);
                                    } else {
                                        while (true) {
                                            if (abstractC4325q6 == null) {
                                                break;
                                            } else if ((abstractC4325q6.f37722h0 & 1024) != 0) {
                                                C2104h c2104h4 = null;
                                                while (abstractC4325q6 != null) {
                                                    if (abstractC4325q6 instanceof p0.q) {
                                                        eVar.f41677b.add((p0.q) abstractC4325q6);
                                                    } else if ((abstractC4325q6.f37722h0 & 1024) != 0 && (abstractC4325q6 instanceof AbstractC0587p)) {
                                                        int i17 = 0;
                                                        for (AbstractC4325q abstractC4325q7 = ((AbstractC0587p) abstractC4325q6).f5816t0; abstractC4325q7 != null; abstractC4325q7 = abstractC4325q7.f37725k0) {
                                                            if ((abstractC4325q7.f37722h0 & 1024) != 0) {
                                                                i17++;
                                                                if (i17 == 1) {
                                                                    abstractC4325q6 = abstractC4325q7;
                                                                } else {
                                                                    if (c2104h4 == null) {
                                                                        c2104h4 = new C2104h(new AbstractC4325q[16]);
                                                                    }
                                                                    if (abstractC4325q6 != null) {
                                                                        c2104h4.b(abstractC4325q6);
                                                                        abstractC4325q6 = null;
                                                                    }
                                                                    c2104h4.b(abstractC4325q7);
                                                                }
                                                            }
                                                        }
                                                        if (i17 == 1) {
                                                        }
                                                    }
                                                    abstractC4325q6 = AbstractC0579h.f(c2104h4);
                                                }
                                            } else {
                                                abstractC4325q6 = abstractC4325q6.f37725k0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                        }
                    } else {
                        eVar.f41679d.clear();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (p0.d dVar : eVar.f41678c) {
                            AbstractC4325q abstractC4325q8 = (AbstractC4325q) dVar;
                            AbstractC4325q abstractC4325q9 = abstractC4325q8.f37720Y;
                            boolean z10 = abstractC4325q9.f37732r0;
                            p0.p pVar2 = p0.p.f41709h0;
                            if (!z10) {
                                dVar.U(pVar2);
                                c10 = c11;
                            } else {
                                p0.q qVar = c2104h;
                                p0.q qVar2 = qVar;
                                int i18 = i14;
                                int i19 = i15;
                                while (abstractC4325q9 != null) {
                                    if (abstractC4325q9 instanceof p0.q) {
                                        p0.q qVar3 = (p0.q) abstractC4325q9;
                                        if (qVar != null) {
                                            i18 = i15;
                                        }
                                        if (eVar.f41677b.contains(qVar3)) {
                                            linkedHashSet.add(qVar3);
                                            i19 = i14;
                                        }
                                        qVar = qVar3;
                                    } else if ((abstractC4325q9.f37722h0 & 1024) != 0 && (abstractC4325q9 instanceof AbstractC0587p)) {
                                        AbstractC4325q abstractC4325q10 = ((AbstractC0587p) abstractC4325q9).f5816t0;
                                        while (abstractC4325q10 != null) {
                                            if ((abstractC4325q10.f37722h0 & 1024) != 0) {
                                                i14++;
                                                if (i14 == i15) {
                                                    abstractC4325q9 = abstractC4325q10;
                                                } else {
                                                    if (qVar2 == null) {
                                                        qVar2 = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q9 != null) {
                                                        qVar2.b(abstractC4325q9);
                                                        abstractC4325q9 = null;
                                                    }
                                                    qVar2.b(abstractC4325q10);
                                                }
                                            }
                                            abstractC4325q10 = abstractC4325q10.f37725k0;
                                            i15 = 1;
                                        }
                                        int i20 = i15;
                                        if (i14 == i20) {
                                            i15 = i20;
                                            i14 = 0;
                                        }
                                    }
                                    abstractC4325q9 = AbstractC0579h.f(qVar2);
                                    i14 = 0;
                                    i15 = 1;
                                }
                                AbstractC4325q abstractC4325q11 = abstractC4325q8.f37720Y;
                                if (abstractC4325q11.f37732r0) {
                                    C2104h c2104h5 = new C2104h(new AbstractC4325q[16]);
                                    AbstractC4325q abstractC4325q12 = abstractC4325q11.f37725k0;
                                    if (abstractC4325q12 == null) {
                                        AbstractC0579h.b(c2104h5, abstractC4325q11);
                                    } else {
                                        c2104h5.b(abstractC4325q12);
                                    }
                                    while (c2104h5.l()) {
                                        AbstractC4325q abstractC4325q13 = (AbstractC4325q) c2104h5.n(c2104h5.f25569h0 - 1);
                                        if ((abstractC4325q13.f37723i0 & 1024) == 0) {
                                            AbstractC0579h.b(c2104h5, abstractC4325q13);
                                        } else {
                                            while (abstractC4325q13 != null) {
                                                if ((abstractC4325q13.f37722h0 & 1024) != 0) {
                                                    C2104h c2104h6 = null;
                                                    while (abstractC4325q13 != null) {
                                                        if (abstractC4325q13 instanceof p0.q) {
                                                            p0.q qVar4 = (p0.q) abstractC4325q13;
                                                            if (qVar != null) {
                                                                i18 = 1;
                                                            }
                                                            if (eVar.f41677b.contains(qVar4)) {
                                                                linkedHashSet.add(qVar4);
                                                                i19 = 0;
                                                            }
                                                            qVar = qVar4;
                                                        } else if ((abstractC4325q13.f37722h0 & 1024) != 0 && (abstractC4325q13 instanceof AbstractC0587p)) {
                                                            int i21 = 0;
                                                            for (AbstractC4325q abstractC4325q14 = ((AbstractC0587p) abstractC4325q13).f5816t0; abstractC4325q14 != null; abstractC4325q14 = abstractC4325q14.f37725k0) {
                                                                if ((abstractC4325q14.f37722h0 & 1024) != 0) {
                                                                    i21++;
                                                                    if (i21 == 1) {
                                                                        abstractC4325q13 = abstractC4325q14;
                                                                    } else {
                                                                        if (c2104h6 == null) {
                                                                            c2104h6 = new C2104h(new AbstractC4325q[16]);
                                                                        }
                                                                        if (abstractC4325q13 != null) {
                                                                            c2104h6.b(abstractC4325q13);
                                                                            abstractC4325q13 = null;
                                                                        }
                                                                        c2104h6.b(abstractC4325q14);
                                                                    }
                                                                }
                                                            }
                                                            if (i21 != 1) {
                                                                abstractC4325q13 = AbstractC0579h.f(c2104h6);
                                                            }
                                                        }
                                                        abstractC4325q13 = AbstractC0579h.f(c2104h6);
                                                    }
                                                } else {
                                                    abstractC4325q13 = abstractC4325q13.f37725k0;
                                                }
                                            }
                                        }
                                    }
                                    c10 = 16;
                                    if (i19 != 0) {
                                        if (i18 != 0) {
                                            pVar = androidx.compose.ui.focus.a.p(dVar);
                                        } else {
                                            if (qVar != null && (B02 = qVar.B0()) != null) {
                                                pVar2 = B02;
                                            }
                                            pVar = pVar2;
                                        }
                                        dVar.U(pVar);
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                            }
                            c11 = c10;
                            c2104h = null;
                            i14 = 0;
                            i15 = 1;
                        }
                        eVar.f41678c.clear();
                        for (p0.q qVar5 : eVar.f41677b) {
                            if (qVar5.f37732r0) {
                                p0.p B03 = qVar5.B0();
                                qVar5.C0();
                                if (B03 != qVar5.B0() || linkedHashSet.contains(qVar5)) {
                                    androidx.compose.ui.focus.a.C(qVar5);
                                }
                            }
                        }
                        eVar.f41677b.clear();
                        linkedHashSet.clear();
                        if (eVar.f41679d.isEmpty()) {
                            if (eVar.f41678c.isEmpty()) {
                                if (!eVar.f41677b.isEmpty()) {
                                    throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                        }
                        throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                    }
                }
                break;
            case 15:
                ((p0.q) this.f51169Z).A0();
                return;
            case 16:
                C5946J c5946j = (C5946J) this.f51169Z;
                if (c5946j.f46877q0 != c5946j.f46874n0.h()) {
                    return;
                }
                c5946j.f46874n0.i(c5946j.f46874n0.h() + 1);
                return;
            case 19:
                E0.J a5 = ((E0.n0) this.f51169Z).a();
                androidx.compose.ui.node.a aVar = a5.f4012Y;
                if (a5.f4025s0 == aVar.r().size()) {
                    return;
                }
                for (Map.Entry entry : a5.f4017k0.entrySet()) {
                    ((E0.B) entry.getValue()).f3988d = true;
                }
                if (aVar.A()) {
                    return;
                }
                androidx.compose.ui.node.a.p0(aVar, false, 3);
                return;
            case 20:
                F0.e eVar2 = (F0.e) this.f51169Z;
                eVar2.f5028f = false;
                HashSet hashSet = new HashSet();
                C2104h c2104h7 = eVar2.f5026d;
                int i22 = c2104h7.f25569h0;
                C2104h c2104h8 = eVar2.f5027e;
                if (i22 > 0) {
                    Object[] objArr3 = c2104h7.f25567Y;
                    int i23 = 0;
                    do {
                        F0.c cVar = (F0.c) c2104h8.f25567Y[i23];
                        AbstractC4325q abstractC4325q15 = ((androidx.compose.ui.node.a) objArr3[i23]).f24831B0.f5704e;
                        if (abstractC4325q15.f37732r0) {
                            F0.e.b(abstractC4325q15, cVar, hashSet);
                        }
                        i23++;
                    } while (i23 < i22);
                    c2104h7.f();
                    c2104h8.f();
                    C2104h c2104h9 = eVar2.f5024b;
                    i11 = c2104h9.f25569h0;
                    C2104h c2104h10 = eVar2.f5025c;
                    if (i11 <= 0) {
                        Object[] objArr4 = c2104h9.f25567Y;
                        do {
                            C0576e c0576e = (C0576e) objArr4[i14];
                            F0.c cVar2 = (F0.c) c2104h10.f25567Y[i14];
                            if (c0576e.f37732r0) {
                                F0.e.b(c0576e, cVar2, hashSet);
                            }
                            i14++;
                        } while (i14 < i11);
                        c2104h9.f();
                        c2104h10.f();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((C0576e) it.next()).C0();
                        }
                        return;
                    }
                    c2104h9.f();
                    c2104h10.f();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    return;
                }
                c2104h7.f();
                c2104h8.f();
                C2104h c2104h92 = eVar2.f5024b;
                i11 = c2104h92.f25569h0;
                C2104h c2104h102 = eVar2.f5025c;
                if (i11 <= 0) {
                }
            case 21:
                G0.O t10 = ((androidx.compose.ui.node.a) this.f51169Z).t();
                t10.f5661o.f5619A0 = true;
                G0.L l10 = t10.f5662p;
                if (l10 == null) {
                    return;
                }
                l10.f5615w0 = true;
                return;
            case 22:
                G0.M m10 = (G0.M) this.f51169Z;
                G0.O o10 = m10.f5628J0;
                o10.f5657k = 0;
                C2104h J10 = o10.f5647a.J();
                int i24 = J10.f25569h0;
                if (i24 > 0) {
                    Object[] objArr5 = J10.f25567Y;
                    int i25 = 0;
                    do {
                        G0.M z11 = ((androidx.compose.ui.node.a) objArr5[i25]).z();
                        z11.f5630l0 = z11.f5631m0;
                        z11.f5631m0 = Integer.MAX_VALUE;
                        z11.f5642x0 = false;
                        if (z11.f5634p0 == 2) {
                            z11.f5634p0 = 3;
                        }
                        i25++;
                    } while (i25 < i24);
                    m10.A(C0578g.f5744k0);
                    m10.e().p0().b();
                    androidx.compose.ui.node.a aVar2 = m10.f5628J0.f5647a;
                    C2104h J11 = aVar2.J();
                    i12 = J11.f25569h0;
                    if (i12 <= 0) {
                        Object[] objArr6 = J11.f25567Y;
                        do {
                            androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) objArr6[i14];
                            if (aVar3.z().f5630l0 != aVar3.F()) {
                                aVar2.f0();
                                aVar2.M();
                                if (aVar3.F() == Integer.MAX_VALUE) {
                                    aVar3.z().n0();
                                }
                            }
                            i14++;
                        } while (i14 < i12);
                        m10.A(C0578g.f5745l0);
                        return;
                    }
                    m10.A(C0578g.f5745l0);
                    return;
                }
                m10.A(C0578g.f5744k0);
                m10.e().p0().b();
                androidx.compose.ui.node.a aVar22 = m10.f5628J0.f5647a;
                C2104h J112 = aVar22.J();
                i12 = J112.f25569h0;
                if (i12 <= 0) {
                }
            case 23:
                G0.O o11 = (G0.O) this.f51169Z;
                o11.a().o(o11.f5663q);
                return;
            case 24:
                G0.g0 g0Var = ((G0.g0) this.f51169Z).f5772p0;
                if (g0Var == null) {
                    return;
                }
                g0Var.L0();
                return;
        }
        while (true) {
            C3876A c3876a2 = (C3876A) this.f51169Z;
            synchronized (c3876a2.f35831f) {
                if (!c3876a2.f35828c) {
                    c3876a2.f35828c = true;
                    try {
                        C2104h c2104h11 = c3876a2.f35831f;
                        int i26 = c2104h11.f25569h0;
                        if (i26 > 0) {
                            try {
                                Object[] objArr7 = c2104h11.f25567Y;
                                int i27 = 0;
                                while (true) {
                                    try {
                                        j0.z zVar = (j0.z) objArr7[i27];
                                        C6074u c6074u = zVar.f35948g;
                                        Object[] objArr8 = c6074u.f47643b;
                                        long[] jArr = c6074u.f47642a;
                                        int length = jArr.length - i13;
                                        if (length >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j6 = jArr[i28];
                                                c3876a = c3876a2;
                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8;
                                                    int i30 = 8 - ((~(i28 - length)) >>> 31);
                                                    int i31 = 0;
                                                    while (i31 < i30) {
                                                        if ((j6 & 255) < 128) {
                                                            try {
                                                                objArr2 = objArr7;
                                                                zVar.f35942a.invoke(objArr8[(i28 << 3) + i31]);
                                                                i10 = 8;
                                                                continue;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                c3876a2 = c3876a;
                                                                c3876a2.f35828c = false;
                                                                throw th;
                                                            }
                                                        } else {
                                                            objArr2 = objArr7;
                                                            i10 = i29;
                                                            continue;
                                                        }
                                                        j6 >>= i10;
                                                        i31++;
                                                        i29 = i10;
                                                        objArr7 = objArr2;
                                                    }
                                                    objArr = objArr7;
                                                    if (i30 == i29) {
                                                    }
                                                } else {
                                                    objArr = objArr7;
                                                }
                                                if (i28 != length) {
                                                    i28++;
                                                    c3876a2 = c3876a;
                                                    objArr7 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr7;
                                            c3876a = c3876a2;
                                        }
                                        c6074u.d();
                                        i27++;
                                        c3876a2 = c3876a;
                                        if (i27 < i26) {
                                            objArr7 = objArr;
                                            i13 = 2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c3876a2.f35828c = false;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c3876a = c3876a2;
                            }
                        }
                        c3876a2.f35828c = false;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
            if (!C3876A.a((C3876A) this.f51169Z)) {
                return;
            }
            i13 = 2;
        }
    }
}
