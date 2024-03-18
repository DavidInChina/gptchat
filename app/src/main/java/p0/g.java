package p0;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0572a0;
import G0.X;
import L.C0841c0;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import p0.g;
import p0.q;
import w.C6071r;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: b  reason: collision with root package name */
    public final e f41682b;

    /* renamed from: e  reason: collision with root package name */
    public Z0.l f41685e;

    /* renamed from: f  reason: collision with root package name */
    public C6071r f41686f;

    /* renamed from: a  reason: collision with root package name */
    public final q f41681a = new q();

    /* renamed from: c  reason: collision with root package name */
    public final r f41683c = new r();

    /* renamed from: d  reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f41684d = new X() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // G0.X
        public final int hashCode() {
            return g.this.f41681a.hashCode();
        }

        @Override // G0.X
        public final AbstractC4325q j() {
            return g.this.f41681a;
        }

        @Override // G0.X
        public final /* bridge */ /* synthetic */ void m(AbstractC4325q abstractC4325q) {
            q qVar = (q) abstractC4325q;
        }
    };

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public g(H0.r rVar) {
        this.f41682b = new e(rVar);
    }

    public final void a(boolean z10, boolean z11) {
        p pVar;
        int f6;
        r rVar = this.f41683c;
        try {
            if (rVar.f41716c) {
                r.a(rVar);
            }
            rVar.f41716c = true;
            q qVar = this.f41681a;
            if (!z10 && ((f6 = AbstractC6708l.f(androidx.compose.ui.focus.a.w(qVar, 8))) == 1 || f6 == 2 || f6 == 3)) {
                r.b(rVar);
                return;
            }
            p B02 = qVar.B0();
            if (androidx.compose.ui.focus.a.d(qVar, z10, z11)) {
                int ordinal = B02.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        pVar = p.f41709h0;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    pVar = p.f41707Y;
                }
                qVar.E0(pVar);
            }
            r.b(rVar);
        } catch (Throwable th2) {
            r.b(rVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0258, code lost:
        if (b(r18) == false) goto L178;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i10) {
        l lVar;
        boolean z10;
        boolean z11;
        q qVar;
        q qVar2;
        C0572a0 c0572a0;
        Boolean J10;
        q qVar3 = this.f41681a;
        q f6 = androidx.compose.ui.focus.a.f(qVar3);
        if (f6 == null) {
            return false;
        }
        Z0.l lVar2 = this.f41685e;
        if (lVar2 != null) {
            j A02 = f6.A0();
            int i11 = 4;
            if (c.a(i10, 1)) {
                lVar = A02.f41693b;
            } else if (c.a(i10, 2)) {
                lVar = A02.f41694c;
            } else if (c.a(i10, 5)) {
                lVar = A02.f41695d;
            } else if (c.a(i10, 6)) {
                lVar = A02.f41696e;
            } else if (c.a(i10, 3)) {
                int ordinal = lVar2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        lVar = A02.f41700i;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    lVar = A02.f41699h;
                }
                if (lVar == l.f41703b) {
                    lVar = null;
                }
                if (lVar == null) {
                    lVar = A02.f41697f;
                }
            } else if (c.a(i10, 4)) {
                int ordinal2 = lVar2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        lVar = A02.f41699h;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    lVar = A02.f41700i;
                }
                if (lVar == l.f41703b) {
                    lVar = null;
                }
                if (lVar == null) {
                    lVar = A02.f41698g;
                }
            } else if (c.a(i10, 7)) {
                lVar = (l) A02.f41701j.invoke(new c(i10));
            } else if (c.a(i10, 8)) {
                lVar = (l) A02.f41702k.invoke(new c(i10));
            } else {
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            if (lVar != l.f41703b) {
                if (lVar != l.f41704c && lVar.a()) {
                    return true;
                }
                return false;
            }
            ?? obj = new Object();
            Z0.l lVar3 = this.f41685e;
            if (lVar3 != null) {
                C0841c0 c0841c0 = new C0841c0(f6, this, i10, obj);
                if (c.a(i10, 1) || c.a(i10, 2)) {
                    if (c.a(i10, 1)) {
                        z10 = androidx.compose.ui.focus.a.k(qVar3, c0841c0);
                    } else if (c.a(i10, 2)) {
                        z10 = androidx.compose.ui.focus.a.a(qVar3, c0841c0);
                    } else {
                        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                    }
                } else if (c.a(i10, 3) || c.a(i10, 4) || c.a(i10, 5) || c.a(i10, 6)) {
                    Boolean J11 = androidx.compose.ui.focus.a.J(qVar3, i10, c0841c0);
                    if (J11 != null) {
                        z10 = J11.booleanValue();
                    }
                    z10 = false;
                } else if (c.a(i10, 7)) {
                    int ordinal3 = lVar3.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            i11 = 3;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    q f10 = androidx.compose.ui.focus.a.f(qVar3);
                    if (f10 != null && (J10 = androidx.compose.ui.focus.a.J(f10, i11, c0841c0)) != null) {
                        z10 = J10.booleanValue();
                    }
                    z10 = false;
                } else if (c.a(i10, 8)) {
                    q f11 = androidx.compose.ui.focus.a.f(qVar3);
                    if (f11 != null) {
                        AbstractC4325q abstractC4325q = f11.f37720Y;
                        if (abstractC4325q.f37732r0) {
                            AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
                            androidx.compose.ui.node.a A10 = AbstractC0579h.A(f11);
                            loop0: while (true) {
                                if (A10 != null) {
                                    if ((A10.f24831B0.f5704e.f37723i0 & 1024) != 0) {
                                        while (abstractC4325q2 != null) {
                                            if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                                                AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                                C2104h c2104h = null;
                                                while (abstractC4325q3 != null) {
                                                    if (abstractC4325q3 instanceof q) {
                                                        q qVar4 = (q) abstractC4325q3;
                                                        if (qVar4.A0().f41692a) {
                                                            qVar2 = qVar4;
                                                            break loop0;
                                                        }
                                                    } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                                        int i12 = 0;
                                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                            if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                                                i12++;
                                                                if (i12 == 1) {
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
                                                        if (i12 == 1) {
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
                                } else {
                                    qVar2 = null;
                                    break;
                                }
                            }
                            qVar = qVar2;
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                    } else {
                        qVar = null;
                    }
                    if (qVar != null && !AbstractC3557B.K(qVar, qVar3)) {
                        z10 = ((Boolean) c0841c0.invoke(qVar)).booleanValue();
                    }
                    z10 = false;
                } else {
                    throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) c.b(i10))).toString());
                }
                if (!obj.f37645Y) {
                    if (!z10) {
                        int ordinal4 = qVar3.B0().ordinal();
                        if (ordinal4 != 0 && ordinal4 != 1 && ordinal4 != 2) {
                            if (ordinal4 != 3) {
                                throw new RuntimeException();
                            }
                        } else if (!qVar3.B0().a() && (c.a(i10, 1) || c.a(i10, 2))) {
                            z11 = false;
                            a(false, true);
                            if (qVar3.B0().a()) {
                            }
                            return z11;
                        }
                    }
                    return true;
                }
                z11 = false;
                return z11;
            }
            AbstractC3557B.C2("layoutDirection");
            throw null;
        }
        AbstractC3557B.C2("layoutDirection");
        throw null;
    }
}
