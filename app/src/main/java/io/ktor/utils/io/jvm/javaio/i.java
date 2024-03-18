package io.ktor.utils.io.jvm.javaio;

import Ng.AbstractC1073l0;
import Ng.C1079o0;
import Ng.T;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class i extends InputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final x f33504Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1079o0 f33505Z;

    /* renamed from: h0  reason: collision with root package name */
    public final h f33506h0;

    /* renamed from: i0  reason: collision with root package name */
    public byte[] f33507i0;

    public i(x xVar, AbstractC1073l0 abstractC1073l0) {
        AbstractC3557B.c0("channel", xVar);
        this.f33504Y = xVar;
        this.f33505Z = new C1079o0(abstractC1073l0);
        this.f33506h0 = new h(abstractC1073l0, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((t) this.f33504Y).p();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            x xVar = this.f33504Y;
            AbstractC3557B.c0("<this>", xVar);
            ((t) xVar).h(null);
            if (!this.f33505Z.j()) {
                this.f33505Z.k(null);
            }
            h hVar = this.f33506h0;
            T t10 = hVar.f33493c;
            if (t10 != null) {
                t10.dispose();
            }
            hVar.f33492b.resumeWith(N.w(new CancellationException("Stream closed")));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f33507i0;
            if (bArr == null) {
                bArr = new byte[1];
                this.f33507i0 = bArr;
            }
            int b10 = this.f33506h0.b(bArr, 0, 1);
            if (b10 == -1) {
                return -1;
            }
            if (b10 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + b10 + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        h hVar;
        hVar = this.f33506h0;
        AbstractC3557B.Z(bArr);
        return hVar.b(bArr, i10, i11);
    }
}
