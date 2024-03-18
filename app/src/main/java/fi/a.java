package Fi;

import Gi.c;
import java.util.Queue;

/* loaded from: classes.dex */
public final class a implements Ei.a {

    /* renamed from: Y  reason: collision with root package name */
    public String f5407Y;

    /* renamed from: Z  reason: collision with root package name */
    public c f5408Z;

    /* renamed from: h0  reason: collision with root package name */
    public Queue f5409h0;

    @Override // Ei.a
    public final void a(String str) {
        d();
    }

    @Override // Ei.a
    public final void b(String str) {
        d();
    }

    @Override // Ei.a
    public final void c(String str) {
        d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Fi.b, java.lang.Object] */
    public final void d() {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.f5410a = this.f5408Z;
        Thread.currentThread().getName();
        this.f5409h0.add(obj);
    }

    @Override // Ei.a
    public final String getName() {
        return this.f5407Y;
    }
}
