package yh;

/* renamed from: yh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6591a implements AbstractC6597c {
    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return getName().replace('.', '/');
    }

    public final boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof AbstractC6597c) || !getName().equals(((AbstractC6597c) obj).getName()))) {
            return false;
        }
        return true;
    }

    @Override // sh.AbstractC5637i
    public final String f1() {
        return getName();
    }

    public final int hashCode() {
        return getName().hashCode();
    }

    public final String toString() {
        return "package " + getName();
    }
}
