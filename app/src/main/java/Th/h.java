package Th;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public enum h implements m {
    f17283j0(177, 0, null, "VOID"),
    f17284k0(172, 1, Boolean.FALSE, "BOOLEAN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(172, 1, Boolean.TRUE, "BOOLEAN_REVERSE"),
    f17285l0(172, 1, (byte) 0, "BYTE"),
    f17286m0(172, 1, (short) 0, "SHORT"),
    f17287n0(172, 1, (char) 0, "CHARACTER"),
    f17288o0(172, 1, 0, "INTEGER"),
    f17289p0(173, 2, 0L, "LONG"),
    f17290q0(174, 1, Float.valueOf(0.0f), "FLOAT"),
    f17291r0(175, 2, Double.valueOf(0.0d), "DOUBLE"),
    f17292s0(176, 1, null, "REFERENCE");
    

    /* renamed from: Y  reason: collision with root package name */
    public final Object f17294Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f17295Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f17296h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f17297i0;

    h(int i10, int i11, Object obj, String str) {
        this.f17294Y = obj;
        this.f17295Z = r2;
        this.f17296h0 = i10;
        this.f17297i0 = i11;
    }

    public static m c(Class cls) {
        if (cls == Void.TYPE) {
            return f17283j0;
        }
        Class<?> cls2 = Boolean.TYPE;
        if (cls == cls2) {
            return f17284k0;
        }
        Class<?> cls3 = Byte.TYPE;
        if (cls == cls3) {
            return f17285l0;
        }
        Class<?> cls4 = Short.TYPE;
        if (cls == cls4) {
            return f17286m0;
        }
        Class<?> cls5 = Character.TYPE;
        if (cls == cls5) {
            return f17287n0;
        }
        Class<?> cls6 = Integer.TYPE;
        if (cls == cls6) {
            return f17288o0;
        }
        Class<?> cls7 = Long.TYPE;
        if (cls == cls7) {
            return f17289p0;
        }
        Class<?> cls8 = Float.TYPE;
        if (cls == cls8) {
            return f17290q0;
        }
        Class<?> cls9 = Double.TYPE;
        if (cls == cls9) {
            return f17291r0;
        }
        if (cls.isArray()) {
            if (cls.getComponentType() == cls2) {
                return g.f17272h0;
            }
            if (cls.getComponentType() == cls3) {
                return g.f17273i0;
            }
            if (cls.getComponentType() == cls4) {
                return g.f17274j0;
            }
            if (cls.getComponentType() == cls5) {
                return g.f17275k0;
            }
            if (cls.getComponentType() == cls6) {
                return g.f17276l0;
            }
            if (cls.getComponentType() == cls7) {
                return g.f17277m0;
            }
            if (cls.getComponentType() == cls8) {
                return g.f17278n0;
            }
            if (cls.getComponentType() == cls9) {
                return g.f17279o0;
            }
            Class<?> componentType = cls.getComponentType();
            return new f(componentType, Array.newInstance(componentType, 0));
        }
        return f17292s0;
    }

    @Override // Th.m
    public final int a(Nh.m mVar, Method method) {
        int i10 = this.f17295Z;
        if (i10 != 0) {
            mVar.n(i10);
        }
        mVar.n(this.f17296h0);
        return this.f17297i0;
    }

    @Override // Th.m
    public final Object b(Object[] objArr) {
        return this.f17294Y;
    }
}
