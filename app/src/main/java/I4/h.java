package i4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.io.IOException;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ i f32680Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32680Y = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f32680Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ji.I] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        i iVar = this.f32680Y;
        synchronized (iVar) {
            if (iVar.f32693q0 && !iVar.f32694r0) {
                try {
                    iVar.S();
                } catch (IOException unused) {
                    iVar.f32695s0 = true;
                }
                try {
                    if (iVar.f32690n0 >= 2000) {
                        iVar.a0();
                    }
                } catch (IOException unused2) {
                    iVar.f32696t0 = true;
                    iVar.f32691o0 = R4.b.I(new Object());
                }
                return y.f36177a;
            }
            return y.f36177a;
        }
    }
}
