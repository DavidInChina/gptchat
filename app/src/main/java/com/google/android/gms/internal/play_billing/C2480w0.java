package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2480w0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2480w0 f26985c = new C2480w0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f26987b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final C2455j0 f26986a = new C2455j0();

    public final AbstractC2486z0 a(Class cls) {
        C2472s0 c2472s0;
        Class cls2;
        Charset charset = Y.f26890a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f26987b;
            AbstractC2486z0 abstractC2486z0 = (AbstractC2486z0) concurrentHashMap.get(cls);
            if (abstractC2486z0 == null) {
                C2455j0 c2455j0 = this.f26986a;
                c2455j0.getClass();
                Class cls3 = A0.f26825a;
                if (!Q.class.isAssignableFrom(cls) && (cls2 = A0.f26825a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                AbstractC2463n0 a5 = c2455j0.f26934a.a(cls);
                C2484y0 c2484y0 = (C2484y0) a5;
                if ((c2484y0.f26995d & 2) == 2) {
                    boolean isAssignableFrom = Q.class.isAssignableFrom(cls);
                    AbstractC2481x abstractC2481x = c2484y0.f26992a;
                    if (isAssignableFrom) {
                        c2472s0 = new C2472s0(A0.f26827c, L.f26860a, abstractC2481x);
                    } else {
                        D0 d02 = A0.f26826b;
                        K k10 = L.f26861b;
                        if (k10 != null) {
                            c2472s0 = new C2472s0(d02, k10, abstractC2481x);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    abstractC2486z0 = c2472s0;
                } else if (Q.class.isAssignableFrom(cls)) {
                    if (c2484y0.b() - 1 != 1) {
                        int i10 = AbstractC2476u0.f26976a;
                        C2447f0 c2447f0 = AbstractC2449g0.f26924b;
                        D0 d03 = A0.f26827c;
                        K k11 = L.f26860a;
                        int i11 = AbstractC2461m0.f26944a;
                        abstractC2486z0 = C2470r0.u(a5, c2447f0, d03, k11);
                    } else {
                        int i12 = AbstractC2476u0.f26976a;
                        C2447f0 c2447f02 = AbstractC2449g0.f26924b;
                        D0 d04 = A0.f26827c;
                        int i13 = AbstractC2461m0.f26944a;
                        abstractC2486z0 = C2470r0.u(a5, c2447f02, d04, null);
                    }
                } else if (c2484y0.b() - 1 != 1) {
                    int i14 = AbstractC2476u0.f26976a;
                    C2445e0 c2445e0 = AbstractC2449g0.f26923a;
                    D0 d05 = A0.f26826b;
                    K k12 = L.f26861b;
                    if (k12 != null) {
                        int i15 = AbstractC2461m0.f26944a;
                        abstractC2486z0 = C2470r0.u(a5, c2445e0, d05, k12);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    int i16 = AbstractC2476u0.f26976a;
                    C2445e0 c2445e02 = AbstractC2449g0.f26923a;
                    D0 d06 = A0.f26826b;
                    int i17 = AbstractC2461m0.f26944a;
                    abstractC2486z0 = C2470r0.u(a5, c2445e02, d06, null);
                }
                AbstractC2486z0 abstractC2486z02 = (AbstractC2486z0) concurrentHashMap.putIfAbsent(cls, abstractC2486z0);
                if (abstractC2486z02 != null) {
                    return abstractC2486z02;
                }
            }
            return abstractC2486z0;
        }
        throw new NullPointerException("messageType");
    }
}
