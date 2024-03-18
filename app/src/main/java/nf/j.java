package Nf;

import Mf.J;
import cg.C2411b;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kf.q;
import kf.t;
import kf.u;
import kg.C4291c;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12823Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f12824Z;

    public j(int i10, List list) {
        this.f12823Y = i10;
        if (i10 != 1) {
            this.f12824Z = list;
        } else {
            this.f12824Z = list;
        }
    }

    @Override // Nf.i
    public final boolean G(C4291c c4291c) {
        switch (this.f12823Y) {
            case 0:
                return AbstractC4344b.x0(this, c4291c);
            case 1:
                AbstractC3557B.c0("fqName", c4291c);
                Iterator it = t.V1((List) this.f12824Z).iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).G(c4291c)) {
                        return true;
                    }
                }
                return false;
            default:
                return AbstractC4344b.x0(this, c4291c);
        }
    }

    @Override // Nf.i
    public final boolean isEmpty() {
        int i10 = this.f12823Y;
        Object obj = this.f12824Z;
        switch (i10) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List<i> list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (i iVar : list) {
                        if (!iVar.isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f12823Y;
        Object obj = this.f12824Z;
        switch (i10) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new Kg.g(Kg.m.k1(t.V1((List) obj), l.f12829Y));
            default:
                return u.f37482Y;
        }
    }

    @Override // Nf.i
    public final c l(C4291c c4291c) {
        int i10 = this.f12823Y;
        Object obj = this.f12824Z;
        switch (i10) {
            case 0:
                return AbstractC4344b.i0(this, c4291c);
            case 1:
                AbstractC3557B.c0("fqName", c4291c);
                return (c) Kg.m.j1(Kg.m.o1(t.V1((List) obj), new J(c4291c, 1)));
            default:
                AbstractC3557B.c0("fqName", c4291c);
                if (AbstractC3557B.K(c4291c, (C4291c) obj)) {
                    return C2411b.f26618a;
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f12823Y) {
            case 0:
                return ((List) this.f12824Z).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i[] iVarArr) {
        this(1, q.z3(iVarArr));
        this.f12823Y = 1;
    }

    public j(C4291c c4291c) {
        this.f12823Y = 2;
        this.f12824Z = c4291c;
    }
}
