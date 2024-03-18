package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2014c0 f25030c = new C2014c0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f25032b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final N f25031a = new N();

    public final AbstractC2022g0 a(Class cls) {
        AbstractC2022g0 abstractC2022g0;
        X x10;
        Class cls2;
        B.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.f25032b;
        AbstractC2022g0 abstractC2022g02 = (AbstractC2022g0) concurrentHashMap.get(cls);
        if (abstractC2022g02 == null) {
            N n10 = this.f25031a;
            n10.getClass();
            Class cls3 = h0.f25053a;
            if (!AbstractC2040z.class.isAssignableFrom(cls) && (cls2 = h0.f25053a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            T a5 = n10.f24998a.a(cls);
            C2018e0 c2018e0 = (C2018e0) a5;
            if ((c2018e0.f25048d & 2) == 2) {
                boolean isAssignableFrom = AbstractC2040z.class.isAssignableFrom(cls);
                AbstractC2011b abstractC2011b = c2018e0.f25045a;
                if (isAssignableFrom) {
                    x10 = new X(h0.f25056d, AbstractC2034t.f25113a, abstractC2011b);
                } else {
                    p0 p0Var = h0.f25054b;
                    C2033s c2033s = AbstractC2034t.f25114b;
                    if (c2033s != null) {
                        x10 = new X(p0Var, c2033s, abstractC2011b);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                abstractC2022g0 = x10;
            } else if (AbstractC2040z.class.isAssignableFrom(cls)) {
                if (c2018e0.d() == 1) {
                    abstractC2022g0 = W.x(a5, Z.f25028b, K.f24995b, h0.f25056d, AbstractC2034t.f25113a, S.f25005b);
                } else {
                    abstractC2022g0 = W.x(a5, Z.f25028b, K.f24995b, h0.f25056d, null, S.f25005b);
                }
            } else if (c2018e0.d() == 1) {
                Y y10 = Z.f25027a;
                I i10 = K.f24994a;
                p0 p0Var2 = h0.f25054b;
                C2033s c2033s2 = AbstractC2034t.f25114b;
                if (c2033s2 != null) {
                    abstractC2022g0 = W.x(a5, y10, i10, p0Var2, c2033s2, S.f25004a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                abstractC2022g0 = W.x(a5, Z.f25027a, K.f24994a, h0.f25055c, null, S.f25004a);
            }
            AbstractC2022g0 abstractC2022g03 = (AbstractC2022g0) concurrentHashMap.putIfAbsent(cls, abstractC2022g0);
            if (abstractC2022g03 != null) {
                return abstractC2022g03;
            }
            return abstractC2022g0;
        }
        return abstractC2022g02;
    }
}
