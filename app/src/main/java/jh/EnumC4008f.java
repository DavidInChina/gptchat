package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4008f implements AbstractC2515j0 {
    JS_UNKNOWN(0),
    JS_SUCCESS(1),
    JS_FAILED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36428Y;

    EnumC4008f(int i10) {
        this.f36428Y = i10;
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36428Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
