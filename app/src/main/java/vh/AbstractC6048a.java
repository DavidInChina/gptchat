package vh;

import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Modifier;
import sh.AbstractC5634f;
import yh.R0;
import yh.l1;

/* renamed from: vh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6048a extends AbstractC5634f implements g {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f47533Y;

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return getName();
    }

    public String N0() {
        l1.a type = getType();
        try {
            if (type.c().b()) {
                return null;
            }
            return ((Ph.a) type.k(new R0(new Ph.b()))).toString();
        } catch (GenericSignatureFormatError unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (getName().equals(gVar.getName()) && mo118a().equals(gVar.mo118a())) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        return getName();
    }

    @Override // sh.AbstractC5637i.a
    public final String getDescriptor() {
        return getType().l0().getDescriptor();
    }

    public final int hashCode() {
        int i10;
        if (this.f47533Y != 0) {
            i10 = 0;
        } else {
            i10 = mo118a().hashCode() + ((getName().hashCode() + 17) * 31);
        }
        if (i10 == 0) {
            return this.f47533Y;
        }
        this.f47533Y = i10;
        return i10;
    }

    public final e i1() {
        return new e(getName(), getType().l0());
    }

    public final int j1() {
        int i10;
        int u02 = u0();
        if (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class)) {
            i10 = 131072;
        } else {
            i10 = 0;
        }
        return u02 | i10;
    }

    @Override // sh.AbstractC5632d
    public final boolean m0(l1 l1Var) {
        if (mo118a().l0().m0(l1Var)) {
            if (h1(1) || l1Var.equals(mo118a().l0())) {
                return true;
            }
            if (h1(4) && mo118a().l0().f0(l1Var)) {
                return true;
            }
            if (!h1(2) && l1Var.j0(mo118a().l0())) {
                return true;
            }
            if (h1(2) && l1Var.N(mo118a().l0())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (u0() != 0) {
            sb2.append(Modifier.toString(u0()));
            sb2.append(' ');
        }
        sb2.append(getType().l0().f1());
        sb2.append(' ');
        sb2.append(mo118a().l0().f1());
        sb2.append('.');
        sb2.append(getName());
        return sb2.toString();
    }
}
