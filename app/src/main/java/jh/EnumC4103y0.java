package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4103y0 implements AbstractC2515j0 {
    ACTIVE(0),
    FINISHED(1),
    FAILED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36645Y;

    EnumC4103y0(int i10) {
        this.f36645Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36645Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
