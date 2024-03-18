package hb;

import Df.AbstractC0405d;
import G.I;
import H0.E0;
import H0.Z;
import N.D;
import W.Z0;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.l1;
import android.content.Context;
import androidx.lifecycle.e0;
import bb.j0;
import gd.AbstractC3256b;
import id.AbstractC3557B;
import java.util.List;
import kotlin.jvm.internal.C;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p9.AbstractC5102d;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.AbstractC6704j;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final float f32126a = -300;

    /* renamed from: b  reason: collision with root package name */
    public static final float f32127b = 70;

    /* renamed from: c  reason: collision with root package name */
    public static final float f32128c = p9.q.f42833d - 8;

    static {
        float f6 = p9.q.f42830a;
    }

    public static final void a(wf.k kVar, t tVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC3557B.c0("state", tVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("AudioMessageController");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1972989532);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(kVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(tVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            if (i16 != 0) {
                abstractC4326r = a5;
            }
            A7.b.k(R.a.q(AbstractC5102d.f42765b, Z0.f19875a), R4.b.X(rVar, 1619777124, new D(abstractC4326r, kVar, tVar, 18)), rVar, 48);
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new j0(kVar, tVar, abstractC4326r2, i10, i11, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Tc.f fVar, wf.k kVar, AbstractC4326r abstractC4326r, u uVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        u uVar2;
        u uVar3;
        AbstractC4326r abstractC4326r3;
        int i13;
        int i14;
        u uVar4;
        AbstractC1710f0 abstractC1710f0;
        float f6;
        boolean g10;
        Object K10;
        Ad.g y02;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC3557B.c0("appState", fVar);
        AbstractC3557B.c0("onMessageAudioIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("MessageAudioNotification");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1395398478);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    uVar2 = uVar;
                    if (rVar.g(uVar2)) {
                        i15 = 2048;
                        i12 |= i15;
                    }
                } else {
                    uVar2 = uVar;
                }
                i15 = 1024;
                i12 |= i15;
            } else {
                uVar2 = uVar;
            }
            if ((i12 & 5851) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                uVar3 = uVar2;
            } else {
                rVar.R();
                i13 = i10 & 1;
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    i14 = i12;
                    a5 = abstractC4326r2;
                } else {
                    if (i19 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if ((i11 & 8) == 0) {
                        rVar.W(-490350905);
                        Context context = (Context) rVar.m(Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                        List list = (List) rVar.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar.m(Ad.k.f814a);
                        e0 a10 = m2.b.a(rVar);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = C.f37623a;
                            AbstractC0405d b10 = d10.b(u.class);
                            AbstractC4326r abstractC4326r4 = a5;
                            AbstractC0405d b11 = d10.b(t.class);
                            rVar.W(608026872);
                            boolean g11 = rVar.g(b11) | rVar.g(b10) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K11 = rVar.K();
                            if (g11 || K11 == iVar) {
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(t.class), d10.b(u.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(u.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K11 = y02;
                                rVar.h0(K11);
                            }
                            rVar.t(false);
                            rVar.t(false);
                            uVar4 = (u) ((Ad.g) K11);
                            i14 = i12 & (-7169);
                            a5 = abstractC4326r4;
                            rVar.u();
                            AbstractC1734s.e(uVar4, new q(uVar4, fVar, null), rVar);
                            t tVar = (t) AbstractC4828h.z(uVar4.f808e, rVar).getValue();
                            abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, m.f32112h0, rVar, 6);
                            if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                                f6 = f32127b;
                            } else {
                                f6 = f32126a;
                            }
                            l1 a11 = AbstractC6704j.a(f6, AbstractC6696f.v(500, 0, AbstractC6657D.f51125a, 2), "animate player entrance", rVar, 384, 8);
                            Z0.e eVar = new Z0.e(((Z0.e) a11.getValue()).f22788Y);
                            rVar.W(1206963090);
                            g10 = rVar.g(a11) | rVar.g(abstractC1710f0);
                            K10 = rVar.K();
                            if (!g10 || K10 == iVar) {
                                K10 = new r(a11, abstractC1710f0, null);
                                rVar.h0(K10);
                            }
                            rVar.t(false);
                            AbstractC1734s.e(eVar, (wf.n) K10, rVar);
                            a(kVar, tVar, androidx.compose.foundation.layout.a.p(a5, ((Z0.e) a11.getValue()).f22788Y), rVar, (i14 >> 3) & 14, 0);
                            abstractC4326r3 = a5;
                            uVar3 = uVar4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        i14 = i12;
                    }
                }
                uVar4 = uVar2;
                rVar.u();
                AbstractC1734s.e(uVar4, new q(uVar4, fVar, null), rVar);
                t tVar2 = (t) AbstractC4828h.z(uVar4.f808e, rVar).getValue();
                abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, m.f32112h0, rVar, 6);
                if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                }
                l1 a112 = AbstractC6704j.a(f6, AbstractC6696f.v(500, 0, AbstractC6657D.f51125a, 2), "animate player entrance", rVar, 384, 8);
                Z0.e eVar2 = new Z0.e(((Z0.e) a112.getValue()).f22788Y);
                rVar.W(1206963090);
                g10 = rVar.g(a112) | rVar.g(abstractC1710f0);
                K10 = rVar.K();
                if (!g10) {
                }
                K10 = new r(a112, abstractC1710f0, null);
                rVar.h0(K10);
                rVar.t(false);
                AbstractC1734s.e(eVar2, (wf.n) K10, rVar);
                a(kVar, tVar2, androidx.compose.foundation.layout.a.p(a5, ((Z0.e) a112.getValue()).f22788Y), rVar, (i14 >> 3) & 14, 0);
                abstractC4326r3 = a5;
                uVar3 = uVar4;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new I(fVar, kVar, abstractC4326r3, uVar3, i10, i11, 15);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        rVar.R();
        i13 = i10 & 1;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
    }
}
