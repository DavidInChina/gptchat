package Mh;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f12143Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar);
        this.f12143Z = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        if (this.f12143Z.equals(((b) obj).f12143Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12143Z.hashCode() + (b.class.hashCode() * 31);
    }
}
