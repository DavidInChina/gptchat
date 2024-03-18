package Fh;

/* loaded from: classes2.dex */
public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.vendor.b f5393a;

    public h(io.sentry.vendor.b bVar) {
        this.f5393a = bVar;
    }

    @Override // Fh.i
    public final io.sentry.vendor.b a(int i10, String str, String str2, boolean z10) {
        return this.f5393a.y(i10, I5.h.c(str2), str, z10);
    }

    @Override // Fh.i
    public final io.sentry.vendor.b b(String str, boolean z10) {
        return this.f5393a.d(str, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        if (this.f5393a.equals(((h) obj).f5393a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5393a.hashCode() + (h.class.hashCode() * 31);
    }
}
