package s3;

import id.AbstractC3557B;

/* renamed from: s3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5557g {

    /* renamed from: a  reason: collision with root package name */
    public final T f45297a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f45298b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45299c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f45300d;

    public C5557g(T t10, boolean z10, Object obj, boolean z11) {
        if (!t10.f45275a && z10) {
            throw new IllegalArgumentException(t10.b().concat(" does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + t10.b() + " has null value but is not nullable.").toString());
        }
        this.f45297a = t10;
        this.f45298b = z10;
        this.f45300d = obj;
        this.f45299c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3557B.K(C5557g.class, obj.getClass())) {
            return false;
        }
        C5557g c5557g = (C5557g) obj;
        if (this.f45298b != c5557g.f45298b || this.f45299c != c5557g.f45299c || !AbstractC3557B.K(this.f45297a, c5557g.f45297a)) {
            return false;
        }
        Object obj2 = c5557g.f45300d;
        Object obj3 = this.f45300d;
        if (obj3 != null) {
            return AbstractC3557B.K(obj3, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((((this.f45297a.hashCode() * 31) + (this.f45298b ? 1 : 0)) * 31) + (this.f45299c ? 1 : 0)) * 31;
        Object obj = this.f45300d;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5557g.class.getSimpleName());
        sb2.append(" Type: " + this.f45297a);
        sb2.append(" Nullable: " + this.f45298b);
        if (this.f45299c) {
            sb2.append(" DefaultValue: " + this.f45300d);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }
}
