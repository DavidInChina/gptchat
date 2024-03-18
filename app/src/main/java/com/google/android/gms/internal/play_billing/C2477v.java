package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import q1.AbstractC5260f;

/* renamed from: com.google.android.gms.internal.play_billing.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2477v extends AbstractC5260f {

    /* renamed from: h  reason: collision with root package name */
    public final ByteBuffer f26977h = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: i  reason: collision with root package name */
    public final MessageDigest f26978i;

    /* renamed from: j  reason: collision with root package name */
    public final int f26979j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26980k;

    public C2477v(MessageDigest messageDigest, int i10) {
        this.f26978i = messageDigest;
        this.f26979j = i10;
    }
}
