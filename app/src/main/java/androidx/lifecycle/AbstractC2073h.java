package androidx.lifecycle;

/* renamed from: androidx.lifecycle.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2073h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f25370a;

    static {
        int[] iArr = new int[EnumC2081p.values().length];
        try {
            iArr[EnumC2081p.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2081p.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC2081p.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC2081p.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC2081p.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC2081p.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC2081p.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f25370a = iArr;
    }
}
