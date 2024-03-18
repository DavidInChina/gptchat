package b2;

import androidx.glance.appwidget.protobuf.AbstractC2064y;

/* renamed from: b2.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2117l implements AbstractC2064y {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f25612Y;

    EnumC2117l(int i10) {
        this.f25612Y = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f25612Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
