package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class z1 extends B1 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f27650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f27650b = i10;
    }

    @Override // com.google.protobuf.B1
    public final void c(long j6, byte[] bArr, long j10) {
        switch (this.f27650b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.B1
    public final boolean d(long j6, Object obj) {
        switch (this.f27650b) {
            case 0:
                if (C1.f27390h) {
                    if (C1.h(j6, obj) == 0) {
                        return false;
                    }
                } else if (C1.i(j6, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (C1.f27390h) {
                    if (C1.h(j6, obj) == 0) {
                        return false;
                    }
                } else if (C1.i(j6, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.B1
    public final byte e(long j6) {
        switch (this.f27650b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.B1
    public final byte f(long j6, Object obj) {
        switch (this.f27650b) {
            case 0:
                if (C1.f27390h) {
                    return C1.h(j6, obj);
                }
                return C1.i(j6, obj);
            default:
                if (C1.f27390h) {
                    return C1.h(j6, obj);
                }
                return C1.i(j6, obj);
        }
    }

    @Override // com.google.protobuf.B1
    public final double g(long j6, Object obj) {
        switch (this.f27650b) {
            case 0:
                return Double.longBitsToDouble(j(j6, obj));
            default:
                return Double.longBitsToDouble(j(j6, obj));
        }
    }

    @Override // com.google.protobuf.B1
    public final float h(long j6, Object obj) {
        switch (this.f27650b) {
            case 0:
                return Float.intBitsToFloat(i(j6, obj));
            default:
                return Float.intBitsToFloat(i(j6, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.B1
    public final void m(Object obj, long j6, boolean z10) {
        switch (this.f27650b) {
            case 0:
                if (C1.f27390h) {
                    C1.p(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    C1.q(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (C1.f27390h) {
                    C1.p(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    C1.q(obj, j6, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.B1
    public final void n(Object obj, long j6, byte b10) {
        switch (this.f27650b) {
            case 0:
                if (C1.f27390h) {
                    C1.p(obj, j6, b10);
                    return;
                } else {
                    C1.q(obj, j6, b10);
                    return;
                }
            default:
                if (C1.f27390h) {
                    C1.p(obj, j6, b10);
                    return;
                } else {
                    C1.q(obj, j6, b10);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.B1
    public final void o(Object obj, long j6, double d10) {
        switch (this.f27650b) {
            case 0:
                r(obj, j6, Double.doubleToLongBits(d10));
                return;
            default:
                r(obj, j6, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // com.google.protobuf.B1
    public final void p(Object obj, long j6, float f6) {
        switch (this.f27650b) {
            case 0:
                q(j6, obj, Float.floatToIntBits(f6));
                return;
            default:
                q(j6, obj, Float.floatToIntBits(f6));
                return;
        }
    }

    @Override // com.google.protobuf.B1
    public final boolean u() {
        return false;
    }
}
