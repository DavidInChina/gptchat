package A;

import G0.C0571a;
import H.C0659h;
import H0.C0676e0;
import H0.C0680g0;
import H0.C0699q;
import H0.C0705t0;
import H0.x1;
import H0.y1;
import N.AbstractC1028l;
import N.AbstractC1038w;
import Ng.AbstractC1070k;
import S0.AbstractC1356q;
import S0.C1341b;
import S0.C1348i;
import S0.C1349j;
import S0.C1350k;
import S0.C1352m;
import S0.C1353n;
import T0.AbstractC1414i;
import T0.C1406a;
import T0.C1411f;
import T0.C1412g;
import T0.C1413h;
import V1.AbstractComponentCallbacksC1480v;
import Z.AbstractC1710f0;
import Z.C1711g;
import Z.C1713h;
import Z.C1744x;
import Z.EnumC1747y0;
import android.content.Context;
import android.graphics.Typeface;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC2082q;
import b0.C2099c;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import d1.AbstractC2586u;
import d1.C2584s;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import jf.C3960j;
import l0.AbstractC4326r;
import l0.C4328t;
import l8.AbstractC4344b;
import r0.AbstractC5350n;
import r0.C5349m;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import z.C6678S;
import z0.C6739b;

/* renamed from: A.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0043t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f295Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f296Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f297h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0043t(Object obj, int i10, Object obj2) {
        super(1);
        this.f295Y = i10;
        this.f297h0 = obj;
        this.f296Z = obj2;
    }

    private final void g() {
        C1713h c1713h = (C1713h) this.f297h0;
        Object obj = c1713h.f22633Z;
        kotlin.jvm.internal.B b10 = (kotlin.jvm.internal.B) this.f296Z;
        synchronized (obj) {
            List list = c1713h.f22635i0;
            Object obj2 = b10.f37622Y;
            if (obj2 != null) {
                list.remove((C1711g) obj2);
            } else {
                AbstractC3557B.C2("awaiter");
                throw null;
            }
        }
    }

    private final void i() {
        Z.X x10 = (Z.X) this.f297h0;
        Object obj = x10.f22583a;
        AbstractC1070k abstractC1070k = (AbstractC1070k) this.f296Z;
        synchronized (obj) {
            x10.f22584b.remove(abstractC1070k);
        }
    }

    private final void j(Throwable th2) {
        Z.E0 e02 = (Z.E0) this.f297h0;
        Object obj = e02.f22466c;
        Throwable th3 = (Throwable) this.f296Z;
        synchronized (obj) {
            if (th3 != null) {
                if (th2 != null) {
                    try {
                        if (!(!(th2 instanceof CancellationException))) {
                            th2 = null;
                        }
                        if (th2 != null) {
                            P4.a.m(th3, th2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else {
                th3 = null;
            }
            e02.f22468e = th3;
            e02.f22483t.setValue(EnumC1747y0.f22770Y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0499  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private S0.Q m(Object obj) {
        S0.Q q10;
        S0.P p10;
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        C3959i c3959i;
        Object obj2;
        int i10;
        Object obj3;
        ArrayList arrayList;
        wf.k kVar = (wf.k) obj;
        S0.t tVar = (S0.t) this.f297h0;
        S0.y yVar = tVar.f16048d;
        S0.M m10 = (S0.M) this.f296Z;
        S0.G g10 = tVar.f16045a;
        C0571a c0571a = tVar.f16050f;
        yVar.getClass();
        S0.s sVar = m10.f15986a;
        if (!(sVar instanceof S0.v)) {
            q10 = null;
        } else {
            ArrayList arrayList2 = ((S0.v) sVar).f16054j0;
            S0.D d10 = m10.f15987b;
            int i11 = m10.f15988c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj4 = arrayList2.get(i12);
                S0.I i13 = (S0.I) ((AbstractC1356q) obj4);
                if (AbstractC3557B.K(i13.f15980b, d10) && S0.z.a(i13.f15981c, i11)) {
                    arrayList3.add(obj4);
                }
            }
            if (!(!arrayList3.isEmpty())) {
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Object obj5 = arrayList2.get(i14);
                    if (S0.z.a(((S0.I) ((AbstractC1356q) obj5)).f15981c, i11)) {
                        arrayList4.add(obj5);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2 = arrayList4;
                }
                int compareTo = d10.compareTo(S0.D.f15968Z);
                int i15 = d10.f15975Y;
                if (compareTo < 0) {
                    int size3 = arrayList2.size();
                    S0.D d11 = null;
                    S0.D d12 = null;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size3) {
                            break;
                        }
                        S0.D d13 = ((S0.I) ((AbstractC1356q) arrayList2.get(i16))).f15980b;
                        int e02 = AbstractC3557B.e0(d13.f15975Y, i15);
                        int i17 = d13.f15975Y;
                        if (e02 < 0) {
                            if (d11 == null || AbstractC3557B.e0(i17, d11.f15975Y) > 0) {
                                d11 = d13;
                            }
                        } else if (AbstractC3557B.e0(i17, i15) > 0) {
                            if (d12 == null || AbstractC3557B.e0(i17, d12.f15975Y) < 0) {
                                d12 = d13;
                            }
                        } else {
                            d11 = d13;
                            d12 = d11;
                            break;
                        }
                        i16++;
                    }
                    if (d11 == null) {
                        d11 = d12;
                    }
                    arrayList = new ArrayList(arrayList2.size());
                    int size4 = arrayList2.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        Object obj6 = arrayList2.get(i18);
                        if (AbstractC3557B.K(((S0.I) ((AbstractC1356q) obj6)).f15980b, d11)) {
                            arrayList.add(obj6);
                        }
                    }
                } else {
                    S0.D d14 = S0.D.f15969h0;
                    if (d10.compareTo(d14) > 0) {
                        int size5 = arrayList2.size();
                        S0.D d15 = null;
                        S0.D d16 = null;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size5) {
                                break;
                            }
                            S0.D d17 = ((S0.I) ((AbstractC1356q) arrayList2.get(i19))).f15980b;
                            int e03 = AbstractC3557B.e0(d17.f15975Y, i15);
                            int i20 = d17.f15975Y;
                            if (e03 < 0) {
                                if (d15 == null || AbstractC3557B.e0(i20, d15.f15975Y) > 0) {
                                    d15 = d17;
                                }
                            } else if (AbstractC3557B.e0(i20, i15) > 0) {
                                if (d16 == null || AbstractC3557B.e0(i20, d16.f15975Y) < 0) {
                                    d16 = d17;
                                }
                            } else {
                                d15 = d17;
                                d16 = d15;
                                break;
                            }
                            i19++;
                        }
                        if (d16 != null) {
                            d15 = d16;
                        }
                        arrayList = new ArrayList(arrayList2.size());
                        int size6 = arrayList2.size();
                        for (int i21 = 0; i21 < size6; i21++) {
                            Object obj7 = arrayList2.get(i21);
                            if (AbstractC3557B.K(((S0.I) ((AbstractC1356q) obj7)).f15980b, d15)) {
                                arrayList.add(obj7);
                            }
                        }
                    } else {
                        int size7 = arrayList2.size();
                        S0.D d18 = null;
                        S0.D d19 = null;
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size7) {
                                break;
                            }
                            S0.D d20 = ((S0.I) ((AbstractC1356q) arrayList2.get(i22))).f15980b;
                            if (AbstractC3557B.e0(d20.f15975Y, d14.f15975Y) <= 0) {
                                int e04 = AbstractC3557B.e0(d20.f15975Y, i15);
                                int i23 = d20.f15975Y;
                                if (e04 < 0) {
                                    if (d18 == null || AbstractC3557B.e0(i23, d18.f15975Y) > 0) {
                                        d18 = d20;
                                    }
                                } else if (AbstractC3557B.e0(i23, i15) > 0) {
                                    if (d19 == null || AbstractC3557B.e0(i23, d19.f15975Y) < 0) {
                                        d19 = d20;
                                    }
                                } else {
                                    d18 = d20;
                                    d19 = d18;
                                    break;
                                }
                            }
                            i22++;
                        }
                        if (d19 != null) {
                            d18 = d19;
                        }
                        arrayList = new ArrayList(arrayList2.size());
                        int size8 = arrayList2.size();
                        for (int i24 = 0; i24 < size8; i24++) {
                            Object obj8 = arrayList2.get(i24);
                            if (AbstractC3557B.K(((S0.I) ((AbstractC1356q) obj8)).f15980b, d18)) {
                                arrayList.add(obj8);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            S0.D d21 = S0.D.f15969h0;
                            int size9 = arrayList2.size();
                            S0.D d22 = null;
                            S0.D d23 = null;
                            int i25 = 0;
                            while (true) {
                                if (i25 >= size9) {
                                    break;
                                }
                                S0.D d24 = ((S0.I) ((AbstractC1356q) arrayList2.get(i25))).f15980b;
                                if (d21 == null || AbstractC3557B.e0(d24.f15975Y, d21.f15975Y) >= 0) {
                                    int e05 = AbstractC3557B.e0(d24.f15975Y, i15);
                                    int i26 = d24.f15975Y;
                                    if (e05 < 0) {
                                        if (d22 == null || AbstractC3557B.e0(i26, d22.f15975Y) > 0) {
                                            d22 = d24;
                                        }
                                    } else if (AbstractC3557B.e0(i26, i15) > 0) {
                                        if (d23 == null || AbstractC3557B.e0(i26, d23.f15975Y) < 0) {
                                            d23 = d24;
                                        }
                                    } else {
                                        d22 = d24;
                                        d23 = d22;
                                        break;
                                    }
                                }
                                i25++;
                            }
                            if (d23 != null) {
                                d22 = d23;
                            }
                            arrayList = new ArrayList(arrayList2.size());
                            int size10 = arrayList2.size();
                            for (int i27 = 0; i27 < size10; i27++) {
                                Object obj9 = arrayList2.get(i27);
                                if (AbstractC3557B.K(((S0.I) ((AbstractC1356q) obj9)).f15980b, d22)) {
                                    arrayList.add(obj9);
                                }
                            }
                        }
                    }
                }
                arrayList3 = arrayList;
            }
            C1352m c1352m = yVar.f16059a;
            int size11 = arrayList3.size();
            ArrayList arrayList5 = null;
            int i28 = 0;
            while (true) {
                if (i28 < size11) {
                    AbstractC1356q abstractC1356q = (AbstractC1356q) arrayList3.get(i28);
                    int i29 = ((S0.I) abstractC1356q).f15983e;
                    if (Gi.e.v(i29, 0)) {
                        synchronized (c1352m.f16041c) {
                            try {
                                g10.getClass();
                                C1350k c1350k = new C1350k(abstractC1356q);
                                C1349j c1349j = (C1349j) c1352m.f16039a.a(c1350k);
                                if (c1349j == null) {
                                    c1349j = (C1349j) c1352m.f16040b.a(c1350k);
                                }
                                if (c1349j != null) {
                                    obj2 = c1349j.f16031a;
                                } else {
                                    try {
                                        obj2 = ((C1341b) g10).b(abstractC1356q);
                                        C1352m.b(c1352m, abstractC1356q, g10, obj2);
                                    } catch (Exception e10) {
                                        throw new IllegalStateException("Unable to load font " + abstractC1356q, e10);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 != null) {
                            c3959i = new C3959i(arrayList5, M3.H.x0(m10.f15989d, obj2, abstractC1356q, m10.f15987b, m10.f15988c));
                        } else {
                            throw new IllegalStateException("Unable to load font " + abstractC1356q);
                        }
                    } else if (Gi.e.v(i29, 1)) {
                        synchronized (c1352m.f16041c) {
                            try {
                                g10.getClass();
                                C1350k c1350k2 = new C1350k(abstractC1356q);
                                C1349j c1349j2 = (C1349j) c1352m.f16039a.a(c1350k2);
                                if (c1349j2 == null) {
                                    c1349j2 = (C1349j) c1352m.f16040b.a(c1350k2);
                                }
                                if (c1349j2 != null) {
                                    obj3 = c1349j2.f16031a;
                                } else {
                                    try {
                                        obj3 = ((C1341b) g10).b(abstractC1356q);
                                    } catch (Throwable th3) {
                                        obj3 = com.google.android.gms.internal.play_billing.N.w(th3);
                                    }
                                    if (obj3 instanceof C3960j) {
                                        obj3 = null;
                                    }
                                    C1352m.b(c1352m, abstractC1356q, g10, obj3);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (obj3 != null) {
                            c3959i = new C3959i(arrayList5, M3.H.x0(m10.f15989d, obj3, abstractC1356q, m10.f15987b, m10.f15988c));
                            break;
                        }
                        i10 = 1;
                        i28 += i10;
                    } else if (Gi.e.v(i29, 2)) {
                        C1349j a5 = c1352m.a(abstractC1356q, g10);
                        if (a5 == null) {
                            if (arrayList5 == null) {
                                i10 = 1;
                                arrayList5 = AbstractC4344b.N0(abstractC1356q);
                            } else {
                                i10 = 1;
                                arrayList5.add(abstractC1356q);
                            }
                        } else {
                            i10 = 1;
                            Object obj10 = a5.f16031a;
                            if (obj10 != null) {
                                c3959i = new C3959i(arrayList5, M3.H.x0(m10.f15989d, obj10, abstractC1356q, m10.f15987b, m10.f15988c));
                                break;
                            }
                        }
                        i28 += i10;
                    } else {
                        throw new IllegalStateException("Unknown font type " + abstractC1356q);
                    }
                } else {
                    c3959i = new C3959i(arrayList5, c0571a.invoke(m10));
                    break;
                }
            }
            List list = (List) c3959i.f36155Y;
            Object obj11 = c3959i.f36156Z;
            if (list == null) {
                q10 = new S0.P(obj11, true);
            } else {
                C1348i c1348i = new C1348i(list, obj11, m10, yVar.f16059a, kVar, g10);
                Ad.l.O0(yVar.f16060b, null, Ng.G.f12870i0, new S0.w(c1348i, null), 1);
                q10 = new S0.O(c1348i);
            }
        }
        if (q10 == null) {
            S0.F f6 = ((S0.t) this.f297h0).f16049e;
            S0.M m11 = (S0.M) this.f296Z;
            f6.getClass();
            S0.s sVar2 = m11.f15986a;
            f8.e eVar = f6.f15978a;
            int i30 = m11.f15988c;
            S0.D d25 = m11.f15987b;
            if (sVar2 == null || (sVar2 instanceof C1353n)) {
                switch (eVar.f29664Y) {
                    case 0:
                        typeface = f8.e.l(null, d25, i30);
                        break;
                    default:
                        typeface = f8.e.m(null, d25, i30);
                        break;
                }
            } else if (sVar2 instanceof S0.E) {
                S0.E e11 = (S0.E) sVar2;
                switch (eVar.f29664Y) {
                    case 0:
                        typeface = f8.e.l(e11.f15976i0, d25, i30);
                        break;
                    default:
                        String str = e11.f15976i0;
                        int i31 = d25.f15975Y / 100;
                        if (i31 >= 0 && i31 < 2) {
                            str = android.gov.nist.core.a.g(str, "-thin");
                        } else if (2 <= i31 && i31 < 4) {
                            str = android.gov.nist.core.a.g(str, "-light");
                        } else if (i31 != 4) {
                            if (i31 == 5) {
                                str = android.gov.nist.core.a.g(str, "-medium");
                            } else if ((6 > i31 || i31 >= 8) && 8 <= i31 && i31 < 11) {
                                str = android.gov.nist.core.a.g(str, "-black");
                            }
                        }
                        if (str.length() == 0) {
                            typeface2 = null;
                        } else {
                            Typeface m12 = f8.e.m(str, d25, i30);
                            if (!AbstractC3557B.K(m12, Typeface.create(Typeface.DEFAULT, r9.y.j0(d25, i30)))) {
                                typeface3 = null;
                                if (!AbstractC3557B.K(m12, f8.e.m(null, d25, i30))) {
                                    typeface2 = m12;
                                }
                            } else {
                                typeface3 = null;
                            }
                            typeface2 = typeface3;
                        }
                        if (typeface2 == null) {
                            typeface2 = f8.e.m(e11.f15976i0, d25, i30);
                        }
                        typeface = typeface2;
                        break;
                }
            } else {
                p10 = null;
                if (p10 == null) {
                    return p10;
                }
                throw new IllegalStateException("Could not load font");
            }
            p10 = new S0.P(typeface, true);
            if (p10 == null) {
            }
        } else {
            return q10;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [Z.M, java.lang.Object] */
    public final Z.M a(Z.N n10) {
        int i10 = this.f295Y;
        Object obj = this.f296Z;
        Object obj2 = this.f297h0;
        switch (i10) {
            case 3:
                E.B0 b02 = (E.B0) obj2;
                View view = (View) obj;
                if (b02.f3756t == 0) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    E.Q q10 = b02.f3757u;
                    D1.N.u(view, q10);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(q10);
                    D1.Z.n(view, q10);
                }
                b02.f3756t++;
                return new C6678S(b02, 4, view);
            case 4:
                G.c0 c0Var = (G.c0) obj2;
                c0Var.f5490c.remove(obj);
                return new C6678S(c0Var, 5, obj);
            case 9:
                return new C6678S((AbstractC1710f0) obj2, 6, (D.m) obj);
            case 20:
                Context context = (Context) obj2;
                H0.Y y10 = (H0.Y) obj;
                context.getApplicationContext().registerComponentCallbacks(y10);
                return new C6678S(context, 7, y10);
            default:
                C2584s c2584s = (C2584s) obj2;
                c2584s.setPositionProvider((AbstractC2586u) obj);
                c2584s.m();
                return new Object();
        }
    }

    public final void c(E0.c0 c0Var) {
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f295Y;
        int i15 = 0;
        Object obj2 = this.f296Z;
        Object obj3 = this.f297h0;
        switch (i14) {
            case 5:
                List list = (List) obj3;
                int size = list.size();
                int i16 = 0;
                while (i16 < size) {
                    C0659h c0659h = (C0659h) list.get(i16);
                    if (c0659h.f6636n != Integer.MIN_VALUE) {
                        List list2 = c0659h.f6625c;
                        int size2 = list2.size();
                        int i17 = i15;
                        while (i17 < size2) {
                            E0.d0 d0Var = (E0.d0) list2.get(i17);
                            int i18 = i17 * 2;
                            int[] iArr = c0659h.f6634l;
                            long c10 = kotlin.jvm.internal.m.c(iArr[i18], iArr[i18 + 1]);
                            boolean z10 = c0659h.f6631i;
                            boolean z11 = c0659h.f6632j;
                            if (z10) {
                                if (z11) {
                                    int i19 = Z0.i.f22798c;
                                    obj = obj2;
                                    i10 = (int) (c10 >> 32);
                                } else {
                                    obj = obj2;
                                    int i20 = Z0.i.f22798c;
                                    int i21 = c0659h.f6636n - ((int) (c10 >> 32));
                                    if (z11) {
                                        i13 = d0Var.f4054Z;
                                    } else {
                                        i13 = d0Var.f4053Y;
                                    }
                                    i10 = i21 - i13;
                                }
                                if (z11) {
                                    int i22 = c0659h.f6636n - ((int) (c10 & 4294967295L));
                                    if (z11) {
                                        i12 = d0Var.f4054Z;
                                    } else {
                                        i12 = d0Var.f4053Y;
                                    }
                                    i11 = i22 - i12;
                                } else {
                                    i11 = (int) (c10 & 4294967295L);
                                }
                                c10 = kotlin.jvm.internal.m.c(i10, i11);
                            } else {
                                obj = obj2;
                            }
                            int i23 = Z0.i.f22798c;
                            int i24 = size;
                            long j6 = c0659h.f6626d;
                            List list3 = list;
                            long c11 = kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j6 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (j6 & 4294967295L)));
                            if (z11) {
                                E0.c0.m(c0Var, d0Var, c11, null, 6);
                            } else {
                                E0.c0.i(c0Var, d0Var, c11, null, 6);
                            }
                            i17++;
                            obj2 = obj;
                            list = list3;
                            size = i24;
                        }
                        i16++;
                        i15 = 0;
                    } else {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                }
                ((AbstractC1710f0) obj2).getValue();
                return;
            case 15:
                float f6 = ((C4328t) obj2).f37735s0;
                c0Var.getClass();
                E0.c0.c((E0.d0) obj3, 0, 0, f6);
                return;
            case 16:
                E0.c0.k(c0Var, (E0.d0) obj3, 0, 0, ((C5349m) obj2).f44251s0, 4);
                return;
            default:
                E0.c0.k(c0Var, (E0.d0) obj3, 0, 0, ((r0.M) obj2).f44214I0, 4);
                return;
        }
    }

    public final void e(Throwable th2) {
        switch (this.f295Y) {
            case 11:
                g();
                return;
            case 12:
                i();
                return;
            case 13:
                j(th2);
                return;
            case 21:
                C0676e0 c0676e0 = (C0676e0) this.f297h0;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.f296Z;
                synchronized (c0676e0.f6941i0) {
                    c0676e0.f6943k0.remove(frameCallback);
                }
                return;
            default:
                ((C0680g0) this.f297h0).f6954Y.removeFrameCallback((Choreographer.FrameCallback) this.f296Z);
                return;
        }
    }

    public final void f(AbstractC5646e abstractC5646e) {
        int i10 = this.f295Y;
        Object obj = this.f297h0;
        switch (i10) {
            case 0:
                ((G0.J) abstractC5646e).a();
                AbstractC2469q0.p(obj);
                throw null;
            default:
                G0.J j6 = (G0.J) abstractC5646e;
                j6.a();
                AbstractC5648g.h(j6, (r0.E) obj, (AbstractC5350n) this.f296Z, 0.0f, null, 60);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r2 == null) goto L14;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i10;
        String str;
        String str2;
        LayoutInflater layoutInflater;
        switch (this.f295Y) {
            case 0:
                f((AbstractC5646e) obj);
                return jf.y.f36177a;
            case 1:
                f((AbstractC5646e) obj);
                return jf.y.f36177a;
            case 2:
            case 19:
            default:
                return a((Z.N) obj);
            case 3:
                return a((Z.N) obj);
            case 4:
                return a((Z.N) obj);
            case 5:
                c((E0.c0) obj);
                return jf.y.f36177a;
            case 6:
                T0.z zVar = (T0.z) obj;
                if (!AbstractC3557B.K((T0.z) this.f297h0, zVar)) {
                    ((wf.k) this.f296Z).invoke(zVar);
                }
                return jf.y.f36177a;
            case 7:
                return o(((C6739b) obj).f51432a);
            case 8:
                return o(((C6739b) obj).f51432a);
            case 9:
                return a((Z.N) obj);
            case 10:
                B0.u uVar = (B0.u) obj;
                if (((AbstractC1028l) this.f297h0).a(uVar.f1672c, (AbstractC1038w) this.f296Z)) {
                    uVar.a();
                }
                return jf.y.f36177a;
            case 11:
                e((Throwable) obj);
                return jf.y.f36177a;
            case 12:
                e((Throwable) obj);
                return jf.y.f36177a;
            case 13:
                e((Throwable) obj);
                return jf.y.f36177a;
            case 14:
                ((C1744x) ((Z.D) this.f297h0)).y(obj);
                C2099c c2099c = (C2099c) this.f296Z;
                if (c2099c != null) {
                    c2099c.add(obj);
                }
                return jf.y.f36177a;
            case 15:
                c((E0.c0) obj);
                return jf.y.f36177a;
            case 16:
                c((E0.c0) obj);
                return jf.y.f36177a;
            case 17:
                c((E0.c0) obj);
                return jf.y.f36177a;
            case 18:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                Object obj2 = this.f296Z;
                if (actionMasked == 0) {
                    B0.C c10 = (B0.C) this.f297h0;
                    wf.k kVar = ((B0.D) obj2).f1591b;
                    if (kVar != null) {
                        if (((Boolean) kVar.invoke(motionEvent)).booleanValue()) {
                            i10 = 2;
                        } else {
                            i10 = 3;
                        }
                        c10.f1589b = i10;
                    } else {
                        AbstractC3557B.C2("onTouchEvent");
                        throw null;
                    }
                } else {
                    wf.k kVar2 = ((B0.D) obj2).f1591b;
                    if (kVar2 != null) {
                        kVar2.invoke(motionEvent);
                    } else {
                        AbstractC3557B.C2("onTouchEvent");
                        throw null;
                    }
                }
                return jf.y.f36177a;
            case 20:
                return a((Z.N) obj);
            case 21:
                e((Throwable) obj);
                return jf.y.f36177a;
            case 22:
                e((Throwable) obj);
                return jf.y.f36177a;
            case 23:
                C0699q c0699q = (C0699q) obj;
                y1 y1Var = (y1) this.f297h0;
                if (!y1Var.f7146h0) {
                    androidx.lifecycle.S h10 = c0699q.f6989a.h();
                    wf.n nVar = (wf.n) this.f296Z;
                    y1Var.f7148j0 = nVar;
                    if (y1Var.f7147i0 == null) {
                        y1Var.f7147i0 = h10;
                        h10.a(y1Var);
                    } else if (h10.f().a(EnumC2082q.f25377h0)) {
                        y1Var.f7145Z.d(new C3288a(new x1(y1Var, nVar, 1), true, -2000640158));
                    }
                }
                return jf.y.f36177a;
            case 24:
                return m(obj);
            case 25:
                S0.Q q10 = (S0.Q) obj;
                S0.N n10 = (S0.N) this.f297h0;
                P5.c cVar = n10.f15991a;
                S0.M m10 = (S0.M) this.f296Z;
                synchronized (cVar) {
                    try {
                        if (q10.a()) {
                            n10.f15992b.b(m10, q10);
                        } else {
                            n10.f15992b.c(m10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return jf.y.f36177a;
            case 26:
                AbstractC1414i abstractC1414i = (AbstractC1414i) obj;
                if (((AbstractC1414i) this.f297h0) == abstractC1414i) {
                    str = " > ";
                } else {
                    str = "   ";
                }
                StringBuilder p10 = android.gov.nist.core.a.p(str);
                ((T0.j) this.f296Z).getClass();
                if (abstractC1414i instanceof C1406a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    C1406a c1406a = (C1406a) abstractC1414i;
                    sb2.append(c1406a.f16759a.f12512Y.length());
                    sb2.append(", newCursorPosition=");
                    str2 = AbstractC2469q0.j(sb2, c1406a.f16760b, ')');
                } else if (abstractC1414i instanceof T0.x) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    T0.x xVar = (T0.x) abstractC1414i;
                    sb3.append(xVar.f16826a.f12512Y.length());
                    sb3.append(", newCursorPosition=");
                    str2 = AbstractC2469q0.j(sb3, xVar.f16827b, ')');
                } else if (abstractC1414i instanceof T0.w) {
                    str2 = abstractC1414i.toString();
                } else if (abstractC1414i instanceof C1412g) {
                    str2 = abstractC1414i.toString();
                } else if (abstractC1414i instanceof C1413h) {
                    str2 = abstractC1414i.toString();
                } else if (abstractC1414i instanceof T0.y) {
                    str2 = abstractC1414i.toString();
                } else if (abstractC1414i instanceof T0.l) {
                    str2 = abstractC1414i.toString();
                } else if (abstractC1414i instanceof C1411f) {
                    str2 = abstractC1414i.toString();
                } else {
                    String o10 = kotlin.jvm.internal.C.f37623a.b(abstractC1414i.getClass()).o();
                    if (o10 == null) {
                        o10 = "{anonymous EditCommand}";
                    }
                    str2 = "Unknown EditCommand: ".concat(o10);
                }
                p10.append(str2);
                return p10.toString();
            case 27:
                Context context = (Context) obj;
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) this.f297h0;
                if (abstractComponentCallbacksC1480v != null) {
                    layoutInflater = abstractComponentCallbacksC1480v.f18274O0;
                    if (layoutInflater == null) {
                        layoutInflater = abstractComponentCallbacksC1480v.D(null);
                        abstractComponentCallbacksC1480v.f18274O0 = layoutInflater;
                        break;
                    }
                }
                layoutInflater = LayoutInflater.from(context);
                J3.a aVar = (J3.a) ((wf.o) this.f296Z).invoke(layoutInflater, new FrameLayout(context), Boolean.FALSE);
                FragmentContainerView fragmentContainerView = ((Gb.a) aVar).f6258a;
                fragmentContainerView.setTag(R.id.binding_reference, aVar);
                return fragmentContainerView;
            case 28:
                ((androidx.compose.ui.node.a) this.f297h0).w0(((AbstractC4326r) obj).g((AbstractC4326r) this.f296Z));
                return jf.y.f36177a;
        }
    }

    public final Boolean o(KeyEvent keyEvent) {
        int i10 = this.f295Y;
        boolean z10 = true;
        Object obj = this.f296Z;
        Object obj2 = this.f297h0;
        switch (i10) {
            case 7:
                if (((L.P0) obj2).a() == L.Z.f10086Z && keyEvent.getKeyCode() == 4 && r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 1)) {
                    ((N.t0) obj).f(null);
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 2)) {
                    if (kotlin.jvm.internal.m.l(19, keyEvent)) {
                        z10 = ((p0.g) ((p0.f) obj2)).b(5);
                    } else if (kotlin.jvm.internal.m.l(20, keyEvent)) {
                        z10 = ((p0.g) ((p0.f) obj2)).b(6);
                    } else if (kotlin.jvm.internal.m.l(21, keyEvent)) {
                        z10 = ((p0.g) ((p0.f) obj2)).b(3);
                    } else if (kotlin.jvm.internal.m.l(22, keyEvent)) {
                        z10 = ((p0.g) ((p0.f) obj2)).b(4);
                    } else if (kotlin.jvm.internal.m.l(23, keyEvent)) {
                        H0.T0 t02 = ((L.P0) obj).f10031c;
                        if (t02 != null) {
                            T0.A a5 = ((C0705t0) t02).f7042a;
                            if (((T0.F) a5.f16731b.get()) != null) {
                                ((T0.D) a5.f16730a).a(T0.B.f16734h0);
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = false;
                return Boolean.valueOf(z10);
        }
    }
}
