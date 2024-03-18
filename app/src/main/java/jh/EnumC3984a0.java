package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3984a0 implements AbstractC2515j0 {
    IMAGE_SUFFIX_INDEX(0),
    IMAGE_SUFFIX_TIMESTAMP(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36382Y;

    EnumC3984a0(int i10) {
        this.f36382Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36382Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
