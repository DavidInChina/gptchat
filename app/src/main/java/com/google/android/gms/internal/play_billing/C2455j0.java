package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2455j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C2451h0 f26933b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C2453i0 f26934a;

    public C2455j0() {
        AbstractC2465o0 abstractC2465o0;
        AbstractC2465o0[] abstractC2465o0Arr = new AbstractC2465o0[2];
        abstractC2465o0Arr[0] = O.f26874a;
        try {
            abstractC2465o0 = (AbstractC2465o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            abstractC2465o0 = f26933b;
        }
        abstractC2465o0Arr[1] = abstractC2465o0;
        C2453i0 c2453i0 = new C2453i0(abstractC2465o0Arr);
        Charset charset = Y.f26890a;
        this.f26934a = c2453i0;
    }
}
