package Hh;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7800c = new a(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f7801a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7802b;

    public a(int i10, int i11) {
        this.f7801a = i10;
        this.f7802b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7801a == aVar.f7801a && this.f7802b == aVar.f7802b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.class.hashCode() * 31) + this.f7801a) * 31) + this.f7802b;
    }
}
