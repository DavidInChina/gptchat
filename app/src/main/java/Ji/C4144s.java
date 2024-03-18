package ji;

import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;

/* renamed from: ji.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4144s extends C4124M {

    /* renamed from: e  reason: collision with root package name */
    public C4124M f36740e;

    public C4144s(C4124M c4124m) {
        AbstractC3557B.c0("delegate", c4124m);
        this.f36740e = c4124m;
    }

    @Override // ji.C4124M
    public final C4124M a() {
        return this.f36740e.a();
    }

    @Override // ji.C4124M
    public final C4124M b() {
        return this.f36740e.b();
    }

    @Override // ji.C4124M
    public final long c() {
        return this.f36740e.c();
    }

    @Override // ji.C4124M
    public final C4124M d(long j6) {
        return this.f36740e.d(j6);
    }

    @Override // ji.C4124M
    public final boolean e() {
        return this.f36740e.e();
    }

    @Override // ji.C4124M
    public final void f() {
        this.f36740e.f();
    }

    @Override // ji.C4124M
    public final C4124M g(long j6, TimeUnit timeUnit) {
        AbstractC3557B.c0("unit", timeUnit);
        return this.f36740e.g(j6, timeUnit);
    }

    @Override // ji.C4124M
    public final long h() {
        return this.f36740e.h();
    }
}
