package j$.time.chrono;

/* loaded from: classes3.dex */
abstract /* synthetic */ class E {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f34905a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f34905a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34905a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f34905a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
