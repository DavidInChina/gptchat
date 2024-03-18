package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum P implements AbstractC2515j0 {
    EGRESS_STARTING(0),
    EGRESS_ACTIVE(1),
    EGRESS_ENDING(2),
    EGRESS_COMPLETE(3),
    EGRESS_FAILED(4),
    EGRESS_ABORTED(5),
    EGRESS_LIMIT_REACHED(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36318Y;

    P(int i10) {
        this.f36318Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36318Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
