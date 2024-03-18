package Id;

import androidx.lifecycle.EnumC2081p;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f8545a;

    static {
        int[] iArr = new int[EnumC2081p.values().length];
        try {
            iArr[EnumC2081p.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2081p.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC2081p.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8545a = iArr;
    }
}
