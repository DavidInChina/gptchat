package ci;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import ji.AbstractC4120I;
import ji.AbstractC4136k;
import ji.C4124M;
import ji.C4135j;
import ji.C4144s;

/* renamed from: ci.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2434c implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final C4144s f26667Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f26668Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f26669h0;

    public C2434c(h hVar) {
        this.f26669h0 = hVar;
        this.f26667Y = new C4144s(hVar.f26684d.f());
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f26668Z) {
            return;
        }
        this.f26668Z = true;
        this.f26669h0.f26684d.c0("0\r\n\r\n");
        h hVar = this.f26669h0;
        C4144s c4144s = this.f26667Y;
        hVar.getClass();
        C4124M c4124m = c4144s.f36740e;
        c4144s.f36740e = C4124M.f36687d;
        c4124m.a();
        c4124m.b();
        this.f26669h0.f26685e = 3;
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        return this.f26667Y;
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public final synchronized void flush() {
        if (this.f26668Z) {
            return;
        }
        this.f26669h0.f26684d.flush();
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        if (!this.f26668Z) {
            if (j6 == 0) {
                return;
            }
            h hVar = this.f26669h0;
            hVar.f26684d.l0(j6);
            AbstractC4136k abstractC4136k = hVar.f26684d;
            abstractC4136k.c0(Separators.NEWLINE);
            abstractC4136k.o(c4135j, j6);
            abstractC4136k.c0(Separators.NEWLINE);
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
