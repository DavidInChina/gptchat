package h;

import B.AbstractC0130h1;
import B.S;
import E.C0416c0;
import E.C0418d0;
import E.C0422f0;
import E.k0;
import E.l0;
import E.n0;
import E0.P;
import E0.c0;
import E0.d0;
import G.Z;
import G0.AbstractC0579h;
import G0.C0571a;
import G0.y0;
import H0.C0714y;
import H0.View$OnDragListenerC0711w0;
import L.C0;
import L.C0868q;
import L.EnumC0847f0;
import L.P0;
import L.Q0;
import L.R0;
import N.C1029m;
import N.C1033q;
import N.C1034s;
import N.q0;
import N.x0;
import N0.B;
import N0.C;
import N0.C1046e;
import N0.D;
import N0.y;
import Ng.AbstractC1073l0;
import Ng.F;
import T0.C1406a;
import T0.n;
import T0.s;
import T0.z;
import V1.AbstractActivityC1483y;
import V1.AbstractComponentCallbacksC1480v;
import W.C1549f2;
import W.C1550f3;
import W.C1554g2;
import W.L1;
import W.o4;
import Z.AbstractC1710f0;
import Z.M;
import Z.N;
import Z.l1;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.AbstractC2086v;
import c1.AbstractC2279d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import g.C3104C;
import g4.AbstractC3181i;
import g4.C3177e;
import g4.C3178f;
import g4.C3179g;
import g4.C3180h;
import id.AbstractC3557B;
import j0.u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import n0.AbstractC4705d;
import n0.C4703b;
import n0.C4708g;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import r0.AbstractC5340d;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.I;
import r0.K;
import r0.r;
import r0.x;
import s3.AbstractC5540C;
import s3.AbstractC5568s;
import s3.C5562l;
import s3.C5565o;
import s3.W;
import t0.AbstractC5650i;
import t0.AbstractC5651j;
import t0.C5653l;
import u0.AbstractC5824b;
import wf.AbstractC6216a;
import y.C6460A;
import y.C6474l;
import y.V;
import y.e0;
import z.C6712n;

