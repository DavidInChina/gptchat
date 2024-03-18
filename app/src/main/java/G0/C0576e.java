package G0;

import B.AbstractC0168u1;
import B0.C0194k;
import B0.EnumC0195l;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import G.C0547b;
import H0.C0714y;
import android.os.SystemClock;
import android.view.MotionEvent;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.AbstractC3953c;
import l0.AbstractC4324p;
import l0.AbstractC4325q;
import nf.C4833m;
import o0.AbstractC4866a;
import o0.AbstractC4871f;
import t0.AbstractC5646e;
import y.C6483v;

/* renamed from: G0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0576e extends AbstractC4325q implements C, AbstractC0590t, v0, t0, F0.f, F0.h, s0, B, AbstractC0591u, p0.d, p0.k, p0.m, q0, AbstractC4866a {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC4324p f5726s0;

    /* renamed from: t0  reason: collision with root package name */
    public F0.a f5727t0;

    /* renamed from: u0  reason: collision with root package name */
    public HashSet f5728u0;

    @Override // G0.t0
    public final void A() {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", abstractC4324p);
        B0.C c10 = ((B0.D) ((B0.z) abstractC4324p)).f1594e;
        if (c10.f1589b == 2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            B0.D d10 = c10.f1590c;
            B0.B b10 = new B0.B(d10, 1);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            b10.invoke(obtain);
            obtain.recycle();
            c10.f1589b = 1;
            d10.f1593d = false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, F0.a] */
    public final void A0(boolean z10) {
        if (this.f37732r0) {
            AbstractC4324p abstractC4324p = this.f5726s0;
            if ((this.f37722h0 & 32) != 0) {
                if (abstractC4324p instanceof F0.d) {
                    C0575d c0575d = new C0575d(this, 0);
                    C2104h c2104h = ((C0714y) AbstractC0579h.B(this)).f7124r1;
                    if (!c2104h.g(c0575d)) {
                        c2104h.b(c0575d);
                    }
                }
                if (abstractC4324p instanceof F0.g) {
                    F0.g gVar = (F0.g) abstractC4324p;
                    F0.a aVar = this.f5727t0;
                    if (aVar != null && aVar.G0(gVar.getKey())) {
                        aVar.f5020h = gVar;
                        F0.e modifierLocalManager = ((C0714y) AbstractC0579h.B(this)).getModifierLocalManager();
                        F0.i key = gVar.getKey();
                        modifierLocalManager.f5024b.b(this);
                        modifierLocalManager.f5025c.b(key);
                        modifierLocalManager.a();
                    } else {
                        ?? obj = new Object();
                        obj.f5020h = gVar;
                        this.f5727t0 = obj;
                        if (AbstractC0579h.d(this)) {
                            F0.e modifierLocalManager2 = ((C0714y) AbstractC0579h.B(this)).getModifierLocalManager();
                            F0.i key2 = gVar.getKey();
                            modifierLocalManager2.f5024b.b(this);
                            modifierLocalManager2.f5025c.b(key2);
                            modifierLocalManager2.a();
                        }
                    }
                }
            }
            if ((this.f37722h0 & 4) != 0 && !z10) {
                AbstractC0579h.z(this, 2).L0();
            }
            if ((this.f37722h0 & 2) != 0) {
                if (AbstractC0579h.d(this)) {
                    g0 g0Var = this.f37727m0;
                    AbstractC3557B.Z(g0Var);
                    ((D) g0Var).f5592L0 = this;
                    n0 n0Var = g0Var.f5769F0;
                    if (n0Var != null) {
                        n0Var.invalidate();
                    }
                }
                if (!z10) {
                    AbstractC0579h.z(this, 2).L0();
                    AbstractC0579h.A(this).O();
                }
            }
            if (abstractC4324p instanceof E0.h0) {
                androidx.compose.ui.node.a A10 = AbstractC0579h.A(this);
                F.E e10 = (F.E) ((E0.h0) abstractC4324p);
                int i10 = e10.f4855b;
                AbstractC0168u1 abstractC0168u1 = e10.f4856c;
                switch (i10) {
                    case 0:
                        ((F.J) abstractC0168u1).f4884n = A10;
                        break;
                    default:
                        ((H.F) abstractC0168u1).f6568w.setValue(A10);
                        break;
                }
            }
            if ((this.f37722h0 & 128) != 0 && (abstractC4324p instanceof E0.Y) && AbstractC0579h.d(this)) {
                AbstractC0579h.A(this).O();
            }
            if ((this.f37722h0 & 256) != 0 && (abstractC4324p instanceof E0.W) && AbstractC0579h.d(this)) {
                AbstractC0579h.A(this).O();
            }
            int i11 = this.f37722h0;
            if ((i11 & 16) != 0 && (abstractC4324p instanceof B0.z)) {
                ((B0.D) ((B0.z) abstractC4324p)).f1594e.f1588a = this.f37727m0;
            }
            if ((i11 & 8) != 0) {
                ((C0714y) AbstractC0579h.B(this)).u();
                return;
            }
            return;
        }
        throw new IllegalStateException("initializeModifier called on unattached node".toString());
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void B0() {
        if (this.f37732r0) {
            AbstractC4324p abstractC4324p = this.f5726s0;
            if ((this.f37722h0 & 32) != 0) {
                if (abstractC4324p instanceof F0.g) {
                    F0.e modifierLocalManager = ((C0714y) AbstractC0579h.B(this)).getModifierLocalManager();
                    F0.i key = ((F0.g) abstractC4324p).getKey();
                    modifierLocalManager.f5026d.b(AbstractC0579h.A(this));
                    modifierLocalManager.f5027e.b(key);
                    modifierLocalManager.a();
                }
                if (abstractC4324p instanceof F0.d) {
                    ((F0.d) abstractC4324p).b(AbstractC0579h.f5783a);
                }
            }
            if ((this.f37722h0 & 8) != 0) {
                ((C0714y) AbstractC0579h.B(this)).u();
                return;
            }
            return;
        }
        throw new IllegalStateException("unInitializeModifier called on unattached node".toString());
    }

    public final void C0() {
        if (this.f37732r0) {
            this.f5728u0.clear();
            ((C0714y) AbstractC0579h.B(this)).getSnapshotObserver().a(this, C0578g.f5740Z, new C0575d(this, 1));
        }
    }

    @Override // G0.AbstractC0590t
    public final void G() {
        AbstractC0579h.t(this);
    }

    @Override // G0.t0
    public final void H() {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", abstractC4324p);
        ((B0.D) ((B0.z) abstractC4324p)).f1594e.getClass();
    }

    @Override // F0.f
    public final Bi.c M() {
        F0.a aVar = this.f5727t0;
        if (aVar == null) {
            return F0.b.f5021h;
        }
        return aVar;
    }

    @Override // G0.t0
    public final void N() {
        A();
    }

    @Override // p0.k
    public final void S(p0.i iVar) {
        throw new IllegalStateException("applyFocusProperties called on wrong node".toString());
    }

    @Override // p0.d
    public final void U(p0.p pVar) {
        throw new IllegalStateException("onFocusEvent called on wrong node".toString());
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier", abstractC4324p);
        L0.j k10 = ((L0.k) abstractC4324p).k();
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration", jVar);
        if (k10.f10410Z) {
            jVar.f10410Z = true;
        }
        if (k10.f10411h0) {
            jVar.f10411h0 = true;
        }
        for (Map.Entry entry : k10.f10409Y.entrySet()) {
            L0.u uVar = (L0.u) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = jVar.f10409Y;
            if (!linkedHashMap.containsKey(uVar)) {
                linkedHashMap.put(uVar, value);
            } else if (value instanceof L0.a) {
                Object obj = linkedHashMap.get(uVar);
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", obj);
                L0.a aVar = (L0.a) obj;
                String str = aVar.f10368a;
                if (str == null) {
                    str = ((L0.a) value).f10368a;
                }
                AbstractC3953c abstractC3953c = aVar.f10369b;
                if (abstractC3953c == null) {
                    abstractC3953c = ((L0.a) value).f10369b;
                }
                linkedHashMap.put(uVar, new L0.a(str, abstractC3953c));
            }
        }
    }

    @Override // F0.f, F0.h
    public final Object a(F0.i iVar) {
        C0572a0 c0572a0;
        this.f5728u0.add(iVar);
        AbstractC4325q abstractC4325q = this.f37720Y;
        if (abstractC4325q.f37732r0) {
            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
            androidx.compose.ui.node.a A10 = AbstractC0579h.A(this);
            while (A10 != null) {
                if ((A10.f24831B0.f5704e.f37723i0 & 32) != 0) {
                    while (abstractC4325q2 != null) {
                        if ((abstractC4325q2.f37722h0 & 32) != 0) {
                            AbstractC4325q abstractC4325q3 = abstractC4325q2;
                            C2104h c2104h = null;
                            while (abstractC4325q3 != null) {
                                if (abstractC4325q3 instanceof F0.f) {
                                    F0.f fVar = (F0.f) abstractC4325q3;
                                    if (fVar.M().G0(iVar)) {
                                        return fVar.M().N0(iVar);
                                    }
                                } else if ((abstractC4325q3.f37722h0 & 32) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 32) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q3 = abstractC4325q4;
                                            } else {
                                                if (c2104h == null) {
                                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q3 != null) {
                                                    c2104h.b(abstractC4325q3);
                                                    abstractC4325q3 = null;
                                                }
                                                c2104h.b(abstractC4325q4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q3 = AbstractC0579h.f(c2104h);
                            }
                            continue;
                        }
                        abstractC4325q2 = abstractC4325q2.f37724j0;
                    }
                }
                A10 = A10.E();
                if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                    abstractC4325q2 = c0572a0.f5703d;
                } else {
                    abstractC4325q2 = null;
                }
            }
            return iVar.f5022a.mo122invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // o0.AbstractC4866a
    public final Z0.b b() {
        return AbstractC0579h.A(this).f24859w0;
    }

    @Override // G0.AbstractC0591u
    public final void b0(g0 g0Var) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier", abstractC4324p);
        C0547b c0547b = (C0547b) ((E0.W) abstractC4324p);
        if (!c0547b.f5484b) {
            c0547b.f5484b = true;
            C4833m c4833m = c0547b.f5485c;
            if (c4833m != null) {
                c4833m.resumeWith(jf.y.f36177a);
            }
            c0547b.f5485c = null;
        }
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", abstractC4324p);
        return ((AbstractC0466z) abstractC4324p).c(abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", abstractC4324p);
        return ((AbstractC0466z) abstractC4324p).d(abstractC0459s, rVar, i10);
    }

    @Override // G0.t0
    public final boolean d0() {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", abstractC4324p);
        ((B0.D) ((B0.z) abstractC4324p)).f1594e.getClass();
        return true;
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", abstractC4324p);
        return ((AbstractC0466z) abstractC4324p).e(p10, m10, j6);
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier", abstractC4324p);
        ((AbstractC4871f) abstractC4324p).f(abstractC5646e);
    }

    @Override // o0.AbstractC4866a
    public final long g() {
        return Ng.H.z(AbstractC0579h.z(this, 128).f4055h0);
    }

    @Override // o0.AbstractC4866a
    public final Z0.l getLayoutDirection() {
        return AbstractC0579h.A(this).f24860x0;
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", abstractC4324p);
        return ((AbstractC0466z) abstractC4324p).h(abstractC0459s, rVar, i10);
    }

    @Override // G0.t0
    public final void h0() {
        A();
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", abstractC4324p);
        return ((AbstractC0466z) abstractC4324p).i(abstractC0459s, rVar, i10);
    }

    @Override // G0.v0
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // G0.s0
    public final Object n0(Object obj) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier", abstractC4324p);
        return (C6483v) ((E0.a0) abstractC4324p);
    }

    @Override // G0.B
    public final void o(long j6) {
        AbstractC4324p abstractC4324p = this.f5726s0;
        if (abstractC4324p instanceof E0.Y) {
            E0.Z z10 = (E0.Z) ((E0.Y) abstractC4324p);
            if (!Z0.k.a(z10.f4046f, j6)) {
                z10.f4045e.invoke(new Z0.k(j6));
                z10.f4046f = j6;
            }
        }
    }

    @Override // G0.q0
    public final boolean q() {
        return this.f37732r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // G0.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        boolean z10;
        int i10;
        EnumC0195l enumC0195l2;
        AbstractC4324p abstractC4324p = this.f5726s0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", abstractC4324p);
        B0.C c10 = ((B0.D) ((B0.z) abstractC4324p)).f1594e;
        c10.getClass();
        B0.D d10 = c10.f1590c;
        boolean z11 = d10.f1593d;
        List list = c0194k.f1652a;
        if (!z11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                B0.u uVar = (B0.u) list.get(i11);
                if (!r9.y.W(uVar) && !r9.y.Y(uVar)) {
                }
            }
            z10 = false;
            i10 = c10.f1589b;
            enumC0195l2 = EnumC0195l.f1658h0;
            if (i10 != 3) {
                if (enumC0195l == EnumC0195l.f1656Y && z10) {
                    c10.a(c0194k);
                }
                if (enumC0195l == enumC0195l2 && !z10) {
                    c10.a(c0194k);
                }
            }
            if (enumC0195l != enumC0195l2) {
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (!r9.y.Y((B0.u) list.get(i12))) {
                        return;
                    }
                }
                c10.f1589b = 1;
                d10.f1593d = false;
                return;
            }
            return;
        }
        z10 = true;
        i10 = c10.f1589b;
        enumC0195l2 = EnumC0195l.f1658h0;
        if (i10 != 3) {
        }
        if (enumC0195l != enumC0195l2) {
        }
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        A0(true);
    }

    public final String toString() {
        return this.f5726s0.toString();
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        B0();
    }

    @Override // G0.B
    public final void I(g0 g0Var) {
    }
}
