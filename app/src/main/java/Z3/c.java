package z3;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f51573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f51574Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f51575h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f51576i0;

    public c(String str, int i10, int i11, String str2) {
        this.f51573Y = i10;
        this.f51574Z = i11;
        this.f51575h0 = str;
        this.f51576i0 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("other", cVar);
        int i10 = this.f51573Y - cVar.f51573Y;
        if (i10 == 0) {
            return this.f51574Z - cVar.f51574Z;
        }
        return i10;
    }
}
