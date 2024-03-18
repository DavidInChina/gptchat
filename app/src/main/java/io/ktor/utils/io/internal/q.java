package io.ktor.utils.io.internal;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.J;
import io.ktor.utils.io.t;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class q implements J {

    /* renamed from: a  reason: collision with root package name */
    public int f33476a;

    /* renamed from: b  reason: collision with root package name */
    public t f33477b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f33478c;

    /* renamed from: d  reason: collision with root package name */
    public Ne.c f33479d;

    /* renamed from: e  reason: collision with root package name */
    public p f33480e;

    public final Ne.c a(int i10) {
        int i11;
        int i12 = this.f33476a;
        p pVar = this.f33480e;
        while (true) {
            i11 = pVar._availableForWrite$internal;
            if (i11 < 0) {
                i11 = 0;
                break;
            } else if (p.f33473c.compareAndSet(pVar, i11, 0)) {
                break;
            }
        }
        int i13 = i11 + i12;
        this.f33476a = i13;
        if (i13 < i10) {
            return null;
        }
        t tVar = this.f33477b;
        ByteBuffer byteBuffer = this.f33478c;
        tVar.getClass();
        AbstractC3557B.c0("buffer", byteBuffer);
        tVar.t(byteBuffer, tVar.f33585f, i13);
        if (this.f33478c.remaining() < i10) {
            return null;
        }
        N.r0(this.f33479d, this.f33478c);
        return this.f33479d;
    }
}
