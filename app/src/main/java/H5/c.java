package H5;

import A2.B;
import M3.H;
import id.AbstractC3557B;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p5.AbstractC5091c;

/* loaded from: classes.dex */
public class c implements G5.d, h6.b {

    /* renamed from: l0  reason: collision with root package name */
    public static final R4.a f7449l0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final G5.d f7450Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G5.d f7451Z;

    /* renamed from: h0  reason: collision with root package name */
    public final a f7452h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ExecutorService f7453i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC5091c f7454j0;

    /* renamed from: k0  reason: collision with root package name */
    public G5.d f7455k0;

    public c(K5.a aVar, G5.d dVar, G5.d dVar2, a aVar2, ExecutorService executorService, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("consentProvider", aVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f7450Y = dVar;
        this.f7451Z = dVar2;
        this.f7452h0 = aVar2;
        this.f7453i0 = executorService;
        this.f7454j0 = abstractC5091c;
        h6.a B10 = aVar.B();
        H.w0(executorService, "Data migration", abstractC5091c, new B(this, null, b(null), B10, b(B10), 1));
        aVar.d(this);
    }

    @Override // G5.d
    public final File J(Set set) {
        return this.f7451Z.J(set);
    }

    @Override // G5.d
    public final File K() {
        return null;
    }

    @Override // h6.b
    public final void a(h6.a aVar) {
        h6.a aVar2 = h6.a.f31916Y;
        AbstractC3557B.c0("previousConsent", aVar);
        B b10 = new B(this, aVar, b(aVar), aVar2, b(aVar2), 1);
        H.w0(this.f7453i0, "Data migration", this.f7454j0, b10);
    }

    public final G5.d b(h6.a aVar) {
        int i10;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.f7448a[aVar.ordinal()];
        }
        if (i10 != -1 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return f7449l0;
                }
                throw new RuntimeException();
            }
            return this.f7451Z;
        }
        return this.f7450Y;
    }

    @Override // G5.d
    public final File s(File file) {
        G5.d dVar = this.f7455k0;
        if (dVar != null) {
            return dVar.s(file);
        }
        AbstractC3557B.C2("delegateOrchestrator");
        throw null;
    }

    @Override // G5.d
    public final File v(boolean z10) {
        G5.d dVar = this.f7455k0;
        if (dVar != null) {
            return dVar.v(z10);
        }
        AbstractC3557B.C2("delegateOrchestrator");
        throw null;
    }
}
