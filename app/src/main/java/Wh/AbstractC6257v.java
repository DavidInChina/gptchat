package wh;

import java.lang.reflect.Modifier;
import sh.AbstractC5634f;
import yh.H1;
import yh.l1;

/* renamed from: wh.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6257v extends AbstractC5634f implements AbstractC6226B {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f48574Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient /* synthetic */ int f48575Z;

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6226B)) {
            return false;
        }
        AbstractC6226B abstractC6226B = (AbstractC6226B) obj;
        if (B0().equals(abstractC6226B.B0()) && getIndex() == abstractC6226B.getIndex()) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        if (v0()) {
            return getName();
        }
        return "";
    }

    public String getName() {
        return "arg".concat(String.valueOf(getIndex()));
    }

    public final int hashCode() {
        int i10;
        if (this.f48575Z != 0) {
            i10 = 0;
        } else {
            i10 = B0().hashCode() ^ getIndex();
        }
        if (i10 == 0) {
            return this.f48575Z;
        }
        this.f48575Z = i10;
        return i10;
    }

    public int s() {
        int i10 = 0;
        if (this.f48574Y == 0) {
            H1 Q = B0().getParameters().I0().Q();
            int i11 = !((AbstractC5634f) B0()).h1(8);
            while (i10 < getIndex()) {
                i11 += ((l1) Q.get(i10)).p().f7825Y;
                i10++;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            return this.f48574Y;
        }
        this.f48574Y = i10;
        return i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(Modifier.toString(u0()));
        if (u0() != 0) {
            sb2.append(' ');
        }
        if (h1(128)) {
            str = getType().l0().getName().replaceFirst("\\[]$", "...");
        } else {
            str = getType().l0().getName();
        }
        sb2.append(str);
        sb2.append(' ');
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // sh.AbstractC5636h
    public abstract int u0();
}
