package c1;

import A.C0033n0;
import A.C0043t;
import G.U;
import G0.A0;
import G0.AbstractC0584m;
import G0.C0571a;
import G0.C0581j;
import G0.C0583l;
import H0.AbstractC0701r0;
import H0.C0717z0;
import H0.Z;
import H1.t;
import H1.v;
import H1.w;
import H1.x;
import L3.C0889a;
import L3.D;
import N.C1025i;
import Pg.C;
import Pg.C1171d;
import U3.u;
import V1.AbstractComponentCallbacksC1480v;
import V1.K;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import Z1.E;
import Z1.m0;
import Z1.r;
import Z1.v0;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.work.impl.WorkDatabase;
import com.openai.chatgpt.R;
import com.statsig.androidsdk.ErrorBoundaryKt;
import e2.C2778j;
import e2.C2782n;
import e2.C2790v;
import g2.C3145c;
import h.C3281g;
import id.AbstractC3557B;
import io.sentry.L0;
import io.sentry.S;
import j0.AbstractC3890f;
import j0.AbstractC3893i;
import j0.C3892h;
import j2.AbstractC3905g;
import j2.C3903e;
import j2.C3904f;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import kf.s;
import l0.AbstractC4326r;
import l0.C4323o;
import l2.AbstractC4332c;
import l2.C4330a;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p2.AbstractC5056i;
import p2.AbstractC5057j;
import pf.AbstractC5156c;
import q0.C5251c;
import s3.C5562l;
import t3.C5666a;
import x2.AbstractC6266a;
import x3.C6270B;
import x3.y;
import x8.L;
import x8.N;
import x8.k0;
import y.AbstractC6463a;
import y.P;
import y.Y;

