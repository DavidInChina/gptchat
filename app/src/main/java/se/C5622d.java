package se;

import Pg.C;
import Pg.D;
import android.gov.nist.javax.sip.header.ParameterNames;
import he.C3418c;
import id.AbstractC3557B;
import io.ktor.websocket.A;
import io.ktor.websocket.m;
import io.ktor.websocket.z;
import nf.AbstractC4831k;

/* renamed from: se.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5622d implements z {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ z f45555Y;

    public C5622d(C3418c c3418c, z zVar) {
        AbstractC3557B.c0("call", c3418c);
        AbstractC3557B.c0(ParameterNames.SESSION, zVar);
        this.f45555Y = zVar;
    }

    @Override // io.ktor.websocket.z
    public final void F0(long j6) {
        this.f45555Y.F0(j6);
    }

    @Override // io.ktor.websocket.z
    public final Object H0(m mVar, A a5) {
        return this.f45555Y.H0(mVar, a5);
    }

    @Override // io.ktor.websocket.z
    public final long P0() {
        return this.f45555Y.P0();
    }

    @Override // io.ktor.websocket.z
    public final D d0() {
        return this.f45555Y.d0();
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f45555Y.i();
    }

    @Override // io.ktor.websocket.z
    public final C r() {
        return this.f45555Y.r();
    }

    @Override // io.ktor.websocket.z
    public final Object u0(A a5) {
        return this.f45555Y.u0(a5);
    }
}
