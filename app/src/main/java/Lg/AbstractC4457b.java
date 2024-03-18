package lg;

import androidx.datastore.preferences.protobuf.n0;
import com.google.protobuf.C2487a;
import fg.C3033a;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: lg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4457b implements y {
    static {
        int i10 = C4464i.f38394b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r2 >= 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r3 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
        if ((r3 & 128) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
        throw lg.t.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
        throw new lg.t("CodedInputStream encountered a malformed varint.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4456a a(ByteArrayInputStream byteArrayInputStream, C4464i c4464i) {
        p pVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                pVar = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i10 = 7;
                    while (true) {
                        if (i10 < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i10;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i10 += 7;
                            } else {
                                throw t.a();
                            }
                        }
                    }
                }
                C4461f c4461f = new C4461f(new C2487a(byteArrayInputStream, read, 1));
                p b10 = ((C3033a) this).b(c4461f, c4464i);
                try {
                    c4461f.a(0);
                    pVar = b10;
                } catch (t e10) {
                    e10.f38415Y = b10;
                    throw e10;
                }
            }
            if (pVar != null && !pVar.isInitialized()) {
                t tVar = new t(new n0().getMessage());
                tVar.f38415Y = pVar;
                throw tVar;
            }
            return pVar;
        } catch (IOException e11) {
            throw new t(e11.getMessage());
        }
    }
}
