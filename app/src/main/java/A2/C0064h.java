package A2;

/* renamed from: A2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064h {

    /* renamed from: d  reason: collision with root package name */
    public static final C0064h f554d = new C0063g(0).a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f555a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f556b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f557c;

    public C0064h(C0063g c0063g) {
        this.f555a = c0063g.f551a;
        this.f556b = c0063g.f552b;
        this.f557c = c0063g.f553c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0064h.class != obj.getClass()) {
            return false;
        }
        C0064h c0064h = (C0064h) obj;
        if (this.f555a == c0064h.f555a && this.f556b == c0064h.f556b && this.f557c == c0064h.f557c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f555a ? 1 : 0) << 2) + ((this.f556b ? 1 : 0) << 1) + (this.f557c ? 1 : 0);
    }
}
