package ph;

/* renamed from: ph.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5190b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final f f43176a;

    public C5190b(f fVar) {
        this.f43176a = fVar;
    }

    @Override // ph.e
    public final f a() {
        return this.f43176a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5190b.class != obj.getClass()) {
            return false;
        }
        if (this.f43176a.equals(((C5190b) obj).f43176a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (C5190b.class.hashCode() * 31) + this.f43176a.f43205Y;
    }
}
