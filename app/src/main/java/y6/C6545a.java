package y6;

import id.AbstractC3557B;

/* renamed from: y6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6545a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f50822a;

    public /* synthetic */ C6545a(int i10) {
        this.f50822a = i10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        switch (this.f50822a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj != null) {
                    cls = obj.getClass();
                } else {
                    cls = null;
                }
                if (AbstractC3557B.K(C6545a.class, cls)) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f50822a) {
            case 0:
                return C6545a.class.hashCode();
            default:
                return super.hashCode();
        }
    }
}
