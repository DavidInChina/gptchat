package io.sentry.protocol;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B1;
import io.sentry.C1;
import io.sentry.C3637d;
import io.sentry.C3645f1;
import io.sentry.C3653i0;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.Z;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import xe.C6431t;

/* loaded from: classes2.dex */
public final class i implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34561a;

    public /* synthetic */ i(int i10) {
        this.f34561a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.protocol.m] */
    public static m b(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -925311743:
                    if (P02.equals("rooted")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -339173787:
                    if (P02.equals("raw_description")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (P02.equals("name")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 94094958:
                    if (P02.equals("build")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (P02.equals(ParameterNames.VERSION)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2015527638:
                    if (P02.equals("kernel_version")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34582k0 = c3653i0.S();
                    break;
                case 1:
                    obj.f34579h0 = c3653i0.X0();
                    break;
                case 2:
                    obj.f34577Y = c3653i0.X0();
                    break;
                case 3:
                    obj.f34580i0 = c3653i0.X0();
                    break;
                case 4:
                    obj.f34578Z = c3653i0.X0();
                    break;
                case 5:
                    obj.f34581j0 = c3653i0.X0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34583l0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.o, java.lang.Object] */
    public static o c(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -891699686:
                    if (P02.equals("status_code")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3076010:
                    if (P02.equals("data")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 795307910:
                    if (P02.equals("headers")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 952189583:
                    if (P02.equals("cookies")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1252988030:
                    if (P02.equals("body_size")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34598h0 = c3653i0.u0();
                    break;
                case 1:
                    obj.f34600j0 = c3653i0.T0();
                    break;
                case 2:
                    Map map = (Map) c3653i0.T0();
                    if (map == null) {
                        break;
                    } else {
                        obj.f34597Z = P4.a.p0(map);
                        break;
                    }
                case 3:
                    obj.f34596Y = c3653i0.X0();
                    break;
                case 4:
                    obj.f34599i0 = c3653i0.F0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34601k0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.u, java.lang.Object] */
    public static u d(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -339173787:
                    if (P02.equals("raw_description")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (P02.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (P02.equals(ParameterNames.VERSION)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34626h0 = c3653i0.X0();
                    break;
                case 1:
                    obj.f34624Y = c3653i0.X0();
                    break;
                case 2:
                    obj.f34625Z = c3653i0.X0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34627i0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    public static A e(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        String str = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            if (!P02.equals("source")) {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                c3653i0.Y0(h10, concurrentHashMap, P02);
            } else {
                str = c3653i0.X0();
            }
        }
        A a5 = new A(str);
        a5.f34469Z = concurrentHashMap;
        c3653i0.p();
        return a5;
    }

    public static IllegalStateException f(String str, H h10) {
        String A10 = android.gov.nist.core.a.A("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(A10);
        h10.d(EnumC3642e1.ERROR, A10, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v10, types: [io.sentry.protocol.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [io.sentry.protocol.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, io.sentry.protocol.x] */
    /* JADX WARN: Type inference failed for: r3v23, types: [io.sentry.protocol.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [io.sentry.protocol.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [io.sentry.protocol.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, io.sentry.protocol.k] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, io.sentry.protocol.l] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, io.sentry.protocol.n] */
    @Override // io.sentry.Z
    public final Object a(C3653i0 c3653i0, H h10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        boolean z13;
        boolean z14;
        char c11;
        Date V10;
        Date V11;
        char c12;
        boolean z15;
        char c13;
        boolean z16;
        Date V12;
        Date V13;
        char c14;
        char c15;
        switch (this.f34561a) {
            case 0:
                c3653i0.h();
                Number number = null;
                String str = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P02 = c3653i0.P0();
                    P02.getClass();
                    if (P02.equals("unit")) {
                        str = c3653i0.X0();
                    } else if (!P02.equals("value")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3653i0.Y0(h10, concurrentHashMap, P02);
                    } else {
                        number = (Number) c3653i0.T0();
                    }
                }
                c3653i0.p();
                if (number != null) {
                    j jVar = new j(number, str);
                    jVar.f34564h0 = concurrentHashMap;
                    return jVar;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
                h10.d(EnumC3642e1.ERROR, "Missing required field \"value\"", illegalStateException);
                throw illegalStateException;
            case 1:
                ?? obj = new Object();
                c3653i0.h();
                HashMap hashMap = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P03 = c3653i0.P0();
                    P03.getClass();
                    switch (P03.hashCode()) {
                        case -1724546052:
                            if (P03.equals("description")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case 3076010:
                            if (P03.equals("data")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 3347973:
                            if (P03.equals("meta")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 3575610:
                            if (P03.equals("type")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 692803388:
                            if (P03.equals("handled")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 989128517:
                            if (P03.equals("synthetic")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1297152568:
                            if (P03.equals("help_link")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    switch (z10) {
                        case false:
                            obj.f34566Z = c3653i0.X0();
                            break;
                        case true:
                            obj.f34570k0 = P4.a.p0((Map) c3653i0.T0());
                            break;
                        case true:
                            obj.f34569j0 = P4.a.p0((Map) c3653i0.T0());
                            break;
                        case true:
                            obj.f34565Y = c3653i0.X0();
                            break;
                        case true:
                            obj.f34568i0 = c3653i0.S();
                            break;
                        case true:
                            obj.f34571l0 = c3653i0.S();
                            break;
                        case true:
                            obj.f34567h0 = c3653i0.X0();
                            break;
                        default:
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            c3653i0.Y0(h10, hashMap, P03);
                            break;
                    }
                }
                c3653i0.p();
                obj.f34572m0 = hashMap;
                return obj;
            case 2:
                c3653i0.h();
                ?? obj2 = new Object();
                ConcurrentHashMap concurrentHashMap2 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P04 = c3653i0.P0();
                    P04.getClass();
                    switch (P04.hashCode()) {
                        case -995427962:
                            if (P04.equals("params")) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            break;
                        case 954925063:
                            if (P04.equals("message")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 1811591356:
                            if (P04.equals("formatted")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        default:
                            z11 = true;
                            break;
                    }
                    switch (z11) {
                        case false:
                            List list = (List) c3653i0.T0();
                            if (list == null) {
                                break;
                            } else {
                                obj2.f34575h0 = list;
                                break;
                            }
                        case true:
                            obj2.f34574Z = c3653i0.X0();
                            break;
                        case true:
                            obj2.f34573Y = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap2, P04);
                            break;
                    }
                }
                obj2.f34576i0 = concurrentHashMap2;
                c3653i0.p();
                return obj2;
            case 3:
                return b(c3653i0, h10);
            case 4:
                c3653i0.h();
                ?? obj3 = new Object();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P05 = c3653i0.P0();
                    P05.getClass();
                    switch (P05.hashCode()) {
                        case -1650269616:
                            if (P05.equals("fragment")) {
                                c10 = 0;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case -1077554975:
                            if (P05.equals("method")) {
                                c10 = 1;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 100589:
                            if (P05.equals("env")) {
                                c10 = 2;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 116079:
                            if (P05.equals("url")) {
                                c10 = 3;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3076010:
                            if (P05.equals("data")) {
                                c10 = 4;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 106069776:
                            if (P05.equals("other")) {
                                c10 = 5;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 795307910:
                            if (P05.equals("headers")) {
                                c10 = 6;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 952189583:
                            if (P05.equals("cookies")) {
                                c10 = 7;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1252988030:
                            if (P05.equals("body_size")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1595298664:
                            if (P05.equals("query_string")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 1980646230:
                            if (P05.equals("api_target")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        default:
                            c10 = '\uffff';
                            break;
                    }
                    switch (c10) {
                        case 0:
                            obj3.f34593o0 = c3653i0.X0();
                            break;
                        case 1:
                            obj3.f34585Z = c3653i0.X0();
                            break;
                        case 2:
                            Map map = (Map) c3653i0.T0();
                            if (map == null) {
                                break;
                            } else {
                                obj3.f34590l0 = P4.a.p0(map);
                                break;
                            }
                        case 3:
                            obj3.f34584Y = c3653i0.X0();
                            break;
                        case 4:
                            obj3.f34587i0 = c3653i0.T0();
                            break;
                        case 5:
                            Map map2 = (Map) c3653i0.T0();
                            if (map2 == null) {
                                break;
                            } else {
                                obj3.f34592n0 = P4.a.p0(map2);
                                break;
                            }
                        case 6:
                            Map map3 = (Map) c3653i0.T0();
                            if (map3 == null) {
                                break;
                            } else {
                                obj3.f34589k0 = P4.a.p0(map3);
                                break;
                            }
                        case 7:
                            obj3.f34588j0 = c3653i0.X0();
                            break;
                        case '\b':
                            obj3.f34591m0 = c3653i0.F0();
                            break;
                        case '\t':
                            obj3.f34586h0 = c3653i0.X0();
                            break;
                        case '\n':
                            obj3.f34594p0 = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap3, P05);
                            break;
                    }
                }
                obj3.f34595q0 = concurrentHashMap3;
                c3653i0.p();
                return obj3;
            case 5:
                return c(c3653i0, h10);
            case 6:
                ?? obj4 = new Object();
                c3653i0.h();
                HashMap hashMap2 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P06 = c3653i0.P0();
                    P06.getClass();
                    switch (P06.hashCode()) {
                        case 270207856:
                            if (P06.equals("sdk_name")) {
                                z12 = false;
                                break;
                            }
                            z12 = true;
                            break;
                        case 696101379:
                            if (P06.equals("version_patchlevel")) {
                                z12 = true;
                                break;
                            }
                            z12 = true;
                            break;
                        case 1111241618:
                            if (P06.equals("version_major")) {
                                z12 = true;
                                break;
                            }
                            z12 = true;
                            break;
                        case 1111483790:
                            if (P06.equals("version_minor")) {
                                z12 = true;
                                break;
                            }
                            z12 = true;
                            break;
                        default:
                            z12 = true;
                            break;
                    }
                    switch (z12) {
                        case false:
                            obj4.f34602Y = c3653i0.X0();
                            break;
                        case true:
                            obj4.f34605i0 = c3653i0.u0();
                            break;
                        case true:
                            obj4.f34603Z = c3653i0.u0();
                            break;
                        case true:
                            obj4.f34604h0 = c3653i0.u0();
                            break;
                        default:
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            c3653i0.Y0(h10, hashMap2, P06);
                            break;
                    }
                }
                c3653i0.p();
                obj4.f34606j0 = hashMap2;
                return obj4;
            case 7:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                c3653i0.h();
                String str2 = null;
                String str3 = null;
                HashMap hashMap3 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P07 = c3653i0.P0();
                    P07.getClass();
                    switch (P07.hashCode()) {
                        case 3373707:
                            if (P07.equals("name")) {
                                z13 = false;
                                break;
                            }
                            z13 = true;
                            break;
                        case 351608024:
                            if (P07.equals(ParameterNames.VERSION)) {
                                z13 = true;
                                break;
                            }
                            z13 = true;
                            break;
                        case 750867693:
                            if (P07.equals("packages")) {
                                z13 = true;
                                break;
                            }
                            z13 = true;
                            break;
                        case 1487029535:
                            if (P07.equals("integrations")) {
                                z13 = true;
                                break;
                            }
                            z13 = true;
                            break;
                        default:
                            z13 = true;
                            break;
                    }
                    switch (z13) {
                        case false:
                            str2 = c3653i0.W0();
                            continue;
                        case true:
                            str3 = c3653i0.W0();
                            continue;
                        case true:
                            ArrayList w02 = c3653i0.w0(h10, new i(10));
                            if (w02 != null) {
                                arrayList.addAll(w02);
                            } else {
                                continue;
                            }
                        case true:
                            List list2 = (List) c3653i0.T0();
                            if (list2 != null) {
                                arrayList2.addAll(list2);
                                break;
                            }
                            break;
                        default:
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap();
                            }
                            c3653i0.Y0(h10, hashMap3, P07);
                            break;
                    }
                }
                c3653i0.p();
                if (str2 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
                    h10.d(EnumC3642e1.ERROR, "Missing required field \"name\"", illegalStateException2);
                    throw illegalStateException2;
                } else if (str3 != null) {
                    q qVar = new q(str2, str3);
                    qVar.f34609h0 = new CopyOnWriteArraySet(arrayList);
                    qVar.f34610i0 = new CopyOnWriteArraySet(arrayList2);
                    qVar.f34611j0 = hashMap3;
                    return qVar;
                } else {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"version\"");
                    h10.d(EnumC3642e1.ERROR, "Missing required field \"version\"", illegalStateException3);
                    throw illegalStateException3;
                }
            case 8:
                ?? obj5 = new Object();
                c3653i0.h();
                HashMap hashMap4 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P08 = c3653i0.P0();
                    P08.getClass();
                    switch (P08.hashCode()) {
                        case -1562235024:
                            if (P08.equals("thread_id")) {
                                z14 = false;
                                break;
                            }
                            z14 = true;
                            break;
                        case -1068784020:
                            if (P08.equals("module")) {
                                z14 = true;
                                break;
                            }
                            z14 = true;
                            break;
                        case 3575610:
                            if (P08.equals("type")) {
                                z14 = true;
                                break;
                            }
                            z14 = true;
                            break;
                        case 111972721:
                            if (P08.equals("value")) {
                                z14 = true;
                                break;
                            }
                            z14 = true;
                            break;
                        case 1225089881:
                            if (P08.equals("mechanism")) {
                                z14 = true;
                                break;
                            }
                            z14 = true;
                            break;
                        case 2055832509:
                            if (P08.equals("stacktrace")) {
                                z14 = true;
                                break;
                            }
                            z14 = true;
                            break;
                        default:
                            z14 = true;
                            break;
                    }
                    switch (z14) {
                        case false:
                            obj5.f34615i0 = c3653i0.F0();
                            continue;
                        case true:
                            obj5.f34614h0 = c3653i0.X0();
                            continue;
                        case true:
                            obj5.f34612Y = c3653i0.X0();
                            continue;
                        case true:
                            obj5.f34613Z = c3653i0.X0();
                            continue;
                        case true:
                            obj5.f34617k0 = (k) c3653i0.U0(h10, new i(1));
                            continue;
                        case true:
                            obj5.f34616j0 = (x) c3653i0.U0(h10, new i(14));
                            break;
                        default:
                            if (hashMap4 == null) {
                                hashMap4 = new HashMap();
                            }
                            c3653i0.Y0(h10, hashMap4, P08);
                            break;
                    }
                }
                c3653i0.p();
                obj5.f34618l0 = hashMap4;
                return obj5;
            case 9:
                return new s(c3653i0.W0());
            case 10:
                c3653i0.h();
                String str4 = null;
                String str5 = null;
                HashMap hashMap5 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P09 = c3653i0.P0();
                    P09.getClass();
                    if (P09.equals("name")) {
                        str4 = c3653i0.W0();
                    } else if (!P09.equals(ParameterNames.VERSION)) {
                        if (hashMap5 == null) {
                            hashMap5 = new HashMap();
                        }
                        c3653i0.Y0(h10, hashMap5, P09);
                    } else {
                        str5 = c3653i0.W0();
                    }
                }
                c3653i0.p();
                if (str4 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    h10.d(EnumC3642e1.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                } else if (str5 != null) {
                    t tVar = new t(str4, str5);
                    tVar.f34623h0 = hashMap5;
                    return tVar;
                } else {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    h10.d(EnumC3642e1.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
            case 11:
                return d(c3653i0, h10);
            case 12:
                c3653i0.h();
                ConcurrentHashMap concurrentHashMap4 = null;
                Map map4 = null;
                HashMap hashMap6 = null;
                Double d10 = null;
                Double d11 = null;
                s sVar = null;
                B1 b1 = null;
                B1 b12 = null;
                String str6 = null;
                String str7 = null;
                C1 c16 = null;
                String str8 = null;
                Map map5 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P010 = c3653i0.P0();
                    P010.getClass();
                    switch (P010.hashCode()) {
                        case -2011840976:
                            if (P010.equals("span_id")) {
                                c11 = 0;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1757797477:
                            if (P010.equals("parent_span_id")) {
                                c11 = 1;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1724546052:
                            if (P010.equals("description")) {
                                c11 = 2;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1526966919:
                            if (P010.equals("start_timestamp")) {
                                c11 = 3;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1008619738:
                            if (P010.equals("origin")) {
                                c11 = 4;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -892481550:
                            if (P010.equals("status")) {
                                c11 = 5;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -362243017:
                            if (P010.equals("measurements")) {
                                c11 = 6;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 3553:
                            if (P010.equals("op")) {
                                c11 = 7;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 3076010:
                            if (P010.equals("data")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 3552281:
                            if (P010.equals("tags")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 55126294:
                            if (P010.equals(DiagnosticsEntry.Event.TIMESTAMP_KEY)) {
                                c11 = '\n';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 1270300245:
                            if (P010.equals("trace_id")) {
                                c11 = 11;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        default:
                            c11 = '\uffff';
                            break;
                    }
                    switch (c11) {
                        case 0:
                            b1 = new B1(c3653i0.W0());
                            continue;
                        case 1:
                            b12 = (B1) c3653i0.U0(h10, new C3637d(12));
                            continue;
                        case 2:
                            str7 = c3653i0.X0();
                            continue;
                        case 3:
                            try {
                                d10 = c3653i0.d0();
                                continue;
                            } catch (NumberFormatException unused) {
                                d10 = c3653i0.V(h10) != null ? Double.valueOf(V11.getTime() / 1000.0d) : null;
                            }
                        case 4:
                            str8 = c3653i0.X0();
                            continue;
                        case 5:
                            c16 = (C1) c3653i0.U0(h10, new C3637d(13));
                            continue;
                        case 6:
                            hashMap6 = c3653i0.H0(h10, new i(0));
                            break;
                        case 7:
                            str6 = c3653i0.X0();
                            break;
                        case '\b':
                            map5 = (Map) c3653i0.T0();
                            break;
                        case '\t':
                            map4 = (Map) c3653i0.T0();
                            break;
                        case '\n':
                            try {
                                d11 = c3653i0.d0();
                                break;
                            } catch (NumberFormatException unused2) {
                                if (c3653i0.V(h10) == null) {
                                    d11 = null;
                                    break;
                                } else {
                                    d11 = Double.valueOf(V10.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case 11:
                            sVar = new s(c3653i0.W0());
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap4, P010);
                            break;
                    }
                }
                if (d10 == null) {
                    throw f("start_timestamp", h10);
                }
                if (sVar == null) {
                    throw f("trace_id", h10);
                }
                if (b1 == null) {
                    throw f("span_id", h10);
                }
                if (str6 != null) {
                    v vVar = new v(d10, d11, sVar, b1, b12, str6, str7, c16, str8, map4 == null ? new HashMap() : map4, hashMap6 == null ? new HashMap() : hashMap6, map5);
                    vVar.f34640r0 = concurrentHashMap4;
                    c3653i0.p();
                    return vVar;
                }
                throw f("op", h10);
            case 13:
                ?? obj6 = new Object();
                c3653i0.h();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P011 = c3653i0.P0();
                    P011.getClass();
                    switch (P011.hashCode()) {
                        case -1443345323:
                            if (P011.equals("image_addr")) {
                                c12 = 0;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -1184392185:
                            if (P011.equals("in_app")) {
                                c12 = 1;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -1113875953:
                            if (P011.equals("raw_function")) {
                                c12 = 2;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -1102671691:
                            if (P011.equals("lineno")) {
                                c12 = 3;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -1068784020:
                            if (P011.equals("module")) {
                                c12 = 4;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -1052618729:
                            if (P011.equals("native")) {
                                c12 = 5;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -887523944:
                            if (P011.equals("symbol")) {
                                c12 = 6;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -807062458:
                            if (P011.equals("package")) {
                                c12 = 7;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -734768633:
                            if (P011.equals("filename")) {
                                c12 = '\b';
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case -330260936:
                            if (P011.equals("symbol_addr")) {
                                c12 = '\t';
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 3327275:
                            if (P011.equals("lock")) {
                                c12 = '\n';
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 94842689:
                            if (P011.equals("colno")) {
                                c12 = 11;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 410194178:
                            if (P011.equals("instruction_addr")) {
                                c12 = '\f';
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 1116694660:
                            if (P011.equals("context_line")) {
                                c12 = '\r';
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 1380938712:
                            if (P011.equals("function")) {
                                c12 = 14;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 1713445842:
                            if (P011.equals("abs_path")) {
                                c12 = 15;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        case 1874684019:
                            if (P011.equals("platform")) {
                                c12 = 16;
                                break;
                            }
                            c12 = '\uffff';
                            break;
                        default:
                            c12 = '\uffff';
                            break;
                    }
                    switch (c12) {
                        case 0:
                            obj6.f34652q0 = c3653i0.X0();
                            break;
                        case 1:
                            obj6.f34648m0 = c3653i0.S();
                            break;
                        case 2:
                            obj6.f34657v0 = c3653i0.X0();
                            break;
                        case 3:
                            obj6.f34644i0 = c3653i0.u0();
                            break;
                        case 4:
                            obj6.f34643h0 = c3653i0.X0();
                            break;
                        case 5:
                            obj6.f34650o0 = c3653i0.S();
                            break;
                        case 6:
                            obj6.f34655t0 = c3653i0.X0();
                            break;
                        case 7:
                            obj6.f34649n0 = c3653i0.X0();
                            break;
                        case '\b':
                            obj6.f34641Y = c3653i0.X0();
                            break;
                        case '\t':
                            obj6.f34653r0 = c3653i0.X0();
                            break;
                        case '\n':
                            obj6.f34658w0 = (C3645f1) c3653i0.U0(h10, new C3637d(9));
                            break;
                        case 11:
                            obj6.f34645j0 = c3653i0.u0();
                            break;
                        case '\f':
                            obj6.f34654s0 = c3653i0.X0();
                            break;
                        case '\r':
                            obj6.f34647l0 = c3653i0.X0();
                            break;
                        case 14:
                            obj6.f34642Z = c3653i0.X0();
                            break;
                        case 15:
                            obj6.f34646k0 = c3653i0.X0();
                            break;
                        case 16:
                            obj6.f34651p0 = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap5, P011);
                            break;
                    }
                }
                obj6.f34656u0 = concurrentHashMap5;
                c3653i0.p();
                return obj6;
            case 14:
                ?? obj7 = new Object();
                c3653i0.h();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P012 = c3653i0.P0();
                    P012.getClass();
                    switch (P012.hashCode()) {
                        case -1266514778:
                            if (P012.equals("frames")) {
                                z15 = false;
                                break;
                            }
                            z15 = true;
                            break;
                        case 78226992:
                            if (P012.equals("registers")) {
                                z15 = true;
                                break;
                            }
                            z15 = true;
                            break;
                        case 284874180:
                            if (P012.equals("snapshot")) {
                                z15 = true;
                                break;
                            }
                            z15 = true;
                            break;
                        default:
                            z15 = true;
                            break;
                    }
                    switch (z15) {
                        case false:
                            obj7.f34659Y = c3653i0.w0(h10, new i(13));
                            break;
                        case true:
                            obj7.f34660Z = P4.a.p0((Map) c3653i0.T0());
                            break;
                        case true:
                            obj7.f34661h0 = c3653i0.S();
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap6, P012);
                            break;
                    }
                }
                obj7.f34662i0 = concurrentHashMap6;
                c3653i0.p();
                return obj7;
            case 15:
                ?? obj8 = new Object();
                c3653i0.h();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P013 = c3653i0.P0();
                    P013.getClass();
                    switch (P013.hashCode()) {
                        case -1339353468:
                            if (P013.equals("daemon")) {
                                c13 = 0;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case -1165461084:
                            if (P013.equals("priority")) {
                                c13 = 1;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case -502917346:
                            if (P013.equals("held_locks")) {
                                c13 = 2;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 3355:
                            if (P013.equals(ParameterNames.ID)) {
                                c13 = 3;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 3343801:
                            if (P013.equals("main")) {
                                c13 = 4;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 3373707:
                            if (P013.equals("name")) {
                                c13 = 5;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 109757585:
                            if (P013.equals("state")) {
                                c13 = 6;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 1025385094:
                            if (P013.equals("crashed")) {
                                c13 = 7;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 1126940025:
                            if (P013.equals("current")) {
                                c13 = '\b';
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 2055832509:
                            if (P013.equals("stacktrace")) {
                                c13 = '\t';
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        default:
                            c13 = '\uffff';
                            break;
                    }
                    switch (c13) {
                        case 0:
                            obj8.f34669l0 = c3653i0.S();
                            break;
                        case 1:
                            obj8.f34664Z = c3653i0.u0();
                            break;
                        case 2:
                            HashMap H02 = c3653i0.H0(h10, new C3637d(9));
                            if (H02 == null) {
                                break;
                            } else {
                                obj8.f34672o0 = new HashMap(H02);
                                break;
                            }
                        case 3:
                            obj8.f34663Y = c3653i0.F0();
                            break;
                        case 4:
                            obj8.f34670m0 = c3653i0.S();
                            break;
                        case 5:
                            obj8.f34665h0 = c3653i0.X0();
                            break;
                        case 6:
                            obj8.f34666i0 = c3653i0.X0();
                            break;
                        case 7:
                            obj8.f34667j0 = c3653i0.S();
                            break;
                        case '\b':
                            obj8.f34668k0 = c3653i0.S();
                            break;
                        case '\t':
                            obj8.f34671n0 = (x) c3653i0.U0(h10, new i(14));
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap7, P013);
                            break;
                    }
                }
                obj8.f34673p0 = concurrentHashMap7;
                c3653i0.p();
                return obj8;
            case 16:
                c3653i0.h();
                z zVar = new z(new ArrayList(), new HashMap(), new A(B.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap8 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P014 = c3653i0.P0();
                    P014.getClass();
                    switch (P014.hashCode()) {
                        case -1526966919:
                            if (P014.equals("start_timestamp")) {
                                z16 = false;
                                break;
                            }
                            z16 = true;
                            break;
                        case -362243017:
                            if (P014.equals("measurements")) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        case 3575610:
                            if (P014.equals("type")) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        case 55126294:
                            if (P014.equals(DiagnosticsEntry.Event.TIMESTAMP_KEY)) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        case 109638249:
                            if (P014.equals("spans")) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        case 508716399:
                            if (P014.equals("transaction_info")) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        case 2141246174:
                            if (P014.equals("transaction")) {
                                z16 = true;
                                break;
                            }
                            z16 = true;
                            break;
                        default:
                            z16 = true;
                            break;
                    }
                    switch (z16) {
                        case false:
                            try {
                                Double d02 = c3653i0.d0();
                                if (d02 == null) {
                                    break;
                                } else {
                                    zVar.f34676v0 = d02;
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                if (c3653i0.V(h10) == null) {
                                    break;
                                } else {
                                    zVar.f34676v0 = Double.valueOf(V12.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case true:
                            HashMap H03 = c3653i0.H0(h10, new i(0));
                            if (H03 == null) {
                                break;
                            } else {
                                zVar.f34679y0.putAll(H03);
                                break;
                            }
                        case true:
                            c3653i0.W0();
                            break;
                        case true:
                            try {
                                Double d03 = c3653i0.d0();
                                if (d03 == null) {
                                    break;
                                } else {
                                    zVar.f34677w0 = d03;
                                    break;
                                }
                            } catch (NumberFormatException unused4) {
                                if (c3653i0.V(h10) == null) {
                                    break;
                                } else {
                                    zVar.f34677w0 = Double.valueOf(V13.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case true:
                            ArrayList w03 = c3653i0.w0(h10, new i(12));
                            if (w03 == null) {
                                break;
                            } else {
                                zVar.f34678x0.addAll(w03);
                                break;
                            }
                        case true:
                            zVar.f34680z0 = e(c3653i0, h10);
                            break;
                        case true:
                            zVar.f34675u0 = c3653i0.X0();
                            break;
                        default:
                            if (!C6431t.k(zVar, P014, c3653i0, h10)) {
                                if (concurrentHashMap8 == null) {
                                    concurrentHashMap8 = new ConcurrentHashMap();
                                }
                                c3653i0.Y0(h10, concurrentHashMap8, P014);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zVar.f34674A0 = concurrentHashMap8;
                c3653i0.p();
                return zVar;
            case 17:
                return e(c3653i0, h10);
            case 18:
                c3653i0.h();
                ?? obj9 = new Object();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P015 = c3653i0.P0();
                    P015.getClass();
                    switch (P015.hashCode()) {
                        case -265713450:
                            if (P015.equals("username")) {
                                c14 = 0;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 3355:
                            if (P015.equals(ParameterNames.ID)) {
                                c14 = 1;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 102225:
                            if (P015.equals("geo")) {
                                c14 = 2;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 3076010:
                            if (P015.equals("data")) {
                                c14 = 3;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 3373707:
                            if (P015.equals("name")) {
                                c14 = 4;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 96619420:
                            if (P015.equals("email")) {
                                c14 = 5;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 106069776:
                            if (P015.equals("other")) {
                                c14 = 6;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 1480014044:
                            if (P015.equals("ip_address")) {
                                c14 = 7;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 1973722931:
                            if (P015.equals("segment")) {
                                c14 = '\b';
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        default:
                            c14 = '\uffff';
                            break;
                    }
                    switch (c14) {
                        case 0:
                            obj9.f34472h0 = c3653i0.X0();
                            break;
                        case 1:
                            obj9.f34471Z = c3653i0.X0();
                            break;
                        case 2:
                            obj9.f34476l0 = C3637d.g(c3653i0, h10);
                            break;
                        case 3:
                            obj9.f34477m0 = P4.a.p0((Map) c3653i0.T0());
                            break;
                        case 4:
                            obj9.f34475k0 = c3653i0.X0();
                            break;
                        case 5:
                            obj9.f34470Y = c3653i0.X0();
                            break;
                        case 6:
                            Map map6 = obj9.f34477m0;
                            if (map6 != null && !map6.isEmpty()) {
                                break;
                            } else {
                                obj9.f34477m0 = P4.a.p0((Map) c3653i0.T0());
                                break;
                            }
                            break;
                        case 7:
                            obj9.f34474j0 = c3653i0.X0();
                            break;
                        case '\b':
                            obj9.f34473i0 = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap9, P015);
                            break;
                    }
                }
                obj9.f34478n0 = concurrentHashMap9;
                c3653i0.p();
                return obj9;
            case 19:
                c3653i0.h();
                String str9 = null;
                ArrayList arrayList3 = null;
                HashMap hashMap7 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P016 = c3653i0.P0();
                    P016.getClass();
                    if (P016.equals("rendering_system")) {
                        str9 = c3653i0.X0();
                    } else if (!P016.equals("windows")) {
                        if (hashMap7 == null) {
                            hashMap7 = new HashMap();
                        }
                        c3653i0.Y0(h10, hashMap7, P016);
                    } else {
                        arrayList3 = c3653i0.w0(h10, new i(20));
                    }
                }
                c3653i0.p();
                D d12 = new D(str9, arrayList3);
                d12.f34481h0 = hashMap7;
                return d12;
            default:
                ?? obj10 = new Object();
                c3653i0.h();
                HashMap hashMap8 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P017 = c3653i0.P0();
                    P017.getClass();
                    switch (P017.hashCode()) {
                        case -1784982718:
                            if (P017.equals("rendering_system")) {
                                c15 = 0;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case -1618432855:
                            if (P017.equals("identifier")) {
                                c15 = 1;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case -1221029593:
                            if (P017.equals("height")) {
                                c15 = 2;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 120:
                            if (P017.equals("x")) {
                                c15 = 3;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 121:
                            if (P017.equals("y")) {
                                c15 = 4;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 114586:
                            if (P017.equals(ParameterNames.TAG)) {
                                c15 = 5;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 3575610:
                            if (P017.equals("type")) {
                                c15 = 6;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 92909918:
                            if (P017.equals("alpha")) {
                                c15 = 7;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 113126854:
                            if (P017.equals("width")) {
                                c15 = '\b';
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 1659526655:
                            if (P017.equals("children")) {
                                c15 = '\t';
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 1941332754:
                            if (P017.equals("visibility")) {
                                c15 = '\n';
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        default:
                            c15 = '\uffff';
                            break;
                    }
                    switch (c15) {
                        case 0:
                            obj10.f34482Y = c3653i0.X0();
                            break;
                        case 1:
                            obj10.f34484h0 = c3653i0.X0();
                            break;
                        case 2:
                            obj10.f34487k0 = c3653i0.d0();
                            break;
                        case 3:
                            obj10.f34488l0 = c3653i0.d0();
                            break;
                        case 4:
                            obj10.f34489m0 = c3653i0.d0();
                            break;
                        case 5:
                            obj10.f34485i0 = c3653i0.X0();
                            break;
                        case 6:
                            obj10.f34483Z = c3653i0.X0();
                            break;
                        case 7:
                            obj10.f34491o0 = c3653i0.d0();
                            break;
                        case '\b':
                            obj10.f34486j0 = c3653i0.d0();
                            break;
                        case '\t':
                            obj10.f34492p0 = c3653i0.w0(h10, this);
                            break;
                        case '\n':
                            obj10.f34490n0 = c3653i0.X0();
                            break;
                        default:
                            if (hashMap8 == null) {
                                hashMap8 = new HashMap();
                            }
                            c3653i0.Y0(h10, hashMap8, P017);
                            break;
                    }
                }
                c3653i0.p();
                obj10.f34493q0 = hashMap8;
                return obj10;
        }
    }
}