/* renamed from: h.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3281g extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31663Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f31664Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f31665h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f31666i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3281g(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f31663Y = i10;
        this.f31664Z = obj;
        this.f31665h0 = obj2;
        this.f31666i0 = obj3;
    }

    public final M a(N n10) {
        int i10 = this.f31663Y;
        Object obj = this.f31666i0;
        Object obj2 = this.f31665h0;
        Object obj3 = this.f31664Z;
        switch (i10) {
            case 0:
                C3283i c3283i = (C3283i) obj;
                ((C3104C) obj3).a((AbstractC2086v) obj2, c3283i);
                return new C3277c(1, c3283i);
            case 1:
                return new C6474l((u) obj3, obj2, (C6460A) obj, 0);
            case 19:
                i0.j jVar = (i0.j) obj3;
                if (!jVar.f32422b.containsKey(obj2)) {
                    jVar.f32421a.remove(obj2);
                    i0.i iVar = (i0.i) obj;
                    jVar.f32422b.put(obj2, iVar);
                    return new C6474l(iVar, jVar, obj2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            default:
                u uVar = (u) obj3;
                C5562l c5562l = (C5562l) obj2;
                uVar.add(c5562l);
                return new C6474l((t3.m) obj, c5562l, uVar);
        }
    }

    public final void c(float f6) {
        float f10;
        int i10 = this.f31663Y;
        Object obj = this.f31666i0;
        Object obj2 = this.f31665h0;
        Object obj3 = this.f31664Z;
        switch (i10) {
            case 4:
                if (((S) obj3).f1168u0) {
                    f10 = 1.0f;
                } else {
                    f10 = -1.0f;
                }
                float a5 = ((AbstractC0130h1) obj2).a(f10 * f6) * f10;
                if (Math.abs(a5) < Math.abs(f6)) {
                    ((AbstractC1073l0) obj).k(A7.b.g("Scroll animation cancelled because scroll was not consumed (" + a5 + " < " + f6 + ')', null));
                    return;
                }
                return;
            default:
                C1550f3 c1550f3 = (C1550f3) obj2;
                Ad.l.O0((F) obj3, null, null, new C1554g2(c1550f3, f6, null), 3).V(new C1549f2(c1550f3, (AbstractC6216a) obj, 1));
                return;
        }
    }

    public final void e(c0 c0Var) {
        int i10 = this.f31663Y;
        Object obj = this.f31666i0;
        Object obj2 = this.f31665h0;
        Object obj3 = this.f31664Z;
        switch (i10) {
            case 5:
                C0416c0 c0416c0 = (C0416c0) obj3;
                if (c0416c0.f3852u0) {
                    P p10 = (P) obj;
                    c0.g(c0Var, (d0) obj2, p10.a0(c0416c0.f3850s0), p10.a0(c0416c0.f3851t0));
                    return;
                }
                P p11 = (P) obj;
                c0.d(c0Var, (d0) obj2, p11.a0(c0416c0.f3850s0), p11.a0(c0416c0.f3851t0));
                return;
            case 6:
                C0418d0 c0418d0 = (C0418d0) obj3;
                long j6 = ((Z0.i) c0418d0.f3854s0.invoke((P) obj2)).f22799a;
                if (c0418d0.f3855t0) {
                    c0.h(c0Var, (d0) obj, (int) (j6 >> 32), (int) (4294967295L & j6));
                    return;
                } else {
                    c0.k(c0Var, (d0) obj, (int) (j6 >> 32), (int) (4294967295L & j6), null, 12);
                    return;
                }
            case 7:
                C0422f0 c0422f0 = (C0422f0) obj3;
                if (c0422f0.f3867w0) {
                    P p12 = (P) obj;
                    c0.g(c0Var, (d0) obj2, p12.a0(c0422f0.f3863s0), p12.a0(c0422f0.f3864t0));
                    return;
                }
                P p13 = (P) obj;
                c0.d(c0Var, (d0) obj2, p13.a0(c0422f0.f3863s0), p13.a0(c0422f0.f3864t0));
                return;
            case 8:
                P p14 = (P) obj2;
                k0 k0Var = (k0) obj;
                c0.d(c0Var, (d0) obj3, p14.a0(k0Var.f3882s0.b(p14.getLayoutDirection())), p14.a0(k0Var.f3882s0.d()));
                return;
            default:
                ((n0) obj3).d(c0Var, (l0) obj2, 0, ((P) obj).getLayoutDirection());
                return;
        }
    }

    public final void f(x xVar) {
        float f6;
        float f10;
        long j6;
        int i10 = this.f31663Y;
        Object obj = this.f31664Z;
        Object obj2 = this.f31666i0;
        Object obj3 = this.f31665h0;
        switch (i10) {
            case 2:
                l1 l1Var = (l1) obj;
                float f11 = 1.0f;
                if (l1Var != null) {
                    f6 = ((Number) l1Var.getValue()).floatValue();
                } else {
                    f6 = 1.0f;
                }
                I i11 = (I) xVar;
                i11.a(f6);
                l1 l1Var2 = (l1) obj3;
                if (l1Var2 != null) {
                    f10 = ((Number) l1Var2.getValue()).floatValue();
                } else {
                    f10 = 1.0f;
                }
                i11.e(f10);
                if (l1Var2 != null) {
                    f11 = ((Number) l1Var2.getValue()).floatValue();
                }
                i11.f(f11);
                l1 l1Var3 = (l1) obj2;
                if (l1Var3 != null) {
                    j6 = ((r0.P) l1Var3.getValue()).f44227a;
                } else {
                    j6 = r0.P.f44225b;
                }
                i11.l(j6);
                return;
            default:
                l1 l1Var4 = (l1) obj3;
                float f12 = L1.f19330a;
                I i12 = (I) xVar;
                i12.e(((Number) l1Var4.getValue()).floatValue());
                i12.f(((Number) l1Var4.getValue()).floatValue());
                i12.a(((Number) ((l1) obj2).getValue()).floatValue());
                i12.l(((r0.P) ((AbstractC1710f0) obj).getValue()).f44227a);
                return;
        }
    }

    public final void g(AbstractC5650i abstractC5650i) {
        long j6;
        float f6;
        C0714y c0714y;
        int i10 = this.f31663Y;
        boolean z10 = false;
        Object obj = this.f31666i0;
        Object obj2 = this.f31665h0;
        Object obj3 = this.f31664Z;
        switch (i10) {
            case 12:
                P0 p02 = (P0) obj3;
                Q0 d10 = p02.d();
                if (d10 != null) {
                    z zVar = (z) obj2;
                    s sVar = (s) obj;
                    AbstractC5352p a5 = abstractC5650i.V().a();
                    boolean b10 = D.b(zVar.f16831b);
                    C c10 = d10.f10054a;
                    if (!b10) {
                        long j10 = zVar.f16831b;
                        int b11 = sVar.b(D.e(j10));
                        int b12 = sVar.b(D.d(j10));
                        if (b11 != b12) {
                            a5.e(c10.o(b11, b12), p02.f10050v);
                        }
                    }
                    boolean d11 = c10.d();
                    B b13 = c10.f12477a;
                    if (d11 && !AbstractC3557B.D0(b13.f12472f, 3)) {
                        z10 = true;
                    }
                    if (z10) {
                        long j11 = c10.f12479c;
                        C5252d K10 = A7.b.K(C5251c.f43619b, AbstractC4828h.i((int) (j11 >> 32), (int) (j11 & 4294967295L)));
                        a5.h();
                        a5.t(K10, 1);
                    }
                    y yVar = b13.f12468b.f12487a;
                    Y0.j jVar = yVar.f12640m;
                    Y0.o oVar = yVar.f12628a;
                    if (jVar == null) {
                        jVar = Y0.j.f22031b;
                    }
                    Y0.j jVar2 = jVar;
                    K k10 = yVar.f12641n;
                    if (k10 == null) {
                        k10 = K.f44202d;
                    }
                    K k11 = k10;
                    AbstractC5651j abstractC5651j = yVar.f12643p;
                    if (abstractC5651j == null) {
                        abstractC5651j = C5653l.f45622a;
                    }
                    AbstractC5651j abstractC5651j2 = abstractC5651j;
                    try {
                        AbstractC5350n d12 = oVar.d();
                        Y0.m mVar = Y0.m.f22036a;
                        if (d12 != null) {
                            if (oVar != mVar) {
                                f6 = oVar.a();
                            } else {
                                f6 = 1.0f;
                            }
                            N0.i.b(c10.f12478b, a5, d12, f6, k11, jVar2, abstractC5651j2);
                        } else {
                            if (oVar != mVar) {
                                j6 = oVar.b();
                            } else {
                                j6 = r.f44254b;
                            }
                            N0.i.a(c10.f12478b, a5, j6, k11, jVar2, abstractC5651j2);
                        }
                        if (z10) {
                            a5.q();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (z10) {
                            a5.q();
                        }
                        throw th2;
                    }
                }
                return;
            default:
                c1.l lVar = (c1.l) obj3;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj2;
                c1.l lVar2 = (c1.l) obj;
                AbstractC5352p a10 = abstractC5650i.V().a();
                if (lVar.getView().getVisibility() != 8) {
                    lVar.f26069B0 = true;
                    Owner owner = aVar.f24850n0;
                    if (owner instanceof C0714y) {
                        c0714y = (C0714y) owner;
                    } else {
                        c0714y = null;
                    }
                    if (c0714y != null) {
                        Canvas a11 = AbstractC5340d.a(a10);
                        c0714y.getAndroidViewsHandler$ui_release().getClass();
                        lVar2.draw(a11);
                    }
                    lVar.f26069B0 = false;
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        Integer d10;
        Integer c10;
        Integer c11;
        Integer d11;
        C c12;
        C c13;
        Q0 q02;
        Q0 q03;
        C c14;
        C c15;
        Q0 q04;
        Q0 q05;
        Integer c16;
        Integer d12;
        Integer d13;
        Integer c17;
        U3.c cVar;
        ViewGroup viewGroup;
        AbstractActivityC1483y abstractActivityC1483y;
        V1.K l10;
        jf.y yVar;
        jf.y yVar2 = jf.y.f36177a;
        int i10 = this.f31663Y;
        r0.P p10 = null;
        V1.K k10 = null;
        z zVar = null;
        r5 = null;
        z zVar2 = null;
        p10 = null;
        Object obj2 = this.f31666i0;
        Object obj3 = this.f31665h0;
        Object obj4 = this.f31664Z;
        switch (i10) {
            case 0:
                return a((N) obj);
            case 1:
                return a((N) obj);
            case 2:
                f((x) obj);
                return yVar2;
            case 3:
                int ordinal = ((V) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            y.k0 k0Var = ((e0) obj2).f50201a.f50303d;
                            if (k0Var != null) {
                                p10 = new r0.P(k0Var.f50229b);
                            } else {
                                y.k0 k0Var2 = ((y.d0) obj3).f50197a.f50303d;
                                if (k0Var2 != null) {
                                    p10 = new r0.P(k0Var2.f50229b);
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        p10 = (r0.P) obj4;
                    }
                } else {
                    y.k0 k0Var3 = ((y.d0) obj3).f50197a.f50303d;
                    if (k0Var3 != null) {
                        p10 = new r0.P(k0Var3.f50229b);
                    } else {
                        y.k0 k0Var4 = ((e0) obj2).f50201a.f50303d;
                        if (k0Var4 != null) {
                            p10 = new r0.P(k0Var4.f50229b);
                        }
                    }
                }
                if (p10 != null) {
                    j6 = p10.f44227a;
                } else {
                    j6 = r0.P.f44225b;
                }
                return new r0.P(j6);
            case 4:
                c(((Number) obj).floatValue());
                return yVar2;
            case 5:
                e((c0) obj);
                return yVar2;
            case 6:
                e((c0) obj);
                return yVar2;
            case 7:
                e((c0) obj);
                return yVar2;
            case 8:
                e((c0) obj);
                return yVar2;
            case 9:
                e((c0) obj);
                return yVar2;
            case 10:
                int intValue = ((Number) obj).intValue();
                G.F f6 = (G.F) ((AbstractC6216a) obj4).mo122invoke();
                if (intValue >= 0 && intValue < f6.a()) {
                    Ad.l.O0((F) obj3, null, null, new Z((G.V) obj2, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder q10 = android.gov.nist.core.a.q("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                q10.append(f6.a());
                q10.append(')');
                throw new IllegalArgumentException(q10.toString().toString());
            case 11:
                z zVar3 = (z) obj;
                ((AbstractC1710f0) obj3).setValue(zVar3);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj2;
                boolean z10 = !AbstractC3557B.K((String) abstractC1710f0.getValue(), zVar3.f16830a.f12512Y);
                C1046e c1046e = zVar3.f16830a;
                abstractC1710f0.setValue(c1046e.f12512Y);
                if (z10) {
                    ((wf.k) obj4).invoke(c1046e.f12512Y);
                }
                return yVar2;
            case 12:
                g((AbstractC5650i) obj);
                return yVar2;
            case 13:
                wf.k kVar = (wf.k) obj3;
                T0.F f10 = (T0.F) ((kotlin.jvm.internal.B) obj2).f37622Y;
                z a5 = ((T0.j) obj4).a((List) obj);
                if (f10 != null) {
                    f10.a(null, a5);
                }
                kVar.invoke(a5);
                return yVar2;
            case 14:
                q0 q0Var = (q0) obj;
                switch (((EnumC0847f0) obj4).ordinal()) {
                    case 0:
                        C0868q c0868q = C0868q.f10268k0;
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (D.b(q0Var.f12343f)) {
                                c0868q.invoke(q0Var);
                                break;
                            } else if (q0Var.e()) {
                                int e10 = D.e(q0Var.f12343f);
                                q0Var.l(e10, e10);
                                break;
                            } else {
                                int d14 = D.d(q0Var.f12343f);
                                q0Var.l(d14, d14);
                                break;
                            }
                        }
                        break;
                    case 1:
                        C0868q c0868q2 = C0868q.f10269l0;
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (D.b(q0Var.f12343f)) {
                                c0868q2.invoke(q0Var);
                                break;
                            } else if (q0Var.e()) {
                                int d15 = D.d(q0Var.f12343f);
                                q0Var.l(d15, d15);
                                break;
                            } else {
                                int e11 = D.e(q0Var.f12343f);
                                q0Var.l(e11, e11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        x0 x0Var = q0Var.f12342e;
                        x0Var.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (c10 = q0Var.c()) != null) {
                                    int intValue2 = c10.intValue();
                                    q0Var.l(intValue2, intValue2);
                                    break;
                                }
                            } else {
                                x0Var.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (d10 = q0Var.d()) != null) {
                                    int intValue3 = d10.intValue();
                                    q0Var.l(intValue3, intValue3);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        x0 x0Var2 = q0Var.f12342e;
                        x0Var2.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var2.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (d11 = q0Var.d()) != null) {
                                    int intValue4 = d11.intValue();
                                    q0Var.l(intValue4, intValue4);
                                    break;
                                }
                            } else {
                                x0Var2.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (c11 = q0Var.c()) != null) {
                                    int intValue5 = c11.intValue();
                                    q0Var.l(intValue5, intValue5);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        q0Var.g();
                        break;
                    case 5:
                        q0Var.h();
                        break;
                    case 6:
                        q0Var.j();
                        break;
                    case 7:
                        q0Var.i();
                        break;
                    case 8:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                q0Var.j();
                                break;
                            } else {
                                q0Var.i();
                                break;
                            }
                        }
                        break;
                    case 9:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                q0Var.i();
                                break;
                            } else {
                                q0Var.j();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (c12 = q0Var.f12340c) != null) {
                            int f11 = q0Var.f(c12, -1);
                            q0Var.l(f11, f11);
                            break;
                        }
                        break;
                    case 11:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (c13 = q0Var.f12340c) != null) {
                            int f12 = q0Var.f(c13, 1);
                            q0Var.l(f12, f12);
                            break;
                        }
                        break;
                    case 12:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (q02 = q0Var.f12402i) != null) {
                            int o10 = q0Var.o(q02, -1);
                            q0Var.l(o10, o10);
                            break;
                        }
                        break;
                    case 13:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (q03 = q0Var.f12402i) != null) {
                            int o11 = q0Var.o(q03, 1);
                            q0Var.l(o11, o11);
                            break;
                        }
                        break;
                    case 14:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            q0Var.l(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        q0Var.f12342e.f12451a = null;
                        C1046e c1046e2 = q0Var.f12344g;
                        if (c1046e2.f12512Y.length() > 0) {
                            int length = c1046e2.f12512Y.length();
                            q0Var.l(length, length);
                            break;
                        }
                        break;
                    case 16:
                        ((C0) obj3).f9866b.c(false);
                        break;
                    case 17:
                        ((C0) obj3).f9866b.l();
                        break;
                    case 18:
                        ((C0) obj3).f9866b.e();
                        break;
                    case 19:
                        List n10 = q0Var.n(C0868q.f10270m0);
                        if (n10 != null) {
                            ((C0) obj3).a(n10);
                            break;
                        }
                        break;
                    case 20:
                        List n11 = q0Var.n(C0868q.f10271n0);
                        if (n11 != null) {
                            ((C0) obj3).a(n11);
                            break;
                        }
                        break;
                    case 21:
                        List n12 = q0Var.n(C0868q.f10272o0);
                        if (n12 != null) {
                            ((C0) obj3).a(n12);
                            break;
                        }
                        break;
                    case 22:
                        List n13 = q0Var.n(C0868q.f10273p0);
                        if (n13 != null) {
                            ((C0) obj3).a(n13);
                            break;
                        }
                        break;
                    case 23:
                        List n14 = q0Var.n(C0868q.f10274q0);
                        if (n14 != null) {
                            ((C0) obj3).a(n14);
                            break;
                        }
                        break;
                    case 24:
                        List n15 = q0Var.n(C0868q.f10275r0);
                        if (n15 != null) {
                            ((C0) obj3).a(n15);
                            break;
                        }
                        break;
                    case 25:
                        q0Var.f12342e.f12451a = null;
                        C1046e c1046e3 = q0Var.f12344g;
                        if (c1046e3.f12512Y.length() > 0) {
                            q0Var.l(0, c1046e3.f12512Y.length());
                            break;
                        }
                        break;
                    case 26:
                        x0 x0Var3 = q0Var.f12342e;
                        x0Var3.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var3.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str = q0Var.f12344g.f12512Y;
                                    long j10 = q0Var.f12343f;
                                    int i11 = D.f12484c;
                                    int F02 = A7.b.F0((int) (j10 & 4294967295L), str);
                                    if (F02 != -1) {
                                        q0Var.l(F02, F02);
                                    }
                                }
                            } else {
                                x0Var3.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str2 = q0Var.f12344g.f12512Y;
                                    long j11 = q0Var.f12343f;
                                    int i12 = D.f12484c;
                                    int E02 = A7.b.E0((int) (j11 & 4294967295L), str2);
                                    if (E02 != -1) {
                                        q0Var.l(E02, E02);
                                    }
                                }
                            }
                        }
                        q0Var.k();
                        break;
                    case 27:
                        x0 x0Var4 = q0Var.f12342e;
                        x0Var4.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var4.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str3 = q0Var.f12344g.f12512Y;
                                    long j12 = q0Var.f12343f;
                                    int i13 = D.f12484c;
                                    int E03 = A7.b.E0((int) (j12 & 4294967295L), str3);
                                    if (E03 != -1) {
                                        q0Var.l(E03, E03);
                                    }
                                }
                            } else {
                                x0Var4.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0) {
                                    String str4 = q0Var.f12344g.f12512Y;
                                    long j13 = q0Var.f12343f;
                                    int i14 = D.f12484c;
                                    int F03 = A7.b.F0((int) (j13 & 4294967295L), str4);
                                    if (F03 != -1) {
                                        q0Var.l(F03, F03);
                                    }
                                }
                            }
                        }
                        q0Var.k();
                        break;
                    case 28:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (c14 = q0Var.f12340c) != null) {
                            int f13 = q0Var.f(c14, -1);
                            q0Var.l(f13, f13);
                        }
                        q0Var.k();
                        break;
                    case 29:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (c15 = q0Var.f12340c) != null) {
                            int f14 = q0Var.f(c15, 1);
                            q0Var.l(f14, f14);
                        }
                        q0Var.k();
                        break;
                    case 30:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (q04 = q0Var.f12402i) != null) {
                            int o12 = q0Var.o(q04, -1);
                            q0Var.l(o12, o12);
                        }
                        q0Var.k();
                        break;
                    case 31:
                        if (q0Var.f12344g.f12512Y.length() > 0 && (q05 = q0Var.f12402i) != null) {
                            int o13 = q0Var.o(q05, 1);
                            q0Var.l(o13, o13);
                        }
                        q0Var.k();
                        break;
                    case 32:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            q0Var.l(0, 0);
                        }
                        q0Var.k();
                        break;
                    case 33:
                        q0Var.f12342e.f12451a = null;
                        C1046e c1046e4 = q0Var.f12344g;
                        if (c1046e4.f12512Y.length() > 0) {
                            int length2 = c1046e4.f12512Y.length();
                            q0Var.l(length2, length2);
                        }
                        q0Var.k();
                        break;
                    case 34:
                        x0 x0Var5 = q0Var.f12342e;
                        x0Var5.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var5.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (d12 = q0Var.d()) != null) {
                                    int intValue6 = d12.intValue();
                                    q0Var.l(intValue6, intValue6);
                                }
                            } else {
                                x0Var5.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (c16 = q0Var.c()) != null) {
                                    int intValue7 = c16.intValue();
                                    q0Var.l(intValue7, intValue7);
                                }
                            }
                        }
                        q0Var.k();
                        break;
                    case 35:
                        x0 x0Var6 = q0Var.f12342e;
                        x0Var6.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                x0Var6.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (c17 = q0Var.c()) != null) {
                                    int intValue8 = c17.intValue();
                                    q0Var.l(intValue8, intValue8);
                                }
                            } else {
                                x0Var6.f12451a = null;
                                if (q0Var.f12344g.f12512Y.length() > 0 && (d13 = q0Var.d()) != null) {
                                    int intValue9 = d13.intValue();
                                    q0Var.l(intValue9, intValue9);
                                }
                            }
                        }
                        q0Var.k();
                        break;
                    case 36:
                        q0Var.g();
                        q0Var.k();
                        break;
                    case 37:
                        q0Var.h();
                        q0Var.k();
                        break;
                    case 38:
                        q0Var.j();
                        q0Var.k();
                        break;
                    case 39:
                        q0Var.i();
                        q0Var.k();
                        break;
                    case 40:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                q0Var.j();
                            } else {
                                q0Var.i();
                            }
                        }
                        q0Var.k();
                        break;
                    case 41:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            if (q0Var.e()) {
                                q0Var.i();
                            } else {
                                q0Var.j();
                            }
                        }
                        q0Var.k();
                        break;
                    case 42:
                        q0Var.f12342e.f12451a = null;
                        if (q0Var.f12344g.f12512Y.length() > 0) {
                            long j14 = q0Var.f12343f;
                            int i15 = D.f12484c;
                            int i16 = (int) (j14 & 4294967295L);
                            q0Var.l(i16, i16);
                            break;
                        }
                        break;
                    case 43:
                        C0 c02 = (C0) obj3;
                        if (!c02.f9869e) {
                            c02.a(AbstractC4344b.F0(new C1406a(Separators.RETURN, 1)));
                            break;
                        } else {
                            c02.f9865a.f10049u.invoke(new n(c02.f9876l));
                            break;
                        }
                    case 44:
                        C0 c03 = (C0) obj3;
                        if (!c03.f9869e) {
                            c03.a(AbstractC4344b.F0(new C1406a(Separators.HT, 1)));
                            break;
                        } else {
                            ((kotlin.jvm.internal.x) obj2).f37645Y = false;
                            break;
                        }
                    case 45:
                        C0 c04 = (C0) obj3;
                        R0 r02 = c04.f9872h;
                        if (r02 != null) {
                            r02.a(z.a(q0Var.f12401h, q0Var.f12344g, q0Var.f12343f, 4));
                        }
                        R0 r03 = c04.f9872h;
                        if (r03 != null) {
                            U3.c cVar2 = r03.f10058b;
                            if (cVar2 != null && (cVar = (U3.c) cVar2.f17396Z) != null) {
                                r03.f10058b = cVar;
                                r03.f10060d -= ((z) cVar2.f17397h0).f16830a.f12512Y.length();
                                r03.f10059c = new U3.c(r03.f10059c, 2, (z) cVar2.f17397h0);
                                zVar2 = (z) cVar.f17397h0;
                            }
                            if (zVar2 != null) {
                                c04.f9875k.invoke(zVar2);
                                break;
                            }
                        }
                        break;
                    case 46:
                        C0 c05 = (C0) obj3;
                        R0 r04 = c05.f9872h;
                        if (r04 != null) {
                            U3.c cVar3 = r04.f10059c;
                            if (cVar3 != null) {
                                r04.f10059c = (U3.c) cVar3.f17396Z;
                                z zVar4 = (z) cVar3.f17397h0;
                                r04.f10058b = new U3.c(r04.f10058b, 2, zVar4);
                                r04.f10060d = zVar4.f16830a.f12512Y.length() + r04.f10060d;
                                zVar = (z) cVar3.f17397h0;
                            }
                            if (zVar != null) {
                                c05.f9875k.invoke(zVar);
                                break;
                            }
                        }
                        break;
                }
                return yVar2;
            case 15:
                C1033q c1033q = (C1033q) obj;
                int length3 = c1033q.f12400f.f12477a.f12467a.f12512Y.length();
                ((C1029m) obj4).getClass();
                C1029m.n((Map) obj3, (C1034s) obj2, c1033q, 0, length3);
                return yVar2;
            case 16:
                C6712n c6712n = (C6712n) obj;
                kotlin.jvm.internal.y yVar3 = (kotlin.jvm.internal.y) obj4;
                float floatValue = ((Number) c6712n.f51333e.getValue()).floatValue() - yVar3.f37646Y;
                o4 o4Var = (o4) obj3;
                float h10 = o4Var.f20268c.h();
                o4Var.d(h10 + floatValue);
                float abs = Math.abs(h10 - o4Var.f20268c.h());
                yVar3.f37646Y = ((Number) c6712n.f51333e.getValue()).floatValue();
                ((kotlin.jvm.internal.y) obj2).f37646Y = ((Number) c6712n.f51329a.f51417b.invoke(c6712n.f51334f)).floatValue();
                if (Math.abs(floatValue - abs) > 0.5f) {
                    c6712n.a();
                }
                return yVar2;
            case 17:
                f((x) obj);
                return yVar2;
            case 18:
                c(((Number) obj).floatValue());
                return yVar2;
            case 19:
                return a((N) obj);
            case 20:
                C4708g c4708g = (C4708g) obj;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) obj4;
                boolean z11 = xVar.f37645Y;
                boolean A02 = c4708g.A0((C4703b) obj3);
                C4708g c4708g2 = (C4708g) obj2;
                if (A02) {
                    ((View$OnDragListenerC0711w0) ((C0714y) AbstractC0579h.B(c4708g2)).getDragAndDropManager()).f7060b.add(c4708g);
                }
                xVar.f37645Y = z11 | A02;
                return Boolean.TRUE;
            case 21:
                y0 y0Var = (y0) obj;
                if (y0Var instanceof AbstractC4705d) {
                    AbstractC4705d abstractC4705d = (AbstractC4705d) y0Var;
                    if (((View$OnDragListenerC0711w0) ((C0714y) AbstractC0579h.B((C4708g) obj3)).getDragAndDropManager()).f7060b.contains(abstractC4705d)) {
                        C4703b c4703b = (C4703b) obj2;
                        if (kotlin.jvm.internal.m.i(abstractC4705d, R4.b.r(c4703b.f39584a.getX(), c4703b.f39584a.getY()))) {
                            ((kotlin.jvm.internal.B) obj4).f37622Y = y0Var;
                            return G0.x0.f5843h0;
                        }
                    }
                }
                return G0.x0.f5841Y;
            case 22:
                View view = (View) obj;
                Object tag = view.getTag(R.id.binding_reference);
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding", tag);
                ((wf.k) obj4).invoke((J3.a) tag);
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) obj3;
                    Context context = (Context) obj2;
                    if (abstractComponentCallbacksC1480v != null && (l10 = abstractComponentCallbacksC1480v.l()) != null) {
                        k10 = l10;
                    } else {
                        if (context instanceof AbstractActivityC1483y) {
                            abstractActivityC1483y = (AbstractActivityC1483y) context;
                        } else {
                            abstractActivityC1483y = null;
                        }
                        if (abstractActivityC1483y != null) {
                            k10 = abstractActivityC1483y.f18317y0.e();
                        }
                    }
                    AbstractC2279d.l(viewGroup, new C0571a(7, k10));
                }
                return yVar2;
            case 23:
                g((AbstractC5650i) obj);
                return yVar2;
            case 24:
                Throwable th2 = (Throwable) obj;
                ((wf.k) obj4).invoke(th2);
                U3.n nVar = (U3.n) obj3;
                ((Pg.o) nVar.f17428h0).l(th2);
                do {
                    Object b10 = Pg.s.b(((Pg.o) nVar.f17428h0).e());
                    if (b10 == null) {
                        yVar = null;
                        continue;
                    } else {
                        ((wf.n) obj2).invoke(b10, th2);
                        yVar = yVar2;
                        continue;
                    }
                } while (yVar != null);
                return yVar2;
            case 25:
                C5562l c5562l = (C5562l) obj;
                AbstractC3557B.c0("backStackEntry", c5562l);
                AbstractC5540C abstractC5540C = c5562l.f45306Z;
                if (!(abstractC5540C instanceof AbstractC5540C)) {
                    abstractC5540C = null;
                }
                if (abstractC5540C == null) {
                    return null;
                }
                W w10 = (W) obj4;
                c5562l.d();
                AbstractC2469q0.p(obj2);
                AbstractC5540C c18 = w10.c(abstractC5540C);
                if (c18 == null) {
                    return null;
                }
                if (AbstractC3557B.K(c18, abstractC5540C)) {
                    return c5562l;
                }
                C5565o b11 = w10.b();
                Bundle s10 = c18.s(c5562l.d());
                AbstractC5568s abstractC5568s = b11.f45330h;
                return P5.c.u(abstractC5568s.f45340a, c18, s10, abstractC5568s.k(), abstractC5568s.f45355p);
            case 26:
                return a((N) obj);
            case 27:
                AbstractC3181i abstractC3181i = (AbstractC3181i) obj;
                if (abstractC3181i instanceof C3179g) {
                    wf.k kVar2 = (wf.k) obj4;
                    if (kVar2 != null) {
                        kVar2.invoke(abstractC3181i);
                    }
                } else if (abstractC3181i instanceof C3180h) {
                    wf.k kVar3 = (wf.k) obj3;
                    if (kVar3 != null) {
                        kVar3.invoke(abstractC3181i);
                    }
                } else if (abstractC3181i instanceof C3178f) {
                    wf.k kVar4 = (wf.k) obj2;
                    if (kVar4 != null) {
                        kVar4.invoke(abstractC3181i);
                    }
                } else {
                    boolean z12 = abstractC3181i instanceof C3177e;
                }
                return yVar2;
            default:
                AbstractC3181i abstractC3181i2 = (AbstractC3181i) obj;
                if (abstractC3181i2 instanceof C3179g) {
                    AbstractC5824b abstractC5824b = (AbstractC5824b) obj4;
                    C3179g c3179g = (C3179g) abstractC3181i2;
                    if (abstractC5824b != null) {
                        c3179g.getClass();
                        return new C3179g(abstractC5824b);
                    }
                    return c3179g;
                } else if (abstractC3181i2 instanceof C3178f) {
                    C3178f c3178f = (C3178f) abstractC3181i2;
                    q4.e eVar = c3178f.f31220b;
                    if (eVar.f43785c instanceof q4.m) {
                        AbstractC5824b abstractC5824b2 = (AbstractC5824b) obj3;
                        if (abstractC5824b2 != null) {
                            return new C3178f(abstractC5824b2, eVar);
                        }
                        return c3178f;
                    }
                    AbstractC5824b abstractC5824b3 = (AbstractC5824b) obj2;
                    if (abstractC5824b3 != null) {
                        return new C3178f(abstractC5824b3, eVar);
                    }
                    return c3178f;
                } else {
                    return abstractC3181i2;
                }
        }
    }
}
