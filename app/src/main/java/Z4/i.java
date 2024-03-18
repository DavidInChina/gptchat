package Z4;

import android.util.Log;
import id.AbstractC3557B;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class i extends Writer {

    /* renamed from: Y  reason: collision with root package name */
    public final StringBuilder f23181Y = new StringBuilder();

    public final void a() {
        StringBuilder sb2 = this.f23181Y;
        if (sb2.length() > 0) {
            String sb3 = sb2.toString();
            AbstractC3557B.b0("mBuilder.toString()", sb3);
            if (Ad.l.f821g) {
                Log.v("GLTextureView", sb3);
            }
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        AbstractC3557B.c0("buf", cArr);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            char c10 = cArr[i12 + i10];
            if (c10 == '\n') {
                a();
            } else {
                this.f23181Y.append(c10);
            }
            i12 = i13;
        }
    }
}
