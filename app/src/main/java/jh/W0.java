package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum W0 implements AbstractC2515j0 {
    RTMP_INPUT(0),
    WHIP_INPUT(1),
    URL_INPUT(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36368Y;

    W0(int i10) {
        this.f36368Y = i10;
    }

    public static W0 b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return URL_INPUT;
            }
            return WHIP_INPUT;
        }
        return RTMP_INPUT;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36368Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
