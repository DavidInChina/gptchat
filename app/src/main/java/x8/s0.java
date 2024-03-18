package x8;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s0 extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final j0 f49610Y;

    public s0(j0 j0Var) {
        j0Var.getClass();
        this.f49610Y = j0Var;
    }

    @Override // x8.j0
    public final j0 a() {
        return this.f49610Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f49610Y.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f49610Y.equals(((s0) obj).f49610Y);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f49610Y.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f49610Y);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
