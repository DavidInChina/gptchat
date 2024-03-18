package Gf;

import id.AbstractC3557B;

/* renamed from: Gf.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0629c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0630d f6399a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0630d f6400b = new C0630d(C0627b.f6388k0);

    /* renamed from: c  reason: collision with root package name */
    public static final C0630d f6401c = new C0630d(C0627b.f6384Z);

    /* renamed from: d  reason: collision with root package name */
    public static final C0630d f6402d = new C0630d(C0627b.f6385h0);

    static {
        C0627b c0627b = C0627b.f6387j0;
        int i10 = AbstractC0625a.f6382a;
        f6399a = new C0630d(c0627b);
        new C0630d(C0627b.f6386i0);
    }

    public static final B a(Class cls) {
        AbstractC3557B.c0("jClass", cls);
        Object Z02 = f6399a.Z0(cls);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>", Z02);
        return (B) Z02;
    }
}
