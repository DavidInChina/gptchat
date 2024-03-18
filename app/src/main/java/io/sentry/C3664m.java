package io.sentry;

/* renamed from: io.sentry.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3664m implements H {

    /* renamed from: Y  reason: collision with root package name */
    public final r1 f34422Y;

    /* renamed from: Z  reason: collision with root package name */
    public final H f34423Z;

    public C3664m(r1 r1Var, H h10) {
        Ad.l.Z0("SentryOptions is required.", r1Var);
        this.f34422Y = r1Var;
        this.f34423Z = h10;
    }

    @Override // io.sentry.H
    public final void b(EnumC3642e1 enumC3642e1, Throwable th2, String str, Object... objArr) {
        H h10 = this.f34423Z;
        if (h10 != null && g(enumC3642e1)) {
            h10.b(enumC3642e1, th2, str, objArr);
        }
    }

    @Override // io.sentry.H
    public final void d(EnumC3642e1 enumC3642e1, String str, Throwable th2) {
        H h10 = this.f34423Z;
        if (h10 != null && g(enumC3642e1)) {
            h10.d(enumC3642e1, str, th2);
        }
    }

    @Override // io.sentry.H
    public final void f(EnumC3642e1 enumC3642e1, String str, Object... objArr) {
        H h10 = this.f34423Z;
        if (h10 != null && g(enumC3642e1)) {
            h10.f(enumC3642e1, str, objArr);
        }
    }

    @Override // io.sentry.H
    public final boolean g(EnumC3642e1 enumC3642e1) {
        r1 r1Var = this.f34422Y;
        EnumC3642e1 diagnosticLevel = r1Var.getDiagnosticLevel();
        if (enumC3642e1 == null || !r1Var.isDebug() || enumC3642e1.ordinal() < diagnosticLevel.ordinal()) {
            return false;
        }
        return true;
    }
}
