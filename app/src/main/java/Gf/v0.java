package Gf;

import java.lang.ref.SoftReference;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class v0 implements AbstractC6216a {

    /* renamed from: h0  reason: collision with root package name */
    public static final Cf.h f6482h0 = new Cf.h(3);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6216a f6483Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile SoftReference f6484Z;

    public v0(Object obj, AbstractC6216a abstractC6216a) {
        if (abstractC6216a != null) {
            this.f6484Z = null;
            this.f6483Y = abstractC6216a;
            if (obj != null) {
                this.f6484Z = new SoftReference(obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object obj;
        SoftReference softReference = this.f6484Z;
        Cf.h hVar = f6482h0;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == hVar) {
                return null;
            }
            return obj;
        }
        Object mo122invoke = this.f6483Y.mo122invoke();
        if (mo122invoke != null) {
            hVar = mo122invoke;
        }
        this.f6484Z = new SoftReference(hVar);
        return mo122invoke;
    }
}
