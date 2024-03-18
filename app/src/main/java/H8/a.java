package H8;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f7478a;

    /* renamed from: b  reason: collision with root package name */
    public final d f7479b;

    public a(int i10, d dVar) {
        this.f7478a = i10;
        this.f7479b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f7478a == ((a) eVar).f7478a && this.f7479b.equals(((a) eVar).f7479b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f7478a) + (this.f7479b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7478a + "intEncoding=" + this.f7479b + ')';
    }
}
