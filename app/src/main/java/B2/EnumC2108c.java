package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2108c implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25589Y;

    EnumC2108c(int i10) {
        this.f25589Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25589Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
