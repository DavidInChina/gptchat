package S4;

import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class p extends n {
    @Override // S4.n
    public final int a(f fVar) {
        int i10 = ((e) fVar).f16155Y;
        if (i10 >= 0) {
            int i11 = i10 * 112;
            if (i11 >= 0) {
                int i12 = this.f16181d;
                if (i12 >= 0) {
                    return i12 + i11;
                }
                throw new RuntimeException("fileOffset not yet set");
            }
            throw new IllegalArgumentException("relative < 0");
        }
        throw new RuntimeException("index not yet set");
    }

    @Override // S4.n
    public final void e() {
        j();
        for (f fVar : c()) {
            fVar.a(this.f16179b);
        }
    }

    @Override // S4.n
    public final int g() {
        Collection c10 = c();
        int size = c10.size();
        if (size == 0) {
            return 0;
        }
        return ((f) c10.iterator().next()).c() * size;
    }

    @Override // S4.n
    public final void i(U4.c cVar) {
        for (f fVar : c()) {
            fVar.d(this.f16179b, cVar);
            cVar.a(this.f16180c);
        }
    }

    public abstract void j();
}
