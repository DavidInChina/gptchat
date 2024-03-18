package Fc;

import android.gov.nist.core.Separators;
import android.media.MediaRecorder;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final File f5213Y;

    /* renamed from: Z  reason: collision with root package name */
    public final MediaRecorder f5214Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Yg.p f5215h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5216i0;

    public h(File file, MediaRecorder mediaRecorder, Yg.p pVar, int i10) {
        AbstractC3557B.c0("startTime", pVar);
        this.f5213Y = file;
        this.f5214Z = mediaRecorder;
        this.f5215h0 = pVar;
        this.f5216i0 = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5214Z.release();
        this.f5213Y.delete();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f5213Y, hVar.f5213Y) && AbstractC3557B.K(this.f5214Z, hVar.f5214Z) && AbstractC3557B.K(this.f5215h0, hVar.f5215h0) && this.f5216i0 == hVar.f5216i0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5214Z.hashCode();
        return ((this.f5215h0.f22419Y.hashCode() + ((hashCode + (this.f5213Y.hashCode() * 31)) * 31)) * 31) + this.f5216i0;
    }

    public final String toString() {
        return "WhisperRecordingState(file=" + this.f5213Y + ", recorder=" + this.f5214Z + ", startTime=" + this.f5215h0 + ", maxAmplitude=" + this.f5216i0 + Separators.RPAREN;
    }
}
