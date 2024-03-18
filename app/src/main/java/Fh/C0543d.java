package Fh;

/* renamed from: Fh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.vendor.b f5388a;

    public C0543d(io.sentry.vendor.b bVar) {
        this.f5388a = bVar;
    }

    @Override // Fh.i
    public final io.sentry.vendor.b a(int i10, String str, String str2, boolean z10) {
        return this.f5388a.y(i10, I5.h.c(str2), str, z10);
    }

    @Override // Fh.i
    public final io.sentry.vendor.b b(String str, boolean z10) {
        return this.f5388a.d(str, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0543d.class != obj.getClass()) {
            return false;
        }
        if (this.f5388a.equals(((C0543d) obj).f5388a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5388a.hashCode() + (C0543d.class.hashCode() * 31);
    }
}
