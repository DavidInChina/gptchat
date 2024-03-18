package jf;

import id.AbstractC3557B;

/* renamed from: jf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3956f implements Comparable {

    /* renamed from: j0  reason: collision with root package name */
    public static final C3956f f36147j0 = new C3956f(1, 9, 22);

    /* renamed from: Y  reason: collision with root package name */
    public final int f36148Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f36149Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f36150h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f36151i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Cf.g, Cf.e] */
    public C3956f(int i10, int i11, int i12) {
        this.f36148Y = i10;
        this.f36149Z = i11;
        this.f36150h0 = i12;
        if (new Cf.e(0, 255, 1).s(i10) && new Cf.e(0, 255, 1).s(i11) && new Cf.e(0, 255, 1).s(i12)) {
            this.f36151i0 = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3956f c3956f = (C3956f) obj;
        AbstractC3557B.c0("other", c3956f);
        return this.f36151i0 - c3956f.f36151i0;
    }

    public final boolean equals(Object obj) {
        C3956f c3956f;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3956f) {
            c3956f = (C3956f) obj;
        } else {
            c3956f = null;
        }
        if (c3956f != null && this.f36151i0 == c3956f.f36151i0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36151i0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36148Y);
        sb2.append('.');
        sb2.append(this.f36149Z);
        sb2.append('.');
        sb2.append(this.f36150h0);
        return sb2.toString();
    }
}
