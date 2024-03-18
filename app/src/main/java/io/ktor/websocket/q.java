package io.ktor.websocket;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33665a = true;

    /* renamed from: b  reason: collision with root package name */
    public final s f33666b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f33667c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f33668d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f33669e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f33670f;

    public q(s sVar, byte[] bArr, boolean z10, boolean z11, boolean z12) {
        this.f33666b = sVar;
        this.f33667c = bArr;
        this.f33668d = z10;
        this.f33669e = z11;
        this.f33670f = z12;
        AbstractC3557B.b0("wrap(data)", ByteBuffer.wrap(bArr));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame ");
        sb2.append(this.f33666b);
        sb2.append(" (fin=");
        sb2.append(this.f33665a);
        sb2.append(", buffer len = ");
        return AbstractC2469q0.j(sb2, this.f33667c.length, ')');
    }
}
