package V1;

import D1.AbstractC0367o;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC2082q;
import com.openai.chatgpt.R;
import g.AbstractC3106E;
import g.AbstractC3110c;
import g.C3104C;
import g.C3105D;
import g.C3113f;
import g.C3116i;
import g.RunnableC3118k;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j$.util.DesugarCollections;
import j.C3875e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k.C4145a;
import n.AbstractC4694e;
import o1.C4901p;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: A  reason: collision with root package name */
    public C3875e f18030A;

    /* renamed from: B  reason: collision with root package name */
    public C3875e f18031B;

    /* renamed from: C  reason: collision with root package name */
    public C3875e f18032C;

    /* renamed from: E  reason: collision with root package name */
    public boolean f18034E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f18035F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f18036G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f18037H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f18038I;

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f18039J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f18040K;

    /* renamed from: L  reason: collision with root package name */
    public ArrayList f18041L;

    /* renamed from: M  reason: collision with root package name */
    public M f18042M;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18045b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f18047d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f18048e;

    /* renamed from: g  reason: collision with root package name */
    public C3104C f18050g;

    /* renamed from: m  reason: collision with root package name */
    public final U3.e f18056m;

    /* renamed from: u  reason: collision with root package name */
    public C1482x f18064u;

    /* renamed from: v  reason: collision with root package name */
    public AbstractC4694e f18065v;

    /* renamed from: w  reason: collision with root package name */
    public AbstractComponentCallbacksC1480v f18066w;

    /* renamed from: x  reason: collision with root package name */
    public AbstractComponentCallbacksC1480v f18067x;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f18044a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final U3.i f18046c = new U3.i(6);

    /* renamed from: f  reason: collision with root package name */
    public final A f18049f = new A(this);

    /* renamed from: h  reason: collision with root package name */
    public final C3105D f18051h = new C3105D(this);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f18052i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f18053j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f18054k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map f18055l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList f18057n = new CopyOnWriteArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final B f18058o = new C1.a(this) { // from class: V1.B

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ K f18017b;

        {
            this.f18017b = this;
        }

        @Override // C1.a
        public final void accept(Object obj) {
            int i10 = r2;
            K k10 = this.f18017b;
            switch (i10) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (k10.I()) {
                        k10.h(false);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (k10.I() && num.intValue() == 80) {
                        k10.l(false);
                        return;
                    }
                    return;
                case 2:
                    C4901p c4901p = (C4901p) obj;
                    if (k10.I()) {
                        k10.m(c4901p.f40474a, false);
                        return;
                    }
                    return;
                default:
                    o1.P p10 = (o1.P) obj;
                    if (k10.I()) {
                        k10.r(p10.f40447a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: p  reason: collision with root package name */
    public final B f18059p = new C1.a(this) { // from class: V1.B

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ K f18017b;

        {
            this.f18017b = this;
        }

        @Override // C1.a
        public final void accept(Object obj) {
            int i10 = r2;
            K k10 = this.f18017b;
            switch (i10) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (k10.I()) {
                        k10.h(false);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (k10.I() && num.intValue() == 80) {
                        k10.l(false);
                        return;
                    }
                    return;
                case 2:
                    C4901p c4901p = (C4901p) obj;
                    if (k10.I()) {
                        k10.m(c4901p.f40474a, false);
                        return;
                    }
                    return;
                default:
                    o1.P p10 = (o1.P) obj;
                    if (k10.I()) {
                        k10.r(p10.f40447a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: q  reason: collision with root package name */
    public final B f18060q = new C1.a(this) { // from class: V1.B

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ K f18017b;

        {
            this.f18017b = this;
        }

        @Override // C1.a
        public final void accept(Object obj) {
            int i10 = r2;
            K k10 = this.f18017b;
            switch (i10) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (k10.I()) {
                        k10.h(false);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (k10.I() && num.intValue() == 80) {
                        k10.l(false);
                        return;
                    }
                    return;
                case 2:
                    C4901p c4901p = (C4901p) obj;
                    if (k10.I()) {
                        k10.m(c4901p.f40474a, false);
                        return;
                    }
                    return;
                default:
                    o1.P p10 = (o1.P) obj;
                    if (k10.I()) {
                        k10.r(p10.f40447a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: r  reason: collision with root package name */
    public final B f18061r = new C1.a(this) { // from class: V1.B

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ K f18017b;

        {
            this.f18017b = this;
        }

        @Override // C1.a
        public final void accept(Object obj) {
            int i10 = r2;
            K k10 = this.f18017b;
            switch (i10) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (k10.I()) {
                        k10.h(false);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (k10.I() && num.intValue() == 80) {
                        k10.l(false);
                        return;
                    }
                    return;
                case 2:
                    C4901p c4901p = (C4901p) obj;
                    if (k10.I()) {
                        k10.m(c4901p.f40474a, false);
                        return;
                    }
                    return;
                default:
                    o1.P p10 = (o1.P) obj;
                    if (k10.I()) {
                        k10.r(p10.f40447a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: s  reason: collision with root package name */
    public final D f18062s = new D(this);

    /* renamed from: t  reason: collision with root package name */
    public int f18063t = -1;

    /* renamed from: y  reason: collision with root package name */
    public final E f18068y = new E(this);

    /* renamed from: z  reason: collision with root package name */
    public final F f18069z = new F(this);

    /* renamed from: D  reason: collision with root package name */
    public ArrayDeque f18033D = new ArrayDeque();

    /* renamed from: N  reason: collision with root package name */
    public final RunnableC3118k f18043N = new RunnableC3118k(8, this);

    /* JADX WARN: Type inference failed for: r0v11, types: [U3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [V1.B] */
    /* JADX WARN: Type inference failed for: r0v14, types: [V1.B] */
    /* JADX WARN: Type inference failed for: r0v15, types: [V1.B] */
    /* JADX WARN: Type inference failed for: r0v16, types: [V1.B] */
    public K() {
        ?? obj = new Object();
        obj.f17400Y = new CopyOnWriteArrayList();
        obj.f17401Z = this;
        this.f18056m = obj;
    }

    public static AbstractComponentCallbacksC1480v C(View view) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v;
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof AbstractComponentCallbacksC1480v) {
                abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) tag;
            } else {
                abstractComponentCallbacksC1480v = null;
            }
            if (abstractComponentCallbacksC1480v != null) {
                return abstractComponentCallbacksC1480v;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static boolean H(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        Iterator it = abstractComponentCallbacksC1480v.f18304y0.f18046c.w().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = (AbstractComponentCallbacksC1480v) it.next();
            if (abstractComponentCallbacksC1480v2 != null) {
                z10 = H(abstractComponentCallbacksC1480v2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (abstractComponentCallbacksC1480v == null) {
            return true;
        }
        if (abstractComponentCallbacksC1480v.f18266G0 && (abstractComponentCallbacksC1480v.f18302w0 == null || J(abstractComponentCallbacksC1480v.f18305z0))) {
            return true;
        }
        return false;
    }

    public static boolean K(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (abstractComponentCallbacksC1480v == null) {
            return true;
        }
        K k10 = abstractComponentCallbacksC1480v.f18302w0;
        if (abstractComponentCallbacksC1480v.equals(k10.f18067x) && K(k10.f18066w)) {
            return true;
        }
        return false;
    }

    public static void a0(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC1480v);
        }
        if (abstractComponentCallbacksC1480v.f18263D0) {
            abstractComponentCallbacksC1480v.f18263D0 = false;
            abstractComponentCallbacksC1480v.f18273N0 = !abstractComponentCallbacksC1480v.f18273N0;
        }
    }

    public final void A(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        U3.i iVar;
        U3.i iVar2;
        U3.i iVar3;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z10 = ((C1460a) arrayList3.get(i10)).f18146o;
        ArrayList arrayList5 = this.f18041L;
        if (arrayList5 == null) {
            this.f18041L = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f18041L;
        U3.i iVar4 = this.f18046c;
        arrayList6.addAll(iVar4.z());
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18067x;
        int i15 = i10;
        boolean z11 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i11) {
                C1460a c1460a = (C1460a) arrayList3.get(i15);
                if (!((Boolean) arrayList4.get(i15)).booleanValue()) {
                    ArrayList arrayList7 = this.f18041L;
                    int i17 = 0;
                    while (i17 < c1460a.f18132a.size()) {
                        Q q10 = (Q) c1460a.f18132a.get(i17);
                        int i18 = q10.f18104a;
                        if (i18 != i16) {
                            if (i18 != 2) {
                                if (i18 != 3 && i18 != 6) {
                                    if (i18 != 7) {
                                        if (i18 == 8) {
                                            c1460a.f18132a.add(i17, new Q(9, abstractComponentCallbacksC1480v, 0));
                                            q10.f18106c = true;
                                            i17++;
                                            abstractComponentCallbacksC1480v = q10.f18105b;
                                        }
                                    } else {
                                        iVar3 = iVar4;
                                        i12 = 1;
                                    }
                                } else {
                                    arrayList7.remove(q10.f18105b);
                                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = q10.f18105b;
                                    if (abstractComponentCallbacksC1480v2 == abstractComponentCallbacksC1480v) {
                                        c1460a.f18132a.add(i17, new Q(9, abstractComponentCallbacksC1480v2));
                                        i17++;
                                        iVar3 = iVar4;
                                        i12 = 1;
                                        abstractComponentCallbacksC1480v = null;
                                        i17 += i12;
                                        i16 = i12;
                                        iVar4 = iVar3;
                                    }
                                }
                                iVar3 = iVar4;
                                i12 = 1;
                                i17 += i12;
                                i16 = i12;
                                iVar4 = iVar3;
                            } else {
                                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = q10.f18105b;
                                int i19 = abstractComponentCallbacksC1480v3.f18261B0;
                                int size = arrayList7.size() - 1;
                                boolean z12 = false;
                                while (size >= 0) {
                                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v4 = (AbstractComponentCallbacksC1480v) arrayList7.get(size);
                                    U3.i iVar5 = iVar4;
                                    if (abstractComponentCallbacksC1480v4.f18261B0 == i19) {
                                        if (abstractComponentCallbacksC1480v4 == abstractComponentCallbacksC1480v3) {
                                            i13 = i19;
                                            z12 = true;
                                        } else {
                                            if (abstractComponentCallbacksC1480v4 == abstractComponentCallbacksC1480v) {
                                                i13 = i19;
                                                i14 = 0;
                                                c1460a.f18132a.add(i17, new Q(9, abstractComponentCallbacksC1480v4, 0));
                                                i17++;
                                                abstractComponentCallbacksC1480v = null;
                                            } else {
                                                i13 = i19;
                                                i14 = 0;
                                            }
                                            Q q11 = new Q(3, abstractComponentCallbacksC1480v4, i14);
                                            q11.f18107d = q10.f18107d;
                                            q11.f18109f = q10.f18109f;
                                            q11.f18108e = q10.f18108e;
                                            q11.f18110g = q10.f18110g;
                                            c1460a.f18132a.add(i17, q11);
                                            arrayList7.remove(abstractComponentCallbacksC1480v4);
                                            i17++;
                                        }
                                    } else {
                                        i13 = i19;
                                    }
                                    size--;
                                    iVar4 = iVar5;
                                    i19 = i13;
                                }
                                iVar3 = iVar4;
                                if (z12) {
                                    c1460a.f18132a.remove(i17);
                                    i17--;
                                    i12 = 1;
                                    i17 += i12;
                                    i16 = i12;
                                    iVar4 = iVar3;
                                } else {
                                    i12 = 1;
                                    q10.f18104a = 1;
                                    q10.f18106c = true;
                                    arrayList7.add(abstractComponentCallbacksC1480v3);
                                    i17 += i12;
                                    i16 = i12;
                                    iVar4 = iVar3;
                                }
                            }
                        } else {
                            iVar3 = iVar4;
                            i12 = i16;
                        }
                        arrayList7.add(q10.f18105b);
                        i17 += i12;
                        i16 = i12;
                        iVar4 = iVar3;
                    }
                    iVar2 = iVar4;
                } else {
                    iVar2 = iVar4;
                    int i20 = 1;
                    ArrayList arrayList8 = this.f18041L;
                    int size2 = c1460a.f18132a.size() - 1;
                    while (size2 >= 0) {
                        Q q12 = (Q) c1460a.f18132a.get(size2);
                        int i21 = q12.f18104a;
                        if (i21 != i20) {
                            if (i21 != 3) {
                                switch (i21) {
                                    case 8:
                                        abstractComponentCallbacksC1480v = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC1480v = q12.f18105b;
                                        break;
                                    case 10:
                                        q12.f18112i = q12.f18111h;
                                        break;
                                }
                                size2--;
                                i20 = 1;
                            }
                            arrayList8.add(q12.f18105b);
                            size2--;
                            i20 = 1;
                        }
                        arrayList8.remove(q12.f18105b);
                        size2--;
                        i20 = 1;
                    }
                }
                if (!z11 && !c1460a.f18138g) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i15++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                iVar4 = iVar2;
            } else {
                U3.i iVar6 = iVar4;
                this.f18041L.clear();
                if (!z10 && this.f18063t >= 1) {
                    for (int i22 = i10; i22 < i11; i22++) {
                        Iterator it = ((C1460a) arrayList.get(i22)).f18132a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v5 = ((Q) it.next()).f18105b;
                            if (abstractComponentCallbacksC1480v5 != null && abstractComponentCallbacksC1480v5.f18302w0 != null) {
                                iVar = iVar6;
                                iVar.D(f(abstractComponentCallbacksC1480v5));
                            } else {
                                iVar = iVar6;
                            }
                            iVar6 = iVar;
                        }
                    }
                }
                for (int i23 = i10; i23 < i11; i23++) {
                    C1460a c1460a2 = (C1460a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue()) {
                        c1460a2.c(-1);
                        for (int size3 = c1460a2.f18132a.size() - 1; size3 >= 0; size3--) {
                            Q q13 = (Q) c1460a2.f18132a.get(size3);
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v6 = q13.f18105b;
                            if (abstractComponentCallbacksC1480v6 != null) {
                                if (abstractComponentCallbacksC1480v6.f18272M0 != null) {
                                    abstractComponentCallbacksC1480v6.j().f18246a = true;
                                }
                                int i24 = c1460a2.f18137f;
                                int i25 = 8194;
                                int i26 = 4097;
                                if (i24 != 4097) {
                                    if (i24 != 8194) {
                                        i25 = LexerCore.IPV6;
                                        i26 = 8197;
                                        if (i24 != 8197) {
                                            if (i24 != 4099) {
                                                if (i24 != 4100) {
                                                    i25 = 0;
                                                }
                                            } else {
                                                i25 = 4099;
                                            }
                                        }
                                    }
                                    i25 = i26;
                                }
                                if (abstractComponentCallbacksC1480v6.f18272M0 != null || i25 != 0) {
                                    abstractComponentCallbacksC1480v6.j();
                                    abstractComponentCallbacksC1480v6.f18272M0.f18251f = i25;
                                }
                                ArrayList arrayList9 = c1460a2.f18145n;
                                ArrayList arrayList10 = c1460a2.f18144m;
                                abstractComponentCallbacksC1480v6.j();
                                C1479u c1479u = abstractComponentCallbacksC1480v6.f18272M0;
                                c1479u.f18252g = arrayList9;
                                c1479u.f18253h = arrayList10;
                            }
                            int i27 = q13.f18104a;
                            K k10 = c1460a2.f18147p;
                            switch (i27) {
                                case 1:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.W(abstractComponentCallbacksC1480v6, true);
                                    k10.R(abstractComponentCallbacksC1480v6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + q13.f18104a);
                                case 3:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.a(abstractComponentCallbacksC1480v6);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.getClass();
                                    a0(abstractComponentCallbacksC1480v6);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.W(abstractComponentCallbacksC1480v6, true);
                                    k10.G(abstractComponentCallbacksC1480v6);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.c(abstractComponentCallbacksC1480v6);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1480v6.M(q13.f18107d, q13.f18108e, q13.f18109f, q13.f18110g);
                                    k10.W(abstractComponentCallbacksC1480v6, true);
                                    k10.g(abstractComponentCallbacksC1480v6);
                                    break;
                                case 8:
                                    k10.Y(null);
                                    break;
                                case 9:
                                    k10.Y(abstractComponentCallbacksC1480v6);
                                    break;
                                case 10:
                                    k10.X(abstractComponentCallbacksC1480v6, q13.f18111h);
                                    break;
                            }
                        }
                    } else {
                        c1460a2.c(1);
                        int size4 = c1460a2.f18132a.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            Q q14 = (Q) c1460a2.f18132a.get(i28);
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v7 = q14.f18105b;
                            if (abstractComponentCallbacksC1480v7 != null) {
                                if (abstractComponentCallbacksC1480v7.f18272M0 != null) {
                                    abstractComponentCallbacksC1480v7.j().f18246a = false;
                                }
                                int i29 = c1460a2.f18137f;
                                if (abstractComponentCallbacksC1480v7.f18272M0 != null || i29 != 0) {
                                    abstractComponentCallbacksC1480v7.j();
                                    abstractComponentCallbacksC1480v7.f18272M0.f18251f = i29;
                                }
                                ArrayList arrayList11 = c1460a2.f18144m;
                                ArrayList arrayList12 = c1460a2.f18145n;
                                abstractComponentCallbacksC1480v7.j();
                                C1479u c1479u2 = abstractComponentCallbacksC1480v7.f18272M0;
                                c1479u2.f18252g = arrayList11;
                                c1479u2.f18253h = arrayList12;
                            }
                            int i30 = q14.f18104a;
                            K k11 = c1460a2.f18147p;
                            switch (i30) {
                                case 1:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.W(abstractComponentCallbacksC1480v7, false);
                                    k11.a(abstractComponentCallbacksC1480v7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + q14.f18104a);
                                case 3:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.R(abstractComponentCallbacksC1480v7);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.G(abstractComponentCallbacksC1480v7);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.W(abstractComponentCallbacksC1480v7, false);
                                    a0(abstractComponentCallbacksC1480v7);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.g(abstractComponentCallbacksC1480v7);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1480v7.M(q14.f18107d, q14.f18108e, q14.f18109f, q14.f18110g);
                                    k11.W(abstractComponentCallbacksC1480v7, false);
                                    k11.c(abstractComponentCallbacksC1480v7);
                                    break;
                                case 8:
                                    k11.Y(abstractComponentCallbacksC1480v7);
                                    break;
                                case 9:
                                    k11.Y(null);
                                    break;
                                case 10:
                                    k11.X(abstractComponentCallbacksC1480v7, q14.f18112i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                for (int i31 = i10; i31 < i11; i31++) {
                    C1460a c1460a3 = (C1460a) arrayList.get(i31);
                    if (booleanValue) {
                        for (int size5 = c1460a3.f18132a.size() - 1; size5 >= 0; size5--) {
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v8 = ((Q) c1460a3.f18132a.get(size5)).f18105b;
                            if (abstractComponentCallbacksC1480v8 != null) {
                                f(abstractComponentCallbacksC1480v8).k();
                            }
                        }
                    } else {
                        Iterator it2 = c1460a3.f18132a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v9 = ((Q) it2.next()).f18105b;
                            if (abstractComponentCallbacksC1480v9 != null) {
                                f(abstractComponentCallbacksC1480v9).k();
                            }
                        }
                    }
                }
                M(this.f18063t, true);
                HashSet hashSet = new HashSet();
                for (int i32 = i10; i32 < i11; i32++) {
                    Iterator it3 = ((C1460a) arrayList.get(i32)).f18132a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v10 = ((Q) it3.next()).f18105b;
                        if (abstractComponentCallbacksC1480v10 != null && (viewGroup = abstractComponentCallbacksC1480v10.f18268I0) != null) {
                            hashSet.add(C1471l.l(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C1471l c1471l = (C1471l) it4.next();
                    c1471l.f18219d = booleanValue;
                    c1471l.m();
                    c1471l.h();
                }
                for (int i33 = i10; i33 < i11; i33++) {
                    C1460a c1460a4 = (C1460a) arrayList.get(i33);
                    if (((Boolean) arrayList2.get(i33)).booleanValue() && c1460a4.f18149r >= 0) {
                        c1460a4.f18149r = -1;
                    }
                    c1460a4.getClass();
                }
                return;
            }
        }
    }

    public final AbstractComponentCallbacksC1480v B(int i10) {
        U3.i iVar = this.f18046c;
        for (int size = ((ArrayList) iVar.f17414Y).size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) ((ArrayList) iVar.f17414Y).get(size);
            if (abstractComponentCallbacksC1480v != null && abstractComponentCallbacksC1480v.f18260A0 == i10) {
                return abstractComponentCallbacksC1480v;
            }
        }
        for (P p10 : ((HashMap) iVar.f17415Z).values()) {
            if (p10 != null) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = p10.f18101c;
                if (abstractComponentCallbacksC1480v2.f18260A0 == i10) {
                    return abstractComponentCallbacksC1480v2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        ViewGroup viewGroup = abstractComponentCallbacksC1480v.f18268I0;
        if (viewGroup == null) {
            if (abstractComponentCallbacksC1480v.f18261B0 > 0 && this.f18065v.l()) {
                View k10 = this.f18065v.k(abstractComponentCallbacksC1480v.f18261B0);
                if (k10 instanceof ViewGroup) {
                    return (ViewGroup) k10;
                }
            }
            return null;
        }
        return viewGroup;
    }

    public final E E() {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            return abstractComponentCallbacksC1480v.f18302w0.E();
        }
        return this.f18068y;
    }

    public final F F() {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            return abstractComponentCallbacksC1480v.f18302w0.F();
        }
        return this.f18069z;
    }

    public final void G(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC1480v);
        }
        if (!abstractComponentCallbacksC1480v.f18263D0) {
            abstractComponentCallbacksC1480v.f18263D0 = true;
            abstractComponentCallbacksC1480v.f18273N0 = true ^ abstractComponentCallbacksC1480v.f18273N0;
            Z(abstractComponentCallbacksC1480v);
        }
    }

    public final boolean I() {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18066w;
        if (abstractComponentCallbacksC1480v == null) {
            return true;
        }
        if (abstractComponentCallbacksC1480v.s() && this.f18066w.o().I()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (!this.f18035F && !this.f18036G) {
            return false;
        }
        return true;
    }

    public final void M(int i10, boolean z10) {
        C1482x c1482x;
        if (this.f18064u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f18063t) {
            this.f18063t = i10;
            U3.i iVar = this.f18046c;
            Iterator it = ((ArrayList) iVar.f17414Y).iterator();
            while (it.hasNext()) {
                P p10 = (P) ((HashMap) iVar.f17415Z).get(((AbstractComponentCallbacksC1480v) it.next()).f18289j0);
                if (p10 != null) {
                    p10.k();
                }
            }
            for (P p11 : ((HashMap) iVar.f17415Z).values()) {
                if (p11 != null) {
                    p11.k();
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p11.f18101c;
                    if (abstractComponentCallbacksC1480v.f18296q0 && !abstractComponentCallbacksC1480v.u()) {
                        iVar.E(p11);
                    }
                }
            }
            b0();
            if (this.f18034E && (c1482x = this.f18064u) != null && this.f18063t == 7) {
                c1482x.f18312j0.invalidateOptionsMenu();
                this.f18034E = false;
            }
        }
    }

    public final void N() {
        if (this.f18064u != null) {
            this.f18035F = false;
            this.f18036G = false;
            this.f18042M.f18084i = false;
            for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
                if (abstractComponentCallbacksC1480v != null) {
                    abstractComponentCallbacksC1480v.f18304y0.N();
                }
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i10, int i11) {
        y(false);
        x(true);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18067x;
        if (abstractComponentCallbacksC1480v != null && i10 < 0 && abstractComponentCallbacksC1480v.l().O()) {
            return true;
        }
        boolean Q = Q(this.f18039J, this.f18040K, i10, i11);
        if (Q) {
            this.f18045b = true;
            try {
                S(this.f18039J, this.f18040K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f18038I) {
            this.f18038I = false;
            b0();
        }
        ((HashMap) this.f18046c.f17415Z).values().removeAll(Collections.singleton(null));
        return Q;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList3 = this.f18047d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : this.f18047d.size() - 1;
            } else {
                int size = this.f18047d.size() - 1;
                while (size >= 0) {
                    C1460a c1460a = (C1460a) this.f18047d.get(size);
                    if (i10 >= 0 && i10 == c1460a.f18149r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            C1460a c1460a2 = (C1460a) this.f18047d.get(size - 1);
                            if (i10 < 0 || i10 != c1460a2.f18149r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f18047d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f18047d.size() - 1; size2 >= i12; size2--) {
            arrayList.add((C1460a) this.f18047d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC1480v + " nesting=" + abstractComponentCallbacksC1480v.f18301v0);
        }
        boolean z10 = !abstractComponentCallbacksC1480v.u();
        if (!abstractComponentCallbacksC1480v.f18264E0 || z10) {
            this.f18046c.I(abstractComponentCallbacksC1480v);
            if (H(abstractComponentCallbacksC1480v)) {
                this.f18034E = true;
            }
            abstractComponentCallbacksC1480v.f18296q0 = true;
            Z(abstractComponentCallbacksC1480v);
        }
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!((C1460a) arrayList.get(i10)).f18146o) {
                        if (i11 != i10) {
                            A(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                            while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1460a) arrayList.get(i11)).f18146o) {
                                i11++;
                            }
                        }
                        A(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    A(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [V1.Q, java.lang.Object] */
    public final void T(Bundle bundle) {
        int i10;
        U3.e eVar;
        int i11;
        boolean z10;
        P p10;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f18064u.f18309Z.getClassLoader());
                this.f18054k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f18064u.f18309Z.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        U3.i iVar = this.f18046c;
        ((HashMap) iVar.f17416h0).clear();
        ((HashMap) iVar.f17416h0).putAll(hashMap);
        L l10 = (L) bundle.getParcelable("state");
        if (l10 != null) {
            ((HashMap) iVar.f17415Z).clear();
            Iterator it = l10.f18070Y.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i10 = 2;
                eVar = this.f18056m;
                if (!hasNext) {
                    break;
                }
                Bundle J10 = iVar.J(null, (String) it.next());
                if (J10 != null) {
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) this.f18042M.f18079d.get(((O) J10.getParcelable("state")).f18086Z);
                    if (abstractComponentCallbacksC1480v != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC1480v);
                        }
                        p10 = new P(eVar, iVar, abstractComponentCallbacksC1480v, J10);
                    } else {
                        p10 = new P(this.f18056m, this.f18046c, this.f18064u.f18309Z.getClassLoader(), E(), J10);
                    }
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = p10.f18101c;
                    abstractComponentCallbacksC1480v2.f18286Z = J10;
                    abstractComponentCallbacksC1480v2.f18302w0 = this;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC1480v2.f18289j0 + "): " + abstractComponentCallbacksC1480v2);
                    }
                    p10.m(this.f18064u.f18309Z.getClassLoader());
                    iVar.D(p10);
                    p10.f18103e = this.f18063t;
                }
            }
            M m10 = this.f18042M;
            m10.getClass();
            Iterator it2 = new ArrayList(m10.f18079d.values()).iterator();
            while (it2.hasNext()) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = (AbstractComponentCallbacksC1480v) it2.next();
                if (((HashMap) iVar.f17415Z).get(abstractComponentCallbacksC1480v3.f18289j0) == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC1480v3 + " that was not found in the set of active Fragments " + l10.f18070Y);
                    }
                    this.f18042M.h(abstractComponentCallbacksC1480v3);
                    abstractComponentCallbacksC1480v3.f18302w0 = this;
                    P p11 = new P(eVar, iVar, abstractComponentCallbacksC1480v3);
                    p11.f18103e = 1;
                    p11.k();
                    abstractComponentCallbacksC1480v3.f18296q0 = true;
                    p11.k();
                }
            }
            ArrayList<String> arrayList = l10.f18071Z;
            ((ArrayList) iVar.f17414Y).clear();
            if (arrayList != null) {
                for (String str3 : arrayList) {
                    AbstractComponentCallbacksC1480v s10 = iVar.s(str3);
                    if (s10 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + s10);
                        }
                        iVar.n(s10);
                    } else {
                        throw new IllegalStateException(android.gov.nist.core.a.A("No instantiated fragment for (", str3, Separators.RPAREN));
                    }
                }
            }
            if (l10.f18072h0 != null) {
                this.f18047d = new ArrayList(l10.f18072h0.length);
                int i12 = 0;
                while (true) {
                    C1462c[] c1462cArr = l10.f18072h0;
                    if (i12 >= c1462cArr.length) {
                        break;
                    }
                    C1462c c1462c = c1462cArr[i12];
                    c1462c.getClass();
                    C1460a c1460a = new C1460a(this);
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        int[] iArr = c1462c.f18160Y;
                        if (i13 >= iArr.length) {
                            break;
                        }
                        ?? obj = new Object();
                        int i15 = i13 + 1;
                        obj.f18104a = iArr[i13];
                        if (Log.isLoggable("FragmentManager", i10)) {
                            Log.v("FragmentManager", "Instantiate " + c1460a + " op #" + i14 + " base fragment #" + iArr[i15]);
                        }
                        obj.f18111h = EnumC2082q.values()[c1462c.f18162h0[i14]];
                        obj.f18112i = EnumC2082q.values()[c1462c.f18163i0[i14]];
                        int i16 = i13 + 2;
                        if (iArr[i15] != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        obj.f18106c = z10;
                        int i17 = iArr[i16];
                        obj.f18107d = i17;
                        int i18 = iArr[i13 + 3];
                        obj.f18108e = i18;
                        int i19 = i13 + 5;
                        int i20 = iArr[i13 + 4];
                        obj.f18109f = i20;
                        i13 += 6;
                        int i21 = iArr[i19];
                        obj.f18110g = i21;
                        c1460a.f18133b = i17;
                        c1460a.f18134c = i18;
                        c1460a.f18135d = i20;
                        c1460a.f18136e = i21;
                        c1460a.b(obj);
                        i14++;
                        i10 = 2;
                    }
                    c1460a.f18137f = c1462c.f18164j0;
                    c1460a.f18139h = c1462c.f18165k0;
                    c1460a.f18138g = true;
                    c1460a.f18140i = c1462c.f18167m0;
                    c1460a.f18141j = c1462c.f18168n0;
                    c1460a.f18142k = c1462c.f18169o0;
                    c1460a.f18143l = c1462c.f18170p0;
                    c1460a.f18144m = c1462c.f18171q0;
                    c1460a.f18145n = c1462c.f18172r0;
                    c1460a.f18146o = c1462c.f18173s0;
                    c1460a.f18149r = c1462c.f18166l0;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = c1462c.f18161Z;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        String str4 = (String) arrayList2.get(i22);
                        if (str4 != null) {
                            ((Q) c1460a.f18132a.get(i22)).f18105b = iVar.s(str4);
                        }
                        i22++;
                    }
                    c1460a.c(1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder q10 = android.gov.nist.core.a.q("restoreAllState: back stack #", i12, " (index ");
                        q10.append(c1460a.f18149r);
                        q10.append("): ");
                        q10.append(c1460a);
                        Log.v("FragmentManager", q10.toString());
                        PrintWriter printWriter = new PrintWriter(new b0());
                        c1460a.f("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f18047d.add(c1460a);
                    i12++;
                    i10 = 2;
                }
                i11 = 0;
            } else {
                i11 = 0;
                this.f18047d = null;
            }
            this.f18052i.set(l10.f18073i0);
            String str5 = l10.f18074j0;
            if (str5 != null) {
                AbstractComponentCallbacksC1480v s11 = iVar.s(str5);
                this.f18067x = s11;
                q(s11);
            }
            ArrayList arrayList3 = l10.f18075k0;
            if (arrayList3 != null) {
                for (int i23 = i11; i23 < arrayList3.size(); i23++) {
                    this.f18053j.put((String) arrayList3.get(i23), (C1463d) l10.f18076l0.get(i23));
                }
            }
            this.f18033D = new ArrayDeque(l10.f18077m0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable, java.lang.Object, V1.L] */
    public final Bundle U() {
        int i10;
        ArrayList arrayList;
        C1462c[] c1462cArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1471l c1471l = (C1471l) it.next();
            if (c1471l.f18220e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c1471l.f18220e = false;
                c1471l.h();
            }
        }
        v();
        y(true);
        this.f18035F = true;
        this.f18042M.f18084i = true;
        U3.i iVar = this.f18046c;
        iVar.getClass();
        ArrayList arrayList2 = new ArrayList(((HashMap) iVar.f17415Z).size());
        for (P p10 : ((HashMap) iVar.f17415Z).values()) {
            if (p10 != null) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
                iVar.J(p10.o(), abstractComponentCallbacksC1480v.f18289j0);
                arrayList2.add(abstractComponentCallbacksC1480v.f18289j0);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC1480v + ": " + abstractComponentCallbacksC1480v.f18286Z);
                }
            }
        }
        HashMap hashMap = (HashMap) this.f18046c.f17416h0;
        if (hashMap.isEmpty()) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            U3.i iVar2 = this.f18046c;
            synchronized (((ArrayList) iVar2.f17414Y)) {
                try {
                    if (((ArrayList) iVar2.f17414Y).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) iVar2.f17414Y).size());
                        Iterator it2 = ((ArrayList) iVar2.f17414Y).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = (AbstractComponentCallbacksC1480v) it2.next();
                            arrayList.add(abstractComponentCallbacksC1480v2.f18289j0);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC1480v2.f18289j0 + "): " + abstractComponentCallbacksC1480v2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f18047d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                c1462cArr = new C1462c[size];
                for (i10 = 0; i10 < size; i10++) {
                    c1462cArr[i10] = new C1462c((C1460a) this.f18047d.get(i10));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder q10 = android.gov.nist.core.a.q("saveAllState: adding back stack #", i10, ": ");
                        q10.append(this.f18047d.get(i10));
                        Log.v("FragmentManager", q10.toString());
                    }
                }
            } else {
                c1462cArr = null;
            }
            ?? obj = new Object();
            obj.f18074j0 = null;
            ArrayList arrayList4 = new ArrayList();
            obj.f18075k0 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj.f18076l0 = arrayList5;
            obj.f18070Y = arrayList2;
            obj.f18071Z = arrayList;
            obj.f18072h0 = c1462cArr;
            obj.f18073i0 = this.f18052i.get();
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = this.f18067x;
            if (abstractComponentCallbacksC1480v3 != null) {
                obj.f18074j0 = abstractComponentCallbacksC1480v3.f18289j0;
            }
            arrayList4.addAll(this.f18053j.keySet());
            arrayList5.addAll(this.f18053j.values());
            obj.f18077m0 = new ArrayList(this.f18033D);
            bundle.putParcelable("state", obj);
            for (String str : this.f18054k.keySet()) {
                bundle.putBundle(R.a.r("result_", str), (Bundle) this.f18054k.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle(R.a.r("fragment_", str2), (Bundle) hashMap.get(str2));
            }
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f18044a) {
            try {
                if (this.f18044a.size() == 1) {
                    this.f18064u.f18310h0.removeCallbacks(this.f18043N);
                    this.f18064u.f18310h0.post(this.f18043N);
                    e0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void W(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, boolean z10) {
        ViewGroup D6 = D(abstractComponentCallbacksC1480v);
        if (D6 != null && (D6 instanceof FragmentContainerView)) {
            ((FragmentContainerView) D6).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void X(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, EnumC2082q enumC2082q) {
        if (abstractComponentCallbacksC1480v.equals(this.f18046c.s(abstractComponentCallbacksC1480v.f18289j0)) && (abstractComponentCallbacksC1480v.f18303x0 == null || abstractComponentCallbacksC1480v.f18302w0 == this)) {
            abstractComponentCallbacksC1480v.f18277R0 = enumC2082q;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1480v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (abstractComponentCallbacksC1480v != null) {
            if (!abstractComponentCallbacksC1480v.equals(this.f18046c.s(abstractComponentCallbacksC1480v.f18289j0)) || (abstractComponentCallbacksC1480v.f18303x0 != null && abstractComponentCallbacksC1480v.f18302w0 != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1480v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = this.f18067x;
        this.f18067x = abstractComponentCallbacksC1480v;
        q(abstractComponentCallbacksC1480v2);
        q(this.f18067x);
    }

    public final void Z(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup D6 = D(abstractComponentCallbacksC1480v);
        if (D6 != null) {
            C1479u c1479u = abstractComponentCallbacksC1480v.f18272M0;
            boolean z10 = false;
            if (c1479u == null) {
                i10 = 0;
            } else {
                i10 = c1479u.f18247b;
            }
            if (c1479u == null) {
                i11 = 0;
            } else {
                i11 = c1479u.f18248c;
            }
            int i14 = i11 + i10;
            if (c1479u == null) {
                i12 = 0;
            } else {
                i12 = c1479u.f18249d;
            }
            int i15 = i12 + i14;
            if (c1479u == null) {
                i13 = 0;
            } else {
                i13 = c1479u.f18250e;
            }
            if (i13 + i15 > 0) {
                if (D6.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D6.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1480v);
                }
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = (AbstractComponentCallbacksC1480v) D6.getTag(R.id.visible_removing_fragment_view_tag);
                C1479u c1479u2 = abstractComponentCallbacksC1480v.f18272M0;
                if (c1479u2 != null) {
                    z10 = c1479u2.f18246a;
                }
                if (abstractComponentCallbacksC1480v2.f18272M0 != null) {
                    abstractComponentCallbacksC1480v2.j().f18246a = z10;
                }
            }
        }
    }

    public final P a(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        String str = abstractComponentCallbacksC1480v.f18276Q0;
        if (str != null) {
            W1.c.d(abstractComponentCallbacksC1480v, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC1480v);
        }
        P f6 = f(abstractComponentCallbacksC1480v);
        abstractComponentCallbacksC1480v.f18302w0 = this;
        U3.i iVar = this.f18046c;
        iVar.D(f6);
        if (!abstractComponentCallbacksC1480v.f18264E0) {
            iVar.n(abstractComponentCallbacksC1480v);
            abstractComponentCallbacksC1480v.f18296q0 = false;
            if (abstractComponentCallbacksC1480v.f18269J0 == null) {
                abstractComponentCallbacksC1480v.f18273N0 = false;
            }
            if (H(abstractComponentCallbacksC1480v)) {
                this.f18034E = true;
            }
        }
        return f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [P4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [P4.a, java.lang.Object] */
    public final void b(C1482x c1482x, AbstractC4694e abstractC4694e, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        String str;
        C1482x c1482x2;
        if (this.f18064u == null) {
            this.f18064u = c1482x;
            this.f18065v = abstractC4694e;
            this.f18066w = abstractComponentCallbacksC1480v;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18057n;
            if (abstractComponentCallbacksC1480v != 0) {
                copyOnWriteArrayList.add(new G(abstractComponentCallbacksC1480v));
            } else if (c1482x instanceof N) {
                copyOnWriteArrayList.add(c1482x);
            }
            if (this.f18066w != null) {
                e0();
            }
            if (c1482x instanceof AbstractC3106E) {
                C3104C a5 = c1482x.f18312j0.a();
                this.f18050g = a5;
                if (abstractComponentCallbacksC1480v != 0) {
                    c1482x2 = abstractComponentCallbacksC1480v;
                } else {
                    c1482x2 = c1482x;
                }
                a5.a(c1482x2, this.f18051h);
            }
            if (abstractComponentCallbacksC1480v != 0) {
                M m10 = abstractComponentCallbacksC1480v.f18302w0.f18042M;
                HashMap hashMap = m10.f18080e;
                M m11 = (M) hashMap.get(abstractComponentCallbacksC1480v.f18289j0);
                if (m11 == null) {
                    m11 = new M(m10.f18082g);
                    hashMap.put(abstractComponentCallbacksC1480v.f18289j0, m11);
                }
                this.f18042M = m11;
            } else if (c1482x instanceof androidx.lifecycle.e0) {
                this.f18042M = (M) new U3.u(c1482x.f18312j0.e(), M.f18078j).l(M.class);
            } else {
                this.f18042M = new M(false);
            }
            this.f18042M.f18084i = L();
            this.f18046c.f17417i0 = this.f18042M;
            C1482x c1482x3 = this.f18064u;
            if ((c1482x3 instanceof A3.f) && abstractComponentCallbacksC1480v == 0) {
                A3.d f6 = c1482x3.f();
                f6.c("android:support:fragments", new C3113f(3, this));
                Bundle a10 = f6.a("android:support:fragments");
                if (a10 != null) {
                    T(a10);
                }
            }
            C1482x c1482x4 = this.f18064u;
            if (c1482x4 instanceof j.i) {
                C3116i c3116i = c1482x4.f18312j0.f30976q0;
                if (abstractComponentCallbacksC1480v != 0) {
                    str = R.a.t(new StringBuilder(), abstractComponentCallbacksC1480v.f18289j0, ":");
                } else {
                    str = "";
                }
                String r10 = R.a.r("FragmentManager:", str);
                this.f18030A = c3116i.c(android.gov.nist.core.a.g(r10, "StartActivityForResult"), new Object(), new C(this, 1));
                this.f18031B = c3116i.c(android.gov.nist.core.a.g(r10, "StartIntentSenderForResult"), new C4145a(3), new F(this));
                this.f18032C = c3116i.c(android.gov.nist.core.a.g(r10, "RequestPermissions"), new Object(), new C(this, 0));
            }
            C1482x c1482x5 = this.f18064u;
            if (c1482x5 instanceof p1.n) {
                c1482x5.s(this.f18058o);
            }
            C1482x c1482x6 = this.f18064u;
            if (c1482x6 instanceof p1.o) {
                c1482x6.v(this.f18059p);
            }
            C1482x c1482x7 = this.f18064u;
            if (c1482x7 instanceof o1.N) {
                c1482x7.t(this.f18060q);
            }
            C1482x c1482x8 = this.f18064u;
            if (c1482x8 instanceof o1.O) {
                c1482x8.u(this.f18061r);
            }
            C1482x c1482x9 = this.f18064u;
            if ((c1482x9 instanceof AbstractC0367o) && abstractComponentCallbacksC1480v == 0) {
                c1482x9.r(this.f18062s);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0() {
        Iterator it = this.f18046c.v().iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
            if (abstractComponentCallbacksC1480v.f18270K0) {
                if (this.f18045b) {
                    this.f18038I = true;
                } else {
                    abstractComponentCallbacksC1480v.f18270K0 = false;
                    p10.k();
                }
            }
        }
    }

    public final void c(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC1480v);
        }
        if (abstractComponentCallbacksC1480v.f18264E0) {
            abstractComponentCallbacksC1480v.f18264E0 = false;
            if (!abstractComponentCallbacksC1480v.f18295p0) {
                this.f18046c.n(abstractComponentCallbacksC1480v);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC1480v);
                }
                if (H(abstractComponentCallbacksC1480v)) {
                    this.f18034E = true;
                }
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        AbstractC3612c.c("FragmentManager", illegalStateException.getMessage());
        AbstractC3612c.c("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b0());
        C1482x c1482x = this.f18064u;
        if (c1482x != null) {
            try {
                c1482x.f18312j0.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e10) {
                AbstractC3612c.d("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                u("  ", null, printWriter, new String[0]);
            } catch (Exception e11) {
                AbstractC3612c.d("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw illegalStateException;
    }

    public final void d() {
        this.f18045b = false;
        this.f18040K.clear();
        this.f18039J.clear();
    }

    /* renamed from: d0 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            sb2.append(abstractComponentCallbacksC1480v.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f18066w)));
            sb2.append("}");
        } else {
            C1482x c1482x = this.f18064u;
            if (c1482x != null) {
                sb2.append(c1482x.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f18064u)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final HashSet e() {
        C1471l c1471l;
        HashSet hashSet = new HashSet();
        Iterator it = this.f18046c.v().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((P) it.next()).f18101c.f18268I0;
            if (viewGroup != null) {
                AbstractC3557B.c0("factory", F());
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C1471l) {
                    c1471l = (C1471l) tag;
                } else {
                    c1471l = new C1471l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1471l);
                }
                hashSet.add(c1471l);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f18044a) {
            try {
                boolean z10 = true;
                if (!this.f18044a.isEmpty()) {
                    C3105D c3105d = this.f18051h;
                    c3105d.f30995a = true;
                    AbstractC6216a abstractC6216a = c3105d.f30997c;
                    if (abstractC6216a != null) {
                        abstractC6216a.mo122invoke();
                    }
                    return;
                }
                C3105D c3105d2 = this.f18051h;
                ArrayList arrayList = this.f18047d;
                if (arrayList == null || arrayList.size() <= 0 || !K(this.f18066w)) {
                    z10 = false;
                }
                c3105d2.f30995a = z10;
                AbstractC6216a abstractC6216a2 = c3105d2.f30997c;
                if (abstractC6216a2 != null) {
                    abstractC6216a2.mo122invoke();
                }
            } finally {
            }
        }
    }

    public final P f(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        String str = abstractComponentCallbacksC1480v.f18289j0;
        U3.i iVar = this.f18046c;
        P p10 = (P) ((HashMap) iVar.f17415Z).get(str);
        if (p10 == null) {
            P p11 = new P(this.f18056m, iVar, abstractComponentCallbacksC1480v);
            p11.m(this.f18064u.f18309Z.getClassLoader());
            p11.f18103e = this.f18063t;
            return p11;
        }
        return p10;
    }

    public final void g(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC1480v);
        }
        if (!abstractComponentCallbacksC1480v.f18264E0) {
            abstractComponentCallbacksC1480v.f18264E0 = true;
            if (abstractComponentCallbacksC1480v.f18295p0) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC1480v);
                }
                this.f18046c.I(abstractComponentCallbacksC1480v);
                if (H(abstractComponentCallbacksC1480v)) {
                    this.f18034E = true;
                }
                Z(abstractComponentCallbacksC1480v);
            }
        }
    }

    public final void h(boolean z10) {
        if (z10 && (this.f18064u instanceof p1.n)) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null) {
                abstractComponentCallbacksC1480v.f18267H0 = true;
                if (z10) {
                    abstractComponentCallbacksC1480v.f18304y0.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f18063t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null && !abstractComponentCallbacksC1480v.f18263D0 && abstractComponentCallbacksC1480v.f18304y0.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f18063t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null && J(abstractComponentCallbacksC1480v) && !abstractComponentCallbacksC1480v.f18263D0 && abstractComponentCallbacksC1480v.f18304y0.j()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC1480v);
                z10 = true;
            }
        }
        if (this.f18048e != null) {
            for (int i10 = 0; i10 < this.f18048e.size(); i10++) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = (AbstractComponentCallbacksC1480v) this.f18048e.get(i10);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1480v2)) {
                    abstractComponentCallbacksC1480v2.getClass();
                }
            }
        }
        this.f18048e = arrayList;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z10;
        this.f18037H = true;
        y(true);
        v();
        C1482x c1482x = this.f18064u;
        boolean z11 = c1482x instanceof androidx.lifecycle.e0;
        U3.i iVar = this.f18046c;
        if (z11) {
            z10 = ((M) iVar.f17417i0).f18083h;
        } else {
            Context context = c1482x.f18309Z;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
            for (C1463d c1463d : this.f18053j.values()) {
                for (String str : c1463d.f18177Y) {
                    ((M) iVar.f17417i0).f(str, false);
                }
            }
            t(-1);
            C1482x c1482x2 = this.f18064u;
            if (c1482x2 instanceof p1.o) {
                c1482x2.A(this.f18059p);
            }
            C1482x c1482x3 = this.f18064u;
            if (c1482x3 instanceof p1.n) {
                c1482x3.x(this.f18058o);
            }
            C1482x c1482x4 = this.f18064u;
            if (c1482x4 instanceof o1.N) {
                c1482x4.y(this.f18060q);
            }
            C1482x c1482x5 = this.f18064u;
            if (c1482x5 instanceof o1.O) {
                c1482x5.z(this.f18061r);
            }
            C1482x c1482x6 = this.f18064u;
            if ((c1482x6 instanceof AbstractC0367o) && this.f18066w == null) {
                c1482x6.w(this.f18062s);
            }
            this.f18064u = null;
            this.f18065v = null;
            this.f18066w = null;
            if (this.f18050g != null) {
                Iterator it = this.f18051h.f30996b.iterator();
                while (it.hasNext()) {
                    ((AbstractC3110c) it.next()).cancel();
                }
                this.f18050g = null;
            }
            C3875e c3875e = this.f18030A;
            if (c3875e != null) {
                c3875e.i0();
                this.f18031B.i0();
                this.f18032C.i0();
            }
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f18064u instanceof p1.o)) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null) {
                abstractComponentCallbacksC1480v.f18267H0 = true;
                if (z10) {
                    abstractComponentCallbacksC1480v.f18304y0.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f18064u instanceof o1.N)) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null && z11) {
                abstractComponentCallbacksC1480v.f18304y0.m(z10, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f18046c.w().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) it.next();
            if (abstractComponentCallbacksC1480v != null) {
                abstractComponentCallbacksC1480v.t();
                abstractComponentCallbacksC1480v.f18304y0.n();
            }
        }
    }

    public final boolean o() {
        if (this.f18063t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null && !abstractComponentCallbacksC1480v.f18263D0 && abstractComponentCallbacksC1480v.f18304y0.o()) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (this.f18063t >= 1) {
            for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
                if (abstractComponentCallbacksC1480v != null && !abstractComponentCallbacksC1480v.f18263D0) {
                    abstractComponentCallbacksC1480v.f18304y0.p();
                }
            }
        }
    }

    public final void q(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (abstractComponentCallbacksC1480v != null) {
            if (abstractComponentCallbacksC1480v.equals(this.f18046c.s(abstractComponentCallbacksC1480v.f18289j0))) {
                abstractComponentCallbacksC1480v.f18302w0.getClass();
                boolean K10 = K(abstractComponentCallbacksC1480v);
                Boolean bool = abstractComponentCallbacksC1480v.f18294o0;
                if (bool == null || bool.booleanValue() != K10) {
                    abstractComponentCallbacksC1480v.f18294o0 = Boolean.valueOf(K10);
                    K k10 = abstractComponentCallbacksC1480v.f18304y0;
                    k10.e0();
                    k10.q(k10.f18067x);
                }
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f18064u instanceof o1.O)) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null && z11) {
                abstractComponentCallbacksC1480v.f18304y0.r(z10, true);
            }
        }
    }

    public final boolean s() {
        boolean z10 = false;
        if (this.f18063t >= 1) {
            for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : this.f18046c.z()) {
                if (abstractComponentCallbacksC1480v != null && J(abstractComponentCallbacksC1480v) && !abstractComponentCallbacksC1480v.f18263D0 && abstractComponentCallbacksC1480v.f18304y0.s()) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f18045b = true;
            for (P p10 : ((HashMap) this.f18046c.f17415Z).values()) {
                if (p10 != null) {
                    p10.f18103e = i10;
                }
            }
            M(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C1471l) it.next()).k();
            }
            this.f18045b = false;
            y(true);
        } catch (Throwable th2) {
            this.f18045b = false;
            throw th2;
        }
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String g10 = android.gov.nist.core.a.g(str, "    ");
        U3.i iVar = this.f18046c;
        iVar.getClass();
        String str2 = str + "    ";
        if (!((HashMap) iVar.f17415Z).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (P p10 : ((HashMap) iVar.f17415Z).values()) {
                printWriter.print(str);
                if (p10 != null) {
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
                    printWriter.println(abstractComponentCallbacksC1480v);
                    abstractComponentCallbacksC1480v.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) iVar.f17414Y).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC1480v) ((ArrayList) iVar.f17414Y).get(i10)).toString());
            }
        }
        ArrayList arrayList = this.f18048e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC1480v) this.f18048e.get(i11)).toString());
            }
        }
        ArrayList arrayList2 = this.f18047d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                C1460a c1460a = (C1460a) this.f18047d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c1460a.toString());
                c1460a.f(g10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18052i.get());
        synchronized (this.f18044a) {
            try {
                int size4 = this.f18044a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println((I) this.f18044a.get(i13));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18064u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18065v);
        if (this.f18066w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18066w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18063t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f18035F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18036G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f18037H);
        if (this.f18034E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f18034E);
        }
    }

    public final void v() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C1471l) it.next()).k();
        }
    }

    public final void w(I i10, boolean z10) {
        if (!z10) {
            if (this.f18064u == null) {
                if (this.f18037H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18044a) {
            try {
                if (this.f18064u == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                    return;
                }
                this.f18044a.add(i10);
                V();
            } finally {
            }
        }
    }

    public final void x(boolean z10) {
        if (!this.f18045b) {
            if (this.f18064u == null) {
                if (this.f18037H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f18064u.f18310h0.getLooper()) {
                if (!z10 && L()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f18039J == null) {
                    this.f18039J = new ArrayList();
                    this.f18040K = new ArrayList();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z10) {
        x(z10);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f18039J;
            ArrayList arrayList2 = this.f18040K;
            synchronized (this.f18044a) {
                if (this.f18044a.isEmpty()) {
                    break;
                }
                int size = this.f18044a.size();
                boolean z12 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z12 |= ((I) this.f18044a.get(i10)).a(arrayList, arrayList2);
                }
                this.f18044a.clear();
                this.f18064u.f18310h0.removeCallbacks(this.f18043N);
                if (!z12) {
                    break;
                }
                z11 = true;
                this.f18045b = true;
                try {
                    S(this.f18039J, this.f18040K);
                } finally {
                    d();
                }
            }
        }
        e0();
        if (this.f18038I) {
            this.f18038I = false;
            b0();
        }
        ((HashMap) this.f18046c.f17415Z).values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void z(I i10, boolean z10) {
        if (!z10 || (this.f18064u != null && !this.f18037H)) {
            x(z10);
            if (i10.a(this.f18039J, this.f18040K)) {
                this.f18045b = true;
                try {
                    S(this.f18039J, this.f18040K);
                } finally {
                    d();
                }
            }
            e0();
            if (this.f18038I) {
                this.f18038I = false;
                b0();
            }
            ((HashMap) this.f18046c.f17415Z).values().removeAll(Collections.singleton(null));
        }
    }
}
