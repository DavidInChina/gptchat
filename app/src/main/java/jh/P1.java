package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes.dex */
public enum P1 implements AbstractC2515j0 {
    IC_DEFAULT(0),
    IC_JPEG(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36323Y;

    P1(int i10) {
        this.f36323Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36323Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
