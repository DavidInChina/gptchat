package ai;

import id.AbstractC3557B;
import java.io.IOException;
import java.net.ProtocolException;
import ji.AbstractC4122K;
import ji.AbstractC4143r;
import ji.C4135j;

/* renamed from: ai.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008d extends AbstractC4143r {

    /* renamed from: Z  reason: collision with root package name */
    public final long f24227Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f24228h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f24229i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f24230j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f24231k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ e f24232l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2008d(e eVar, AbstractC4122K abstractC4122K, long j6) {
        super(abstractC4122K);
        AbstractC3557B.c0("delegate", abstractC4122K);
        this.f24232l0 = eVar;
        this.f24227Z = j6;
        if (j6 == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f24230j0) {
            return iOException;
        }
        this.f24230j0 = true;
        e eVar = this.f24232l0;
        if (iOException == null && this.f24229i0) {
            this.f24229i0 = false;
            eVar.f24234b.getClass();
            AbstractC3557B.c0("call", eVar.f24233a);
        }
        return eVar.a(true, false, iOException);
    }

    @Override // ji.AbstractC4143r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24231k0) {
            return;
        }
        this.f24231k0 = true;
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // ji.AbstractC4143r, ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (!this.f24231k0) {
            try {
                long g02 = this.f36739Y.g0(c4135j, j6);
                if (this.f24229i0) {
                    this.f24229i0 = false;
                    e eVar = this.f24232l0;
                    Wh.n nVar = eVar.f24234b;
                    j jVar = eVar.f24233a;
                    nVar.getClass();
                    AbstractC3557B.c0("call", jVar);
                }
                if (g02 == -1) {
                    a(null);
                    return -1L;
                }
                long j10 = this.f24228h0 + g02;
                long j11 = this.f24227Z;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
                }
                this.f24228h0 = j10;
                if (j10 == j11) {
                    a(null);
                }
                return g02;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
