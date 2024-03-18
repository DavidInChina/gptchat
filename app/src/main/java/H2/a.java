package H2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f7199a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7200b;

    public a(long j6, long j10) {
        this.f7199a = j6;
        this.f7200b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7199a == aVar.f7199a && this.f7200b == aVar.f7200b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7199a) * 31) + ((int) this.f7200b);
    }
}
