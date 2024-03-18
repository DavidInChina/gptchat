package Fh;

/* renamed from: Fh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Nh.l f5389a;

    public C0544e(Nh.l lVar) {
        this.f5389a = lVar;
    }

    @Override // Fh.i
    public final io.sentry.vendor.b a(int i10, String str, String str2, boolean z10) {
        return this.f5389a.G(i10, I5.h.c(str2), str, z10);
    }

    @Override // Fh.i
    public final io.sentry.vendor.b b(String str, boolean z10) {
        return this.f5389a.e(str, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0544e.class != obj.getClass()) {
            return false;
        }
        if (this.f5389a.equals(((C0544e) obj).f5389a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5389a.hashCode() + (C0544e.class.hashCode() * 31);
    }
}
