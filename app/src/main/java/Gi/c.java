package Gi;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class c implements Ei.a {

    /* renamed from: Y  reason: collision with root package name */
    public final String f6509Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Ei.a f6510Z;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f6511h0;

    /* renamed from: i0  reason: collision with root package name */
    public Method f6512i0;

    /* renamed from: j0  reason: collision with root package name */
    public Fi.a f6513j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Queue f6514k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f6515l0;

    public c(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z10) {
        this.f6509Y = str;
        this.f6514k0 = linkedBlockingQueue;
        this.f6515l0 = z10;
    }

    @Override // Ei.a
    public final void a(String str) {
        d().a(str);
    }

    @Override // Ei.a
    public final void b(String str) {
        d().b(str);
    }

    @Override // Ei.a
    public final void c(String str) {
        d().c(str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Fi.a, java.lang.Object] */
    public final Ei.a d() {
        if (this.f6510Z != null) {
            return this.f6510Z;
        }
        if (this.f6515l0) {
            return b.f6508Y;
        }
        if (this.f6513j0 == null) {
            ?? obj = new Object();
            obj.f5408Z = this;
            obj.f5407Y = this.f6509Y;
            obj.f5409h0 = this.f6514k0;
            this.f6513j0 = obj;
        }
        return this.f6513j0;
    }

    public final boolean e() {
        Boolean bool = this.f6511h0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f6512i0 = this.f6510Z.getClass().getMethod("log", Fi.b.class);
            this.f6511h0 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f6511h0 = Boolean.FALSE;
        }
        return this.f6511h0.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && this.f6509Y.equals(((c) obj).f6509Y)) {
            return true;
        }
        return false;
    }

    @Override // Ei.a
    public final String getName() {
        return this.f6509Y;
    }

    public final int hashCode() {
        return this.f6509Y.hashCode();
    }
}
