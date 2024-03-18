package xe;

import id.AbstractC3557B;

/* renamed from: xe.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6397B {

    /* renamed from: d  reason: collision with root package name */
    public static final C6397B f49818d = new C6397B("HTTP", 2, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final C6397B f49819e = new C6397B("HTTP", 1, 1);

    /* renamed from: f  reason: collision with root package name */
    public static final C6397B f49820f = new C6397B("HTTP", 1, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final C6397B f49821g = new C6397B("SPDY", 3, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final C6397B f49822h = new C6397B("QUIC", 1, 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f49823a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49824b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49825c;

    public C6397B(String str, int i10, int i11) {
        this.f49823a = str;
        this.f49824b = i10;
        this.f49825c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6397B)) {
            return false;
        }
        C6397B c6397b = (C6397B) obj;
        if (AbstractC3557B.K(this.f49823a, c6397b.f49823a) && this.f49824b == c6397b.f49824b && this.f49825c == c6397b.f49825c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f49823a.hashCode() * 31) + this.f49824b) * 31) + this.f49825c;
    }

    public final String toString() {
        return this.f49823a + '/' + this.f49824b + '.' + this.f49825c;
    }
}
