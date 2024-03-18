package Jh;

import yh.l1;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: Y  reason: collision with root package name */
    public final l1.a f9251Y;

    public e(l1.a aVar) {
        this.f9251Y = aVar;
    }

    @Override // Jh.f
    public final Hh.j a(l1.a aVar, int i10) {
        g gVar;
        Kh.a aVar2 = Kh.a.f9852Y;
        if (aVar.H(Boolean.TYPE)) {
            gVar = g.BOOLEAN;
        } else if (aVar.H(Byte.TYPE)) {
            gVar = g.BYTE;
        } else if (aVar.H(Short.TYPE)) {
            gVar = g.SHORT;
        } else if (aVar.H(Character.TYPE)) {
            gVar = g.CHARACTER;
        } else if (aVar.H(Integer.TYPE)) {
            gVar = g.INTEGER;
        } else if (aVar.H(Long.TYPE)) {
            gVar = g.LONG;
        } else if (aVar.H(Float.TYPE)) {
            gVar = g.FLOAT;
        } else if (aVar.H(Double.TYPE)) {
            gVar = g.DOUBLE;
        } else {
            throw new IllegalArgumentException("Expected non-void primitive type instead of " + aVar);
        }
        return new Hh.j(aVar2.a(this.f9251Y, gVar.f9261Y.w0(), i10), gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        if (this.f9251Y.equals(((e) obj).f9251Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9251Y.hashCode() + (e.class.hashCode() * 31);
    }
}
