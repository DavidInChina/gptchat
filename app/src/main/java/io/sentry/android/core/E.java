package io.sentry.android.core;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class E {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f33959a;

    static {
        int[] iArr = new int[io.sentry.B.values().length];
        f33959a = iArr;
        try {
            iArr[io.sentry.B.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33959a[io.sentry.B.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
