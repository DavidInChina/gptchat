package io.ktor.utils.io;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;
import q1.AbstractC5260f;

/* renamed from: io.ktor.utils.io.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3596a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33388Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f33389Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3596a(t tVar, int i10) {
        super(1);
        this.f33388Y = i10;
        this.f33389Z = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        r8.f33389Z.o(r0);
        r8.f33389Z.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        return of.EnumC5000a.f41328Y;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f33388Y;
        jf.y yVar = jf.y.f36177a;
        switch (i11) {
            case 0:
                Throwable th2 = (Throwable) obj;
                t tVar = this.f33389Z;
                tVar.attachedJob = null;
                if (th2 != null) {
                    Throwable th3 = th2;
                    while (th3 instanceof CancellationException) {
                        if (!AbstractC3557B.K(th3, th3.getCause())) {
                            Throwable cause = th3.getCause();
                            if (cause == null) {
                                th2 = th3;
                                tVar.h(th2);
                            } else {
                                th3 = cause;
                            }
                        } else {
                            tVar.h(th2);
                        }
                    }
                    th2 = th3;
                    tVar.h(th2);
                }
                return yVar;
            default:
                AbstractC4825e abstractC4825e = (AbstractC4825e) obj;
                AbstractC3557B.c0("ucont", abstractC4825e);
                i10 = this.f33389Z.writeSuspensionSize;
                while (true) {
                    io.ktor.utils.io.internal.c a5 = t.a(this.f33389Z);
                    if (a5 == null) {
                        if (!this.f33389Z.f0(i10)) {
                            abstractC4825e.resumeWith(yVar);
                            break;
                        } else {
                            t tVar2 = this.f33389Z;
                            AbstractC4825e z10 = AbstractC5260f.z(abstractC4825e);
                            t tVar3 = this.f33389Z;
                            while (((AbstractC4825e) tVar2._writeOp) == null) {
                                if (tVar3.f0(i10)) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t.f33580n;
                                    while (!atomicReferenceFieldUpdater.compareAndSet(tVar2, null, z10)) {
                                        if (atomicReferenceFieldUpdater.get(tVar2) != null) {
                                            break;
                                        }
                                    }
                                    if (tVar3.f0(i10)) {
                                        break;
                                    } else {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t.f33580n;
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(tVar2, z10, null)) {
                                            if (atomicReferenceFieldUpdater2.get(tVar2) != z10) {
                                                break;
                                            }
                                        }
                                        continue;
                                    }
                                } else {
                                    break;
                                }
                            }
                            throw new IllegalStateException("Operation is already in progress".toString());
                        }
                    } else {
                        N.d(a5.a());
                        throw null;
                    }
                }
        }
    }
}
