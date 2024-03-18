package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.n2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4051n2 implements AbstractC2515j0 {
    UNKNOWN(0),
    CAMERA(1),
    MICROPHONE(2),
    SCREEN_SHARE(3),
    SCREEN_SHARE_AUDIO(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36521Y;

    EnumC4051n2(int i10) {
        this.f36521Y = i10;
    }

    public static EnumC4051n2 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return SCREEN_SHARE_AUDIO;
                    }
                    return SCREEN_SHARE;
                }
                return MICROPHONE;
            }
            return CAMERA;
        }
        return UNKNOWN;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36521Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
