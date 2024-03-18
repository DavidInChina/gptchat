package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.j1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4030j1 implements AbstractC2515j0 {
    ICT_NONE(0),
    ICT_TCP(1),
    ICT_TLS(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36443Y;

    EnumC4030j1(int i10) {
        this.f36443Y = i10;
    }

    public static EnumC4030j1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return ICT_TLS;
            }
            return ICT_TCP;
        }
        return ICT_NONE;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36443Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
