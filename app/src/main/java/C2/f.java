package C2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import w.C6061h;

/* loaded from: classes2.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f2525b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f2526c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f2531h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f2532i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f2533j;

    /* renamed from: k  reason: collision with root package name */
    public long f2534k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2535l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f2536m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2524a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final C6061h f2527d = new C6061h(0);

    /* renamed from: e  reason: collision with root package name */
    public final C6061h f2528e = new C6061h(0);

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f2529f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f2530g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f2525b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f2530g;
        if (!arrayDeque.isEmpty()) {
            this.f2532i = (MediaFormat) arrayDeque.getLast();
        }
        C6061h c6061h = this.f2527d;
        c6061h.f47588b = c6061h.f47587a;
        C6061h c6061h2 = this.f2528e;
        c6061h2.f47588b = c6061h2.f47587a;
        this.f2529f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f2524a) {
            this.f2536m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f2524a) {
            this.f2533j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f2524a) {
            this.f2527d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f2524a) {
            try {
                MediaFormat mediaFormat = this.f2532i;
                if (mediaFormat != null) {
                    this.f2528e.a(-2);
                    this.f2530g.add(mediaFormat);
                    this.f2532i = null;
                }
                this.f2528e.a(i10);
                this.f2529f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f2524a) {
            this.f2528e.a(-2);
            this.f2530g.add(mediaFormat);
            this.f2532i = null;
        }
    }
}
