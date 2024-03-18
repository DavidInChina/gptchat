package io.sentry.android.ndk;

/* loaded from: classes2.dex */
final class NativeScope implements a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);
}
