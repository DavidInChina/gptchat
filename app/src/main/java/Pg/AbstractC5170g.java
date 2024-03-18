package pg;

import Bg.A;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5170g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f43144a;

    public AbstractC5170g(Object obj) {
        this.f43144a = obj;
    }

    public abstract A a(B b10);

    public Object b() {
        return this.f43144a;
    }

    public final boolean equals(Object obj) {
        AbstractC5170g abstractC5170g;
        if (this != obj) {
            Object b10 = b();
            Object obj2 = null;
            if (obj instanceof AbstractC5170g) {
                abstractC5170g = (AbstractC5170g) obj;
            } else {
                abstractC5170g = null;
            }
            if (abstractC5170g != null) {
                obj2 = abstractC5170g.b();
            }
            if (!AbstractC3557B.K(b10, obj2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