/* renamed from: c1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2279d {

    /* renamed from: a  reason: collision with root package name */
    public static final m f26043a = new Object();

    public static final void A(X1.j jVar) {
        r rVar = r.f23089j0;
        Iterator it = jVar.f21751c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                X1.h hVar = (X1.h) rVar.invoke((X1.h) next);
                jVar.f21751c.set(i10, hVar);
                if (hVar instanceof X1.j) {
                    A((X1.j) hVar);
                }
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
    }

    public static ActionMode.Callback B(ActionMode.Callback callback) {
        if ((callback instanceof x) && Build.VERSION.SDK_INT >= 26) {
            return ((x) callback).f7193a;
        }
        return callback;
    }

    public static final LinkedHashMap C(X1.j jVar) {
        C3959i c3959i;
        Y1.a aVar;
        C3959i c3959i2;
        ArrayList arrayList = jVar.f21751c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                X1.h hVar = (X1.h) next;
                X1.m c10 = hVar.c();
                if (c10.b(r.f23087h0)) {
                    c3959i = (C3959i) c10.a(new C3959i(null, X1.k.f21752b), m0.f23023p0);
                } else {
                    c3959i = new C3959i(null, c10);
                }
                Y1.b bVar = (Y1.b) c3959i.f36155Y;
                X1.m mVar = (X1.m) c3959i.f36156Z;
                if (bVar != null) {
                    aVar = bVar.f22049b;
                } else {
                    aVar = null;
                }
                if (aVar instanceof Y1.f) {
                    c3959i2 = new C3959i(aVar, mVar);
                } else {
                    c3959i2 = new C3959i(null, mVar);
                }
                Y1.f fVar = (Y1.f) c3959i2.f36155Y;
                X1.m mVar2 = (X1.m) c3959i2.f36156Z;
                if (fVar != null && !(hVar instanceof E)) {
                    String str = fVar.f22051a + '+' + i10;
                    Y1.f fVar2 = new Y1.f(str, fVar.f22052b);
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).add(fVar2);
                    hVar.b(mVar2.d(new Y1.b(fVar2)));
                }
                if (hVar instanceof X1.j) {
                    for (Map.Entry entry : C((X1.j) hVar).entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str2, obj2);
                        }
                        ((List) obj2).addAll(list);
                    }
                }
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public static final void D(AbstractC1725n abstractC1725n, AbstractC4326r abstractC4326r, int i10, Z0.b bVar, AbstractC2086v abstractC2086v, A3.f fVar, Z0.l lVar, AbstractC1732q0 abstractC1732q0) {
        AbstractC0584m.f5811i.getClass();
        U3.f.n0(abstractC1725n, abstractC1732q0, C0583l.f5807e);
        U3.f.n0(abstractC1725n, abstractC4326r, n.f26095l0);
        U3.f.n0(abstractC1725n, bVar, n.f26096m0);
        U3.f.n0(abstractC1725n, abstractC2086v, n.f26097n0);
        U3.f.n0(abstractC1725n, fVar, n.f26098o0);
        U3.f.n0(abstractC1725n, lVar, n.f26099p0);
        C0581j c0581j = C0583l.f5809g;
        Z.r rVar = (Z.r) abstractC1725n;
        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i10))) {
            AbstractC6463a.q(i10, rVar, i10, c0581j);
        }
    }

    public static ActionMode.Callback E(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof x) && callback != null) {
            return new x(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wf.k kVar, AbstractC4326r abstractC4326r, wf.k kVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar3;
        wf.k kVar4;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        e eVar;
        int i14;
        int i15;
        int i16;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(kVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                kVar3 = kVar2;
                if (rVar.i(kVar3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
                if ((i12 & 731) != 146 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    kVar4 = kVar3;
                } else {
                    if (i17 != 0) {
                        abstractC4326r4 = C4323o.f37719b;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    e eVar2 = e.f26047j0;
                    if (i13 != 0) {
                        eVar = eVar2;
                    } else {
                        eVar = kVar3;
                    }
                    b(kVar, abstractC4326r4, null, eVar2, eVar, rVar, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
                    abstractC4326r3 = abstractC4326r4;
                    kVar4 = eVar;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new G.E(kVar, abstractC4326r3, kVar4, i10, i11, 7);
                    return;
                }
                return;
            }
            kVar3 = kVar2;
            if ((i12 & 731) != 146) {
            }
            if (i17 != 0) {
            }
            e eVar22 = e.f26047j0;
            if (i13 != 0) {
            }
            b(kVar, abstractC4326r4, null, eVar22, eVar, rVar, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
            abstractC4326r3 = abstractC4326r4;
            kVar4 = eVar;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        kVar3 = kVar2;
        if ((i12 & 731) != 146) {
        }
        if (i17 != 0) {
        }
        e eVar222 = e.f26047j0;
        if (i13 != 0) {
        }
        b(kVar, abstractC4326r4, null, eVar222, eVar, rVar, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
        abstractC4326r3 = abstractC4326r4;
        kVar4 = eVar;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(wf.k kVar, AbstractC4326r abstractC4326r, wf.k kVar2, wf.k kVar3, wf.k kVar4, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar5;
        int i14;
        wf.k kVar6;
        int i15;
        wf.k kVar7;
        wf.k kVar8;
        wf.k kVar9;
        wf.k kVar10;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        wf.k kVar11;
        wf.k kVar12;
        AbstractC4326r abstractC4326r5;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-180024211);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(kVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                kVar5 = kVar2;
                if (rVar.i(kVar5)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i12 |= i18;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    kVar6 = kVar3;
                    if (rVar.i(kVar6)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i12 |= i17;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        kVar7 = kVar4;
                        if (rVar.i(kVar7)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                        if ((i12 & 46811) != 9362 && rVar.B()) {
                            rVar.P();
                            abstractC4326r3 = abstractC4326r2;
                            kVar10 = kVar5;
                            kVar9 = kVar6;
                            kVar8 = kVar7;
                        } else {
                            if (i21 != 0) {
                                abstractC4326r4 = C4323o.f37719b;
                            } else {
                                abstractC4326r4 = abstractC4326r2;
                            }
                            if (i13 != 0) {
                                kVar11 = null;
                            } else {
                                kVar11 = kVar5;
                            }
                            kVar8 = e.f26047j0;
                            if (i14 != 0) {
                                kVar12 = kVar8;
                            } else {
                                kVar12 = kVar6;
                            }
                            if (i15 == 0) {
                                kVar8 = kVar7;
                            }
                            int i22 = rVar.P;
                            AbstractC4326r f02 = U3.f.f0(rVar, abstractC4326r4);
                            Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                            Z0.l lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                            AbstractC1732q0 p10 = rVar.p();
                            AbstractC2086v abstractC2086v = (AbstractC2086v) rVar.m(Z.f6890d);
                            A3.f fVar = (A3.f) rVar.m(Z.f6891e);
                            AbstractC1707e abstractC1707e = rVar.f22696a;
                            if (kVar11 != null) {
                                rVar.W(-88753355);
                                o k10 = k(kVar, rVar);
                                abstractC4326r5 = abstractC4326r4;
                                rVar.W(1405779621);
                                if (abstractC1707e instanceof A0) {
                                    rVar.Z();
                                    if (rVar.f22695O) {
                                        rVar.o(new C0033n0(k10, 7));
                                    } else {
                                        rVar.k0();
                                    }
                                    D(rVar, f02, i22, bVar, abstractC2086v, fVar, lVar, p10);
                                    U3.f.n0(rVar, kVar11, n.f26090Z);
                                    U3.f.n0(rVar, kVar8, n.f26091h0);
                                    U3.f.n0(rVar, kVar12, n.f26092i0);
                                    rVar.t(true);
                                    rVar.t(false);
                                    rVar.t(false);
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            } else {
                                abstractC4326r5 = abstractC4326r4;
                                rVar.W(-88752490);
                                o k11 = k(kVar, rVar);
                                rVar.W(1886828752);
                                if (abstractC1707e instanceof A0) {
                                    rVar.U();
                                    if (rVar.f22695O) {
                                        rVar.o(new C0033n0(k11, 6));
                                    } else {
                                        rVar.k0();
                                    }
                                    D(rVar, f02, i22, bVar, abstractC2086v, fVar, lVar, p10);
                                    U3.f.n0(rVar, kVar8, n.f26093j0);
                                    U3.f.n0(rVar, kVar12, n.f26094k0);
                                    rVar.t(true);
                                    rVar.t(false);
                                    rVar.t(false);
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            }
                            abstractC4326r3 = abstractC4326r5;
                            kVar10 = kVar11;
                            kVar9 = kVar12;
                        }
                        v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new P(kVar, abstractC4326r3, kVar10, kVar9, kVar8, i10, i11, 5);
                            return;
                        }
                        return;
                    }
                    kVar7 = kVar4;
                    if ((i12 & 46811) != 9362) {
                    }
                    if (i21 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    kVar8 = e.f26047j0;
                    if (i14 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    int i222 = rVar.P;
                    AbstractC4326r f022 = U3.f.f0(rVar, abstractC4326r4);
                    Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                    Z0.l lVar2 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                    AbstractC1732q0 p102 = rVar.p();
                    AbstractC2086v abstractC2086v2 = (AbstractC2086v) rVar.m(Z.f6890d);
                    A3.f fVar2 = (A3.f) rVar.m(Z.f6891e);
                    AbstractC1707e abstractC1707e2 = rVar.f22696a;
                    if (kVar11 != null) {
                    }
                    abstractC4326r3 = abstractC4326r5;
                    kVar10 = kVar11;
                    kVar9 = kVar12;
                    v10 = rVar.v();
                    if (v10 != null) {
                    }
                }
                kVar6 = kVar3;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                kVar7 = kVar4;
                if ((i12 & 46811) != 9362) {
                }
                if (i21 != 0) {
                }
                if (i13 != 0) {
                }
                kVar8 = e.f26047j0;
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                int i2222 = rVar.P;
                AbstractC4326r f0222 = U3.f.f0(rVar, abstractC4326r4);
                Z0.b bVar22 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                Z0.l lVar22 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                AbstractC1732q0 p1022 = rVar.p();
                AbstractC2086v abstractC2086v22 = (AbstractC2086v) rVar.m(Z.f6890d);
                A3.f fVar22 = (A3.f) rVar.m(Z.f6891e);
                AbstractC1707e abstractC1707e22 = rVar.f22696a;
                if (kVar11 != null) {
                }
                abstractC4326r3 = abstractC4326r5;
                kVar10 = kVar11;
                kVar9 = kVar12;
                v10 = rVar.v();
                if (v10 != null) {
                }
            }
            kVar5 = kVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            kVar6 = kVar3;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            kVar7 = kVar4;
            if ((i12 & 46811) != 9362) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            kVar8 = e.f26047j0;
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            int i22222 = rVar.P;
            AbstractC4326r f02222 = U3.f.f0(rVar, abstractC4326r4);
            Z0.b bVar222 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
            Z0.l lVar222 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
            AbstractC1732q0 p10222 = rVar.p();
            AbstractC2086v abstractC2086v222 = (AbstractC2086v) rVar.m(Z.f6890d);
            A3.f fVar222 = (A3.f) rVar.m(Z.f6891e);
            AbstractC1707e abstractC1707e222 = rVar.f22696a;
            if (kVar11 != null) {
            }
            abstractC4326r3 = abstractC4326r5;
            kVar10 = kVar11;
            kVar9 = kVar12;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        kVar5 = kVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        kVar6 = kVar3;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        kVar7 = kVar4;
        if ((i12 & 46811) != 9362) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        kVar8 = e.f26047j0;
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        int i222222 = rVar.P;
        AbstractC4326r f022222 = U3.f.f0(rVar, abstractC4326r4);
        Z0.b bVar2222 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        Z0.l lVar2222 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        AbstractC1732q0 p102222 = rVar.p();
        AbstractC2086v abstractC2086v2222 = (AbstractC2086v) rVar.m(Z.f6890d);
        A3.f fVar2222 = (A3.f) rVar.m(Z.f6891e);
        AbstractC1707e abstractC1707e2222 = rVar.f22696a;
        if (kVar11 != null) {
        }
        abstractC4326r3 = abstractC4326r5;
        kVar10 = kVar11;
        kVar9 = kVar12;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(wf.o oVar, AbstractC4326r abstractC4326r, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar2;
        wf.k kVar3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        C2276a c2276a;
        int i14;
        int i15;
        int i16;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(oVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                kVar2 = kVar;
                if (rVar.i(kVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
                if ((i12 & 731) != 146 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    kVar3 = kVar2;
                } else {
                    if (i17 != 0) {
                        abstractC4326r4 = C4323o.f37719b;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        c2276a = C2276a.f26040Y;
                    } else {
                        c2276a = kVar2;
                    }
                    d(oVar, abstractC4326r4, null, null, c2276a, rVar, (i12 & 14) | 384 | (i12 & 112) | ((i12 << 6) & 57344), 8);
                    abstractC4326r3 = abstractC4326r4;
                    kVar3 = c2276a;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new G.E(oVar, abstractC4326r3, kVar3, i10, i11, 6);
                    return;
                }
                return;
            }
            kVar2 = kVar;
            if ((i12 & 731) != 146) {
            }
            if (i17 != 0) {
            }
            if (i13 != 0) {
            }
            d(oVar, abstractC4326r4, null, null, c2276a, rVar, (i12 & 14) | 384 | (i12 & 112) | ((i12 << 6) & 57344), 8);
            abstractC4326r3 = abstractC4326r4;
            kVar3 = c2276a;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        kVar2 = kVar;
        if ((i12 & 731) != 146) {
        }
        if (i17 != 0) {
        }
        if (i13 != 0) {
        }
        d(oVar, abstractC4326r4, null, null, c2276a, rVar, (i12 & 14) | 384 | (i12 & 112) | ((i12 << 6) & 57344), 8);
        abstractC4326r3 = abstractC4326r4;
        kVar3 = c2276a;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:2|(1:4)(2:5|(3:7|(1:9)(1:10)|11)(1:12))|13|(1:15)(2:17|(24:19|(1:21)(1:22)|23|24|(1:26)(2:28|(21:30|(1:32)(1:33)|34|35|(1:37)(2:39|(18:41|(1:43)(1:44)|45|46|(1:48)(2:50|(7:52|(1:54)(1:55)|56|57|(12:(1:63)(1:64)|65|(1:67)(1:68)|(1:70)(1:71)|(1:73)(1:74)|75|(3:102|78|(2:80|84)(2:81|82))|85|(3:87|(1:90)|91)(1:92)|93|(1:96)|97)(1:61)|98|(2:100|101)(1:104)))|49|57|(1:59)|(0)(0)|65|(0)(0)|(0)(0)|(0)(0)|75|(0)|102|78|(0)(0)))|38|46|(0)(0)|49|57|(0)|(0)(0)|65|(0)(0)|(0)(0)|(0)(0)|75|(0)|102|78|(0)(0)))|27|35|(0)(0)|38|46|(0)(0)|49|57|(0)|(0)(0)|65|(0)(0)|(0)(0)|(0)(0)|75|(0)|102|78|(0)(0)))|16|24|(0)(0)|27|35|(0)(0)|38|46|(0)(0)|49|57|(0)|(0)(0)|65|(0)(0)|(0)(0)|(0)(0)|75|(0)|102|78|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef A[Catch: IllegalStateException -> 0x0108, TryCatch #0 {IllegalStateException -> 0x0108, blocks: (B:78:0x00e2, B:81:0x00ef, B:82:0x0107), top: B:102:0x00e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(wf.o oVar, AbstractC4326r abstractC4326r, wf.k kVar, wf.k kVar2, wf.k kVar3, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar4;
        int i14;
        wf.k kVar5;
        int i15;
        wf.k kVar6;
        wf.k kVar7;
        wf.k kVar8;
        wf.k kVar9;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        wf.k kVar10;
        C2277b c2277b;
        C2278c c2278c;
        View view;
        boolean g10;
        AbstractComponentCallbacksC1480v C10;
        wf.k kVar11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(509101952);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(oVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                kVar4 = kVar;
                if (rVar.i(kVar4)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i12 |= i18;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    kVar5 = kVar2;
                    if (rVar.i(kVar5)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i12 |= i17;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        kVar6 = kVar3;
                        if (rVar.i(kVar6)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                        if ((46811 & i12) != 9362 && rVar.B()) {
                            rVar.P();
                            abstractC4326r3 = abstractC4326r2;
                            kVar9 = kVar4;
                            kVar8 = kVar5;
                            kVar7 = kVar6;
                        } else {
                            if (i21 != 0) {
                                abstractC4326r4 = C4323o.f37719b;
                            } else {
                                abstractC4326r4 = abstractC4326r2;
                            }
                            if (i13 != 0) {
                                kVar10 = null;
                            } else {
                                kVar10 = kVar4;
                            }
                            if (i14 != 0) {
                                c2277b = C2277b.f26041Y;
                            } else {
                                c2277b = kVar5;
                            }
                            if (i15 != 0) {
                                c2278c = C2278c.f26042Y;
                            } else {
                                c2278c = kVar6;
                            }
                            view = (View) rVar.m(Z.f6892f);
                            rVar.W(1157296644);
                            g10 = rVar.g(view);
                            Object K10 = rVar.K();
                            io.sentry.hints.i iVar = C1723m.f22654Y;
                            if (!g10 || K10 == iVar) {
                                AbstractC3557B.c0("<this>", view);
                                C10 = K.C(view);
                                if (C10 != null) {
                                    K10 = C10;
                                    rVar.h0(K10);
                                } else {
                                    throw new IllegalStateException("View " + view + " does not have a Fragment set");
                                }
                            }
                            rVar.t(false);
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) K10;
                            Context context = (Context) rVar.m(Z.f6888b);
                            C0043t c0043t = new C0043t(abstractComponentCallbacksC1480v, 27, oVar);
                            if (kVar10 != null) {
                                rVar.W(975846569);
                                boolean i22 = rVar.i(kVar10);
                                Object K11 = rVar.K();
                                if (i22 || K11 == iVar) {
                                    K11 = new Y(15, kVar10);
                                    rVar.h0(K11);
                                }
                                kVar11 = (wf.k) K11;
                                rVar.t(false);
                            } else {
                                kVar11 = null;
                            }
                            C3281g c3281g = new C3281g(c2277b, abstractComponentCallbacksC1480v, context, 22);
                            rVar.W(975847742);
                            boolean i23 = rVar.i(c2278c);
                            Object K12 = rVar.K();
                            if (i23 || K12 == iVar) {
                                K12 = new Y(16, c2278c);
                                rVar.h0(K12);
                            }
                            rVar.t(false);
                            b(c0043t, abstractC4326r4, kVar11, c3281g, (wf.k) K12, rVar, i12 & 112, 0);
                            kVar7 = c2278c;
                            kVar8 = c2277b;
                            abstractC4326r3 = abstractC4326r4;
                            kVar9 = kVar10;
                        }
                        C1741v0 v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new P(oVar, abstractC4326r3, kVar9, kVar8, kVar7, i10, i11);
                            return;
                        }
                        return;
                    }
                    kVar6 = kVar3;
                    if ((46811 & i12) != 9362) {
                    }
                    if (i21 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    view = (View) rVar.m(Z.f6892f);
                    rVar.W(1157296644);
                    g10 = rVar.g(view);
                    Object K102 = rVar.K();
                    io.sentry.hints.i iVar2 = C1723m.f22654Y;
                    if (!g10) {
                    }
                    AbstractC3557B.c0("<this>", view);
                    C10 = K.C(view);
                    if (C10 != null) {
                    }
                }
                kVar5 = kVar2;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                kVar6 = kVar3;
                if ((46811 & i12) != 9362) {
                }
                if (i21 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                view = (View) rVar.m(Z.f6892f);
                rVar.W(1157296644);
                g10 = rVar.g(view);
                Object K1022 = rVar.K();
                io.sentry.hints.i iVar22 = C1723m.f22654Y;
                if (!g10) {
                }
                AbstractC3557B.c0("<this>", view);
                C10 = K.C(view);
                if (C10 != null) {
                }
            }
            kVar4 = kVar;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            kVar5 = kVar2;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            kVar6 = kVar3;
            if ((46811 & i12) != 9362) {
            }
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            view = (View) rVar.m(Z.f6892f);
            rVar.W(1157296644);
            g10 = rVar.g(view);
            Object K10222 = rVar.K();
            io.sentry.hints.i iVar222 = C1723m.f22654Y;
            if (!g10) {
            }
            AbstractC3557B.c0("<this>", view);
            C10 = K.C(view);
            if (C10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        kVar4 = kVar;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        kVar5 = kVar2;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        kVar6 = kVar3;
        if ((46811 & i12) != 9362) {
        }
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        view = (View) rVar.m(Z.f6892f);
        rVar.W(1157296644);
        g10 = rVar.g(view);
        Object K102222 = rVar.K();
        io.sentry.hints.i iVar2222 = C1723m.f22654Y;
        if (!g10) {
        }
        AbstractC3557B.c0("<this>", view);
        C10 = K.C(view);
        if (C10 != null) {
        }
    }

    public static final void e(C5562l c5562l, i0.e eVar, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1579360880);
        A7.b.l(new C1737t0[]{m2.b.f38872a.b(c5562l), Z.f6890d.b(c5562l), Z.f6891e.b(c5562l)}, R4.b.X(rVar, -52928304, new t3.n(eVar, nVar, i10, 0)), rVar, 56);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new U(c5562l, eVar, nVar, i10, 7);
        }
    }

    public static final void f(i0.e eVar, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        AbstractC4332c abstractC4332c;
        u uVar;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1211832233);
        rVar.W(1729797275);
        e0 a5 = m2.b.a(rVar);
        if (a5 != null) {
            boolean z10 = a5 instanceof AbstractC2077l;
            if (z10) {
                abstractC4332c = ((AbstractC2077l) a5).c();
            } else {
                abstractC4332c = C4330a.f37738b;
            }
            rVar.W(-1439476281);
            if (z10) {
                uVar = new u(a5.e(), ((AbstractC2077l) a5).b(), abstractC4332c);
            } else {
                uVar = new u(a5);
            }
            androidx.lifecycle.Y l10 = uVar.l(C5666a.class);
            rVar.t(false);
            rVar.t(false);
            C5666a c5666a = (C5666a) l10;
            c5666a.f45679e = new WeakReference(eVar);
            eVar.f(c5666a.f45678d, nVar, rVar, (i10 & 112) | 520);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new t3.n(eVar, nVar, i10, 1);
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void g(l lVar, androidx.compose.ui.node.a aVar) {
        long l10 = androidx.compose.ui.layout.a.l(aVar.f24831B0.f5701b);
        int Y02 = AbstractC4344b.Y0(C5251c.d(l10));
        int Y03 = AbstractC4344b.Y0(C5251c.e(l10));
        lVar.layout(Y02, Y03, lVar.getMeasuredWidth() + Y02, lVar.getMeasuredHeight() + Y03);
    }

    public static final q h(androidx.compose.ui.node.a aVar) {
        l lVar = aVar.f24851o0;
        if (lVar != null) {
            return (q) lVar;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static ArrayList i(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static final void j(WorkDatabase workDatabase, C0889a c0889a, M3.x xVar) {
        int i10;
        int i11 = 0;
        AbstractC3557B.c0("configuration", c0889a);
        AbstractC3557B.c0("continuation", xVar);
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList N02 = AbstractC4344b.N0(xVar);
        int i12 = 0;
        while (true) {
            S s10 = null;
            if (!N02.isEmpty()) {
                List<D> list = ((M3.x) s.U1(N02)).f11612i;
                AbstractC3557B.b0("current.work", list);
                if (list.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    for (D d10 : list) {
                        if (d10.f10681b.f17459j.a() && (i10 = i10 + 1) < 0) {
                            AbstractC4344b.c1();
                            throw null;
                        }
                    }
                    continue;
                }
                i12 += i10;
            } else if (i12 == 0) {
                return;
            } else {
                U3.s u10 = workDatabase.u();
                u10.getClass();
                S d11 = L0.d();
                if (d11 != null) {
                    s10 = d11.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
                }
                C6270B a5 = C6270B.a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                y yVar = u10.f17474a;
                yVar.b();
                Cursor t12 = A7.b.t1(yVar, a5, false);
                try {
                    if (t12.moveToFirst()) {
                        i11 = t12.getInt(0);
                    }
                    t12.close();
                    if (s10 != null) {
                        s10.b();
                    }
                    a5.j();
                    int i13 = i11 + i12;
                    int i14 = c0889a.f10692i;
                    if (i13 <= i14) {
                        return;
                    }
                    throw new IllegalArgumentException(android.gov.nist.core.a.l(E9.f.A("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i14, ";\nalready enqueued count: ", i11, ";\ncurrent enqueue operation count: "), i12, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
                } catch (Throwable th2) {
                    t12.close();
                    if (s10 != null) {
                        s10.b();
                    }
                    a5.j();
                    throw th2;
                }
            }
        }
    }

    public static final o k(wf.k kVar, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(2030558801);
        o oVar = new o(rVar.P, 0, (Context) rVar.m(Z.f6888b), kVar, R4.b.Q1(rVar), (i0.m) rVar.m(i0.p.f32433a), (View) rVar.m(Z.f6892f));
        rVar.t(false);
        return oVar;
    }

    public static final void l(ViewGroup viewGroup, C0571a c0571a) {
        if (viewGroup instanceof FragmentContainerView) {
            c0571a.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                l((ViewGroup) childAt, c0571a);
            }
        }
    }

    public static k0 m(AbstractC5056i abstractC5056i, ArrayList arrayList) {
        L l10 = N.f49523Z;
        AbstractC4344b.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            AbstractC5057j b10 = abstractC5056i.b(bundle);
            b10.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, r.f.x(objArr.length, i12));
            } else if (z10) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = b10;
                i10++;
                i11++;
            }
            z10 = false;
            objArr[i11] = b10;
            i10++;
            i11++;
        }
        return N.T(i11, objArr);
    }

    public static final e0 n(View view) {
        AbstractC3557B.c0("<this>", view);
        return (e0) Kg.m.j1(Kg.m.o1(Kg.p.c1(view, f0.f25367i0), f0.f25368j0));
    }

    public static long o(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = ErrorBoundaryKt.SAMPLING_RATE << (i14 & 1);
        } else if (i15 == 3) {
            i11 = 60000;
        } else {
            i11 = ErrorBoundaryKt.SAMPLING_RATE << i15;
        }
        return i10 * i11;
    }

    public static B1.i p(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new B1.i(w.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a5 = H1.u.a(textView);
        int d10 = H1.u.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(w.b(v.a(t.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (t.b(textView) != 1) {
                    z10 = false;
                }
                switch (t.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new B1.i(textPaint, textDirectionHeuristic, a5, d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x0080, blocks: (B:23:0x0075, B:12:0x002a, B:16:0x004c, B:17:0x0052, B:20:0x0061, B:22:0x0069), top: B:29:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0080, blocks: (B:23:0x0075, B:12:0x002a, B:16:0x004c, B:17:0x0052, B:20:0x0061, B:22:0x0069), top: B:29:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:20:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(AbstractC4825e abstractC4825e) {
        C3145c c3145c;
        int i10;
        AbstractC3890f abstractC3890f;
        Pg.k kVar;
        C1171d c1171d;
        Pg.k kVar2;
        try {
            if (abstractC4825e instanceof C3145c) {
                C3145c c3145c2 = (C3145c) abstractC4825e;
                int i11 = c3145c2.f31078j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c3145c2.f31078j0 = i11 - Integer.MIN_VALUE;
                    c3145c = c3145c2;
                    Object obj = c3145c.f31077i0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c3145c.f31078j0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            c1171d = c3145c.f31076h0;
                            C c10 = c3145c.f31075Z;
                            abstractC3890f = c3145c.f31074Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            kVar = c10;
                            if (((Boolean) obj).booleanValue()) {
                                jf.y yVar = (jf.y) c1171d.b();
                                int i12 = AbstractC3893i.f35891e;
                                io.sentry.hints.i.h();
                                kVar2 = kVar;
                                c3145c.f31074Y = abstractC3890f;
                                c3145c.f31075Z = kVar2;
                                c3145c.f31076h0 = c1171d;
                                c3145c.f31078j0 = 1;
                                obj = c1171d.a(c3145c);
                                kVar = kVar2;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    R4.b.Q(kVar, null);
                                    ((C3892h) abstractC3890f).a();
                                    return jf.y.f36177a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        Pg.k d10 = Bi.c.d(-1, null, 6);
                        int i13 = AbstractC3893i.f35891e;
                        abstractC3890f = io.sentry.hints.i.g(new C0717z0(d10, 1));
                        c1171d = new C1171d(d10);
                        kVar2 = d10;
                        c3145c.f31074Y = abstractC3890f;
                        c3145c.f31075Z = kVar2;
                        c3145c.f31076h0 = c1171d;
                        c3145c.f31078j0 = 1;
                        obj = c1171d.a(c3145c);
                        kVar = kVar2;
                        if (obj == enumC5000a) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th2) {
            ((C3892h) abstractC3890f).a();
            throw th2;
        }
        c3145c = new AbstractC5156c(abstractC4825e);
        Object obj2 = c3145c.f31077i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3145c.f31078j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(v0 v0Var) {
        boolean z10 = !v0Var.f21751c.isEmpty();
        ArrayList arrayList = v0Var.f21751c;
        if (z10) {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((X1.h) it.next()) instanceof E)) {
                        if (arrayList.size() != 1) {
                        }
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                X1.h hVar = (X1.h) it2.next();
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox", hVar);
                ArrayList arrayList2 = ((E) hVar).f21751c;
                if (arrayList2.size() != 1) {
                    C2778j c2778j = new C2778j();
                    s.N1(arrayList2, c2778j.f21751c);
                    arrayList2.clear();
                    arrayList2.add(c2778j);
                }
            }
        } else if (arrayList.size() != 1) {
            C2778j c2778j2 = new C2778j();
            s.N1(arrayList, c2778j2.f21751c);
            arrayList.clear();
            arrayList.add(c2778j2);
        }
        s(v0Var);
        A(v0Var);
    }

    public static final void s(X1.j jVar) {
        Object obj;
        AbstractC3905g abstractC3905g;
        Object obj2;
        AbstractC3905g abstractC3905g2;
        Iterator it = jVar.f21751c.iterator();
        while (it.hasNext()) {
            X1.h hVar = (X1.h) it.next();
            if (hVar instanceof X1.j) {
                s((X1.j) hVar);
            }
        }
        C2782n c2782n = (C2782n) jVar.c().a(null, m0.f23025r0);
        Object obj3 = C3904f.f36007a;
        if (c2782n == null || (obj = c2782n.f28781b) == null) {
            obj = obj3;
        }
        boolean z10 = obj instanceof C3904f;
        ArrayList arrayList = jVar.f21751c;
        C3903e c3903e = C3903e.f36006a;
        if (z10 && (!(arrayList instanceof Collection) || !arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C2782n c2782n2 = (C2782n) ((X1.h) it2.next()).c().a(null, m0.f23027t0);
                    if (c2782n2 != null) {
                        abstractC3905g2 = c2782n2.f28781b;
                    } else {
                        abstractC3905g2 = null;
                    }
                    if (abstractC3905g2 instanceof C3903e) {
                        jVar.b(jVar.c().d(new C2782n(c3903e)));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C2790v c2790v = (C2790v) jVar.c().a(null, m0.f23026s0);
        if (c2790v != null && (obj2 = c2790v.f28797b) != null) {
            obj3 = obj2;
        }
        if (obj3 instanceof C3904f) {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C2790v c2790v2 = (C2790v) ((X1.h) it3.next()).c().a(null, m0.f23028u0);
                    if (c2790v2 != null) {
                        abstractC3905g = c2790v2.f28797b;
                    } else {
                        abstractC3905g = null;
                    }
                    if (abstractC3905g instanceof C3903e) {
                        jVar.b(jVar.c().d(new C2790v(c3903e)));
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static C1025i t(byte[] bArr) {
        s2.u uVar = new s2.u(bArr);
        if (uVar.f45195c < 32) {
            return null;
        }
        uVar.F(0);
        if (uVar.g() != uVar.a() + 4 || uVar.g() != 1886614376) {
            return null;
        }
        int h10 = AbstractC6266a.h(uVar.g());
        if (h10 > 1) {
            android.gov.nist.core.a.v("Unsupported pssh version: ", h10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(uVar.o(), uVar.o());
        if (h10 == 1) {
            uVar.G(uVar.x() * 16);
        }
        int x10 = uVar.x();
        if (x10 != uVar.a()) {
            return null;
        }
        ?? r22 = new byte[x10];
        uVar.e(r22, 0, x10);
        return new C1025i(h10, 7, (Serializable) r22, uuid);
    }

    public static byte[] u(UUID uuid, byte[] bArr) {
        C1025i t10 = t(bArr);
        if (t10 == null) {
            return null;
        }
        if (!uuid.equals((UUID) t10.f12351h0)) {
            s2.p.g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + ((UUID) t10.f12351h0) + Separators.DOT);
            return null;
        }
        return (byte[]) t10.f12352i0;
    }

    public static void v(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            r1.o.a(theme);
            return;
        }
        synchronized (r1.n.f44303a) {
            if (!r1.n.f44305c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    r1.n.f44304b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                }
                r1.n.f44305c = true;
            }
            Method method = r1.n.f44304b;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                    r1.n.f44304b = null;
                }
            }
        }
    }

    public static final void w(View view, e0 e0Var) {
        AbstractC3557B.c0("<this>", view);
        view.setTag(R.id.view_tree_view_model_store_owner, e0Var);
    }

    public static void x(TextView textView, int i10) {
        int i11;
        R4.b.T(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            w.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (H1.s.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void y(TextView textView, int i10) {
        int i11;
        R4.b.T(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (H1.s.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static ArrayList z(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5057j) it.next()).a());
        }
        return arrayList;
    }
}
