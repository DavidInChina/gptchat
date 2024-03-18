package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public enum k implements Hh.n {
    MINUS_ONE(2),
    ZERO(3),
    ONE(4),
    TWO(5),
    THREE(6),
    FOUR(7),
    FIVE(8);
    

    /* renamed from: n0  reason: collision with root package name */
    public static final Hh.l f11199n0 = Hh.o.SINGLE.a();

    /* renamed from: Y  reason: collision with root package name */
    public final int f11201Y;

    k(int i10) {
        this.f11201Y = i10;
    }

    public static Hh.n h(int i10) {
        switch (i10) {
            case -1:
                return MINUS_ONE;
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            default:
                if (i10 >= -128 && i10 <= 127) {
                    return new i((byte) i10);
                }
                if (i10 >= -32768 && i10 <= 32767) {
                    return new j((short) i10);
                }
                return new h(i10);
        }
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f11201Y);
        return f11199n0;
    }
}
