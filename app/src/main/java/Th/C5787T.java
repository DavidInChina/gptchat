package th;

import wh.AbstractC6242g;
import yh.AbstractC6632q;
import yh.l1;

/* renamed from: th.T  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5787T extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46193a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f46194b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46195c;

    public C5787T(int i10, Object obj, String str) {
        this.f46193a = i10;
        this.f46194b = obj;
        this.f46195c = str;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        a0 a0Var;
        int i10 = this.f46193a;
        String str = this.f46195c;
        Object obj = this.f46194b;
        switch (i10) {
            case 0:
                try {
                    return new C5786S(Class.forName(((l1) obj).getName(), false, classLoader), str, 0);
                } catch (ClassNotFoundException e10) {
                    return new C5786S(((l1) obj).getName(), e10);
                }
            case 1:
                try {
                    Class<?> cls = Class.forName(((l1) obj).getName(), false, classLoader);
                    if (cls.isAnnotation()) {
                        a0Var = new C5791X(cls, str);
                    } else {
                        a0Var = new C5789V(cls);
                    }
                    return a0Var;
                } catch (ClassNotFoundException e11) {
                    return new C5786S(((l1) obj).getName(), e11);
                }
            default:
                try {
                    Class<?> cls2 = Class.forName(((AbstractC6242g) obj).mo118a().getName(), false, classLoader);
                    try {
                        return new C5786S(cls2.getMethod(((AbstractC6242g) obj).getName(), new Class[0]), str, 1);
                    } catch (NoSuchMethodException unused) {
                        return new C5789V(cls2);
                    }
                } catch (ClassNotFoundException e12) {
                    return new C5786S(((AbstractC6242g) obj).mo118a().getName(), e12);
                }
        }
    }

    @Override // th.h0
    public final Object b() {
        int i10 = this.f46193a;
        Object obj = this.f46194b;
        String str = this.f46195c;
        switch (i10) {
            case 0:
                throw new IllegalStateException(((l1) obj) + " does not declare enumeration constant " + str);
            case 1:
                throw new IllegalStateException(((l1) obj) + " does not define " + str);
            default:
                StringBuilder r10 = android.gov.nist.core.a.r(str, " cannot be used as value for ");
                r10.append((AbstractC6242g) obj);
                throw new IllegalStateException(r10.toString());
        }
    }

    @Override // th.h0
    public final int c() {
        return 14;
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        switch (this.f46193a) {
            case 0:
            case 1:
                return this;
            default:
                return new C5787T(2, abstractC6242g, this.f46195c);
        }
    }

    @Override // th.h0
    public final int getState() {
        switch (this.f46193a) {
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    public final String toString() {
        int i10 = this.f46193a;
        String str = this.f46195c;
        switch (i10) {
            case 0:
                return android.gov.nist.core.a.g(str, " /* Warning: constant not present! */");
            case 1:
            default:
                return super.toString();
            case 2:
                return android.gov.nist.core.a.A("/* Warning type mismatch! \"", str, "\" */");
        }
    }
}
