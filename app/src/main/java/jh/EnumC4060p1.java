package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.p1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4060p1 implements AbstractC2515j0 {
    SERVER(0),
    CONTROLLER(1),
    MEDIA(2),
    TURN(4),
    SWEEPER(5),
    DIRECTOR(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36556Y;

    EnumC4060p1(int i10) {
        this.f36556Y = i10;
    }

    public static EnumC4060p1 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return null;
                            }
                            return DIRECTOR;
                        }
                        return SWEEPER;
                    }
                    return TURN;
                }
                return MEDIA;
            }
            return CONTROLLER;
        }
        return SERVER;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36556Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
