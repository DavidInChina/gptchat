package k6;

import I8.u;
import Ii.q;
import M3.H;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3963m;
import kf.AbstractC4268D;
import kf.v;
import kf.w;
import l6.RunnableC4338b;
import l8.AbstractC4344b;
import m6.C4563b;
import m6.C4564c;
import o6.C4932k;
import o6.C4945y;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import p6.C5093a;
import p6.C5094b;
import p6.C5095c;
import q6.C5276a;
import r5.AbstractC5367b;
import r5.AbstractC5368c;
import r6.AbstractC5369a;
import r6.C5370b;
import s5.AbstractC5577b;
import s6.C5578a;
import s6.C5579b;
import t5.AbstractC5675a;
import t5.C5677c;
import u5.C5843c;
import v6.AbstractC5979c;
import v6.C5977a;
import w6.m;
import w6.o;
import wf.k;
import x5.C6276b;
import x6.C6333s1;
import x6.C6354z1;
import x6.a2;
import y.AbstractC6463a;
import y6.C6545a;
import y6.j;

/* renamed from: k6.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4199i implements r5.e, AbstractC5367b {

    /* renamed from: B  reason: collision with root package name */
    public static final C4196f f37137B = new C4196f(null, 100.0f, 20.0f, 20.0f, true, v.f37483Y, new Object(), new y6.d(new C6545a(0)), new C5093a(100), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), false, true, 2, new Object(), w.f37484Y);

    /* renamed from: C  reason: collision with root package name */
    public static final long f37138C = System.nanoTime();

    /* renamed from: a  reason: collision with root package name */
    public final r5.d f37140a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37141b;

    /* renamed from: c  reason: collision with root package name */
    public final C4196f f37142c;

    /* renamed from: d  reason: collision with root package name */
    public final k f37143d;

    /* renamed from: g  reason: collision with root package name */
    public float f37146g;

    /* renamed from: h  reason: collision with root package name */
    public float f37147h;

    /* renamed from: i  reason: collision with root package name */
    public float f37148i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37149j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f37150k;

    /* renamed from: t  reason: collision with root package name */
    public ExecutorService f37159t;

    /* renamed from: u  reason: collision with root package name */
    public RunnableC4338b f37160u;

    /* renamed from: v  reason: collision with root package name */
    public Context f37161v;

    /* renamed from: w  reason: collision with root package name */
    public F4.a f37162w;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC5675a f37144e = new q(1);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f37145f = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    public j f37151l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public AbstractC5979c f37152m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public y6.i f37153n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public m f37154o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public m f37155p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public m f37156q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public i6.h f37157r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public ScheduledExecutorService f37158s = new Object();

    /* renamed from: x  reason: collision with root package name */
    public final C3963m f37163x = R4.b.D1(new C4198h(this, 0));

    /* renamed from: y  reason: collision with root package name */
    public final String f37164y = "rum";

    /* renamed from: z  reason: collision with root package name */
    public final C3963m f37165z = R4.b.D1(new C4198h(this, 1));

    /* renamed from: A  reason: collision with root package name */
    public final C5677c f37139A = C5677c.f45749a;

    /* JADX WARN: Type inference failed for: r3v10, types: [i6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, y6.j] */
    /* JADX WARN: Type inference failed for: r3v4, types: [v6.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, y6.i] */
    /* JADX WARN: Type inference failed for: r3v6, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [w6.m, java.lang.Object] */
    public C4199i(r5.d dVar, String str, C4196f c4196f) {
        C4195e c4195e = C4195e.f37107Y;
        AbstractC3557B.c0("applicationId", str);
        AbstractC3557B.c0("configuration", c4196f);
        this.f37140a = dVar;
        this.f37141b = str;
        this.f37142c = c4196f;
        this.f37143d = c4195e;
        new AtomicReference(null);
    }

    @Override // r5.e
    public final C5677c a() {
        return this.f37139A;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.Map] */
    @Override // r5.AbstractC5367b
    public final void b(Object obj) {
        C5370b c5370b;
        ThreadPoolExecutor threadPoolExecutor;
        BlockingQueue<Runnable> queue;
        Boolean bool;
        Long l10;
        Long l11;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        A6.b bVar;
        AbstractC5369a abstractC5369a;
        String str;
        Map map;
        AbstractC5369a abstractC5369a2;
        String str2;
        Map map2;
        AbstractC5369a abstractC5369a3;
        String str3;
        Throwable th2;
        String str4;
        String str5;
        AbstractC5369a abstractC5369a4;
        AbstractC5369a abstractC5369a5;
        String str6;
        AbstractC5369a abstractC5369a6;
        String str7;
        String str8;
        w wVar;
        AbstractC5369a abstractC5369a7;
        String str9;
        String str10;
        String str11;
        int i10;
        Throwable th3;
        String str12;
        w wVar2;
        AbstractC5369a abstractC5369a8;
        String str13;
        Long l12;
        String str14;
        String str15;
        String str16;
        u uVar;
        a2 a2Var;
        float f6;
        C6354z1 c6354z1;
        C6333s1 c6333s1;
        Number number;
        Object obj2;
        int i11 = 1;
        boolean z10 = obj instanceof C6276b;
        w wVar3 = w.f37484Y;
        r5.d dVar = this.f37140a;
        if (z10) {
            C6276b c6276b = (C6276b) obj;
            Object a5 = i6.b.a(dVar);
            if (a5 instanceof AbstractC5369a) {
                obj2 = (AbstractC5369a) a5;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                String str17 = c6276b.f48901i;
                AbstractC3557B.c0("message", str17);
                Throwable th4 = c6276b.f48900h;
                AbstractC3557B.c0("throwable", th4);
                List list = c6276b.f48902j;
                AbstractC3557B.c0("threads", list);
                ((C5370b) obj2).d(new C4932k(str17, 2, th4, true, wVar3, null, null, list, 448));
                return;
            }
            return;
        }
        boolean z11 = obj instanceof Map;
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (!z11) {
            P4.a.m0(dVar.l(), 4, enumC5090b, new R5.c(3, obj), null, false, 56);
            return;
        }
        Map map3 = (Map) obj;
        Object obj3 = map3.get("type");
        if (AbstractC3557B.K(obj3, "ndk_crash")) {
            AbstractC5675a abstractC5675a = this.f37144e;
            s6.c cVar = (s6.c) ((s6.d) this.f37163x.getValue());
            cVar.getClass();
            AbstractC3557B.c0("sdkCore", dVar);
            AbstractC3557B.c0("rumWriter", abstractC5675a);
            AbstractC5368c h10 = dVar.h("rum");
            if (h10 == null) {
                P4.a.m0(cVar.f45419a, 3, enumC5090b, C5578a.f45405Z, null, false, 56);
                return;
            }
            Object obj4 = map3.get("sourceType");
            if (obj4 instanceof String) {
                str13 = (String) obj4;
            } else {
                str13 = null;
            }
            Object obj5 = map3.get(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            if (obj5 instanceof Long) {
                l12 = (Long) obj5;
            } else {
                l12 = null;
            }
            Object obj6 = map3.get("signalName");
            if (obj6 instanceof String) {
                str14 = (String) obj6;
            } else {
                str14 = null;
            }
            Object obj7 = map3.get("stacktrace");
            if (obj7 instanceof String) {
                str15 = (String) obj7;
            } else {
                str15 = null;
            }
            Object obj8 = map3.get("message");
            if (obj8 instanceof String) {
                str16 = (String) obj8;
            } else {
                str16 = null;
            }
            Object obj9 = map3.get("lastViewEvent");
            if (obj9 instanceof u) {
                uVar = (u) obj9;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                Object a10 = cVar.f45420b.a(uVar);
                if (a10 instanceof a2) {
                    a2Var = (a2) a10;
                    if (a2Var == null && (c6354z1 = a2Var.f49248p) != null && (c6333s1 = c6354z1.f49492b) != null && (number = c6333s1.f49435a) != null) {
                        f6 = number.floatValue();
                    } else {
                        f6 = 0.0f;
                    }
                    float f10 = f6;
                    if (l12 == null && str14 != null && str15 != null && str16 != null && a2Var != null) {
                        H.B0(h10, new C5579b(cVar, str13, str16, l12, str15, str14, a2Var, f10, abstractC5675a, System.currentTimeMillis()));
                        return;
                    } else {
                        P4.a.m0(cVar.f45419a, 4, enumC5090b, C5578a.f45406h0, null, false, 56);
                        return;
                    }
                }
            }
            a2Var = null;
            if (a2Var == null) {
            }
            f6 = 0.0f;
            float f102 = f6;
            if (l12 == null) {
            }
            P4.a.m0(cVar.f45419a, 4, enumC5090b, C5578a.f45406h0, null, false, 56);
            return;
        }
        boolean K10 = AbstractC3557B.K(obj3, "logger_error");
        EnumC5090b enumC5090b2 = EnumC5090b.f42740h0;
        if (K10) {
            Object obj10 = map3.get("throwable");
            if (obj10 instanceof Throwable) {
                th3 = (Throwable) obj10;
            } else {
                th3 = null;
            }
            Object obj11 = map3.get("message");
            if (obj11 instanceof String) {
                str12 = (String) obj11;
            } else {
                str12 = null;
            }
            Object obj12 = map3.get("attributes");
            if (obj12 instanceof Map) {
                wVar2 = (Map) obj12;
            } else {
                wVar2 = null;
            }
            if (str12 == null) {
                P4.a.l0(dVar.l(), 4, AbstractC4344b.G0(enumC5090b, enumC5090b2), C4197g.f37128Z, null, 56);
                return;
            }
            i6.f a11 = i6.b.a(dVar);
            if (a11 instanceof AbstractC5369a) {
                abstractC5369a8 = (AbstractC5369a) a11;
            } else {
                abstractC5369a8 = null;
            }
            if (abstractC5369a8 != null) {
                if (wVar2 != null) {
                    wVar3 = wVar2;
                }
                ((C5370b) abstractC5369a8).q(str12, 4, th3, wVar3);
            }
        } else if (AbstractC3557B.K(obj3, "logger_error_with_stacktrace")) {
            Object obj13 = map3.get("stacktrace");
            if (obj13 instanceof String) {
                str7 = (String) obj13;
            } else {
                str7 = null;
            }
            Object obj14 = map3.get("message");
            if (obj14 instanceof String) {
                str8 = (String) obj14;
            } else {
                str8 = null;
            }
            Object obj15 = map3.get("attributes");
            if (obj15 instanceof Map) {
                wVar = (Map) obj15;
            } else {
                wVar = null;
            }
            if (str8 == null) {
                P4.a.l0(dVar.l(), 4, AbstractC4344b.G0(enumC5090b, enumC5090b2), C4197g.f37129h0, null, 56);
                return;
            }
            i6.f a12 = i6.b.a(dVar);
            if (a12 instanceof AbstractC5369a) {
                abstractC5369a7 = (AbstractC5369a) a12;
            } else {
                abstractC5369a7 = null;
            }
            if (abstractC5369a7 != null) {
                if (wVar != null) {
                    wVar3 = wVar;
                }
                C5370b c5370b2 = (C5370b) abstractC5369a7;
                C4564c c10 = C5370b.c(wVar3);
                Object obj16 = wVar3.get("_dd.error_type");
                if (obj16 instanceof String) {
                    str9 = (String) obj16;
                } else {
                    str9 = null;
                }
                Object obj17 = wVar3.get("_dd.error.source_type");
                if (obj17 instanceof String) {
                    str10 = (String) obj17;
                } else {
                    str10 = null;
                }
                if (str10 != null) {
                    Locale locale = Locale.US;
                    str11 = AbstractC6463a.j("US", locale, str10, locale, "this as java.lang.String).toLowerCase(locale)");
                } else {
                    str11 = null;
                }
                if (str11 != null) {
                    switch (str11.hashCode()) {
                        case -861391249:
                            str11.equals("android");
                            break;
                        case -760334308:
                            if (str11.equals("flutter")) {
                                i10 = 4;
                                break;
                            }
                            break;
                        case -380982102:
                            if (str11.equals("ndk+il2cpp")) {
                                i11 = 6;
                                break;
                            }
                            break;
                        case 108917:
                            if (str11.equals("ndk")) {
                                i11 = 5;
                                break;
                            }
                            break;
                        case 150940456:
                            if (str11.equals("browser")) {
                                i10 = 2;
                                break;
                            }
                            break;
                        case 828638245:
                            if (str11.equals("react-native")) {
                                i10 = 3;
                                break;
                            }
                            break;
                    }
                    c5370b2.d(new C4932k(str8, 4, null, str7, false, AbstractC4268D.l1(wVar3), c10, str9, i10, v.f37483Y));
                }
                i10 = i11;
                c5370b2.d(new C4932k(str8, 4, null, str7, false, AbstractC4268D.l1(wVar3), c10, str9, i10, v.f37483Y));
            }
        } else if (AbstractC3557B.K(obj3, "web_view_ingested_notification")) {
            i6.f a13 = i6.b.a(dVar);
            if (a13 instanceof AbstractC5369a) {
                abstractC5369a6 = (AbstractC5369a) a13;
            } else {
                abstractC5369a6 = null;
            }
            if (abstractC5369a6 != null) {
                ((C5370b) abstractC5369a6).d(new o6.H());
            }
        } else {
            boolean K11 = AbstractC3557B.K(obj3, "telemetry_error");
            EnumC5090b enumC5090b3 = EnumC5090b.f42739Z;
            if (K11) {
                Object obj18 = map3.get("message");
                if (obj18 instanceof String) {
                    str3 = (String) obj18;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    P4.a.m0(dVar.l(), 4, enumC5090b3, C4197g.f37132k0, null, false, 56);
                    return;
                }
                Object obj19 = map3.get("throwable");
                if (obj19 instanceof Throwable) {
                    th2 = (Throwable) obj19;
                } else {
                    th2 = null;
                }
                Object obj20 = map3.get("stacktrace");
                if (obj20 instanceof String) {
                    str4 = (String) obj20;
                } else {
                    str4 = null;
                }
                Object obj21 = map3.get("kind");
                if (obj21 instanceof String) {
                    str5 = (String) obj21;
                } else {
                    str5 = null;
                }
                if (th2 != null) {
                    F4.a aVar = this.f37162w;
                    if (aVar != null) {
                        i6.f a14 = i6.b.a((AbstractC5092d) aVar.f5033Z);
                        if (a14 instanceof AbstractC5369a) {
                            abstractC5369a5 = (AbstractC5369a) a14;
                        } else {
                            abstractC5369a5 = null;
                        }
                        if (abstractC5369a5 != null) {
                            C5370b c5370b3 = (C5370b) abstractC5369a5;
                            String J02 = AbstractC4344b.J0(th2);
                            String canonicalName = th2.getClass().getCanonicalName();
                            if (canonicalName == null) {
                                str6 = th2.getClass().getSimpleName();
                            } else {
                                str6 = canonicalName;
                            }
                            c5370b3.d(new C4945y(2, str3, J02, str6, null, null, false, 448));
                            return;
                        }
                        return;
                    }
                    AbstractC3557B.C2("telemetry");
                    throw null;
                }
                F4.a aVar2 = this.f37162w;
                if (aVar2 != null) {
                    i6.f a15 = i6.b.a((AbstractC5092d) aVar2.f5033Z);
                    if (a15 instanceof AbstractC5369a) {
                        abstractC5369a4 = (AbstractC5369a) a15;
                    } else {
                        abstractC5369a4 = null;
                    }
                    if (abstractC5369a4 != null) {
                        ((C5370b) abstractC5369a4).d(new C4945y(2, str3, str4, str5, null, null, false, 448));
                        return;
                    }
                    return;
                }
                AbstractC3557B.C2("telemetry");
                throw null;
            } else if (AbstractC3557B.K(obj3, "telemetry_debug")) {
                Object obj22 = map3.get("message");
                if (obj22 instanceof String) {
                    str2 = (String) obj22;
                } else {
                    str2 = null;
                }
                Object obj23 = map3.get("additionalProperties");
                if (obj23 instanceof Map) {
                    map2 = (Map) obj23;
                } else {
                    map2 = null;
                }
                if (str2 == null) {
                    P4.a.m0(dVar.l(), 4, enumC5090b3, C4197g.f37131j0, null, false, 56);
                    return;
                }
                F4.a aVar3 = this.f37162w;
                if (aVar3 != null) {
                    i6.f a16 = i6.b.a((AbstractC5092d) aVar3.f5033Z);
                    if (a16 instanceof AbstractC5369a) {
                        abstractC5369a3 = (AbstractC5369a) a16;
                    } else {
                        abstractC5369a3 = null;
                    }
                    if (abstractC5369a3 != null) {
                        ((C5370b) abstractC5369a3).d(new C4945y(1, str2, null, null, null, map2, false, 448));
                        return;
                    }
                    return;
                }
                AbstractC3557B.C2("telemetry");
                throw null;
            } else if (AbstractC3557B.K(obj3, "mobile_metric")) {
                Object obj24 = map3.get("message");
                if (obj24 instanceof String) {
                    str = (String) obj24;
                } else {
                    str = null;
                }
                Object obj25 = map3.get("additionalProperties");
                if (obj25 instanceof Map) {
                    map = (Map) obj25;
                } else {
                    map = null;
                }
                if (str == null) {
                    P4.a.m0(dVar.l(), 4, enumC5090b3, C4197g.f37130i0, null, false, 56);
                    return;
                }
                F4.a aVar4 = this.f37162w;
                if (aVar4 != null) {
                    i6.f a17 = i6.b.a((AbstractC5092d) aVar4.f5033Z);
                    if (a17 instanceof AbstractC5369a) {
                        abstractC5369a2 = (AbstractC5369a) a17;
                    } else {
                        abstractC5369a2 = null;
                    }
                    if (abstractC5369a2 != null) {
                        ((C5370b) abstractC5369a2).d(new C4945y(1, str, null, null, null, map, true, 192));
                        return;
                    }
                    return;
                }
                AbstractC3557B.C2("telemetry");
                throw null;
            } else if (AbstractC3557B.K(obj3, "telemetry_configuration")) {
                AbstractC5091c l13 = dVar.l();
                AbstractC3557B.c0("internalLogger", l13);
                Object obj26 = map3.get("track_errors");
                if (obj26 instanceof Boolean) {
                    bool = (Boolean) obj26;
                } else {
                    bool = null;
                }
                Object obj27 = map3.get("batch_size");
                if (obj27 instanceof Long) {
                    l10 = (Long) obj27;
                } else {
                    l10 = null;
                }
                Object obj28 = map3.get("batch_upload_frequency");
                if (obj28 instanceof Long) {
                    l11 = (Long) obj28;
                } else {
                    l11 = null;
                }
                Object obj29 = map3.get("use_proxy");
                if (obj29 instanceof Boolean) {
                    bool2 = (Boolean) obj29;
                } else {
                    bool2 = null;
                }
                Object obj30 = map3.get("use_local_encryption");
                if (obj30 instanceof Boolean) {
                    bool3 = (Boolean) obj30;
                } else {
                    bool3 = null;
                }
                Object obj31 = map3.get("batch_processing_level");
                if (obj31 instanceof Integer) {
                    num = (Integer) obj31;
                } else {
                    num = null;
                }
                if (bool != null && l10 != null && l11 != null && bool2 != null && bool3 != null && num != null) {
                    bVar = new A6.b(bool.booleanValue(), l10.longValue(), l11.longValue(), bool2.booleanValue(), bool3.booleanValue(), num.intValue());
                } else {
                    P4.a.m0(l13, 5, enumC5090b, A6.a.f697Z, null, false, 56);
                    bVar = null;
                }
                if (bVar != null) {
                    i6.f a18 = i6.b.a(dVar);
                    if (a18 instanceof AbstractC5369a) {
                        abstractC5369a = (AbstractC5369a) a18;
                    } else {
                        abstractC5369a = null;
                    }
                    if (abstractC5369a != null) {
                        ((C5370b) abstractC5369a).d(new C4945y(3, "", null, null, bVar, null, false, 448));
                    }
                }
            } else if (AbstractC3557B.K(obj3, "flush_and_stop_monitor")) {
                i6.f a19 = i6.b.a(dVar);
                if (a19 instanceof C5370b) {
                    c5370b = (C5370b) a19;
                } else {
                    c5370b = null;
                }
                if (c5370b != null) {
                    c5370b.f44447c.removeCallbacks(c5370b.f44452h);
                    ArrayList arrayList = new ArrayList();
                    ExecutorService executorService = c5370b.f44450f;
                    if (executorService instanceof ThreadPoolExecutor) {
                        threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    } else {
                        threadPoolExecutor = null;
                    }
                    if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
                        queue.drainTo(arrayList);
                    }
                    executorService.shutdown();
                    executorService.awaitTermination(10L, TimeUnit.SECONDS);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } else {
                P4.a.m0(dVar.l(), 4, enumC5090b, new R5.c(4, obj), null, false, 56);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [i6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y6.j] */
    /* JADX WARN: Type inference failed for: r0v5, types: [v6.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, y6.i] */
    /* JADX WARN: Type inference failed for: r0v7, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [w6.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [w6.m, java.lang.Object] */
    @Override // r5.AbstractC5366a
    public final void c() {
        this.f37140a.f(this.f37164y);
        Context context = this.f37161v;
        if (context != null) {
            this.f37152m.a(context);
            this.f37151l.a(context);
            this.f37153n.a(context);
            this.f37144e = new q(1);
            this.f37151l = new Object();
            this.f37152m = new Object();
            this.f37153n = new Object();
            this.f37154o = new Object();
            this.f37155p = new Object();
            this.f37156q = new Object();
            this.f37158s.shutdownNow();
            ExecutorService executorService = this.f37159t;
            if (executorService != null) {
                executorService.shutdownNow();
                RunnableC4338b runnableC4338b = this.f37160u;
                if (runnableC4338b != null) {
                    runnableC4338b.f37846j0 = true;
                    this.f37158s = new Object();
                    this.f37157r = new Object();
                    LinkedHashMap linkedHashMap = i6.b.f32721a;
                    r5.d dVar = this.f37140a;
                    AbstractC3557B.c0("sdkCore", dVar);
                    LinkedHashMap linkedHashMap2 = i6.b.f32721a;
                    synchronized (linkedHashMap2) {
                        i6.f fVar = (i6.f) linkedHashMap2.remove(dVar);
                    }
                    return;
                }
                AbstractC3557B.C2("anrDetectorRunnable");
                throw null;
            }
            AbstractC3557B.C2("anrDetectorExecutorService");
            throw null;
        }
        AbstractC3557B.C2("appContext");
        throw null;
    }

    @Override // r5.e
    public final AbstractC5577b d() {
        return (AbstractC5577b) this.f37165z.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r5.AbstractC5366a
    public final void e(Context context) {
        float f6;
        C5094b c5094b;
        Application application;
        this.f37161v = context;
        r5.d dVar = this.f37140a;
        this.f37162w = new F4.a(dVar);
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.core.InternalSdkCore", dVar);
        u5.g gVar = (u5.g) dVar;
        C4196f c4196f = this.f37142c;
        this.f37144e = new C4563b(new U5.b(new n6.d(c4196f.f37117j, c4196f.f37118k, c4196f.f37119l, c4196f.f37120m, c4196f.f37121n, c4196f.f37122o, gVar.l()), new n6.h(gVar.l())), new f8.e(2), gVar);
        if (gVar.e()) {
            P4.a.m0(dVar.l(), 3, EnumC5090b.f42738Y, C4197g.f37133l0, null, false, 56);
            f6 = 100.0f;
        } else {
            f6 = c4196f.f37109b;
        }
        this.f37146g = f6;
        this.f37147h = c4196f.f37110c;
        this.f37148i = c4196f.f37111d;
        this.f37149j = c4196f.f37123p;
        this.f37150k = c4196f.f37124q;
        j jVar = c4196f.f37115h;
        if (jVar != null) {
            this.f37151l = jVar;
        }
        if (c4196f.f37112e) {
            C5977a[] c5977aArr = (C5977a[]) c4196f.f37113f.toArray(new C5977a[0]);
            AbstractC5091c l10 = dVar.l();
            C5977a[] c5977aArr2 = {new Object()};
            AbstractC3557B.c0("<this>", c5977aArr);
            int length = c5977aArr.length;
            Object[] copyOf = Arrays.copyOf(c5977aArr, length + 1);
            System.arraycopy(c5977aArr2, 0, copyOf, length, 1);
            AbstractC3557B.Z(copyOf);
            C5276a c5276a = new C5276a((C5977a[]) copyOf, c4196f.f37114g, l10);
            if (Build.VERSION.SDK_INT >= 29) {
                c5094b = new C5094b(c5276a);
            } else {
                c5094b = new C5095c(c5276a);
            }
        } else {
            c5094b = new Object();
        }
        this.f37152m = c5094b;
        y6.i iVar = c4196f.f37116i;
        if (iVar != null) {
            this.f37153n = iVar;
        }
        int i10 = c4196f.f37125r;
        if (i10 != 4) {
            this.f37154o = new w6.a();
            this.f37155p = new w6.a();
            this.f37156q = new w6.a();
            long d10 = AbstractC2469q0.d(i10);
            this.f37158s = new N5.a(dVar.l());
            o oVar = new o(this.f37140a, new w6.b(dVar.l()), this.f37154o, this.f37158s, d10);
            ScheduledExecutorService scheduledExecutorService = this.f37158s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            H.n0(scheduledExecutorService, "Vitals monitoring", d10, timeUnit, dVar.l(), oVar);
            H.n0(this.f37158s, "Vitals monitoring", d10, timeUnit, dVar.l(), new o(this.f37140a, new w6.j(dVar.l()), this.f37155p, this.f37158s, d10));
            w6.f fVar = new w6.f(this.f37156q, dVar.l());
            Context context2 = this.f37161v;
            if (context2 != null) {
                if (context2 instanceof Application) {
                    application = (Application) context2;
                } else {
                    application = null;
                }
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(fVar);
                }
            } else {
                AbstractC3557B.C2("appContext");
                throw null;
            }
        }
        this.f37160u = new RunnableC4338b(dVar, new Handler(Looper.getMainLooper()));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("newSingleThreadExecutor()", newSingleThreadExecutor);
        this.f37159t = newSingleThreadExecutor;
        AbstractC5091c l11 = dVar.l();
        RunnableC4338b runnableC4338b = this.f37160u;
        if (runnableC4338b != null) {
            AbstractC3557B.c0("internalLogger", l11);
            try {
                newSingleThreadExecutor.execute(runnableC4338b);
            } catch (RejectedExecutionException e10) {
                P4.a.l0(l11, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C5843c("ANR detection", 21), e10, 48);
            }
            this.f37152m.b(dVar, context);
            this.f37151l.b(dVar, context);
            this.f37153n.b(dVar, context);
            this.f37157r = c4196f.f37126s;
            dVar.b(this.f37164y, this);
            this.f37145f.set(true);
            return;
        }
        AbstractC3557B.C2("anrDetectorRunnable");
        throw null;
    }

    @Override // r5.AbstractC5366a
    public final String getName() {
        return this.f37164y;
    }
}
