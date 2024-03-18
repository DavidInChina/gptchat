package C2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class z implements j {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f2638a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer[] f2639b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f2640c;

    public z(MediaCodec mediaCodec) {
        this.f2638a = mediaCodec;
        if (AbstractC5530A.f45131a < 21) {
            this.f2639b = mediaCodec.getInputBuffers();
            this.f2640c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // C2.j
    public final void a(J2.h hVar, Handler handler) {
        this.f2638a.setOnFrameRenderedListener(new a(this, hVar, 1), handler);
    }

    @Override // C2.j
    public final void b(int i10, long j6) {
        this.f2638a.releaseOutputBuffer(i10, j6);
    }

    @Override // C2.j
    public final int c() {
        return this.f2638a.dequeueInputBuffer(0L);
    }

    @Override // C2.j
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f2638a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && AbstractC5530A.f45131a < 21) {
                this.f2640c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // C2.j
    public final void e(int i10) {
        this.f2638a.setVideoScalingMode(i10);
    }

    @Override // C2.j
    public final void f(int i10, x2.d dVar, long j6) {
        this.f2638a.queueSecureInputBuffer(i10, 0, dVar.f48637i, j6, 0);
    }

    @Override // C2.j
    public final void flush() {
        this.f2638a.flush();
    }

    @Override // C2.j
    public final void g(Surface surface) {
        this.f2638a.setOutputSurface(surface);
    }

    @Override // C2.j
    public final ByteBuffer getInputBuffer(int i10) {
        if (AbstractC5530A.f45131a >= 21) {
            return this.f2638a.getInputBuffer(i10);
        }
        return this.f2639b[i10];
    }

    @Override // C2.j
    public final ByteBuffer getOutputBuffer(int i10) {
        if (AbstractC5530A.f45131a >= 21) {
            return this.f2638a.getOutputBuffer(i10);
        }
        return this.f2640c[i10];
    }

    @Override // C2.j
    public final MediaFormat getOutputFormat() {
        return this.f2638a.getOutputFormat();
    }

    @Override // C2.j
    public final void h(int i10, int i11, long j6, int i12) {
        this.f2638a.queueInputBuffer(i10, 0, i11, j6, i12);
    }

    @Override // C2.j
    public final void release() {
        this.f2639b = null;
        this.f2640c = null;
        this.f2638a.release();
    }

    @Override // C2.j
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f2638a.releaseOutputBuffer(i10, z10);
    }

    @Override // C2.j
    public final void setParameters(Bundle bundle) {
        this.f2638a.setParameters(bundle);
    }
}
