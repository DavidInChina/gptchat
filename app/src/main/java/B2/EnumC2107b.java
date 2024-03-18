package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2107b implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25583Y;

    EnumC2107b(int i10) {
        this.f25583Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25583Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
