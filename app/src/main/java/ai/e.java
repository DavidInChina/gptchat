package ai;

import Wh.C;
import Wh.D;
import Wh.E;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import di.C2727a;
import di.EnumC2728b;
import di.F;
import id.AbstractC3557B;
import java.io.IOException;
import java.net.Socket;
import ji.C4115D;
import ji.C4116E;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final j f24233a;

    /* renamed from: b  reason: collision with root package name */
    public final Wh.n f24234b;

    /* renamed from: c  reason: collision with root package name */
    public final f f24235c;

    /* renamed from: d  reason: collision with root package name */
    public final bi.d f24236d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24237e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24238f;

    /* renamed from: g  reason: collision with root package name */
    public final m f24239g;

    public e(j jVar, Wh.n nVar, f fVar, bi.d dVar) {
        AbstractC3557B.c0("eventListener", nVar);
        this.f24233a = jVar;
        this.f24234b = nVar;
        this.f24235c = fVar;
        this.f24236d = dVar;
        this.f24239g = dVar.getConnection();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            e(iOException);
        }
        Wh.n nVar = this.f24234b;
        j jVar = this.f24233a;
        if (z11) {
            if (iOException != null) {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
            } else {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
            }
        }
        if (z10) {
            if (iOException != null) {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
            } else {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
            }
        }
        return jVar.i(this, z11, z10, iOException);
    }

    public final l b() {
        j jVar = this.f24233a;
        if (!jVar.f24265p0) {
            jVar.f24265p0 = true;
            jVar.f24260k0.j();
            m connection = this.f24236d.getConnection();
            connection.getClass();
            Socket socket = connection.f24280d;
            AbstractC3557B.Z(socket);
            C4116E c4116e = connection.f24284h;
            AbstractC3557B.Z(c4116e);
            C4115D c4115d = connection.f24285i;
            AbstractC3557B.Z(c4115d);
            socket.setSoTimeout(0);
            connection.l();
            return new l(c4116e, c4115d, this);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final E c(D d10) {
        bi.d dVar = this.f24236d;
        try {
            String h10 = D.h(d10, SIPHeaderNames.CONTENT_TYPE);
            long c10 = dVar.c(d10);
            return new E(h10, c10, R4.b.J(new C2008d(this, dVar.b(d10), c10)));
        } catch (IOException e10) {
            this.f24234b.getClass();
            AbstractC3557B.c0("call", this.f24233a);
            e(e10);
            throw e10;
        }
    }

    public final C d(boolean z10) {
        try {
            C d10 = this.f24236d.d(z10);
            if (d10 != null) {
                d10.f21129m = this;
            }
            return d10;
        } catch (IOException e10) {
            this.f24234b.getClass();
            AbstractC3557B.c0("call", this.f24233a);
            e(e10);
            throw e10;
        }
    }

    public final void e(IOException iOException) {
        this.f24238f = true;
        this.f24235c.c(iOException);
        m connection = this.f24236d.getConnection();
        j jVar = this.f24233a;
        synchronized (connection) {
            try {
                AbstractC3557B.c0("call", jVar);
                if (iOException instanceof F) {
                    if (((F) iOException).f28542Y == EnumC2728b.REFUSED_STREAM) {
                        int i10 = connection.f24290n + 1;
                        connection.f24290n = i10;
                        if (i10 > 1) {
                            connection.f24286j = true;
                            connection.f24288l++;
                        }
                    } else if (((F) iOException).f28542Y != EnumC2728b.CANCEL || !jVar.f24270u0) {
                        connection.f24286j = true;
                        connection.f24288l++;
                    }
                } else if (connection.f24283g == null || (iOException instanceof C2727a)) {
                    connection.f24286j = true;
                    if (connection.f24289m == 0) {
                        m.d(jVar.f24255Y, connection.f24278b, iOException);
                        connection.f24288l++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
