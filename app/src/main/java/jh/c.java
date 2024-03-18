package Jh;

import Hh.n;
import yh.l1;

/* loaded from: classes.dex */
public final class c implements Ih.a {
    @Override // Ih.a
    public final n a(l1.a aVar, l1.a aVar2, int i10) {
        f fVar;
        b bVar;
        if (aVar.a1() && aVar2.a1()) {
            return i.a(aVar).b(aVar2);
        }
        boolean a12 = aVar.a1();
        Kh.a aVar3 = Kh.a.f9852Y;
        if (a12) {
            b bVar2 = b.BOOLEAN;
            if (aVar.H(Boolean.TYPE)) {
                bVar = b.BOOLEAN;
            } else if (aVar.H(Byte.TYPE)) {
                bVar = b.BYTE;
            } else if (aVar.H(Short.TYPE)) {
                bVar = b.SHORT;
            } else if (aVar.H(Character.TYPE)) {
                bVar = b.CHARACTER;
            } else if (aVar.H(Integer.TYPE)) {
                bVar = b.INTEGER;
            } else if (aVar.H(Long.TYPE)) {
                bVar = b.LONG;
            } else if (aVar.H(Float.TYPE)) {
                bVar = b.FLOAT;
            } else if (aVar.H(Double.TYPE)) {
                bVar = b.DOUBLE;
            } else {
                throw new IllegalArgumentException("Not a non-void, primitive type: " + aVar);
            }
            return new a(bVar, aVar3.a(bVar.f9237Y.w0(), aVar2, i10));
        } else if (aVar2.a1()) {
            g gVar = g.BOOLEAN;
            if (!aVar.a1()) {
                if (aVar.H(Boolean.class)) {
                    fVar = d.BOOLEAN;
                } else if (aVar.H(Byte.class)) {
                    fVar = d.BYTE;
                } else if (aVar.H(Short.class)) {
                    fVar = d.SHORT;
                } else if (aVar.H(Character.class)) {
                    fVar = d.CHARACTER;
                } else if (aVar.H(Integer.class)) {
                    fVar = d.INTEGER;
                } else if (aVar.H(Long.class)) {
                    fVar = d.LONG;
                } else if (aVar.H(Float.class)) {
                    fVar = d.FLOAT;
                } else if (aVar.H(Double.class)) {
                    fVar = d.DOUBLE;
                } else {
                    fVar = new e(aVar.w0());
                }
                return fVar.a(aVar2, i10);
            }
            throw new IllegalArgumentException("Expected reference type instead of " + aVar);
        } else {
            return aVar3.a(aVar, aVar2, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Object obj2 = Kh.a.f9852Y;
        if (obj2.equals(obj2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Kh.a.f9852Y.hashCode() + (c.class.hashCode() * 31);
    }
}
