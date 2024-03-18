package o6;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import m6.C4564c;
import n6.C4717a;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5274d;
import t5.AbstractC5675a;
import u5.C5843c;
import x6.AbstractC6287d;
import x6.C6297g0;
import x6.C6310k1;
import x6.Z0;
import yf.AbstractC6583a;
import z6.C6777c;

/* loaded from: classes2.dex */
public final class L implements M {

    /* renamed from: a  reason: collision with root package name */
    public final u5.g f40670a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40671b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40672c;

    /* renamed from: d  reason: collision with root package name */
    public final String f40673d;

    /* renamed from: e  reason: collision with root package name */
    public final D5.a f40674e;

    /* renamed from: f  reason: collision with root package name */
    public final k5.F f40675f;

    /* renamed from: g  reason: collision with root package name */
    public final float f40676g;

    /* renamed from: h  reason: collision with root package name */
    public final String f40677h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f40678i;

    /* renamed from: j  reason: collision with root package name */
    public final C4562a f40679j;

    /* renamed from: k  reason: collision with root package name */
    public final long f40680k;

    /* renamed from: l  reason: collision with root package name */
    public final long f40681l;

    /* renamed from: m  reason: collision with root package name */
    public final C5274d f40682m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f40683n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f40684o;

    public L(M m10, u5.g gVar, String str, int i10, String str2, C4564c c4564c, Map map, long j6, D5.a aVar, k5.F f6, float f10) {
        AbstractC3557B.c0("parentScope", m10);
        AbstractC3557B.c0("url", str);
        AbstractC2469q0.q("method", i10);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
        AbstractC3557B.c0("eventTime", c4564c);
        AbstractC3557B.c0("initialAttributes", map);
        this.f40670a = gVar;
        this.f40671b = str;
        this.f40672c = i10;
        this.f40673d = str2;
        this.f40674e = aVar;
        this.f40675f = f6;
        this.f40676g = f10;
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        this.f40677h = uuid;
        LinkedHashMap m12 = AbstractC4268D.m1(map);
        m12.putAll(i6.b.a(gVar).h());
        this.f40678i = m12;
        this.f40679j = m10.c();
        this.f40680k = c4564c.f38961a + j6;
        this.f40681l = c4564c.f38962b;
        this.f40682m = gVar.d();
    }

