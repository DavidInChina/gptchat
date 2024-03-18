package io.ktor.utils.io.jvm.javaio;

import Ng.AbstractC1053b0;
import Ng.AbstractC1073l0;
import Ng.G0;
import Ng.T;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import nf.AbstractC4825e;
import zc.C6821H;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33490f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "state");

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1073l0 f33491a;

    /* renamed from: b  reason: collision with root package name */
    public final b f33492b;

    /* renamed from: c  reason: collision with root package name */
    public final T f33493c;

    /* renamed from: d  reason: collision with root package name */
    public int f33494d;

    /* renamed from: e  reason: collision with root package name */
    public int f33495e;
    volatile /* synthetic */ Object state = this;
    volatile /* synthetic */ int result = 0;

    public c(AbstractC1073l0 abstractC1073l0) {
        T t10;
        this.f33491a = abstractC1073l0;
        b bVar = new b(this);
        this.f33492b = bVar;
        if (abstractC1073l0 != null) {
            t10 = abstractC1073l0.V(new C6821H(18, this));
        } else {
            t10 = null;
        }
        this.f33493c = t10;
        a aVar = new a(this, null);
        Ad.l.M(1, aVar);
        aVar.invoke(bVar);
        if (this.state != this) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public abstract Object a(AbstractC4825e abstractC4825e);

    public final int b(byte[] bArr, int i10, int i11) {
        Object obj;
        long j6;
        AbstractC3557B.c0("buffer", bArr);
        this.f33494d = i10;
        this.f33495e = i11;
        Thread currentThread = Thread.currentThread();
        AbstractC4825e abstractC4825e = null;
        while (true) {
            Object obj2 = this.state;
            if (obj2 instanceof AbstractC4825e) {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>", obj2);
                abstractC4825e = (AbstractC4825e) obj2;
                obj = currentThread;
            } else if (obj2 instanceof y) {
                return this.result;
            } else {
                if (!(obj2 instanceof Throwable)) {
                    if (!(obj2 instanceof Thread)) {
                        if (!AbstractC3557B.K(obj2, this)) {
                            obj = new RuntimeException();
                        } else {
                            throw new IllegalStateException("Not yet started");
                        }
                    } else {
                        throw new IllegalStateException("There is already thread owning adapter");
                    }
                } else {
                    throw ((Throwable) obj2);
                }
            }
            AbstractC3557B.b0("when (value) {\n         \u2026Exception()\n            }", obj);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33490f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            AbstractC3557B.Z(abstractC4825e);
            abstractC4825e.resumeWith(bArr);
            AbstractC3557B.b0("thread", currentThread);
            if (this.state == currentThread) {
                if (k.a() == l.f33509a) {
                    ((Ei.a) e.f33497a.getValue()).b("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
                }
                while (true) {
                    AbstractC1053b0 abstractC1053b0 = (AbstractC1053b0) G0.f12872a.get();
                    if (abstractC1053b0 != null) {
                        j6 = abstractC1053b0.S0();
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (this.state != currentThread) {
                        break;
                    } else if (j6 > 0) {
                        k.a().a(j6);
                    }
                }
            }
            Object obj3 = this.state;
            if (!(obj3 instanceof Throwable)) {
                return this.result;
            }
            throw ((Throwable) obj3);
        }
    }
}
