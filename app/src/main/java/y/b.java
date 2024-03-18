package Y;

import f8.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f22007c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f22008a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22009b;

    public b(int i10, int i11) {
        this.f22008a = i10;
        this.f22009b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (c.a(this.f22008a, bVar.f22008a) && a.a(this.f22009b, bVar.f22009b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        e eVar = c.f22010Z;
        e eVar2 = a.f22003Z;
        return (this.f22008a * 31) + this.f22009b;
    }

    public final String toString() {
        return "WindowSizeClass(" + ((Object) c.b(this.f22008a)) + ", " + ((Object) a.b(this.f22009b)) + ')';
    }
}
