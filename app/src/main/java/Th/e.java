package Th;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f17269Y;

    public e(Class cls) {
        this.f17269Y = cls;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        mVar.I(21, 1);
        mVar.H(189, Nh.r.k(this.f17269Y));
        mVar.n(176);
        return 1;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        return Array.newInstance(this.f17269Y, ((Integer) objArr[0]).intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        if (this.f17269Y.equals(((e) obj).f17269Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17269Y.hashCode() + (e.class.hashCode() * 31);
    }
}
