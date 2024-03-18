package com.google.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0 f27393b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final K0 f27394a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.K0, com.google.protobuf.D0, java.lang.Object] */
    public E0() {
        K0 k02;
        K0[] k0Arr = new K0[2];
        k0Arr[0] = W.f27503a;
        try {
            k02 = (K0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            k02 = f27393b;
        }
        k0Arr[1] = k02;
        ?? obj = new Object();
        obj.f27391a = k0Arr;
        Charset charset = AbstractC2536r0.f27584a;
        this.f27394a = obj;
    }
}
