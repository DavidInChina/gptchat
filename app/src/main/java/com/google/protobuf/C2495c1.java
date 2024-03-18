package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2495c1 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2495c1 f27531c = new C2495c1();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f27533b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final E0 f27532a = new E0();

    public final AbstractC2504f1 a(Class cls) {
        AbstractC2504f1 abstractC2504f1;
        Q0 q02;
        Class cls2;
        AbstractC2536r0.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.f27533b;
        AbstractC2504f1 abstractC2504f12 = (AbstractC2504f1) concurrentHashMap.get(cls);
        if (abstractC2504f12 == null) {
            E0 e02 = this.f27532a;
            e02.getClass();
            Class cls3 = AbstractC2507g1.f27547a;
            if (!AbstractC2497d0.class.isAssignableFrom(cls) && (cls2 = AbstractC2507g1.f27547a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            J0 a5 = e02.f27394a.a(cls);
            C2501e1 c2501e1 = (C2501e1) a5;
            if ((c2501e1.f27543d & 2) == 2) {
                boolean isAssignableFrom = AbstractC2497d0.class.isAssignableFrom(cls);
                M0 m02 = c2501e1.f27540a;
                if (isAssignableFrom) {
                    q02 = new Q0(AbstractC2507g1.f27550d, L.f27417a, m02);
                } else {
                    w1 w1Var = AbstractC2507g1.f27548b;
                    K k10 = L.f27418b;
                    if (k10 != null) {
                        q02 = new Q0(w1Var, k10, m02);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                abstractC2504f1 = q02;
            } else if (AbstractC2497d0.class.isAssignableFrom(cls)) {
                if (c2501e1.d() == 1) {
                    abstractC2504f1 = P0.E(a5, W0.f27505b, AbstractC2552z0.f27649b, AbstractC2507g1.f27550d, L.f27417a, I0.f27413b);
                } else {
                    abstractC2504f1 = P0.E(a5, W0.f27505b, AbstractC2552z0.f27649b, AbstractC2507g1.f27550d, null, I0.f27413b);
                }
            } else if (c2501e1.d() == 1) {
                V0 v02 = W0.f27504a;
                C2548x0 c2548x0 = AbstractC2552z0.f27648a;
                w1 w1Var2 = AbstractC2507g1.f27548b;
                K k11 = L.f27418b;
                if (k11 != null) {
                    abstractC2504f1 = P0.E(a5, v02, c2548x0, w1Var2, k11, I0.f27412a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                abstractC2504f1 = P0.E(a5, W0.f27504a, AbstractC2552z0.f27648a, AbstractC2507g1.f27549c, null, I0.f27412a);
            }
            AbstractC2504f1 abstractC2504f13 = (AbstractC2504f1) concurrentHashMap.putIfAbsent(cls, abstractC2504f1);
            if (abstractC2504f13 != null) {
                return abstractC2504f13;
            }
            return abstractC2504f1;
        }
        return abstractC2504f12;
    }

    public final AbstractC2504f1 b(Object obj) {
        return a(obj.getClass());
    }
}
