package W;

import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: W.n3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1590n3 implements B3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f20244a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20245b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20246c = true;

    /* renamed from: d  reason: collision with root package name */
    public final int f20247d;

    public C1590n3(String str, String str2, int i10) {
        this.f20244a = str;
        this.f20245b = str2;
        this.f20247d = i10;
    }

    @Override // W.B3
    public final String a() {
        return this.f20244a;
    }

    @Override // W.B3
    public final String b() {
        return this.f20245b;
    }

    @Override // W.B3
    public final int c() {
        return this.f20247d;
    }

    @Override // W.B3
    public final boolean d() {
        return this.f20246c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1590n3.class != obj.getClass()) {
            return false;
        }
        C1590n3 c1590n3 = (C1590n3) obj;
        if (AbstractC3557B.K(this.f20244a, c1590n3.f20244a) && AbstractC3557B.K(this.f20245b, c1590n3.f20245b) && this.f20246c == c1590n3.f20246c && this.f20247d == c1590n3.f20247d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f20244a.hashCode() * 31;
        String str = this.f20245b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f20246c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return AbstractC6708l.f(this.f20247d) + ((i12 + i11) * 31);
    }
}
