package n0;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.x0;
import G0.y0;
import H0.C0702s;
import android.view.DragEvent;
import b0.C2104h;
import h.C3281g;
import id.AbstractC3557B;
import kotlin.jvm.internal.m;
import l0.AbstractC4325q;
import w.C6077x;

/* renamed from: n0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4708g extends AbstractC4325q implements y0, AbstractC4705d {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC4705d f39587s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC4705d f39588t0;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean A0(C4703b c4703b) {
        if (!this.f37732r0) {
            return false;
        }
        if (this.f39588t0 == null) {
            this.f39588t0 = (AbstractC4705d) C0702s.f7031o0.invoke(c4703b);
            ?? obj = new Object();
            AbstractC0579h.E(this, new C3281g(obj, c4703b, this, 20));
            if (!obj.f37645Y && this.f39588t0 == null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
    }

    public final boolean B0(C4703b c4703b) {
        AbstractC4705d abstractC4705d = this.f39587s0;
        if (abstractC4705d == null) {
            AbstractC4705d abstractC4705d2 = this.f39588t0;
            if (abstractC4705d2 != null) {
                return ((C4708g) abstractC4705d2).B0(c4703b);
            }
            return false;
        }
        return ((C4708g) abstractC4705d).B0(c4703b);
    }

    public final void C0(C4703b c4703b) {
        if (!this.f37720Y.f37732r0) {
            return;
        }
        AbstractC0579h.E(this, new C6077x(24, c4703b));
        AbstractC4705d abstractC4705d = this.f39588t0;
        if (abstractC4705d != null) {
            ((C4708g) abstractC4705d).C0(c4703b);
        }
        this.f39588t0 = null;
        this.f39587s0 = null;
    }

    public final void D0(C4703b c4703b) {
        AbstractC4705d abstractC4705d = this.f39588t0;
        if (abstractC4705d == null) {
            AbstractC4705d abstractC4705d2 = this.f39587s0;
            if (abstractC4705d2 != null) {
                ((C4708g) abstractC4705d2).D0(c4703b);
                return;
            }
            return;
        }
        ((C4708g) abstractC4705d).D0(c4703b);
    }

    public final void E0(C4703b c4703b) {
        AbstractC4705d abstractC4705d = this.f39588t0;
        if (abstractC4705d != null) {
            ((C4708g) abstractC4705d).E0(c4703b);
        }
        AbstractC4705d abstractC4705d2 = this.f39587s0;
        if (abstractC4705d2 != null) {
            ((C4708g) abstractC4705d2).E0(c4703b);
        }
        this.f39587s0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(C4703b c4703b) {
        AbstractC4705d abstractC4705d;
        x0 x0Var;
        AbstractC4705d abstractC4705d2 = this.f39587s0;
        if (abstractC4705d2 != null) {
            DragEvent dragEvent = c4703b.f39584a;
            if (m.i(abstractC4705d2, R4.b.r(dragEvent.getX(), dragEvent.getY()))) {
                abstractC4705d = abstractC4705d2;
                if (abstractC4705d == null && abstractC4705d2 == null) {
                    AbstractC4705d abstractC4705d3 = this.f39588t0;
                    if (abstractC4705d3 != null) {
                        ((C4708g) abstractC4705d3).E0(c4703b);
                    }
                    C4708g c4708g = (C4708g) abstractC4705d;
                    c4708g.D0(c4703b);
                    c4708g.F0(c4703b);
                } else if (abstractC4705d != null && abstractC4705d2 != null) {
                    ((C4708g) abstractC4705d2).E0(c4703b);
                    AbstractC4705d abstractC4705d4 = this.f39588t0;
                    if (abstractC4705d4 != null) {
                        C4708g c4708g2 = (C4708g) abstractC4705d4;
                        c4708g2.D0(c4703b);
                        c4708g2.F0(c4703b);
                    }
                } else if (AbstractC3557B.K(abstractC4705d, abstractC4705d2)) {
                    if (abstractC4705d2 != null) {
                        ((C4708g) abstractC4705d2).E0(c4703b);
                    }
                    if (abstractC4705d != null) {
                        C4708g c4708g3 = (C4708g) abstractC4705d;
                        c4708g3.D0(c4703b);
                        c4708g3.F0(c4703b);
                    }
                } else if (abstractC4705d != null) {
                    ((C4708g) abstractC4705d).F0(c4703b);
                } else {
                    AbstractC4705d abstractC4705d5 = this.f39588t0;
                    if (abstractC4705d5 != null) {
                        ((C4708g) abstractC4705d5).F0(c4703b);
                    }
                }
                this.f39587s0 = abstractC4705d;
            }
        }
        AbstractC4325q abstractC4325q = this.f37720Y;
        boolean z10 = abstractC4325q.f37732r0;
        if (!z10) {
            abstractC4705d = null;
        } else {
            ?? obj = new Object();
            C4706e c4706e = C4706e.f39585a;
            C3281g c3281g = new C3281g(obj, this, c4703b, 21);
            if (z10) {
                C2104h c2104h = new C2104h(new AbstractC4325q[16]);
                AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
                if (abstractC4325q2 == null) {
                    AbstractC0579h.b(c2104h, abstractC4325q);
                } else {
                    c2104h.b(abstractC4325q2);
                }
                loop0: while (c2104h.l()) {
                    AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                    int i10 = 262144;
                    if ((abstractC4325q3.f37723i0 & 262144) != 0) {
                        AbstractC4325q abstractC4325q4 = abstractC4325q3;
                        while (abstractC4325q4 != null) {
                            if ((abstractC4325q4.f37722h0 & i10) != 0) {
                                AbstractC4325q abstractC4325q5 = abstractC4325q4;
                                C2104h c2104h2 = null;
                                while (abstractC4325q5 != null) {
                                    if (abstractC4325q5 instanceof y0) {
                                        y0 y0Var = (y0) abstractC4325q5;
                                        if (AbstractC3557B.K(c4706e, y0Var.m())) {
                                            x0Var = (x0) c3281g.invoke(y0Var);
                                        } else {
                                            x0Var = x0.f5841Y;
                                        }
                                        if (x0Var != x0.f5843h0) {
                                            if (x0Var == x0.f5842Z) {
                                                break;
                                            }
                                        } else {
                                            break loop0;
                                        }
                                    } else if ((abstractC4325q5.f37722h0 & i10) != 0 && (abstractC4325q5 instanceof AbstractC0587p)) {
                                        AbstractC4325q abstractC4325q6 = ((AbstractC0587p) abstractC4325q5).f5816t0;
                                        int i11 = 0;
                                        while (abstractC4325q6 != null) {
                                            if ((abstractC4325q6.f37722h0 & i10) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    abstractC4325q5 = abstractC4325q6;
                                                } else {
                                                    if (c2104h2 == null) {
                                                        c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q5 != null) {
                                                        c2104h2.b(abstractC4325q5);
                                                        abstractC4325q5 = null;
                                                    }
                                                    c2104h2.b(abstractC4325q6);
                                                    abstractC4325q6 = abstractC4325q6.f37725k0;
                                                    i10 = 262144;
                                                }
                                            }
                                            abstractC4325q6 = abstractC4325q6.f37725k0;
                                            i10 = 262144;
                                        }
                                        if (i11 == 1) {
                                            i10 = 262144;
                                        }
                                    }
                                    abstractC4325q5 = AbstractC0579h.f(c2104h2);
                                    i10 = 262144;
                                }
                                continue;
                            }
                            abstractC4325q4 = abstractC4325q4.f37725k0;
                            i10 = 262144;
                        }
                    }
                    AbstractC0579h.b(c2104h, abstractC4325q3);
                }
                abstractC4705d = (AbstractC4705d) obj.f37622Y;
            } else {
                throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
            }
        }
        if (abstractC4705d == null) {
        }
        if (abstractC4705d != null) {
        }
        if (AbstractC3557B.K(abstractC4705d, abstractC4705d2)) {
        }
        this.f39587s0 = abstractC4705d;
    }

    public final void G0(C4703b c4703b) {
        AbstractC4705d abstractC4705d = this.f39588t0;
        if (abstractC4705d == null) {
            AbstractC4705d abstractC4705d2 = this.f39587s0;
            if (abstractC4705d2 != null) {
                ((C4708g) abstractC4705d2).G0(c4703b);
                return;
            }
            return;
        }
        ((C4708g) abstractC4705d).G0(c4703b);
    }

    @Override // G0.y0
    public final Object m() {
        return C4706e.f39585a;
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        this.f39588t0 = null;
        this.f39587s0 = null;
    }
}
