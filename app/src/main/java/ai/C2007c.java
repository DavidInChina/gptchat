package ai;

import id.AbstractC3557B;
import java.io.IOException;
import java.net.ProtocolException;
import ji.AbstractC4120I;
import ji.AbstractC4142q;
import ji.C4135j;

/* renamed from: ai.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2007c extends AbstractC4142q {

    /* renamed from: Z  reason: collision with root package name */
    public final long f24222Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f24223h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f24224i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f24225j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ e f24226k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2007c(e eVar, AbstractC4120I abstractC4120I, long j6) {
        super(abstractC4120I);
        AbstractC3557B.c0("delegate", abstractC4120I);
        this.f24226k0 = eVar;
        this.f24222Z = j6;
    }

    public final IOException a(IOException iOException) {
        if (this.f24223h0) {
            return iOException;
        }
        this.f24223h0 = true;
        return this.f24226k0.a(false, true, iOException);
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24225j0) {
            return;
        }
        this.f24225j0 = true;
        long j6 = this.f24222Z;
        if (j6 != -1 && this.f24224i0 != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        if (!this.f24225j0) {
            long j10 = this.f24222Z;
            if (j10 != -1 && this.f24224i0 + j6 > j10) {
                throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f24224i0 + j6));
            }
            try {
                super.o(c4135j, j6);
                this.f24224i0 += j6;
                return;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
