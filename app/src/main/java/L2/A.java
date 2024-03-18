package L2;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final C f10517a;

    /* renamed from: b  reason: collision with root package name */
    public final C f10518b;

    public A(C c10, C c11) {
        this.f10517a = c10;
        this.f10518b = c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a5 = (A) obj;
        if (this.f10517a.equals(a5.f10517a) && this.f10518b.equals(a5.f10518b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10518b.hashCode() + (this.f10517a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        C c10 = this.f10517a;
        sb2.append(c10);
        C c11 = this.f10518b;
        if (c10.equals(c11)) {
            str = "";
        } else {
            str = ", " + c11;
        }
        return R.a.t(sb2, str, "]");
    }
}
