package jh;

import com.google.protobuf.AbstractC2515j0;

/* loaded from: classes2.dex */
public enum C1 implements AbstractC2515j0 {
    UNKNOWN(0),
    JS(1),
    SWIFT(2),
    ANDROID(3),
    FLUTTER(4),
    GO(5),
    UNITY(6),
    REACT_NATIVE(7),
    RUST(8),
    PYTHON(9),
    CPP(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36213Y;

    C1(int i10) {
        this.f36213Y = i10;
    }

    public static C1 b(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN;
            case 1:
                return JS;
            case 2:
                return SWIFT;
            case 3:
                return ANDROID;
            case 4:
                return FLUTTER;
            case 5:
                return GO;
            case 6:
                return UNITY;
            case 7:
                return REACT_NATIVE;
            case 8:
                return RUST;
            case 9:
                return PYTHON;
            case 10:
                return CPP;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36213Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
