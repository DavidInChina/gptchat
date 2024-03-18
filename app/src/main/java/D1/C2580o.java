package d1;

/* renamed from: d1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2580o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27884a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27885b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC2588w f27886c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27887d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27888e;

    public /* synthetic */ C2580o(boolean z10, int i10) {
        this((i10 & 1) != 0, (i10 & 2) != 0, EnumC2588w.f27923Y, z10, (i10 & 16) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2580o)) {
            return false;
        }
        C2580o c2580o = (C2580o) obj;
        if (this.f27884a == c2580o.f27884a && this.f27885b == c2580o.f27885b && this.f27886c == c2580o.f27886c && this.f27887d == c2580o.f27887d && this.f27888e == c2580o.f27888e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 1237;
        if (this.f27884a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = i10 * 31;
        if (this.f27885b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int hashCode = (this.f27886c.hashCode() + ((i14 + i11) * 31)) * 31;
        if (this.f27887d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i15 = (hashCode + i12) * 31;
        if (this.f27888e) {
            i13 = 1231;
        }
        return i15 + i13;
    }

    public C2580o(boolean z10, boolean z11, EnumC2588w enumC2588w, boolean z12, boolean z13) {
        this.f27884a = z10;
        this.f27885b = z11;
        this.f27886c = enumC2588w;
        this.f27887d = z12;
        this.f27888e = z13;
    }

    public C2580o() {
        this(true, true, EnumC2588w.f27923Y, true, true);
    }
}
