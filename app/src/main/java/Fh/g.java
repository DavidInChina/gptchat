package Fh;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.vendor.b f5392a;

    public g(io.sentry.vendor.b bVar) {
        this.f5392a = bVar;
    }

    @Override // Fh.i
    public final io.sentry.vendor.b a(int i10, String str, String str2, boolean z10) {
        return this.f5392a.y(i10, I5.h.c(str2), str, z10);
    }

    @Override // Fh.i
    public final io.sentry.vendor.b b(String str, boolean z10) {
        return this.f5392a.d(str, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        if (this.f5392a.equals(((g) obj).f5392a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5392a.hashCode() + (g.class.hashCode() * 31);
    }
}
