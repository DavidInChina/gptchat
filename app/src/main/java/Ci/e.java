package ci;

import id.AbstractC3557B;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class e extends AbstractC2433b {

    /* renamed from: i0  reason: collision with root package name */
    public long f26674i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ h f26675j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j6) {
        super(hVar);
        this.f26675j0 = hVar;
        this.f26674i0 = j6;
        if (j6 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26665Z) {
            return;
        }
        if (this.f26674i0 != 0 && !Xh.b.h(this, TimeUnit.MILLISECONDS)) {
            this.f26675j0.f26682b.l();
            a();
        }
        this.f26665Z = true;
    }

    @Override // ci.AbstractC2433b, ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (j6 >= 0) {
            if (!this.f26665Z) {
                long j10 = this.f26674i0;
                if (j10 == 0) {
                    return -1L;
                }
                long g02 = super.g0(c4135j, Math.min(j10, j6));
                if (g02 != -1) {
                    long j11 = this.f26674i0 - g02;
                    this.f26674i0 = j11;
                    if (j11 == 0) {
                        a();
                    }
                    return g02;
                }
                this.f26675j0.f26682b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }
}
