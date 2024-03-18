package com.google.protobuf;

/* renamed from: com.google.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2499e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f27538a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f27539b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f27538a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f27539b = z10;
    }

    public static boolean a() {
        if (f27538a != null && !f27539b) {
            return true;
        }
        return false;
    }
}
