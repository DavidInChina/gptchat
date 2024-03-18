package O4;

import e1.AbstractC2767g;
import e1.C2764d;
import e1.C2766f;
import n.AbstractC4694e;

/* loaded from: classes2.dex */
public final class b extends AbstractC4694e {
    @Override // n.AbstractC4694e
    public boolean g(AbstractC2767g abstractC2767g, C2764d c2764d, C2764d c2764d2) {
        synchronized (abstractC2767g) {
            try {
                if (abstractC2767g.f28740Z == c2764d) {
                    abstractC2767g.f28740Z = c2764d2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n.AbstractC4694e
    public boolean i(AbstractC2767g abstractC2767g, Object obj, Object obj2) {
        synchronized (abstractC2767g) {
            try {
                if (abstractC2767g.f28739Y == obj) {
                    abstractC2767g.f28739Y = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n.AbstractC4694e
    public boolean j(AbstractC2767g abstractC2767g, C2766f c2766f, C2766f c2766f2) {
        synchronized (abstractC2767g) {
            try {
                if (abstractC2767g.f28741h0 == c2766f) {
                    abstractC2767g.f28741h0 = c2766f2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n.AbstractC4694e
    public void m(C2766f c2766f, C2766f c2766f2) {
        c2766f.f28734b = c2766f2;
    }

    @Override // n.AbstractC4694e
    public void n(C2766f c2766f, Thread thread) {
        c2766f.f28733a = thread;
    }
}
