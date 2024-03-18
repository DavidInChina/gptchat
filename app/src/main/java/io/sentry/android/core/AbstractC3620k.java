package io.sentry.android.core;

import io.sentry.EnumC3642e1;

/* renamed from: io.sentry.android.core.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3620k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f34196a;

    static {
        int[] iArr = new int[EnumC3642e1.values().length];
        f34196a = iArr;
        try {
            iArr[EnumC3642e1.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34196a[EnumC3642e1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f34196a[EnumC3642e1.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f34196a[EnumC3642e1.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f34196a[EnumC3642e1.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
