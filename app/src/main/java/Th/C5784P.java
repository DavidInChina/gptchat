package th;

import k6.AbstractC4194d;
import wh.AbstractC6242g;
import yh.AbstractC6632q;
import yh.C6641v;
import yh.l1;

/* renamed from: th.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5784P extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f46183a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5783O f46184b;

    /* renamed from: c  reason: collision with root package name */
    public transient /* synthetic */ int f46185c;

    public C5784P(Object obj, AbstractC5783O abstractC5783O) {
        this.f46183a = obj;
        this.f46184b = abstractC5783O;
    }

    public static C5784P e(Object obj) {
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C5784P(bool, EnumC5782N.f46173Y);
        } else if (obj instanceof Byte) {
            Byte b10 = (Byte) obj;
            b10.getClass();
            return new C5784P(b10, EnumC5782N.f46174Z);
        } else if (obj instanceof Short) {
            Short sh2 = (Short) obj;
            sh2.getClass();
            return new C5784P(sh2, EnumC5782N.f46175h0);
        } else if (obj instanceof Character) {
            Character ch2 = (Character) obj;
            ch2.getClass();
            return new C5784P(ch2, EnumC5782N.f46176i0);
        } else if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            num.getClass();
            return new C5784P(num, EnumC5782N.f46177j0);
        } else if (obj instanceof Long) {
            Long l10 = (Long) obj;
            l10.getClass();
            return new C5784P(l10, EnumC5782N.f46178k0);
        } else if (obj instanceof Float) {
            Float f6 = (Float) obj;
            f6.getClass();
            return new C5784P(f6, EnumC5782N.f46179l0);
        } else if (obj instanceof Double) {
            Double d10 = (Double) obj;
            d10.getClass();
            return new C5784P(d10, EnumC5782N.f46180m0);
        } else if (obj instanceof String) {
            return new C5784P((String) obj, EnumC5782N.f46181n0);
        } else {
            if (obj instanceof boolean[]) {
                return new C5784P((boolean[]) obj, EnumC5772D.f46163Y);
            }
            if (obj instanceof byte[]) {
                return new C5784P((byte[]) obj, EnumC5772D.f46164Z);
            }
            if (obj instanceof short[]) {
                return new C5784P((short[]) obj, EnumC5772D.f46165h0);
            }
            if (obj instanceof char[]) {
                return new C5784P((char[]) obj, EnumC5772D.f46166i0);
            }
            if (obj instanceof int[]) {
                return new C5784P((int[]) obj, EnumC5772D.f46167j0);
            }
            if (obj instanceof long[]) {
                return new C5784P((long[]) obj, EnumC5772D.f46168k0);
            }
            if (obj instanceof float[]) {
                return new C5784P((float[]) obj, EnumC5772D.f46169l0);
            }
            if (obj instanceof double[]) {
                return new C5784P((double[]) obj, EnumC5772D.f46170m0);
            }
            if (obj instanceof String[]) {
                return new C5784P((String[]) obj, EnumC5772D.f46171n0);
            }
            throw new IllegalArgumentException("Not a constant annotation value: " + obj);
        }
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        return new C5812t(this.f46183a, 0, this.f46184b);
    }

    @Override // th.h0
    public final Object b() {
        return this.f46183a;
    }

    @Override // th.h0
    public final int c() {
        return AbstractC4194d.c(C6641v.l1(this.f46183a.getClass()).g0());
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        l1 C02 = abstractC6632q.l0().C0();
        Object obj = this.f46183a;
        if (C02.H(obj.getClass())) {
            return this;
        }
        if (obj.getClass().isArray()) {
            return new C5787T(2, abstractC6242g, g0.JAVA_19_CAPABLE_VM.a(AbstractC4194d.c(C6641v.l1(obj.getClass().getComponentType()))));
        }
        if (obj instanceof Enum) {
            return new C5787T(2, abstractC6242g, obj.getClass().getName() + '.' + ((Enum) obj).name());
        }
        return new C5787T(2, abstractC6242g, g0.JAVA_19_CAPABLE_VM.j(obj.getClass()) + '[' + obj + ']');
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f46184b.a(this.f46183a, ((h0) obj).b())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // th.h0
    public final int getState() {
        return 3;
    }

    public final int hashCode() {
        int i10;
        if (this.f46185c != 0) {
            i10 = 0;
        } else {
            i10 = this.f46184b.b(this.f46183a);
        }
        if (i10 == 0) {
            return this.f46185c;
        }
        this.f46185c = i10;
        return i10;
    }

    public final String toString() {
        return this.f46184b.c(this.f46183a);
    }
}
