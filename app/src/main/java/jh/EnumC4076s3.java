package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.s3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4076s3 implements AbstractC2515j0 {
    ACTIVE(0),
    PAUSED(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36592Y;

    EnumC4076s3(int i10) {
        this.f36592Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36592Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
