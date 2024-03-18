package wi;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f48616a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48617b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48618c;

    public w(int i10, int i11, int i12) {
        this.f48616a = i10;
        this.f48617b = i11;
        this.f48618c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f48616a == wVar.f48616a && this.f48617b == wVar.f48617b && this.f48618c == wVar.f48618c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f48616a), Integer.valueOf(this.f48617b), Integer.valueOf(this.f48618c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SourceSpan{line=");
        sb2.append(this.f48616a);
        sb2.append(", column=");
        sb2.append(this.f48617b);
        sb2.append(", length=");
        return android.gov.nist.core.a.l(sb2, this.f48618c, "}");
    }
}
