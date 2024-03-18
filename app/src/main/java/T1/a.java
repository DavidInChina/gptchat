package T1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: Y  reason: collision with root package name */
    public long f16833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f16834Z;

    public a(f fVar) {
        this.f16834Z = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j10 = this.f16833Y;
            int i12 = (j10 > j6 ? 1 : (j10 == j6 ? 0 : -1));
            f fVar = this.f16834Z;
            if (i12 != 0) {
                if (j10 >= 0 && j6 >= j10 + fVar.f16835Y.available()) {
                    return -1;
                }
                fVar.h(j6);
                this.f16833Y = j6;
            }
            if (i11 > fVar.f16835Y.available()) {
                i11 = fVar.f16835Y.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f16833Y += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f16833Y = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
