package G3;

/* renamed from: G3.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0606j extends r.f {
    @Override // r.f
    public void S(W3.f fVar, W3.f fVar2) {
        fVar.f20713b = fVar2;
    }

    @Override // r.f
    public void T(W3.f fVar, Thread thread) {
        fVar.f20712a = thread;
    }

    @Override // r.f
    public boolean i(W3.g gVar, W3.c cVar, W3.c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f20719Z == cVar) {
                    gVar.f20719Z = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r.f
    public boolean j(W3.g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f20718Y == obj) {
                    gVar.f20718Y = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r.f
    public boolean k(W3.g gVar, W3.f fVar, W3.f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f20720h0 == fVar) {
                    gVar.f20720h0 = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
