package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final K f27417a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final K f27418b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.K, java.lang.Object] */
    static {
        K k10;
        try {
            k10 = (K) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            k10 = null;
        }
        f27418b = k10;
    }
}
