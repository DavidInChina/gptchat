package io.sentry;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.protocol.C3674a;
import io.sentry.protocol.C3675b;
import io.sentry.protocol.C3676c;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC3678e;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import livekit.org.webrtc.WebrtcBuildVersion;
import xe.C6431t;

/* renamed from: io.sentry.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3637d implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34317a;

    public /* synthetic */ C3637d(int i10) {
        this.f34317a = i10;
    }

    public static A1 b(C3653i0 c3653i0, H h10) {
        String str;
        c3653i0.h();
        String str2 = null;
        io.sentry.protocol.s sVar = null;
        B1 b1 = null;
        B1 b12 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String str3 = null;
        C1 c12 = null;
        String str4 = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -2011840976:
                    if (P02.equals("span_id")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1757797477:
                    if (P02.equals("parent_span_id")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1724546052:
                    if (P02.equals("description")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1008619738:
                    if (P02.equals("origin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -892481550:
                    if (P02.equals("status")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3553:
                    if (P02.equals("op")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3552281:
                    if (P02.equals("tags")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1270300245:
                    if (P02.equals("trace_id")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b1 = new B1(c3653i0.W0());
                    break;
                case 1:
                    b12 = (B1) c3653i0.U0(h10, new C3637d(12));
                    break;
                case 2:
                    str3 = c3653i0.W0();
                    break;
                case 3:
                    str4 = c3653i0.W0();
                    break;
                case 4:
                    c12 = (C1) c3653i0.U0(h10, new C3637d(13));
                    break;
                case 5:
                    str2 = c3653i0.W0();
                    break;
                case 6:
                    concurrentHashMap2 = P4.a.p0((Map) c3653i0.T0());
                    break;
                case 7:
                    sVar = new io.sentry.protocol.s(c3653i0.W0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        if (sVar != null) {
            if (b1 != null) {
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                A1 a12 = new A1(sVar, b1, str, b12, null);
                a12.f33719k0 = str3;
                a12.f33720l0 = c12;
                a12.f33722n0 = str4;
                if (concurrentHashMap2 != null) {
                    a12.f33721m0 = concurrentHashMap2;
                }
                a12.f33723o0 = concurrentHashMap;
                c3653i0.p();
                return a12;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"span_id\"");
            h10.d(EnumC3642e1.ERROR, "Missing required field \"span_id\"", illegalStateException);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
        h10.d(EnumC3642e1.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
        throw illegalStateException2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.a, java.lang.Object] */
    public static C3674a c(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -1898053579:
                    if (P02.equals("device_app_hash")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1524619986:
                    if (P02.equals("view_names")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -901870406:
                    if (P02.equals("app_version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -650544995:
                    if (P02.equals("in_foreground")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -470395285:
                    if (P02.equals("build_type")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 746297735:
                    if (P02.equals("app_identifier")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 791585128:
                    if (P02.equals("app_start_time")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1133704324:
                    if (P02.equals("permissions")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1167648233:
                    if (P02.equals("app_name")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1826866896:
                    if (P02.equals("app_build")) {
                        c10 = '\t';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34496h0 = c3653i0.X0();
                    break;
                case 1:
                    List list = (List) c3653i0.T0();
                    if (list == null) {
                        break;
                    } else {
                        obj.f34502n0 = list;
                        break;
                    }
                case 2:
                    obj.f34499k0 = c3653i0.X0();
                    break;
                case 3:
                    obj.f34503o0 = c3653i0.S();
                    break;
                case 4:
                    obj.f34497i0 = c3653i0.X0();
                    break;
                case 5:
                    obj.f34494Y = c3653i0.X0();
                    break;
                case 6:
                    obj.f34495Z = c3653i0.V(h10);
                    break;
                case 7:
                    obj.f34501m0 = P4.a.p0((Map) c3653i0.T0());
                    break;
                case '\b':
                    obj.f34498j0 = c3653i0.X0();
                    break;
                case '\t':
                    obj.f34500l0 = c3653i0.X0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34504p0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.b, java.lang.Object] */
    public static C3675b d(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            if (!P02.equals("name")) {
                if (!P02.equals(ParameterNames.VERSION)) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                } else {
                    obj.f34506Z = c3653i0.X0();
                }
            } else {
                obj.f34505Y = c3653i0.X0();
            }
        }
        obj.f34507h0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    public static C3676c e(C3653i0 c3653i0, H h10) {
        C3676c c3676c = new C3676c();
        c3653i0.h();
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -1335157162:
                    if (P02.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -340323263:
                    if (P02.equals("response")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3556:
                    if (P02.equals("os")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 96801:
                    if (P02.equals("app")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 102572:
                    if (P02.equals("gpu")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 110620997:
                    if (P02.equals("trace")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 150940456:
                    if (P02.equals("browser")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1550962648:
                    if (P02.equals("runtime")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c3676c.put("device", f(c3653i0, h10));
                    break;
                case 1:
                    io.sentry.protocol.o c11 = io.sentry.protocol.i.c(c3653i0, h10);
                    synchronized (c3676c.f34508Y) {
                        c3676c.put("response", c11);
                    }
                    break;
                case 2:
                    c3676c.put("os", io.sentry.protocol.i.b(c3653i0, h10));
                    break;
                case 3:
                    c3676c.put("app", c(c3653i0, h10));
                    break;
                case 4:
                    c3676c.put("gpu", h(c3653i0, h10));
                    break;
                case 5:
                    c3676c.b(b(c3653i0, h10));
                    break;
                case 6:
                    c3676c.put("browser", d(c3653i0, h10));
                    break;
                case 7:
                    c3676c.put("runtime", io.sentry.protocol.i.d(c3653i0, h10));
                    break;
                default:
                    Object T02 = c3653i0.T0();
                    if (T02 == null) {
                        break;
                    } else {
                        c3676c.put(P02, T02);
                        break;
                    }
            }
        }
        c3653i0.p();
        return c3676c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.f, java.lang.Object] */
    public static io.sentry.protocol.f f(C3653i0 c3653i0, H h10) {
        TimeZone timeZone;
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -2076227591:
                    if (P02.equals("timezone")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2012489734:
                    if (P02.equals("boot_time")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1981332476:
                    if (P02.equals("simulator")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1969347631:
                    if (P02.equals("manufacturer")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1613589672:
                    if (P02.equals("language")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1608004830:
                    if (P02.equals("processor_count")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1439500848:
                    if (P02.equals("orientation")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1410521534:
                    if (P02.equals("battery_temperature")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -1281860764:
                    if (P02.equals("family")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -1097462182:
                    if (P02.equals("locale")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case -1012222381:
                    if (P02.equals("online")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case -877252910:
                    if (P02.equals("battery_level")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -619038223:
                    if (P02.equals("model_id")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case -568274923:
                    if (P02.equals("screen_density")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case -417046774:
                    if (P02.equals("screen_dpi")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case -136523212:
                    if (P02.equals("free_memory")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 3355:
                    if (P02.equals(ParameterNames.ID)) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 3373707:
                    if (P02.equals("name")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 59142220:
                    if (P02.equals("low_memory")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 93076189:
                    if (P02.equals("archs")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 93997959:
                    if (P02.equals("brand")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case 104069929:
                    if (P02.equals("model")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case 115746789:
                    if (P02.equals("cpu_description")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case 244497903:
                    if (P02.equals("processor_frequency")) {
                        c10 = 23;
                        break;
                    }
                    break;
                case 731866107:
                    if (P02.equals("connection_type")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case 817830969:
                    if (P02.equals("screen_width_pixels")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case 823882553:
                    if (P02.equals("external_storage_size")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case 897428293:
                    if (P02.equals("storage_size")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case 1331465768:
                    if (P02.equals("usable_memory")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case 1418777727:
                    if (P02.equals("memory_size")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case 1436115569:
                    if (P02.equals("charging")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case 1450613660:
                    if (P02.equals("external_free_storage")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case 1524159400:
                    if (P02.equals("free_storage")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case 1556284978:
                    if (P02.equals("screen_height_pixels")) {
                        c10 = '!';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NULL) {
                        c3653i0.S0();
                    } else {
                        try {
                            timeZone = DesugarTimeZone.getTimeZone(c3653i0.W0());
                        } catch (Exception e10) {
                            h10.d(EnumC3642e1.ERROR, "Error when deserializing TimeZone", e10);
                        }
                        obj.f34516E0 = timeZone;
                        break;
                    }
                    timeZone = null;
                    obj.f34516E0 = timeZone;
                case 1:
                    if (c3653i0.a1() != io.sentry.vendor.gson.stream.a.STRING) {
                        break;
                    } else {
                        obj.f34515D0 = c3653i0.V(h10);
                        break;
                    }
                case 2:
                    obj.f34537q0 = c3653i0.S();
                    break;
                case 3:
                    obj.f34527Z = c3653i0.X0();
                    break;
                case 4:
                    obj.f34518G0 = c3653i0.X0();
                    break;
                case 5:
                    obj.f34522K0 = c3653i0.u0();
                    break;
                case 6:
                    obj.f34536p0 = (EnumC3678e) c3653i0.U0(h10, new C3637d(27));
                    break;
                case 7:
                    obj.f34521J0 = c3653i0.f0();
                    break;
                case '\b':
                    obj.f34529i0 = c3653i0.X0();
                    break;
                case '\t':
                    obj.f34519H0 = c3653i0.X0();
                    break;
                case '\n':
                    obj.f34535o0 = c3653i0.S();
                    break;
                case 11:
                    obj.f34533m0 = c3653i0.f0();
                    break;
                case '\f':
                    obj.f34531k0 = c3653i0.X0();
                    break;
                case '\r':
                    obj.f34513B0 = c3653i0.f0();
                    break;
                case 14:
                    obj.f34514C0 = c3653i0.u0();
                    break;
                case 15:
                    obj.f34539s0 = c3653i0.F0();
                    break;
                case 16:
                    obj.f34517F0 = c3653i0.X0();
                    break;
                case 17:
                    obj.f34526Y = c3653i0.X0();
                    break;
                case 18:
                    obj.f34541u0 = c3653i0.S();
                    break;
                case 19:
                    List list = (List) c3653i0.T0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        obj.f34532l0 = strArr;
                        break;
                    }
                case 20:
                    obj.f34528h0 = c3653i0.X0();
                    break;
                case 21:
                    obj.f34530j0 = c3653i0.X0();
                    break;
                case 22:
                    obj.f34524M0 = c3653i0.X0();
                    break;
                case 23:
                    obj.f34523L0 = c3653i0.d0();
                    break;
                case 24:
                    obj.f34520I0 = c3653i0.X0();
                    break;
                case 25:
                    obj.f34546z0 = c3653i0.u0();
                    break;
                case 26:
                    obj.f34544x0 = c3653i0.F0();
                    break;
                case 27:
                    obj.f34542v0 = c3653i0.F0();
                    break;
                case 28:
                    obj.f34540t0 = c3653i0.F0();
                    break;
                case 29:
                    obj.f34538r0 = c3653i0.F0();
                    break;
                case 30:
                    obj.f34534n0 = c3653i0.S();
                    break;
                case 31:
                    obj.f34545y0 = c3653i0.F0();
                    break;
                case ' ':
                    obj.f34543w0 = c3653i0.F0();
                    break;
                case '!':
                    obj.f34512A0 = c3653i0.u0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34525N0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.protocol.g] */
    public static io.sentry.protocol.g g(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -934795532:
                    if (P02.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3053931:
                    if (P02.equals("city")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1481071862:
                    if (P02.equals("country_code")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34549h0 = c3653i0.X0();
                    break;
                case 1:
                    obj.f34547Y = c3653i0.X0();
                    break;
                case 2:
                    obj.f34548Z = c3653i0.X0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34550i0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.protocol.h] */
    public static io.sentry.protocol.h h(C3653i0 c3653i0, H h10) {
        c3653i0.h();
        ?? obj = new Object();
        ConcurrentHashMap concurrentHashMap = null;
        while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
            String P02 = c3653i0.P0();
            P02.getClass();
            char c10 = '\uffff';
            switch (P02.hashCode()) {
                case -1421884745:
                    if (P02.equals("npot_support")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1085970574:
                    if (P02.equals("vendor_id")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1009234244:
                    if (P02.equals("multi_threaded_rendering")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (P02.equals(ParameterNames.ID)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3373707:
                    if (P02.equals("name")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 59480866:
                    if (P02.equals("vendor_name")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 351608024:
                    if (P02.equals(ParameterNames.VERSION)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 967446079:
                    if (P02.equals("api_type")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1418777727:
                    if (P02.equals("memory_size")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f34559n0 = c3653i0.X0();
                    break;
                case 1:
                    obj.f34553h0 = c3653i0.X0();
                    break;
                case 2:
                    obj.f34557l0 = c3653i0.S();
                    break;
                case 3:
                    obj.f34552Z = c3653i0.u0();
                    break;
                case 4:
                    obj.f34551Y = c3653i0.X0();
                    break;
                case 5:
                    obj.f34554i0 = c3653i0.X0();
                    break;
                case 6:
                    obj.f34558m0 = c3653i0.X0();
                    break;
                case 7:
                    obj.f34556k0 = c3653i0.X0();
                    break;
                case '\b':
                    obj.f34555j0 = c3653i0.u0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3653i0.Y0(h10, concurrentHashMap, P02);
                    break;
            }
        }
        obj.f34560o0 = concurrentHashMap;
        c3653i0.p();
        return obj;
    }

    public static IllegalStateException i(String str, H h10) {
        String A10 = android.gov.nist.core.a.A("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(A10);
        h10.d(EnumC3642e1.ERROR, A10, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(String str, H h10) {
        String A10 = android.gov.nist.core.a.A("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(A10);
        h10.d(EnumC3642e1.ERROR, A10, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException k(String str, H h10) {
        String A10 = android.gov.nist.core.a.A("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(A10);
        h10.d(EnumC3642e1.ERROR, A10, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException l(String str, H h10) {
        String A10 = android.gov.nist.core.a.A("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(A10);
        h10.d(EnumC3642e1.ERROR, A10, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x07a7, code lost:
        r54.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07ab, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:1092:0x07c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07d5 A[LOOP:11: B:367:0x06dd->B:445:0x07d5, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v19, types: [io.sentry.M0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.sentry.F1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v84, types: [io.sentry.protocol.d, java.lang.Object] */
    @Override // io.sentry.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3653i0 c3653i0, H h10) {
        char c10;
        String str;
        Object obj;
        Object obj2;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        String str2;
        Object obj3;
        Object obj4;
        char c17;
        String str3;
        char c18;
        String str4;
        String str5;
        char c19;
        String str6;
        ConcurrentHashMap concurrentHashMap;
        String str7;
        Object obj5;
        char c20;
        String str8;
        int i10;
        int i11;
        int i12;
        int i13;
        String str9;
        String str10;
        String str11;
        String str12;
        char c21;
        char c22;
        char c23;
        char c24;
        C3653i0 c3653i02 = c3653i0;
        String str13 = "transaction";
        String str14 = "type";
        Object obj6 = "level";
        Object obj7 = "message";
        int i14 = this.f34317a;
        String str15 = "errors";
        String str16 = "status";
        String str17 = DiagnosticsEntry.Event.TIMESTAMP_KEY;
        Object obj8 = "environment";
        String str18 = "release";
        switch (i14) {
            case 0:
                C3653i0 c3653i03 = c3653i02;
                Object obj9 = obj7;
                c3653i0.h();
                Date A10 = r.f.A();
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                String str19 = null;
                String str20 = null;
                String str21 = null;
                EnumC3642e1 enumC3642e1 = null;
                ConcurrentHashMap concurrentHashMap3 = null;
                Date date = A10;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P02 = c3653i0.P0();
                    P02.getClass();
                    switch (P02.hashCode()) {
                        case 3076010:
                            if (P02.equals("data")) {
                                c10 = 0;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 3575610:
                            if (P02.equals(str14)) {
                                c10 = 1;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 50511102:
                            if (P02.equals("category")) {
                                c10 = 2;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 55126294:
                            if (P02.equals(str17)) {
                                c10 = 3;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 102865796:
                            if (P02.equals(obj6)) {
                                c10 = 4;
                                break;
                            }
                            c10 = '\uffff';
                            break;
                        case 954925063:
                            if (P02.equals(obj9)) {
                                c10 = 5;
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
                            str = str14;
                            obj = obj9;
                            ConcurrentHashMap p02 = P4.a.p0((Map) c3653i0.T0());
                            if (p02 != null) {
                                concurrentHashMap2 = p02;
                                continue;
                            }
                            c3653i03 = c3653i0;
                            str14 = str;
                            obj9 = obj;
                        case 1:
                            str = str14;
                            obj = obj9;
                            str20 = c3653i0.X0();
                            continue;
                            c3653i03 = c3653i0;
                            str14 = str;
                            obj9 = obj;
                        case 2:
                            str = str14;
                            obj = obj9;
                            str21 = c3653i0.X0();
                            continue;
                            c3653i03 = c3653i0;
                            str14 = str;
                            obj9 = obj;
                        case 3:
                            str = str14;
                            obj = obj9;
                            Date V10 = c3653i0.V(h10);
                            if (V10 != null) {
                                date = V10;
                            } else {
                                continue;
                            }
                            c3653i03 = c3653i0;
                            str14 = str;
                            obj9 = obj;
                        case 4:
                            try {
                                enumC3642e1 = EnumC3642e1.valueOf(c3653i0.W0().toUpperCase(Locale.ROOT));
                                break;
                            } catch (Exception e10) {
                                str = str14;
                                obj = obj9;
                                h10.b(EnumC3642e1.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                                break;
                            }
                        case 5:
                            str19 = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            c3653i03.Y0(h10, concurrentHashMap3, P02);
                            break;
                    }
                    str = str14;
                    obj = obj9;
                    c3653i03 = c3653i0;
                    str14 = str;
                    obj9 = obj;
                }
                C3640e c3640e = new C3640e(date);
                c3640e.f34319Z = str19;
                c3640e.f34320h0 = str20;
                c3640e.f34321i0 = concurrentHashMap2;
                c3640e.f34322j0 = str21;
                c3640e.f34323k0 = enumC3642e1;
                c3640e.f34324l0 = concurrentHashMap3;
                c3653i0.p();
                return c3640e;
            case 1:
                char c25 = 20;
                c3653i0.h();
                File file = new File("dummy");
                ArrayList arrayList = new ArrayList();
                io.sentry.protocol.s sVar = io.sentry.protocol.s.f34619Z;
                String sVar2 = sVar.toString();
                B1 b1 = B1.f33752Z;
                new ConcurrentHashMap();
                Ad.l.Z0("spanId is required", b1);
                B0 b02 = new B0(file, arrayList, "", sVar2, sVar.toString(), WebrtcBuildVersion.maint_version, 0, "", new CallableC3688v(3), null, null, null, null, null, null, null, null, "normal", new HashMap());
                ConcurrentHashMap concurrentHashMap4 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P03 = c3653i0.P0();
                    P03.getClass();
                    switch (P03.hashCode()) {
                        case -2133529830:
                            obj2 = obj8;
                            if (P03.equals("device_manufacturer")) {
                                c11 = 0;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1981468849:
                            obj2 = obj8;
                            if (P03.equals("android_api_level")) {
                                c11 = 1;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1430655860:
                            obj2 = obj8;
                            if (P03.equals("build_id")) {
                                c11 = 2;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1172160413:
                            obj2 = obj8;
                            if (P03.equals("device_locale")) {
                                c11 = 3;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -1102636175:
                            obj2 = obj8;
                            if (P03.equals("profile_id")) {
                                c11 = 4;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -716656436:
                            obj2 = obj8;
                            if (P03.equals("device_os_build_number")) {
                                c11 = 5;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -591076352:
                            obj2 = obj8;
                            if (P03.equals("device_model")) {
                                c11 = 6;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -512511455:
                            obj2 = obj8;
                            if (P03.equals("device_is_emulator")) {
                                c11 = 7;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -478065584:
                            obj2 = obj8;
                            if (P03.equals("duration_ns")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -362243017:
                            obj2 = obj8;
                            if (P03.equals("measurements")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -332426004:
                            obj2 = obj8;
                            if (P03.equals("device_physical_memory_bytes")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -212264198:
                            obj2 = obj8;
                            if (P03.equals("device_cpu_frequencies")) {
                                c11 = 11;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -102985484:
                            obj2 = obj8;
                            if (P03.equals("version_code")) {
                                c11 = '\f';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -102670958:
                            obj2 = obj8;
                            if (P03.equals("version_name")) {
                                c11 = '\r';
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case -85904877:
                            obj2 = obj8;
                            if (P03.equals(obj2)) {
                                c11 = 14;
                                break;
                            }
                            c11 = '\uffff';
                            break;
                        case 508853068:
                            if (P03.equals("transaction_name")) {
                                c11 = 15;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 796476189:
                            if (P03.equals("device_os_name")) {
                                obj2 = obj8;
                                c11 = 16;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                            break;
                        case 839674195:
                            if (P03.equals("architecture")) {
                                c12 = 17;
                                c11 = c12;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1010584092:
                            if (P03.equals("transaction_id")) {
                                c11 = 18;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1052553990:
                            if (P03.equals("device_os_version")) {
                                obj2 = obj8;
                                c11 = 19;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                            break;
                        case 1163928186:
                            if (P03.equals("truncation_reason")) {
                                c11 = c25;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1270300245:
                            if (P03.equals("trace_id")) {
                                c12 = 21;
                                c11 = c12;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1874684019:
                            if (P03.equals("platform")) {
                                c12 = 22;
                                c11 = c12;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1953158756:
                            if (P03.equals("sampled_profile")) {
                                c12 = 23;
                                c11 = c12;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        case 1954122069:
                            if (P03.equals("transactions")) {
                                c11 = 24;
                                obj2 = obj8;
                                break;
                            }
                            c11 = '\uffff';
                            obj2 = obj8;
                        default:
                            c11 = '\uffff';
                            obj2 = obj8;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            String X02 = c3653i0.X0();
                            if (X02 == null) {
                                break;
                            } else {
                                b02.f33735j0 = X02;
                                break;
                            }
                        case 1:
                            Integer u02 = c3653i0.u0();
                            if (u02 == null) {
                                break;
                            } else {
                                b02.f33733h0 = u02.intValue();
                                break;
                            }
                        case 2:
                            String X03 = c3653i0.X0();
                            if (X03 == null) {
                                break;
                            } else {
                                b02.f33745t0 = X03;
                                break;
                            }
                        case 3:
                            String X04 = c3653i0.X0();
                            if (X04 == null) {
                                break;
                            } else {
                                b02.f33734i0 = X04;
                                break;
                            }
                        case 4:
                            String X05 = c3653i0.X0();
                            if (X05 == null) {
                                break;
                            } else {
                                b02.f33725B0 = X05;
                                break;
                            }
                        case 5:
                            String X06 = c3653i0.X0();
                            if (X06 == null) {
                                break;
                            } else {
                                b02.f33737l0 = X06;
                                break;
                            }
                        case 6:
                            String X07 = c3653i0.X0();
                            if (X07 == null) {
                                break;
                            } else {
                                b02.f33736k0 = X07;
                                break;
                            }
                        case 7:
                            Boolean S = c3653i0.S();
                            if (S == null) {
                                break;
                            } else {
                                b02.f33740o0 = S.booleanValue();
                                break;
                            }
                        case '\b':
                            String X08 = c3653i0.X0();
                            if (X08 == null) {
                                break;
                            } else {
                                b02.f33748w0 = X08;
                                break;
                            }
                        case '\t':
                            HashMap H02 = c3653i02.H0(h10, new C3637d(19));
                            if (H02 == null) {
                                break;
                            } else {
                                b02.f33728E0.putAll(H02);
                                break;
                            }
                        case '\n':
                            String X09 = c3653i0.X0();
                            if (X09 == null) {
                                break;
                            } else {
                                b02.f33743r0 = X09;
                                break;
                            }
                        case 11:
                            List list = (List) c3653i0.T0();
                            if (list == null) {
                                break;
                            } else {
                                b02.f33742q0 = list;
                                break;
                            }
                        case '\f':
                            String X010 = c3653i0.X0();
                            if (X010 == null) {
                                break;
                            } else {
                                b02.f33749x0 = X010;
                                break;
                            }
                        case '\r':
                            String X011 = c3653i0.X0();
                            if (X011 == null) {
                                break;
                            } else {
                                b02.f33750y0 = X011;
                                break;
                            }
                        case 14:
                            String X012 = c3653i0.X0();
                            if (X012 == null) {
                                break;
                            } else {
                                b02.f33726C0 = X012;
                                break;
                            }
                        case 15:
                            String X013 = c3653i0.X0();
                            if (X013 == null) {
                                break;
                            } else {
                                b02.f33747v0 = X013;
                                break;
                            }
                        case 16:
                            String X014 = c3653i0.X0();
                            if (X014 == null) {
                                break;
                            } else {
                                b02.f33738m0 = X014;
                                break;
                            }
                        case 17:
                            String X015 = c3653i0.X0();
                            if (X015 == null) {
                                break;
                            } else {
                                b02.f33741p0 = X015;
                                break;
                            }
                        case 18:
                            String X016 = c3653i0.X0();
                            if (X016 == null) {
                                break;
                            } else {
                                b02.f33751z0 = X016;
                                break;
                            }
                        case 19:
                            String X017 = c3653i0.X0();
                            if (X017 == null) {
                                break;
                            } else {
                                b02.f33739n0 = X017;
                                break;
                            }
                        case 20:
                            String X018 = c3653i0.X0();
                            if (X018 == null) {
                                break;
                            } else {
                                b02.f33727D0 = X018;
                                break;
                            }
                        case 21:
                            String X019 = c3653i0.X0();
                            if (X019 == null) {
                                break;
                            } else {
                                b02.f33724A0 = X019;
                                break;
                            }
                        case 22:
                            String X020 = c3653i0.X0();
                            if (X020 == null) {
                                break;
                            } else {
                                b02.f33744s0 = X020;
                                break;
                            }
                        case 23:
                            String X021 = c3653i0.X0();
                            if (X021 == null) {
                                break;
                            } else {
                                b02.f33729F0 = X021;
                                break;
                            }
                        case 24:
                            ArrayList w02 = c3653i02.w0(h10, new C3637d(2));
                            if (w02 == null) {
                                break;
                            } else {
                                b02.f33746u0.addAll(w02);
                                break;
                            }
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            c3653i02.Y0(h10, concurrentHashMap4, P03);
                            break;
                    }
                    obj8 = obj2;
                    c25 = 20;
                }
                b02.f33730G0 = concurrentHashMap4;
                c3653i0.p();
                return b02;
            case 2:
                ConcurrentHashMap concurrentHashMap5 = null;
                c3653i0.h();
                C0 c02 = new C0(C3687u0.f34769a, 0L, 0L);
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P04 = c3653i0.P0();
                    P04.getClass();
                    switch (P04.hashCode()) {
                        case -112372011:
                            if (P04.equals("relative_start_ns")) {
                                c13 = 0;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case -84607876:
                            if (P04.equals("relative_end_ns")) {
                                c13 = 1;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 3355:
                            if (P04.equals(ParameterNames.ID)) {
                                c13 = 2;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 3373707:
                            if (P04.equals("name")) {
                                c13 = 3;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 1270300245:
                            if (P04.equals("trace_id")) {
                                c13 = 4;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 1566648660:
                            if (P04.equals("relative_cpu_end_ms")) {
                                c13 = 5;
                                break;
                            }
                            c13 = '\uffff';
                            break;
                        case 1902256621:
                            if (P04.equals("relative_cpu_start_ms")) {
                                c13 = 6;
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
                            Long F02 = c3653i0.F0();
                            if (F02 == null) {
                                break;
                            } else {
                                c02.f33757i0 = F02;
                                break;
                            }
                        case 1:
                            Long F03 = c3653i0.F0();
                            if (F03 == null) {
                                break;
                            } else {
                                c02.f33758j0 = F03;
                                break;
                            }
                        case 2:
                            String X022 = c3653i0.X0();
                            if (X022 == null) {
                                break;
                            } else {
                                c02.f33754Y = X022;
                                break;
                            }
                        case 3:
                            String X023 = c3653i0.X0();
                            if (X023 == null) {
                                break;
                            } else {
                                c02.f33756h0 = X023;
                                break;
                            }
                        case 4:
                            String X024 = c3653i0.X0();
                            if (X024 == null) {
                                break;
                            } else {
                                c02.f33755Z = X024;
                                break;
                            }
                        case 5:
                            Long F04 = c3653i0.F0();
                            if (F04 == null) {
                                break;
                            } else {
                                c02.f33760l0 = F04;
                                break;
                            }
                        case 6:
                            Long F05 = c3653i0.F0();
                            if (F05 == null) {
                                break;
                            } else {
                                c02.f33759k0 = F05;
                                break;
                            }
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c3653i02.Y0(h10, concurrentHashMap5, P04);
                            break;
                    }
                }
                c02.f33761m0 = concurrentHashMap5;
                c3653i0.p();
                return c02;
            case 3:
                c3653i0.h();
                ?? obj10 = new Object();
                obj10.f33822h0 = false;
                ConcurrentHashMap concurrentHashMap6 = null;
                obj10.f33823i0 = null;
                obj10.f33820Y = false;
                obj10.f33821Z = null;
                obj10.f33824j0 = null;
                obj10.f33825k0 = false;
                obj10.f33826l0 = 0;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P05 = c3653i0.P0();
                    P05.getClass();
                    switch (P05.hashCode()) {
                        case -566246656:
                            if (P05.equals("trace_sampled")) {
                                c14 = 0;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case -450071601:
                            if (P05.equals("profiling_traces_dir_path")) {
                                c14 = 1;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case -116896685:
                            if (P05.equals("is_profiling_enabled")) {
                                c14 = 2;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case -69617820:
                            if (P05.equals("profile_sampled")) {
                                c14 = 3;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 1583866442:
                            if (P05.equals("profiling_traces_hz")) {
                                c14 = 4;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 1653938779:
                            if (P05.equals("trace_sample_rate")) {
                                c14 = 5;
                                break;
                            }
                            c14 = '\uffff';
                            break;
                        case 2140552383:
                            if (P05.equals("profile_sample_rate")) {
                                c14 = 6;
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
                            Boolean S10 = c3653i0.S();
                            if (S10 == null) {
                                break;
                            } else {
                                obj10.f33822h0 = S10.booleanValue();
                                break;
                            }
                        case 1:
                            String X025 = c3653i0.X0();
                            if (X025 == null) {
                                break;
                            } else {
                                obj10.f33824j0 = X025;
                                break;
                            }
                        case 2:
                            Boolean S11 = c3653i0.S();
                            if (S11 == null) {
                                break;
                            } else {
                                obj10.f33825k0 = S11.booleanValue();
                                break;
                            }
                        case 3:
                            Boolean S12 = c3653i0.S();
                            if (S12 == null) {
                                break;
                            } else {
                                obj10.f33820Y = S12.booleanValue();
                                break;
                            }
                        case 4:
                            Integer u03 = c3653i0.u0();
                            if (u03 == null) {
                                break;
                            } else {
                                obj10.f33826l0 = u03.intValue();
                                break;
                            }
                        case 5:
                            Double d02 = c3653i0.d0();
                            if (d02 == null) {
                                break;
                            } else {
                                obj10.f33823i0 = d02;
                                break;
                            }
                        case 6:
                            Double d03 = c3653i0.d0();
                            if (d03 == null) {
                                break;
                            } else {
                                obj10.f33821Z = d03;
                                break;
                            }
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            c3653i02.Y0(h10, concurrentHashMap6, P05);
                            break;
                    }
                }
                obj10.f33827m0 = concurrentHashMap6;
                c3653i0.p();
                return obj10;
            case 4:
                c3653i0.h();
                io.sentry.protocol.q qVar = null;
                G1 g1 = null;
                io.sentry.protocol.s sVar3 = null;
                Date date2 = null;
                HashMap hashMap = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P06 = c3653i0.P0();
                    P06.getClass();
                    switch (P06.hashCode()) {
                        case 113722:
                            if (P06.equals("sdk")) {
                                c15 = 0;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 110620997:
                            if (P06.equals("trace")) {
                                c15 = 1;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 278118624:
                            if (P06.equals("event_id")) {
                                c15 = 2;
                                break;
                            }
                            c15 = '\uffff';
                            break;
                        case 1980389946:
                            if (P06.equals("sent_at")) {
                                c15 = 3;
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
                            qVar = (io.sentry.protocol.q) c3653i02.U0(h10, new io.sentry.protocol.i(7));
                            continue;
                        case 1:
                            g1 = (G1) c3653i02.U0(h10, new C3637d(14));
                            break;
                        case 2:
                            sVar3 = (io.sentry.protocol.s) c3653i02.U0(h10, new io.sentry.protocol.i(9));
                            break;
                        case 3:
                            date2 = c3653i0.V(h10);
                            break;
                        default:
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            c3653i02.Y0(h10, hashMap, P06);
                            break;
                    }
                }
                U0 u04 = new U0(sVar3, qVar, g1);
                u04.f33869i0 = date2;
                u04.f33870j0 = hashMap;
                c3653i0.p();
                return u04;
            case 5:
                c3653i0.h();
                HashMap hashMap2 = null;
                EnumC3639d1 enumC3639d1 = null;
                int i15 = 0;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P07 = c3653i0.P0();
                    P07.getClass();
                    switch (P07.hashCode()) {
                        case -1106363674:
                            if (P07.equals("length")) {
                                c16 = 0;
                                break;
                            }
                            c16 = '\uffff';
                            break;
                        case -734768633:
                            if (P07.equals("filename")) {
                                c16 = 1;
                                break;
                            }
                            c16 = '\uffff';
                            break;
                        case -672977706:
                            if (P07.equals("attachment_type")) {
                                c16 = 2;
                                break;
                            }
                            c16 = '\uffff';
                            break;
                        case 3575610:
                            if (P07.equals(str14)) {
                                c16 = 3;
                                break;
                            }
                            c16 = '\uffff';
                            break;
                        case 831846208:
                            if (P07.equals("content_type")) {
                                c16 = 4;
                                break;
                            }
                            c16 = '\uffff';
                            break;
                        default:
                            c16 = '\uffff';
                            break;
                    }
                    switch (c16) {
                        case 0:
                            i15 = c3653i0.m0();
                            break;
                        case 1:
                            str23 = c3653i0.X0();
                            break;
                        case 2:
                            str24 = c3653i0.X0();
                            break;
                        case 3:
                            enumC3639d1 = (EnumC3639d1) c3653i02.U0(h10, new C3637d(7));
                            break;
                        case 4:
                            str22 = c3653i0.X0();
                            break;
                        default:
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            c3653i02.Y0(h10, hashMap2, P07);
                            break;
                    }
                }
                if (enumC3639d1 != null) {
                    Y0 y02 = new Y0(enumC3639d1, i15, str22, str23, str24);
                    y02.f33894l0 = hashMap2;
                    c3653i0.p();
                    return y02;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                h10.d(EnumC3642e1.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            case 6:
                String str25 = str17;
                String str26 = str13;
                c3653i0.h();
                Z0 z02 = new Z0();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P08 = c3653i0.P0();
                    P08.getClass();
                    switch (P08.hashCode()) {
                        case -1375934236:
                            str3 = str26;
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            if (P08.equals("fingerprint")) {
                                c17 = 0;
                                break;
                            }
                            c17 = '\uffff';
                            break;
                        case -1337936983:
                            str3 = str26;
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            if (P08.equals("threads")) {
                                c17 = 1;
                                break;
                            }
                            c17 = '\uffff';
                            break;
                        case -1097337456:
                            str3 = str26;
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            if (P08.equals("logger")) {
                                c17 = 2;
                                break;
                            }
                            c17 = '\uffff';
                            break;
                        case 55126294:
                            str3 = str26;
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            if (P08.equals(str2)) {
                                c17 = 3;
                                break;
                            }
                            c17 = '\uffff';
                            break;
                        case 102865796:
                            str3 = str26;
                            obj3 = obj6;
                            obj4 = obj7;
                            if (P08.equals(obj3)) {
                                str2 = str25;
                                c17 = 4;
                                break;
                            } else {
                                c17 = '\uffff';
                                str2 = str25;
                                break;
                            }
                        case 954925063:
                            str3 = str26;
                            obj4 = obj7;
                            c17 = !P08.equals(obj4) ? '\uffff' : (char) 5;
                            obj3 = obj6;
                            str2 = str25;
                            break;
                        case 1227433863:
                            str3 = str26;
                            if (P08.equals("modules")) {
                                obj3 = obj6;
                                obj4 = obj7;
                                str2 = str25;
                                c17 = 6;
                                break;
                            }
                            c17 = '\uffff';
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            break;
                        case 1481625679:
                            str3 = str26;
                            if (P08.equals("exception")) {
                                obj3 = obj6;
                                obj4 = obj7;
                                str2 = str25;
                                c17 = 7;
                                break;
                            }
                            c17 = '\uffff';
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            break;
                        case 2141246174:
                            str3 = str26;
                            if (P08.equals(str3)) {
                                obj3 = obj6;
                                obj4 = obj7;
                                str2 = str25;
                                c17 = '\b';
                                break;
                            }
                            c17 = '\uffff';
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            break;
                        default:
                            str3 = str26;
                            c17 = '\uffff';
                            obj3 = obj6;
                            obj4 = obj7;
                            str2 = str25;
                            break;
                    }
                    switch (c17) {
                        case 0:
                            List list2 = (List) c3653i0.T0();
                            if (list2 != null) {
                                z02.f33896B0 = list2;
                                continue;
                            }
                            str26 = str3;
                            obj7 = obj4;
                            obj6 = obj3;
                            str25 = str2;
                        case 1:
                            c3653i0.h();
                            c3653i0.P0();
                            z02.f33902x0 = new C4.c(2, c3653i02.w0(h10, new io.sentry.protocol.i(15)));
                            c3653i0.p();
                            continue;
                            str26 = str3;
                            obj7 = obj4;
                            obj6 = obj3;
                            str25 = str2;
                        case 2:
                            z02.f33901w0 = c3653i0.X0();
                            break;
                        case 3:
                            Date V11 = c3653i0.V(h10);
                            if (V11 != null) {
                                z02.f33899u0 = V11;
                                break;
                            }
                            break;
                        case 4:
                            z02.f33904z0 = (EnumC3642e1) c3653i02.U0(h10, new C3637d(8));
                            break;
                        case 5:
                            z02.f33900v0 = (io.sentry.protocol.l) c3653i02.U0(h10, new io.sentry.protocol.i(2));
                            break;
                        case 6:
                            z02.f33898D0 = P4.a.p0((Map) c3653i0.T0());
                            break;
                        case 7:
                            c3653i0.h();
                            c3653i0.P0();
                            z02.f33903y0 = new C4.c(2, c3653i02.w0(h10, new io.sentry.protocol.i(8)));
                            c3653i0.p();
                            break;
                        case '\b':
                            z02.f33895A0 = c3653i0.X0();
                            break;
                        default:
                            if (!C6431t.k(z02, P08, c3653i02, h10)) {
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                c3653i02.Y0(h10, concurrentHashMap7, P08);
                            }
                            break;
                    }
                    str26 = str3;
                    obj7 = obj4;
                    obj6 = obj3;
                    str25 = str2;
                }
                z02.f33897C0 = concurrentHashMap7;
                c3653i0.p();
                return z02;
            case 7:
                return EnumC3639d1.valueOfLabel(c3653i0.W0().toLowerCase(Locale.ROOT));
            case 8:
                return EnumC3642e1.valueOf(c3653i0.W0().toUpperCase(Locale.ROOT));
            case 9:
                ?? obj11 = new Object();
                c3653i0.h();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P09 = c3653i0.P0();
                    P09.getClass();
                    switch (P09.hashCode()) {
                        case -1877165340:
                            if (P09.equals("package_name")) {
                                c18 = 0;
                                break;
                            }
                            c18 = '\uffff';
                            break;
                        case -1562235024:
                            if (P09.equals("thread_id")) {
                                c18 = 1;
                                break;
                            }
                            c18 = '\uffff';
                            break;
                        case -1147692044:
                            if (P09.equals("address")) {
                                c18 = 2;
                                break;
                            }
                            c18 = '\uffff';
                            break;
                        case -290474766:
                            if (P09.equals("class_name")) {
                                c18 = 3;
                                break;
                            }
                            c18 = '\uffff';
                            break;
                        case 3575610:
                            if (P09.equals(str14)) {
                                c18 = 4;
                                break;
                            }
                            c18 = '\uffff';
                            break;
                        default:
                            c18 = '\uffff';
                            break;
                    }
                    switch (c18) {
                        case 0:
                            obj11.f34337h0 = c3653i0.X0();
                            break;
                        case 1:
                            obj11.f34339j0 = c3653i0.F0();
                            break;
                        case 2:
                            obj11.f34336Z = c3653i0.X0();
                            break;
                        case 3:
                            obj11.f34338i0 = c3653i0.X0();
                            break;
                        case 4:
                            obj11.f34335Y = c3653i0.m0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            c3653i0.Y0(h10, concurrentHashMap8, P09);
                            break;
                    }
                }
                obj11.f34340k0 = concurrentHashMap8;
                c3653i0.p();
                return obj11;
            case 10:
                c3653i0.h();
                x1 x1Var = null;
                ConcurrentHashMap concurrentHashMap9 = null;
                Date date3 = null;
                Date date4 = null;
                Integer num = null;
                String str27 = null;
                UUID uuid = null;
                Boolean bool = null;
                Long l10 = null;
                Double d10 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                while (true) {
                    String str33 = str28;
                    if (c3653i0.a1() != io.sentry.vendor.gson.stream.a.NAME) {
                        ConcurrentHashMap concurrentHashMap10 = concurrentHashMap9;
                        String str34 = str16;
                        if (x1Var == null) {
                            throw i(str34, h10);
                        }
                        if (date3 == null) {
                            throw i("started", h10);
                        }
                        if (num == null) {
                            throw i(str15, h10);
                        }
                        if (str30 != null) {
                            y1 y1Var = new y1(x1Var, date3, date4, num.intValue(), str27, uuid, bool, l10, d10, str33, str32, str29, str30, str31);
                            y1Var.f34850u0 = concurrentHashMap10;
                            c3653i0.p();
                            return y1Var;
                        }
                        throw i(str18, h10);
                    }
                    String P010 = c3653i0.P0();
                    P010.getClass();
                    switch (P010.hashCode()) {
                        case -1992012396:
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                            if (P010.equals("duration")) {
                                c19 = 0;
                                break;
                            }
                            c19 = '\uffff';
                            break;
                        case -1897185151:
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                            if (P010.equals("started")) {
                                c19 = 1;
                                break;
                            }
                            c19 = '\uffff';
                            break;
                        case -1294635157:
                            String str35 = str16;
                            str4 = str17;
                            str6 = str15;
                            if (P010.equals(str6)) {
                                str5 = str35;
                                c19 = 2;
                                break;
                            } else {
                                str5 = str35;
                                c19 = '\uffff';
                                break;
                            }
                        case -892481550:
                            String str36 = str16;
                            str4 = str17;
                            if (P010.equals(str36)) {
                                str5 = str36;
                                str6 = str15;
                                c19 = 3;
                                break;
                            } else {
                                str5 = str36;
                                c19 = '\uffff';
                                str6 = str15;
                                break;
                            }
                        case 99455:
                            if (P010.equals("did")) {
                                str5 = str16;
                                c19 = 4;
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 113759:
                            if (P010.equals("seq")) {
                                c19 = 5;
                                str5 = str16;
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 113870:
                            if (P010.equals("sid")) {
                                str5 = str16;
                                c19 = 6;
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 3237136:
                            if (P010.equals("init")) {
                                str5 = str16;
                                c19 = 7;
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 55126294:
                            if (P010.equals(str17)) {
                                str5 = str16;
                                c19 = '\b';
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 93152418:
                            if (P010.equals("attrs")) {
                                str5 = str16;
                                c19 = '\t';
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        case 213717026:
                            if (P010.equals("abnormal_mechanism")) {
                                str5 = str16;
                                c19 = '\n';
                                str4 = str17;
                                str6 = str15;
                                break;
                            }
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                        default:
                            c19 = '\uffff';
                            str5 = str16;
                            str4 = str17;
                            str6 = str15;
                            break;
                    }
                    switch (c19) {
                        case 0:
                            str15 = str6;
                            d10 = c3653i0.d0();
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 1:
                            str15 = str6;
                            date3 = c3653i0.V(h10);
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 2:
                            str15 = str6;
                            num = c3653i0.u0();
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 3:
                            concurrentHashMap = concurrentHashMap9;
                            str15 = str6;
                            String a5 = io.sentry.util.e.a(c3653i0.X0());
                            if (a5 != null) {
                                x1Var = x1.valueOf(a5);
                            }
                            str28 = str33;
                            concurrentHashMap9 = concurrentHashMap;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 4:
                            str15 = str6;
                            str27 = c3653i0.X0();
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 5:
                            str15 = str6;
                            l10 = c3653i0.F0();
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 6:
                            concurrentHashMap = concurrentHashMap9;
                            str15 = str6;
                            try {
                                str7 = c3653i0.X0();
                            } catch (IllegalArgumentException unused) {
                                str7 = null;
                            }
                            try {
                                uuid = UUID.fromString(str7);
                                str28 = str33;
                                concurrentHashMap9 = concurrentHashMap;
                            } catch (IllegalArgumentException unused2) {
                                h10.f(EnumC3642e1.ERROR, "%s sid is not valid.", str7);
                                str28 = str33;
                                concurrentHashMap9 = concurrentHashMap;
                                c3653i02 = c3653i0;
                                str17 = str4;
                                str16 = str5;
                            }
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case 7:
                            str15 = str6;
                            bool = c3653i0.S();
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case '\b':
                            str15 = str6;
                            date4 = c3653i0.V(h10);
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        case '\t':
                            c3653i0.h();
                            concurrentHashMap = concurrentHashMap9;
                            String str37 = str32;
                            String str38 = str33;
                            while (true) {
                                String str39 = str38;
                                if (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                                    String P011 = c3653i0.P0();
                                    P011.getClass();
                                    switch (P011.hashCode()) {
                                        case -85904877:
                                            obj5 = obj8;
                                            if (P011.equals(obj5)) {
                                                c20 = 0;
                                                break;
                                            } else {
                                                c20 = '\uffff';
                                                break;
                                            }
                                        case 1090594823:
                                            if (P011.equals(str18)) {
                                                obj5 = obj8;
                                                c20 = 1;
                                                break;
                                            }
                                            c20 = '\uffff';
                                            obj5 = obj8;
                                            break;
                                        case 1480014044:
                                            if (P011.equals("ip_address")) {
                                                obj5 = obj8;
                                                c20 = 2;
                                                break;
                                            }
                                            c20 = '\uffff';
                                            obj5 = obj8;
                                            break;
                                        case 1917799825:
                                            if (P011.equals("user_agent")) {
                                                obj5 = obj8;
                                                c20 = 3;
                                                break;
                                            }
                                            c20 = '\uffff';
                                            obj5 = obj8;
                                            break;
                                        default:
                                            c20 = '\uffff';
                                            obj5 = obj8;
                                            break;
                                    }
                                    switch (c20) {
                                        case 0:
                                            str8 = str6;
                                            obj8 = obj5;
                                            str29 = c3653i0.X0();
                                            str38 = str39;
                                            break;
                                        case 1:
                                            str8 = str6;
                                            obj8 = obj5;
                                            str30 = c3653i0.X0();
                                            str38 = str39;
                                            break;
                                        case 2:
                                            str8 = str6;
                                            obj8 = obj5;
                                            str38 = c3653i0.X0();
                                            break;
                                        case 3:
                                            str8 = str6;
                                            obj8 = obj5;
                                            str37 = c3653i0.X0();
                                            str38 = str39;
                                            break;
                                        default:
                                            String str40 = str37;
                                            int i16 = 0;
                                            while (true) {
                                                int i17 = c3653i02.f34363l0;
                                                if (i17 == 0) {
                                                    i17 = c3653i0.k();
                                                }
                                                obj8 = obj5;
                                                if (i17 == 3) {
                                                    i10 = 1;
                                                    c3653i02.b1(1);
                                                    i11 = i16 + 1;
                                                    str8 = str6;
                                                } else {
                                                    i10 = 1;
                                                    if (i17 == 1) {
                                                        str8 = str6;
                                                        c3653i02.b1(3);
                                                        i13 = i16 + 1;
                                                    } else {
                                                        str8 = str6;
                                                        if (i17 == 4) {
                                                            c3653i02.f34368q0--;
                                                            i13 = i16 - 1;
                                                        } else {
                                                            if (i17 == 2) {
                                                                c3653i02.f34368q0--;
                                                                i11 = i16 - 1;
                                                                i12 = 1;
                                                            } else {
                                                                if (i17 == 14 || i17 == 10) {
                                                                    while (true) {
                                                                        int i18 = 0;
                                                                        while (true) {
                                                                            int i19 = c3653i02.f34359h0 + i18;
                                                                            if (i19 < c3653i02.f34360i0) {
                                                                                char c26 = c3653i02.f34358Z[i19];
                                                                                i11 = i16;
                                                                                if (c26 != '\t' && c26 != '\n' && c26 != '\f' && c26 != '\r' && c26 != ' ') {
                                                                                    if (c26 != '#') {
                                                                                        if (c26 != ',') {
                                                                                            if (c26 != '/' && c26 != '=') {
                                                                                                if (c26 != '{' && c26 != '}' && c26 != ':') {
                                                                                                    if (c26 == ';') {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        switch (c26) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i18++;
                                                                                                                i16 = i11;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                c3653i02.f34359h0 = i19;
                                                                                i12 = 1;
                                                                                if (c3653i02.r(1)) {
                                                                                    i16 = i11;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (i17 == 8 || i17 == 12) {
                                                                        c3653i02.d1('\'');
                                                                    } else if (i17 == 9 || i17 == 13) {
                                                                        c3653i02.d1('\"');
                                                                    } else if (i17 == 16) {
                                                                        c3653i02.f34359h0 += c3653i02.f34365n0;
                                                                    }
                                                                    i11 = i16;
                                                                }
                                                                i12 = 1;
                                                            }
                                                            c3653i02.f34363l0 = 0;
                                                            if (i11 != 0) {
                                                                int[] iArr = c3653i02.f34370s0;
                                                                int i20 = c3653i02.f34368q0 - i12;
                                                                iArr[i20] = iArr[i20] + i12;
                                                                c3653i02.f34369r0[i20] = "null";
                                                                str38 = str39;
                                                                str37 = str40;
                                                                break;
                                                            } else {
                                                                str6 = str8;
                                                                obj5 = obj8;
                                                                i16 = i11;
                                                            }
                                                        }
                                                    }
                                                    i11 = i13;
                                                }
                                                i12 = i10;
                                                c3653i02.f34363l0 = 0;
                                                if (i11 != 0) {
                                                }
                                            }
                                            break;
                                    }
                                    str6 = str8;
                                } else {
                                    str15 = str6;
                                    c3653i0.p();
                                    str28 = str39;
                                    str32 = str37;
                                    break;
                                }
                            }
                            break;
                        case '\n':
                            str31 = c3653i0.X0();
                            str15 = str6;
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c3653i02.Y0(h10, concurrentHashMap9, P010);
                            str15 = str6;
                            str28 = str33;
                            c3653i02 = c3653i0;
                            str17 = str4;
                            str16 = str5;
                    }
                }
                break;
            case 11:
                return b(c3653i0, h10);
            case 12:
                return new B1(c3653i0.W0());
            case 13:
                return C1.valueOf(c3653i0.W0().toUpperCase(Locale.ROOT));
            case 14:
                c3653i0.h();
                F1 f12 = null;
                String str41 = null;
                io.sentry.protocol.s sVar4 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                ConcurrentHashMap concurrentHashMap11 = null;
                String str47 = null;
                String str48 = null;
                while (true) {
                    String str49 = str47;
                    if (c3653i0.a1() != io.sentry.vendor.gson.stream.a.NAME) {
                        if (sVar4 == null) {
                            throw j("trace_id", h10);
                        }
                        if (str43 != null) {
                            if (f12 != null) {
                                if (str41 == null) {
                                    str41 = f12.f33785a;
                                }
                                if (str42 == null) {
                                    str10 = f12.f33786b;
                                    str9 = str41;
                                    G1 g12 = new G1(sVar4, str43, str44, str45, str9, str10, str46, str49, str48);
                                    g12.f33796o0 = concurrentHashMap11;
                                    c3653i0.p();
                                    return g12;
                                }
                            }
                            str9 = str41;
                            str10 = str42;
                            G1 g122 = new G1(sVar4, str43, str44, str45, str9, str10, str46, str49, str48);
                            g122.f33796o0 = concurrentHashMap11;
                            c3653i0.p();
                            return g122;
                        }
                        throw j("public_key", h10);
                    }
                    String P012 = c3653i0.P0();
                    P012.getClass();
                    switch (P012.hashCode()) {
                        case -795593025:
                            str11 = str13;
                            str12 = str18;
                            if (P012.equals("user_segment")) {
                                c21 = 0;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case -147132913:
                            str11 = str13;
                            str12 = str18;
                            if (P012.equals("user_id")) {
                                c21 = 1;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case -85904877:
                            str11 = str13;
                            str12 = str18;
                            if (P012.equals(obj8)) {
                                c21 = 2;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case 3599307:
                            str11 = str13;
                            str12 = str18;
                            if (P012.equals("user")) {
                                c21 = 3;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case 153193045:
                            str11 = str13;
                            str12 = str18;
                            if (P012.equals("sample_rate")) {
                                c21 = 4;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case 1090594823:
                            str12 = str18;
                            str11 = str13;
                            if (P012.equals(str12)) {
                                c21 = 5;
                                break;
                            }
                            c21 = '\uffff';
                            break;
                        case 1270300245:
                            if (P012.equals("trace_id")) {
                                str11 = str13;
                                str12 = str18;
                                c21 = 6;
                                break;
                            }
                            str11 = str13;
                            c21 = '\uffff';
                            str12 = str18;
                            break;
                        case 1864843258:
                            if (P012.equals("sampled")) {
                                str11 = str13;
                                str12 = str18;
                                c21 = 7;
                                break;
                            }
                            str11 = str13;
                            c21 = '\uffff';
                            str12 = str18;
                            break;
                        case 1904812937:
                            if (P012.equals("public_key")) {
                                str11 = str13;
                                str12 = str18;
                                c21 = '\b';
                                break;
                            }
                            str11 = str13;
                            c21 = '\uffff';
                            str12 = str18;
                            break;
                        case 2141246174:
                            if (P012.equals(str13)) {
                                str11 = str13;
                                str12 = str18;
                                c21 = '\t';
                                break;
                            }
                            str11 = str13;
                            c21 = '\uffff';
                            str12 = str18;
                            break;
                        default:
                            str11 = str13;
                            c21 = '\uffff';
                            str12 = str18;
                            break;
                    }
                    switch (c21) {
                        case 0:
                            str42 = c3653i0.X0();
                            break;
                        case 1:
                            str41 = c3653i0.X0();
                            break;
                        case 2:
                            str45 = c3653i0.X0();
                            break;
                        case 3:
                            f12 = (F1) c3653i02.U0(h10, new C3637d(15));
                            break;
                        case 4:
                            str49 = c3653i0.X0();
                            break;
                        case 5:
                            str44 = c3653i0.X0();
                            break;
                        case 6:
                            sVar4 = new io.sentry.protocol.s(c3653i0.W0());
                            break;
                        case 7:
                            str48 = c3653i0.X0();
                            break;
                        case '\b':
                            str43 = c3653i0.W0();
                            break;
                        case '\t':
                            str46 = c3653i0.X0();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            c3653i02.Y0(h10, concurrentHashMap11, P012);
                            break;
                    }
                    str18 = str12;
                    str47 = str49;
                    str13 = str11;
                }
            case 15:
                c3653i0.h();
                String str50 = null;
                String str51 = null;
                ConcurrentHashMap concurrentHashMap12 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P013 = c3653i0.P0();
                    P013.getClass();
                    if (P013.equals(ParameterNames.ID)) {
                        str51 = c3653i0.X0();
                    } else if (!P013.equals("segment")) {
                        if (concurrentHashMap12 == null) {
                            concurrentHashMap12 = new ConcurrentHashMap();
                        }
                        c3653i02.Y0(h10, concurrentHashMap12, P013);
                    } else {
                        str50 = c3653i0.X0();
                    }
                }
                ?? obj12 = new Object();
                obj12.f33785a = str51;
                obj12.f33786b = str50;
                c3653i0.p();
                return obj12;
            case 16:
                c3653i0.h();
                String str52 = null;
                io.sentry.protocol.s sVar5 = null;
                String str53 = null;
                String str54 = null;
                HashMap hashMap3 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P014 = c3653i0.P0();
                    P014.getClass();
                    switch (P014.hashCode()) {
                        case -602415628:
                            if (P014.equals("comments")) {
                                c22 = 0;
                                break;
                            }
                            c22 = '\uffff';
                            break;
                        case 3373707:
                            if (P014.equals("name")) {
                                c22 = 1;
                                break;
                            }
                            c22 = '\uffff';
                            break;
                        case 96619420:
                            if (P014.equals("email")) {
                                c22 = 2;
                                break;
                            }
                            c22 = '\uffff';
                            break;
                        case 278118624:
                            if (P014.equals("event_id")) {
                                c22 = 3;
                                break;
                            }
                            c22 = '\uffff';
                            break;
                        default:
                            c22 = '\uffff';
                            break;
                    }
                    switch (c22) {
                        case 0:
                            str54 = c3653i0.X0();
                            break;
                        case 1:
                            str52 = c3653i0.X0();
                            break;
                        case 2:
                            str53 = c3653i0.X0();
                            break;
                        case 3:
                            sVar5 = new io.sentry.protocol.s(c3653i0.W0());
                            break;
                        default:
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap();
                            }
                            c3653i02.Y0(h10, hashMap3, P014);
                            break;
                    }
                }
                c3653i0.p();
                if (sVar5 != null) {
                    N1 n12 = new N1(sVar5, str52, str53, str54);
                    n12.f33835j0 = hashMap3;
                    return n12;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"event_id\"");
                h10.d(EnumC3642e1.ERROR, "Missing required field \"event_id\"", illegalStateException2);
                throw illegalStateException2;
            case 17:
                ArrayList arrayList2 = new ArrayList();
                c3653i0.h();
                Date date5 = null;
                HashMap hashMap4 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P015 = c3653i0.P0();
                    P015.getClass();
                    if (P015.equals("discarded_events")) {
                        arrayList2.addAll(c3653i02.w0(h10, new C3637d(18)));
                    } else if (!P015.equals(str17)) {
                        if (hashMap4 == null) {
                            hashMap4 = new HashMap();
                        }
                        c3653i02.Y0(h10, hashMap4, P015);
                    } else {
                        date5 = c3653i0.V(h10);
                    }
                }
                c3653i0.p();
                if (date5 != null) {
                    if (!arrayList2.isEmpty()) {
                        io.sentry.clientreport.a aVar = new io.sentry.clientreport.a(date5, arrayList2);
                        aVar.f34299h0 = hashMap4;
                        return aVar;
                    }
                    throw k("discarded_events", h10);
                }
                throw k(str17, h10);
            case 18:
                c3653i0.h();
                String str55 = null;
                String str56 = null;
                Long l11 = null;
                HashMap hashMap5 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P016 = c3653i0.P0();
                    P016.getClass();
                    switch (P016.hashCode()) {
                        case -1285004149:
                            if (P016.equals("quantity")) {
                                c23 = 0;
                                break;
                            }
                            c23 = '\uffff';
                            break;
                        case -934964668:
                            if (P016.equals("reason")) {
                                c23 = 1;
                                break;
                            }
                            c23 = '\uffff';
                            break;
                        case 50511102:
                            if (P016.equals("category")) {
                                c23 = 2;
                                break;
                            }
                            c23 = '\uffff';
                            break;
                        default:
                            c23 = '\uffff';
                            break;
                    }
                    switch (c23) {
                        case 0:
                            l11 = c3653i0.F0();
                            break;
                        case 1:
                            str56 = c3653i0.X0();
                            break;
                        case 2:
                            str55 = c3653i0.X0();
                            break;
                        default:
                            if (hashMap5 == null) {
                                hashMap5 = new HashMap();
                            }
                            c3653i02.Y0(h10, hashMap5, P016);
                            break;
                    }
                }
                c3653i0.p();
                if (str56 == null) {
                    throw l("reason", h10);
                }
                if (str55 == null) {
                    throw l("category", h10);
                }
                if (l11 != null) {
                    io.sentry.clientreport.e eVar = new io.sentry.clientreport.e(str56, str55, l11);
                    eVar.f34307i0 = hashMap5;
                    return eVar;
                }
                throw l("quantity", h10);
            case 19:
                c3653i0.h();
                io.sentry.profilemeasurements.a aVar2 = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap13 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P017 = c3653i0.P0();
                    P017.getClass();
                    if (P017.equals(DiagnosticsEntry.Histogram.VALUES_KEY)) {
                        ArrayList w03 = c3653i02.w0(h10, new C3637d(20));
                        if (w03 != null) {
                            aVar2.f34464h0 = w03;
                        }
                    } else if (!P017.equals("unit")) {
                        if (concurrentHashMap13 == null) {
                            concurrentHashMap13 = new ConcurrentHashMap();
                        }
                        c3653i02.Y0(h10, concurrentHashMap13, P017);
                    } else {
                        String X026 = c3653i0.X0();
                        if (X026 != null) {
                            aVar2.f34463Z = X026;
                        }
                    }
                }
                aVar2.f34462Y = concurrentHashMap13;
                c3653i0.p();
                return aVar2;
            case 20:
                c3653i0.h();
                io.sentry.profilemeasurements.b bVar = new io.sentry.profilemeasurements.b(0L, 0);
                ConcurrentHashMap concurrentHashMap14 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P018 = c3653i0.P0();
                    P018.getClass();
                    if (P018.equals("elapsed_since_start_ns")) {
                        String X027 = c3653i0.X0();
                        if (X027 != null) {
                            bVar.f34466Z = X027;
                        }
                    } else if (!P018.equals("value")) {
                        if (concurrentHashMap14 == null) {
                            concurrentHashMap14 = new ConcurrentHashMap();
                        }
                        c3653i02.Y0(h10, concurrentHashMap14, P018);
                    } else {
                        Double d04 = c3653i0.d0();
                        if (d04 != null) {
                            bVar.f34467h0 = d04.doubleValue();
                        }
                    }
                }
                bVar.f34465Y = concurrentHashMap14;
                c3653i0.p();
                return bVar;
            case 21:
                return c(c3653i0, h10);
            case 22:
                return d(c3653i0, h10);
            case 23:
                return e(c3653i0, h10);
            case 24:
                DebugImage debugImage = new DebugImage();
                c3653i0.h();
                HashMap hashMap6 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P019 = c3653i0.P0();
                    P019.getClass();
                    switch (P019.hashCode()) {
                        case -1840639000:
                            if (P019.equals("debug_file")) {
                                c24 = 0;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case -1443345323:
                            if (P019.equals("image_addr")) {
                                c24 = 1;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case -1442803611:
                            if (P019.equals("image_size")) {
                                c24 = 2;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case -1127437170:
                            if (P019.equals("code_file")) {
                                c24 = 3;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case 3002454:
                            if (P019.equals("arch")) {
                                c24 = 4;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case 3575610:
                            if (P019.equals(str14)) {
                                c24 = 5;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case 3601339:
                            if (P019.equals("uuid")) {
                                c24 = 6;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case 547804807:
                            if (P019.equals("debug_id")) {
                                c24 = 7;
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        case 941842605:
                            if (P019.equals("code_id")) {
                                c24 = '\b';
                                break;
                            }
                            c24 = '\uffff';
                            break;
                        default:
                            c24 = '\uffff';
                            break;
                    }
                    switch (c24) {
                        case 0:
                            debugImage.debugFile = c3653i0.X0();
                            break;
                        case 1:
                            debugImage.imageAddr = c3653i0.X0();
                            break;
                        case 2:
                            debugImage.imageSize = c3653i0.F0();
                            break;
                        case 3:
                            debugImage.codeFile = c3653i0.X0();
                            break;
                        case 4:
                            debugImage.arch = c3653i0.X0();
                            break;
                        case 5:
                            debugImage.type = c3653i0.X0();
                            break;
                        case 6:
                            debugImage.uuid = c3653i0.X0();
                            break;
                        case 7:
                            debugImage.debugId = c3653i0.X0();
                            break;
                        case '\b':
                            debugImage.codeId = c3653i0.X0();
                            break;
                        default:
                            if (hashMap6 == null) {
                                hashMap6 = new HashMap();
                            }
                            c3653i02.Y0(h10, hashMap6, P019);
                            break;
                    }
                }
                c3653i0.p();
                debugImage.setUnknown(hashMap6);
                return debugImage;
            case 25:
                ?? obj13 = new Object();
                c3653i0.h();
                HashMap hashMap7 = null;
                while (c3653i0.a1() == io.sentry.vendor.gson.stream.a.NAME) {
                    String P020 = c3653i0.P0();
                    P020.getClass();
                    if (P020.equals("images")) {
                        obj13.f34510Z = c3653i02.w0(h10, new C3637d(24));
                    } else if (!P020.equals("sdk_info")) {
                        if (hashMap7 == null) {
                            hashMap7 = new HashMap();
                        }
                        c3653i02.Y0(h10, hashMap7, P020);
                    } else {
                        obj13.f34509Y = (io.sentry.protocol.p) c3653i02.U0(h10, new io.sentry.protocol.i(6));
                    }
                }
                c3653i0.p();
                obj13.f34511h0 = hashMap7;
                return obj13;
            case 26:
                return f(c3653i0, h10);
            case 27:
                return EnumC3678e.valueOf(c3653i0.W0().toUpperCase(Locale.ROOT));
            case 28:
                return g(c3653i0, h10);
            default:
                return h(c3653i0, h10);
        }
    }
}
