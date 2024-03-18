package Hh;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f7816c = new l(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f7817a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7818b;

    public l(int i10, int i11) {
        this.f7817a = i10;
        this.f7818b = i11;
    }

    public final l a(l lVar) {
        int i10 = lVar.f7817a;
        int i11 = this.f7817a;
        return new l(i10 + i11, Math.max(this.f7818b, i11 + lVar.f7818b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f7817a == lVar.f7817a && this.f7818b == lVar.f7818b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((l.class.hashCode() * 31) + this.f7817a) * 31) + this.f7818b;
    }
}
