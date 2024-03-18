package Di;

import Ci.d;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Ci.c f3728a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3729b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3730c;

    public a(Ci.c cVar, int i10, int i11) {
        this.f3728a = cVar;
        this.f3729b = i10;
        this.f3730c = i11;
    }

    @Override // Ci.d
    public final int getBeginIndex() {
        return this.f3729b;
    }

    @Override // Ci.d
    public final int getEndIndex() {
        return this.f3730c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Link{type=");
        sb2.append(this.f3728a);
        sb2.append(", beginIndex=");
        sb2.append(this.f3729b);
        sb2.append(", endIndex=");
        return android.gov.nist.core.a.l(sb2, this.f3730c, "}");
    }
}
