package j$.time.format;

/* renamed from: j$.time.format.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3710d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f35008a;

    static {
        int[] iArr = new int[G.values().length];
        f35008a = iArr;
        try {
            iArr[G.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f35008a[G.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f35008a[G.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f35008a[G.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
