package qc;

import com.revenuecat.purchases.PackageType;

/* renamed from: qc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5302a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f44040a;

    static {
        int[] iArr = new int[PackageType.values().length];
        try {
            iArr[PackageType.LIFETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PackageType.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PackageType.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PackageType.WEEKLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f44040a = iArr;
    }
}
