package ci;

import Lg.n;
import Wh.q;
import Wh.s;
import Wh.w;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import ji.C4135j;

/* renamed from: ci.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2435d extends AbstractC2433b {

    /* renamed from: i0  reason: collision with root package name */
    public final s f26670i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f26671j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f26672k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ h f26673l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2435d(h hVar, s sVar) {
        super(hVar);
        AbstractC3557B.c0("url", sVar);
        this.f26673l0 = hVar;
        this.f26670i0 = sVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26665Z) {
            return;
        }
        if (this.f26672k0 && !Xh.b.h(this, TimeUnit.MILLISECONDS)) {
            this.f26673l0.f26682b.l();
            a();
        }
        this.f26665Z = true;
    }

    @Override // ci.AbstractC2433b, ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (j6 >= 0) {
            if (!this.f26665Z) {
                if (!this.f26672k0) {
                    return -1L;
                }
                long j10 = this.f26671j0;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                h hVar = this.f26673l0;
                if (i10 == 0 || j10 == -1) {
                    if (j10 != -1) {
                        hVar.f26683c.t0();
                    }
                    try {
                        this.f26671j0 = hVar.f26683c.O0();
                        String obj = n.U2(hVar.f26683c.t0()).toString();
                        if (this.f26671j0 >= 0 && (obj.length() <= 0 || n.I2(obj, Separators.SEMICOLON, false))) {
                            if (this.f26671j0 == 0) {
                                this.f26672k0 = false;
                                hVar.f26687g = hVar.f26686f.a();
                                w wVar = hVar.f26681a;
                                AbstractC3557B.Z(wVar);
                                q qVar = hVar.f26687g;
                                AbstractC3557B.Z(qVar);
                                bi.e.b(wVar.f21311o0, this.f26670i0, qVar);
                                a();
                            }
                            if (!this.f26672k0) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f26671j0 + obj + '\"');
                        }
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long g02 = super.g0(c4135j, Math.min(j6, this.f26671j0));
                if (g02 != -1) {
                    this.f26671j0 -= g02;
                    return g02;
                }
                hVar.f26682b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }
}
