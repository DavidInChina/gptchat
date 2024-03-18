package Bh;

/* loaded from: classes2.dex */
public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2200a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2201b;

    public E0(String str, String str2) {
        this.f2200a = str;
        this.f2201b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E0.class != obj.getClass()) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f2200a.equals(e02.f2200a) && this.f2201b.equals(e02.f2201b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2201b.hashCode() * 31) + this.f2200a.hashCode() + 17;
    }
}
