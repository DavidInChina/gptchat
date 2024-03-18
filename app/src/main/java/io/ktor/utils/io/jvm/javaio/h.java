package io.ktor.utils.io.jvm.javaio;

import Ng.AbstractC1073l0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class h extends c {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f33503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC1073l0 abstractC1073l0, i iVar) {
        super(abstractC1073l0);
        this.f33503g = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    @Override // io.ktor.utils.io.jvm.javaio.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        g gVar;
        EnumC5000a enumC5000a;
        int i10;
        Object obj;
        int i11;
        h hVar;
        Object obj2;
        Object obj3;
        AbstractC4825e abstractC4825e2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i12 = gVar.f33502i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f33502i0 = i12 - Integer.MIN_VALUE;
                Object obj4 = gVar.f33500Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f33502i0;
                obj = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            hVar = gVar.f33499Y;
                            N.B0(obj4);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        hVar = gVar.f33499Y;
                        N.B0(obj4);
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.ByteArray", obj4);
                        x xVar = hVar.f33503g.f33504Y;
                        int i13 = hVar.f33494d;
                        int i14 = hVar.f33495e;
                        gVar.f33499Y = hVar;
                        gVar.getClass();
                        gVar.f33502i0 = 2;
                        obj4 = ((t) xVar).y((byte[]) obj4, i13, i14, gVar);
                        if (obj4 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    i11 = ((Number) obj4).intValue();
                    if (i11 == -1) {
                        hVar.f33503g.f33505Z.q0();
                        hVar.result = i11;
                        return y.f36177a;
                    }
                } else {
                    N.B0(obj4);
                    i11 = 0;
                    hVar = this;
                }
                hVar.result = i11;
                gVar.f33499Y = hVar;
                gVar.getClass();
                gVar.f33502i0 = 1;
                while (true) {
                    obj2 = hVar.state;
                    if (!(obj2 instanceof Thread)) {
                        abstractC4825e2 = AbstractC5260f.z(gVar);
                        obj3 = obj2;
                    } else if (AbstractC3557B.K(obj2, hVar)) {
                        obj3 = obj;
                        abstractC4825e2 = AbstractC5260f.z(gVar);
                    } else {
                        throw new IllegalStateException("Already suspended or in finished state");
                    }
                    atomicReferenceFieldUpdater = c.f33490f;
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj2, abstractC4825e2)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj2) {
                            break;
                        }
                    }
                    if (obj3 != null) {
                        k.a().b(obj3);
                    }
                    EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                    N.k0(gVar);
                    return enumC5000a;
                    obj = obj3;
                }
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj42 = gVar.f33500Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = gVar.f33502i0;
        obj = null;
        if (i10 == 0) {
        }
        hVar.result = i11;
        gVar.f33499Y = hVar;
        gVar.getClass();
        gVar.f33502i0 = 1;
        while (true) {
            obj2 = hVar.state;
            if (!(obj2 instanceof Thread)) {
            }
            atomicReferenceFieldUpdater = c.f33490f;
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj2, abstractC4825e2)) {
            }
            if (obj3 != null) {
            }
            EnumC5000a enumC5000a22 = EnumC5000a.f41328Y;
            N.k0(gVar);
            return enumC5000a;
            obj = obj3;
        }
    }
}
