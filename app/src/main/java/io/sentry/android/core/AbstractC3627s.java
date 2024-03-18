package io.sentry.android.core;

/* renamed from: io.sentry.android.core.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3627s {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f34250a;

    static {
        int[] iArr = new int[io.sentry.B.values().length];
        f34250a = iArr;
        try {
            iArr[io.sentry.B.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34250a[io.sentry.B.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f34250a[io.sentry.B.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
