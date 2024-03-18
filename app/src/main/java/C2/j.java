package C2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface j {
    void a(J2.h hVar, Handler handler);

    void b(int i10, long j6);

    int c();

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(int i10);

    void f(int i10, x2.d dVar, long j6);

    void flush();

    void g(Surface surface);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(int i10, int i11, long j6, int i12);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);
}
