package Fh;

/* renamed from: Fh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0545f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Nh.l f5390a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5391b;

    public C0545f(int i10, Nh.l lVar) {
        this.f5390a = lVar;
        this.f5391b = i10;
    }

    @Override // Fh.i
    public final io.sentry.vendor.b a(int i10, String str, String str2, boolean z10) {
        return this.f5390a.G(i10, I5.h.c(str2), str, z10);
    }

    @Override // Fh.i
    public final io.sentry.vendor.b b(String str, boolean z10) {
        return this.f5390a.C(str, this.f5391b, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0545f.class != obj.getClass()) {
            return false;
        }
        C0545f c0545f = (C0545f) obj;
        if (this.f5391b == c0545f.f5391b && this.f5390a.equals(c0545f.f5390a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5390a.hashCode() + (C0545f.class.hashCode() * 31)) * 31) + this.f5391b;
    }
}
