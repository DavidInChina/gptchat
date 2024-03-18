package com.google.android.gms.internal.play_billing;

import A.AbstractC0044t0;
import Df.AbstractC0405d;
import Df.AbstractC0406e;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.EnumC0998g;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.view.View;
import dh.AbstractC2704h0;
import dh.C2695d;
import h5.C3325c;
import he.C3418c;
import he.C3419d;
import he.C3420e;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import jf.C3960j;
import k5.C4181g;
import k6.AbstractC4194d;
import kf.AbstractC4273I;
import kg.C4294f;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import ng.C4846m;
import of.EnumC5000a;
import p9.C5104f;
import pf.AbstractC5156c;
import r0.C5347k;
import sg.C5625b;
import sg.EnumC5626c;
import u0.AbstractC5824b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import w.C6053E;
import x6.A1;
import x6.AbstractC6287d;
import x6.AbstractC6301h1;
import x6.B1;
import x6.C1;
import x6.C6289d1;
import x6.C6292e1;
import x6.C6295f1;
import x6.C6304i1;
import x6.C6307j1;
import x6.C6313l1;
import x6.C6316m1;
import x6.C6322o1;
import x6.C6325p1;
import x6.C6328q1;
import x6.C6330r1;
import x6.C6333s1;
import x6.C6336t1;
import x6.C6339u1;
import x6.C6342v1;
import x6.C6345w1;
import x6.C6348x1;
import x6.C6354z1;
import x6.D1;
import x6.F1;
import x6.H1;
import x6.I1;
import x6.K1;
import x6.N1;
import x6.O1;
import x6.P1;
import x6.Q1;
import x6.R1;
import x6.T1;
import x6.U1;
import x6.V1;
import x6.W1;
import x6.Y1;
import x6.Z1;
import x6.a2;
import xe.AbstractC6407L;
import xe.C6403H;
import xe.C6405J;
import xe.C6410O;
import xe.C6411P;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public static C5953f f26868a;

    /* renamed from: b  reason: collision with root package name */
    public static C5953f f26869b;

    /* renamed from: c  reason: collision with root package name */
    public static C5953f f26870c;

    /* renamed from: d  reason: collision with root package name */
    public static C5953f f26871d;

    /* renamed from: e  reason: collision with root package name */
    public static C5953f f26872e;

    /* renamed from: f  reason: collision with root package name */
    public static C5953f f26873f;

    public static final void A0(C6405J c6405j, C6405J c6405j2) {
        AbstractC3557B.c0("<this>", c6405j);
        AbstractC3557B.c0("url", c6405j2);
        c6405j.e(c6405j2.f49839a);
        c6405j.d(c6405j2.f49840b);
        c6405j.f49841c = c6405j2.f49841c;
        c6405j.c(c6405j2.f49846h);
        c6405j.f49843e = c6405j2.f49843e;
        c6405j.f49844f = c6405j2.f49844f;
        C6403H s10 = Ad.l.s();
        Df.H.n(s10, c6405j2.f49847i);
        c6405j.f49847i = s10;
        c6405j.f49848j = new C6411P(s10);
        String str = c6405j2.f49845g;
        AbstractC3557B.c0("<set-?>", str);
        c6405j.f49845g = str;
        c6405j.f49842d = c6405j2.f49842d;
    }

    public static p9.k B(AbstractC5824b abstractC5824b, C5347k c5347k) {
        C5104f c5104f = C5104f.f42777h0;
        AbstractC3557B.c0("painter", abstractC5824b);
        return new p9.k(abstractC5824b, 1.0f, c5347k, c5104f);
    }

    public static final void B0(Object obj) {
        if (!(obj instanceof C3960j)) {
            return;
        }
        throw ((C3960j) obj).f36157Y;
    }

    public static x6.V0 C(I8.u uVar) {
        C6316m1 c6316m1;
        try {
            I8.r q02 = uVar.q0("viewport");
            if (q02 != null) {
                c6316m1 = AbstractC3557B.P0(q02.y());
            } else {
                c6316m1 = null;
            }
            return new x6.V0(c6316m1);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Display", e12);
        }
    }

    public static x6.X0 D(I8.u uVar) {
        try {
            return new x6.X0(uVar.q0("duration").I(), uVar.q0("start").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Download", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Download", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Download", e12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Cf.g, Cf.e] */
    public static Cf.g D0(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            Cf.g gVar = Cf.g.f3113i0;
            return Cf.g.f3113i0;
        }
        return new Cf.e(i10, i11 - 1, 1);
    }

    public static x6.Y0 E(I8.u uVar) {
        try {
            return new x6.Y0(uVar.q0("duration").I(), uVar.q0("start").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type FirstByte", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type FirstByte", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type FirstByte", e12);
        }
    }

    public static final void E0(Me.i iVar, CharSequence charSequence, int i10, int i11, Charset charset) {
        int i12;
        AbstractC3557B.c0("<this>", iVar);
        AbstractC3557B.c0(ParameterNames.TEXT, charSequence);
        AbstractC3557B.c0("charset", charset);
        if (charset == Lg.a.f11131a) {
            Ne.c d10 = Ne.d.d(iVar, 1, null);
            while (true) {
                try {
                    int B02 = AbstractC3557B.B0(d10.f12021a, charSequence, i10, i11, d10.f12023c, d10.f12025e);
                    int i13 = ((short) (B02 >>> 16)) & 65535;
                    i10 += i13;
                    d10.a(((short) (B02 & 65535)) & 65535);
                    if (i13 == 0 && i10 < i11) {
                        i12 = 8;
                    } else if (i10 < i11) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        d10 = Ne.d.d(iVar, i12, d10);
                    } else {
                        return;
                    }
                } finally {
                    iVar.a();
                }
            }
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder);
            AbstractC3557B.A0(newEncoder, iVar, charSequence, i10, i11);
        }
    }

    public static C6295f1 F(I8.u uVar) {
        String str;
        int[] h10;
        Long l10;
        Long l11;
        Long l12;
        C6292e1 c6292e1;
        x6.W0 w02;
        x6.N0 n02;
        C6307j1 c6307j1;
        x6.Y0 y02;
        x6.X0 x02;
        C6289d1 c6289d1;
        String T;
        try {
            I8.r q02 = uVar.q0(ParameterNames.ID);
            x6.Z0 z02 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T10 = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T10);
            int i10 = 0;
            for (int i11 : AbstractC6708l.h(11)) {
                if (AbstractC3557B.K(AbstractC6301h1.b(i11), T10)) {
                    I8.r q03 = uVar.q0("method");
                    if (q03 != null && (T = q03.T()) != null) {
                        int[] h11 = AbstractC6708l.h(9);
                        int length = h11.length;
                        while (i10 < length) {
                            int i12 = h11[i10];
                            if (AbstractC3557B.K(AbstractC6287d.t(i12), T)) {
                                i10 = i12;
                            } else {
                                i10++;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    String T11 = uVar.q0("url").T();
                    I8.r q04 = uVar.q0("status_code");
                    if (q04 != null) {
                        l10 = Long.valueOf(q04.I());
                    } else {
                        l10 = null;
                    }
                    I8.r q05 = uVar.q0("duration");
                    if (q05 != null) {
                        l11 = Long.valueOf(q05.I());
                    } else {
                        l11 = null;
                    }
                    I8.r q06 = uVar.q0("size");
                    if (q06 != null) {
                        l12 = Long.valueOf(q06.I());
                    } else {
                        l12 = null;
                    }
                    I8.r q07 = uVar.q0("redirect");
                    if (q07 != null) {
                        c6292e1 = AbstractC3557B.L0(q07.y());
                    } else {
                        c6292e1 = null;
                    }
                    I8.r q08 = uVar.q0("dns");
                    if (q08 != null) {
                        w02 = AbstractC3557B.H0(q08.y());
                    } else {
                        w02 = null;
                    }
                    I8.r q09 = uVar.q0("connect");
                    if (q09 != null) {
                        n02 = U3.f.M(q09.y());
                    } else {
                        n02 = null;
                    }
                    I8.r q010 = uVar.q0("ssl");
                    if (q010 != null) {
                        c6307j1 = AbstractC3557B.N0(q010.y());
                    } else {
                        c6307j1 = null;
                    }
                    I8.r q011 = uVar.q0("first_byte");
                    if (q011 != null) {
                        y02 = E(q011.y());
                    } else {
                        y02 = null;
                    }
                    I8.r q012 = uVar.q0("download");
                    if (q012 != null) {
                        x02 = D(q012.y());
                    } else {
                        x02 = null;
                    }
                    I8.r q013 = uVar.q0("provider");
                    if (q013 != null) {
                        c6289d1 = AbstractC3557B.K0(q013.y());
                    } else {
                        c6289d1 = null;
                    }
                    I8.r q014 = uVar.q0("graphql");
                    if (q014 != null) {
                        z02 = AbstractC3557B.I0(q014.y());
                    }
                    AbstractC3557B.b0("url", T11);
                    return new C6295f1(str, i11, i10, T11, l10, l11, l12, c6292e1, w02, n02, c6307j1, y02, x02, c6289d1, z02);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Resource", e12);
        }
    }

    public static C6304i1 G(I8.u uVar) {
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
            return new C6304i1(T, str, T10, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ResourceEventView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ResourceEventView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ResourceEventView", e12);
        }
    }

    public static J G0() {
        String str;
        ClassLoader classLoader = N.class.getClassLoader();
        if (!J.class.equals(J.class)) {
            if (!J.class.getPackage().equals(N.class.getPackage())) {
                throw new IllegalArgumentException(J.class.getName());
            }
            str = J.class.getPackage().getName() + ".BlazeGenerated" + J.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    try {
                        AbstractC2469q0.p(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(N.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC2469q0.p(it.next());
                    throw null;
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(H.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(J.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (J) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (J) J.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public static C6313l1 H(I8.u uVar) {
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
                if (!kf.q.S2(entry.getKey(), C6313l1.f49372e)) {
                    Object key = entry.getKey();
                    AbstractC3557B.b0("entry.key", key);
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new C6313l1(str, str2, str3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Usr", e12);
        }
    }

    public static C6322o1 I(I8.u uVar) {
        try {
            return new C6322o1(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Action", e12);
        }
    }

    public static C6328q1 J(I8.u uVar) {
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
            return new C6328q1(str, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Cellular", e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        r6.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6336t1 K(I8.u uVar) {
        ArrayList arrayList;
        String T;
        try {
            String T10 = uVar.q0("status").T();
            AbstractC3557B.b0("jsonObject.get(\"status\").asString", T10);
            T1 b10 = R1.b(T10);
            I8.r q02 = uVar.q0("interfaces");
            int i10 = 0;
            C6328q1 c6328q1 = null;
            if (q02 != null) {
                ArrayList arrayList2 = q02.s().f8131Y;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String T11 = ((I8.r) it.next()).T();
                    AbstractC3557B.b0("it.asString", T11);
                    I1[] values = I1.values();
                    int length = values.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        I1 i12 = values[i11];
                        if (AbstractC3557B.K(i12.f49014Y, T11)) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            arrayList = null;
            I8.r q03 = uVar.q0("effective_type");
            if (q03 != null && (T = q03.T()) != null) {
                int[] h10 = AbstractC6708l.h(4);
                int length2 = h10.length;
                while (i10 < length2) {
                    int i13 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6301h1.f(i13), T)) {
                        i10 = i13;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            I8.r q04 = uVar.q0("cellular");
            if (q04 != null) {
                c6328q1 = J(q04.y());
            }
            return new C6336t1(b10, arrayList, i10, c6328q1);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e12);
        }
    }

    public static C6342v1 L(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new C6342v1(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e12);
        }
    }

    public static C6348x1 M(I8.u uVar) {
        try {
            return new C6348x1(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Crash", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Crash", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Crash", e12);
        }
    }

    public static C6354z1 N(I8.u uVar) {
        A1 a12;
        C6333s1 c6333s1;
        String str;
        ArrayList arrayList;
        try {
            I8.r q02 = uVar.q0(ParameterNames.SESSION);
            O1 o12 = null;
            if (q02 != null) {
                a12 = AbstractC3557B.W0(q02.y());
            } else {
                a12 = null;
            }
            I8.r q03 = uVar.q0("configuration");
            if (q03 != null) {
                c6333s1 = AbstractC3557B.S0(q03.y());
            } else {
                c6333s1 = null;
            }
            I8.r q04 = uVar.q0("browser_sdk_version");
            if (q04 != null) {
                str = q04.T();
            } else {
                str = null;
            }
            long I10 = uVar.q0("document_version").I();
            I8.r q05 = uVar.q0("page_states");
            if (q05 != null) {
                ArrayList arrayList2 = q05.s().f8131Y;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC3557B.a1(((I8.r) it.next()).y()));
                }
            } else {
                arrayList = null;
            }
            I8.r q06 = uVar.q0("replay_stats");
            if (q06 != null) {
                o12 = AbstractC3557B.c1(q06.y());
            }
            return new C6354z1(a12, c6333s1, str, I10, arrayList, o12);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Dd", e12);
        }
    }

    public static B1 O(I8.u uVar) {
        int[] h10;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String T = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6301h1.e(i10), T)) {
                    I8.r q02 = uVar.q0("name");
                    if (q02 != null) {
                        str = q02.T();
                    } else {
                        str = null;
                    }
                    I8.r q03 = uVar.q0("model");
                    if (q03 != null) {
                        str2 = q03.T();
                    } else {
                        str2 = null;
                    }
                    I8.r q04 = uVar.q0("brand");
                    if (q04 != null) {
                        str3 = q04.T();
                    } else {
                        str3 = null;
                    }
                    I8.r q05 = uVar.q0("architecture");
                    if (q05 != null) {
                        str4 = q05.T();
                    } else {
                        str4 = null;
                    }
                    return new B1(i10, str, str2, str3, str4);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Device", e12);
        }
    }

    public static C1 P(I8.u uVar) {
        Z1 z12;
        try {
            I8.r q02 = uVar.q0("viewport");
            Q1 q12 = null;
            if (q02 != null) {
                z12 = AbstractC4344b.r0(q02.y());
            } else {
                z12 = null;
            }
            I8.r q03 = uVar.q0("scroll");
            if (q03 != null) {
                q12 = AbstractC3557B.d1(q03.y());
            }
            return new C1(z12, q12);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Display", e12);
        }
    }

    public static D1 Q(I8.u uVar) {
        try {
            return new D1(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Error", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Error", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Error", e12);
        }
    }

    public static F1 R(I8.u uVar) {
        try {
            return new F1(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type FrozenFrame", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type FrozenFrame", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type FrozenFrame", e12);
        }
    }

    public static H1 S(I8.u uVar) {
        try {
            return new H1(uVar.q0("start").I(), uVar.q0("duration").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type InForegroundPeriod", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type InForegroundPeriod", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type InForegroundPeriod", e12);
        }
    }

    public static K1 T(I8.u uVar) {
        String str;
        try {
            String T = uVar.q0("name").T();
            String T10 = uVar.q0(ParameterNames.VERSION).T();
            I8.r q02 = uVar.q0("build");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T11 = uVar.q0("version_major").T();
            AbstractC3557B.b0("name", T);
            AbstractC3557B.b0(ParameterNames.VERSION, T10);
            AbstractC3557B.b0("versionMajor", T11);
            return new K1(T, T10, str, T11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Os", e12);
        }
    }

    public static P1 U(I8.u uVar) {
        try {
            return new P1(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Resource", e12);
        }
    }

    public static a2 V(I8.u uVar) {
        String str;
        String str2;
        String str3;
        V1 v12;
        C6336t1 c6336t1;
        C1 c12;
        U1 u12;
        C6330r1 c6330r1;
        K1 k12;
        B1 b1;
        C6345w1 c6345w1;
        C6339u1 c6339u1;
        C6345w1 c6345w12;
        N1 n12;
        String T;
        AbstractC3557B.c0("jsonObject", uVar);
        try {
            long I10 = uVar.q0("date").I();
            C6325p1 Q02 = AbstractC3557B.Q0(uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION).y());
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
            W1 q05 = AbstractC4344b.q0(uVar.q0(ParameterNames.SESSION).y());
            I8.r q06 = uVar.q0("source");
            int i10 = 0;
            if (q06 != null && (T = q06.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length = h10.length;
                while (i10 < length) {
                    int i11 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6301h1.j(i11), T)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            Y1 k10 = R1.k(uVar.q0("view").y());
            I8.r q07 = uVar.q0("usr");
            if (q07 != null) {
                v12 = V1.f49115e.j(q07.y());
            } else {
                v12 = null;
            }
            I8.r q08 = uVar.q0("connectivity");
            if (q08 != null) {
                c6336t1 = K(q08.y());
            } else {
                c6336t1 = null;
            }
            I8.r q09 = uVar.q0("display");
            if (q09 != null) {
                c12 = P(q09.y());
            } else {
                c12 = null;
            }
            I8.r q010 = uVar.q0("synthetics");
            if (q010 != null) {
                u12 = AbstractC4344b.p0(q010.y());
            } else {
                u12 = null;
            }
            I8.r q011 = uVar.q0("ci_test");
            if (q011 != null) {
                c6330r1 = AbstractC3557B.R0(q011.y());
            } else {
                c6330r1 = null;
            }
            I8.r q012 = uVar.q0("os");
            if (q012 != null) {
                k12 = T(q012.y());
            } else {
                k12 = null;
            }
            I8.r q013 = uVar.q0("device");
            if (q013 != null) {
                b1 = O(q013.y());
            } else {
                b1 = null;
            }
            C6354z1 N10 = N(uVar.q0("_dd").y());
            I8.r q014 = uVar.q0("context");
            if (q014 != null) {
                c6345w1 = AbstractC3557B.U0(q014.y());
            } else {
                c6345w1 = null;
            }
            I8.r q015 = uVar.q0("container");
            if (q015 != null) {
                c6339u1 = AbstractC3557B.T0(q015.y());
            } else {
                c6339u1 = null;
            }
            I8.r q016 = uVar.q0("feature_flags");
            if (q016 != null) {
                c6345w12 = AbstractC3557B.U0(q016.y());
            } else {
                c6345w12 = null;
            }
            I8.r q017 = uVar.q0("privacy");
            if (q017 != null) {
                n12 = AbstractC3557B.b1(q017.y());
            } else {
                n12 = null;
            }
            return new a2(I10, Q02, str, str2, str3, q05, i10, k10, v12, c6336t1, c12, u12, c6330r1, k12, b1, N10, c6345w1, c6339u1, c6345w12, n12);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ViewEvent", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ViewEvent", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ViewEvent", e12);
        }
    }

    public static Mf.h0 W(C4294f c4294f, AbstractC0997f abstractC0997f) {
        if (c4294f != null) {
            if (abstractC0997f != null) {
                Collection u10 = abstractC0997f.u();
                if (u10.size() != 1) {
                    return null;
                }
                for (Mf.h0 h0Var : ((AbstractC1165x) ((AbstractC0996e) u10.iterator().next())).S()) {
                    if (((AbstractC1158p) h0Var).getName().equals(c4294f)) {
                        return h0Var;
                    }
                }
                return null;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public static final C5953f X() {
        C5953f c5953f = f26869b;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p p10 = R.a.p(0, 12.0f, 2.0f);
        p10.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        p10.u(4.48f, 10.0f, 10.0f, 10.0f);
        p10.u(10.0f, -4.48f, 10.0f, -10.0f);
        p10.t(17.52f, 2.0f, 12.0f, 2.0f);
        p10.f();
        p10.p(13.0f, 17.0f);
        p10.m(-2.0f);
        p10.x(-2.0f);
        p10.m(2.0f);
        p10.x(2.0f);
        p10.f();
        p10.p(13.0f, 13.0f);
        p10.m(-2.0f);
        p10.n(11.0f, 7.0f);
        p10.m(2.0f);
        p10.x(6.0f);
        p10.f();
        C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f26869b = c10;
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC0405d Y(AbstractC0406e abstractC0406e) {
        AbstractC0997f abstractC0997f;
        if (abstractC0406e instanceof AbstractC0405d) {
            return (AbstractC0405d) abstractC0406e;
        }
        if (abstractC0406e instanceof Df.x) {
            Df.v vVar = Gf.s0.f6470i0[0];
            Object mo122invoke = ((Gf.s0) ((Df.x) abstractC0406e)).f6472Z.mo122invoke();
            AbstractC3557B.b0("getValue(...)", mo122invoke);
            List list = (List) mo122invoke;
            Iterator it = list.iterator();
            while (true) {
                abstractC0997f = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Df.w wVar = (Df.w) next;
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl", wVar);
                AbstractC1000i k10 = ((Gf.r0) wVar).f6460Y.y0().k();
                if (k10 instanceof AbstractC0997f) {
                    abstractC0997f = (AbstractC0997f) k10;
                }
                if (abstractC0997f != null && abstractC0997f.e() != EnumC0998g.f12085Z && abstractC0997f.e() != EnumC0998g.f12088j0) {
                    abstractC0997f = next;
                    break;
                }
            }
            Df.w wVar2 = (Df.w) abstractC0997f;
            if (wVar2 == null) {
                wVar2 = (Df.w) kf.t.h2(list);
            }
            if (wVar2 != null) {
                return Z(wVar2);
            }
            return kotlin.jvm.internal.C.f37623a.b(Object.class);
        }
        throw new Lc.l("Cannot calculate JVM erasure for type: " + abstractC0406e, 3);
    }

    public static final AbstractC0405d Z(Df.w wVar) {
        AbstractC0405d Y7;
        AbstractC0406e e10 = wVar.e();
        if (e10 != null && (Y7 = Y(e10)) != null) {
            return Y7;
        }
        throw new Lc.l("Cannot calculate JVM erasure for type: " + wVar, 3);
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 18) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final C5953f a0() {
        C5953f c5953f = f26870c;
        if (c5953f != null) {
            return c5953f;
        }
        C5952e c5952e = new C5952e("Outlined.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC5944H.f46870a;
        r0.N n10 = new r0.N(r0.r.f44254b);
        Wh.p p10 = R.a.p(0, 17.65f, 6.35f);
        p10.g(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        p10.h(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        p10.u(3.57f, 8.0f, 7.99f, 8.0f);
        p10.h(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        p10.m(-2.08f);
        p10.h(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        p10.h(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        p10.u(2.69f, -6.0f, 6.0f, -6.0f);
        p10.h(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        p10.n(13.0f, 11.0f);
        p10.m(7.0f);
        p10.w(4.0f);
        p10.o(-2.35f, 2.35f);
        p10.f();
        C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
        C5953f c10 = c5952e.c();
        f26870c = c10;
        return c10;
    }

    public static final C6410O b(String str) {
        C6405J c6405j = new C6405J();
        AbstractC6407L.b(c6405j, str);
        return c6405j.b();
    }

    public static final C6410O c(C6405J c6405j) {
        AbstractC3557B.c0("builder", c6405j);
        C6405J c6405j2 = new C6405J();
        A0(c6405j2, c6405j);
        return c6405j2.b();
    }

    public static final void d(Throwable th2) {
        Throwable th3;
        try {
            th3 = io.ktor.utils.io.F.b(th2, th2);
        } catch (Throwable unused) {
            th3 = null;
        }
        if (th3 == null) {
            throw th2;
        }
        throw th3;
    }

    public static final C5953f d0() {
        C5953f c5953f = f26873f;
        if (c5953f != null) {
            return c5953f;
        }
        float f6 = (float) 24.0d;
        C5952e c5952e = new C5952e("Voice", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
        r0.N n10 = new r0.N(androidx.compose.ui.graphics.a.b(0));
        r0.N n11 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
        Wh.p pVar = new Wh.p(0);
        pVar.p(8.0f, 4.0f);
        pVar.w(20.0f);
        pVar.p(4.0f, 10.0f);
        pVar.w(14.0f);
        pVar.p(12.0f, 8.0f);
        pVar.w(16.0f);
        pVar.p(16.0f, 6.0f);
        pVar.w(18.0f);
        pVar.p(20.0f, 10.0f);
        pVar.w(14.0f);
        C5952e.b(c5952e, pVar.f21239a, 0, n10, n11, 2.0f, 1, 1, 4.0f);
        C5953f c10 = c5952e.c();
        f26873f = c10;
        return c10;
    }

    public static final Object e(Object obj, boolean z10) {
        EnumC5626c enumC5626c;
        AbstractC3557B.c0("possiblyPrimitiveType", obj);
        if (z10) {
            dg.v vVar = (dg.v) obj;
            if ((vVar instanceof dg.u) && (enumC5626c = ((dg.u) vVar).f28362i) != null) {
                String e10 = C5625b.c(enumC5626c.e()).e();
                AbstractC3557B.b0("getInternalName(...)", e10);
                return dg.q.d(e10);
            }
            return vVar;
        }
        return obj;
    }

    public static final KSerializer e0(Object obj, gh.d dVar) {
        KSerializer a5;
        AbstractC0405d b10;
        AbstractC3557B.c0("module", dVar);
        if (obj == null) {
            return A7.b.U0(dh.u0.f28491a);
        }
        if (obj instanceof List) {
            return A7.b.E(y((Collection) obj, dVar));
        }
        if (obj instanceof Object[]) {
            Object j32 = kf.q.j3((Object[]) obj);
            if (j32 != null) {
                return e0(j32, dVar);
            }
            return A7.b.E(dh.u0.f28491a);
        }
        if (obj instanceof Set) {
            a5 = new C2695d(y((Collection) obj, dVar), 2);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            return A7.b.G(y(map.keySet(), dVar), y(map.values(), dVar));
        } else {
            Class<?> cls = obj.getClass();
            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
            a5 = dVar.a(d10.b(cls), kf.v.f37483Y);
            if (a5 == null && (a5 = Bi.c.G1((b10 = d10.b(obj.getClass())))) == null) {
                AbstractC2704h0.d(b10);
                throw null;
            }
        }
        return a5;
    }

    public static void f(Hf.g gVar, Object[] objArr) {
        AbstractC3557B.c0("args", objArr);
        if (AbstractC3557B.h1(gVar) == objArr.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(AbstractC3557B.h1(gVar));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(android.gov.nist.core.a.l(sb2, objArr.length, " were provided."));
    }

    public static final C6053E f0(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return new C6053E(objArr);
    }

    public static final void g(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = AbstractC0044t0.y("Both size ", i10, " and step ", i11, " must be greater than zero.");
        } else {
            str = AbstractC4194d.v("size ", i10, " must be greater than zero.");
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static float j(float f6, float f10) {
        if (f6 < f10) {
            return f10;
        }
        return f6;
    }

    public static long k(long j6, long j10) {
        if (j6 < j10) {
            return j10;
        }
        return j6;
    }

    public static final void k0(AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("frame", abstractC4825e);
    }

    public static float l(float f6, float f10) {
        if (f6 > f10) {
            return f10;
        }
        return f6;
    }

    public static byte[] l0(Me.d dVar) {
        Throwable th2;
        long m10 = dVar.m();
        if (m10 <= 2147483647L) {
            int i10 = (int) m10;
            AbstractC3557B.c0("<this>", dVar);
            if (i10 != 0) {
                byte[] bArr = new byte[i10];
                boolean z10 = true;
                Ne.c b10 = Ne.d.b(dVar, 1);
                if (b10 != null) {
                    int i11 = 0;
                    while (true) {
                        try {
                            int min = Math.min(i10, b10.f12023c - b10.f12022b);
                            R4.b.P1(b10, bArr, i11, min);
                            i10 -= min;
                            i11 += min;
                            if (i10 > 0) {
                                try {
                                    b10 = Ne.d.c(dVar, b10);
                                    if (b10 == null) {
                                        break;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    z10 = false;
                                    if (z10) {
                                        Ne.d.a(dVar, b10);
                                    }
                                    throw th2;
                                }
                            } else {
                                Ne.d.a(dVar, b10);
                                break;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                }
                if (i10 > 0) {
                    throw new EOFException(AbstractC4194d.v("Premature end of stream: expected ", i10, " bytes"));
                }
                return bArr;
            }
            return Ne.d.f12801a;
        }
        throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
    }

    public static long m(long j6, long j10) {
        if (j6 > j10) {
            return j10;
        }
        return j6;
    }

    public static final void m0(Me.a aVar, ByteBuffer byteBuffer, int i10) {
        AbstractC3557B.c0("<this>", aVar);
        ByteBuffer byteBuffer2 = aVar.f12021a;
        int i11 = aVar.f12022b;
        if (aVar.f12023c - i11 >= i10) {
            int limit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                r.f.o(byteBuffer2, byteBuffer, i11);
                byteBuffer.limit(limit);
                aVar.c(i10);
                return;
            } catch (Throwable th2) {
                byteBuffer.limit(limit);
                throw th2;
            }
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i10 + '.');
    }

    public static double n(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            if (d10 > d12) {
                return d12;
            }
            return d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final io.ktor.websocket.b n0(io.ktor.websocket.m mVar) {
        short s10;
        AbstractC3557B.c0("<this>", mVar);
        byte[] bArr = mVar.f33667c;
        if (bArr.length < 2) {
            return null;
        }
        Me.c cVar = new Me.c();
        try {
            P4.a.V0(cVar, bArr);
            Me.d p10 = cVar.p();
            AbstractC3557B.c0("<this>", p10);
            int i10 = p10.f12037j0;
            int i11 = p10.f12036i0;
            if (i10 - i11 > 2) {
                p10.f12036i0 = i11 + 2;
                s10 = p10.f12035h0.getShort(i11);
            } else {
                Ne.c b10 = Ne.d.b(p10, 2);
                if (b10 != null) {
                    int i12 = b10.f12022b;
                    if (b10.f12023c - i12 >= 2) {
                        short s11 = b10.f12021a.getShort(i12);
                        b10.c(2);
                        Ne.d.a(p10, b10);
                        s10 = s11;
                    } else {
                        throw new EOFException("Not enough bytes to read a short integer of size 2.");
                    }
                } else {
                    throw new EOFException("Premature end of stream: expected 2 bytes");
                }
            }
            return new io.ktor.websocket.b(Me.h.r(p10), s10);
        } catch (Throwable th2) {
            cVar.close();
            throw th2;
        }
    }

    public static float o(float f6, float f10, float f11) {
        if (f10 <= f11) {
            if (f6 < f10) {
                return f10;
            }
            if (f6 > f11) {
                return f11;
            }
            return f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static final String o0(io.ktor.websocket.p pVar) {
        AbstractC3557B.c0("<this>", pVar);
        if (pVar.f33665a) {
            CharsetDecoder newDecoder = Lg.a.f11131a.newDecoder();
            AbstractC3557B.b0("UTF_8.newDecoder()", newDecoder);
            Me.c cVar = new Me.c();
            try {
                P4.a.V0(cVar, pVar.f33667c);
                return AbstractC3557B.w0(newDecoder, cVar.p(), Integer.MAX_VALUE);
            } catch (Throwable th2) {
                cVar.close();
                throw th2;
            }
        }
        throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame".toString());
    }

    public static int p(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static String p0(File file) {
        if (file != null && file.exists() && file.isFile() && file.canRead()) {
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                }
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        sb2.append(Separators.RETURN);
                        sb2.append(readLine2);
                    } else {
                        bufferedReader.close();
                        return sb2.toString();
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            return null;
        }
    }

    public static long q(long j6, long j10, long j11) {
        if (j10 <= j11) {
            if (j6 < j10) {
                return j10;
            }
            if (j6 > j11) {
                return j11;
            }
            return j6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static String q0(Me.h hVar, Charset charset) {
        AbstractC3557B.c0("<this>", hVar);
        AbstractC3557B.c0("charset", charset);
        CharsetDecoder newDecoder = charset.newDecoder();
        AbstractC3557B.b0("charset.newDecoder()", newDecoder);
        return AbstractC3557B.w0(newDecoder, hVar, Integer.MAX_VALUE);
    }

    public static long r(long j6, Cf.l lVar) {
        if (lVar instanceof Cf.d) {
            return ((Number) s(Long.valueOf(j6), (Cf.d) lVar)).longValue();
        }
        if (!lVar.isEmpty()) {
            long j10 = lVar.f3115Y;
            if (j6 < Long.valueOf(j10).longValue()) {
                return Long.valueOf(j10).longValue();
            }
            long j11 = lVar.f3116Z;
            if (j6 > Long.valueOf(j11).longValue()) {
                return Long.valueOf(j11).longValue();
            }
            return j6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + lVar + '.');
    }

    public static final void r0(Ne.c cVar, ByteBuffer byteBuffer) {
        AbstractC3557B.c0("<this>", cVar);
        AbstractC3557B.c0("child", byteBuffer);
        cVar.f(byteBuffer.limit());
        cVar.b(byteBuffer.position());
    }

    public static Comparable s(Comparable comparable, Cf.d dVar) {
        if (!dVar.a()) {
            float f6 = dVar.f3104a;
            if (Cf.d.b(comparable, Float.valueOf(f6)) && !Cf.d.b(Float.valueOf(f6), comparable)) {
                return Float.valueOf(f6);
            }
            float f10 = dVar.f3105b;
            if (Cf.d.b(Float.valueOf(f10), comparable) && !Cf.d.b(comparable, Float.valueOf(f10))) {
                return Float.valueOf(f10);
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
    }

    public static LinkedHashSet s0(C4294f c4294f, Collection collection, Collection collection2, AbstractC0997f abstractC0997f, xg.s sVar, C4846m c4846m, boolean z10) {
        if (c4294f != null) {
            if (collection != null) {
                if (abstractC0997f != null) {
                    if (sVar != null) {
                        if (c4846m != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c4846m.h(c4294f, collection, collection2, abstractC0997f, new Vf.a(sVar, linkedHashSet, z10));
                            return linkedHashSet;
                        }
                        a(17);
                        throw null;
                    }
                    a(16);
                    throw null;
                }
                a(15);
                throw null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static io.sentry.instrumentation.file.d t(FileInputStream fileInputStream, File file) {
        return new io.sentry.instrumentation.file.d(io.sentry.instrumentation.file.d.a(file, fileInputStream));
    }

    public static LinkedHashSet t0(C4294f c4294f, AbstractCollection abstractCollection, Collection collection, AbstractC0997f abstractC0997f, xg.s sVar, C4846m c4846m) {
        if (c4294f != null) {
            if (abstractC0997f != null) {
                if (sVar != null) {
                    if (c4846m != null) {
                        return s0(c4294f, abstractCollection, collection, abstractC0997f, sVar, c4846m, false);
                    }
                    a(5);
                    throw null;
                }
                a(4);
                throw null;
            }
            a(3);
            throw null;
        }
        a(0);
        throw null;
    }

    public static io.sentry.instrumentation.file.d u(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        io.sentry.S s10;
        io.sentry.S s11;
        if (io.sentry.util.d.f34775a) {
            s10 = io.sentry.L0.c().v();
        } else {
            s10 = io.sentry.L0.c().q();
        }
        if (s10 != null) {
            s11 = s10.p("file.read");
        } else {
            s11 = null;
        }
        return new io.sentry.instrumentation.file.d(new U3.n((Object) null, s11, fileInputStream, io.sentry.L0.c().s()), fileDescriptor);
    }

    public static LinkedHashSet u0(C4294f c4294f, Collection collection, AbstractCollection abstractCollection, Wf.c cVar, xg.s sVar, C4846m c4846m) {
        if (c4294f != null) {
            if (collection != null) {
                if (cVar != null) {
                    if (sVar != null) {
                        if (c4846m != null) {
                            return s0(c4294f, collection, abstractCollection, cVar, sVar, c4846m, true);
                        }
                        a(11);
                        throw null;
                    }
                    a(10);
                    throw null;
                }
                a(9);
                throw null;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    public static io.sentry.instrumentation.file.d v(FileInputStream fileInputStream, String str) {
        File file;
        if (str != null) {
            file = new File(str);
        } else {
            file = null;
        }
        return new io.sentry.instrumentation.file.d(io.sentry.instrumentation.file.d.a(file, fileInputStream));
    }

    public static final C3960j w(Throwable th2) {
        AbstractC3557B.c0("exception", th2);
        return new C3960j(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r0v3, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(C3418c c3418c, AbstractC4825e abstractC4825e) {
        C3419d c3419d;
        int i10;
        if (abstractC4825e instanceof C3419d) {
            C3419d c3419d2 = (C3419d) abstractC4825e;
            int i11 = c3419d2.f32275h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3419d2.f32275h0 = i11 - Integer.MIN_VALUE;
                c3419d = c3419d2;
                Object obj = c3419d.f32274Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3419d.f32275h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c3418c = c3419d.f32273Y;
                        B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    B0(obj);
                    io.ktor.utils.io.x c10 = c3418c.d().c();
                    c3419d.f32273Y = c3418c;
                    c3419d.f32275h0 = 1;
                    obj = AbstractC3557B.o2(c10, c3419d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return new C3420e(c3418c.f32270Y, c3418c.c(), c3418c.d(), l0((Me.d) obj));
            }
        }
        c3419d = new AbstractC5156c(abstractC4825e);
        Object obj2 = c3419d.f32274Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3419d.f32275h0;
        if (i10 == 0) {
        }
        return new C3420e(c3418c.f32270Y, c3418c.c(), c3418c.d(), l0((Me.d) obj2));
    }

    public static boolean x(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!x(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static final Object x0(Set set, Enum r22, Enum r32, Object obj, boolean z10) {
        Enum r12;
        if (z10) {
            if (set.contains(r22)) {
                r12 = r22;
            } else if (set.contains(r32)) {
                r12 = r32;
            } else {
                r12 = null;
            }
            if (AbstractC3557B.K(r12, r22) && AbstractC3557B.K(obj, r32)) {
                return null;
            }
            if (obj == null) {
                return r12;
            }
            return obj;
        }
        if (obj != null) {
            set = kf.t.P2(AbstractC4273I.v2(set, obj));
        }
        return kf.t.C2(set);
    }

    public static final KSerializer y(Collection collection, gh.d dVar) {
        Collection<Object> collection2 = collection;
        ArrayList d22 = kf.t.d2(collection2);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(d22, 10));
        Iterator it = d22.iterator();
        while (it.hasNext()) {
            arrayList.add(e0(it.next(), dVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getDescriptor().a())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((KSerializer) it3.next()).getDescriptor().a());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) kf.t.D2(arrayList2);
        if (kSerializer == null) {
            kSerializer = dh.u0.f28491a;
        }
        if (kSerializer.getDescriptor().c()) {
            return kSerializer;
        }
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj == null) {
                    return A7.b.U0(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    public static final KSerializer y0(gh.d dVar, Je.a aVar) {
        KSerializer kSerializer;
        AbstractC3557B.c0("<this>", dVar);
        AbstractC3557B.c0("typeInfo", aVar);
        Df.w wVar = aVar.f9099c;
        if (wVar != null) {
            if (wVar.c().isEmpty()) {
                kSerializer = null;
            } else {
                kSerializer = Df.H.r0(dVar, wVar, false);
            }
            if (kSerializer != null) {
                return kSerializer;
            }
        }
        kf.v vVar = kf.v.f37483Y;
        AbstractC0405d abstractC0405d = aVar.f9097a;
        KSerializer a5 = dVar.a(abstractC0405d, vVar);
        if (a5 != null) {
            if (wVar != null && wVar.a()) {
                a5 = A7.b.U0(a5);
            }
        } else {
            a5 = Bi.c.G1(abstractC0405d);
            if (a5 != null) {
                if (wVar != null && wVar.a()) {
                    a5 = A7.b.U0(a5);
                }
            } else {
                AbstractC2704h0.d(abstractC0405d);
                throw null;
            }
        }
        return a5;
    }

    public static final boolean z(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static Cf.e z0(Cf.g gVar, int i10) {
        boolean z10;
        AbstractC3557B.c0("<this>", gVar);
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (z10) {
            if (gVar.f3108h0 <= 0) {
                i10 = -i10;
            }
            return new Cf.e(gVar.f3106Y, gVar.f3107Z, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public abstract void A(C3325c c3325c);

    public abstract boolean C0(View view, int i10);

    public int b0(View view) {
        return 0;
    }

    public int c0() {
        return 0;
    }

    public abstract int h(View view, int i10);

    public abstract void h0(int i10);

    public abstract int i(View view, int i10);

    public abstract void i0(View view, int i10, int i11);

    public abstract void j0(View view, float f6, float f10);

    public abstract boolean v0(C4181g c4181g);

    public void g0(View view, int i10) {
    }
}
