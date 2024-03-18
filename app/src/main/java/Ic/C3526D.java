package ic;

import com.openai.experiment.ExperimentKey;
import nd.AbstractC4815d;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.C5451O;
import wd.u0;
import wd.v0;

/* renamed from: ic.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3526D implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final com.openai.experiment.t f32948a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.h f32949b;

    /* renamed from: c  reason: collision with root package name */
    public final xd.g f32950c;

    public C3526D(com.openai.experiment.t tVar, xd.h hVar, xd.g gVar) {
        this.f32948a = tVar;
        this.f32949b = hVar;
        this.f32950c = gVar;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C3525C c3525c;
        Object obj;
        int i10;
        C3526D c3526d;
        v0 v0Var;
        if (abstractC4825e instanceof C3525C) {
            c3525c = (C3525C) abstractC4825e;
            int i11 = c3525c.f32947i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3525c.f32947i0 = i11 - Integer.MIN_VALUE;
                obj = c3525c.f32945Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3525c.f32947i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    v0 v0Var2 = (v0) c3525c.f32944Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    return jf.y.f36177a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c3526d = (C3526D) c3525c.f32944Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            v0Var = (v0) obj;
                            if (v0Var instanceof u0) {
                                jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                                xd.h hVar = c3526d.f32949b;
                                C3537g c3537g = C3537g.f33032i0;
                                c3525c.f32944Y = v0Var;
                                c3525c.f32947i0 = 4;
                                if (((rc.Q) hVar).a(c3537g, c3525c) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            return jf.y.f36177a;
                        }
                        c3526d = (C3526D) c3525c.f32944Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        if (((zd.n) obj).f51982a) {
                            xd.g gVar = c3526d.f32950c;
                            c3525c.f32944Y = c3526d;
                            c3525c.f32947i0 = 3;
                            obj = ((C5451O) gVar).d(false, c3525c);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            v0Var = (v0) obj;
                            if (v0Var instanceof u0) {
                            }
                        }
                        return jf.y.f36177a;
                    }
                    c3526d = (C3526D) c3525c.f32944Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ExperimentKey.MemoryExperienceEnabled memoryExperienceEnabled = ExperimentKey.MemoryExperienceEnabled.INSTANCE;
                    c3525c.f32944Y = this;
                    c3525c.f32947i0 = 1;
                    com.openai.experiment.G g10 = (com.openai.experiment.G) this.f32948a;
                    g10.getClass();
                    obj = com.openai.experiment.G.d(g10, memoryExperienceEnabled, c3525c);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c3526d = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    Ia.j jVar = ((rc.Q) c3526d.f32949b).f44819b;
                    c3525c.f32944Y = c3526d;
                    c3525c.f32947i0 = 2;
                    obj = L4.a.m0(jVar, c3525c);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    if (((zd.n) obj).f51982a) {
                    }
                }
                return jf.y.f36177a;
            }
        }
        c3525c = new C3525C(this, abstractC4825e);
        obj = c3525c.f32945Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3525c.f32947i0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return jf.y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Ng.Q.f12904a;
    }
}
