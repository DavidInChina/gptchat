package L3;

import android.os.Build;
import id.AbstractC3557B;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public UUID f10677a;

    /* renamed from: b  reason: collision with root package name */
    public U3.q f10678b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f10679c;

    public C(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        AbstractC3557B.b0("randomUUID()", randomUUID);
        this.f10677a = randomUUID;
        String uuid = this.f10677a.toString();
        AbstractC3557B.b0("id.toString()", uuid);
        this.f10678b = new U3.q(uuid, 0, cls.getName(), (String) null, (g) null, (g) null, 0L, 0L, 0L, (C0892d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        this.f10679c = R4.b.I1(cls.getName());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [L3.v, L3.D] */
    public final v a() {
        boolean z10;
        u uVar = (u) this;
        ?? d10 = new D(uVar.f10677a, uVar.f10678b, uVar.f10679c);
        C0892d c0892d = this.f10678b.f17459j;
        if ((Build.VERSION.SDK_INT < 24 || !c0892d.a()) && !c0892d.f10702d && !c0892d.f10700b && !c0892d.f10701c) {
            z10 = false;
        } else {
            z10 = true;
        }
        U3.q qVar = this.f10678b;
        if (qVar.f17466q) {
            if (!z10) {
                if (qVar.f17456g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
            }
        }
        UUID randomUUID = UUID.randomUUID();
        AbstractC3557B.b0("randomUUID()", randomUUID);
        this.f10677a = randomUUID;
        String uuid = randomUUID.toString();
        AbstractC3557B.b0("id.toString()", uuid);
        U3.q qVar2 = this.f10678b;
        AbstractC3557B.c0("other", qVar2);
        this.f10678b = new U3.q(uuid, qVar2.f17451b, qVar2.f17452c, qVar2.f17453d, new g(qVar2.f17454e), new g(qVar2.f17455f), qVar2.f17456g, qVar2.f17457h, qVar2.f17458i, new C0892d(qVar2.f17459j), qVar2.f17460k, qVar2.f17461l, qVar2.f17462m, qVar2.f17463n, qVar2.f17464o, qVar2.f17465p, qVar2.f17466q, qVar2.f17467r, qVar2.f17468s, qVar2.f17470u, qVar2.f17471v, qVar2.f17472w, 524288);
        return d10;
    }

    public final u b(long j6, TimeUnit timeUnit) {
        AbstractC3557B.c0("timeUnit", timeUnit);
        this.f10678b.f17456g = timeUnit.toMillis(j6);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f10678b.f17456g) {
            return (u) this;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
    }
}