    @Override // o6.M
    public final boolean a() {
        return !this.f40684o;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0385  */
    @Override // o6.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        M m10;
        L l10;
        C6297g0 c6297g0;
        M m11;
        int i10;
        String str;
        String str2;
        String str3;
        Number number;
        C6310k1 c6310k1;
        int i11;
        Map map;
        C4717a c4717a;
        String str4;
        String str5;
        String str6;
        String str7;
        Z0 z02;
        int i12;
        C4717a c4717a2;
        long j6;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        b0 b0Var;
        Number number2;
        Long l11;
        Number number3;
        Long l12;
        String str8;
        L l13 = this;
        AbstractC3557B.c0("writer", abstractC5675a);
        boolean z10 = aVar instanceof E;
        LinkedHashMap linkedHashMap = l13.f40678i;
        C4562a c4562a = l13.f40679j;
        u5.g gVar = l13.f40670a;
        String str9 = l13.f40673d;
        if (z10) {
            E e10 = (E) aVar;
            if (AbstractC3557B.K(str9, e10.f40627j)) {
                l13.f40684o = true;
                linkedHashMap.putAll(e10.f40631n);
                linkedHashMap.putAll(i6.b.a(gVar).h());
                Object remove = linkedHashMap.remove("_dd.trace_id");
                if (remove != null) {
                    str2 = remove.toString();
                } else {
                    str2 = null;
                }
                Object remove2 = linkedHashMap.remove("_dd.span_id");
                if (remove2 != null) {
                    str3 = remove2.toString();
                } else {
                    str3 = null;
                }
                Object remove3 = linkedHashMap.remove("_dd.rule_psr");
                if (remove3 instanceof Number) {
                    number = (Number) remove3;
                } else {
                    number = null;
                }
                String str10 = c4562a.f38955k;
                if (str10 != null && !Lg.n.n2(str10) && (str8 = c4562a.f38956l) != null && !Lg.n.n2(str8)) {
                    c6310k1 = new C6310k1(c4562a.f38955k, str8, null);
                } else {
                    c6310k1 = null;
                }
                if (c6310k1 == null) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                Object remove4 = linkedHashMap.remove("_dd.resource_timings");
                if (remove4 instanceof Map) {
                    map = (Map) remove4;
                } else {
                    map = null;
                }
                List list = AbstractC4922a.f40764a;
                if (map == null) {
                    c4717a = null;
                } else {
                    List list2 = AbstractC4922a.f40764a;
                    int n02 = P4.a.n0(AbstractC6583a.H1(list2, 10));
                    if (n02 < 16) {
                        n02 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(n02);
                    for (Object obj : list2) {
                        Object obj2 = map.get((String) obj);
                        if (obj2 != null && (obj2 instanceof Map)) {
                            Map map2 = (Map) obj2;
                            Object obj3 = map2.get("startTime");
                            if (obj3 instanceof Number) {
                                number2 = (Number) obj3;
                            } else {
                                number2 = null;
                            }
                            if (number2 != null) {
                                l11 = Long.valueOf(number2.longValue());
                            } else {
                                l11 = null;
                            }
                            Object obj4 = map2.get("duration");
                            if (obj4 instanceof Number) {
                                number3 = (Number) obj4;
                            } else {
                                number3 = null;
                            }
                            if (number3 != null) {
                                l12 = Long.valueOf(number3.longValue());
                            } else {
                                l12 = null;
                            }
                            if (l11 != null && l12 != null) {
                                b0Var = new b0(l11.longValue(), l12.longValue());
                                linkedHashMap2.put(obj, b0Var);
                            }
                        }
                        b0Var = null;
                        linkedHashMap2.put(obj, b0Var);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        if (((b0) entry.getValue()) != null) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap3.isEmpty()) {
                        b0 b0Var2 = (b0) linkedHashMap3.get("firstByte");
                        long j18 = 0;
                        if (b0Var2 != null) {
                            j6 = b0Var2.f40807a;
                        } else {
                            j6 = 0;
                        }
                        b0 b0Var3 = (b0) linkedHashMap3.get("firstByte");
                        if (b0Var3 != null) {
                            j10 = b0Var3.f40808b;
                        } else {
                            j10 = 0;
                        }
                        b0 b0Var4 = (b0) linkedHashMap3.get("download");
                        if (b0Var4 != null) {
                            j11 = b0Var4.f40807a;
                        } else {
                            j11 = 0;
                        }
                        b0 b0Var5 = (b0) linkedHashMap3.get("download");
                        if (b0Var5 != null) {
                            j12 = b0Var5.f40808b;
                        } else {
                            j12 = 0;
                        }
                        b0 b0Var6 = (b0) linkedHashMap3.get("dns");
                        if (b0Var6 != null) {
                            j13 = b0Var6.f40807a;
                        } else {
                            j13 = 0;
                        }
                        b0 b0Var7 = (b0) linkedHashMap3.get("dns");
                        if (b0Var7 != null) {
                            j14 = b0Var7.f40808b;
                        } else {
                            j14 = 0;
                        }
                        b0 b0Var8 = (b0) linkedHashMap3.get("connect");
                        if (b0Var8 != null) {
                            j15 = b0Var8.f40807a;
                        } else {
                            j15 = 0;
                        }
                        b0 b0Var9 = (b0) linkedHashMap3.get("connect");
                        if (b0Var9 != null) {
                            j16 = b0Var9.f40808b;
                        } else {
                            j16 = 0;
                        }
                        b0 b0Var10 = (b0) linkedHashMap3.get("ssl");
                        if (b0Var10 != null) {
                            j17 = b0Var10.f40807a;
                        } else {
                            j17 = 0;
                        }
                        b0 b0Var11 = (b0) linkedHashMap3.get("ssl");
                        if (b0Var11 != null) {
                            j18 = b0Var11.f40808b;
                        }
                        c4717a2 = new C4717a(j13, j14, j15, j16, j17, j18, j6, j10, j11, j12);
                    } else {
                        c4717a2 = null;
                    }
                    c4717a = c4717a2;
                }
                Object remove5 = linkedHashMap.remove("_dd.graphql.operation_type");
                if (remove5 instanceof String) {
                    str4 = (String) remove5;
                } else {
                    str4 = null;
                }
                Object remove6 = linkedHashMap.remove("_dd.graphql.operation_name");
                if (remove6 instanceof String) {
                    str5 = (String) remove6;
                } else {
                    str5 = null;
                }
                Object remove7 = linkedHashMap.remove("_dd.graphql.payload");
                if (remove7 instanceof String) {
                    str6 = (String) remove7;
                } else {
                    str6 = null;
                }
                Object remove8 = linkedHashMap.remove("_dd.graphql.variables");
                if (remove8 instanceof String) {
                    str7 = (String) remove8;
                } else {
                    str7 = null;
                }
                if (str4 != null) {
                    AbstractC5091c l14 = gVar.l();
                    AbstractC3557B.c0("internalLogger", l14);
                    try {
                        Locale locale = Locale.US;
                        AbstractC3557B.b0("US", locale);
                        String upperCase = str4.toUpperCase(locale);
                        AbstractC3557B.b0("this as java.lang.String).toUpperCase(locale)", upperCase);
                        i12 = AbstractC6287d.j0(upperCase);
                    } catch (IllegalArgumentException e11) {
                        P4.a.l0(l14, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C5843c(str4, 29), e11, 48);
                        i12 = 0;
                    }
                    if (i12 != 0) {
                        z02 = new Z0(i12, str5, str6, str7);
                        C6777c q02 = P4.a.q0(gVar, abstractC5675a, new K(this, c4562a, e10.f40632o, e10.f40630m, c4717a, e10.f40628k, e10.f40629l, z02, i11, AbstractC4268D.m1(linkedHashMap), str3, str2, number, c6310k1));
                        q02.f51750e = new J(c4562a, 2);
                        q02.f51751f = new J(c4562a, 3);
                        q02.b();
                        l13 = this;
                        l13.f40683n = true;
                    }
                }
                z02 = null;
                C6777c q022 = P4.a.q0(gVar, abstractC5675a, new K(this, c4562a, e10.f40632o, e10.f40630m, c4717a, e10.f40628k, e10.f40629l, z02, i11, AbstractC4268D.m1(linkedHashMap), str3, str2, number, c6310k1));
                q022.f51750e = new J(c4562a, 2);
                q022.f51751f = new J(c4562a, 3);
                q022.b();
                l13 = this;
                l13.f40683n = true;
            }
        } else if (aVar instanceof F) {
            F f6 = (F) aVar;
            if (AbstractC3557B.K(str9, f6.f40633j)) {
                linkedHashMap.putAll(f6.f40638o);
                Throwable th2 = f6.f40637n;
                String J02 = AbstractC4344b.J0(th2);
                String canonicalName = th2.getClass().getCanonicalName();
                linkedHashMap.putAll(i6.b.a(gVar).h());
                LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap);
                String str11 = c4562a.f38955k;
                if (str11 == null || Lg.n.n2(str11) || (str = c4562a.f38956l) == null || Lg.n.n2(str)) {
                    m11 = null;
                    c6297g0 = null;
                } else {
                    m11 = null;
                    c6297g0 = new C6297g0(c4562a.f38955k, str, null);
                }
                if (c6297g0 == null) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                m10 = m11;
                C6777c q03 = P4.a.q0(gVar, abstractC5675a, new I(this, c4562a, f6.f40636m, f6.f40634k, f6.f40635l, J02, canonicalName, i10, m12, c6297g0));
                q03.f51750e = new J(c4562a, 0);
                q03.f51751f = new J(c4562a, 1);
                q03.b();
                l10 = this;
                l10.f40683n = true;
                if (!l10.f40683n) {
                    return m10;
                }
                return l10;
            }
        }
        l10 = l13;
        m10 = null;
        if (!l10.f40683n) {
        }
    }

    @Override // o6.M
    public final C4562a c() {
        return this.f40679j;
    }
}
