package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class j0 extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f25227b = i10;
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean c(long j6, Object obj) {
        switch (this.f25227b) {
            case 0:
                if (m0.f25254g) {
                    if (m0.h(j6, obj) == 0) {
                        return false;
                    }
                } else if (m0.i(j6, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (m0.f25254g) {
                    if (m0.h(j6, obj) == 0) {
                        return false;
                    }
                } else if (m0.i(j6, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final byte d(long j6, Object obj) {
        switch (this.f25227b) {
            case 0:
                if (m0.f25254g) {
                    return m0.h(j6, obj);
                }
                return m0.i(j6, obj);
            default:
                if (m0.f25254g) {
                    return m0.h(j6, obj);
                }
                return m0.i(j6, obj);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final double e(long j6, Object obj) {
        switch (this.f25227b) {
            case 0:
                return Double.longBitsToDouble(h(j6, obj));
            default:
                return Double.longBitsToDouble(h(j6, obj));
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final float f(long j6, Object obj) {
        switch (this.f25227b) {
            case 0:
                return Float.intBitsToFloat(g(j6, obj));
            default:
                return Float.intBitsToFloat(g(j6, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.appwidget.protobuf.l0
    public final void k(Object obj, long j6, boolean z10) {
        switch (this.f25227b) {
            case 0:
                if (m0.f25254g) {
                    m0.o(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    m0.p(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (m0.f25254g) {
                    m0.o(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    m0.p(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void l(Object obj, long j6, byte b10) {
        switch (this.f25227b) {
            case 0:
                if (m0.f25254g) {
                    m0.o(obj, j6, b10);
                    return;
                } else {
                    m0.p(obj, j6, b10);
                    return;
                }
            default:
                if (m0.f25254g) {
                    m0.o(obj, j6, b10);
                    return;
                } else {
                    m0.p(obj, j6, b10);
                    return;
                }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void m(Object obj, long j6, double d10) {
        switch (this.f25227b) {
            case 0:
                p(obj, j6, Double.doubleToLongBits(d10));
                return;
            default:
                p(obj, j6, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final void n(Object obj, long j6, float f6) {
        switch (this.f25227b) {
            case 0:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
            default:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean s() {
        return false;
    }
}
