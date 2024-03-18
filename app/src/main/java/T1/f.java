package T1;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f16835Y.mark(Integer.MAX_VALUE);
    }

    public final void h(long j6) {
        int i10 = this.f16836Z;
        if (i10 > j6) {
            this.f16836Z = 0;
            this.f16835Y.reset();
        } else {
            j6 -= i10;
        }
        a((int) j6);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f16835Y.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
