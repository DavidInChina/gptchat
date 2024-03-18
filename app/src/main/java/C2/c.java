package C2;

import Z.C1745x0;
import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import g.RunnableC3111d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m.HandlerC4525e;
import q1.AbstractC5260f;
import s2.AbstractC5530A;
import w.C6061h;

/* loaded from: classes2.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f2504a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2505b;

    /* renamed from: c  reason: collision with root package name */
    public final e f2506c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2507d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2508e;

    /* renamed from: f  reason: collision with root package name */
    public int f2509f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f2504a = mediaCodec;
        this.f2505b = new f(handlerThread);
        this.f2506c = new e(mediaCodec, handlerThread2);
        this.f2507d = z10;
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z10;
        f fVar = cVar.f2505b;
        if (fVar.f2526c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        HandlerThread handlerThread = fVar.f2525b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f2504a;
        mediaCodec.setCallback(fVar, handler);
        fVar.f2526c = handler;
        AbstractC5260f.g("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC5260f.q();
        e eVar = cVar.f2506c;
        if (!eVar.f2523f) {
            HandlerThread handlerThread2 = eVar.f2519b;
            handlerThread2.start();
            eVar.f2520c = new HandlerC4525e(eVar, handlerThread2.getLooper());
            eVar.f2523f = true;
        }
        AbstractC5260f.g("startCodec");
        mediaCodec.start();
        AbstractC5260f.q();
        cVar.f2509f = 1;
    }

    public static String j(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(Separators.RPAREN);
        }
        return sb2.toString();
    }

    @Override // C2.j
    public final void a(J2.h hVar, Handler handler) {
        k();
        this.f2504a.setOnFrameRenderedListener(new a(this, hVar, 0), handler);
    }

    @Override // C2.j
    public final void b(int i10, long j6) {
        this.f2504a.releaseOutputBuffer(i10, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[Catch: all -> 0x0030, DONT_GENERATE, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0023, B:19:0x002e, B:23:0x0032, B:27:0x003d, B:28:0x0047, B:30:0x0049, B:31:0x004e, B:32:0x004f, B:33:0x0051, B:34:0x0052, B:35:0x0054), top: B:39:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0023, B:19:0x002e, B:23:0x0032, B:27:0x003d, B:28:0x0047, B:30:0x0049, B:31:0x004e, B:32:0x004f, B:33:0x0051, B:34:0x0052, B:35:0x0054), top: B:39:0x0012 }] */
    @Override // C2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c() {
        boolean z10;
        int i10;
        RuntimeException runtimeException = (RuntimeException) this.f2506c.f2521d.getAndSet(null);
        if (runtimeException == null) {
            f fVar = this.f2505b;
            synchronized (fVar.f2524a) {
                try {
                    IllegalStateException illegalStateException = fVar.f2536m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = fVar.f2533j;
                        if (codecException == null) {
                            if (fVar.f2534k <= 0 && !fVar.f2535l) {
                                z10 = false;
                                i10 = -1;
                                if (z10) {
                                    C6061h c6061h = fVar.f2527d;
                                    int i11 = c6061h.f47587a;
                                    int i12 = c6061h.f47588b;
                                    if (i11 != i12) {
                                        if (i11 != i12) {
                                            i10 = c6061h.f47589c[i11];
                                            c6061h.f47587a = (i11 + 1) & c6061h.f47590d;
                                        } else {
                                            throw new ArrayIndexOutOfBoundsException();
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            i10 = -1;
                            if (z10) {
                            }
                        } else {
                            fVar.f2533j = null;
                            throw codecException;
                        }
                    } else {
                        fVar.f2536m = null;
                        throw illegalStateException;
                    }
                } finally {
                }
            }
            return i10;
        }
        throw runtimeException;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[Catch: all -> 0x0030, DONT_GENERATE, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0023, B:19:0x002e, B:23:0x0032, B:25:0x003a, B:28:0x003e, B:30:0x004a, B:33:0x0067, B:34:0x0071, B:36:0x0073, B:37:0x0078, B:38:0x0079, B:39:0x007b, B:40:0x007c, B:41:0x007e), top: B:45:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0023, B:19:0x002e, B:23:0x0032, B:25:0x003a, B:28:0x003e, B:30:0x004a, B:33:0x0067, B:34:0x0071, B:36:0x0073, B:37:0x0078, B:38:0x0079, B:39:0x007b, B:40:0x007c, B:41:0x007e), top: B:45:0x0012 }] */
    @Override // C2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        int i10;
        RuntimeException runtimeException = (RuntimeException) this.f2506c.f2521d.getAndSet(null);
        if (runtimeException == null) {
            f fVar = this.f2505b;
            synchronized (fVar.f2524a) {
                try {
                    IllegalStateException illegalStateException = fVar.f2536m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = fVar.f2533j;
                        if (codecException == null) {
                            if (fVar.f2534k <= 0 && !fVar.f2535l) {
                                z10 = false;
                                i10 = -1;
                                if (z10) {
                                    C6061h c6061h = fVar.f2528e;
                                    int i11 = c6061h.f47587a;
                                    int i12 = c6061h.f47588b;
                                    if (i11 != i12) {
                                        if (i11 != i12) {
                                            i10 = c6061h.f47589c[i11];
                                            c6061h.f47587a = c6061h.f47590d & (i11 + 1);
                                            if (i10 >= 0) {
                                                Gi.e.o(fVar.f2531h);
                                                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f2529f.remove();
                                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                                            } else if (i10 == -2) {
                                                fVar.f2531h = (MediaFormat) fVar.f2530g.remove();
                                            }
                                        } else {
                                            throw new ArrayIndexOutOfBoundsException();
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            i10 = -1;
                            if (z10) {
                            }
                        } else {
                            fVar.f2533j = null;
                            throw codecException;
                        }
                    } else {
                        fVar.f2536m = null;
                        throw illegalStateException;
                    }
                } finally {
                }
            }
            return i10;
        }
        throw runtimeException;
    }

    @Override // C2.j
    public final void e(int i10) {
        k();
        this.f2504a.setVideoScalingMode(i10);
    }

    @Override // C2.j
    public final void f(int i10, x2.d dVar, long j6) {
        e eVar = this.f2506c;
        RuntimeException runtimeException = (RuntimeException) eVar.f2521d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f2510a = i10;
            b10.f2511b = 0;
            b10.f2512c = 0;
            b10.f2514e = j6;
            b10.f2515f = 0;
            int i11 = dVar.f48634f;
            MediaCodec.CryptoInfo cryptoInfo = b10.f2513d;
            cryptoInfo.numSubSamples = i11;
            int[] iArr = dVar.f48632d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = dVar.f48633e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = dVar.f48630b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = dVar.f48629a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = dVar.f48631c;
            if (AbstractC5530A.f45131a >= 24) {
                B1.g.o();
                cryptoInfo.setPattern(B1.g.c(dVar.f48635g, dVar.f48636h));
            }
            eVar.f2520c.obtainMessage(1, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // C2.j
    public final void flush() {
        this.f2506c.a();
        this.f2504a.flush();
        f fVar = this.f2505b;
        synchronized (fVar.f2524a) {
            fVar.f2534k++;
            Handler handler = fVar.f2526c;
            int i10 = AbstractC5530A.f45131a;
            handler.post(new RunnableC3111d(17, fVar));
        }
        this.f2504a.start();
    }

    @Override // C2.j
    public final void g(Surface surface) {
        k();
        this.f2504a.setOutputSurface(surface);
    }

    @Override // C2.j
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f2504a.getInputBuffer(i10);
    }

    @Override // C2.j
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f2504a.getOutputBuffer(i10);
    }

    @Override // C2.j
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f2505b;
        synchronized (fVar.f2524a) {
            try {
                mediaFormat = fVar.f2531h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // C2.j
    public final void h(int i10, int i11, long j6, int i12) {
        e eVar = this.f2506c;
        RuntimeException runtimeException = (RuntimeException) eVar.f2521d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f2510a = i10;
            b10.f2511b = 0;
            b10.f2512c = i11;
            b10.f2514e = j6;
            b10.f2515f = i12;
            HandlerC4525e handlerC4525e = eVar.f2520c;
            int i13 = AbstractC5530A.f45131a;
            handlerC4525e.obtainMessage(0, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public final void k() {
        if (this.f2507d) {
            try {
                e eVar = this.f2506c;
                C1745x0 c1745x0 = eVar.f2522e;
                c1745x0.c();
                HandlerC4525e handlerC4525e = eVar.f2520c;
                handlerC4525e.getClass();
                handlerC4525e.obtainMessage(2).sendToTarget();
                synchronized (c1745x0) {
                    while (!c1745x0.f22767a) {
                        c1745x0.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // C2.j
    public final void release() {
        try {
            if (this.f2509f == 1) {
                e eVar = this.f2506c;
                if (eVar.f2523f) {
                    eVar.a();
                    eVar.f2519b.quit();
                }
                eVar.f2523f = false;
                f fVar = this.f2505b;
                synchronized (fVar.f2524a) {
                    fVar.f2535l = true;
                    fVar.f2525b.quit();
                    fVar.a();
                }
            }
            this.f2509f = 2;
            if (!this.f2508e) {
                this.f2504a.release();
                this.f2508e = true;
            }
        } catch (Throwable th2) {
            if (!this.f2508e) {
                this.f2504a.release();
                this.f2508e = true;
            }
            throw th2;
        }
    }

    @Override // C2.j
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f2504a.releaseOutputBuffer(i10, z10);
    }

    @Override // C2.j
    public final void setParameters(Bundle bundle) {
        k();
        this.f2504a.setParameters(bundle);
    }
}
