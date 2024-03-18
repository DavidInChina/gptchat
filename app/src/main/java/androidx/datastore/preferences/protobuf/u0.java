package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class u0 extends w0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f25118b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean c(long j6, Object obj) {
        switch (this.f25118b) {
            case 0:
                if (x0.f25136h) {
                    if (x0.g(j6, obj) == 0) {
                        return false;
                    }
                } else if (x0.h(j6, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (x0.f25136h) {
                    if (x0.g(j6, obj) == 0) {
                        return false;
                    }
                } else if (x0.h(j6, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final byte d(long j6, Object obj) {
        switch (this.f25118b) {
            case 0:
                if (x0.f25136h) {
                    return x0.g(j6, obj);
                }
                return x0.h(j6, obj);
            default:
                if (x0.f25136h) {
                    return x0.g(j6, obj);
                }
                return x0.h(j6, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final double e(long j6, Object obj) {
        switch (this.f25118b) {
            case 0:
                return Double.longBitsToDouble(h(j6, obj));
            default:
                return Double.longBitsToDouble(h(j6, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final float f(long j6, Object obj) {
        switch (this.f25118b) {
            case 0:
                return Float.intBitsToFloat(g(j6, obj));
            default:
                return Float.intBitsToFloat(g(j6, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.w0
    public final void k(Object obj, long j6, boolean z10) {
        switch (this.f25118b) {
            case 0:
                if (x0.f25136h) {
                    x0.n(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    x0.o(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (x0.f25136h) {
                    x0.n(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    x0.o(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void l(Object obj, long j6, byte b10) {
        switch (this.f25118b) {
            case 0:
                if (x0.f25136h) {
                    x0.n(obj, j6, b10);
                    return;
                } else {
                    x0.o(obj, j6, b10);
                    return;
                }
            default:
                if (x0.f25136h) {
                    x0.n(obj, j6, b10);
                    return;
                } else {
                    x0.o(obj, j6, b10);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void m(Object obj, long j6, double d10) {
        switch (this.f25118b) {
            case 0:
                p(obj, j6, Double.doubleToLongBits(d10));
                return;
            default:
                p(obj, j6, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void n(Object obj, long j6, float f6) {
        switch (this.f25118b) {
            case 0:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
            default:
                o(j6, obj, Float.floatToIntBits(f6));
                return;
        }
    }
}
