package vh;

import java.util.List;
import sh.AbstractC5630b;
import yh.Y0;
import yh.l1;

/* loaded from: classes.dex */
public final class f implements AbstractC5630b {

    /* renamed from: a  reason: collision with root package name */
    public final String f47544a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47545b;

    /* renamed from: c  reason: collision with root package name */
    public final l1.a f47546c;

    /* renamed from: d  reason: collision with root package name */
    public final List f47547d;

    /* renamed from: e  reason: collision with root package name */
    public transient /* synthetic */ int f47548e;

    public f(String str, int i10, l1.a aVar, List list) {
        this.f47544a = str;
        this.f47545b = i10;
        this.f47546c = aVar;
        this.f47547d = list;
    }

    @Override // sh.AbstractC5630b
    public final AbstractC5630b a(Y0 y02) {
        int i10 = this.f47545b;
        List list = this.f47547d;
        return new f(this.f47544a, i10, (l1.a) this.f47546c.k(y02), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f47545b == fVar.f47545b && this.f47544a.equals(fVar.f47544a) && this.f47546c.equals(fVar.f47546c) && this.f47547d.equals(fVar.f47547d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f47548e != 0) {
            i10 = 0;
        } else {
            int hashCode = this.f47546c.hashCode();
            i10 = this.f47547d.hashCode() + ((hashCode + (((this.f47544a.hashCode() * 31) + this.f47545b) * 31)) * 31);
        }
        if (i10 == 0) {
            return this.f47548e;
        }
        this.f47548e = i10;
        return i10;
    }
}
