package Sf;

import bg.AbstractC2206n;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes.dex */
public final class B extends D implements AbstractC2206n {

    /* renamed from: a  reason: collision with root package name */
    public final Class f16589a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.v f16590b = kf.v.f37483Y;

    public B(Class cls) {
        AbstractC3557B.c0("reflectType", cls);
        this.f16589a = cls;
    }

    @Override // Sf.D
    public final Type a() {
        return this.f16589a;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        return this.f16590b;
    }
}
