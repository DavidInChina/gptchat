package U3;

import B0.A;
import B0.C0194k;
import Df.H;
import E2.C0479k;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0583l;
import H0.AbstractC0701r0;
import H0.Q;
import L.C0870r0;
import L.x0;
import N.S;
import N0.C;
import N0.C1042a;
import N0.C1046e;
import N0.D;
import T0.z;
import W.AbstractC1528b1;
import W.C1533c1;
import W.C1538d1;
import X.AbstractC1675i;
import Z.AbstractC1703c;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1720k0;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.o1;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import h0.C3288a;
import i4.C3474g;
import id.AbstractC3557B;
import j0.C3878C;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import jf.y;
import ji.C4113B;
import k5.C4173A;
import k5.C4175a;
import k5.C4178d;
import k5.C4182h;
import k5.C4190p;
import k5.J;
import k5.v;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4321m;
import l0.C4322n;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import q0.AbstractC5249a;
import q0.C5251c;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import w.C6077x;
import wf.AbstractC6216a;
import x6.AbstractC6287d;
import x6.AbstractC6301h1;
import x6.B0;
import x6.C6283b1;
import x6.C6298g1;
import x6.C6300h0;
import x6.C6304i1;
import x6.C6306j0;
import x6.C6310k1;
import x6.C6313l1;
import x6.C6315m0;
import x6.C6319n1;
import x6.C6321o0;
import x6.C6324p0;
import x6.C6329r0;
import x6.C6332s0;
import x6.C6335t0;
import x6.C6341v0;
import x6.C6353z0;
import x6.D0;
import x6.EnumC6286c1;
import x6.F0;
import x6.I0;
import x6.J0;
import x6.K0;
import x6.L0;
import x6.N0;
import x6.O0;
import x6.P0;
import x6.Q0;
import x6.R0;
import x6.S0;
import x6.T0;
import x6.U0;
import x6.V0;
import y.AbstractC6463a;
import y.C6460A;
import y.C6466d;
import y.C6467e;
import y.C6468f;
import y.C6469g;
import y.C6470h;
import y.C6473k;
import y.C6476n;
import y.C6477o;
import y.C6486y;
import y.O;
import y.p0;
import z.AbstractC6652A0;
import z.AbstractC6696f;
import z.AbstractC6708l;
import z.C6715o0;
import z.C6729v0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static C5953f f17402a;

    /* renamed from: b  reason: collision with root package name */
    public static C5953f f17403b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f17404c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f17405d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f17406e;

    /* renamed from: f  reason: collision with root package name */
    public static C5953f f17407f;

    public static C6306j0 A(I8.u uVar) {
        try {
            Number M10 = uVar.q0("width").M();
            Number M11 = uVar.q0("height").M();
            AbstractC3557B.b0("width", M10);
            AbstractC3557B.b0("height", M11);
            return new C6306j0(M10, M11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Viewport", e12);
        }
    }

    public static C6315m0 B(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new C6315m0(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Application", e12);
        }
    }

    public static C6321o0 C(I8.u uVar) {
        try {
            String T = uVar.q0("test_execution_id").T();
            AbstractC3557B.b0("testExecutionId", T);
            return new C6321o0(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type CiTest", e12);
        }
    }

    public static C6324p0 D(I8.u uVar) {
        Number number;
        try {
            Number M10 = uVar.q0("session_sample_rate").M();
            I8.r q02 = uVar.q0("session_replay_sample_rate");
            if (q02 != null) {
                number = q02.M();
            } else {
                number = null;
            }
            AbstractC3557B.b0("sessionSampleRate", M10);
            return new C6324p0(M10, number);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Configuration", e12);
        }
    }

    public static C6329r0 E(I8.u uVar) {
        int[] h10;
        try {
            C6332s0 M02 = R4.b.M0(uVar.q0("view").y());
            String T = uVar.q0("source").T();
            AbstractC3557B.b0("jsonObject.get(\"source\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.o(i10), T)) {
                    return new C6329r0(M02, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Container", e12);
        }
    }

    public static C6335t0 F(I8.u uVar) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                Object key = entry.getKey();
                AbstractC3557B.b0("entry.key", key);
                linkedHashMap.put(key, entry.getValue());
            }
            return new C6335t0(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Context", e12);
        }
    }

    public static C6341v0 G(I8.u uVar) {
        D0 d02;
        String T;
        String T10;
        try {
            I8.r q02 = uVar.q0("plan");
            int i10 = 0;
            if (q02 != null && (T10 = q02.T()) != null) {
                D0[] values = D0.values();
                int length = values.length;
                for (int i11 = 0; i11 < length; i11++) {
                    d02 = values[i11];
                    if (!AbstractC3557B.K(d02.f48938Y.toString(), T10)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            d02 = null;
            I8.r q03 = uVar.q0("session_precondition");
            if (q03 != null && (T = q03.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length2 = h10.length;
                while (i10 < length2) {
                    int i12 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6287d.p(i12), T)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C6341v0(d02, i10);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdSession", e12);
        }
    }

    public static C6353z0 H(I8.u uVar) {
        String str;
        try {
            I8.r q02 = uVar.q0(ParameterNames.ID);
            Boolean bool = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            long I10 = uVar.q0("duration").I();
            I8.r q03 = uVar.q0("is_frozen_frame");
            if (q03 != null) {
                bool = Boolean.valueOf(q03.f());
            }
            return new C6353z0(str, I10, bool);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type LongTask", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type LongTask", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type LongTask", e12);
        }
    }

    public static B0 I(I8.u uVar) {
        String str;
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            I8.r q02 = uVar.q0("referrer");
            String str2 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T10 = uVar.q0("url").T();
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            }
            AbstractC3557B.b0(ParameterNames.ID, T);
            AbstractC3557B.b0("url", T10);
            return new B0(T, str, T10, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type LongTaskEventView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type LongTaskEventView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type LongTaskEventView", e12);
        }
    }

    public static F0 J(I8.u uVar) {
        String str;
        String str2;
        try {
            I8.r q02 = uVar.q0(ParameterNames.ID);
            String str3 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("email");
            if (q04 != null) {
                str3 = q04.T();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                if (!kf.q.S2(entry.getKey(), F0.f48954e)) {
                    Object key = entry.getKey();
                    AbstractC3557B.b0("entry.key", key);
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new F0(str, str2, str3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Usr", e12);
        }
    }

    public static I0 K(I8.u uVar) {
        try {
            ArrayList arrayList = uVar.q0(ParameterNames.ID).s().f8131Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((I8.r) it.next()).T());
            }
            return new I0(arrayList2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Action", e12);
        }
    }

    public static K0 L(I8.u uVar) {
        String str;
        try {
            I8.r q02 = uVar.q0("technology");
            String str2 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("carrier_name");
            if (q03 != null) {
                str2 = q03.T();
            }
            return new K0(str, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Cellular", e12);
        }
    }

    public static N0 M(I8.u uVar) {
        try {
            return new N0(uVar.q0("duration").I(), uVar.q0("start").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Connect", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Connect", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Connect", e12);
        }
    }

    public static P0 N(I8.u uVar) {
        int[] h10;
        try {
            Q0 Z02 = R4.b.Z0(uVar.q0("view").y());
            String T = uVar.q0("source").T();
            AbstractC3557B.b0("jsonObject.get(\"source\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6301h1.a(i10), T)) {
                    return new P0(Z02, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Container", e12);
        }
    }

    public static R0 O(I8.u uVar) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                Object key = entry.getKey();
                AbstractC3557B.b0("entry.key", key);
                linkedHashMap.put(key, entry.getValue());
            }
            return new R0(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Context", e12);
        }
    }

    public static T0 P(I8.u uVar) {
        EnumC6286c1 enumC6286c1;
        String T;
        String T10;
        try {
            I8.r q02 = uVar.q0("plan");
            int i10 = 0;
            if (q02 != null && (T10 = q02.T()) != null) {
                EnumC6286c1[] values = EnumC6286c1.values();
                int length = values.length;
                for (int i11 = 0; i11 < length; i11++) {
                    enumC6286c1 = values[i11];
                    if (!AbstractC3557B.K(enumC6286c1.f49275Y.toString(), T10)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            enumC6286c1 = null;
            I8.r q03 = uVar.q0("session_precondition");
            if (q03 != null && (T = q03.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length2 = h10.length;
                while (i10 < length2) {
                    int i12 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6301h1.c(i12), T)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new T0(enumC6286c1, i10);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdSession", e12);
        }
    }

    public static C6319n1 Q(I8.u uVar) {
        String str;
        String str2;
        String str3;
        C6313l1 c6313l1;
        O0 o02;
        V0 v02;
        C6310k1 c6310k1;
        L0 l02;
        C6283b1 c6283b1;
        U0 u02;
        R0 r02;
        I0 i02;
        P0 p02;
        String T;
        AbstractC3557B.c0("jsonObject", uVar);
        try {
            long I10 = uVar.q0("date").I();
            J0 V02 = R4.b.V0(uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION).y());
            I8.r q02 = uVar.q0(ReferencesHeader.SERVICE);
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0(ParameterNames.VERSION);
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("build_version");
            if (q04 != null) {
                str3 = q04.T();
            } else {
                str3 = null;
            }
            C6298g1 M02 = AbstractC3557B.M0(uVar.q0(ParameterNames.SESSION).y());
            I8.r q05 = uVar.q0("source");
            int i10 = 0;
            if (q05 != null && (T = q05.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length = h10.length;
                while (i10 < length) {
                    int i11 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6301h1.a(i11), T)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            C6304i1 G10 = N.G(uVar.q0("view").y());
            I8.r q06 = uVar.q0("usr");
            if (q06 != null) {
                c6313l1 = N.H(q06.y());
            } else {
                c6313l1 = null;
            }
            I8.r q07 = uVar.q0("connectivity");
            if (q07 != null) {
                o02 = R4.b.Y0(q07.y());
            } else {
                o02 = null;
            }
            I8.r q08 = uVar.q0("display");
            if (q08 != null) {
                v02 = N.C(q08.y());
            } else {
                v02 = null;
            }
            I8.r q09 = uVar.q0("synthetics");
            if (q09 != null) {
                c6310k1 = AbstractC3557B.O0(q09.y());
            } else {
                c6310k1 = null;
            }
            I8.r q010 = uVar.q0("ci_test");
            if (q010 != null) {
                l02 = R4.b.W0(q010.y());
            } else {
                l02 = null;
            }
            I8.r q011 = uVar.q0("os");
            if (q011 != null) {
                c6283b1 = AbstractC3557B.J0(q011.y());
            } else {
                c6283b1 = null;
            }
            I8.r q012 = uVar.q0("device");
            if (q012 != null) {
                u02 = R4.b.b1(q012.y());
            } else {
                u02 = null;
            }
            S0 a12 = R4.b.a1(uVar.q0("_dd").y());
            I8.r q013 = uVar.q0("context");
            if (q013 != null) {
                r02 = O(q013.y());
            } else {
                r02 = null;
            }
            I8.r q014 = uVar.q0("action");
            if (q014 != null) {
                i02 = K(q014.y());
            } else {
                i02 = null;
            }
            I8.r q015 = uVar.q0("container");
            if (q015 != null) {
                p02 = N(q015.y());
            } else {
                p02 = null;
            }
            return new C6319n1(I10, V02, str, str2, str3, M02, i10, G10, c6313l1, o02, v02, c6310k1, l02, c6283b1, u02, a12, r02, i02, p02, N.F(uVar.q0("resource").y()));
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ResourceEvent", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ResourceEvent", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ResourceEvent", e12);
        }
    }

    public static final C5953f R() {
        C5953f c5953f = f17402a;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Filled.Flag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p pVar = new Wh.p(0);
        pVar.p(14.4f, 6.0f);
        pVar.n(14.0f, 4.0f);
        pVar.l(5.0f);
        pVar.x(17.0f);
        pVar.m(2.0f);
        pVar.x(-7.0f);
        pVar.m(5.6f);
        pVar.o(0.4f, 2.0f);
        pVar.m(7.0f);
        pVar.w(6.0f);
        pVar.f();
        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f17402a = c10;
        return c10;
    }

    public static final int S(long j6, C c10) {
        if (C5251c.e(j6) <= 0.0f) {
            return 0;
        }
        if (C5251c.e(j6) >= c10.f12478b.f12528e) {
            return c10.f12477a.f12467a.f12512Y.length();
        }
        return c10.m(j6);
    }

    public static final Object T(L0.j jVar, L0.u uVar) {
        Object obj = jVar.f10409Y.get(uVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final C5953f U() {
        C5953f c5953f = f17404c;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p p10 = R.a.p(0, 12.0f, 6.0f);
        p10.h(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        p10.u(-0.9f, 2.0f, -2.0f, 2.0f);
        p10.u(-2.0f, -0.9f, -2.0f, -2.0f);
        p10.u(0.9f, -2.0f, 2.0f, -2.0f);
        p10.q(0.0f, 10.0f);
        p10.h(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        p10.n(6.0f, 18.0f);
        p10.h(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        p10.q(0.0f, -12.0f);
        p10.g(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        p10.u(1.79f, 4.0f, 4.0f, 4.0f);
        p10.u(4.0f, -1.79f, 4.0f, -4.0f);
        p10.u(-1.79f, -4.0f, -4.0f, -4.0f);
        p10.f();
        p10.p(12.0f, 14.0f);
        p10.h(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        p10.x(2.0f);
        p10.m(16.0f);
        p10.x(-2.0f);
        p10.h(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        p10.f();
        C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f17404c = c10;
        return c10;
    }

    public static final String V(int i10, Resources resources) {
        BufferedReader bufferedReader;
        InputStream openRawResource = resources.openRawResource(i10);
        AbstractC3557B.b0("openRawResource(resource)", openRawResource);
        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, Lg.a.f11131a);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            th = null;
            return P4.a.x0(bufferedReader);
        } finally {
        }
    }

    public static final C1046e W(z zVar) {
        C1046e c1046e = zVar.f16830a;
        c1046e.getClass();
        long j6 = zVar.f16831b;
        return c1046e.subSequence(D.e(j6), D.d(j6));
    }

    public static final long X(C c10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        float f6;
        int g10 = c10.g(i10);
        N0.i iVar = c10.f12478b;
        if (g10 >= iVar.f12529f) {
            return C5251c.f43621d;
        }
        if ((z10 && !z11) || (!z10 && z11)) {
            i11 = i10;
        } else {
            i11 = Math.max(i10 - 1, 0);
        }
        if (c10.a(i11) == c10.n(i10)) {
            z12 = true;
        } else {
            z12 = false;
        }
        iVar.d(i10);
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 == length) {
            i12 = AbstractC4344b.u0(arrayList);
        } else {
            i12 = H.H(i10, arrayList);
        }
        N0.m mVar = (N0.m) arrayList.get(i12);
        N0.l lVar = mVar.f12539a;
        int a5 = mVar.a(i10);
        O0.s sVar = ((C1042a) lVar).f12495d;
        if (z12) {
            f6 = sVar.g(a5, false);
        } else {
            f6 = sVar.h(a5, false);
        }
        return R4.b.r(f6, c10.e(g10));
    }

    public static final C1046e Y(z zVar, int i10) {
        C1046e c1046e = zVar.f16830a;
        long j6 = zVar.f16831b;
        return c1046e.subSequence(D.d(j6), Math.min(D.d(j6) + i10, zVar.f16830a.f12512Y.length()));
    }

    public static final C1046e Z(z zVar, int i10) {
        C1046e c1046e = zVar.f16830a;
        long j6 = zVar.f16831b;
        return c1046e.subSequence(Math.max(0, D.e(j6) - i10), D.e(j6));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, AbstractC4326r abstractC4326r, wf.k kVar, AbstractC4313e abstractC4313e, String str, wf.k kVar2, wf.p pVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        C6466d c6466d;
        int i14;
        AbstractC4313e abstractC4313e2;
        int i15;
        String str2;
        int i16;
        wf.k kVar3;
        wf.k kVar4;
        String str3;
        AbstractC4313e abstractC4313e3;
        wf.k kVar5;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        AbstractC4326r abstractC4326r3;
        wf.k kVar6;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(2132720749);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(obj)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                c6466d = kVar;
                if (rVar.i(c6466d)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i12 |= i21;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    abstractC4313e2 = abstractC4313e;
                    if (rVar.g(abstractC4313e2)) {
                        i20 = 2048;
                    } else {
                        i20 = 1024;
                    }
                    i12 |= i20;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (rVar.g(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i12 |= i19;
                        i16 = i11 & 32;
                        if (i16 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 458752) == 0) {
                            kVar3 = kVar2;
                            if (rVar.i(kVar3)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                            if ((i11 & 64) == 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 3670016) == 0) {
                                if (rVar.i(pVar)) {
                                    i17 = 1048576;
                                } else {
                                    i17 = 524288;
                                }
                                i12 |= i17;
                            }
                            if ((i12 & 2995931) != 599186 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = abstractC4326r;
                                kVar5 = c6466d;
                                abstractC4313e3 = abstractC4313e2;
                                str3 = str2;
                                kVar4 = kVar3;
                            } else {
                                if (i24 == 0) {
                                    abstractC4326r3 = C4323o.f37719b;
                                } else {
                                    abstractC4326r3 = abstractC4326r;
                                }
                                if (i13 != 0) {
                                    c6466d = C6466d.f50195Y;
                                }
                                if (i14 == 0) {
                                    abstractC4313e3 = C4310b.f37693Y;
                                } else {
                                    abstractC4313e3 = abstractC4313e2;
                                }
                                if (i15 == 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str2;
                                }
                                if (i16 == 0) {
                                    kVar6 = C6467e.f50198Y;
                                } else {
                                    kVar6 = kVar3;
                                }
                                int i25 = i12 >> 3;
                                b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i25) | (i25 & 458752), 0);
                                abstractC4326r2 = abstractC4326r3;
                                kVar5 = c6466d;
                                kVar4 = kVar6;
                            }
                            v10 = rVar.v();
                            if (v10 == null) {
                                v10.f22739d = new C6468f(obj, abstractC4326r2, kVar5, abstractC4313e3, str3, kVar4, pVar, i10, i11);
                                return;
                            }
                            return;
                        }
                        kVar3 = kVar2;
                        if ((i11 & 64) == 0) {
                        }
                        if ((i12 & 2995931) != 599186) {
                        }
                        if (i24 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        int i252 = i12 >> 3;
                        b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i252) | (i252 & 458752), 0);
                        abstractC4326r2 = abstractC4326r3;
                        kVar5 = c6466d;
                        kVar4 = kVar6;
                        v10 = rVar.v();
                        if (v10 == null) {
                        }
                    }
                    str2 = str;
                    i16 = i11 & 32;
                    if (i16 != 0) {
                    }
                    kVar3 = kVar2;
                    if ((i11 & 64) == 0) {
                    }
                    if ((i12 & 2995931) != 599186) {
                    }
                    if (i24 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    int i2522 = i12 >> 3;
                    b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i2522) | (i2522 & 458752), 0);
                    abstractC4326r2 = abstractC4326r3;
                    kVar5 = c6466d;
                    kVar4 = kVar6;
                    v10 = rVar.v();
                    if (v10 == null) {
                    }
                }
                abstractC4313e2 = abstractC4313e;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                str2 = str;
                i16 = i11 & 32;
                if (i16 != 0) {
                }
                kVar3 = kVar2;
                if ((i11 & 64) == 0) {
                }
                if ((i12 & 2995931) != 599186) {
                }
                if (i24 == 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                int i25222 = i12 >> 3;
                b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i25222) | (i25222 & 458752), 0);
                abstractC4326r2 = abstractC4326r3;
                kVar5 = c6466d;
                kVar4 = kVar6;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            c6466d = kVar;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            abstractC4313e2 = abstractC4313e;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            str2 = str;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            kVar3 = kVar2;
            if ((i11 & 64) == 0) {
            }
            if ((i12 & 2995931) != 599186) {
            }
            if (i24 == 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            int i252222 = i12 >> 3;
            b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i252222) | (i252222 & 458752), 0);
            abstractC4326r2 = abstractC4326r3;
            kVar5 = c6466d;
            kVar4 = kVar6;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c6466d = kVar;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        abstractC4313e2 = abstractC4313e;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        str2 = str;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        kVar3 = kVar2;
        if ((i11 & 64) == 0) {
        }
        if ((i12 & 2995931) != 599186) {
        }
        if (i24 == 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        int i2522222 = i12 >> 3;
        b(AbstractC6696f.x(obj, str3, rVar, (i12 & 8) | (i12 & 14) | ((i12 >> 9) & 112), 0), abstractC4326r3, c6466d, abstractC4313e3, kVar6, pVar, rVar, (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i2522222) | (i2522222 & 458752), 0);
        abstractC4326r2 = abstractC4326r3;
        kVar5 = c6466d;
        kVar4 = kVar6;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void a0(AbstractC1725n abstractC1725n, wf.n nVar) {
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>", nVar);
        Ad.l.M(2, nVar);
        nVar.invoke(abstractC1725n, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0298, code lost:
        if (r1 == r0) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0238 A[LOOP:1: B:131:0x0236->B:132:0x0238, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C6729v0 c6729v0, AbstractC4326r abstractC4326r, wf.k kVar, AbstractC4313e abstractC4313e, wf.k kVar2, wf.p pVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        Object obj2;
        int i14;
        C4318j c4318j;
        int i15;
        C6470h c6470h;
        wf.k kVar3;
        AbstractC4313e abstractC4313e2;
        wf.k kVar4;
        AbstractC4326r abstractC4326r2;
        Z0.l lVar;
        boolean g10;
        Object K10;
        boolean g11;
        Object K11;
        j0.u uVar;
        boolean g12;
        Object K12;
        Map map;
        Object b10;
        C1724m0 c1724m0;
        int size;
        int i16;
        boolean g13;
        Object obj3;
        boolean g14;
        Object K13;
        AbstractC1710f0 abstractC1710f0;
        C6729v0 c6729v02;
        boolean z10;
        Object K14;
        ListIterator listIterator;
        int i17;
        C3878C c3878c;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-114689412);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c6729v0)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 1;
        if (i25 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = abstractC4326r;
            if (rVar.g(obj)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
            i13 = i11 & 2;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                obj2 = kVar;
                if (rVar.i(obj2)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i12 |= i22;
                i14 = i11 & 4;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    c4318j = abstractC4313e;
                    if (rVar.g(c4318j)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i12 |= i21;
                    i15 = i11 & 8;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        c6470h = kVar2;
                        if (rVar.i(c6470h)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i12 |= i20;
                        if ((i11 & 16) != 0) {
                            i12 |= 196608;
                        } else if ((458752 & i10) == 0) {
                            if (rVar.i(pVar)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                            if ((i12 & 374491) != 74898 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = obj;
                                kVar4 = obj2;
                                abstractC4313e2 = c4318j;
                                kVar3 = c6470h;
                            } else {
                                AbstractC4326r abstractC4326r3 = C4323o.f37719b;
                                if (i25 != 0) {
                                    obj = abstractC4326r3;
                                }
                                if (i13 != 0) {
                                    obj2 = C6469g.f50214Y;
                                }
                                if (i14 != 0) {
                                    c4318j = C4310b.f37693Y;
                                }
                                if (i15 != 0) {
                                    c6470h = C6470h.f50218Y;
                                }
                                lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                                rVar.W(1157296644);
                                g10 = rVar.g(c6729v0);
                                K10 = rVar.K();
                                Object obj4 = C1723m.f22654Y;
                                if (!g10 || K10 == obj4) {
                                    K10 = new C6460A(c6729v0, c4318j, lVar);
                                    rVar.h0(K10);
                                }
                                rVar.t(false);
                                C6460A c6460a = (C6460A) K10;
                                rVar.W(1157296644);
                                g11 = rVar.g(c6729v0);
                                K11 = rVar.K();
                                if (!g11 || K11 == obj4) {
                                    Object[] objArr = {c6729v0.b()};
                                    j0.u uVar2 = new j0.u();
                                    uVar2.addAll(kf.q.z3(objArr));
                                    rVar.h0(uVar2);
                                    K11 = uVar2;
                                }
                                rVar.t(false);
                                uVar = (j0.u) K11;
                                rVar.W(1157296644);
                                g12 = rVar.g(c6729v0);
                                K12 = rVar.K();
                                if (!g12 || K12 == obj4) {
                                    K12 = new LinkedHashMap();
                                    rVar.h0(K12);
                                }
                                rVar.t(false);
                                map = (Map) K12;
                                if (!uVar.contains(c6729v0.b())) {
                                    uVar.clear();
                                    uVar.add(c6729v0.b());
                                }
                                b10 = c6729v0.b();
                                c1724m0 = c6729v0.f51386c;
                                if (AbstractC3557B.K(b10, c1724m0.getValue())) {
                                    if (uVar.size() != 1 || !AbstractC3557B.K(uVar.get(0), c6729v0.b())) {
                                        uVar.clear();
                                        uVar.add(c6729v0.b());
                                    }
                                    if (map.size() != 1 || map.containsKey(c6729v0.b())) {
                                        map.clear();
                                    }
                                    c6460a.f50079b = c4318j;
                                    c6460a.f50080c = lVar;
                                }
                                if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue()) && !uVar.contains(c1724m0.getValue())) {
                                    listIterator = uVar.listIterator();
                                    i17 = 0;
                                    while (true) {
                                        c3878c = (C3878C) listIterator;
                                        ListIterator listIterator2 = listIterator;
                                        if (!c3878c.hasNext()) {
                                            if (AbstractC3557B.K(c6470h.invoke(c3878c.next()), c6470h.invoke(c1724m0.getValue()))) {
                                                i18 = -1;
                                                break;
                                            } else {
                                                i17++;
                                                listIterator = listIterator2;
                                            }
                                        } else {
                                            i18 = -1;
                                            i17 = -1;
                                            break;
                                        }
                                    }
                                    if (i17 != i18) {
                                        uVar.add(c1724m0.getValue());
                                    } else {
                                        uVar.set(i17, c1724m0.getValue());
                                    }
                                }
                                if (map.containsKey(c1724m0.getValue()) || !map.containsKey(c6729v0.b())) {
                                    map.clear();
                                    size = uVar.size();
                                    i16 = 0;
                                    while (i16 < size) {
                                        Object obj5 = uVar.get(i16);
                                        C6460A c6460a2 = c6460a;
                                        map.put(obj5, R4.b.X(rVar, 885640742, new C6476n(c6729v0, obj5, obj2, c6460a2, uVar, pVar, 0)));
                                        i16++;
                                        c6460a = c6460a2;
                                        obj2 = obj2;
                                        obj = obj;
                                        obj4 = obj4;
                                        c4318j = c4318j;
                                    }
                                }
                                C6460A c6460a3 = c6460a;
                                AbstractC4326r abstractC4326r4 = obj;
                                Object obj6 = obj4;
                                wf.k kVar5 = obj2;
                                AbstractC4313e abstractC4313e3 = c4318j;
                                Object c10 = c6729v0.c();
                                rVar.W(511388516);
                                g13 = rVar.g(c10) | rVar.g(c6460a3);
                                Object K15 = rVar.K();
                                if (g13) {
                                    obj3 = obj6;
                                } else {
                                    obj3 = obj6;
                                }
                                K15 = (O) kVar5.invoke(c6460a3);
                                rVar.h0(K15);
                                rVar.t(false);
                                O o10 = (O) K15;
                                c6460a3.getClass();
                                rVar.W(93755870);
                                rVar.W(1157296644);
                                g14 = rVar.g(c6460a3);
                                K13 = rVar.K();
                                if (!g14 || K13 == obj3) {
                                    K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                                    rVar.h0(K13);
                                }
                                rVar.t(false);
                                abstractC1710f0 = (AbstractC1710f0) K13;
                                AbstractC1710f0 g02 = AbstractC4828h.g0(o10.f50137d, rVar);
                                c6729v02 = c6460a3.f50078a;
                                if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
                                    abstractC1710f0.setValue(Boolean.FALSE);
                                } else if (g02.getValue() != null) {
                                    abstractC1710f0.setValue(Boolean.TRUE);
                                }
                                if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                                    C6715o0 m10 = AbstractC6696f.m(c6729v02, AbstractC6652A0.f51123h, null, rVar, 2);
                                    rVar.W(1157296644);
                                    boolean g15 = rVar.g(m10);
                                    Object K16 = rVar.K();
                                    if (g15 || K16 == obj3) {
                                        p0 p0Var = (p0) g02.getValue();
                                        if (p0Var == null || p0Var.f50271a) {
                                            abstractC4326r3 = androidx.compose.ui.draw.a.c(abstractC4326r3);
                                        }
                                        K16 = abstractC4326r3.g(new C6486y(c6460a3, m10, g02));
                                        rVar.h0(K16);
                                    }
                                    z10 = false;
                                    rVar.t(false);
                                    abstractC4326r3 = (AbstractC4326r) K16;
                                } else {
                                    z10 = false;
                                    c6460a3.f50083f = null;
                                }
                                rVar.t(z10);
                                AbstractC4326r g16 = abstractC4326r4.g(abstractC4326r3);
                                rVar.W(-492369756);
                                K14 = rVar.K();
                                if (K14 == obj3) {
                                    K14 = new y.r(c6460a3);
                                    rVar.h0(K14);
                                }
                                rVar.t(false);
                                y.r rVar2 = (y.r) K14;
                                rVar.W(-1323940314);
                                int i26 = rVar.P;
                                AbstractC1732q0 p10 = rVar.p();
                                AbstractC0584m.f5811i.getClass();
                                AbstractC6216a abstractC6216a = C0583l.f5804b;
                                C3288a i27 = androidx.compose.ui.layout.a.i(g16);
                                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                                    rVar.Z();
                                    if (rVar.f22695O) {
                                        rVar.o(abstractC6216a);
                                    } else {
                                        rVar.k0();
                                    }
                                    n0(rVar, rVar2, C0583l.f5808f);
                                    n0(rVar, p10, C0583l.f5807e);
                                    C0581j c0581j = C0583l.f5809g;
                                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i26))) {
                                        AbstractC6463a.q(i26, rVar, i26, c0581j);
                                    }
                                    AbstractC6463a.r(0, i27, new Z.L0(rVar), rVar, 2058660585);
                                    rVar.W(-441506448);
                                    int size2 = uVar.size();
                                    for (int i28 = 0; i28 < size2; i28++) {
                                        Object obj7 = uVar.get(i28);
                                        rVar.T(-1739558576, c6470h.invoke(obj7));
                                        wf.n nVar = (wf.n) map.get(obj7);
                                        if (nVar != null) {
                                            nVar.invoke(rVar, 0);
                                        }
                                        rVar.t(false);
                                    }
                                    AbstractC6463a.v(rVar, false, false, true, false);
                                    abstractC4326r2 = abstractC4326r4;
                                    kVar4 = kVar5;
                                    kVar3 = c6470h;
                                    abstractC4313e2 = abstractC4313e3;
                                } else {
                                    R4.b.r1();
                                    throw null;
                                }
                            }
                            C1741v0 v10 = rVar.v();
                            if (v10 != null) {
                                v10.f22739d = new C6477o(c6729v0, abstractC4326r2, kVar4, abstractC4313e2, kVar3, pVar, i10, i11);
                                return;
                            }
                            return;
                        }
                        if ((i12 & 374491) != 74898) {
                        }
                        AbstractC4326r abstractC4326r32 = C4323o.f37719b;
                        if (i25 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                        rVar.W(1157296644);
                        g10 = rVar.g(c6729v0);
                        K10 = rVar.K();
                        Object obj42 = C1723m.f22654Y;
                        if (!g10) {
                        }
                        K10 = new C6460A(c6729v0, c4318j, lVar);
                        rVar.h0(K10);
                        rVar.t(false);
                        C6460A c6460a4 = (C6460A) K10;
                        rVar.W(1157296644);
                        g11 = rVar.g(c6729v0);
                        K11 = rVar.K();
                        if (!g11) {
                        }
                        Object[] objArr2 = {c6729v0.b()};
                        j0.u uVar22 = new j0.u();
                        uVar22.addAll(kf.q.z3(objArr2));
                        rVar.h0(uVar22);
                        K11 = uVar22;
                        rVar.t(false);
                        uVar = (j0.u) K11;
                        rVar.W(1157296644);
                        g12 = rVar.g(c6729v0);
                        K12 = rVar.K();
                        if (!g12) {
                        }
                        K12 = new LinkedHashMap();
                        rVar.h0(K12);
                        rVar.t(false);
                        map = (Map) K12;
                        if (!uVar.contains(c6729v0.b())) {
                        }
                        b10 = c6729v0.b();
                        c1724m0 = c6729v0.f51386c;
                        if (AbstractC3557B.K(b10, c1724m0.getValue())) {
                        }
                        if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue())) {
                            listIterator = uVar.listIterator();
                            i17 = 0;
                            while (true) {
                                c3878c = (C3878C) listIterator;
                                ListIterator listIterator22 = listIterator;
                                if (!c3878c.hasNext()) {
                                }
                                i17++;
                                listIterator = listIterator22;
                            }
                            if (i17 != i18) {
                            }
                        }
                        if (map.containsKey(c1724m0.getValue())) {
                        }
                        map.clear();
                        size = uVar.size();
                        i16 = 0;
                        while (i16 < size) {
                        }
                        C6460A c6460a32 = c6460a4;
                        AbstractC4326r abstractC4326r42 = obj;
                        Object obj62 = obj42;
                        wf.k kVar52 = obj2;
                        AbstractC4313e abstractC4313e32 = c4318j;
                        Object c102 = c6729v0.c();
                        rVar.W(511388516);
                        g13 = rVar.g(c102) | rVar.g(c6460a32);
                        Object K152 = rVar.K();
                        if (g13) {
                        }
                        K152 = (O) kVar52.invoke(c6460a32);
                        rVar.h0(K152);
                        rVar.t(false);
                        O o102 = (O) K152;
                        c6460a32.getClass();
                        rVar.W(93755870);
                        rVar.W(1157296644);
                        g14 = rVar.g(c6460a32);
                        K13 = rVar.K();
                        if (!g14) {
                        }
                        K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                        rVar.h0(K13);
                        rVar.t(false);
                        abstractC1710f0 = (AbstractC1710f0) K13;
                        AbstractC1710f0 g022 = AbstractC4828h.g0(o102.f50137d, rVar);
                        c6729v02 = c6460a32.f50078a;
                        if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
                        }
                        if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        }
                        rVar.t(z10);
                        AbstractC4326r g162 = abstractC4326r42.g(abstractC4326r32);
                        rVar.W(-492369756);
                        K14 = rVar.K();
                        if (K14 == obj3) {
                        }
                        rVar.t(false);
                        y.r rVar22 = (y.r) K14;
                        rVar.W(-1323940314);
                        int i262 = rVar.P;
                        AbstractC1732q0 p102 = rVar.p();
                        AbstractC0584m.f5811i.getClass();
                        AbstractC6216a abstractC6216a2 = C0583l.f5804b;
                        C3288a i272 = androidx.compose.ui.layout.a.i(g162);
                        if (!(rVar.f22696a instanceof AbstractC1707e)) {
                        }
                    }
                    c6470h = kVar2;
                    if ((i11 & 16) != 0) {
                    }
                    if ((i12 & 374491) != 74898) {
                    }
                    AbstractC4326r abstractC4326r322 = C4323o.f37719b;
                    if (i25 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                    rVar.W(1157296644);
                    g10 = rVar.g(c6729v0);
                    K10 = rVar.K();
                    Object obj422 = C1723m.f22654Y;
                    if (!g10) {
                    }
                    K10 = new C6460A(c6729v0, c4318j, lVar);
                    rVar.h0(K10);
                    rVar.t(false);
                    C6460A c6460a42 = (C6460A) K10;
                    rVar.W(1157296644);
                    g11 = rVar.g(c6729v0);
                    K11 = rVar.K();
                    if (!g11) {
                    }
                    Object[] objArr22 = {c6729v0.b()};
                    j0.u uVar222 = new j0.u();
                    uVar222.addAll(kf.q.z3(objArr22));
                    rVar.h0(uVar222);
                    K11 = uVar222;
                    rVar.t(false);
                    uVar = (j0.u) K11;
                    rVar.W(1157296644);
                    g12 = rVar.g(c6729v0);
                    K12 = rVar.K();
                    if (!g12) {
                    }
                    K12 = new LinkedHashMap();
                    rVar.h0(K12);
                    rVar.t(false);
                    map = (Map) K12;
                    if (!uVar.contains(c6729v0.b())) {
                    }
                    b10 = c6729v0.b();
                    c1724m0 = c6729v0.f51386c;
                    if (AbstractC3557B.K(b10, c1724m0.getValue())) {
                    }
                    if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue())) {
                    }
                    if (map.containsKey(c1724m0.getValue())) {
                    }
                    map.clear();
                    size = uVar.size();
                    i16 = 0;
                    while (i16 < size) {
                    }
                    C6460A c6460a322 = c6460a42;
                    AbstractC4326r abstractC4326r422 = obj;
                    Object obj622 = obj422;
                    wf.k kVar522 = obj2;
                    AbstractC4313e abstractC4313e322 = c4318j;
                    Object c1022 = c6729v0.c();
                    rVar.W(511388516);
                    g13 = rVar.g(c1022) | rVar.g(c6460a322);
                    Object K1522 = rVar.K();
                    if (g13) {
                    }
                    K1522 = (O) kVar522.invoke(c6460a322);
                    rVar.h0(K1522);
                    rVar.t(false);
                    O o1022 = (O) K1522;
                    c6460a322.getClass();
                    rVar.W(93755870);
                    rVar.W(1157296644);
                    g14 = rVar.g(c6460a322);
                    K13 = rVar.K();
                    if (!g14) {
                    }
                    K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                    rVar.h0(K13);
                    rVar.t(false);
                    abstractC1710f0 = (AbstractC1710f0) K13;
                    AbstractC1710f0 g0222 = AbstractC4828h.g0(o1022.f50137d, rVar);
                    c6729v02 = c6460a322.f50078a;
                    if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
                    }
                    if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                    }
                    rVar.t(z10);
                    AbstractC4326r g1622 = abstractC4326r422.g(abstractC4326r322);
                    rVar.W(-492369756);
                    K14 = rVar.K();
                    if (K14 == obj3) {
                    }
                    rVar.t(false);
                    y.r rVar222 = (y.r) K14;
                    rVar.W(-1323940314);
                    int i2622 = rVar.P;
                    AbstractC1732q0 p1022 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    AbstractC6216a abstractC6216a22 = C0583l.f5804b;
                    C3288a i2722 = androidx.compose.ui.layout.a.i(g1622);
                    if (!(rVar.f22696a instanceof AbstractC1707e)) {
                    }
                }
                c4318j = abstractC4313e;
                i15 = i11 & 8;
                if (i15 == 0) {
                }
                c6470h = kVar2;
                if ((i11 & 16) != 0) {
                }
                if ((i12 & 374491) != 74898) {
                }
                AbstractC4326r abstractC4326r3222 = C4323o.f37719b;
                if (i25 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                rVar.W(1157296644);
                g10 = rVar.g(c6729v0);
                K10 = rVar.K();
                Object obj4222 = C1723m.f22654Y;
                if (!g10) {
                }
                K10 = new C6460A(c6729v0, c4318j, lVar);
                rVar.h0(K10);
                rVar.t(false);
                C6460A c6460a422 = (C6460A) K10;
                rVar.W(1157296644);
                g11 = rVar.g(c6729v0);
                K11 = rVar.K();
                if (!g11) {
                }
                Object[] objArr222 = {c6729v0.b()};
                j0.u uVar2222 = new j0.u();
                uVar2222.addAll(kf.q.z3(objArr222));
                rVar.h0(uVar2222);
                K11 = uVar2222;
                rVar.t(false);
                uVar = (j0.u) K11;
                rVar.W(1157296644);
                g12 = rVar.g(c6729v0);
                K12 = rVar.K();
                if (!g12) {
                }
                K12 = new LinkedHashMap();
                rVar.h0(K12);
                rVar.t(false);
                map = (Map) K12;
                if (!uVar.contains(c6729v0.b())) {
                }
                b10 = c6729v0.b();
                c1724m0 = c6729v0.f51386c;
                if (AbstractC3557B.K(b10, c1724m0.getValue())) {
                }
                if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue())) {
                }
                if (map.containsKey(c1724m0.getValue())) {
                }
                map.clear();
                size = uVar.size();
                i16 = 0;
                while (i16 < size) {
                }
                C6460A c6460a3222 = c6460a422;
                AbstractC4326r abstractC4326r4222 = obj;
                Object obj6222 = obj4222;
                wf.k kVar5222 = obj2;
                AbstractC4313e abstractC4313e3222 = c4318j;
                Object c10222 = c6729v0.c();
                rVar.W(511388516);
                g13 = rVar.g(c10222) | rVar.g(c6460a3222);
                Object K15222 = rVar.K();
                if (g13) {
                }
                K15222 = (O) kVar5222.invoke(c6460a3222);
                rVar.h0(K15222);
                rVar.t(false);
                O o10222 = (O) K15222;
                c6460a3222.getClass();
                rVar.W(93755870);
                rVar.W(1157296644);
                g14 = rVar.g(c6460a3222);
                K13 = rVar.K();
                if (!g14) {
                }
                K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                rVar.h0(K13);
                rVar.t(false);
                abstractC1710f0 = (AbstractC1710f0) K13;
                AbstractC1710f0 g02222 = AbstractC4828h.g0(o10222.f50137d, rVar);
                c6729v02 = c6460a3222.f50078a;
                if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
                }
                if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                }
                rVar.t(z10);
                AbstractC4326r g16222 = abstractC4326r4222.g(abstractC4326r3222);
                rVar.W(-492369756);
                K14 = rVar.K();
                if (K14 == obj3) {
                }
                rVar.t(false);
                y.r rVar2222 = (y.r) K14;
                rVar.W(-1323940314);
                int i26222 = rVar.P;
                AbstractC1732q0 p10222 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                AbstractC6216a abstractC6216a222 = C0583l.f5804b;
                C3288a i27222 = androidx.compose.ui.layout.a.i(g16222);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                }
            }
            obj2 = kVar;
            i14 = i11 & 4;
            if (i14 != 0) {
            }
            c4318j = abstractC4313e;
            i15 = i11 & 8;
            if (i15 == 0) {
            }
            c6470h = kVar2;
            if ((i11 & 16) != 0) {
            }
            if ((i12 & 374491) != 74898) {
            }
            AbstractC4326r abstractC4326r32222 = C4323o.f37719b;
            if (i25 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
            rVar.W(1157296644);
            g10 = rVar.g(c6729v0);
            K10 = rVar.K();
            Object obj42222 = C1723m.f22654Y;
            if (!g10) {
            }
            K10 = new C6460A(c6729v0, c4318j, lVar);
            rVar.h0(K10);
            rVar.t(false);
            C6460A c6460a4222 = (C6460A) K10;
            rVar.W(1157296644);
            g11 = rVar.g(c6729v0);
            K11 = rVar.K();
            if (!g11) {
            }
            Object[] objArr2222 = {c6729v0.b()};
            j0.u uVar22222 = new j0.u();
            uVar22222.addAll(kf.q.z3(objArr2222));
            rVar.h0(uVar22222);
            K11 = uVar22222;
            rVar.t(false);
            uVar = (j0.u) K11;
            rVar.W(1157296644);
            g12 = rVar.g(c6729v0);
            K12 = rVar.K();
            if (!g12) {
            }
            K12 = new LinkedHashMap();
            rVar.h0(K12);
            rVar.t(false);
            map = (Map) K12;
            if (!uVar.contains(c6729v0.b())) {
            }
            b10 = c6729v0.b();
            c1724m0 = c6729v0.f51386c;
            if (AbstractC3557B.K(b10, c1724m0.getValue())) {
            }
            if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue())) {
            }
            if (map.containsKey(c1724m0.getValue())) {
            }
            map.clear();
            size = uVar.size();
            i16 = 0;
            while (i16 < size) {
            }
            C6460A c6460a32222 = c6460a4222;
            AbstractC4326r abstractC4326r42222 = obj;
            Object obj62222 = obj42222;
            wf.k kVar52222 = obj2;
            AbstractC4313e abstractC4313e32222 = c4318j;
            Object c102222 = c6729v0.c();
            rVar.W(511388516);
            g13 = rVar.g(c102222) | rVar.g(c6460a32222);
            Object K152222 = rVar.K();
            if (g13) {
            }
            K152222 = (O) kVar52222.invoke(c6460a32222);
            rVar.h0(K152222);
            rVar.t(false);
            O o102222 = (O) K152222;
            c6460a32222.getClass();
            rVar.W(93755870);
            rVar.W(1157296644);
            g14 = rVar.g(c6460a32222);
            K13 = rVar.K();
            if (!g14) {
            }
            K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar.h0(K13);
            rVar.t(false);
            abstractC1710f0 = (AbstractC1710f0) K13;
            AbstractC1710f0 g022222 = AbstractC4828h.g0(o102222.f50137d, rVar);
            c6729v02 = c6460a32222.f50078a;
            if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
            }
            if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
            }
            rVar.t(z10);
            AbstractC4326r g162222 = abstractC4326r42222.g(abstractC4326r32222);
            rVar.W(-492369756);
            K14 = rVar.K();
            if (K14 == obj3) {
            }
            rVar.t(false);
            y.r rVar22222 = (y.r) K14;
            rVar.W(-1323940314);
            int i262222 = rVar.P;
            AbstractC1732q0 p102222 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            AbstractC6216a abstractC6216a2222 = C0583l.f5804b;
            C3288a i272222 = androidx.compose.ui.layout.a.i(g162222);
            if (!(rVar.f22696a instanceof AbstractC1707e)) {
            }
        }
        obj = abstractC4326r;
        i13 = i11 & 2;
        if (i13 == 0) {
        }
        obj2 = kVar;
        i14 = i11 & 4;
        if (i14 != 0) {
        }
        c4318j = abstractC4313e;
        i15 = i11 & 8;
        if (i15 == 0) {
        }
        c6470h = kVar2;
        if ((i11 & 16) != 0) {
        }
        if ((i12 & 374491) != 74898) {
        }
        AbstractC4326r abstractC4326r322222 = C4323o.f37719b;
        if (i25 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        rVar.W(1157296644);
        g10 = rVar.g(c6729v0);
        K10 = rVar.K();
        Object obj422222 = C1723m.f22654Y;
        if (!g10) {
        }
        K10 = new C6460A(c6729v0, c4318j, lVar);
        rVar.h0(K10);
        rVar.t(false);
        C6460A c6460a42222 = (C6460A) K10;
        rVar.W(1157296644);
        g11 = rVar.g(c6729v0);
        K11 = rVar.K();
        if (!g11) {
        }
        Object[] objArr22222 = {c6729v0.b()};
        j0.u uVar222222 = new j0.u();
        uVar222222.addAll(kf.q.z3(objArr22222));
        rVar.h0(uVar222222);
        K11 = uVar222222;
        rVar.t(false);
        uVar = (j0.u) K11;
        rVar.W(1157296644);
        g12 = rVar.g(c6729v0);
        K12 = rVar.K();
        if (!g12) {
        }
        K12 = new LinkedHashMap();
        rVar.h0(K12);
        rVar.t(false);
        map = (Map) K12;
        if (!uVar.contains(c6729v0.b())) {
        }
        b10 = c6729v0.b();
        c1724m0 = c6729v0.f51386c;
        if (AbstractC3557B.K(b10, c1724m0.getValue())) {
        }
        if (!AbstractC3557B.K(c6729v0.b(), c1724m0.getValue())) {
        }
        if (map.containsKey(c1724m0.getValue())) {
        }
        map.clear();
        size = uVar.size();
        i16 = 0;
        while (i16 < size) {
        }
        C6460A c6460a322222 = c6460a42222;
        AbstractC4326r abstractC4326r422222 = obj;
        Object obj622222 = obj422222;
        wf.k kVar522222 = obj2;
        AbstractC4313e abstractC4313e322222 = c4318j;
        Object c1022222 = c6729v0.c();
        rVar.W(511388516);
        g13 = rVar.g(c1022222) | rVar.g(c6460a322222);
        Object K1522222 = rVar.K();
        if (g13) {
        }
        K1522222 = (O) kVar522222.invoke(c6460a322222);
        rVar.h0(K1522222);
        rVar.t(false);
        O o1022222 = (O) K1522222;
        c6460a322222.getClass();
        rVar.W(93755870);
        rVar.W(1157296644);
        g14 = rVar.g(c6460a322222);
        K13 = rVar.K();
        if (!g14) {
        }
        K13 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
        rVar.h0(K13);
        rVar.t(false);
        abstractC1710f0 = (AbstractC1710f0) K13;
        AbstractC1710f0 g0222222 = AbstractC4828h.g0(o1022222.f50137d, rVar);
        c6729v02 = c6460a322222.f50078a;
        if (!AbstractC3557B.K(c6729v02.b(), c6729v02.f51386c.getValue())) {
        }
        if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
        }
        rVar.t(z10);
        AbstractC4326r g1622222 = abstractC4326r422222.g(abstractC4326r322222);
        rVar.W(-492369756);
        K14 = rVar.K();
        if (K14 == obj3) {
        }
        rVar.t(false);
        y.r rVar222222 = (y.r) K14;
        rVar.W(-1323940314);
        int i2622222 = rVar.P;
        AbstractC1732q0 p1022222 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        AbstractC6216a abstractC6216a22222 = C0583l.f5804b;
        C3288a i2722222 = androidx.compose.ui.layout.a.i(g1622222);
        if (!(rVar.f22696a instanceof AbstractC1707e)) {
        }
    }

    public static boolean b0(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        int i11 = rect.top;
                        int i12 = rect2.top;
                        if ((i11 >= i12 && rect.bottom > i12) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 >= i14 && rect.right > i14) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && rect.top < i16) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if ((i17 <= i18 && rect.left < i18) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(AbstractC4326r abstractC4326r, float f6, long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        float f10;
        long j10;
        float f11;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        boolean z11;
        Object K10;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(75144485);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            f10 = f6;
            if (rVar.d(f6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) != 0) {
                j10 = j6;
                if ((i11 & 4) == 0 && rVar.f(j10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            } else {
                j10 = j6;
            }
            if ((i12 & 147) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                f11 = f10;
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    abstractC4326r3 = abstractC4326r2;
                    f11 = f10;
                } else {
                    if (i16 == 0) {
                        abstractC4326r3 = C4323o.f37719b;
                    } else {
                        abstractC4326r3 = abstractC4326r2;
                    }
                    if (i17 == 0) {
                        f11 = AbstractC1528b1.f19926a;
                    } else {
                        f11 = f10;
                    }
                    if ((i11 & 4) != 0) {
                        float f12 = AbstractC1528b1.f19926a;
                        rVar.W(77461041);
                        float f13 = AbstractC1675i.f21571a;
                        long e10 = W.R0.e(25, rVar);
                        rVar.t(false);
                        i12 &= -897;
                        j10 = e10;
                    }
                }
                rVar.u();
                AbstractC4326r e11 = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.d(abstractC4326r3, 1.0f), f11);
                rVar.W(941664184);
                boolean z12 = true;
                if ((i12 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((((i12 & 896) ^ 384) > 256 || !rVar.f(j10)) && (i12 & 384) != 256) {
                    z12 = false;
                }
                z11 = z10 | z12;
                K10 = rVar.K();
                if (!z11 || K10 == C1723m.f22654Y) {
                    K10 = new C1533c1(f11, j10, 0);
                    rVar.h0(K10);
                }
                rVar.t(false);
                androidx.compose.foundation.a.a(e11, (wf.k) K10, rVar, 0);
            }
            long j11 = j10;
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C1538d1(abstractC4326r3, f11, j11, i10, i11, 0);
                return;
            }
            return;
        }
        f10 = f6;
        if ((i10 & 384) != 0) {
        }
        if ((i12 & 147) != 146) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        rVar.u();
        AbstractC4326r e112 = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.d(abstractC4326r3, 1.0f), f11);
        rVar.W(941664184);
        boolean z122 = true;
        if ((i12 & 112) != 32) {
        }
        if (((i12 & 896) ^ 384) > 256) {
        }
        z122 = false;
        z11 = z10 | z122;
        K10 = rVar.K();
        if (!z11) {
        }
        K10 = new C1533c1(f11, j10, 0);
        rVar.h0(K10);
        rVar.t(false);
        androidx.compose.foundation.a.a(e112, (wf.k) K10, rVar, 0);
        long j112 = j10;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static boolean c0(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, p4.f] */
    public static final p4.f d(Context context, p4.e eVar) {
        Object obj = AbstractC5042g.f41723a;
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC5039d.b(context, ConnectivityManager.class);
        if (connectivityManager != null && AbstractC5042g.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new p4.g(connectivityManager, eVar);
            } catch (Exception unused) {
                return new Object();
            }
        }
        return new Object();
    }

    public static final boolean d0(float f6, float f10, float f11, float f12, long j6) {
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        float b10 = AbstractC5249a.b(j6);
        float c10 = AbstractC5249a.c(j6);
        if (((f14 * f14) / (c10 * c10)) + ((f13 * f13) / (b10 * b10)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final long e(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                long j6 = (i11 & 4294967295L) | (i10 << 32);
                int i12 = D.f12484c;
                return j6;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    public static int e0(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.top;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.left;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.bottom;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.right;
        }
        return Math.max(0, i11 - i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(AbstractC4326r abstractC4326r, float f6, long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        float f10;
        long j10;
        float f11;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object K10;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1534852205);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            f10 = f6;
            if (rVar.d(f6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) != 0) {
                j10 = j6;
                if ((i11 & 4) == 0 && rVar.f(j10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            } else {
                j10 = j6;
            }
            if ((i12 & 147) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                f11 = f10;
            } else {
                rVar.R();
                if ((i10 & 1) == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    abstractC4326r3 = abstractC4326r2;
                    f11 = f10;
                } else {
                    if (i16 == 0) {
                        abstractC4326r3 = C4323o.f37719b;
                    } else {
                        abstractC4326r3 = abstractC4326r2;
                    }
                    if (i17 == 0) {
                        f11 = AbstractC1528b1.f19926a;
                    } else {
                        f11 = f10;
                    }
                    if ((i11 & 4) != 0) {
                        float f12 = AbstractC1528b1.f19926a;
                        rVar.W(77461041);
                        float f13 = AbstractC1675i.f21571a;
                        long e10 = W.R0.e(25, rVar);
                        rVar.t(false);
                        i12 &= -897;
                        j10 = e10;
                    }
                }
                rVar.u();
                AbstractC4326r m10 = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.e.c(abstractC4326r3, 1.0f), f11);
                rVar.W(1779728798);
                if ((i12 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((((i12 & 896) ^ 384) <= 256 && rVar.f(j10)) || (i12 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                K10 = rVar.K();
                if (!z12 || K10 == C1723m.f22654Y) {
                    K10 = new C1533c1(f11, j10, 1);
                    rVar.h0(K10);
                }
                rVar.t(false);
                androidx.compose.foundation.a.a(m10, (wf.k) K10, rVar, 0);
            }
            long j11 = j10;
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C1538d1(abstractC4326r3, f11, j11, i10, i11, 1);
                return;
            }
            return;
        }
        f10 = f6;
        if ((i10 & 384) != 0) {
        }
        if ((i12 & 147) != 146) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        rVar.u();
        AbstractC4326r m102 = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.e.c(abstractC4326r3, 1.0f), f11);
        rVar.W(1779728798);
        if ((i12 & 112) != 32) {
        }
        if (((i12 & 896) ^ 384) <= 256) {
        }
        z11 = false;
        z12 = z11 | z10;
        K10 = rVar.K();
        if (!z12) {
        }
        K10 = new C1533c1(f11, j10, 1);
        rVar.h0(K10);
        rVar.t(false);
        androidx.compose.foundation.a.a(m102, (wf.k) K10, rVar, 0);
        long j112 = j10;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final AbstractC4326r f0(AbstractC1725n abstractC1725n, AbstractC4326r abstractC4326r) {
        if (abstractC4326r.l(C4322n.f37718Y)) {
            return abstractC4326r;
        }
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1219399079);
        AbstractC4326r abstractC4326r2 = (AbstractC4326r) abstractC4326r.a(C4323o.f37719b, new C6473k(12, rVar));
        rVar.t(false);
        return abstractC4326r2;
    }

    public static final float g(long j6) {
        if (C5251c.d(j6) == 0.0f && C5251c.e(j6) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(C5251c.d(j6), C5251c.e(j6)))) * 180.0f) / 3.1415927f;
    }

    public static int g0(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final int h(int i10, int i11, S s10, long j6, N.r rVar) {
        if (rVar != null) {
            int compare = s10.f12245f.compare(Long.valueOf(rVar.f12405c), Long.valueOf(j6));
            if (compare < 0) {
                return 1;
            }
            if (compare > 0) {
                return 3;
            }
            return 2;
        }
        return AbstractC4828h.h0(i10, i11);
    }

    public static final C1720k0 h0(int i10) {
        int i11 = AbstractC1703c.f22606b;
        return new C1720k0(i10);
    }

    public static final boolean i0(String str) {
        AbstractC3557B.c0("method", str);
        if (!AbstractC3557B.K(str, "GET") && !AbstractC3557B.K(str, "HEAD")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r10.right <= r12.left) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10.left >= r12.right) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r9 != 66) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r11 = e0(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r9 == 17) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r9 == 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r9 == 66) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r9 != 130) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean k10 = k(i10, rect, rect2);
        if (k(i10, rect, rect3) || !k10) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
    }

    public static boolean j0(Parcel parcel, int i10) {
        s0(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static boolean k(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static IBinder k0(Parcel parcel, int i10) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m02);
        return readStrongBinder;
    }

    public static final long l(C0194k c0194k, boolean z10) {
        long j6;
        long j10 = C5251c.f43619b;
        List list = c0194k.f1652a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            B0.u uVar = (B0.u) list.get(i11);
            if (uVar.f1673d && uVar.f1677h) {
                if (z10) {
                    j6 = uVar.f1672c;
                } else {
                    j6 = uVar.f1676g;
                }
                j10 = C5251c.h(j10, j6);
                i10++;
            }
        }
        if (i10 == 0) {
            return C5251c.f43621d;
        }
        float f6 = i10;
        return R4.b.r(C5251c.d(j10) / f6, C5251c.e(j10) / f6);
    }

    public static int l0(Parcel parcel, int i10) {
        s0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static final float m(C0194k c0194k, boolean z10) {
        long j6;
        long l10 = l(c0194k, z10);
        float f6 = 0.0f;
        if (C5251c.b(l10, C5251c.f43621d)) {
            return 0.0f;
        }
        List list = c0194k.f1652a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            B0.u uVar = (B0.u) list.get(i11);
            if (uVar.f1673d && uVar.f1677h) {
                if (z10) {
                    j6 = uVar.f1672c;
                } else {
                    j6 = uVar.f1676g;
                }
                i10++;
                f6 = C5251c.c(C5251c.g(j6, l10)) + f6;
            }
        }
        return f6 / i10;
    }

    public static int m0(Parcel parcel, int i10) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void n(long j6, String str) {
        if (j6 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 36);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j6);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final void n0(AbstractC1725n abstractC1725n, Object obj, wf.n nVar) {
        Z.r rVar = (Z.r) abstractC1725n;
        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), obj)) {
            rVar.h0(obj);
            rVar.c(obj, nVar);
        }
    }

    public static final AbstractC4326r o(AbstractC4326r abstractC4326r, wf.o oVar) {
        return abstractC4326r.g(new C4321m(oVar));
    }

    public static void o0(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m0(parcel, i10));
    }

    public static Bundle p(Parcel parcel, int i10) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m02);
        return readBundle;
    }

    public static final AbstractC4326r p0(M0.a aVar, D.m mVar, V.e eVar, boolean z10, L0.g gVar, AbstractC6216a abstractC6216a) {
        C4323o c4323o = C4323o.f37719b;
        return Q.s(c4323o, L0.l.a(androidx.compose.foundation.a.g(c4323o, mVar, eVar, z10, gVar, abstractC6216a, 8), false, new C6077x(15, aVar)));
    }

    public static Parcelable q(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m02);
        return parcelable;
    }

    public static int q0(Parcel parcel) {
        int readInt = parcel.readInt();
        int m02 = m0(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == '\u4f45') {
            int i10 = m02 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new K0.e(AbstractC2469q0.i("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new K0.e("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static String r(Parcel parcel, int i10) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m02);
        return readString;
    }

    public static void r0(com.auth0.android.request.internal.k kVar, C0479k c0479k) {
        y yVar;
        int i10;
        String str;
        AbstractC3557B.c0("token", kVar);
        C4175a c4175a = (C4175a) c0479k.f4369c;
        if (c4175a != null) {
            List list = c4175a.f37059a;
            String str2 = kVar.f26739d;
            if (list.contains(str2) && !"none".equalsIgnoreCase(str2)) {
                Signature signature = c4175a.f37060b;
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = kVar.f26738c;
                sb2.append(strArr[0]);
                sb2.append(Separators.DOT);
                sb2.append(strArr[1]);
                byte[] bytes = sb2.toString().getBytes(StandardCharsets.UTF_8);
                try {
                    byte[] decode = Base64.decode(strArr[2], 10);
                    signature.update(bytes);
                    if (signature.verify(decode)) {
                        yVar = y.f36177a;
                    }
                } catch (Exception unused) {
                }
                throw new J("Invalid ID token signature.", null);
            }
            AbstractC3557B.c0("tokenAlgorithm", str2);
            if (list.size() == 1) {
                str = android.gov.nist.core.a.n(android.gov.nist.core.a.s("Signature algorithm of \"", str2, "\" is not supported. Expected the ID token to be signed with "), (String) list.get(0), '.');
            } else {
                str = "Signature algorithm of \"" + str2 + "\" is not supported. Expected the ID token to be signed with any of " + list + '.';
            }
            throw new J(str, null);
        }
        yVar = null;
        if (yVar != null) {
            String str3 = kVar.f26742g;
            if (!TextUtils.isEmpty(str3)) {
                String str4 = (String) c0479k.f4367a;
                if (AbstractC3557B.K(str3, str4)) {
                    if (!TextUtils.isEmpty(kVar.f26741f)) {
                        List list2 = kVar.f26750o;
                        if (!list2.isEmpty()) {
                            String str5 = (String) c0479k.f4368b;
                            if (list2.contains(str5)) {
                                Calendar calendar = Calendar.getInstance();
                                Date date = (Date) c0479k.f4374h;
                                if (date == null) {
                                    date = calendar.getTime();
                                }
                                Integer num = (Integer) c0479k.f4373g;
                                if (num != null) {
                                    AbstractC3557B.Z(num);
                                    i10 = num.intValue();
                                } else {
                                    i10 = 60;
                                }
                                Date date2 = kVar.f26747l;
                                if (date2 != null) {
                                    calendar.setTime(date2);
                                    calendar.add(13, i10);
                                    Date time = calendar.getTime();
                                    AbstractC3557B.Z(date);
                                    if (!date.after(time)) {
                                        if (kVar.f26746k != null) {
                                            if (((String) c0479k.f4371e) != null) {
                                                String str6 = kVar.f26743h;
                                                if (!TextUtils.isEmpty(str6)) {
                                                    if (!AbstractC3557B.K((String) c0479k.f4371e, str6)) {
                                                        throw new J(v.f37087Y.i((String) c0479k.f4371e, str6), null);
                                                    }
                                                } else {
                                                    throw new J("Nonce (nonce) claim must be a string present in the ID token", null);
                                                }
                                            }
                                            String str7 = (String) c0479k.f4370d;
                                            if (str7 != null) {
                                                if (Lg.n.I2(str7, "org_", false)) {
                                                    String str8 = kVar.f26744i;
                                                    if (!TextUtils.isEmpty(str8)) {
                                                        if (!AbstractC3557B.K(str7, str8)) {
                                                            throw new J(C4173A.f37033Y.c(str7, str8), null);
                                                        }
                                                    } else {
                                                        throw new J("Organization Id (org_id) claim must be a string present in the ID token", null);
                                                    }
                                                } else {
                                                    String str9 = kVar.f26745j;
                                                    if (!TextUtils.isEmpty(str9)) {
                                                        String lowerCase = str7.toLowerCase(Locale.ROOT);
                                                        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
                                                        if (!AbstractC3557B.K(lowerCase, str9)) {
                                                            throw new J(k5.C.f37034Y.c(str7, str9), null);
                                                        }
                                                    } else {
                                                        throw new J("Organization Name (org_name) claim must be a string present in the ID token", null);
                                                    }
                                                }
                                            }
                                            if (list2.size() > 1) {
                                                String str10 = kVar.f26748m;
                                                if (!TextUtils.isEmpty(str10)) {
                                                    if (!AbstractC3557B.K(str5, str10)) {
                                                        AbstractC3557B.c0("expected", str5);
                                                        throw new J(C4182h.f37065Y.i(str5, str10), null);
                                                    }
                                                } else {
                                                    throw new J("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values", null);
                                                }
                                            }
                                            if (((Integer) c0479k.f4372f) != null) {
                                                Date date3 = kVar.f26749n;
                                                if (date3 != null) {
                                                    calendar.setTime(date3);
                                                    Integer num2 = (Integer) c0479k.f4372f;
                                                    AbstractC3557B.Z(num2);
                                                    calendar.add(13, num2.intValue());
                                                    calendar.add(13, i10);
                                                    Date time2 = calendar.getTime();
                                                    if (date.after(time2)) {
                                                        long j6 = 1000;
                                                        throw new J(C4178d.f37061Y.b(date.getTime() / j6, Long.valueOf(time2.getTime() / j6)), null);
                                                    }
                                                    return;
                                                }
                                                throw new J("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified", null);
                                            }
                                            return;
                                        }
                                        throw new J("Issued At (iat) claim must be a number present in the ID token", null);
                                    }
                                    long j10 = 1000;
                                    throw new J(C4190p.f37079Y.b(date.getTime() / j10, Long.valueOf(time.getTime() / j10)), null);
                                }
                                throw new J("Expiration Time (exp) claim must be a number present in the ID token", null);
                            }
                            AbstractC3557B.c0("expected", str5);
                            throw new J("Audience (aud) claim mismatch in the ID token; expected \"" + str5 + "\" but was not one of \"" + list2 + '\"', null);
                        }
                        throw new J("Audience (aud) claim must be a string or array of strings present in the ID token", null);
                    }
                    throw new J("Subject (sub) claim must be a string present in the ID token", null);
                }
                AbstractC3557B.c0("expected", str4);
                throw new J(k5.s.f37080Y.c(str4, str3), null);
            }
            throw new J("Issuer (iss) claim must be a string present in the ID token", null);
        }
        throw new J("Signature Verifier should not be null", null);
    }

    public static Object[] s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m02);
        return createTypedArray;
    }

    public static void s0(Parcel parcel, int i10, int i11) {
        int m02 = m0(parcel, i10);
        if (m02 == i11) {
            return;
        }
        throw new K0.e(R.a.t(E9.f.A("Expected size ", i11, " got ", m02, " (0x"), Integer.toHexString(m02), Separators.RPAREN), parcel);
    }

    public static ArrayList t(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m02 = m0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m02 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m02);
        return createTypedArrayList;
    }

    public static final void u(C3474g c3474g, C4113B c4113b) {
        try {
            Iterator it = ((ArrayList) c3474g.g(c4113b)).iterator();
            IOException iOException = null;
            while (it.hasNext()) {
                C4113B c4113b2 = (C4113B) it.next();
                try {
                    if (c3474g.h(c4113b2).f36730b) {
                        u(c3474g, c4113b2);
                    }
                    c3474g.e(c4113b2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static final Object v(A a5, x0 x0Var, AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new C0870r0(a5, x0Var, null), abstractC4825e);
        if (e02 == EnumC5000a.f41328Y) {
            return e02;
        }
        return y.f36177a;
    }

    public static void w(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new K0.e(android.gov.nist.core.a.e("Overread allowed size end=", i10), parcel);
    }

    public static final boolean x(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static boolean y(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static C6300h0 z(I8.u uVar) {
        String str;
        try {
            String T = uVar.q0("name").T();
            boolean f6 = uVar.q0("crashed").f();
            String T10 = uVar.q0("stack").T();
            I8.r q02 = uVar.q0("state");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            AbstractC3557B.b0("name", T);
            AbstractC3557B.b0("stack", T10);
            return new C6300h0(T, T10, f6, str);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Thread", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Thread", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Thread", e12);
        }
    }

    public abstract String i();
}
